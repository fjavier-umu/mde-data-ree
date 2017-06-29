model_to_model :integrationDMLDDL do |t|
  t.sources :package   => 'DDL',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/DDL_Gramol.ecore'   

  t.sources :package   => 'DML',
            :metamodel => 'metamodels/DML.ecore',
            :model     => 'models/DML_Gramol.ecore' 
            
  t.targets :package   => 'DML_DDL',
            :metamodel => 'metamodels/DML_DDL.ecore',
            :model     => 'models/DML_DDL.xmi'  

  t.transformation 'transformations/DML_DDL.rb'
end