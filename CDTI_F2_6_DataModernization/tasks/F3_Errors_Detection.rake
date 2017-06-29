model_to_model :errorsDetection do |t|
  t.sources :package   => 'DML_DDL',
            :metamodel => 'metamodels/DML_DDL.ecore',
            :model     => 'models/DML_DDL.xmi'    

  t.targets :package   => 'Errores',
            :metamodel => 'metamodels/Errores.ecore',
            :model     => 'models/Errores.xmi'  

  t.transformation 'transformations/DetectionErrors.rb'
end