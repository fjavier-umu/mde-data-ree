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
    @cks = DML_DDL::Ck.all_objects.select{|dml_ddl| dml_ddl.status == "DISABLED" && dml_ddl.getPorcent < 70}
    @fks = DML_DDL::Fk.all_objects.select{|dml_ddl| dml_ddl.status == "DISABLED" && dml_ddl.getPorcent < 70}
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
    registries = self.getTable.registries # Obtenemos los registries del ECORE de entrada. 
    
    columns = Array.new # Array para almacenar las columnas afectadas por la Ck.
    self.valuesCk.each do |value|
      columns << value.columnName if (!columns.include?(value.columnName))
    end
    
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
          if (rv.column.columnName == columns[i])
            values << rv.value
          end
        end
      end
      # Obtenemos el numero de valores (registros) que tiene. Debería ser el mismo para cualquier
      # columna, ya que pertenecen a la misma tabla      
      total = values.length
      valuesColumn[columns[i]] = values
    end
    
    
    # Obtenemos para cada conjunto de valores de cada una de las columnas que conforman la Ck sus valuesCk.
    # Comprobamos para cada value obtenido anteriormente válida la CK.
    # En caso afirmativo devolvemos true, sino devolvemos false. Nos quedamos tambien con la conjunción lógica
    # que presenta la Ck ("AND", "OR", "nil") para luego según los true y los false obtener el número de aciertos.
    # 
    # El número de aciertos se obtiene recorriendo los resultados de las comparaciónes (los true y los false)
    # y aplicándole los respectivos operadores lógicos, si el resultado es true, se suma uno a aciertos.
    # 
    # El porcentaje que devolvemos es el porcentaje de acierto, que será el que se almacene en la tabla
    # ERR:CheckError. Y en la regla indicamos que si el porcentaje de acierto es mayor del 70% no se propone
    # para ser activada la CK, es decir, no se introduce en el nuevo metamodelo.
    
    @logConj = Array.new
    result = Array.new
    for i in 0..total-1
      result[i] = Array.new
    end
    
    @valuesCK = Hash.new
    
    valuesColumn.each_key do |key|
      values = valuesColumn[key]
      r = Array.new
      ckValues = Array.new
      for i in 0..values.length-1
        check = 0
        self.valuesCk.each do |val|
          if (val.columnName.eql?(key))
            @logConj << val.logConjuntion if (val.logConjuntion != nil)
            aux = false
            val.value.each do |v|
              if ((val.comparator.eql?("=")) && (values[i] == v.gsub(/'/, '')))
                aux = true
                break
              end
              if ((val.comparator.eql?("<>")) && (!(values[i] == v.gsub(/'/, ''))))
                aux = true
                break
              end
              if ((val.comparator.eql?("<")) && (values[i] < v.gsub(/'/, '')))
                aux = true
                break
              end
              if ((val.comparator.eql?(">")) && (values[i] > v.gsub(/'/, '')))
                aux = true
                break
              end
              if ((val.comparator.eql?("<=")) && (values[i] <= v.gsub(/'/, '')))
                aux = true
                break
              end
              if ((val.comparator.eql?(">=")) && (values[i] >= v.gsub(/'/, '')))
                aux = true
                break
              end
            end
            r << aux
            if (!aux)
              ckValues << values[i]
            end
          end   
        end
      end
      @valuesCK[key] = ckValues
      for j in 0..total-1
        result[j] << r[j]
      end
    end
                
    aciertos = 0
    
    for i in 0..result.length-1
      log = @logConj[i]
      boolean = true
      for j in 0..result[i].length-1
        if (log == "AND")
          boolean = boolean && result[i][j]
        else
          if (log == "OR")
            if (j == 0)
              boolean = false
            end
            boolean = boolean || result[i][j]
          else
            if (log == nil)
              boolean = result[i][j]
            end
          end
        end
      end
     
      if (boolean)
        aciertos += 1
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
    return porcent
  end
  
  def getRegistries
    registriesCk= Array.new
    registries = self.getTable.registries
    
    registries.each do |r|
      results = Array.new
      registryValues = r.registryValues
      registryValues.each do |rv|
        @valuesCK.each_key do |key|
          if (rv.column.columnName == key)
            aux = false
            values = @valuesCK[key].uniq
            for i in 0..values.length-1 do
              if (values[i] != rv.value)
                aux = true
                break
              end
            end
            results << aux
          end
        end
      end
      
      if (@logConj[0] == "AND")
        boolean = true
      else
        boolean = false
      end
      
      j = 0
      while (j < results.length)
        a = j
        b = j + 1
        if (b >= results.length)
          b = a
        end
        log = @logConj[a]
        if (log == "AND")
          boolean = boolean && results[a] && results[b]
        else
          if (log == "OR")
            boolean = boolean || results[a] || results[b]
          end
        end
        j = j + 2
      end
        
      if (!boolean)
        registriesCk << r
      end
    end
    
    return registriesCk.uniq
  end
end

decorator DML_DDL::Fk do
  def getTable
    # Devolvemos la tabla asociada a una Fk
    DML_DDL::Table.all_objects.find{|dml_ddl| dml_ddl.columnsFk.include?(self)}
  end
  
  def getPorcent
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
          if (rv.column.columnName == col) # Comprobamos que es el valor de la columna de la Fk.
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
          if (rv.column.columnName == col) # Comprobamos que es el valor de la columna de la Pk.
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
          if (valueCont.column.columnName == columnsFk[i])
            aux = false
            registriesTableRef.each do |registryRef|
              registryValuesRef = registryRef.registryValues
              registryValuesRef.each do |valueRef|
                if ((columnsPk[i] == valueRef.column.columnName) && (valueCont.value == valueRef.value))
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
          if ( (fk.status == "ENABLED") && (fk.columnName.include?(column.columnName)) )
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
        if (col == tableColumn.columnName)
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
          if (rv.column.columnName == col) # Comprobamos que es el valor de la columna.
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
          if (((columns[k].columnName.include?(column_Pk)) || (column_Pk.include?(columns[k].columnName))) && (columns[k].columnType == type_Pk[j]))
            
            values = Array.new
            # Obtenemos el número total de valores que hay en tabla que quiero comprobar
            total = table.registries.length
            
            table.registries.each do |r|
              registryValues = r.registryValues # Obtenemos los registryValues de un registry en concreto.
              
              registryValues.each do |rv|
                if (rv.column.columnName == columns[k].columnName) # Comprobamos que es el valor de la columna.
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
      columnsFk << column.columnName
    end
    columnsPk = self.getTable.columnsPk.columnName

    registriesTableCont = @tableRef.registries
    registriesTableRef = self.getTable.registries
    
    registries = Array.new
    
    for i in 0..columnsFk.length-1
      registriesTableCont.each do |registryCont|
        registryValuesCont = registryCont.registryValues
        registryValuesCont.each do |valueCont|
          if (valueCont.column.columnName == columnsFk[i])
            aux = false
            registriesTableRef.each do |registryRef|
              registryValuesRef = registryRef.registryValues
              registryValuesRef.each do |valueRef|
                if ((columnsPk[i] == valueRef.column.columnName) && (valueCont.value == valueRef.value))
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