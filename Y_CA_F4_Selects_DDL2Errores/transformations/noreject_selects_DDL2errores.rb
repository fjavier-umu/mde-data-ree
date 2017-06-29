decorator SEL::Fichero do
  def obtenerTablaYColumnaDDL(operando, tabs)
    columnaNombre=operando.columna
    # Intentamos recuperar el nombre de la tabla a partir del operando
    tablaOAlias=""
    tablaNombre=""
    if operando.tabla!=nil && operando.tabla!=""            
      tablaOAlias=operando.tabla
    end
    if tablaOAlias!=""
      tabla=tabs.find{|t| t.nombre==tablaOAlias || t.tabAlias==tablaOAlias}
      if tabla!=nil
        tablaNombre=tabla.nombre
      end
    end
    resultado=[]
    # Obtenemos la tabla y la columna del DDL
    if(tablaNombre!="")
      # El operando incluye el nombre o alias de la tabla
      # Accedemos a la correspondiente tabla del DDL y a partir de ella obtenemos su columna
      #��puts 'Searching for table..' + tablaNombre
      
      resultado[0] = tablaNombre
      resultado[1] = columnaNombre
      
      if false #MODIFICADO-REP2 para no rechazar FK si no se encuentra la tabla o la columna 
        resultado[0]=DDL::Table.all_objects.find{|t| t.name.upcase==tablaNombre.upcase}
          if resultado[0] != nil 
            resultado[1]=resultado[0].columns.find{|c| c.name.upcase==columnaNombre.upcase}
          else
            resultado[1]= nil
          end
      end;
    else
      # El operando no incluye el nombre o alias de la tabla
      # Accedemos a la correspondiente columna del DDL y a partir de ella a la tabla

      #ADDED-REP2 para no rechazar FK si no se encuentra la tabla o la columna
      resultado[0] = ""
      resultado[1] = ""

      tabs.each do |tab|
            
        #ADDED-REP2 para no rechazar FK si no se encuentra la tabla o la columna     
        tablaCol = DDL::Table.all_objects.find{|t| t.name == tab.nombre}
        
        if tablaCol != nil
        
          column = tablaCol.columns.find{|c| c.name.strip.upcase==columnaNombre.upcase}
                  
          if column !=nil
            resultado[1] = column.name
            resultado[0] = column.__container__.name
            break
          end
          
        end
        
        if false #MODIFICADO-REP2 para no rechazar FK si no se encuentra la tabla o la columna
          resultado[1]=DDL::Table.all_objects.find{|t| t.name = tab.nombre}.columns.find{|c| c.name.upcase==columnaNombre.upcase}
          if resultado[1] != nil
            resultado[0]=resultado[1].__container__
            break
          else 
            resultado[0]= nil
          end
        end
      end
    end
    return resultado
  end
  
  def obtenerCandidatos(tabYcol1, tabYcol2)
   # Obtenemos las claves primarias y for���neas de cada tabla
   joinCandidato=[]
    
   if tabYcol1[0] != nil && tabYcol2[0] != nil && tabYcol1[1] != nil && tabYcol2[1] != nil 
    
    # puts 'Tab1: ' + tabYcol1[0].name + ' - Tab2: ' + tabYcol2[0].name
    
    tab1PK=tabYcol1[0].pks
    tab2PK=tabYcol2[0].pks
    tab1FKs=tabYcol1[0].fks
    tab2FKs=tabYcol2[0].fks
    # Comprobamos si la primera columna pertenece a la pk
    if tab1PK != nil && tab1PK.columnName.any?{|cn| cn==tabYcol1[1].name}
      # La primera columna pertenece a la pk
      # Comprobamos si la segunda columna pertenece ya a una fk
      if !tab2FKs.any?{|fk| fk.columnName.include?(tabYcol2[1].name)}
        # La segunda columna no pertenece a ninguna fk
        # A���adimos las dos tablas y sus columnas como un join candidato
        joinCandidato[0]=tabYcol2[0] # Tabla referenciadora
        joinCandidato[1]=tabYcol2[1] # Columna referenciadora
        joinCandidato[2]=tabYcol1[0] # Tabla referenciada
        joinCandidato[3]=tabYcol1[1] # Columna referenciada
        joinCandidato[4]="false"   # Indica que el join todav���a no ha sido procesado
      end
    end
    # Comprobamos si la segunda columna pertenece a la pk
    if tab2PK != nil && tab2PK.columnName.any?{|cn| cn==tabYcol2[1].name}
      # La segunda columna pertenece a la pk
      # Comprobamos si la primera columna pertenece ya a una fk
      if !tab1FKs.any?{|fk| fk.columnName.include?(tabYcol1[1].name)}
        # La primera columna no pertenece a ninguna fk
        # A���adimos las dos tablas y sus columnas como un join candidato
        joinCandidato[0]=tabYcol1[0] # Tabla referenciadora
        joinCandidato[1]=tabYcol1[1] # Columna referenciadora
        joinCandidato[2]=tabYcol2[0] # Tabla referenciada
        joinCandidato[3]=tabYcol2[1] # Columna referenciada
        joinCandidato[4]="false"   # Indica que el join todav���a no ha sido procesado
      end
    end
   end
   return joinCandidato
  end  
  
  def obtenerSolucion(candidatos)
    solucion=[]
    tamSolucion=0
    tamCandidatos=candidatos.length
    i=0
    while i<tamCandidatos do
      # Comprobamos si el join candidato forma parte del conjunto de joins que forman la soluci���n
      cand=candidatos[i]
      if cand[4]=="false" # Comprobamos que el join no se ha procesado ya
        columnasPkTab1=cand[2].pks.columnName
        if columnasPkTab1.size==1 # Comprobamos si la columna referenciada es la unica de la PK
          candidatos[i][4]="true"
          solucion[tamSolucion]=cand
          tamSolucion+=1
        else # Si no, comprobamos si el resto de columnas de la PK se incluyen en otros joins
          solucionParcial=[]
          solucionParcial[0]=cand
          tamSolucionParcial=1
          indicador=true
          columnasRestantesPkTab1=columnasPkTab1.reject{|c| c==cand[3].name}
          columnasRestantesPkTab1.each do |crpk|
            # Por cada columna restante de la PK comprobamos si existe otro join que apunte a dicha columna
            j=0
            indicadorParcial=false
            while j<tamCandidatos && !indicadorParcial do
              if j!=i
                cand2=candidatos[j]
                if cand2[4]=="false" && cand2[3].name==crpk && cand[0].name==cand2[0].name
                  # Si hay alg���n join que apunte a la columna de la PK y cuya tabla de origen sea la misma que la de la columna de la PK ya procesada
                  # A���adimos el segundo join a la soluci���n parcial
                  solucionParcial[tamSolucionParcial]=cand2
                  tamSolucionParcial=tamSolucionParcial+1
                  indicadorParcial=true
                end
              end
              j+=1
            end
            indicador=indicadorParcial
            # Si hay alguna columna de la PK para la que no se ha encontrado un join candidato no se a���ade a la soluci���n final
            if !indicador
              break
            end
          end
          if indicador # La soluci���n parcial es v���lida
            j=0
            while j<tamSolucionParcial do
              solucion[tamSolucion]=solucionParcial[j]
              tamSolucion=tamSolucion+1
              k=0
              while k<tamCandidatos do
                if candidatos[k][4]=="false"
                  if candidatos[k]==solucionParcial[j]
                    candidatos[k][4]="true"
                  end
                end
                k+=1
              end
              j+=1
            end
          end
        end
      end
      i+=1
    end
    # Marcamos todas las join de la soluci���n como no procesadas
    i=0
    while i<tamSolucion do
      solucion[i][4]="false"
      i=i+1
    end
    return solucion
  end
