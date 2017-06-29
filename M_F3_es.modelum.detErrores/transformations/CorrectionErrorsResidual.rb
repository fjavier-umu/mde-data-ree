transformation 'name'
use_library 'helper://residual_BD.rb'

top_rule 'DDLDefinition' do
  from DML_DDL::DDLDefinition
  to Residual::DDLDefinition
  mapping do |dml_ddl, res|
    res.statements = dml_ddl.getStatements
  end
end

rule 'Table' do
  from DML_DDL::Table
  to Residual::Table
  filter {|dml_ddl| dml_ddl.hasError == true}
  mapping do |dml_ddl, res|
    res.tableName = dml_ddl.tableName
    res.columns = dml_ddl.columns
    
    res.registries = dml_ddl.getRegistries
  end
end

rule 'Column' do
  from DML_DDL::Column
  to Residual::Column
  mapping do |dml_ddl, res|
    res.columnName = dml_ddl.columnName
  end
end

rule 'Registry' do
  from DML_DDL::Registry
  to Residual::Registry
  mapping do |dml_ddl, res|
    res.registryValues = dml_ddl.registryValues
  end
end

rule 'Value' do
  from DML_DDL::Value
  to Residual::Value
  mapping do |dml_ddl, res|
    res.value = dml_ddl.value
    res.column = dml_ddl.column
  end
end

#####################################################################