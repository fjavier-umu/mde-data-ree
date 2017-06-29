model_to_model :fdsWithDuplicateColumns2fds do |t|
  t.sources :package   => 'FDSDUPL',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fdsWithDuplicateColumns.xmi'   

  t.targets :package   => 'FDS',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fds.xmi'  

  t.transformation 'transformations/fdsWithDuplicateColumns2fds.rb'
end

model_to_code :toFicheroFds do |t| 
  t.sources :package   => 'FDS',
            :metamodel => 'metamodels/fds.ecore',
            :model     => 'models/fds.xmi'
  t.codebase = 'generation'
  t.generate 'transformations/fdsTexto.2code'
end