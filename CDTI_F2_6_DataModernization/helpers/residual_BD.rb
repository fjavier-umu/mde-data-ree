decorator DML_DDL::DDLDefinition do
  def getStatements
    # Lo que hacemos es comprobar para cada statements si es de tipo Tabla, entonces solamente
    # se añadirá al array si dicha tabla presenta algún error, en otro caso no se añade
    # para que así no sea añadida al metamodelo residual
    # 
    statements = Array.new
    self.statements.each do |statement|
      if (statement.kind_of? DML_DDL::Table)
        if (statement.hasError)
          statements << statement
        end
      end
    end
    return statements
  end
end

decorator DML_DDL::Table do
  def hasError
    # Comprobamos si la tabla presenta algun error.
    # Para ello comprobamos si esta referenciada en ForeginError o CheckError
    
    @foreignErrors = Errores::ForeignError.all_objects.select{|error| error.tableCont == self && error.apply == true && !(error.registriesFk.empty?)}
    @checkErrors = Errores::CheckError.all_objects.select{|error| error.table == self && error.apply == true && !(error.registriesCk.empty?)}
    
    return (!(@foreignErrors.empty?) || !(@checkErrors.empty?))
  end
  
  def getRegistries
    registries = Array.new
    
    if (!@checkErrors.empty?)
      for i in 0..@checkErrors.length-1
        @checkErrors[i].registriesCk.each do |regCk|
          registries << regCk
        end
      end
    end
    
    if (!@foreignErrors.empty?)
      for i in 0..@foreignErrors.length-1
        @foreignErrors[i].registriesFk.each do |regFk|
          registries << regFk
        end
      end
    end
  
    return registries
  end
end