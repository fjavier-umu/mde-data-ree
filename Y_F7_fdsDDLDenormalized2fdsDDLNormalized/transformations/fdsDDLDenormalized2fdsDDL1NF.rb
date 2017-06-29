phase 'fase1' do
  top_rule 'database2database' do
    from DENORM::Database
    to   NF1::Database
    mapping do |source, target| 
        target.name=source.name
        target.tables=source.tables
    end
  end
  
  rule 'table2table' do
    from DENORM::Table
    to   NF1::Table
    mapping do |source, target| 
        target.name=source.name
        target.columns=source.columns
        target.functionalDependencies=source.functionalDependencies
        if !source.restrictions.any?{|r| r.kind_of?(DENORM::PrimaryKey)}
          newPrimaryKey=source.restrictions.find{|r| r.kind_of?(DENORM::CandidateKey)}
            if !newPrimaryKey==nil
              target.restrictions=NF1::PrimaryKey.new do |pk|
                pk.name=newPrimaryKey.name
                newPrimaryKey.restrictionsColumns.each do |rc|
                  pk.restrictionsColumns=NF1::RestrictionColumn.new do |rc1|
                    rc1.name=pk.name+"_"+rc.column.name
                    rc1.column=rc.column
                  end
                end
              end
              target.restrictions=source.restrictions-[newPrimaryKey]
            else
              puts "No ha sido posible transformar la tabla "+source.name+" a 1ª forma normal."
            end
        else
          target.restrictions=source.restrictions
        end
    end
  end
  
  rule 'column2column' do
    from DENORM::Column
    to   NF1::Column
    mapping do |source, target| 
        target.name=source.name
    end
  end
  
  rule 'functionalDependency2functionalDependency' do
    from DENORM::FunctionalDependency
    to   NF1::FunctionalDependency
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
    from DENORM::PrimaryKey
    to   NF1::PrimaryKey
    mapping do |source, target| 
        target.name=source.name
        target.restrictionsColumns=source.restrictionsColumns
    end
  end
  
  rule 'candidateKey2candidateKey' do
    from DENORM::CandidateKey
    to   NF1::CandidateKey
    filter{|ck| !ck.kind_of?(DENORM::PrimaryKey)}
    mapping do |source, target| 
        target.name=source.name
        target.restrictionsColumns=source.restrictionsColumns
    end
  end
  
  rule 'foreignKey2foreignKey' do
    from DENORM::ForeignKey
    to   NF1::ForeignKey
    mapping do |source, target| 
        target.name=source.name
        target.restrictionsColumns=source.restrictionsColumns
    end
  end
  
  rule 'restrictionColumn2restrictionColumn' do
    from DENORM::RestrictionColumn
    to   NF1::RestrictionColumn
    mapping do |source, target| 
        target.name=source.name
        target.column=source.column
    end
  end
end

phase 'fase2' do
  refinement_rule 'refineForeignKey' do
    from DENORM::ForeignKey
    to NF1::ForeignKey
    mapping do |source, target|
        target.primaryKey=NF1::Table.all_objects.find{|t| t.name==source.primaryKey.__container__.name}.restrictions.find{|r| r.kind_of?(NF1::PrimaryKey)}
        target.restrictionsColumns.each do |rc|
          originalReferencedRestrictionColumn=source.restrictionsColumns.find{|rc1| rc1.name==rc.name}.pkRestrictionColumn
          rc.pkRestrictionColumn=target.primaryKey.restrictionsColumns.find{|rc1| rc1.name==originalReferencedRestrictionColumn.name}
        end
    end
  end
end