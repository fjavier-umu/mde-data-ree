top_rule 'database2database' do
  from FDSDUPL::Database
  to   FDS::Database
  mapping do |source, target| 
      target.name=source.name
      target.tables=source.tables
  end
end

rule 'table2table' do
  from FDSDUPL::Table
  to   FDS::Table
  mapping do |source, target| 
    target.name=source.name
    source.columns.each do |c|
     if !target.columns.map{|tc| tc.name}.flatten.include?(c.name)
      target.columns=c
     end
    end
    target.functionalDependencies=source.functionalDependencies
  end
end

rule 'column2column' do
  from FDSDUPL::Column
  to   FDS::Column
  mapping do |source, target| 
      target.name=source.name
  end
end

rule 'functionalDependency2functionalDependency' do
  from FDSDUPL::FunctionalDependency
  to   FDS::FunctionalDependency
  mapping do |source, target|
      source.determinant.each do |c|
        target.determinant=target.__container__.columns.find{|c1| c1.name==c.name}
      end     
      source.dependant.each do |c|
        target.dependant=target.__container__.columns.find{|c1| c1.name==c.name}
      end    
  end
end