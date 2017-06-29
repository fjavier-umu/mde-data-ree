phase 'fase1' do
  top_rule 'database2DDLDefinition' do
    from FDSDDLNORM::Database
    to   DDLNORM::DDLDefinition
    mapping do |source, target| 
        target.statements=source
        target.statements=source.tables
    end
  end
  
  rule 'database2database' do
    from FDSDDLNORM::Database
    to   DDLNORM::Database
    mapping do |source, target| 
        target.name=source.name
    end
  end
  
  rule 'table2table' do
    from FDSDDLNORM::Table
    to   DDLNORM::Table
    mapping do |source, target| 
        target.name=source.name
        target.columns=source.columns
        target.pks=source.restrictions.find{|r| r.kind_of?(FDSDDLNORM::PrimaryKey)}
        target.cks=source.restrictions.select{|r| r.kind_of?(FDSDDLNORM::CandidateKey)}.reject{|r| r.kind_of?(FDSDDLNORM::PrimaryKey)}
        target.fks=source.restrictions.select{|r| r.kind_of?(FDSDDLNORM::ForeignKey)}
    end
  end
  
  rule 'column2column' do
    from FDSDDLNORM::Column
    to   DDLNORM::Column
    mapping do |source, target| 
        target.name=source.name
        newTableName=source.__container__.name
        originalTable=DDLDENORM::Table.all_objects.find{|t| newTableName.include? t.name}
        originalColumn=originalTable.columns.find{|c| c.name==source.name}
        target.type=originalColumn.type
        target.columnNull=originalColumn.columnNull
    end
  end
  
  rule 'primaryKey2Pk' do
    from FDSDDLNORM::PrimaryKey
    to   DDLNORM::Pk
    mapping do |source, target| 
        target.name=source.name
        originalPrimaryKeyColumns=source.restrictionsColumns.map{|rc| rc.column}.flatten.uniq
        originalPrimaryKeyColumns.each do |c|
          target.columnName=c.name
        end
    end
  end
  
  rule 'candidateKey2Ck' do
    from FDSDDLNORM::CandidateKey
    to   DDLNORM::Ck
    mapping do |source, target| 
        target.name=source.name
        originalCandidateKeyColumns=source.restrictionsColumns.map{|rc| rc.column}.flatten.uniq
        originalCandidateKeyColumns.each do |c|
          target.columnName=c.name
        end
    end
  end
  
  rule 'foreignKey2Fk' do
    from FDSDDLNORM::ForeignKey
    to   DDLNORM::Fk
    mapping do |source, target| 
        target.name=source.name
        source.restrictionsColumns.each do |rc|
          target.columnName=rc.column.name
          target.columnReference=rc.pkRestrictionColumn.column.name
        end        
    end
  end
  
  # Types

  # Character String Types
  copy_rule 'character2character' do
    from DDLDENORM::Character
    to   DDLNORM::Character
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  copy_rule 'char2char' do
    from DDLDENORM::Char
    to   DDLNORM::Char
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  copy_rule 'characterVarying2characterVarying' do
    from DDLDENORM::CharacterVarying
    to   DDLNORM::CharacterVarying
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  copy_rule 'charVarying2charVarying' do
    from DDLDENORM::CharVarying
    to   DDLNORM::CharVarying
    mapping do |source, target| 
        target.length=source.length
    end
  end

  copy_rule 'varchar2varchar' do
    from DDLDENORM::Varchar
    to   DDLNORM::Varchar
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  # National Character String Types
  copy_rule 'nationalCharacter2nationalCharacter' do
    from DDLDENORM::NationalCharacter
    to   DDLNORM::NationalCharacter
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  copy_rule 'nationalChar2nationalChar' do
    from DDLDENORM::NationalChar
    to   DDLNORM::NationalChar
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  copy_rule 'nChar2nChar' do
    from DDLDENORM::NChar
    to   DDLNORM::NChar
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  copy_rule 'nationalCharacterVarying2nationalCharacterVarying' do
    from DDLDENORM::NationalCharacterVarying
    to   DDLNORM::NationalCharacterVarying
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  copy_rule 'nationalCharVarying2nationalCharVarying' do
    from DDLDENORM::NationalCharVarying
    to   DDLNORM::NationalCharVarying
    mapping do |source, target| 
        target.length=source.length
    end
  end

  copy_rule 'nCharVarying2nCharVarying' do
    from DDLDENORM::NCharVarying
    to   DDLNORM::NCharVarying
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  # Bit String Types
  copy_rule 'bit2bit' do
    from DDLDENORM::Bit
    to   DDLNORM::Bit
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  copy_rule 'bitVarying2bitVarying' do
    from DDLDENORM::BitVarying
    to   DDLNORM::BitVarying
    mapping do |source, target| 
        target.length=source.length
    end
  end
  
  # Numeric Types
  copy_rule 'numeric2numeric' do
    from DDLDENORM::Numeric
    to   DDLNORM::Numeric
    mapping do |source, target| 
        target.precision=source.precision
        target.scale=source.scale
    end
  end
  
  copy_rule 'decimal2decimal' do
    from DDLDENORM::Decimal
    to   DDLNORM::Decimal
    mapping do |source, target| 
        target.precision=source.precision
        target.scale=source.scale
    end
  end
  
  copy_rule 'dec2dec' do
    from DDLDENORM::Dec
    to   DDLNORM::Dec
    mapping do |source, target| 
        target.precision=source.precision
        target.scale=source.scale
    end
  end
  
  copy_rule 'integer2integer' do
    from DDLDENORM::Integer
    to   DDLNORM::Integer
    mapping do |source, target| 
    end
  end 
  
  copy_rule 'int2int' do
    from DDLDENORM::Int
    to   DDLNORM::Int
    mapping do |source, target| 
    end    
  end
  
  copy_rule 'small2small' do
    from DDLDENORM::Small
    to   DDLNORM::Small
    mapping do |source, target| 
    end    
  end
  
  copy_rule 'float2float' do
    from DDLDENORM::Float
    to   DDLNORM::Float
    mapping do |source, target| 
        target.precision=source.precision
    end
  end
  
  copy_rule 'real2real' do
    from DDLDENORM::Real
    to   DDLNORM::Real
    mapping do |source, target| 
    end    
  end
  
  copy_rule 'doublePrecision2doublePrecision' do
    from DDLDENORM::DoublePrecision
    to   DDLNORM::DoublePrecision
    mapping do |source, target| 
    end    
  end

  # Datetime Types
  copy_rule 'date2date' do
    from DDLDENORM::Date
    to   DDLNORM::Date
    mapping do |source, target| 
    end    
  end
  
  copy_rule 'time2time' do
    from DDLDENORM::Time
    to   DDLNORM::Time
    mapping do |source, target| 
      target.precision=source.precision
      target.withTimeZone=source.withTimeZone
    end    
  end
  
  copy_rule 'timeStamp2timeStamp' do
    from DDLDENORM::TimeStamp
    to   DDLNORM::TimeStamp
    mapping do |source, target| 
      target.precision=source.precision
      target.withTimeZone=source.withTimeZone
    end    
  end
  
  # Interval Types
  copy_rule 'interval2interval' do
    from DDLDENORM::Interval
    to   DDLNORM::Interval
    mapping do |source, target| 
      target.field1=source.field1
      target.field2=source.field2
      target.precision1=source.precision1
      target.precision2=source.precision2
    end    
  end
end

phase 'fase2' do
  refinement_rule 'refineFk' do
    from FDSDDLNORM::ForeignKey
    to   DDLNORM::Fk
    mapping do |source, target| 
        target.references=DDLNORM::Table.all_objects.find{|t| t.name==source.primaryKey.__container__.name}
    end
  end
end