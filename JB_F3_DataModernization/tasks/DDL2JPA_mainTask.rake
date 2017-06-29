model_to_model :fdsWithDuplicateColumns2fds do |t|
  t.sources :package   => 'DDLIN',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/DDLout.xmi'   

  t.targets :package   => 'JPAOUT',
            :metamodel => 'metamodels/JPA.ecore',
            :model     => 'models/JPA.xmi'  

  t.transformation 'transformations/ddl2jpa.rb'
end