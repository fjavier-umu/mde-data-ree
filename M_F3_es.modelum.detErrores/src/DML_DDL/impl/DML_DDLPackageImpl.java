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

import errors.ErrorsPackage;

import errors.impl.ErrorsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DML_DDLPackageImpl extends EPackageImpl implements DML_DDLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddlDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesCkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aproximadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doublePrecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charactersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterVaryingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varChar2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nVarChar2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charVaryingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nationalCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nationalCharVaryingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nationalCharacterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nationalCharacterVaryingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nCharVaryingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nClobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitVaryingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearMonthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binariesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blobEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see DML_DDL.DML_DDLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DML_DDLPackageImpl() {
		super(eNS_URI, DML_DDLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DML_DDLPackage init() {
		if (isInited) return (DML_DDLPackage)EPackage.Registry.INSTANCE.getEPackage(DML_DDLPackage.eNS_URI);

		// Obtain or create and register package
		DML_DDLPackageImpl theDML_DDLPackage = (DML_DDLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DML_DDLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DML_DDLPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ErrorsPackageImpl theErrorsPackage = (ErrorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ErrorsPackage.eNS_URI) instanceof ErrorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ErrorsPackage.eNS_URI) : ErrorsPackage.eINSTANCE);

		// Create package meta-data objects
		theDML_DDLPackage.createPackageContents();
		theErrorsPackage.createPackageContents();

		// Initialize created meta-data
		theDML_DDLPackage.initializePackageContents();
		theErrorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDML_DDLPackage.freeze();

		return theDML_DDLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDefinition() {
		return dataDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Types() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDDLDefinition() {
		return ddlDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDLDefinition_Statements() {
		return (EReference)ddlDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDLDefinition_DataType() {
		return (EReference)ddlDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPk() {
		return pkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPk_NamePk() {
		return (EAttribute)pkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPk_ColumnName() {
		return (EAttribute)pkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFk() {
		return fkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFk_NameFk() {
		return (EAttribute)fkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFk_ColumnName() {
		return (EAttribute)fkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFk_References() {
		return (EReference)fkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFk_ColumnReference() {
		return (EAttribute)fkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFk_Status() {
		return (EAttribute)fkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCk() {
		return ckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCk_NameCk() {
		return (EAttribute)ckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCk_Status() {
		return (EAttribute)ckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCk_ValuesCk() {
		return (EReference)ckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuesCk() {
		return valuesCkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuesCk_Value() {
		return (EAttribute)valuesCkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuesCk_Comparator() {
		return (EAttribute)valuesCkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuesCk_ColumnName() {
		return (EAttribute)valuesCkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuesCk_LogConjuntion() {
		return (EAttribute)valuesCkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_ColumnName() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_CommentColumn() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_ColumnNull() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_ColumnType() {
		return (EReference)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_DatabaseName() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_TableName() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_CommentTable() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_ColumnsPk() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_ColumnsFk() {
		return (EReference)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Checks() {
		return (EReference)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Registries() {
		return (EReference)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistry() {
		return registryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistry_RegistryValues() {
		return (EReference)registryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Value() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_Column() {
		return (EReference)valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentTable() {
		return commentTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentTable_TableName() {
		return (EAttribute)commentTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentTable_TableComment() {
		return (EAttribute)commentTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentColumn() {
		return commentColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentColumn_TableName() {
		return (EAttribute)commentColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentColumn_ColumnName() {
		return (EAttribute)commentColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentColumn_ColumnComment() {
		return (EAttribute)commentColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExacto() {
		return exactoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallInteger() {
		return smallIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallInt() {
		return smallIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumeric() {
		return numericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimal() {
		return decimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAproximado() {
		return aproximadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReal() {
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoublePrecision() {
		return doublePrecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat() {
		return floatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong() {
		return longEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongRaw() {
		return longRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacters() {
		return charactersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacters_N() {
		return (EAttribute)charactersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter() {
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterVarying() {
		return characterVaryingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChar() {
		return charEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarChar() {
		return varCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarChar2() {
		return varChar2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNVarChar2() {
		return nVarChar2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNChar() {
		return nCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharVarying() {
		return charVaryingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNationalChar() {
		return nationalCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNationalCharVarying() {
		return nationalCharVaryingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNationalCharacter() {
		return nationalCharacterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNationalCharacterVarying() {
		return nationalCharacterVaryingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNCharVarying() {
		return nCharVaryingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClob() {
		return clobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNClob() {
		return nClobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBits() {
		return bitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBits_N() {
		return (EAttribute)bitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBit() {
		return bitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitVarying() {
		return bitVaryingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimes() {
		return timesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimestamp() {
		return timestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervals() {
		return intervalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYearMonth() {
		return yearMonthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDayTime() {
		return dayTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaries() {
		return binariesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryDouble() {
		return binaryDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFloat() {
		return binaryFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBFile() {
		return bFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlob() {
		return blobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDLFactory getDML_DDLFactory() {
		return (DML_DDLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		statementEClass = createEClass(STATEMENT);

		dataDefinitionEClass = createEClass(DATA_DEFINITION);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__TYPES);

		ddlDefinitionEClass = createEClass(DDL_DEFINITION);
		createEReference(ddlDefinitionEClass, DDL_DEFINITION__STATEMENTS);
		createEReference(ddlDefinitionEClass, DDL_DEFINITION__DATA_TYPE);

		pkEClass = createEClass(PK);
		createEAttribute(pkEClass, PK__NAME_PK);
		createEAttribute(pkEClass, PK__COLUMN_NAME);

		fkEClass = createEClass(FK);
		createEAttribute(fkEClass, FK__NAME_FK);
		createEAttribute(fkEClass, FK__COLUMN_NAME);
		createEReference(fkEClass, FK__REFERENCES);
		createEAttribute(fkEClass, FK__COLUMN_REFERENCE);
		createEAttribute(fkEClass, FK__STATUS);

		ckEClass = createEClass(CK);
		createEAttribute(ckEClass, CK__NAME_CK);
		createEAttribute(ckEClass, CK__STATUS);
		createEReference(ckEClass, CK__VALUES_CK);

		valuesCkEClass = createEClass(VALUES_CK);
		createEAttribute(valuesCkEClass, VALUES_CK__VALUE);
		createEAttribute(valuesCkEClass, VALUES_CK__COMPARATOR);
		createEAttribute(valuesCkEClass, VALUES_CK__COLUMN_NAME);
		createEAttribute(valuesCkEClass, VALUES_CK__LOG_CONJUNTION);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__COLUMN_NAME);
		createEAttribute(columnEClass, COLUMN__COMMENT_COLUMN);
		createEAttribute(columnEClass, COLUMN__COLUMN_NULL);
		createEReference(columnEClass, COLUMN__COLUMN_TYPE);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__DATABASE_NAME);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__TABLE_NAME);
		createEAttribute(tableEClass, TABLE__COMMENT_TABLE);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__COLUMNS_PK);
		createEReference(tableEClass, TABLE__COLUMNS_FK);
		createEReference(tableEClass, TABLE__CHECKS);
		createEReference(tableEClass, TABLE__REGISTRIES);

		registryEClass = createEClass(REGISTRY);
		createEReference(registryEClass, REGISTRY__REGISTRY_VALUES);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__VALUE);
		createEReference(valueEClass, VALUE__COLUMN);

		commentTableEClass = createEClass(COMMENT_TABLE);
		createEAttribute(commentTableEClass, COMMENT_TABLE__TABLE_NAME);
		createEAttribute(commentTableEClass, COMMENT_TABLE__TABLE_COMMENT);

		commentColumnEClass = createEClass(COMMENT_COLUMN);
		createEAttribute(commentColumnEClass, COMMENT_COLUMN__TABLE_NAME);
		createEAttribute(commentColumnEClass, COMMENT_COLUMN__COLUMN_NAME);
		createEAttribute(commentColumnEClass, COMMENT_COLUMN__COLUMN_COMMENT);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);

		exactoEClass = createEClass(EXACTO);

		integerEClass = createEClass(INTEGER);

		smallIntegerEClass = createEClass(SMALL_INTEGER);

		intEClass = createEClass(INT);

		smallIntEClass = createEClass(SMALL_INT);

		numberEClass = createEClass(NUMBER);

		numericEClass = createEClass(NUMERIC);

		decimalEClass = createEClass(DECIMAL);

		aproximadoEClass = createEClass(APROXIMADO);

		realEClass = createEClass(REAL);

		doublePrecisionEClass = createEClass(DOUBLE_PRECISION);

		floatEClass = createEClass(FLOAT);

		longEClass = createEClass(LONG);

		longRawEClass = createEClass(LONG_RAW);

		charactersEClass = createEClass(CHARACTERS);
		createEAttribute(charactersEClass, CHARACTERS__N);

		characterEClass = createEClass(CHARACTER);

		characterVaryingEClass = createEClass(CHARACTER_VARYING);

		charEClass = createEClass(CHAR);

		varCharEClass = createEClass(VAR_CHAR);

		varChar2EClass = createEClass(VAR_CHAR2);

		nVarChar2EClass = createEClass(NVAR_CHAR2);

		nCharEClass = createEClass(NCHAR);

		charVaryingEClass = createEClass(CHAR_VARYING);

		nationalCharEClass = createEClass(NATIONAL_CHAR);

		nationalCharVaryingEClass = createEClass(NATIONAL_CHAR_VARYING);

		nationalCharacterEClass = createEClass(NATIONAL_CHARACTER);

		nationalCharacterVaryingEClass = createEClass(NATIONAL_CHARACTER_VARYING);

		nCharVaryingEClass = createEClass(NCHAR_VARYING);

		clobEClass = createEClass(CLOB);

		nClobEClass = createEClass(NCLOB);

		bitsEClass = createEClass(BITS);
		createEAttribute(bitsEClass, BITS__N);

		bitEClass = createEClass(BIT);

		bitVaryingEClass = createEClass(BIT_VARYING);

		timesEClass = createEClass(TIMES);

		dateEClass = createEClass(DATE);

		timeEClass = createEClass(TIME);

		timestampEClass = createEClass(TIMESTAMP);

		intervalsEClass = createEClass(INTERVALS);

		yearMonthEClass = createEClass(YEAR_MONTH);

		dayTimeEClass = createEClass(DAY_TIME);

		binariesEClass = createEClass(BINARIES);

		binaryDoubleEClass = createEClass(BINARY_DOUBLE);

		binaryFloatEClass = createEClass(BINARY_FLOAT);

		bFileEClass = createEClass(BFILE);

		blobEClass = createEClass(BLOB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataDefinitionEClass.getESuperTypes().add(this.getStatement());
		databaseEClass.getESuperTypes().add(this.getDataDefinition());
		tableEClass.getESuperTypes().add(this.getDataDefinition());
		commentTableEClass.getESuperTypes().add(this.getDataDefinition());
		commentColumnEClass.getESuperTypes().add(this.getDataDefinition());
		exactoEClass.getESuperTypes().add(this.getType());
		integerEClass.getESuperTypes().add(this.getExacto());
		smallIntegerEClass.getESuperTypes().add(this.getExacto());
		intEClass.getESuperTypes().add(this.getExacto());
		smallIntEClass.getESuperTypes().add(this.getExacto());
		numberEClass.getESuperTypes().add(this.getExacto());
		numericEClass.getESuperTypes().add(this.getExacto());
		decimalEClass.getESuperTypes().add(this.getExacto());
		aproximadoEClass.getESuperTypes().add(this.getType());
		realEClass.getESuperTypes().add(this.getAproximado());
		doublePrecisionEClass.getESuperTypes().add(this.getAproximado());
		floatEClass.getESuperTypes().add(this.getAproximado());
		longEClass.getESuperTypes().add(this.getAproximado());
		longRawEClass.getESuperTypes().add(this.getAproximado());
		charactersEClass.getESuperTypes().add(this.getType());
		characterEClass.getESuperTypes().add(this.getCharacters());
		characterVaryingEClass.getESuperTypes().add(this.getCharacters());
		charEClass.getESuperTypes().add(this.getCharacters());
		varCharEClass.getESuperTypes().add(this.getCharacters());
		varChar2EClass.getESuperTypes().add(this.getCharacters());
		nVarChar2EClass.getESuperTypes().add(this.getCharacters());
		nCharEClass.getESuperTypes().add(this.getCharacters());
		charVaryingEClass.getESuperTypes().add(this.getCharacters());
		nationalCharEClass.getESuperTypes().add(this.getCharacters());
		nationalCharVaryingEClass.getESuperTypes().add(this.getCharacters());
		nationalCharacterEClass.getESuperTypes().add(this.getCharacters());
		nationalCharacterVaryingEClass.getESuperTypes().add(this.getCharacters());
		nCharVaryingEClass.getESuperTypes().add(this.getCharacters());
		clobEClass.getESuperTypes().add(this.getCharacters());
		nClobEClass.getESuperTypes().add(this.getCharacters());
		bitsEClass.getESuperTypes().add(this.getType());
		bitEClass.getESuperTypes().add(this.getBits());
		bitVaryingEClass.getESuperTypes().add(this.getBit());
		timesEClass.getESuperTypes().add(this.getType());
		dateEClass.getESuperTypes().add(this.getTimes());
		timeEClass.getESuperTypes().add(this.getTimes());
		timestampEClass.getESuperTypes().add(this.getTimes());
		intervalsEClass.getESuperTypes().add(this.getType());
		yearMonthEClass.getESuperTypes().add(this.getIntervals());
		dayTimeEClass.getESuperTypes().add(this.getIntervals());
		binariesEClass.getESuperTypes().add(this.getType());
		binaryDoubleEClass.getESuperTypes().add(this.getBinaries());
		binaryFloatEClass.getESuperTypes().add(this.getBinaries());
		bFileEClass.getESuperTypes().add(this.getBinaries());
		blobEClass.getESuperTypes().add(this.getBinaries());

		// Initialize classes and features; add operations and parameters
		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDefinitionEClass, DataDefinition.class, "DataDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_Types(), this.getType(), null, "types", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddlDefinitionEClass, DDLDefinition.class, "DDLDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDLDefinition_Statements(), this.getStatement(), null, "statements", null, 0, -1, DDLDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDLDefinition_DataType(), this.getDataType(), null, "dataType", null, 0, 1, DDLDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pkEClass, Pk.class, "Pk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPk_NamePk(), ecorePackage.getEString(), "namePk", null, 0, 1, Pk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPk_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, -1, Pk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fkEClass, Fk.class, "Fk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFk_NameFk(), ecorePackage.getEString(), "nameFk", null, 0, 1, Fk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFk_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, -1, Fk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFk_References(), this.getTable(), null, "references", null, 0, 1, Fk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFk_ColumnReference(), ecorePackage.getEString(), "columnReference", null, 0, -1, Fk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFk_Status(), ecorePackage.getEString(), "status", null, 0, 1, Fk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ckEClass, Ck.class, "Ck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCk_NameCk(), ecorePackage.getEString(), "nameCk", null, 0, 1, Ck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCk_Status(), ecorePackage.getEString(), "status", "", 0, 1, Ck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCk_ValuesCk(), this.getValuesCk(), null, "valuesCk", null, 0, -1, Ck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuesCkEClass, ValuesCk.class, "ValuesCk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuesCk_Value(), ecorePackage.getEString(), "value", null, 0, -1, ValuesCk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValuesCk_Comparator(), ecorePackage.getEString(), "comparator", null, 0, 1, ValuesCk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValuesCk_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, ValuesCk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValuesCk_LogConjuntion(), ecorePackage.getEString(), "logConjuntion", null, 0, 1, ValuesCk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_CommentColumn(), ecorePackage.getEString(), "commentColumn", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ColumnNull(), ecorePackage.getEBoolean(), "columnNull", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_ColumnType(), this.getType(), null, "columnType", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_CommentTable(), ecorePackage.getEString(), "commentTable", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), this.getColumn(), null, "columns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_ColumnsPk(), this.getPk(), null, "columnsPk", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_ColumnsFk(), this.getFk(), null, "columnsFk", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Checks(), this.getCk(), null, "checks", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Registries(), this.getRegistry(), null, "registries", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryEClass, DML_DDL.Registry.class, "Registry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistry_RegistryValues(), this.getValue(), null, "registryValues", null, 0, -1, DML_DDL.Registry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValue_Column(), this.getColumn(), null, "column", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentTableEClass, CommentTable.class, "CommentTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentTable_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, CommentTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommentTable_TableComment(), ecorePackage.getEString(), "tableComment", null, 0, 1, CommentTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentColumnEClass, CommentColumn.class, "CommentColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentColumn_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, CommentColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommentColumn_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, CommentColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommentColumn_ColumnComment(), ecorePackage.getEString(), "columnComment", null, 0, 1, CommentColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exactoEClass, Exacto.class, "Exacto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerEClass, DML_DDL.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallIntegerEClass, SmallInteger.class, "SmallInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intEClass, Int.class, "Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallIntEClass, SmallInt.class, "SmallInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberEClass, DML_DDL.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericEClass, Numeric.class, "Numeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalEClass, Decimal.class, "Decimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aproximadoEClass, Aproximado.class, "Aproximado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realEClass, Real.class, "Real", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doublePrecisionEClass, DoublePrecision.class, "DoublePrecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatEClass, DML_DDL.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longEClass, DML_DDL.Long.class, "Long", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longRawEClass, LongRaw.class, "LongRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(charactersEClass, Characters.class, "Characters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacters_N(), ecorePackage.getEString(), "n", "", 0, 1, Characters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterEClass, DML_DDL.Character.class, "Character", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterVaryingEClass, CharacterVarying.class, "CharacterVarying", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(charEClass, Char.class, "Char", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(varCharEClass, VarChar.class, "VarChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(varChar2EClass, VarChar2.class, "VarChar2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nVarChar2EClass, NVarChar2.class, "NVarChar2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nCharEClass, NChar.class, "NChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(charVaryingEClass, CharVarying.class, "CharVarying", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nationalCharEClass, NationalChar.class, "NationalChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nationalCharVaryingEClass, NationalCharVarying.class, "NationalCharVarying", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nationalCharacterEClass, NationalCharacter.class, "NationalCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nationalCharacterVaryingEClass, NationalCharacterVarying.class, "NationalCharacterVarying", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nCharVaryingEClass, NCharVarying.class, "NCharVarying", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clobEClass, Clob.class, "Clob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nClobEClass, NClob.class, "NClob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bitsEClass, Bits.class, "Bits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBits_N(), ecorePackage.getEString(), "n", "", 0, 1, Bits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitEClass, Bit.class, "Bit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bitVaryingEClass, BitVarying.class, "BitVarying", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timesEClass, Times.class, "Times", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timestampEClass, Timestamp.class, "Timestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalsEClass, Intervals.class, "Intervals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yearMonthEClass, YearMonth.class, "YearMonth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dayTimeEClass, DayTime.class, "DayTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binariesEClass, Binaries.class, "Binaries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryDoubleEClass, BinaryDouble.class, "BinaryDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryFloatEClass, BinaryFloat.class, "BinaryFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bFileEClass, BFile.class, "BFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blobEClass, Blob.class, "Blob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DML_DDLPackageImpl
