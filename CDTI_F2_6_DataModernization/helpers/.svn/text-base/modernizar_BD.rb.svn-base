class Counter
  @@id = -1
  def next()
    aux = @@id.next
    @@id = aux
    return aux
  end
end

decorator DML_DDL::DDLDefinition do
  def getErrors
    #DML_DDL::Ck.all_objects.each do |dml_ddl|
    #  puts 'CK: ' + dml_ddl.nameCk
    #  puts "PERCENT CK: #{dml_ddl.getPorcent}"
    #end
    
    #DML_DDL::Fk.all_objects.each do |dml_ddl|
    #  puts 'FK: ' + dml_ddl.nameFk
    #  puts "PERCENT FK: #{dml_ddl.getPorcent}"
    #end
    
    #DML_DDL::Pk.all_objects.each do |dml_ddl|
    #  puts 'PK: ' + dml_ddl.namePk
    #  puts "PERCENT PK: #{dml_ddl.getPorcent}"
    #end
    
    @cks = DML_DDL::Ck.all_objects.select{|dml_ddl| dml_ddl.status == "DISABLED" && dml_ddl.getPorcent > 70}
    @fks = DML_DDL::Fk.all_objects.select{|dml_ddl| dml_ddl.status == "DISABLED" && dml_ddl.getPorcent > 70}
    @pks = DML_DDL::Pk.all_objects.select{|dml_ddl| dml_ddl.getPorcent > 70}
  end
  
  def getCks
    return @cks
  end
  
  def getFks
    return @fks
  end
  
  def getPks
    return @pks
  end  
end
  
