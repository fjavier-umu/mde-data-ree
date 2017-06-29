decorator NF1::Table do  
  def functionalDependencyMinimalCover
    # Transformamos toda dependencia funcional del conjunto original de forma que sólo tenga una columna en el dependiente
    functionalDependencies=[]
    self.functionalDependencies.each do |fd|
      fd.dependant.each do |c|
        # Descartamos dependencias funcionales repetidas
        if !functionalDependencies.any?{|fd2| (fd2.determinant.all?{|c1| fd.determinant.include?(c1)} && fd.determinant.all?{|c1| fd2.determinant.include?(c1)}) && fd2.dependant.include?(c)}
          functionalDependencies+=[NF1::FunctionalDependency.new do |fd1|
            fd1.determinant=fd.determinant
            fd1.dependant=c
          end]
        end
      end
    end
    
    # Eliminamos columnas extrañas
    newFunctionalDependencies=[]
    functionalDependencies.each do |fd|
      setL=fd.determinant
      fd.determinant.each do |c|
        # Determinamos el cierre del descriptor fd.determinant-c sobre functionalDependencies
        attributesSet=fd.determinant-[c]
        attributesSetClosure=attributesSet       
        oldAttributesSetClosure=[]
        while attributesSetClosure!=oldAttributesSetClosure do
          oldAttributesSetClosure=attributesSetClosure
          functionalDependencies.each do |fd1|
            if fd1.determinant.all?{|c1| attributesSetClosure.include?(c1)} && fd1.dependant.any?{|c2| !attributesSetClosure.include?(c2)}
              attributesSetClosure+=fd1.dependant
            end
          end          
        end
        if fd.dependant.all?{|c1| attributesSetClosure.include?(c1)}
          setL-=[c]
        end
      end
      # Descartamos dependencias funcionales repetidas
      if !newFunctionalDependencies.any?{|fd1| (fd1.determinant.all?{|c| setL.include?(c)} && setL.all?{|c1| fd1.determinant.include?(c1)}) && (fd1.dependant.all?{|c| fd.dependant.include?(c)} && fd.dependant.all?{|c1| fd1.dependant.include?(c1)})}
        newFunctionalDependencies+=[NF1::FunctionalDependency.new do |fd1|
          fd1.determinant=setL
          fd1.dependant=fd.dependant
        end]
      end      
    end
    
    # Eliminamos dependencias funcionales redundantes
    setH=newFunctionalDependencies
    newFunctionalDependencies.each do |fd|
      setG=setH-[fd]
      # Determinamos el cierre del descriptor fd.determinant sobre setG
      attributesSet=fd.determinant
      attributesSetClosure=attributesSet       
      oldAttributesSetClosure=[]
      while attributesSetClosure!=oldAttributesSetClosure do
        oldAttributesSetClosure=attributesSetClosure
        setG.each do |fd1|
          if fd1.determinant.all?{|c1| attributesSetClosure.include?(c1)} && fd1.dependant.any?{|c2| !attributesSetClosure.include?(c2)}
            attributesSetClosure+=fd1.dependant
          end
        end          
      end
      if fd.dependant.all?{|c| attributesSetClosure.include?(c)}
        setH=setG
      end
    end
    # Recubrimiento minimal
    functionalDependencyMinimalCover=setH
  end
end

