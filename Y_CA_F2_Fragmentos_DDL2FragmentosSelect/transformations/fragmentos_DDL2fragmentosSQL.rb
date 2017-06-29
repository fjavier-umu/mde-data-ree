class Counter
  @@id = 0
  def next()
    aux = @@id.next
    @@id = aux
    return aux
  end
end

counter = Counter.new

tablas=DDL::Table.all_objects
columnas=DDL::Column.all_objects
palabrasReservadas=["SELECT", "FROM", "WHERE", "GROUP BY", "HAVING", "BETWEEN", "IN", "LIKE", "ORDER BY", "NULL", "DEFAULT", "TRUE", "FALSE", "UNKNOWN", "AND", "OR", "NOT"]

decorator FRAG::Fichero do
  def nombreFichero(nombre)
    ruta=nombre.split('\\')
    nombreFich=ruta.last.split('.')
    return nombreFich.first
  end
end

decorator FRAG::Fragmento do
  def nombreFichero(nombre)
    ruta=nombre.split('\\')
    nombreFich=ruta.last.split('.')
    return nombreFich.first
  end
  
  def containsPalabrasReservadas(texto, palabrasReservadas) 
    palabrasReservadas.each do |pr|
      if (' '+texto+' ').include?(' '+pr+' ')
      #if (' '+texto+' ').index(' '+pr+' ') != nil
        return true
      end
    end
    return false
  end
  
  def containsNombreTabla(texto, tablas)
    tablas.each do |t|
      #if texto.include?(t.name)
      if (' '+texto+' ').include?(' '+t.name+' ')
        return true
      end
    end
    return false
  end
  
  def containsNombreColumna(texto, columnas)
    columnas.each do |c|
      #if texto.include?(c.name)
      if (' '+texto+' ').include?(' '+c.name+' ') or
         (texto+' ').include?('.'+c.name+' ') or         
         (texto).include?('.'+c.name+'=') or
         (texto+' ').include?('='+c.name+' ') or
         (' '+texto).include?(' '+c.name+'=') 
        return true
      end
    end
    return false
  end
  
  def isSQL(texto, counter, palabrasReservadas, tablas, columnas)  
    if containsPalabrasReservadas(texto, palabrasReservadas)
      return true
    else
      if containsNombreTabla(texto, tablas)
        return true
      else
        return containsNombreColumna(texto, columnas)
      end
    end
  end
end

top_rule 'aplicacion2aplicacion' do
  from FRAG::Aplicacion
  to   FRAGSQL::Aplicacion
  mapping do |source, target|
      target.ficheros=source.ficheros
  end
end


rule 'fichero2fichero' do
  from FRAG::Fichero
  to   FRAGSQL::Fichero
  mapping do |source, target|
      puts 'Fichero: ' + source.nombre
      target.nombre=source.nombreFichero(source.nombre)
      target.fragmentos=source.fragmentos
  end
end
  
rule 'fragmentos2fragmentoSelect' do
  from FRAG::Fragmento
  to   FRAGSQL::Fragmento
  mapping do |source, target|
      if source.isSQL(source.texto,counter,palabrasReservadas,tablas,columnas)
        puts counter.next().to_s + ' : ' + source.texto
        target.texto=source.texto
        target.numLinea=source.numLinea
        target.posCaracter=source.posCaracter
      end
  end
end
