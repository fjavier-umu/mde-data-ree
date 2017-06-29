/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DML_DDL.DML_DDLPackage
 * @generated
 */
public interface DML_DDLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DML_DDLFactory eINSTANCE = DML_DDL.impl.DML_DDLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Definition</em>'.
	 * @generated
	 */
	DataDefinition createDataDefinition();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>DDL Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DDL Definition</em>'.
	 * @generated
	 */
	DDLDefinition createDDLDefinition();

	/**
	 * Returns a new object of class '<em>Pk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pk</em>'.
	 * @generated
	 */
	Pk createPk();

	/**
	 * Returns a new object of class '<em>Fk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fk</em>'.
	 * @generated
	 */
	Fk createFk();

	/**
	 * Returns a new object of class '<em>Ck</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ck</em>'.
	 * @generated
	 */
	Ck createCk();

	/**
	 * Returns a new object of class '<em>Values Ck</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Values Ck</em>'.
	 * @generated
	 */
	ValuesCk createValuesCk();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry</em>'.
	 * @generated
	 */
	Registry createRegistry();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Comment Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Table</em>'.
	 * @generated
	 */
	CommentTable createCommentTable();

	/**
	 * Returns a new object of class '<em>Comment Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Column</em>'.
	 * @generated
	 */
	CommentColumn createCommentColumn();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Exacto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exacto</em>'.
	 * @generated
	 */
	Exacto createExacto();

	/**
	 * Returns a new object of class '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer</em>'.
	 * @generated
	 */
	DML_DDL.Integer createInteger();

	/**
	 * Returns a new object of class '<em>Small Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Small Integer</em>'.
	 * @generated
	 */
	SmallInteger createSmallInteger();

	/**
	 * Returns a new object of class '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int</em>'.
	 * @generated
	 */
	Int createInt();

	/**
	 * Returns a new object of class '<em>Small Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Small Int</em>'.
	 * @generated
	 */
	SmallInt createSmallInt();

	/**
	 * Returns a new object of class '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number</em>'.
	 * @generated
	 */
	DML_DDL.Number createNumber();

	/**
	 * Returns a new object of class '<em>Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric</em>'.
	 * @generated
	 */
	Numeric createNumeric();

	/**
	 * Returns a new object of class '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal</em>'.
	 * @generated
	 */
	Decimal createDecimal();

	/**
	 * Returns a new object of class '<em>Aproximado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aproximado</em>'.
	 * @generated
	 */
	Aproximado createAproximado();

	/**
	 * Returns a new object of class '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real</em>'.
	 * @generated
	 */
	Real createReal();

	/**
	 * Returns a new object of class '<em>Double Precision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Precision</em>'.
	 * @generated
	 */
	DoublePrecision createDoublePrecision();

	/**
	 * Returns a new object of class '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float</em>'.
	 * @generated
	 */
	DML_DDL.Float createFloat();

	/**
	 * Returns a new object of class '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long</em>'.
	 * @generated
	 */
	DML_DDL.Long createLong();

	/**
	 * Returns a new object of class '<em>Long Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Raw</em>'.
	 * @generated
	 */
	LongRaw createLongRaw();

	/**
	 * Returns a new object of class '<em>Characters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characters</em>'.
	 * @generated
	 */
	Characters createCharacters();

	/**
	 * Returns a new object of class '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character</em>'.
	 * @generated
	 */
	DML_DDL.Character createCharacter();

	/**
	 * Returns a new object of class '<em>Character Varying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Varying</em>'.
	 * @generated
	 */
	CharacterVarying createCharacterVarying();

	/**
	 * Returns a new object of class '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char</em>'.
	 * @generated
	 */
	Char createChar();

	/**
	 * Returns a new object of class '<em>Var Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Char</em>'.
	 * @generated
	 */
	VarChar createVarChar();

	/**
	 * Returns a new object of class '<em>Var Char2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Char2</em>'.
	 * @generated
	 */
	VarChar2 createVarChar2();

	/**
	 * Returns a new object of class '<em>NVar Char2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NVar Char2</em>'.
	 * @generated
	 */
	NVarChar2 createNVarChar2();

	/**
	 * Returns a new object of class '<em>NChar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NChar</em>'.
	 * @generated
	 */
	NChar createNChar();

	/**
	 * Returns a new object of class '<em>Char Varying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Varying</em>'.
	 * @generated
	 */
	CharVarying createCharVarying();

	/**
	 * Returns a new object of class '<em>National Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>National Char</em>'.
	 * @generated
	 */
	NationalChar createNationalChar();

	/**
	 * Returns a new object of class '<em>National Char Varying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>National Char Varying</em>'.
	 * @generated
	 */
	NationalCharVarying createNationalCharVarying();

	/**
	 * Returns a new object of class '<em>National Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>National Character</em>'.
	 * @generated
	 */
	NationalCharacter createNationalCharacter();

	/**
	 * Returns a new object of class '<em>National Character Varying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>National Character Varying</em>'.
	 * @generated
	 */
	NationalCharacterVarying createNationalCharacterVarying();

	/**
	 * Returns a new object of class '<em>NChar Varying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NChar Varying</em>'.
	 * @generated
	 */
	NCharVarying createNCharVarying();

	/**
	 * Returns a new object of class '<em>Clob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clob</em>'.
	 * @generated
	 */
	Clob createClob();

	/**
	 * Returns a new object of class '<em>NClob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NClob</em>'.
	 * @generated
	 */
	NClob createNClob();

	/**
	 * Returns a new object of class '<em>Bits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bits</em>'.
	 * @generated
	 */
	Bits createBits();

	/**
	 * Returns a new object of class '<em>Bit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit</em>'.
	 * @generated
	 */
	Bit createBit();

	/**
	 * Returns a new object of class '<em>Bit Varying</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Varying</em>'.
	 * @generated
	 */
	BitVarying createBitVarying();

	/**
	 * Returns a new object of class '<em>Times</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Times</em>'.
	 * @generated
	 */
	Times createTimes();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timestamp</em>'.
	 * @generated
	 */
	Timestamp createTimestamp();

	/**
	 * Returns a new object of class '<em>Intervals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intervals</em>'.
	 * @generated
	 */
	Intervals createIntervals();

	/**
	 * Returns a new object of class '<em>Year Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year Month</em>'.
	 * @generated
	 */
	YearMonth createYearMonth();

	/**
	 * Returns a new object of class '<em>Day Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day Time</em>'.
	 * @generated
	 */
	DayTime createDayTime();

	/**
	 * Returns a new object of class '<em>Binaries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binaries</em>'.
	 * @generated
	 */
	Binaries createBinaries();

	/**
	 * Returns a new object of class '<em>Binary Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Double</em>'.
	 * @generated
	 */
	BinaryDouble createBinaryDouble();

	/**
	 * Returns a new object of class '<em>Binary Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Float</em>'.
	 * @generated
	 */
	BinaryFloat createBinaryFloat();

	/**
	 * Returns a new object of class '<em>BFile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BFile</em>'.
	 * @generated
	 */
	BFile createBFile();

	/**
	 * Returns a new object of class '<em>Blob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blob</em>'.
	 * @generated
	 */
	Blob createBlob();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DML_DDLPackage getDML_DDLPackage();

} //DML_DDLFactory