end

top_rule 'fichero2errores' do
  from SEL::Aplicacion
  to   ERR::Errores
  mapping do |source, target|
    source.ficheros.each do |fichero|
      # puts 'File: ' + fichero.nombre
      fichero.nombre['.selects'] = '.java' 
      sels=fichero.selects
      sels.each do |s|
       if s.parte_where != nil && s.parte_from != nil 
        tabs=s.parte_from.tablas
        joins=s.parte_where.joins
        candidatos=[]
        tamCandidatos=0
        while joins.size>0 do
          join=joins.first
          operando1=join.operando1
          operando2=join.operando2
          # puts 'op1: [' + (operando1.tabla == nil ? '' : (operando1.tabla + '.')) + operando1.columna + '] op2:[' + (operando2.tabla == nil ? '' : (operando2.tabla + '.')) + operando2.columna + ']'
          # Obtenemos las tablas y las columnas del DDL
          tablaYColumnaDDL1=fichero.obtenerTablaYColumnaDDL(operando1, tabs)
          tablaYColumnaDDL2=fichero.obtenerTablaYColumnaDDL(operando2, tabs)
          
          #ADDED-REP2 para no rechazar FK si no se encuentra la tabla o la columna
          if tablaYColumnaDDL1[0] != "" && tablaYColumnaDDL1[1] != "" && tablaYColumnaDDL2[0] != "" && tablaYColumnaDDL2[1] != "" 
            puts fichero.nombre + ' , ' + tablaYColumnaDDL1[0] + '.' + tablaYColumnaDDL1[1] + ' , ' + tablaYColumnaDDL2[0] + '.' + tablaYColumnaDDL2[1]
          end
          if false #MODIFICADO-REP2 if tablaYColumnaDDL1[0] != nil && tablaYColumnaDDL1[1] != nil && tablaYColumnaDDL2[0] != nil && tablaYColumnaDDL2[1] != nil
            puts fichero.nombre + ' , ' + tablaYColumnaDDL1[0].name + '.' + tablaYColumnaDDL1[1].name + ' , ' + tablaYColumnaDDL2[0].name + '.' + tablaYColumnaDDL2[1].name
          end  
          
          # Determinamos si el join actual puede llegar a determinar una nueva FK
          
          #MODIFICADO-REP2 
          # joinCandidato=fichero.obtenerCandidatos(tablaYColumnaDDL1, tablaYColumnaDDL2)
          joinCandidato=[]
          if joinCandidato.length>0
            # Si puede llegar a determinar una nueva FK, lo a���adimos a la lista de candidatos
            candidatos[tamCandidatos]=joinCandidato
            tamCandidatos+=1
          end
          joins=joins.reject{|a| a==join}
        end
        # A partir de la lista de candidatos, vemos qu��� joins pueden formar una nueva FK
        solucion=fichero.obtenerSolucion(candidatos)
        tamSolucion=solucion.length
        i=0
        while i<tamSolucion do
          if solucion[i][4]=="false"
            target.errores=ERR::ForeignError.new do |fe|
              fe.set('tableCont', DDL::Table.all_objects.find{|t| t.name==solucion[i][0].name})
              fe.set('tableRef', DDL::Table.all_objects.find{|t| t.name==solucion[i][2].name})
              fe.set('fkColumns', DDL::Table.all_objects.find{|t| t.name==solucion[i][0].name}.columns.find{|c| c.name==solucion[i][1].name})
              solucion[i][4]="true"
              j=0
              while j<tamSolucion do
                if solucion[j][4]=="false" && solucion[j][0]==solucion[i][0] && solucion[j][2]==solucion[i][2]
                  fe.set('fkColumns', DDL::Table.all_objects.find{|t| t.name==solucion[j][0].name}.columns.find{|c| c.name==solucion[j][1].name})
                  solucion[j][4]="true"
                end 
                j+=1
              end
            end
          end
          i+=1
        end
       end
      end
    end
  end
end