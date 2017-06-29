model_to_model :fds_DDLDenormalized2fdsDDLDenormalized do |t|
  t.sources :package   => 'FDS',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fds.xmi'   
            
  t.sources :package   => 'DDL',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/DDLDenormalized.xmi'  

  t.targets :package   => 'FDSDDL',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fdsDDLDenormalized.xmi'  

  t.transformation 'transformations/fds_DDLDenormalized2fdsDDLDenormalized.rb'
end