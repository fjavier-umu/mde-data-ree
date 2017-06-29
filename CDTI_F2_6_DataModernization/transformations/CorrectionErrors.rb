transformation 'name'
use_library 'helper://correct_BD.rb'

top_rule 'DDLDefinition' do
  from DML_DDL::DDLDefinition
  to Correct::DDLDefinition
  mapping do |dml_ddl, correct|
    correct.statements = dml_ddl.statements
    correct.dataType = dml_ddl.dataType
  end
end

rule 'DataType' do
  from DML_DDL::DataType
  to Correct::DataType
  mapping do |dml_ddl, correct|
    correct.types = dml_ddl.types 
  end
end

rule 'Database' do
  from DML_DDL::Database
  to Correct::Database
  mapping do |dml_ddl, correct|
    correct.databaseName = dml_ddl.databaseName
  end
end

rule 'Table' do
  from DML_DDL::Table
  to Correct::Table
  mapping do |dml_ddl, correct|
    correct.tableName = dml_ddl.tableName
    correct.columns = dml_ddl.columns
    correct.columnsPk = dml_ddl.columnsPk
    
    correct.columnsFk = dml_ddl.columnsFk
        
    correct.checks = dml_ddl.checks
    correct.commentTable = dml_ddl.commentTable
    
    if (dml_ddl.hasError)
      correct.registries = dml_ddl.getRegistries
      newsFk = dml_ddl.getNewsFk
      newsFk.each do |fk|
        correct.columnsFk << fk
      end
    else
      correct.registries = dml_ddl.registries
    end
  end
end

rule 'Column' do
  from DML_DDL::Column
  to Correct::Column
  mapping do |dml_ddl, correct|
    correct.columnName = dml_ddl.columnName
    correct.commentColumn = dml_ddl.commentColumn
    correct.columnNull = dml_ddl.columnNull
    correct.columnType = dml_ddl.columnType
  end
end

rule 'Pk' do
  from DML_DDL::Pk
  to Correct::Pk
  mapping do |dml_ddl, correct|
    correct.namePk = dml_ddl.namePk
    correct.columnName = dml_ddl.columnName
  end
end

rule 'Fk' do
  from DML_DDL::Fk
  to Correct::Fk
  mapping do |dml_ddl, correct|
    correct.nameFk = dml_ddl.nameFk
    correct.columnName = dml_ddl.columnName
    correct.references = dml_ddl.references
    correct.columnReference = dml_ddl.columnReference
    if (dml_ddl.hasError)
      correct.status = "ENABLED"
    else
      correct.status = dml_ddl.status
    end
  end
end

rule 'Ck' do
  from DML_DDL::Ck
  to Correct::Ck
  mapping do |dml_ddl, correct|
    correct.nameCk = dml_ddl.nameCk
    correct.valuesCk = dml_ddl.valuesCk
    if (dml_ddl.hasError)
      correct.status = "ENABLED"
    else
      correct.status = dml_ddl.status
    end
  end
end

rule 'ValuesCk' do
  from DML_DDL::ValuesCk
  to Correct::ValuesCk
  mapping do |dml_ddl, correct|
    correct.value = dml_ddl.value
    correct.comparator = dml_ddl.comparator
    correct.columnName = dml_ddl.columnName
    correct.logConjuntion = dml_ddl.logConjuntion
  end
end

rule 'CommentTable' do
  from DML_DDL::CommentTable
  to Correct::CommentTable
  mapping do |dml_ddl, correct|
    correct.tableName = dml_ddl.tableName
    correct.tableComment = dml_ddl.tableComment
  end
end

rule 'CommentColumn' do
  from DML_DDL::CommentColumn
  to Correct::CommentColumn
  mapping do |dml_ddl, correct|
    correct.tableName = dml_ddl.tableName
    correct.columnName = dml_ddl.columnName
    correct.columnComment = dml_ddl.columnComment
  end
end

rule 'Registry' do
  from DML_DDL::Registry
  to Correct::Registry
  mapping do |dml_ddl, correct|
    correct.registryValues = dml_ddl.registryValues
  end
end

