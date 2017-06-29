model_to_model :fdsDDLDenormalized2fdsDDL1NF do |t|
  t.sources :package   => 'DENORM',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fdsDDLDenormalized.xmi'   

  t.targets :package   => 'NF1',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fdsDDL1NF.xmi'  

  t.transformation 'transformations/fdsDDLDenormalized2fdsDDL1NF.rb'
end

model_to_model :decomposition do |t|
  t.sources :package   => 'NF1',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fdsDDL1NF.xmi'   

  t.targets :package   => 'NORM',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fdsDDLNormalizedByDecomposition.xmi'  

  t.transformation 'transformations/decomposition.rb'
end

model_to_model :synthesis do |t|
  t.sources :package   => 'NF1',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fdsDDL1NF.xmi'   

  t.targets :package   => 'NORM',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fdsDDLNormalizedBySynthesis.xmi'  

  t.transformation 'transformations/synthesis.rb'
end