decorator DML_DDL::Ck do
  def getTable
    # Devolvemos la tabla asociada a una Ck
    table = DML_DDL::Table.all_objects.find{|dml_ddl| dml_ddl.checks.include?(self)}
    return table
  end
  
  def getPorcent
  
    puts ""
    puts "******************************"  
    puts "CK => #{self.nameCk}"
  
    registries = self.getTable.registries # Obtenemos los registries del ECORE de entrada. 
    
    columns = Array.new # Array para almacenar las columnas afectadas por la Ck.
    self.valuesCk.each do |value|
      columns << value.columnName.strip if (!columns.include?(value.columnName.strip))
    end
    
    #puts "TABLE : #{self.getTable.tableName}, #{columns.length}"
    
    valuesColumn = Hash.new
    total = 0
    # Recorremos todos los registry de una tabla para obtener todos sus registriesValues.
    # Para cada uno de los registryValues, accedemos a su value para comprobar que la tabla a la que 
    # hace referencia el value es la tabla de la CK. En acso afirmativo la introducimos en un Hash con key
    # el nombre de la columna, para comprobar a continuación si hace cierta la CK.

    for i in 0..columns.length-1
      values = Array.new # Array para almacenar los Values.
      registries.each do |r|
        registryValues = r.registryValues # Obtenemos los registryValues de un registry en concreto.
        registryValues.each do |rv|
          #puts "--VALUE : #{rv.value}"
          if (rv.column.columnName.strip == columns[i].strip)
            values << rv.value
          end
        end
      end
      # Obtenemos el numero de valores (registros) que tiene. Debería ser el mismo para cualquier
      # columna, ya que pertenecen a la misma tabla      
      total = values.length
      valuesColumn[columns[i]] = values
    end
    
    #puts ">>>> COLUMNS = "
    #columns.each do |col| puts col end

    #puts ">>>> VALUESCOLUMNS = "
    #for i in 0..columns.length-1
    #  valuesColumn[columns[i]].each do |valcol| puts "valuesC[#{columns[i]}] = #{valcol}" end
    #end
    
    @notVerifiedRegistries = Array.new
    aciertos = 0
    for i in 0..total-1
    
      regVerificaCK = true
      #Verificar si registro cumple la CK
      resultExpReg = Array.new
      logOperators = Array.new
      
      self.valuesCk.each do |val|
        logOperators << val.logConjuntion if (val.logConjuntion != nil)
        
        aux = false
        val.value.each do |value|
          #puts "valuesColumn[#{val.columnName}][#{i}]<#{valuesColumn[val.columnName][i]}> #{val.comparator}  v<#{value}>"
              
          if ((val.comparator.eql?("=")) && (valuesColumn[val.columnName.strip][i].strip == value.gsub(/'/, '').strip))
            aux = true
            break
          end
          if ((val.comparator.eql?("<>")) && (!(valuesColumn[val.columnName.strip][i].strip == value.gsub(/'/, '').strip)))
            aux = true
            break
          end
          if ((val.comparator.eql?("<")) && (valuesColumn[val.columnName.strip][i].strip < value.gsub(/'/, '').strip))
            aux = true
            break
          end
          if ((val.comparator.eql?(">")) && (valuesColumn[val.columnName.strip][i].strip > value.gsub(/'/, '').strip))
            aux = true
            break
          end
          if ((val.comparator.eql?("<=")) && (valuesColumn[val.columnName.strip][i].strip <= value.gsub(/'/, '').strip))
            aux = true
            break
          end
          if ((val.comparator.eql?(">=")) && (valuesColumn[val.columnName.strip][i].strip >= value.gsub(/'/, '').strip))
            aux = true
            break
          end
        end
        #puts "AUX: #{aux}"
        resultExpReg <<  aux
      end 
      
      #puts "--- Registro i=#{i}"
      #for j in 0..resultExpReg.length-1
      #  puts "< #{resultExpReg[j]} >"
      #end
      
          
      # Para el registro se recorren los valores booleanes obtenidos al verificar cada parte de la CK y se aplica el operador l—gico correspondiente
      log = ""
      for i in 0..resultExpReg.length-1        
        if (i == 0 ) 
          regVerificaCK = resultExpReg[i]
        else
          if (log == "AND")
            regVerificaCK = regVerificaCK && resultExpReg[i]
          else
            if (log == "OR")
              regVerificaCK = regVerificaCK || resultExpReg[i]
            end
          end
        end
        log = logOperators[i]
      end     
      if (regVerificaCK) 
        aciertos = aciertos + 1
      else
        @notVerifiedRegistries << registries[i]
      end
      
    end
       
    if (total == 0)
      # Este caso se daría cuando la tabla que contiene la CK no presenta nigún
      # registro, pero aún así la Ck esta desactivada, por lo que para que no 
      # crease un error de Ck, debemos devolver un porcentaje mayor o igual al
      # porcentaje de corte, es decir, mayor o igual a 70. Devolveremos 100
      # para así no tener ninguna duda. 
      porcent = 100
    else
      porcent = (100*aciertos).div(total)
    end
    puts "PERCENT CK: #{porcent}"
    @notVerifiedRegistries.each do |registry|
      registry.registryValues.each do |value|
        puts "#{value.column.columnName} = #{value.value}"
      end
      puts "-------------------------------"
    end
    return porcent
 
  end
  
  def getRegistries  
    return @notVerifiedRegistries
  end
end

decorator DML_DDL::Fk do
  def getTable
    # Devolvemos la tabla asociada a una Fk
    DML_DDL::Table.all_objects.find{|dml_ddl| dml_ddl.columnsFk.include?(self)}
  end
  
  def getPorcent
  
    puts "FK => #{self.nameFk}"
  
    table_Fk = self.getTable # Obtenemos la tabla que tiene la Fk desactivada.
    table_Pk = self.references # Obtenemos la tabla a la que referencia la Fk.
    
    values_fk = Array.new # Array para almacenar los valores de cada una de las columnas que forman la Fk.
    values_pk = Array.new # Array para almacenar los valores de cada una de las columnas que forman la Pk.

    # Cogemos todos los valores de las columnas que forman la Fk
    registries = table_Fk.registries # Obtenemos los registries de la tabla de la Fk.
        
    # Recorremos todos los registry de una tabla para obtener todos sus registriesValues.
    # Para cada uno de los registryValues, y para cada una de las columnas que forman la Fk
    # comprobamos que es la misma columna y obtenemos su valor en caso afirmativo.
    self.columnName.each do |col|
      values = Array.new # Array para almacenar los Values.
      registries.each do |r|
        registryValues = r.registryValues # Obtenemos los registryValues de un registry en concreto.
        registryValues.each do |rv|
          if (rv.column.columnName.strip == col.strip) # Comprobamos que es el valor de la columna de la Fk.
            values << rv.value
          end
        end
      end
      values_fk << values # Almacenamos los valores de una columna.
    end
    
    # Cogemos todos los valores de las columnas que forman la Pk
    registries = table_Pk.registries # Obtenemos los registries de la tabla de la Fk.
    
    # Recorremos todos los registry de una tabla para obtener todos sus registriesValues.
    # Para cada uno de los registryValues, y para cada una de las columnas que forman la Pk
    # comprobamos que es la misma columna y obtenemos su valor en caso afirmativo.        
    self.columnReference.each do |col|
      values = Array.new # Array para almacenar los Values.
      registries.each do |r|
        registryValues = r.registryValues # Obtenemos los registryValues de un registry en concreto.
        registryValues.each do |rv|
          if (rv.column.columnName.strip == col.strip) # Comprobamos que es el valor de la columna de la Pk.
            values << rv.value
          end
        end
      end
      values_pk << values # Almacenamos los valores de una columna.
    end
    
    # A continuación recorremos los dos arrays con los valores de las corresdondientes columnas de la Fk y la Pk,
    # para una a una, comprobar todos sus valores. Es decir, primero comprobamos que la primera columna que
    # forma la Fk tiene unos valores que se corresponden con los valores de la primera columna quie forma la Pk, así
    # para todas las columnas que forman ambas constraints. 
    aciertos = 0    
    for i in 0..values_fk.length-1
      v_fk = values_fk[i]
      v_pk = values_pk[i]
      
      for j in 0..v_fk.length-1
        existe = 0
        for k in 0..v_pk.length-1
          if (v_fk[j].eql?(v_pk[k]))
            existe = 1
            break
          end
        end
        if (existe == 1)
          aciertos += 1
        end
      end
    end
    
    # El porcentaje que devolvemos es el porcentaje de acierto, que será el que se almacene en la tabla
    # ERR:ForeignError. Y en la regla indicamos que si el porcentaje de acierto es mayor del 70% no se propone
    # para ser activada la FK, es decir, no se introduce en el nuevo metamodelo.
    if (values_fk[0].length == 0)
      # Este caso se daría cuando la tabla que contiene la FK no presenta nigún
      # registro, pero aún así la Fk esta desactivada, por lo que para que no 
      # crease un error de Fk, debemos devolver un porcentaje mayor o igual al
      # porcentaje de corte, es decir, mayor o igual a 70. Devolveremos 100
      # para así no tener ninguna duda. 
      porcent = 100
    else
      porcent = (aciertos*100).div(values_fk[0].length)
    end
    
    puts "PERCENT FK: #{porcent}"
    
    return porcent
  end
  
  def getRegistries
    columnsFk = self.columnName
    columnsPk = self.references.columnsPk.columnName

    registriesTableCont = self.getTable.registries
    registriesTableRef = self.references.registries
    
    registries = Array.new
    
    for i in 0..columnsFk.length-1
      registriesTableCont.each do |registryCont|
        registryValuesCont = registryCont.registryValues
        registryValuesCont.each do |valueCont|
          if (valueCont.column.columnName.strip == columnsFk[i].strip)
            aux = false
            registriesTableRef.each do |registryRef|
              registryValuesRef = registryRef.registryValues
              registryValuesRef.each do |valueRef|
                if ((columnsPk[i].strip == valueRef.column.columnName.strip) && (valueCont.value == valueRef.value))
                  aux = true
                  break
                end
              end
              if (aux)
                break
              end
            end
            
            if (!aux)
              registries << registryCont
              break
            end
          end
        end
      end
    end

    return registries
  end
end

decorator DML_DDL::Pk do
  def getTable
    DML_DDL::Table.all_objects.find{|dml_ddl| dml_ddl.columnsPk == self}
  end
  
  def getPorcent
    table_Pk = self.getTable
    tables = DML_DDL::Table.all_objects.reject{|dml_ddl| dml_ddl == table_Pk}
    
    # Nos quedamos con aquellas tablas que no tengan ninguna Fk hacia la tabla de la Pk.
    toDelete = Array.new
    tables.each do |table|
      table.columnsFk.each do |fk|
        if (fk.references == table_Pk)
          toDelete << table
        end
      end
    end
    toDelete.each do |table|
      tables.delete(table)
    end
    
    # De todas las columnas de una tabla nos quedamos con aquellas que no son FK ENABLED.
    tablesColumns = Array.new
    tables.each do |table|
      columns = table.columns
      table.columns.each do |column|
        table.columnsFk.each do |fk|
          if ( (fk.status == "ENABLED") && (fk.columnName.include?(column.columnName.strip)) )
            columns.delete(column)
          end
        end
      end
      tablesColumns << columns
    end
    
    columns_Pk = self.columnName
    type_Pk = Array.new
    values_Pk = Array.new
    
    # Obtenemos los tipos de las columnas que forman la Pk.
    table_Pk.columns.each do |tableColumn|
      columns_Pk.each do |col|
        if (col == tableColumn.columnName.strip)
          type_Pk << tableColumn.columnType
        end
      end
    end
    
    # Obtenemos los valores de las columnas que forman la Pk.
    columns_Pk.each do |col|
      values = Array.new # Array para almacenar los Values.
      table_Pk.registries.each do |r|
        registryValues = r.registryValues # Obtenemos los registryValues de un registry en concreto.
        registryValues.each do |rv|
          if (rv.column.columnName.strip == col.strip) # Comprobamos que es el valor de la columna.
            values << rv.value
          end
        end
      end
      values_Pk << values
    end
    
      
    # Calculamos el nuero de aciertos para cada una de las tablas que hay en la BB.DD
    # Para cada tabla miramos si cada una de las columnas que forman la Pk tienen alguna correspondencia
    # en nombre y tipo, con alguna de sus columnas.
    # En caso afirmativo, calculamos el número de aciertos.
    # 
    #  Una vez que ya tenemos los aciertos de todas las columnas de una tabla para una columna de la Pk,
    #  nos quedaremos con aquella columna que tenga un mayor número de aciertos.
    #  
    #  Cuando tenemos todas las columnas de la Fk que se "corresponden" con las de la Pk, nos quedamos con
    #  aquella tabla de la BB.DD que presente un mayor % de aciertos.
    #  
    #  Almacenaremos en una variables globales al Decorator la tabla y las columnas de la tabla que "supuestamente"
    #  formaran la Fk de la Pk que quiero.
    best_table_id = -1
    best_porcent = 0
    best_table_columns = Array.new
    
    for i in 0..tables.length-1
      table = tables[i]
      columns = tablesColumns[i]
      
      # Array para almacenar la columna con mejor acierto
      best_column_Pk = Array.new
      # Entero para almacenar el % de aciertos para esa columna
      best_hits_Pk = Array.new
      
      for j in 0..columns_Pk.length-1
        column_Pk = columns_Pk[j]
        
        best_hits = -1
        best_column_id = -1
        total = 0
        for k in 0..columns.length-1
          aciertos = 0
          if (((columns[k].columnName.strip.include?(column_Pk.strip)) || (column_Pk.strip.include?(columns[k].columnName.strip))) && (columns[k].columnType == type_Pk[j]))
            
            values = Array.new
            # Obtenemos el número total de valores que hay en tabla que quiero comprobar
            total = table.registries.length
            
            table.registries.each do |r|
              registryValues = r.registryValues # Obtenemos los registryValues de un registry en concreto.
              
              registryValues.each do |rv|
                if (rv.column.columnName.strip == columns[k].columnName.strip) # Comprobamos que es el valor de la columna.
                  values << rv.value
                end
              end
            end
            
            values.each do |value|
              if (values_Pk[j].include?(value))
                aciertos += 1
              end
            end
            
            if (best_hits <= aciertos)
              best_hits = aciertos
              best_column_id = k
            end
          end          
        end
        
        # En este punto tendré la columna con más número de aciertos para una columna de la Pk
        # En best_column_id tendre el index para obtener la columna de columns
        # y en best_hits el numero de aciertos para esa columna

        # Comprobamos que hay algun acierto
        if (best_hits >= 0)
          if (total == 0)
            porcent_column = 0
          else
            porcent_column = (best_hits*100).div(total)
          end
          best_column_Pk << columns[best_column_id]
          best_hits_Pk << porcent_column
        end
      end
      
      # Calculamos el % total de esta tabla
      porcent = 0
      if (best_column_Pk.length == columns_Pk.length)
        best_hits_Pk.each do |hits|
          porcent += hits
        end
        
        porcent = porcent.div(columns_Pk.length)
      end
      
      # Nos quedamos con la tabla de mayor % 
      if (best_porcent < porcent)
        best_porcent = porcent 
        best_table_id = i
        
        best_table_columns.clear
        best_column_Pk.each do |col|
          best_table_columns << col
        end
      end
    end
    
    
    if (best_table_id == -1)
      return 0
    else
      @tableRef = tables[best_table_id]
      @columnsRef = best_table_columns
      return best_porcent
    end
  end
  
  # Definición para devolver la tabla de la Fk
  def getTableRef
    return @tableRef
  end
  
  # Definición para devolver las columnas de la tabla de la Fk
  def getColumnsRef
    return @columnsRef
  end
  
  def getRegistries
    columnsFk = Array.new
    @columnsRef.each do |column|
      columnsFk << column.columnName.strip
    end
    columnsPk = self.getTable.columnsPk.columnName.strip

    registriesTableCont = @tableRef.registries
    registriesTableRef = self.getTable.registries
    
    registries = Array.new
    
    for i in 0..columnsFk.length-1
      registriesTableCont.each do |registryCont|
        registryValuesCont = registryCont.registryValues
        registryValuesCont.each do |valueCont|
          if (valueCont.column.columnName.strip == columnsFk[i].strip)
            aux = false
            registriesTableRef.each do |registryRef|
              registryValuesRef = registryRef.registryValues
              registryValuesRef.each do |valueRef|
                if ((columnsPk[i].strip == valueRef.column.columnName.strip) && (valueCont.value == valueRef.value))
                  aux = true
                  break
                end
              end
              if (aux)
                break
              end
            end
            
            if (!aux)
              registries << registryCont
              break
            end
          end
        end
      end
    end

    return registries
  end
end