model_to_model :fdsWithDuplicateColumns2fds do |t|
  t.sources :package   => 'DDLIN',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/DDLin.xmi'   

  t.sources :package   => 'ERROR',
            :metamodel => 'metamodels/Errores.ecore',
            :model     => 'models/errores.xmi' 
            
  t.targets :package   => 'DDLOUT',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/DDLout.xmi'  

  t.transformation 'transformations/ddl2ddl.rb'
end