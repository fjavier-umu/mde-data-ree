decorator NF1::Database do
  def backtracking(tables)
    if isSolution(tables)
      $sol=true
      result=tables
    else
      candidates=searchCandidates(tables)
      i=0
      while i<candidates.size && !$sol do
        result=backtracking(candidates[i])
        i+=1
      end
    end
    result
  end
  
  def isSolution(tables)
    is3NF(tables)
  end
  
  def is3NF(tables)  
    if !is2NF(tables)
      false
    else
      tables.all?{|t|
        candidateKeys=t.restrictions.select{|r| r.kind_of?(NF1::CandidateKey)}
        candidateKeysColumns=candidateKeys.map{|r| r.restrictionsColumns}.flatten.map{|rc| rc.column}.flatten.uniq
        nonCandidateKeysColumns=t.columns-candidateKeysColumns
        nonCandidateKeysColumns.all?{|nckc| t.functionalDependencyMinimalCover.select{|fd| fd.dependant.include?(nckc)}.all?{|fd| candidateKeys.any?{|ck| ck.restrictionsColumns.map{|rc| rc.column}.flatten.all?{|c| fd.determinant.include?(c)} && fd.determinant.all?{|c| ck.restrictionsColumns.map{|rc| rc.column}.flatten.include?(c)}}}}
      }
    end
  end
  
  def is2NF(tables)
    if !is1NF(tables)
      false
    else
      tables.all?{|t|
        candidateKeys=t.restrictions.select{|r| r.kind_of?(NF1::CandidateKey)}
        candidateKeysColumns=candidateKeys.map{|r| r.restrictionsColumns}.flatten.map{|rc| rc.column}.flatten.uniq
        nonCandidateKeysColumns=t.columns-candidateKeysColumns
        fdsWithNckcDependant=t.functionalDependencyMinimalCover.select{|fd| nonCandidateKeysColumns.any?{|c| fd.dependant.include?(c)}}
        if fdsWithNckcDependant.empty?
          true
        else
          nonCandidateKeysColumns.all?{|nckc| t.functionalDependencyMinimalCover.select{|fd| fd.dependant.include?(nckc)}.any?{|fd| candidateKeys.any?{|ck| ck.restrictionsColumns.map{|rc| rc.column}.flatten.all?{|c| fd.determinant.include?(c)} && fd.determinant.all?{|c| ck.restrictionsColumns.map{|rc| rc.column}.flatten.include?(c)}}}}
        end
      }
    end
  end
  
  def is1NF(tables)
    tables.all?{|t| t.restrictions.any?{|r| r.kind_of?(NF1::PrimaryKey)}}
  end
  
  def searchCandidates(tables)
    # Buscamos la primera tabla que no esté en 3ª forma normal
    denormalizedTable=tables.find{|t|
      candidateKeys=t.restrictions.select{|r| r.kind_of?(NF1::CandidateKey)}
      candidateKeysColumns=candidateKeys.map{|r| r.restrictionsColumns}.flatten.map{|rc| rc.column}.flatten.uniq
      nonCandidateKeysColumns=t.columns-candidateKeysColumns
      !nonCandidateKeysColumns.all?{|nckc| t.functionalDependencyMinimalCover.select{|fd| fd.dependant.include?(nckc)}.all?{|fd| candidateKeys.any?{|ck| ck.restrictionsColumns.map{|rc| rc.column}.flatten.all?{|c| fd.determinant.include?(c)} && fd.determinant.all?{|c| ck.restrictionsColumns.map{|rc| rc.column}.flatten.include?(c)}}}}
    }
    # Buscamos las dependencias funcionales que no cumplen la 3ª forma normal
    candidateKeys=denormalizedTable.restrictions.select{|r| r.kind_of?(NF1::CandidateKey)}
    candidateKeysColumns=candidateKeys.map{|r| r.restrictionsColumns}.flatten.map{|rc| rc.column}.flatten.uniq
    nonCandidateKeysColumns=denormalizedTable.columns-candidateKeysColumns
    denormalizedFunctionalDependencies=[]
    fdmc=denormalizedTable.functionalDependencyMinimalCover
    nonCandidateKeysColumns.each do |nckc|
      denormalizedFunctionalDependencies+=fdmc.select{|fd| fd.dependant.include?(nckc) && !candidateKeys.any?{|ck| ck.restrictionsColumns.map{|rc| rc.column}.flatten.all?{|c| fd.determinant.include?(c)} && fd.determinant.all?{|c| ck.restrictionsColumns.map{|rc| rc.column}.flatten.include?(c)}}}
    end
    # Por cada una de dichas dependencias funcionales creamos un conjunto de tablas, cada uno
    # de los cuales estará formado por las tablas originales excepto la tabla desnormalizada, que
    # se descompone en dos nuevas tablas
    resultTablesSets=[]
    denormalizedFunctionalDependencies.each do |fd|
      tableSet=[]
      # Buscamos si además de fd hay otras dependencias funcionales que se puedan llevar a una
      # de las nuevas tablas
      functionalDependencyColumns=(fd.determinant+fd.dependant).uniq
      functionalDependenciesToExtract=fdmc.select{|fd1| fd1.determinant.all?{|c| functionalDependencyColumns.include?(c)} && fd1.dependant.all?{|c| functionalDependencyColumns.include?(c)}}
      # Obtenemos las dependencias funcionales que no van a extraerse
      notExtractedFunctionalDependencies=fdmc-functionalDependenciesToExtract
      # Obtenemos las columnas que van a extraerse
      extractedColumns=fd.dependant      
      # Comprobamos si se van a perder dependencias funcionales o claves foráneas al dividir la 
      # tabla original
      foreignKeys=denormalizedTable.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}
      if !notExtractedFunctionalDependencies.any?{|fd1| extractedColumns.any?{|c| fd1.determinant.include?(c) || fd1.dependant.include?(c)}} && foreignKeys.all?{|fk| fk.restrictionsColumns.map{|rc| rc.column}.flatten.all?{|c| fd.dependant.include?(c)} ||  !fk.restrictionsColumns.map{|rc| rc.column}.flatten.any?{|c| fd.dependant.include?(c)}}
        # Si existe una clave foránea cuyas columnas sean las del dependiente de la dependencia
        # funcional a extraer, llevamos las dependencias funcionales y las columnas a extraer a la
        # tabla referenciada
        existingForeignKey=foreignKeys.find{|fk| fk.restrictionsColumns.map{|rc| rc.column}.flatten.all?{|c| fd.determinant.include?(c)} && fd.determinant.all?{|c| fk.restrictionsColumns.map{|rc| rc.column}.flatten.include?(c)}}
        if existingForeignKey
          # Copiamos la tabla referenciada
          existingTable=existingForeignKey.primaryKey.__container__
          tableSet+=[NF1::Table.new do |t|
            t.name=existingTable.name
            # Copiamos las columnas existentes
            existingTable.columns.each do |c|
              t.columns=NF1::Column.new do |c1|
                c1.name=c.name
              end
            end
            # Añadimos las columnas pertenecientes al dependiente de la dependencia funcional
            fd.dependant.each do |c|
              if !t.columns.any?{|c1| c1.name==c.name}
                t.columns=NF1::Column.new do |c1|
                  c1.name=c.name
                end
              end
            end
            # Copiamos las dependencias funcionales existentes
            existingTable.functionalDependencies.each do |fd1|
              t.functionalDependencies=NF1::FunctionalDependency.new do |fd2|
                fd1.determinant.each do |c|
                  fd2.determinant=t.columns.find{|c1| c1.name==c.name}
                end
                fd1.dependant.each do |c|
                  fd2.dependant=t.columns.find{|c1| c1.name==c.name}
                end
              end
            end
            # Añadimos las dependencias funcionales extraídas de la tabla a descomponer
            functionalDependenciesToExtract.each do |fd1|
              t.functionalDependencies=NF1::FunctionalDependency.new do |fd2|
                fd1.determinant.each do |c|
                  fd2.determinant=t.columns.find{|c1| c1.name==c.name}
                end
                fd1.dependant.each do |c|
                  fd2.dependant=t.columns.find{|c1| c1.name==c.name}
                end
              end
            end
            # Copiamos la clave primaria existente
            existingPrimaryKey=existingTable.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}
            t.restrictions=NF1::PrimaryKey.new do |pk|
              pk.name=existingPrimaryKey.name
              existingPrimaryKey.restrictionsColumns.each do |rc|
                pk.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                  rc1.column=t.columns.find{|c| c.name==rc.column.name}
                  rc1.name=rc.name
                end
              end
            end
            # Copiamos las claves candidatas existentes
            existingCandidateKeys=existingTable.restrictions.select{|r| r.kind_of?(NF1::CandidateKey)}.reject{|r| r.kind_of?(NF1::PrimaryKey)}
            existingCandidateKeys.each do |ck|
              t.restrictions=NF1::CandidateKey.new do |ck1|
                ck1.name=ck.name
                ck.restrictionsColumns.each do |rc|
                  ck1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                    rc1.column=t.columns.find{|c| c.name==rc.column.name}
                    rc1.name=rc.name
                  end
                end
              end
            end            
            # Establecemos como claves candidatas cada determinante del resto de dependencias 
            # funcionales extraidas
            additionalExtractedFunctionalDependencies=functionalDependenciesToExtract-[fd]
            index=1
            additionalExtractedFunctionalDependencies.each do |fd1|
              # Si el determinanante es distinto al de la clave primaria
              if !fd1.determinant.all?{|c| fd.determinant.include?(c)} && !fd.determinant.all?{|c| fd1.determinant.include?(c)}
                t.restrictions=NF1::CandidateKey.new do |ck|
                  ck.name=t.name+"_CK_"+index.to_s
                  fd1.determinant.each do |c|
                    ck.restrictionsColumns=NF1::RestrictionColumn.new do |rc|
                      rc.column=t.columns.find{|c1| c1.name==c.name}
                      rc.name=ck.name+"_"+rc.column.name
                    end
                  end
                  index+=1
                end
              end
            end
            # Copiamos las claves foráneas existentes
            existingForeignKeys=existingTable.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}
            existingForeignKeys.each do |fk|
              t.restrictions=NF1::ForeignKey.new do |fk1|
                fk1.name=fk.name
                fk.restrictionsColumns.each do |rc|
                  fk1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                    rc1.column=t.columns.find{|c| c.name==rc.column.name}
                    rc1.name=rc.name
                  end
                end
              end
            end            
            # Establecemos como claves foráneas las claves foráneas de la tabla original formadas por
            # las columnas extraidas a esta tabla
            foreignKeys.each do |fk|
              # Comprobamos que la clave foránea no apuntaba a esta tabla
              originalForeignKeyColumnsNames=fk.restrictionsColumns.map{|rc| rc.column}.flatten.uniq.map{|c| c.name}.flatten
              primaryKeyColumnsNames=t.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}.restrictionsColumns.map{|rc| rc.column}.flatten.uniq.map{|c| c.name}.flatten
              if !originalForeignKeyColumnsNames.all?{|n| primaryKeyColumnsNames.include?(n)} && !primaryKeyColumnsNames.all?{|n| originalForeignKeyColumnsNames.include?(c)}
                if fk.restrictionsColumns.map{|rc| rc.column}.flatten.uniq.all?{|c| t.columns.map{|c1| c1.name}.flatten.include?(c.name)}
                  t.restrictions=NF1::ForeignKey.new do |fk1|
                    fk1.name=fk.name
                    fk.restrictionsColumns.each do |rc|
                      fk1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                        rc1.column=t.columns.find{|c| c.name==rc.column.name}
                        rc1.name=rc.name
                      end
                    end
                  end
                end
              end
            end            
          end]          
          # Creamos la segunda tabla
          tableSet+=[NF1::Table.new do |t|
            t.name=denormalizedTable.name
            # Esta tabla contiene las columnas de la tabla original excepto las columnas presentes
            # en el dependiente de la dependencia funcional extraida
            nonExtractedColumns=denormalizedTable.columns-extractedColumns
            nonExtractedColumns.each do |c|
              t.columns=NF1::Column.new do |c1|
                c1.name=c.name
              end
            end
            # Esta tabla contiene las dependencias funcionales de la tabla original que no se 
            # han extraido
            notExtractedFunctionalDependencies.each do |fd1|
              t.functionalDependencies=NF1::FunctionalDependency.new do |fd2|
                fd1.determinant.each do |c|
                  fd2.determinant=t.columns.find{|c1| c1.name==c.name}
                end
                fd1.dependant.each do |c|
                  fd2.dependant=t.columns.find{|c1| c1.name==c.name}
                end
              end
            end                
            # Establecemos como clave primaria de la tabla la clave primaria de la tabla original
            originalPrimaryKey=denormalizedTable.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}
            t.restrictions=NF1::PrimaryKey.new do |pk|
              pk.name=originalPrimaryKey.name
              originalPrimaryKey.restrictionsColumns.each do |rc|
                pk.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                  rc1.column=t.columns.find{|c| c.name==rc.column.name}
                  rc1.name=rc.name
                end
              end
            end
            # Establecemos como claves candidatas de la tabla las claves candidatas de la tabla 
            # original
            originalCandidateKeys=denormalizedTable.restrictions.select{|r| r.kind_of?(NF1::CandidateKey)}.reject{|ck| ck.kind_of?(NF1::PrimaryKey)}
            originalCandidateKeys.each do |ck|
              t.restrictions=NF1::CandidateKey.new do |ck1|
                ck1.name=ck.name
                ck.restrictionsColumns.each do |rc|
                  ck1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                    rc1.column=t.columns.find{|c| c.name==rc.column.name}
                    rc1.name=rc.name
                  end
                end
              end
            end            
            # Establecemos como claves foráneas las claves foráneas de la tabla original formadas por
            # las columnas mantenidas en la tabla
            foreignKeys.each do |fk|
              if fk.restrictionsColumns.map{|rc| rc.column}.flatten.uniq.all?{|c| t.columns.map{|c1| c1.name}.flatten.include?(c.name)}
                t.restrictions=NF1::ForeignKey.new do |fk1|
                  fk1.name=fk.name
                  fk.restrictionsColumns.each do |rc|
                    fk1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                      rc1.column=t.columns.find{|c| c.name==rc.column.name}
                      rc1.name=rc.name
                    end
                  end
                end
              end
            end
          end]          
          # Copiamos todas la tablas originales excepto la que acabamos de descomponer y la existente
          remainingTables=tables.reject{|t| t==denormalizedTable || t==existingTable}
          # Creamos las tablas
          remainingTables.each do |t|
            tableSet+=[NF1::Table.new do |t1|
              t1.name=t.name
              # Creamos sus columnas
              t.columns.each do |c|
                t1.columns=NF1::Column.new do |c1|
                  c1.name=c.name
                end
              end
              # Creamos sus dependencias funcionales
              t.functionalDependencies.each do |fd|
                t1.functionalDependencies=NF1::FunctionalDependency.new do |fd1|
                  fd.determinant.each do |c|
                    fd1.determinant=t1.columns.find{|c1| c1.name==c.name}
                  end
                  fd.dependant.each do |c|
                    fd1.dependant=t1.columns.find{|c1| c1.name==c.name}
                  end
                end
              end
              # Creamos su clave primaria
              oldPrimaryKey=t.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}
              t1.restrictions=NF1::PrimaryKey.new do |pk|            
                pk.name=oldPrimaryKey.name
                oldPrimaryKey.restrictionsColumns.each do |rc|
                  pk.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                    rc1.column=t1.columns.find{|c| c.name==rc.column.name}
                    rc1.name=rc.name
                  end
                end
              end
              # Creamos sus claves candidatas
              oldCandidatesKeys=t.restrictions.select{|r| r.kind_of?(NF1::CandidateKey)}.reject{|r| r.kind_of?(NF1::PrimaryKey)}
              oldCandidatesKeys.each do |ck|
                t1.restrictions=NF1::CandidateKey.new do |ck1|
                  ck1.name=ck.name
                  ck.restrictionsColumns.each do |rc|
                    ck1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                      rc1.column=t1.columns.find{|c| c.name==rc.column.name}
                      rc1.name=rc.name
                    end
                  end
                end
              end
              # Creamos sus claves foráneas
              oldForeignKeys=t.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}
              oldForeignKeys.each do |fk|
                t1.restrictions=NF1::ForeignKey.new do |fk1|
                  fk1.name=fk.name
                  fk.restrictionsColumns.each do |rc|
                    fk1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                      rc1.column=t1.columns.find{|c| c.name==rc.column.name}
                      rc1.name=rc.name
                    end
                  end
                end
              end
            end]
          end          
          # Una vez creadas todas las tablas, establecemos el valor de las claves primarias
          # referenciadas por las claves foráneas          
          newTables=tableSet.select{|t| t.name==denormalizedTable.name || t.name==existingTable.name}
          oldForeignKeys=denormalizedTable.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}
          newTables.each do |newTable|
            oldForeignKeys.each do |fk|
              newForeignKey=newTable.restrictions.find{|r| r.kind_of?(NF1::ForeignKey) && r.name==fk.name}
              if newForeignKey!=nil
                newReferencedTable=tableSet.find{|t| t.name==fk.primaryKey.__container__.name}
                newReferencedPrimaryKey=newReferencedTable.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey) && r.name==fk.primaryKey.name}
                newForeignKey.primaryKey=newReferencedPrimaryKey
                fk.restrictionsColumns.each do |rc|
                  newRestrictionColumn=newForeignKey.restrictionsColumns.find{|rc1| rc1.name==rc.name}
                  newRestrictionColumn.pkRestrictionColumn=newForeignKey.primaryKey.restrictionsColumns.find{|rc1| rc1.name==rc.pkRestrictionColumn.name}
                end
              end
            end
          end          
          restOfTables=tables.reject{|t| t==denormalizedTable}
          restOfTables.each do |t|
            newTable=tableSet.find{|t1| t1.name==t.name}
            oldForeignKeys=t.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}
            oldForeignKeys.each do |fk|
              newForeignKey=newTable.restrictions.find{|r| r.kind_of?(NF1::ForeignKey) && r.name==fk.name}
              newReferencedTable=tableSet.find{|t1| t1.name==fk.primaryKey.__container__.name}
              newReferencedPrimaryKey=newReferencedTable.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey) && r.name==fk.primaryKey.name}
              newForeignKey.primaryKey=newReferencedPrimaryKey
              fk.restrictionsColumns.each do |rc|
                newRestrictionColumn=newForeignKey.restrictionsColumns.find{|rc1| rc1.name==rc.name}
                newRestrictionColumn.pkRestrictionColumn=newForeignKey.primaryKey.restrictionsColumns.find{|rc1| rc1.name==rc.pkRestrictionColumn.name}
              end
            end
          end          
        # Si no, dividimos la tabla original en dos
        else
          # Creamos la primera de las dos nuevas tablas
          tableSet+=[NF1::Table.new do |t|
            t.name=denormalizedTable.name+"_1"
            # Esta tabla contiene las columnas presentes en la dependencia funcional extraida            
            functionalDependencyColumns.each do |c|
              t.columns=NF1::Column.new do |c1|
                c1.name=c.name
              end
            end
            # Incluimos las dependencias funcionales extraidas de la tabla original
            functionalDependenciesToExtract.each do |fd1|
              t.functionalDependencies=NF1::FunctionalDependency.new do |fd2|
                fd1.determinant.each do |c|
                  fd2.determinant=t.columns.find{|c1| c1.name==c.name}
                end
                fd1.dependant.each do |c|
                  fd2.dependant=t.columns.find{|c1| c1.name==c.name}
                end
              end
            end
            # Establecemos como clave primaria de la tabla el determinante de fd
            t.restrictions=NF1::PrimaryKey.new do |pk|
              pk.name=t.name+"_PK"
              fd.determinant.each do |c|
                pk.restrictionsColumns=NF1::RestrictionColumn.new do |rc|
                  rc.column=t.columns.find{|c1| c1.name==c.name}
                  rc.name=pk.name+"_"+rc.column.name
                end
              end
            end
            # Establecemos como claves candidatas cada determinante del resto de dependencias 
            # funcionales extraidas
            additionalExtractedFunctionalDependencies=functionalDependenciesToExtract-[fd]
            index=1
            additionalExtractedFunctionalDependencies.each do |fd1|
              # Si el determinanante es distinto al de la clave primaria
              if !fd1.determinant.all?{|c| fd.determinant.include?(c)} && !fd.determinant.all?{|c| fd1.determinant.include?(c)}
                t.restrictions=NF1::CandidateKey.new do |ck|
                  ck.name=t.name+"_CK_"+index.to_s
                  fd1.determinant.each do |c|
                    ck.restrictionsColumns=NF1::RestrictionColumn.new do |rc|
                      rc.column=t.columns.find{|c1| c1.name==c.name}
                      rc.name=ck.name+"_"+rc.column.name
                    end
                  end
                  index+=1
                end
              end
            end
            # Establecemos como claves foráneas las claves foráneas de la tabla original formadas por
            # las columnas extraidas a esta tabla
            foreignKeys.each do |fk|
              if fk.restrictionsColumns.map{|rc| rc.column}.flatten.uniq.all?{|c| t.columns.map{|c1| c1.name}.flatten.include?(c.name)}
                t.restrictions=NF1::ForeignKey.new do |fk1|
                  fk1.name=fk.name
                  fk.restrictionsColumns.each do |rc|
                    fk1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                      rc1.column=t.columns.find{|c| c.name==rc.column.name}
                      rc1.name=rc.name
                    end
                  end
                end
              end
            end
          end]
          # Creamos la segunda de las dos nuevas tablas
          tableSet+=[NF1::Table.new do |t|
            t.name=denormalizedTable.name+"_2"
            # Esta tabla contiene las columnas de la tabla original excepto las columnas
            # presentes en el dependiente de fd
            nonExtractedColumns=denormalizedTable.columns-extractedColumns
            nonExtractedColumns.each do |c|
              t.columns=NF1::Column.new do |c1|
                c1.name=c.name
              end
            end
            # Esta tabla contiene las dependencias funcionales de la tabla original que no se 
            # han extraido
            notExtractedFunctionalDependencies.each do |fd1|
              t.functionalDependencies=NF1::FunctionalDependency.new do |fd2|
                fd1.determinant.each do |c|
                  fd2.determinant=t.columns.find{|c1| c1.name==c.name}
                end
                fd1.dependant.each do |c|
                  fd2.dependant=t.columns.find{|c1| c1.name==c.name}
                end
              end
            end                
            # Establecemos como clave primaria de la tabla la clave primaria de la tabla original
            originalPrimaryKey=denormalizedTable.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}
            t.restrictions=NF1::PrimaryKey.new do |pk|
              pk.name=originalPrimaryKey.name
              originalPrimaryKey.restrictionsColumns.each do |rc|
                pk.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                  rc1.column=t.columns.find{|c| c.name==rc.column.name}
                  rc1.name=rc.name
                end
              end
            end
            # Establecemos como claves candidatas de la tabla las claves candidatas de la tabla 
            # original
            originalCandidateKeys=denormalizedTable.restrictions.select{|r| r.kind_of?(NF1::CandidateKey)}.reject{|ck| ck.kind_of?(NF1::PrimaryKey)}
            originalCandidateKeys.each do |ck|
              t.restrictions=NF1::CandidateKey.new do |ck1|
                ck1.name=ck.name
                ck.restrictionsColumns.each do |rc|
                  ck1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                    rc1.column=t.columns.find{|c| c.name==rc.column.name}
                    rc1.name=rc.name
                  end
                end
              end
            end            
            # Establecemos como claves foráneas las claves foráneas de la tabla original formadas por
            # las columnas mantenidas en la tabla
            foreignKeys.each do |fk|
              if fk.restrictionsColumns.map{|rc| rc.column}.flatten.uniq.all?{|c| t.columns.map{|c1| c1.name}.flatten.include?(c.name)}
                t.restrictions=NF1::ForeignKey.new do |fk1|
                  fk1.name=fk.name
                  fk.restrictionsColumns.each do |rc|
                    fk1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                      rc1.column=t.columns.find{|c| c.name==rc.column.name}
                      rc1.name=rc.name
                    end
                  end
                end
              end
            end
            # Creamos una nueva clave foránea que apunte a la clave primaria de la primera tabla
            t.restrictions=NF1::ForeignKey.new do |fk|
              referencedTable=tableSet.find{|t1| t1.name==denormalizedTable.name+"_1"}                  
              fk.name=t.name+"_FK_1"
              referencedPrimaryKey=referencedTable.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}
              fk.primaryKey=referencedPrimaryKey
              referencedPrimaryKey.restrictionsColumns.each do |rc|
                fk.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                  rc1.column=t.columns.find{|c| c.name==rc.column.name}
                  rc1.name=fk.name+"_"+rc1.column.name
                  rc1.pkRestrictionColumn=rc
                end
              end                  
            end
          end]
          # Copiamos todas la tablas originales excepto la desnormalizada
          remainingTables=tables.reject{|t| t==denormalizedTable}
          # Creamos la tabla
          remainingTables.each do |t|
            tableSet+=[NF1::Table.new do |t1|
              t1.name=t.name
              # Creamos sus columnas
              t.columns.each do |c|
                t1.columns=NF1::Column.new do |c1|
                  c1.name=c.name
                end
              end
              # Creamos sus dependencias funcionales
              t.functionalDependencies.each do |fd|
                t1.functionalDependencies=NF1::FunctionalDependency.new do |fd1|
                  fd.determinant.each do |c|
                    fd1.determinant=t1.columns.find{|c1| c1.name==c.name}
                  end
                  fd.dependant.each do |c|
                    fd1.dependant=t1.columns.find{|c1| c1.name==c.name}
                  end
                end
              end
              # Creamos su clave primaria
              oldPrimaryKey=t.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}
              t1.restrictions=NF1::PrimaryKey.new do |pk|            
                pk.name=oldPrimaryKey.name
                oldPrimaryKey.restrictionsColumns.each do |rc|
                  pk.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                    rc1.column=t1.columns.find{|c| c.name==rc.column.name}
                    rc1.name=rc.name
                  end
                end
              end
              # Creamos sus claves candidatas
              oldCandidatesKeys=t.restrictions.select{|r| r.kind_of?(NF1::CandidateKey)}.reject{|r| r.kind_of?(NF1::PrimaryKey)}
              oldCandidatesKeys.each do |ck|
                t1.restrictions=NF1::CandidateKey.new do |ck1|
                  ck1.name=ck.name
                  ck.restrictionsColumns.each do |rc|
                    ck1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                      rc1.column=t1.columns.find{|c| c.name==rc.column.name}
                      rc1.name=rc.name
                    end
                  end
                end
              end
              # Creamos sus claves foráneas
              oldForeignKeys=t.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}
              oldForeignKeys.each do |fk|
                t1.restrictions=NF1::ForeignKey.new do |fk1|
                  fk1.name=fk.name
                  fk.restrictionsColumns.each do |rc|
                    fk1.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                      rc1.column=t1.columns.find{|c| c.name==rc.column.name}
                      rc1.name=rc.name
                    end
                  end
                end
              end
            end]
          end
          # Una vez creadas todas las tablas, establecemos el valor de las claves primarias
          # referenciadas por las claves foráneas
          oldTable=denormalizedTable
          newTables=tableSet.select{|t| t.name==oldTable.name+"_1" || t.name==oldTable.name+"_2"}
          oldForeignKeys=oldTable.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}
          newTables.each do |newTable|
            oldForeignKeys.each do |fk|
              newForeignKey=newTable.restrictions.find{|r| r.kind_of?(NF1::ForeignKey) && r.name==fk.name}
              if newForeignKey!=nil
                newReferencedTable=tableSet.find{|t| t.name==fk.primaryKey.__container__.name}
                newReferencedPrimaryKey=newReferencedTable.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey) && r.name==fk.primaryKey.name}
                newForeignKey.primaryKey=newReferencedPrimaryKey
                fk.restrictionsColumns.each do |rc|
                  newRestrictionColumn=newForeignKey.restrictionsColumns.find{|rc1| rc1.name==rc.name}
                  newRestrictionColumn.pkRestrictionColumn=newForeignKey.primaryKey.restrictionsColumns.find{|rc1| rc1.name==rc.pkRestrictionColumn.name}
                end
              end
            end
          end
          remainingTables.each do |t|
            newTable=tableSet.find{|t1| t1.name==t.name}
            oldForeignKeys=t.restrictions.select{|r| r.kind_of?(NF1::ForeignKey)}
            oldForeignKeys.each do |fk|
              newForeignKey=newTable.restrictions.find{|r| r.kind_of?(NF1::ForeignKey) && r.name==fk.name}
              if fk.primaryKey.__container__==denormalizedTable
                newReferencedTable=tableSet.find{|t1| t1.name==fk.primaryKey.__container__.name+"_2"}
              else
                newReferencedTable=tableSet.find{|t1| t1.name==fk.primaryKey.__container__.name}
              end
              newReferencedPrimaryKey=newReferencedTable.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}
              newForeignKey.primaryKey=newReferencedPrimaryKey
              fk.restrictionsColumns.each do |rc|
                newRestrictionColumn=newForeignKey.restrictionsColumns.find{|rc1| rc1.name==rc.name}
                newRestrictionColumn.pkRestrictionColumn=newForeignKey.primaryKey.restrictionsColumns.find{|rc1| rc1.name==rc.pkRestrictionColumn.name}
              end
            end
          end          
        end      
      end
      if tableSet.size!=0
        resultTablesSets+=[tableSet]
      end
    end
    resultTablesSets
  end  
