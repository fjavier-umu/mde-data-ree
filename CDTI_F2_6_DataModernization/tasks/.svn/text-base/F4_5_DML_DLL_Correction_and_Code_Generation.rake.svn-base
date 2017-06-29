model_to_model :errorsCorrection do |t|
  t.sources :package   => 'DML_DDL',
            :metamodel => 'metamodels/DML_DDL.ecore',
            :model     => 'models/DML_DDL.xmi'   

  t.sources :package   => 'Errores',
            :metamodel => 'metamodels/Errores.ecore',
            :model     => 'models/Errores.xmi' 
            
  t.targets :package   => 'Correct',
            :metamodel => 'metamodels/DML_DDL.ecore',
            :model     => 'models/DML_DDL_Correct.xmi'  

  t.transformation 'transformations/CorrectionErrors.rb'
end

model_to_model :residualsErrorsCorrection do |t|
  t.sources :package   => 'DML_DDL',
            :metamodel => 'metamodels/DML_DDL.ecore',
            :model     => 'models/DML_DDL.xmi'   

  t.sources :package   => 'Errores',
            :metamodel => 'metamodels/Errores.ecore',
            :model     => 'models/Errores.xmi' 
            
  t.targets :package   => 'Residual',
            :metamodel => 'metamodels/DML_DDL.ecore',
            :model     => 'models/DML_DDL_Residual.xmi'  

  t.transformation 'transformations/CorrectionErrorsResidual.rb'
end

model_to_code :codeGeneration  do |t|
  t.sources :package   => 'DML_DDL',
            :metamodel => 'metamodels/DML_DDL.ecore',
            :model     => 'models/DML_DDL_Correct.xmi'
            
  t.codebase = 'generation/'
  t.generate 'transformations/modelToSql.2code'
end