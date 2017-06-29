transformation 'ddl2jpa'

decorator Correct::Type do
  def toString
    if self.kind_of?Correct::Exacto
      return "int"
    elsif self.kind_of?Correct::Aproximado
      return "double"
    elsif self.kind_of?Correct::Characters
      return "String"
    elsif self.kind_of?Correct::Bits
      return "boolean"
    elsif self.kind_of?Correct::Times
      return "java.util.Date"
    elsif self.kind_of?Correct::Intervals
      return "java.util.Date"
    elsif self.kind_of?Correct::Binaries
      return "byte[]"
    else
      return "unknown"
    end
  end

end

#En la fase uno se realiza tanto la unidad de persistencia como todas las entidades y propiedades
#para las tablas y columnas
phase 'fase1' do
  #Regla principal para la creaci�n de la unidad de persistencia
  top_rule 'ddl2persistenceUnit' do
    from Correct::DDLDefinition
    to   JPA::PersistenceUnit
    mapping do |entrada, salida|
      salida.entities = entrada.statements
    end
  end

  #Ignoramos las reglas de creacion de comentarios ya que ser�n tratadas en la creaci�n
  #de "entities" y "properties"
  ignore_rule Correct::CommentTable => :any
  ignore_rule Correct::CommentColumn => :any

  #Regla encargada de crear una entity a partir de una tabla
  rule 'table2entity' do
    from Correct::Table
    to   JPA::Entity
    mapping do |entrada, salida| #aqui vamos a poner otra salida para la entidad de la Pk, o no...
      puts "Entity : #{entrada.tableName}"
      salida.name = entrada.tableName
      #Comentario de tabla
      comentario = Correct::CommentTable.all_objects.find{|i| i.tableName == entrada.tableName}
      if comentario
          #comentario de depuracion
          puts comentario.tableComment
          salida.comment = comentario.tableComment
      end
      salida.anotations = entrada     #Volvemos a utilizar la creaci�n de tabla para asignar la anotaci�n correspondiente
      salida.properties = entrada.columns #Columnas sin Fk
      salida.anotations = entrada.columnsPk
    end
  end

  #Regla encargada de la anotaci�n donde indicar la clase correspondiente a la clave primaria
  rule 'anotationPk' do
    from Correct::Pk
    to   JPA::EntityPk
    mapping do |entrada, salida|
      salida.name = entrada.namePk
      #Recorremos la colecci�n creando una propiedad por cada columna perteneciente a la clave primaria
      entrada.columnName.each do |columna|
        salida.properties = JPA::Property.new do |p|
          p.name = columna
        end
      end
    end
  end

  #Regla encargada de crear la anotaci�n correspondiente para la tabla
  rule 'tableAnotation' do
    from Correct::Table
    to   JPA::Table
    mapping do |entrada, salida|
      salida.name = entrada.tableName
    end
  end

  #Regla encargada de crear una propiedad por cada columna
  rule 'column2property' do
    from Correct::Column
    to   JPA::Property
    mapping do |column, salida|
      salida.name = column.columnName
      salida.anotations = column
      #Comentario de columna
      comentario = Correct::CommentColumn.all_objects.find {|i| i.columnName == column.columnName and column.__container__.tableName == i.tableName}
      if comentario
        puts "#{salida.name} - #{comentario.columnComment}"
        salida.comment = comentario.columnComment
      end

      #Buscamos relaciones FK que tenga la columna (one2one-mappedBy, many2one)
      relacionA = column.__container__.columnsFk.select{|fk| fk.columnName.first.strip == column.columnName.strip}
      #if relacionA
      #  puts "RelacionesA #{column.columnName}: #{relacionA.size}"
      #else
      #  puts "RelacionesA #{column.columnName}: 0"
      #end

      #Buscamos relaciones FK de otras tablas que tenga a la columna por referencia (one2one, one2many-mappedby)
      relacionB = Correct::Fk.all_objects.select{|fk| fk.columnReference.first.strip == column.columnName.strip and fk.references == column.__container__ }
      #if relacionB
      #  puts "RelacionesB #{column.columnName}: #{relacionB.size}"
      #else
      #  puts "RelacionesB #{column.columnName}: 0"
      #end

      if relacionA
        relacionA.each do |relacion|
          if relacion.columnName.first.strip == column.__container__.columnsPk.columnName.first.strip
            #Se trata de una relacion one2one-mappedby
            #puts "es una relacion one2one-mappedby 4: #{relacion.nameFk}"
            relacion.type = "one2one-mappedby"
            salida.anotations = relacion
          else
            #Es una relacion many2one
            #puts "es una relacion many2one 3: #{relacion.nameFk}"
            relacion.type = "many2one"
            salida.anotations = relacion
          end
        end
      end

      if relacionB
        relacionB.each do |relacion|
          if relacion.columnName.first.strip == relacion.__container__.columnsPk.columnName.first.strip
            #Se trata de una relacion one2one
            #puts "es una relacion one2one 1: #{relacion.nameFk}"
            relacion.type = "one2one"
            salida.anotations = relacion
          else
            #Se trata de una relacion one2many-mappedby
            #puts "es una relacion one2many-mappedby 2: #{relacion.nameFk}"
            relacion.type = "one2many-mappedby"
            salida.anotations = relacion
          end
        end
      end
    end
  end

  #Regla encargada de crear la anotaci�n correspondiente a columna (menos las de relaci�n)
  rule 'columnAnotation' do
    from Correct::Column
    to   JPA::Column
    mapping do |entrada, salida|
      salida.name = entrada.columnName
      salida.type = entrada.columnType.toString
      salida.nullable = entrada.columnNull
      #salida.fetch = Al no asignar nada cargamos por defecto la carga perezosa LAZY
    end
  end

  #Regla encargada de las anotaciones de relaciones OneToMany
  rule 'one2many' do
    from Correct::Fk
    to   JPA::OneToMany
    filter do |relacion|
      relacion.type.eql?"one2many-mappedby"
    end
    mapping do |relacion, one2many|
      one2many.name = relacion.nameFk
      one2many.type = relacion.type
      one2many.referencedEntityName =  relacion.__container__.tableName
    end
  end

  #Regla encargada de las anotaciones de relaciones ManyToOne
  rule 'many2one' do
    from Correct::Fk
    to   JPA::ManyToOne
    filter do |relacion|
      relacion.type.eql?"many2one"
    end
    mapping do |relacion, many2one|
      many2one.name = relacion.nameFk
      many2one.type = relacion.type
      many2one.referencedPropertyName = relacion.columnReference.first
      many2one.referencedEntityName =  relacion.references.tableName
    end
  end

  #Regla encargada de las anotaciones de relaciones OneToOne
  rule 'one2one' do
    from Correct::Fk
    to   JPA::OneToOne
    filter do |relacion|
      relacion.type.eql?("one2one")
    end
    mapping do |relacion, one2one|
      one2one.name = relacion.nameFk
      one2one.type = relacion.type
      one2one.referencedPropertyName = relacion.columnReference.first
      one2one.referencedEntityName =  relacion.references.tableName
    end
  end

  #Regla encargada de las anotaciones de relaciones OneToOne
  rule 'one2one' do
    from Correct::Fk
    to   JPA::OneToOne
    filter do |relacion|
      relacion.type.eql?("one2one-mappedby")
    end
    mapping do |relacion, one2one|
      one2one.name = relacion.nameFk
      one2one.type = relacion.type
      one2one.referencedPropertyName = relacion.columnReference.first
      one2one.referencedEntityName =  relacion.references.tableName
    end
  end
end