model_to_model :fdsWithDuplicateColumns2fds do |t|
  t.sources :package   => 'DDLIN',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/DDLNormalized.xmi'   

  t.targets :package   => 'JPAOUT',
            :metamodel => 'metamodels/JPA.ecore',
            :model     => 'models/JPA.xmi'  

  t.transformation 'transformations/fdsWithDuplicateColumns2fds.rb'
end