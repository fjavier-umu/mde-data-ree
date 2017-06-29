decorator DML_DDL::Ck do
  def hasError
    error = Errores::CheckError.all_objects.select{|error| error.ck == self && error.apply == true}
    
    return !(error.empty?)
  end
end

decorator DML_DDL::Fk do
  def hasError
    error = Errores::ForeignError.all_objects.select{|error| error.fk == self && error.apply == true}
    
    return !(error.empty?)
  end
end

decorator DML_DDL::Table do
  # Identficador para la posible creacion de nuevas Fk
  @@id = 0
  
  def hasError
    # Comprobamos si la tabla presenta algun error.
    # Para ello comprobamos si esta referenciada en ForeginError o CheckError
    
    @foreignErrors = Errores::ForeignError.all_objects.select{|error| error.tableCont == self && error.apply == true}
    @checkErrors = Errores::CheckError.all_objects.select{|error| error.table == self && error.apply == true}
    
    return (!(@foreignErrors.empty?) || !(@checkErrors.empty?))
  end
  
  def getRegistries
    registries = self.registries
    
    if (!@checkErrors.empty?)
      for i in 0..@checkErrors.length-1
        @checkErrors[i].registriesCk.each do |regCk|
          registries.delete(regCk)
        end
      end
    end
    
    if (!@foreignErrors.empty?)
      for i in 0..@foreignErrors.length-1
        @foreignErrors[i].registriesFk.each do |regFk|
          registries.delete(regFk)
        end
      end
    end
  
    return registries
  end
  
  def getNewsFk
    newsFk = Array.new
    if (!@foreignErrors.empty?)
      for i in 0..@foreignErrors.length-1
        if (@foreignErrors[i].fk == nil)
          fkError = @foreignErrors[i]
          name = "NEW_FK_" + @@id.to_s
          fk = Correct::Fk.new(:nameFk => name)
          @@id.next
          
          columnName = Array.new
          fkError.fkColumns.each do |column|
            columnName << column.columnName
          end
          fk.columnName = columnName
          
          fk.references = fkError.tableRef
          
          fk.columnReference = fkError.tableRef.columnsPk.columnName
          
          fk.status = "ENABLED"
          
          newsFk << fk
        end
      end
    end
    
    return newsFk
  end
end