phase 'fase1' do
  top_rule 'database2database' do
    from FDS::Database
    to   FDSDDL::Database
    mapping do |source, target| 
        target.name=source.name
        target.tables=source.tables
    end
  end
  
  rule 'table2table' do
    from FDS::Table
    to   FDSDDL::Table
    mapping do |source, target| 
        target.name=source.name
        target.columns=DDL::Table.all_objects.find{|t| t.name==source.name}.columns
        target.functionalDependencies=source.functionalDependencies
        target.restrictions=DDL::Table.all_objects.find{|t| t.name==source.name}.pks
        target.restrictions=DDL::Table.all_objects.find{|t| t.name==source.name}.cks  
        target.restrictions=DDL::Table.all_objects.find{|t| t.name==source.name}.fks
    end
  end
  
  rule 'column2column' do
    from DDL::Column
    to   FDSDDL::Column
    mapping do |source, target| 
        target.name=source.name
    end
  end
  
  rule 'functionalDependency2functionalDependency' do
    from FDS::FunctionalDependency
    to   FDSDDL::FunctionalDependency
    mapping do |source, target| 
      source.determinant.each do |c|
        target.determinant=target.__container__.columns.find{|c1| c1.name==c.name}
      end     
      source.dependant.each do |c|
        target.dependant=target.__container__.columns.find{|c1| c1.name==c.name}
      end    
    end
  end
  
  rule 'pk2primaryKey' do
    from DDL::Pk
    to   FDSDDL::PrimaryKey
    mapping do |source, target| 
        target.name=source.name
        source.columnName.each do |cn|
          target.restrictionsColumns=FDSDDL::RestrictionColumn.new do |rc|
            rc.column=target.__container__.columns.find{|c| c.name==cn}
            rc.name=target.name+"_"+rc.column.name
          end
        end
    end
  end
  
  rule 'ck2candidateKey' do
    from DDL::Ck
    to   FDSDDL::CandidateKey
    mapping do |source, target| 
        target.name=source.name
        source.columnName.each do |cn|
          target.restrictionsColumns=FDSDDL::RestrictionColumn.new do |rc|
            rc.column=target.__container__.columns.find{|c| c.name==cn}
            rc.name=target.name+"_"+rc.column.name
          end
        end
    end
  end
  
  rule 'fk2foreignKey' do
    from DDL::Fk
    to   FDSDDL::ForeignKey
    mapping do |source, target| 
        target.name=source.name
        source.columnName.each do |cn|
          target.restrictionsColumns=FDSDDL::RestrictionColumn.new do |rc|
            rc.column=target.__container__.columns.find{|c| c.name==cn}
            rc.name=target.name+"_"+rc.column.name
          end
        end
    end
  end 
end

phase 'fase2' do
  refinement_rule 'refineForeignKey' do
    from DDL::Fk
    to FDSDDL::ForeignKey
    mapping do |source, target|
        target.primaryKey=FDSDDL::Table.all_objects.find{|t| t.name==source.references.name}.restrictions.find{|r| r.kind_of?(FDSDDL::PrimaryKey)}
        index=0
        target.restrictionsColumns.each do |rc|
          rc.pkRestrictionColumn=target.primaryKey.restrictionsColumns.find{|rc| rc.column.name==source.columnReference[index]}
          index+=1
        end
    end
  end
end