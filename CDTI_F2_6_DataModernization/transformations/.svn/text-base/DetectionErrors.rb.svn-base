transformation 'name'
use_library 'helper://modernizar_BD.rb'

# Contador para llevar un registro de los errores que se van encontrando
counter = Counter.new

top_rule 'error' do
  from DML_DDL::DDLDefinition
  to Errores::Errores
  mapping do |dml_ddl, error|
    dml_ddl.getErrors
    
    error.errores = dml_ddl.getCks
    error.errores = dml_ddl.getFks
    error.errores = dml_ddl.getPks
  end
end

rule 'ck_Desactivada' do
  from DML_DDL::Ck
  to Errores::CheckError
  mapping do |dml_ddl, error|
    #puts '*********CK' + dml_ddl.nameCk
    #dml_ddl.valuesCk.each do |valuesCk|
    #  puts "nombre Columna: #{valuesCk.columnName}"
    #  valuesCk.value.each do |aString|
    #    puts "--> #{aString}"
    #  end
    #end;    
    
    error.porcent = dml_ddl.getPorcent
    error.set('table', dml_ddl.getTable)
    error.set('ck', dml_ddl)
    
    
    
    #puts 'registries'
    dml_ddl.getRegistries.each do |reg|
      #puts '-------'
      error.set('registriesCk', reg)
      #reg.registryValues.each do |values|
      #  puts values.column.columnName
      #  puts values.value
      #end
    end
    error.id = counter.next()
    error.apply = true    
  end
end

rule 'fk_Desactivada' do
  from DML_DDL::Fk
  to Errores::ForeignError
  mapping do |dml_ddl, error|
  
    puts 'fk_Desactivada'
    
    error.porcent = dml_ddl.getPorcent
    error.set('tableCont', dml_ddl.getTable)
    error.set('fk', dml_ddl)
    error.set('tableRef', dml_ddl.references)
    
    dml_ddl.getRegistries.each do |reg|
      error.set('registriesFk', reg)
    end

    error.apply = true
    error.id = counter.next()    
  end
end

rule 'check_Pk' do
  from DML_DDL::Pk
  to Errores::ForeignError
  mapping do |dml_ddl, error|
  
    #puts 'fk_Desactivada'
  
    error.porcent = dml_ddl.getPorcent
    error.set('tableRef', dml_ddl.getTable)
    error.set('fkColumns', dml_ddl.getColumnsRef)
    error.set('tableCont', dml_ddl.getTableRef)
    
    dml_ddl.getRegistries.each do |reg|
      error.set('registriesFk', reg)
    end 

    error.apply = true
    error.id = counter.next()   
  end
end
