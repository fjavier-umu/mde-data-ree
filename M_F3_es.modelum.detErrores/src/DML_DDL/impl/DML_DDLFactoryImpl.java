/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL.impl;

import DML_DDL.Aproximado;
import DML_DDL.BFile;
import DML_DDL.Binaries;
import DML_DDL.BinaryDouble;
import DML_DDL.BinaryFloat;
import DML_DDL.Bit;
import DML_DDL.BitVarying;
import DML_DDL.Bits;
import DML_DDL.Blob;
import DML_DDL.Char;
import DML_DDL.CharVarying;
import DML_DDL.CharacterVarying;
import DML_DDL.Characters;
import DML_DDL.Ck;
import DML_DDL.Clob;
import DML_DDL.Column;
import DML_DDL.CommentColumn;
import DML_DDL.CommentTable;
import DML_DDL.DDLDefinition;
import DML_DDL.DML_DDLFactory;
import DML_DDL.DML_DDLPackage;
import DML_DDL.DataDefinition;
import DML_DDL.DataType;
import DML_DDL.Database;
import DML_DDL.Date;
import DML_DDL.DayTime;
import DML_DDL.Decimal;
import DML_DDL.DoublePrecision;
import DML_DDL.Exacto;
import DML_DDL.Fk;
import DML_DDL.Int;
import DML_DDL.Intervals;
import DML_DDL.LongRaw;
import DML_DDL.NChar;
import DML_DDL.NCharVarying;
import DML_DDL.NClob;
import DML_DDL.NVarChar2;
import DML_DDL.NationalChar;
import DML_DDL.NationalCharVarying;
import DML_DDL.NationalCharacter;
import DML_DDL.NationalCharacterVarying;
import DML_DDL.Numeric;
import DML_DDL.Pk;
import DML_DDL.Real;
import DML_DDL.Registry;
import DML_DDL.SmallInt;
import DML_DDL.SmallInteger;
import DML_DDL.Statement;
import DML_DDL.Table;
import DML_DDL.Time;
import DML_DDL.Times;
import DML_DDL.Timestamp;
import DML_DDL.Type;
import DML_DDL.Value;
import DML_DDL.ValuesCk;
import DML_DDL.VarChar;
import DML_DDL.VarChar2;
import DML_DDL.YearMonth;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DML_DDLFactoryImpl extends EFactoryImpl implements DML_DDLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DML_DDLFactory init() {
		try {
			DML_DDLFactory theDML_DDLFactory = (DML_DDLFactory)EPackage.Registry.INSTANCE.getEFactory("http://modelum.es/DML_DDL"); 
			if (theDML_DDLFactory != null) {
				return theDML_DDLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DML_DDLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DML_DDLPackage.STATEMENT: return createStatement();
			case DML_DDLPackage.DATA_DEFINITION: return createDataDefinition();
			case DML_DDLPackage.DATA_TYPE: return createDataType();
			case DML_DDLPackage.DDL_DEFINITION: return createDDLDefinition();
			case DML_DDLPackage.PK: return createPk();
			case DML_DDLPackage.FK: return createFk();
			case DML_DDLPackage.CK: return createCk();
			case DML_DDLPackage.VALUES_CK: return createValuesCk();
			case DML_DDLPackage.COLUMN: return createColumn();
			case DML_DDLPackage.DATABASE: return createDatabase();
			case DML_DDLPackage.TABLE: return createTable();
			case DML_DDLPackage.REGISTRY: return createRegistry();
			case DML_DDLPackage.VALUE: return createValue();
			case DML_DDLPackage.COMMENT_TABLE: return createCommentTable();
			case DML_DDLPackage.COMMENT_COLUMN: return createCommentColumn();
			case DML_DDLPackage.TYPE: return createType();
			case DML_DDLPackage.EXACTO: return createExacto();
			case DML_DDLPackage.INTEGER: return createInteger();
			case DML_DDLPackage.SMALL_INTEGER: return createSmallInteger();
			case DML_DDLPackage.INT: return createInt();
			case DML_DDLPackage.SMALL_INT: return createSmallInt();
			case DML_DDLPackage.NUMBER: return createNumber();
			case DML_DDLPackage.NUMERIC: return createNumeric();
			case DML_DDLPackage.DECIMAL: return createDecimal();
			case DML_DDLPackage.APROXIMADO: return createAproximado();
			case DML_DDLPackage.REAL: return createReal();
			case DML_DDLPackage.DOUBLE_PRECISION: return createDoublePrecision();
			case DML_DDLPackage.FLOAT: return createFloat();
			case DML_DDLPackage.LONG: return createLong();
			case DML_DDLPackage.LONG_RAW: return createLongRaw();
			case DML_DDLPackage.CHARACTERS: return createCharacters();
			case DML_DDLPackage.CHARACTER: return createCharacter();
			case DML_DDLPackage.CHARACTER_VARYING: return createCharacterVarying();
			case DML_DDLPackage.CHAR: return createChar();
			case DML_DDLPackage.VAR_CHAR: return createVarChar();
			case DML_DDLPackage.VAR_CHAR2: return createVarChar2();
			case DML_DDLPackage.NVAR_CHAR2: return createNVarChar2();
			case DML_DDLPackage.NCHAR: return createNChar();
			case DML_DDLPackage.CHAR_VARYING: return createCharVarying();
			case DML_DDLPackage.NATIONAL_CHAR: return createNationalChar();
			case DML_DDLPackage.NATIONAL_CHAR_VARYING: return createNationalCharVarying();
			case DML_DDLPackage.NATIONAL_CHARACTER: return createNationalCharacter();
			case DML_DDLPackage.NATIONAL_CHARACTER_VARYING: return createNationalCharacterVarying();
			case DML_DDLPackage.NCHAR_VARYING: return createNCharVarying();
			case DML_DDLPackage.CLOB: return createClob();
			case DML_DDLPackage.NCLOB: return createNClob();
			case DML_DDLPackage.BITS: return createBits();
			case DML_DDLPackage.BIT: return createBit();
			case DML_DDLPackage.BIT_VARYING: return createBitVarying();
			case DML_DDLPackage.TIMES: return createTimes();
			case DML_DDLPackage.DATE: return createDate();
			case DML_DDLPackage.TIME: return createTime();
			case DML_DDLPackage.TIMESTAMP: return createTimestamp();
			case DML_DDLPackage.INTERVALS: return createIntervals();
			case DML_DDLPackage.YEAR_MONTH: return createYearMonth();
			case DML_DDLPackage.DAY_TIME: return createDayTime();
			case DML_DDLPackage.BINARIES: return createBinaries();
			case DML_DDLPackage.BINARY_DOUBLE: return createBinaryDouble();
			case DML_DDLPackage.BINARY_FLOAT: return createBinaryFloat();
			case DML_DDLPackage.BFILE: return createBFile();
			case DML_DDLPackage.BLOB: return createBlob();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDefinition createDataDefinition() {
		DataDefinitionImpl dataDefinition = new DataDefinitionImpl();
		return dataDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDLDefinition createDDLDefinition() {
		DDLDefinitionImpl ddlDefinition = new DDLDefinitionImpl();
		return ddlDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pk createPk() {
		PkImpl pk = new PkImpl();
		return pk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fk createFk() {
		FkImpl fk = new FkImpl();
		return fk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ck createCk() {
		CkImpl ck = new CkImpl();
		return ck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesCk createValuesCk() {
		ValuesCkImpl valuesCk = new ValuesCkImpl();
		return valuesCk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Registry createRegistry() {
		RegistryImpl registry = new RegistryImpl();
		return registry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentTable createCommentTable() {
		CommentTableImpl commentTable = new CommentTableImpl();
		return commentTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentColumn createCommentColumn() {
		CommentColumnImpl commentColumn = new CommentColumnImpl();
		return commentColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exacto createExacto() {
		ExactoImpl exacto = new ExactoImpl();
		return exacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDL.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallInteger createSmallInteger() {
		SmallIntegerImpl smallInteger = new SmallIntegerImpl();
		return smallInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Int createInt() {
		IntImpl int_ = new IntImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallInt createSmallInt() {
		SmallIntImpl smallInt = new SmallIntImpl();
		return smallInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDL.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Numeric createNumeric() {
		NumericImpl numeric = new NumericImpl();
		return numeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aproximado createAproximado() {
		AproximadoImpl aproximado = new AproximadoImpl();
		return aproximado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoublePrecision createDoublePrecision() {
		DoublePrecisionImpl doublePrecision = new DoublePrecisionImpl();
		return doublePrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDL.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDL.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongRaw createLongRaw() {
		LongRawImpl longRaw = new LongRawImpl();
		return longRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characters createCharacters() {
		CharactersImpl characters = new CharactersImpl();
		return characters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDL.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterVarying createCharacterVarying() {
		CharacterVaryingImpl characterVarying = new CharacterVaryingImpl();
		return characterVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarChar createVarChar() {
		VarCharImpl varChar = new VarCharImpl();
		return varChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarChar2 createVarChar2() {
		VarChar2Impl varChar2 = new VarChar2Impl();
		return varChar2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NVarChar2 createNVarChar2() {
		NVarChar2Impl nVarChar2 = new NVarChar2Impl();
		return nVarChar2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NChar createNChar() {
		NCharImpl nChar = new NCharImpl();
		return nChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharVarying createCharVarying() {
		CharVaryingImpl charVarying = new CharVaryingImpl();
		return charVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalChar createNationalChar() {
		NationalCharImpl nationalChar = new NationalCharImpl();
		return nationalChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalCharVarying createNationalCharVarying() {
		NationalCharVaryingImpl nationalCharVarying = new NationalCharVaryingImpl();
		return nationalCharVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalCharacter createNationalCharacter() {
		NationalCharacterImpl nationalCharacter = new NationalCharacterImpl();
		return nationalCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalCharacterVarying createNationalCharacterVarying() {
		NationalCharacterVaryingImpl nationalCharacterVarying = new NationalCharacterVaryingImpl();
		return nationalCharacterVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NCharVarying createNCharVarying() {
		NCharVaryingImpl nCharVarying = new NCharVaryingImpl();
		return nCharVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clob createClob() {
		ClobImpl clob = new ClobImpl();
		return clob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NClob createNClob() {
		NClobImpl nClob = new NClobImpl();
		return nClob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bits createBits() {
		BitsImpl bits = new BitsImpl();
		return bits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bit createBit() {
		BitImpl bit = new BitImpl();
		return bit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitVarying createBitVarying() {
		BitVaryingImpl bitVarying = new BitVaryingImpl();
		return bitVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Times createTimes() {
		TimesImpl times = new TimesImpl();
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp createTimestamp() {
		TimestampImpl timestamp = new TimestampImpl();
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intervals createIntervals() {
		IntervalsImpl intervals = new IntervalsImpl();
		return intervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearMonth createYearMonth() {
		YearMonthImpl yearMonth = new YearMonthImpl();
		return yearMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayTime createDayTime() {
		DayTimeImpl dayTime = new DayTimeImpl();
		return dayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binaries createBinaries() {
		BinariesImpl binaries = new BinariesImpl();
		return binaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryDouble createBinaryDouble() {
		BinaryDoubleImpl binaryDouble = new BinaryDoubleImpl();
		return binaryDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFloat createBinaryFloat() {
		BinaryFloatImpl binaryFloat = new BinaryFloatImpl();
		return binaryFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFile createBFile() {
		BFileImpl bFile = new BFileImpl();
		return bFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blob createBlob() {
		BlobImpl blob = new BlobImpl();
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDLPackage getDML_DDLPackage() {
		return (DML_DDLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DML_DDLPackage getPackage() {
		return DML_DDLPackage.eINSTANCE;
	}

} //DML_DDLFactoryImpl
