transformation 'ddl2ddl'

#En la fase uno se realiza toda la transformación menos las claves ajenas,
#ya que deben cargarse primero todas las tablas
phase 'fase1' do
  #Regla principal para el parseo de los statements
  top_rule 'error2solucionado' do
    from DDLIN::DDLDefinition   
    to   DDLOUT::DDLDefinition
    mapping do |entrada, salida|
      salida.statements = entrada.statements      
    end
  end
  
  #Regla encargada de añadir una tabla
  rule 'table2table' do
    from DDLIN::CreateTable
    to   DDLOUT::CreateTable
    mapping do |entrada, salida|
      salida.tableName = entrada.tableName
      salida.commentTable = entrada.commentTable
      salida.columns = entrada.columns
      salida.columnsPk = entrada.columnsPk
      salida.columnsFk = entrada.columnsFk
      salida.checks = entrada.checks    
      #Comprobamos si hay nuevas FK por añadir
      nuevaFk = ERROR::ForeignError.all_objects.find {|s| s.tableCont.nameTable == entrada.tableName}
      if nuevaFk
        salida.columnsFk = nuevaFk
      end
      #Comprobamos si hay nuevas CK por añadir
      nuevaCk = ERROR::CheckError.all_objects.find {|s| s.nameTable == entrada.tableName}
      if nuevaCk
        salida.checks = nuevaCk
      end    
    end
  end
  
  #Regla encargada de añadir una nueva columna
  rule 'column2column' do
    from DDLIN::CreateColumn
    to   DDLOUT::CreateColumn
    mapping do |entrada, salida|
      salida.columnName = entrada.columnName
      salida.commentColumn = entrada.commentColumn
      salida.columnType = entrada.columnType
      salida.columnNull = entrada.columnNull
    end
  end
  
  #Regla encargada de añadir una PK
  rule 'pk2pk' do
    from DDLIN::CreatePk
    to   DDLOUT::CreatePk
    mapping do |entrada, salida|
      salida.namePk = entrada.namePk
      salida.columnName = entrada.columnName
    end
  end
  
  #Regla encargada de añadir una FK
  rule 'fk2fk' do
    from DDLIN::CreateFk
    to   DDLOUT::CreateFk
    mapping do |entrada, salida|
      salida.nameFk = entrada.nameFk
      salida.columnName = entrada.columnName
      #esto en la segunda fase, cuando se encuentren cargadas todas las tablas
      #en el modelo de salida
      #salida.references = entrada.references
      salida.columnReference = entrada.columnReference
    end
  end
  
  #Regla encargada de añadir una CK
  rule 'ck2ck' do
    from DDLIN::CreateCk
    to   DDLOUT::CreateCk
    mapping do |entrada, salida|
      salida.nameCk = entrada.nameCk
      salida.valuesCk = entrada.valuesCk
    end
  end
  
  #Regla encargada de añadir el comentario de una tabla
  rule 'commentTable2commentTable' do
    from DDLIN::CreateCommentTable
    to   DDLOUT::CreateCommentTable
    mapping do |entrada, salida|
      salida.tableName = entrada.tableName
      salida.tableComment = entrada.tableComment
    end
  end
  
  #Regla encargada de añadir un comentario de columna
  rule 'commentColumn2commentColumn' do
    from DDLIN::CreateCommentColumn
    to   DDLOUT::CreateCommentColumn
    mapping do |entrada, salida|
      salida.tableName = entrada.tableName
      salida.columnName = entrada.columnName
      salida.columnComment = entrada.columnComment
    end
  end
  
  #Regla encargadade añadir una Foreign Key
  rule 'errorFk' do
    from ERROR::ForeignError
    to   DDLOUT::CreateFk
    mapping do |entrada, salida|           
      salida.nameFk = entrada.nameFk
      salida.columnName = entrada.tableCont.columnCont 
      salida.columnReference = entrada.tableRef.columnCont
      #esto en la segunda fase, cuando esten cargadas todas las tablas
      #del modelo salida
      #salida.references = DDLOUT::CreateTable.all_objects.find {|s| s.tableName == entrada.tableRef}
    end
  end
  
  #Regla encargada de añadir una check constraint
  rule 'errorCk' do
    from ERROR::CheckError
    to   DDLOUT::CreateCk
    mapping do |entrada, salida|
      salida.nameCk = entrada.nameCk
      salida.nameColumn = entrada.columns.map{ |t| t.columnName}
      salida.valuesCk = entrada.columns.map{ |t| t.values.map{ |v| v.value}}
    end
  end
end

#En la fase 2 incluimos tanto las Fk's del modelo original, como las nuevas
#Fk's añadidas por el modelo de errores
phase 'fase2' do
  #Redefinimos la creación de Fk
  refinement_rule 'refinefk2fk' do
    from DDLIN::CreateFk
    to   DDLOUT::CreateFk
    mapping do |entrada, salida|
      salida.references = DDLOUT::CreateTable.all_objects.find {|s| s.tableName == entrada.references.tableName}      
    end    
  end
  #Refinamos la creación de un error Fk
  refinement_rule 'refineErrorFk' do
    from ERROR::ForeignError
    to   DDLOUT::CreateFk
    mapping do |entrada, salida|
      salida.references = DDLOUT::CreateTable.all_objects.find {|s| s.tableName == entrada.tableRef.nameTable}
    end  
  end  
end





    