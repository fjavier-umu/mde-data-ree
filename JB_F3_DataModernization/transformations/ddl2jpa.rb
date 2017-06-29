transformation 'ddl2jpa'

#En la fase uno se realiza tanto la unidad de persistencia como todas las entidades y propiedades
#para las tablas y columnas
phase 'fase1' do

  #Regla principal para la creación de la unidad de persistencia
  top_rule 'ddl2persistenceUnit' do
    from DDLIN::DDLDefinition   
    to   JPAOUT::PersistenceUnit
    mapping do |entrada, salida|
      salida.entities = entrada.statements      
    end
  end 

  #Ignoramos las reglas de creacion de comentarios ya que serán tratadas en la creación
  #de "entities" y "properties"
  ignore_rule DDLIN::CreateCommentTable => :any
  ignore_rule DDLIN::CreateCommentColumn => :any
  
=begin
  #CUIDADO QUE ESTAS DOS REGLAS CREAN ENTIDADES VACIAS....
  #Regla para los comentarios de las tablas
  rule 'commentTable' do
    from DDLIN::CreateCommentTable
    to   JPAOUT::Entity
  end
  
  #Regla para los comentarios de las columnas, los obviamos en el modelo de salida
  rule 'commentColumn' do
    from DDLIN::CreateCommentColumn
    to   JPAOUT::Entity
  end  
=end 

  #Regla encargada de crear una entity a partir de una tabla
  rule 'table2entity' do
    from DDLIN::CreateTable
    to   JPAOUT::Entity
    mapping do |entrada, salida| #aqui vamos a poner otra salida para la entidad de la Pk, o no...
      salida.name = entrada.tableName      
      salida.anotations = entrada     #Volvemos a utilizar la creación de tabla para asignar la anotación correspondiente
      salida.properties = entrada.columns #Columnas sin Fk    
      salida.anotations = entrada.columnsPk  
      #Comentario de tabla
      comentario = DDLIN::CreateCommentTable.all_objects.find_one {|i| i.tableName == entrada.tableName}
      if comentario
        #comentario de depuracion 
        #puts "pongo un comentario de tabla"      
        salida.comment = comentario.tableComment
      end       
    end
  end
  
  #Regla encargada de la anotación donde indicar la clase correspondiente a la clave primaria
  rule 'anotationPk' do
    from DDLIN::CreatePk
    to   JPAOUT::EntityPk
    mapping do |entrada, salida|
      salida.name = entrada.namePk
      #Recorremos la colección creando una propiedad por cada columna perteneciente a la clave primaria
      entrada.columnName.each do |columna|
        salida.properties = JPAOUT::Property.new do |p|
          p.name = columna
        end
      end      
    end
  end  
    
  #Regla encargada de crear la anotación correspondiente para la tabla
  rule 'tableAnotation' do
    from DDLIN::CreateTable
    to   JPAOUT::Table
    mapping do |entrada, salida|
      salida.name = entrada.tableName
    end
  end
  
  #Regla encargada de crear una propiedad por cada columna
  rule 'column2property' do
    from DDLIN::CreateColumn
    to   JPAOUT::Property    
    mapping do |createcolumn, salida|
      salida.name = createcolumn.columnName
      salida.anotations = createcolumn
      #Comentario de columna
      comentario = DDLIN::CreateCommentColumn.all_objects.find {|i| i.columnName == createcolumn.columnName and createcolumn.__container__.tableName == i.tableName}
      if comentario
        #puts "pongo un comentario de columna"  
        salida.comment = comentario.columnComment
      end
      #Buscamos solo aquellas relaciones que afecten a la columna sobre la que estamos trabajando      
      relacion = DDLIN::CreateFk.all_objects.find{|s| s.__container__.tableName == createcolumn.__container__.tableName and s.columnName.find{|i| i == createcolumn.columnName}} #Cargamos todas las posibles relaciones
      if relacion
        #puts "hay una relacion!!!! " + relacion.nameFk + " para la columna " + createcolumn.columnName
        #Vamos a ver ahora que tipo de relación se trata, si la foreign coincide con la clave primaria tanto de
        #esta tabla como de la tabla referenciada es una relación uno a uno
        contadorPk = 0        
        relacion.columnName.each do |columna|
          #¿es pk?
          pk = createcolumn.__container__.columnsPk.columnName.find{|i| i == columna}
          if pk 
            contadorPk += 1
            #puts "va el contador de clave primaria por: " + contadorPk.to_s + " del total: " + relacion.columnName.size.to_s
          end          
        end
        #Comparamos ahora con el total de elementos de la columna
        if contadorPk == relacion.columnName.size
          #falta saber si la clave primaria de la tabla referenciada tiene el mismo número de campos, 
          #si es asi es una relación one2one, en caso contrario es una relación one2many          
          if contadorPk == DDLIN::CreateTable.all_objects.find{|j| j.tableName == relacion.references.tableName}.columnsPk.columnName.size                                
            #Se trata de una relacion uno a uno
            #puts "es una relacion one2one"
            one2one = JPAOUT::OneToOne.new
            one2one.name = relacion.nameFk
            #revisa esto
            one2one.referencedColumnName = createcolumn.columnName
            one2one.updatable = "false"; 
            salida.anotations = one2one
          else
            #Se trata de una relacion one2many
            #puts "es una relacion one2many"
            one2many = JPAOUT::One2Many.new           
            salida.anotations = one2many            
          end
        end
        if contadorPk == 0 
          #Es una relacion many2one
          #puts "es una relacion many2one"
          many2one = JPAOUT::ManyToOne.new
          #revisar esto
          many2one.joinColumn = createcolumn.columnName 
          salida.anotations = many2one
        end
        if contadorPk < relacion.columnName.size
          #Se trata de una relacion one2many
          #puts "es una relacion one2many"
          one2many = JPAOUT::One2Many.new         
          salida.anotations = one2many
        end
        #unoauno =  relacion.columnName.find{|i| }
      end
    end
  end    
  
  #Regla encargada de crear la anotación correspondiente a columna (menos las de relación)
  rule 'columnAnotation' do
    from DDLIN::CreateColumn
    to   JPAOUT::Column
    mapping do |entrada, salida|
      salida.name = entrada.columnName
      salida.type = entrada.columnType
      salida.nullable = entrada.columnNull
      #salida.fetch = Al no asignar nada cargamos por defecto la carga perezosa LAZY
    end
  end  
end

=begin
  #Regla encargada de las anotaciones de relaciones uno a uno
  rule 'one2one' do
    from DDLIN::CreateFk
    to   JPAOUT::OneToOne
    #como veo si es oneToOne o oneToMany o yo que se....
    #count o size
  end

  #Regla encargada de las anotaciones de relaciones uno a muchos
  rule 'one2many' do
    from DDLIN::CreateFk
    to   JPAOUT::OneToMany
  end

  #Regla encargada de las anotaciones de relaciones uno a uno
  rule 'many2one' do
    from DDLIN::CreateFk
    to   JPAOUT::ManyToOne
  end    
end
=end 




    