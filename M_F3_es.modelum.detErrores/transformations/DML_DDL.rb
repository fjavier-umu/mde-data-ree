
transformation 'ModelstoModel'

decorator DML::Column do
  def getInsertInto
    DML::InsertInto.all_objects.find{|dml_ddl| dml_ddl.columns.include?(self)}
  end
end

top_rule 'DDLDefinition2DDLDefinition' do
  from DDL::DDLDefinition
  to DML_DDL::DDLDefinition
  mapping do |ddl, dml_ddl|
    dml_ddl.statements = ddl.statements
    dml_ddl.dataType = ddl.dataType
  end
end

rule 'DataType2DataType' do
  from DDL::DataType
  to DML_DDL::DataType
  mapping do |ddl, dml_ddl|
    dml_ddl.types = ddl.types 
  end
end

rule 'Database2Database' do
  from DDL::Database
  to DML_DDL::Database
  mapping do |ddl, dml_ddl|
    dml_ddl.databaseName = ddl.databaseName
  end
end

rule 'Table2Table' do
  from DDL::Table
  to DML_DDL::Table
  mapping do |ddl, dml_ddl|
    dml_ddl.tableName = ddl.tableName
    dml_ddl.columns = ddl.columns
    dml_ddl.columnsPk = ddl.columnsPk
    dml_ddl.columnsFk = ddl.columnsFk
    dml_ddl.checks = ddl.checks
    dml_ddl.commentTable = ddl.commentTable
    
    dml_ddl.registries = DML::InsertInto.all_objects.select{|dml_ddl| dml_ddl.tableName == ddl.tableName}.map{|dml_ddl| dml_ddl.registry}.flatten
  end
end

rule 'Pk2Pk' do
  from DDL::Pk
  to DML_DDL::Pk
  mapping do |ddl, dml_ddl|
    dml_ddl.namePk = ddl.namePk
    dml_ddl.columnName = ddl.columnName
  end
end

rule 'Fk2Fk' do
  from DDL::Fk
  to DML_DDL::Fk
  mapping do |ddl, dml_ddl|
    dml_ddl.nameFk = ddl.nameFk
    dml_ddl.columnName = ddl.columnName
    dml_ddl.references = ddl.references
    dml_ddl.columnReference = ddl.columnReference
    dml_ddl.status = ddl.status
  end
end

rule 'Ck2Ck' do
  from DDL::Ck
  to DML_DDL::Ck
  mapping do |ddl, dml_ddl|
    dml_ddl.nameCk = ddl.nameCk
    dml_ddl.valuesCk = ddl.valuesCk
    dml_ddl.status = ddl.status
  end
end

rule 'ValuesCk2ValuesCk' do
  from DDL::ValuesCk
  to DML_DDL::ValuesCk
  mapping do |ddl, dml_ddl|
    dml_ddl.value = ddl.value
    dml_ddl.comparator = ddl.comparator
    dml_ddl.columnName = ddl.columnName
    dml_ddl.logConjuntion = ddl.logConjuntion
  end
end

rule 'Column2Column' do
  from DDL::Column
  to DML_DDL::Column
  mapping do |ddl, dml_ddl|
    dml_ddl.columnName = ddl.columnName
    dml_ddl.commentColumn = ddl.commentColumn
    dml_ddl.columnNull = ddl.columnNull
    dml_ddl.precision = ddl.precision
    dml_ddl.scale = ddl.scale
    dml_ddl.columnType = ddl.columnType
  end
end

rule 'CommentTable2CommentTable' do
  from DDL::CommentTable
  to DML_DDL::CommentTable
  mapping do |ddl, dml_ddl|
    dml_ddl.tableName = ddl.tableName
    dml_ddl.tableComment = ddl.tableComment
  end
end

rule 'CommentColumn2CommentColumn' do
  from DDL::CommentColumn
  to DML_DDL::CommentColumn
  mapping do |ddl, dml_ddl|
    dml_ddl.tableName = ddl.tableName
    dml_ddl.columnName = ddl.columnName
    dml_ddl.columnComment = ddl.columnComment
  end
end

rule 'Registry2Registry' do
  from DML::Registry
  to DML_DDL::Registry
  mapping do |dml, dml_ddl|
    dml_ddl.registryValues = dml.registryValues
  end
end

rule 'Value2Value' do
  from DML::Value
  to DML_DDL::Value
  mapping do |dml, dml_ddl|
    dml_ddl.value = dml.value
    dml_ddl.column = DML_DDL::Table.all_objects.select{|dml_ddl| dml_ddl.tableName == dml.column.getInsertInto.tableName}.map{|dml_ddl| dml_ddl.columns}.flatten.find{|dml_ddl| dml_ddl.columnName == dml.column.columnName}
  end
