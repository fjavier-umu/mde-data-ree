/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DML_DDL.DML_DDLPackage
 * @generated
 */
public class DML_DDLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DML_DDLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DML_DDLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DML_DDLSwitch<Adapter> modelSwitch =
		new DML_DDLSwitch<Adapter>() {
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseDataDefinition(DataDefinition object) {
				return createDataDefinitionAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDDLDefinition(DDLDefinition object) {
				return createDDLDefinitionAdapter();
			}
			@Override
			public Adapter casePk(Pk object) {
				return createPkAdapter();
			}
			@Override
			public Adapter caseFk(Fk object) {
				return createFkAdapter();
			}
			@Override
			public Adapter caseCk(Ck object) {
				return createCkAdapter();
			}
			@Override
			public Adapter caseValuesCk(ValuesCk object) {
				return createValuesCkAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseRegistry(Registry object) {
				return createRegistryAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseCommentTable(CommentTable object) {
				return createCommentTableAdapter();
			}
			@Override
			public Adapter caseCommentColumn(CommentColumn object) {
				return createCommentColumnAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseExacto(Exacto object) {
				return createExactoAdapter();
			}
			@Override
			public Adapter caseInteger(DML_DDL.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseSmallInteger(SmallInteger object) {
				return createSmallIntegerAdapter();
			}
			@Override
			public Adapter caseInt(Int object) {
				return createIntAdapter();
			}
			@Override
			public Adapter caseSmallInt(SmallInt object) {
				return createSmallIntAdapter();
			}
			@Override
			public Adapter caseNumber(DML_DDL.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseNumeric(Numeric object) {
				return createNumericAdapter();
			}
			@Override
			public Adapter caseDecimal(Decimal object) {
				return createDecimalAdapter();
			}
			@Override
			public Adapter caseAproximado(Aproximado object) {
				return createAproximadoAdapter();
			}
			@Override
			public Adapter caseReal(Real object) {
				return createRealAdapter();
			}
			@Override
			public Adapter caseDoublePrecision(DoublePrecision object) {
				return createDoublePrecisionAdapter();
			}
			@Override
			public Adapter caseFloat(DML_DDL.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseLong(DML_DDL.Long object) {
				return createLongAdapter();
			}
			@Override
			public Adapter caseLongRaw(LongRaw object) {
				return createLongRawAdapter();
			}
			@Override
			public Adapter caseCharacters(Characters object) {
				return createCharactersAdapter();
			}
			@Override
			public Adapter caseCharacter(DML_DDL.Character object) {
				return createCharacterAdapter();
			}
			@Override
			public Adapter caseCharacterVarying(CharacterVarying object) {
				return createCharacterVaryingAdapter();
			}
			@Override
			public Adapter caseChar(Char object) {
				return createCharAdapter();
			}
			@Override
			public Adapter caseVarChar(VarChar object) {
				return createVarCharAdapter();
			}
			@Override
			public Adapter caseVarChar2(VarChar2 object) {
				return createVarChar2Adapter();
			}
			@Override
			public Adapter caseNVarChar2(NVarChar2 object) {
				return createNVarChar2Adapter();
			}
			@Override
			public Adapter caseNChar(NChar object) {
				return createNCharAdapter();
			}
			@Override
			public Adapter caseCharVarying(CharVarying object) {
				return createCharVaryingAdapter();
			}
			@Override
			public Adapter caseNationalChar(NationalChar object) {
				return createNationalCharAdapter();
			}
			@Override
			public Adapter caseNationalCharVarying(NationalCharVarying object) {
				return createNationalCharVaryingAdapter();
			}
			@Override
			public Adapter caseNationalCharacter(NationalCharacter object) {
				return createNationalCharacterAdapter();
			}
			@Override
			public Adapter caseNationalCharacterVarying(NationalCharacterVarying object) {
				return createNationalCharacterVaryingAdapter();
			}
			@Override
			public Adapter caseNCharVarying(NCharVarying object) {
				return createNCharVaryingAdapter();
			}
			@Override
			public Adapter caseClob(Clob object) {
				return createClobAdapter();
			}
			@Override
			public Adapter caseNClob(NClob object) {
				return createNClobAdapter();
			}
			@Override
			public Adapter caseBits(Bits object) {
				return createBitsAdapter();
			}
			@Override
			public Adapter caseBit(Bit object) {
				return createBitAdapter();
			}
			@Override
			public Adapter caseBitVarying(BitVarying object) {
				return createBitVaryingAdapter();
			}
			@Override
			public Adapter caseTimes(Times object) {
				return createTimesAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseTimestamp(Timestamp object) {
				return createTimestampAdapter();
			}
			@Override
			public Adapter caseIntervals(Intervals object) {
				return createIntervalsAdapter();
			}
			@Override
			public Adapter caseYearMonth(YearMonth object) {
				return createYearMonthAdapter();
			}
			@Override
			public Adapter caseDayTime(DayTime object) {
				return createDayTimeAdapter();
			}
			@Override
			public Adapter caseBinaries(Binaries object) {
				return createBinariesAdapter();
			}
			@Override
			public Adapter caseBinaryDouble(BinaryDouble object) {
				return createBinaryDoubleAdapter();
			}
			@Override
			public Adapter caseBinaryFloat(BinaryFloat object) {
				return createBinaryFloatAdapter();
			}
			@Override
			public Adapter caseBFile(BFile object) {
				return createBFileAdapter();
			}
			@Override
			public Adapter caseBlob(Blob object) {
				return createBlobAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.DataDefinition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.DataDefinition
	 * @generated
	 */
	public Adapter createDataDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.DDLDefinition <em>DDL Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.DDLDefinition
	 * @generated
	 */
	public Adapter createDDLDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Pk <em>Pk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Pk
	 * @generated
	 */
	public Adapter createPkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Fk <em>Fk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Fk
	 * @generated
	 */
	public Adapter createFkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Ck <em>Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Ck
	 * @generated
	 */
	public Adapter createCkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.ValuesCk <em>Values Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.ValuesCk
	 * @generated
	 */
	public Adapter createValuesCkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Registry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Registry
	 * @generated
	 */
	public Adapter createRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.CommentTable <em>Comment Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.CommentTable
	 * @generated
	 */
	public Adapter createCommentTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.CommentColumn <em>Comment Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.CommentColumn
	 * @generated
	 */
	public Adapter createCommentColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Exacto <em>Exacto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Exacto
	 * @generated
	 */
	public Adapter createExactoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.SmallInteger <em>Small Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.SmallInteger
	 * @generated
	 */
	public Adapter createSmallIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Int
	 * @generated
	 */
	public Adapter createIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.SmallInt <em>Small Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.SmallInt
	 * @generated
	 */
	public Adapter createSmallIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Numeric
	 * @generated
	 */
	public Adapter createNumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Decimal
	 * @generated
	 */
	public Adapter createDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Aproximado <em>Aproximado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Aproximado
	 * @generated
	 */
	public Adapter createAproximadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Real
	 * @generated
	 */
	public Adapter createRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.DoublePrecision <em>Double Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.DoublePrecision
	 * @generated
	 */
	public Adapter createDoublePrecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Long
	 * @generated
	 */
	public Adapter createLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.LongRaw <em>Long Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.LongRaw
	 * @generated
	 */
	public Adapter createLongRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Characters <em>Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Characters
	 * @generated
	 */
	public Adapter createCharactersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Character
	 * @generated
	 */
	public Adapter createCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.CharacterVarying <em>Character Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.CharacterVarying
	 * @generated
	 */
	public Adapter createCharacterVaryingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Char
	 * @generated
	 */
	public Adapter createCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.VarChar <em>Var Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.VarChar
	 * @generated
	 */
	public Adapter createVarCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.VarChar2 <em>Var Char2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.VarChar2
	 * @generated
	 */
	public Adapter createVarChar2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.NVarChar2 <em>NVar Char2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.NVarChar2
	 * @generated
	 */
	public Adapter createNVarChar2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.NChar <em>NChar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.NChar
	 * @generated
	 */
	public Adapter createNCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.CharVarying <em>Char Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.CharVarying
	 * @generated
	 */
	public Adapter createCharVaryingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.NationalChar <em>National Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.NationalChar
	 * @generated
	 */
	public Adapter createNationalCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.NationalCharVarying <em>National Char Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.NationalCharVarying
	 * @generated
	 */
	public Adapter createNationalCharVaryingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.NationalCharacter <em>National Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.NationalCharacter
	 * @generated
	 */
	public Adapter createNationalCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.NationalCharacterVarying <em>National Character Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.NationalCharacterVarying
	 * @generated
	 */
	public Adapter createNationalCharacterVaryingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.NCharVarying <em>NChar Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.NCharVarying
	 * @generated
	 */
	public Adapter createNCharVaryingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Clob <em>Clob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Clob
	 * @generated
	 */
	public Adapter createClobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.NClob <em>NClob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.NClob
	 * @generated
	 */
	public Adapter createNClobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Bits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Bits
	 * @generated
	 */
	public Adapter createBitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Bit
	 * @generated
	 */
	public Adapter createBitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.BitVarying <em>Bit Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.BitVarying
	 * @generated
	 */
	public Adapter createBitVaryingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Times <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Times
	 * @generated
	 */
	public Adapter createTimesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Timestamp
	 * @generated
	 */
	public Adapter createTimestampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Intervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Intervals
	 * @generated
	 */
	public Adapter createIntervalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.YearMonth <em>Year Month</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.YearMonth
	 * @generated
	 */
	public Adapter createYearMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.DayTime <em>Day Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.DayTime
	 * @generated
	 */
	public Adapter createDayTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Binaries <em>Binaries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Binaries
	 * @generated
	 */
	public Adapter createBinariesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.BinaryDouble <em>Binary Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.BinaryDouble
	 * @generated
	 */
	public Adapter createBinaryDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.BinaryFloat <em>Binary Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.BinaryFloat
	 * @generated
	 */
	public Adapter createBinaryFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.BFile <em>BFile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.BFile
	 * @generated
	 */
	public Adapter createBFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DML_DDL.Blob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DML_DDL.Blob
	 * @generated
	 */
	public Adapter createBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DML_DDLAdapterFactory
