model_to_model :generateJPAModel do |t|
  t.sources :package   => 'DDLIN',
            :metamodel => 'metamodels/DML_DDL.ecore',
            :model     => 'models/DML_DDL_Correct.xmi'   

  t.targets :package   => 'JPAOUT',
            :metamodel => 'metamodels/JPA.ecore',
            :model     => 'models/JPA.xmi'  

  t.transformation 'transformations/ddl2jpa.rb'
end