end

#############################################################
######################## TYPES ##############################
#############################################################

#############################################################
####################### EXACTOS #############################
rule 'Integer2Integer' do
  from DDL::Integer
  to DML_DDL::Integer
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'SmallInteger2SmallInteger' do
  from DDL::SmallInteger
  to DML_DDL::SmallInteger
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Int2Int' do
  from DDL::Int
  to DML_DDL::Int
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'SmallInt2SmallInt' do
  from DDL::SmallInt
  to DML_DDL::SmallInt
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Numeric2Numeric' do
  from DDL::Numeric
  to DML_DDL::Numeric
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Number2Number' do
  from DDL::Number
  to DML_DDL::Number
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Decimal2Decimal' do
  from DDL::Decimal
  to DML_DDL::Decimal
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end
#############################################################
#############################################################
####################### APROXIMADOS #########################
rule 'Real2Real' do
  from DDL::Real
  to DML_DDL::Real
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'DoublePrecision2DoublePrecision' do
  from DDL::DoublePrecision
  to DML_DDL::DoublePrecision
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Float2Float' do
  from DDL::Float
  to DML_DDL::Float
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Long2Long' do
  from DDL::Long
  to DML_DDL::Long
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'LongRaw2LongRaw' do
  from DDL::LongRaw
  to DML_DDL::LongRaw
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

#############################################################
#############################################################
####################### CHARACTERS ##########################
rule 'Character2Character' do
  from DDL::Character
  to DML_DDL::Character
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'CharacterVarying2CharacterVarying' do
  from DDL::CharacterVarying
  to DML_DDL::CharacterVarying
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Char2Char' do
  from DDL::Char
  to DML_DDL::Char
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'VarChar2VarChar' do
  from DDL::VarChar
  to DML_DDL::VarChar
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'VarChar22VarChar2' do
  from DDL::VarChar2
  to DML_DDL::VarChar2
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Text2Text' do
  from DDL::Text
  to DML_DDL::Text
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'NVarChar22NVarChar2' do
  from DDL::NVarChar2
  to DML_DDL::NVarChar2
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'NChar2NChar' do
  from DDL::NChar
  to DML_DDL::NChar
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'CharVarying2CharVarying' do
  from DDL::CharVarying
  to DML_DDL::CharVarying
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'NationalChar2NationalChar' do
  from DDL::NationalChar
  to DML_DDL::NationalChar
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'NationalCharVarying2NationalCharVarying' do
  from DDL::NationalCharVarying
  to DML_DDL::NationalCharVarying
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'NationalCharacter2NationalCharacter' do
  from DDL::NationalCharacter
  to DML_DDL::NationalCharacter
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'NationalCharacterVarying2NationalCharacterVarying' do
  from DDL::NationalCharacterVarying
  to DML_DDL::NationalCharacterVarying
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'NCharVarying2NCharVarying' do
  from DDL::NCharVarying
  to DML_DDL::NCharVarying
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Clob2Clob' do
  from DDL::Clob
  to DML_DDL::Clob
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'NClob2NClob' do
  from DDL::NClob
  to DML_DDL::NClob
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end
#############################################################
#############################################################
########################## BITS #############################
rule 'Bit2Bit' do
  from DDL::Bit
  to DML_DDL::Bit
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'BitVarying2BitVarying' do
  from DDL::BitVarying
  to DML_DDL::BitVarying
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end
#############################################################
#############################################################
######################### TIMES #############################
rule 'Time2Time' do
  from DDL::Time
  to DML_DDL::Time
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Date2Date' do
  from DDL::Date
  to DML_DDL::Date
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Timestamp2Timestamp' do
  from DDL::Timestamp
  to DML_DDL::Timestamp
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end
#############################################################
#############################################################
####################### INTERVALS ###########################
rule 'DayTime2DayTime' do
  from DDL::DayTime
  to DML_DDL::DayTime
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'YearMonth2YearMonth' do
  from DDL::YearMonth
  to DML_DDL::YearMonth
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end
#############################################################
#############################################################
####################### BINARIES ############################
rule 'BinaryDouble2BinaryDouble' do
  from DDL::BinaryDouble
  to DML_DDL::BinaryDouble
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'BinaryFloat2BinaryFloat' do
  from DDL::BinaryFloat
  to DML_DDL::BinaryFloat
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'BFile2BFile' do
  from DDL::BFile
  to DML_DDL::BFile
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end

rule 'Blob2Blob' do
  from DDL::Blob
  to DML_DDL::Blob
  mapping do |ddl, dml_ddl|
    dml_ddl.name = ddl.name
  end
end
#############################################################
# Write your rules here. Use templates (CTRL + SPACE) to ease your work.