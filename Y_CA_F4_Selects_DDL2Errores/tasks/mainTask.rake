model_to_model :selects_DDL2errores do |t|
  t.sources :package   => 'SEL',
            :metamodel => 'metamodels/selects.ecore',
            :model     => 'models/selectsHibernate.xmi'   

  t.sources :package   => 'DDL',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/OSCAR_DDLyo.xmi'
            
  t.targets :package   => 'ERR',
            :metamodel => 'metamodels/errores.ecore',
            :model     => 'models/errores.xmi'  

  t.transformation 'transformations/selects_DDL2errores.rb'
end