phase 'fase1' do
  top_rule 'database2database' do
    from NF1::Database
    to   NORM::Database
    mapping do |source, target| 
        target.name=source.name
        target.tables=source.tables
    end
  end
  
  rule 'table2tables' do
    from NF1::Table
    to   many(NORM::Table)
    mapping do |source, set|
        # Determinamos el recubrimiento minimal
        fdmc=source.functionalDependencyMinimalCover
        # Agrupamos las dependencias funcionales con el mismo determinante
        hash=Hash.new
        fdmc.each do |fd|
          if hash[fd.determinant]==nil
            hash[fd.determinant]=[]            
          end
          hash[fd.determinant]+=[fd]
        end
        # Creamos una tabla para cada grupo con las columnas y las dependencias funcionales del grupo 
        index=1
        presentColumnsNames=[]
        existsOriginalPrimaryKey=false
        originalPrimaryKey=source.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}
        hash.each_key{|key|
          set.values=NORM::Table.new do |t|
            t.name=source.name+"_"+index.to_s
            # Creamos las columnas
            key.each do |c|
              t.columns=NORM::Column.new do |c1|
                c1.name=c.name
              end
            end
            hash[key].each do |fd|
              fd.dependant.each do |c|
                if !t.columns.any?{|c1| c1.name==c.name}
                  t.columns=NORM::Column.new do |c2|
                    c2.name=c.name
                  end
                end
              end
            end
            # Añadimos todas las columnas de la tabla a la lista de columnas presentes en alguna tabla
            t.columns.each do |c|
              if !presentColumnsNames.any?{|n| n==c.name}
                presentColumnsNames+=[c.name]
              end
            end
            # Creamos las dependencias funcionales
            hash[key].each do |fd|
              t.functionalDependencies=fd
            end
            # Creamos la clave primaria
            t.restrictions=NORM::PrimaryKey.new do |pk|
              pk.name=t.name+"_PK"
              key.each do |c|
                pk.restrictionsColumns=NORM::RestrictionColumn.new do |rc|
                  rc.column=t.columns.find{|c1| c1.name==c.name}
                  rc.name=pk.name+"_"+rc.column.name
                end
              end
              # Comprobamos si la clave primaria de la tabla original ya existe en alguna tabla
              if !existsOriginalPrimaryKey
                # Si todavía no existe, comprobamos si la clave primaria que acabamos de crear esta formada por las mismas columnas que la clave primaria de la tabla original
                originalPrimaryKeyColumnsNames=originalPrimaryKey.restrictionsColumns.map{|rc| rc.column}.flatten.map{|c| c.name}
                newPrimaryKeyColumnsNames=pk.restrictionsColumns.map{|rc| rc.column}.flatten.map{|c| c.name}
                if originalPrimaryKeyColumnsNames.all?{|n| newPrimaryKeyColumnsNames.include?(n)} && newPrimaryKeyColumnsNames.all?{|n| originalPrimaryKeyColumnsNames.include?(n)}
                  existsOriginalPrimaryKey=true
                  pk.name=originalPrimaryKey.name
                  pk.restrictionsColumns.each do |rc|
                    rc.name=pk.name+"_"+rc.column.name
                  end
                  t.name=source.name
                  index-=1
                end
              end
            end
            # Comprobamos si alguna clave foránea original contenía las columnas que contiene la nueva tabla
            originalForeignKeys=source.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}           
            originalForeignKeys.each do |fk|
              if fk.restrictionsColumns.map{|rc| rc.column}.flatten.all?{|c| t.columns.map{|c1| c1.name}.flatten.include?(c.name)}
                t.restrictions=fk
              end
            end            
          end
          index+=1
        }
        # Si existen columnas que no aparecen en ningún determinante ni dependiente creamos una tabla con ellas sin dependencias funcionales asociadas
        nonPresentColumns=source.columns.select{|c| !presentColumnsNames.include?(c.name)}
        if !nonPresentColumns.empty?
          set.values=NORM::Table.new do |t|
            t.name=source.name+"_"+index.to_s
            index+=1
            nonPresentColumns.each do |c|
              t.columns=NORM::Column.new do |c1|
                c1.name=c.name
              end
            end
            t.restrictions=NORM::PrimaryKey.new do |pk|
              pk.name=t.name+"_PK"
              t.columns.each do |c|
                pk.restrictionsColumns=NORM::RestrictionColumn.new do |rc|
                  rc.column=c
                  rc.name=pk.name+"_"+rc.column.name
                end
              end
              if !existsOriginalPrimaryKey
                originalPrimaryKeyColumnsNames=originalPrimaryKey.restrictionsColumns.map{|rc| rc.column}.flatten.map{|c| c.name}
                newPrimaryKeyColumnsNames=pk.restrictionsColumns.map{|rc| rc.column}.flatten.map{|c| c.name}
                if originalPrimaryKeyColumnsNames.all?{|n| newPrimaryKeyColumnsNames.include?(n)} && newPrimaryKeyColumnsNames.all?{|n| originalPrimaryKeyColumnsNames.include?(n)}
                  existsOriginalPrimaryKey=true
                  t.name=source.name
                  pk.name=originalPrimaryKey.name
                  pk.restrictionsColumns.each do |rc|
                    rc.name=pk.name+"_"+rc.column.name
                  end                  
                end
              end
              # Comprobamos si alguna clave foránea original contenía las columnas que contiene la nueva tabla
              originalForeignKeys=source.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}           
              originalForeignKeys.each do |fk|
                if fk.restrictionsColumns.map{|rc| rc.column}.flatten.all?{|c| t.columns.map{|c1| c1.name}.flatten.include?(c.name)}
                  t.restrictions=fk
                end
              end
            end
          end
        end
        # Si ninguna de la nuevas tablas contiene la clave primaria de la tabla original creamos una nueva tabla con las columnas que forman dicha clave
        if !existsOriginalPrimaryKey
          set.values=NORM::Table.new do |t|
            t.name=source.name
            originalPrimaryKey.restrictionsColumns.map{|rc| rc.column}.flatten.each do |c|
              t.columns=NORM::Column.new do |c1|
                c1.name=c.name
              end
            end
            t.restrictions=NORM::PrimaryKey.new do |pk|
              pk.name=originalPrimaryKey.name
              t.columns.each do |c|
                pk.restrictionsColumns=NORM::RestrictionColumn.new do |rc|
                  rc.column=c
                  rc.name=pk.name+"_"+rc.column.name
                end
              end
            end
            # Comprobamos si alguna clave foránea original contenía las columnas que contiene la nueva tabla
            originalForeignKeys=source.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}           
            originalForeignKeys.each do |fk|
              if fk.restrictionsColumns.map{|rc| rc.column}.flatten.all?{|c| t.columns.map{|c1| c1.name}.flatten.include?(c.name)}
                t.restrictions=fk
              end
            end
          end
        end
        # Establecemos las claves foráneas entre las nuevas tablas creadas
        i=0
        while i<set.size do
          j=i+1
          while j<set.size do
            # Determinamos las columnas presentes en ambas tablas
            table1=set[i]
            table2=set[j]
            commonColumnsNames=[]
            table1.columns.each do |c|
              if table2.columns.map{|c1| c1.name}.flatten.include?(c.name)
                commonColumnsNames+=[c.name]
              end
            end
            if commonColumnsNames.size!=0

              primaryKey1=table1.restrictions.find{|r| r.kind_of?(NORM::PrimaryKey)}
              primaryKey2=table2.restrictions.find{|r| r.kind_of?(NORM::PrimaryKey)}
              primaryKeyColumns1=primaryKey1.restrictionsColumns.map{|rc| rc.column}.flatten
              primaryKeyColumns2=primaryKey2.restrictionsColumns.map{|rc| rc.column}.flatten            
              # Comprobamos si las claves primarias de las dos tablas están compuestas por columnas
              # presentes en ambas tablas
              primaryKeyColumnsAllCommonColumns1=primaryKeyColumns1.all?{|c| commonColumnsNames.include?(c.name)}
              primaryKeyColumnsAllCommonColumns2=primaryKeyColumns2.all?{|c| commonColumnsNames.include?(c.name)}
              # Si la clave primaria de la primera tabla está compuesta totalmente de columnas 
              # comunes, creamos una nueva clave foránea que apunte desde la segunda tabla a la 
              # primera
              if(primaryKeyColumnsAllCommonColumns1)
                table2.restrictions=NORM::ForeignKey.new do |fk|
                  fk.name=table2.name+"_"+table1.name+"_FK"
                  fk.primaryKey=primaryKey1
                  primaryKeyColumns1.each do |c|
                    fk.restrictionsColumns=NORM::RestrictionColumn.new do |rc|
                      rc.column=table2.columns.find{|c1| c1.name==c.name}
                      rc.name=fk.name+"_"+rc.column.name
                      rc.pkRestrictionColumn=primaryKey1.restrictionsColumns.find{|rc1| rc1.column.name==rc.column.name}
                    end
                  end
                end
              end
              # Si la clave primaria de la segunda tabla está compuesta totalmente de columnas 
              # comunes, creamos una nueva clave foránea que apunte desde la primera tabla a la 
              # segunda
              if(primaryKeyColumnsAllCommonColumns2)
                table1.restrictions=NORM::ForeignKey.new do |fk|
                  fk.name=table1.name+"_"+table2.name+"_FK"
                  fk.primaryKey=primaryKey2
                  primaryKeyColumns2.each do |c|
                    fk.restrictionsColumns=NORM::RestrictionColumn.new do |rc|
                      rc.column=table1.columns.find{|c1| c1.name==c.name}
                      rc.name=fk.name+"_"+rc.column.name
                      rc.pkRestrictionColumn=primaryKey2.restrictionsColumns.find{|rc1| rc1.column.name==rc.column.name}
                    end
                  end
                end
              end
            end
            j+=1
          end
          i+=1        
        end 
    end
  end
  
  rule 'functionalDependency2functionalDependency' do
    from NF1::FunctionalDependency
    to   NORM::FunctionalDependency
    mapping do |source, target| 
        source.determinant.each do |c|
          target.determinant=target.__container__.columns.find{|c1| c1.name==c.name}
        end     
        source.dependant.each do |c|
          target.dependant=target.__container__.columns.find{|c1| c1.name==c.name}
        end
    end
  end
  
  rule 'foreignKey2foreignKey' do
    from NF1::ForeignKey
    to   NORM::ForeignKey
    mapping do |source, target| 
        target.name=source.name
        target.restrictionsColumns=source.restrictionsColumns
    end
  end
  
  rule 'restrictionColumn2restrictionColumn' do
    from NF1::RestrictionColumn
    to   NORM::RestrictionColumn
    mapping do |source, target| 
        target.column=target.__container__.__container__.columns.find{|c| c.name==source.column.name}
        target.name=target.__container__.name+"_"+target.column.name
    end
  end  
end

phase 'fase2' do
  refinement_rule 'refineForeignKey' do
    from NF1::ForeignKey
    to NORM::ForeignKey
    mapping do |source, target|
        target.primaryKey=NORM::Table.all_objects.find{|t| t.name==source.primaryKey.__container__.name}.restrictions.find{|r| r.name==source.primaryKey.name}
        target.restrictionsColumns.each do |rc|
          originalReferencedRestrictionColumn=source.restrictionsColumns.find{|rc1| rc1.name==rc.name}.pkRestrictionColumn
          rc.pkRestrictionColumn=target.primaryKey.restrictionsColumns.find{|rc1| rc1.name==originalReferencedRestrictionColumn.name}
        end
    end
  end
end