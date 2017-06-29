model_to_model :DDLDenormalized_fdsDDLNormalized2DDLNormalized do |t|
  t.sources :package   => 'FDSDDLNORM',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fdsDDLNormalizedByDecomposition.xmi' 

  t.sources :package   => 'DDLDENORM',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/DDLDenormalized.xmi'

  t.targets :package   => 'DDLNORM',
            :metamodel => 'metamodels/DDL.ecore',
            :model     => 'models/DDLNormalized.xmi'  

  t.transformation 'transformations/DDLDenormalized_fdsDDLNormalized2DDLNormalized.rb'
end