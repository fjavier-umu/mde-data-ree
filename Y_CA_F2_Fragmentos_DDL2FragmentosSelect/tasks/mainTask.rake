model_to_model :fragmentos_DDL2fragmentosSQL do |t|
  t.sources :package   => 'FRAG',
            :metamodel => 'metamodels/fragmentos.ecore',
            :model     => 'models/fragmentos.xmi'   

  t.sources :package   => 'DDL',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/OSCAR_DDLyo.xmi'
            
  t.targets :package   => 'FRAGSQL',
            :metamodel => 'metamodels/fragmentos.ecore',
            :model     => 'models/fragmentosSQL.xmi'  

  t.transformation 'transformations/fragmentos_DDL2fragmentosSQL.rb'
end

model_to_model :fragmentosSQL2fragmentosSelect do |t| 
  t.sources :package   => 'FRAGSQL',
            :metamodel => 'metamodels/fragmentos.ecore',
            :model     => 'models/fragmentosSQL.xmi'   

  t.targets :package   => 'FRAGSEL',
            :metamodel => 'metamodels/fragmentos.ecore',
            :model     => 'models/fragmentosSelect.xmi'  

  t.transformation 'transformations/fragmentosSQL2fragmentosSelect.rb'
end

model_to_code :toFicheroSelect => :fragmentosSQL2fragmentosSelect do |t| 
  t.codebase = 'generation'
  t.generate 'transformations/fragmentosSelect.2code'
end