rule 'Value' do
  from DML_DDL::Value
  to Correct::Value
  mapping do |dml_ddl, correct|
    correct.value = dml_ddl.value
    correct.column = dml_ddl.column
  end
end

#############################################################
######################## TYPES ##############################
#############################################################

#############################################################
####################### EXACTOS #############################
rule 'Integer' do
  from DML_DDL::Integer
  to Correct::Integer
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'SmallInteger' do
  from DML_DDL::SmallInteger
  to Correct::SmallInteger
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Int' do
  from DML_DDL::Int
  to Correct::Int
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'SmallInt' do
  from DML_DDL::SmallInt
  to Correct::SmallInt
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Numeric' do
  from DML_DDL::Numeric
  to Correct::Numeric
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Number' do
  from DML_DDL::Number
  to Correct::Number
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Decimal' do
  from DML_DDL::Decimal
  to Correct::Decimal
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end
#############################################################
#############################################################
####################### APROXIMADOS #########################
rule 'Real' do
  from DML_DDL::Real
  to Correct::Real
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'DoublePrecision' do
  from DML_DDL::DoublePrecision
  to Correct::DoublePrecision
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Float' do
  from DML_DDL::Float
  to Correct::Float
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Long' do
  from DML_DDL::Long
  to Correct::Long
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'LongRaw' do
  from DML_DDL::LongRaw
  to Correct::LongRaw
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

#############################################################
#############################################################
####################### CHARACTERS ##########################
rule 'Character' do
  from DML_DDL::Character
  to Correct::Character
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'CharacterVarying' do
  from DML_DDL::CharacterVarying
  to Correct::CharacterVarying
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Char' do
  from DML_DDL::Char
  to Correct::Char
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'VarChar' do
  from DML_DDL::VarChar
  to Correct::VarChar
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'VarChar2' do
  from DML_DDL::VarChar2
  to Correct::VarChar2
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'NVarChar2' do
  from DML_DDL::NVarChar2
  to Correct::NVarChar2
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'NChar' do
  from DML_DDL::NChar
  to Correct::NChar
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'CharVarying' do
  from DML_DDL::CharVarying
  to Correct::CharVarying
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'NationalChar' do
  from DML_DDL::NationalChar
  to Correct::NationalChar
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'NationalCharVarying' do
  from DML_DDL::NationalCharVarying
  to Correct::NationalCharVarying
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'NationalCharacter' do
  from DML_DDL::NationalCharacter
  to Correct::NationalCharacter
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'NationalCharacterVarying' do
  from DML_DDL::NationalCharacterVarying
  to Correct::NationalCharacterVarying
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'NCharVarying' do
  from DML_DDL::NCharVarying
  to Correct::NCharVarying
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Clob' do
  from DML_DDL::Clob
  to Correct::Clob
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'NClob' do
  from DML_DDL::NClob
  to Correct::NClob
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end
#############################################################
#############################################################
########################## BITS #############################
rule 'Bit' do
  from DML_DDL::Bit
  to Correct::Bit
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'BitVarying' do
  from DML_DDL::BitVarying
  to Correct::BitVarying
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end
#############################################################
#############################################################
######################### TIMES #############################
rule 'Time' do
  from DML_DDL::Time
  to Correct::Time
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Date' do
  from DML_DDL::Date
  to Correct::Date
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Timestamp' do
  from DML_DDL::Timestamp
  to Correct::Timestamp
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end
#############################################################
#############################################################
####################### INTERVALS ###########################
rule 'DayTime' do
  from DML_DDL::DayTime
  to Correct::DayTime
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'YearMonth' do
  from DML_DDL::YearMonth
  to Correct::YearMonth
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end
#############################################################
#############################################################
####################### BINARIES ############################
rule 'BinaryDouble' do
  from DML_DDL::BinaryDouble
  to Correct::BinaryDouble
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'BinaryFloat' do
  from DML_DDL::BinaryFloat
  to Correct::BinaryFloat
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'BFile' do
  from DML_DDL::BFile
  to Correct::BFile
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end

rule 'Blob' do
  from DML_DDL::Blob
  to Correct::Blob
  mapping do |dml_ddl, correct|
    correct.name = dml_ddl.name
  end
end
#############################################################
