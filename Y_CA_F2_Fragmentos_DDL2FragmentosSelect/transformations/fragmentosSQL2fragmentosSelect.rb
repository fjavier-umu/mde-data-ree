class Counter
  @@id = 0
  def next()
    aux = @@id.next
    @@id = aux
    return aux
  end
end

counter = Counter.new


phase 'fase1' do
  top_rule 'fichero2fichero' do
    from FRAGSQL::Fichero
    to   FRAGSEL::Fichero
    mapping do |source, target|
        puts 'Fichero:' + source.nombre
        target.nombre=source.nombre
        target.fragmentosSelect=source.fragmentos.select{|f| f.texto.include?('SELECT')}
        target.fragmentos=source.fragmentos.reject{|f| f.texto.include?('SELECT')}
    end
  end
  
  rule 'fragmentos2fragmentoSelect' do
    from FRAGSQL::Fragmento
    to   FRAGSEL::Fragmento
    mapping do |source, target|
        #puts 'Processing fragment('+counter.next().to_s+')... ' + source.texto
        target.texto=source.texto
        target.numLinea=source.numLinea
        target.posCaracter=source.posCaracter
    end
  end
end

phase 'fase2' do
  refinement_rule 'fragmentos2fragmentoSelectRefine' do
    from FRAGSQL::Fragmento
    to   FRAGSEL::Fragmento
    mapping do |source, target|
        frags=target.__container__.fragmentos
        fragsSel=target.__container__.fragmentosSelect
        select=fragsSel.find{|fs| (fs.numLinea<target.numLinea || (fs.numLinea==target.numLinea && fs.posCaracter<=target.posCaracter)) && fragsSel.reject{|fs2| fs2==fs}.all?{|fs3| (fs3.numLinea>target.numLinea || (fs3.numLinea==target.numLinea && fs3.posCaracter>target.posCaracter)) || (fs3.numLinea<fs.numLinea || (fs3.numLinea==fs.numLinea && fs3.posCaracter<fs.posCaracter))}}
        if select!=nil
          puts 'Fragmento Fase2 ['+counter.next().to_s+']: ' + select.texto
          selectSiguiente=fragsSel.find{|fs| (fs.numLinea>target.numLinea || (fs.numLinea==target.numLinea && fs.posCaracter>target.posCaracter)) && fragsSel.reject{|fs2| fs2==fs}.all?{|fs3| (fs3.numLinea<target.numLinea || (fs3.numLinea==target.numLinea && fs3.posCaracter<=target.posCaracter)) || (fs3.numLinea>fs.numLinea || (fs3.numLinea==fs.numLinea && fs3.posCaracter>fs.posCaracter))}}
          begin
    
            if selectSiguiente==nil
              target.sigFragmento=frags.find{|f| (f.numLinea>target.numLinea || (f.numLinea==target.numLinea && f.posCaracter>target.posCaracter)) && frags.reject{|f2| f2==f}.all?{|f3| (f3.numLinea<target.numLinea || (f3.numLinea==target.numLinea && f3.posCaracter<=target.posCaracter)) || (f3.numLinea>f.numLinea || (f3.numLinea==f.numLinea && f3.posCaracter>f.posCaracter))}}
            else
              target.sigFragmento=frags.find{|f| (f.numLinea>target.numLinea || (f.numLinea==target.numLinea && f.posCaracter>target.posCaracter)) && (f.numLinea<selectSiguiente.numLinea || (f.numLinea==selectSiguiente.numLinea && f.posCaracter<selectSiguiente.posCaracter)) && frags.reject{|f2| f2==f}.all?{|f3| (f3.numLinea<target.numLinea || (f3.numLinea==target.numLinea && f3.posCaracter<=target.posCaracter)) || (f3.numLinea>f.numLinea || (f3.numLinea==f.numLinea && f3.posCaracter>f.posCaracter))}}
            end
          
          rescue => e
            puts 'Error:' + e
          end
          
        end
    end
  end
end