end

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
        $sol=false
        solution=source.backtracking(source.tables)
        if solution.empty?
          target.tables=source.tables
          puts "No ha sido posible transformar la base de datos a 3ª forma normal."
        else
          target.tables=solution
        end
    end
  end
  
  rule 'table2table' do
    from NF1::Table
    to   NORM::Table
    mapping do |source, target| 
        target.name=source.name
        target.columns=source.columns
        target.functionalDependencies=source.functionalDependencies
        target.restrictions=source.restrictions
    end
  end
  
  rule 'column2column' do
    from NF1::Column
    to   NORM::Column
    mapping do |source, target| 
        target.name=source.name
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
  
  rule 'primaryKey2primaryKey' do
    from NF1::PrimaryKey
    to   NORM::PrimaryKey
    mapping do |source, target| 
        target.name=source.name
        source.restrictionsColumns.each do |rc|
          target.restrictionsColumns=rc
        end
    end
  end
  
    rule 'candidateKey2candidateKey' do
    from NF1::CandidateKey
    to   NORM::CandidateKey
    filter{|ck| !ck.kind_of?(NF1::PrimaryKey)}
    mapping do |source, target| 
        target.name=source.name
        source.restrictionsColumns.each do |rc|
          target.restrictionsColumns=rc
        end
    end
  end
  
    rule 'foreignKey2foreignKey' do
    from NF1::ForeignKey
    to   NORM::ForeignKey
    mapping do |source, target| 
        target.name=source.name
        source.restrictionsColumns.each do |rc|
          target.restrictionsColumns=rc
        end
    end
  end
  
  rule 'restrictionColumn2restrictionColumn' do
    from NF1::RestrictionColumn
    to   NORM::RestrictionColumn
    mapping do |source, target| 
        target.name=source.name
        target.column=source.__container__.__container__.columns.find{|c| c.name==source.column.name}
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