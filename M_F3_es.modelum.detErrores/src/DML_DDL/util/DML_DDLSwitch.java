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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see DML_DDL.DML_DDLPackage
 * @generated
 */
public class DML_DDLSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DML_DDLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DML_DDLSwitch() {
		if (modelPackage == null) {
			modelPackage = DML_DDLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DML_DDLPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.DATA_DEFINITION: {
				DataDefinition dataDefinition = (DataDefinition)theEObject;
				T result = caseDataDefinition(dataDefinition);
				if (result == null) result = caseStatement(dataDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.DDL_DEFINITION: {
				DDLDefinition ddlDefinition = (DDLDefinition)theEObject;
				T result = caseDDLDefinition(ddlDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.PK: {
				Pk pk = (Pk)theEObject;
				T result = casePk(pk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.FK: {
				Fk fk = (Fk)theEObject;
				T result = caseFk(fk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.CK: {
				Ck ck = (Ck)theEObject;
				T result = caseCk(ck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.VALUES_CK: {
				ValuesCk valuesCk = (ValuesCk)theEObject;
				T result = caseValuesCk(valuesCk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseDataDefinition(database);
				if (result == null) result = caseStatement(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseDataDefinition(table);
				if (result == null) result = caseStatement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.REGISTRY: {
				Registry registry = (Registry)theEObject;
				T result = caseRegistry(registry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.COMMENT_TABLE: {
				CommentTable commentTable = (CommentTable)theEObject;
				T result = caseCommentTable(commentTable);
				if (result == null) result = caseDataDefinition(commentTable);
				if (result == null) result = caseStatement(commentTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.COMMENT_COLUMN: {
				CommentColumn commentColumn = (CommentColumn)theEObject;
				T result = caseCommentColumn(commentColumn);
				if (result == null) result = caseDataDefinition(commentColumn);
				if (result == null) result = caseStatement(commentColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.EXACTO: {
				Exacto exacto = (Exacto)theEObject;
				T result = caseExacto(exacto);
				if (result == null) result = caseType(exacto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.INTEGER: {
				DML_DDL.Integer integer = (DML_DDL.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseExacto(integer);
				if (result == null) result = caseType(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.SMALL_INTEGER: {
				SmallInteger smallInteger = (SmallInteger)theEObject;
				T result = caseSmallInteger(smallInteger);
				if (result == null) result = caseExacto(smallInteger);
				if (result == null) result = caseType(smallInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.INT: {
				Int int_ = (Int)theEObject;
				T result = caseInt(int_);
				if (result == null) result = caseExacto(int_);
				if (result == null) result = caseType(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.SMALL_INT: {
				SmallInt smallInt = (SmallInt)theEObject;
				T result = caseSmallInt(smallInt);
				if (result == null) result = caseExacto(smallInt);
				if (result == null) result = caseType(smallInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NUMBER: {
				DML_DDL.Number number = (DML_DDL.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseExacto(number);
				if (result == null) result = caseType(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NUMERIC: {
				Numeric numeric = (Numeric)theEObject;
				T result = caseNumeric(numeric);
				if (result == null) result = caseExacto(numeric);
				if (result == null) result = caseType(numeric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.DECIMAL: {
				Decimal decimal = (Decimal)theEObject;
				T result = caseDecimal(decimal);
				if (result == null) result = caseExacto(decimal);
				if (result == null) result = caseType(decimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.APROXIMADO: {
				Aproximado aproximado = (Aproximado)theEObject;
				T result = caseAproximado(aproximado);
				if (result == null) result = caseType(aproximado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.REAL: {
				Real real = (Real)theEObject;
				T result = caseReal(real);
				if (result == null) result = caseAproximado(real);
				if (result == null) result = caseType(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.DOUBLE_PRECISION: {
				DoublePrecision doublePrecision = (DoublePrecision)theEObject;
				T result = caseDoublePrecision(doublePrecision);
				if (result == null) result = caseAproximado(doublePrecision);
				if (result == null) result = caseType(doublePrecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.FLOAT: {
				DML_DDL.Float float_ = (DML_DDL.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = caseAproximado(float_);
				if (result == null) result = caseType(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.LONG: {
				DML_DDL.Long long_ = (DML_DDL.Long)theEObject;
				T result = caseLong(long_);
				if (result == null) result = caseAproximado(long_);
				if (result == null) result = caseType(long_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.LONG_RAW: {
				LongRaw longRaw = (LongRaw)theEObject;
				T result = caseLongRaw(longRaw);
				if (result == null) result = caseAproximado(longRaw);
				if (result == null) result = caseType(longRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.CHARACTERS: {
				Characters characters = (Characters)theEObject;
				T result = caseCharacters(characters);
				if (result == null) result = caseType(characters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.CHARACTER: {
				DML_DDL.Character character = (DML_DDL.Character)theEObject;
				T result = caseCharacter(character);
				if (result == null) result = caseCharacters(character);
				if (result == null) result = caseType(character);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.CHARACTER_VARYING: {
				CharacterVarying characterVarying = (CharacterVarying)theEObject;
				T result = caseCharacterVarying(characterVarying);
				if (result == null) result = caseCharacters(characterVarying);
				if (result == null) result = caseType(characterVarying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.CHAR: {
				Char char_ = (Char)theEObject;
				T result = caseChar(char_);
				if (result == null) result = caseCharacters(char_);
				if (result == null) result = caseType(char_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.VAR_CHAR: {
				VarChar varChar = (VarChar)theEObject;
				T result = caseVarChar(varChar);
				if (result == null) result = caseCharacters(varChar);
				if (result == null) result = caseType(varChar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.VAR_CHAR2: {
				VarChar2 varChar2 = (VarChar2)theEObject;
				T result = caseVarChar2(varChar2);
				if (result == null) result = caseCharacters(varChar2);
				if (result == null) result = caseType(varChar2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NVAR_CHAR2: {
				NVarChar2 nVarChar2 = (NVarChar2)theEObject;
				T result = caseNVarChar2(nVarChar2);
				if (result == null) result = caseCharacters(nVarChar2);
				if (result == null) result = caseType(nVarChar2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NCHAR: {
				NChar nChar = (NChar)theEObject;
				T result = caseNChar(nChar);
				if (result == null) result = caseCharacters(nChar);
				if (result == null) result = caseType(nChar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.CHAR_VARYING: {
				CharVarying charVarying = (CharVarying)theEObject;
				T result = caseCharVarying(charVarying);
				if (result == null) result = caseCharacters(charVarying);
				if (result == null) result = caseType(charVarying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NATIONAL_CHAR: {
				NationalChar nationalChar = (NationalChar)theEObject;
				T result = caseNationalChar(nationalChar);
				if (result == null) result = caseCharacters(nationalChar);
				if (result == null) result = caseType(nationalChar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NATIONAL_CHAR_VARYING: {
				NationalCharVarying nationalCharVarying = (NationalCharVarying)theEObject;
				T result = caseNationalCharVarying(nationalCharVarying);
				if (result == null) result = caseCharacters(nationalCharVarying);
				if (result == null) result = caseType(nationalCharVarying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NATIONAL_CHARACTER: {
				NationalCharacter nationalCharacter = (NationalCharacter)theEObject;
				T result = caseNationalCharacter(nationalCharacter);
				if (result == null) result = caseCharacters(nationalCharacter);
				if (result == null) result = caseType(nationalCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NATIONAL_CHARACTER_VARYING: {
				NationalCharacterVarying nationalCharacterVarying = (NationalCharacterVarying)theEObject;
				T result = caseNationalCharacterVarying(nationalCharacterVarying);
				if (result == null) result = caseCharacters(nationalCharacterVarying);
				if (result == null) result = caseType(nationalCharacterVarying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NCHAR_VARYING: {
				NCharVarying nCharVarying = (NCharVarying)theEObject;
				T result = caseNCharVarying(nCharVarying);
				if (result == null) result = caseCharacters(nCharVarying);
				if (result == null) result = caseType(nCharVarying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.CLOB: {
				Clob clob = (Clob)theEObject;
				T result = caseClob(clob);
				if (result == null) result = caseCharacters(clob);
				if (result == null) result = caseType(clob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.NCLOB: {
				NClob nClob = (NClob)theEObject;
				T result = caseNClob(nClob);
				if (result == null) result = caseCharacters(nClob);
				if (result == null) result = caseType(nClob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.BITS: {
				Bits bits = (Bits)theEObject;
				T result = caseBits(bits);
				if (result == null) result = caseType(bits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.BIT: {
				Bit bit = (Bit)theEObject;
				T result = caseBit(bit);
				if (result == null) result = caseBits(bit);
				if (result == null) result = caseType(bit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.BIT_VARYING: {
				BitVarying bitVarying = (BitVarying)theEObject;
				T result = caseBitVarying(bitVarying);
				if (result == null) result = caseBit(bitVarying);
				if (result == null) result = caseBits(bitVarying);
				if (result == null) result = caseType(bitVarying);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.TIMES: {
				Times times = (Times)theEObject;
				T result = caseTimes(times);
				if (result == null) result = caseType(times);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseTimes(date);
				if (result == null) result = caseType(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseTimes(time);
				if (result == null) result = caseType(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.TIMESTAMP: {
				Timestamp timestamp = (Timestamp)theEObject;
				T result = caseTimestamp(timestamp);
				if (result == null) result = caseTimes(timestamp);
				if (result == null) result = caseType(timestamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.INTERVALS: {
				Intervals intervals = (Intervals)theEObject;
				T result = caseIntervals(intervals);
				if (result == null) result = caseType(intervals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.YEAR_MONTH: {
				YearMonth yearMonth = (YearMonth)theEObject;
				T result = caseYearMonth(yearMonth);
				if (result == null) result = caseIntervals(yearMonth);
				if (result == null) result = caseType(yearMonth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.DAY_TIME: {
				DayTime dayTime = (DayTime)theEObject;
				T result = caseDayTime(dayTime);
				if (result == null) result = caseIntervals(dayTime);
				if (result == null) result = caseType(dayTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.BINARIES: {
				Binaries binaries = (Binaries)theEObject;
				T result = caseBinaries(binaries);
				if (result == null) result = caseType(binaries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.BINARY_DOUBLE: {
				BinaryDouble binaryDouble = (BinaryDouble)theEObject;
				T result = caseBinaryDouble(binaryDouble);
				if (result == null) result = caseBinaries(binaryDouble);
				if (result == null) result = caseType(binaryDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.BINARY_FLOAT: {
				BinaryFloat binaryFloat = (BinaryFloat)theEObject;
				T result = caseBinaryFloat(binaryFloat);
				if (result == null) result = caseBinaries(binaryFloat);
				if (result == null) result = caseType(binaryFloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.BFILE: {
				BFile bFile = (BFile)theEObject;
				T result = caseBFile(bFile);
				if (result == null) result = caseBinaries(bFile);
				if (result == null) result = caseType(bFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DML_DDLPackage.BLOB: {
				Blob blob = (Blob)theEObject;
				T result = caseBlob(blob);
				if (result == null) result = caseBinaries(blob);
				if (result == null) result = caseType(blob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDefinition(DataDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDL Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDL Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDLDefinition(DDLDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePk(Pk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFk(Fk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ck</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ck</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCk(Ck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Values Ck</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Values Ck</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuesCk(ValuesCk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistry(Registry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentTable(CommentTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentColumn(CommentColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exacto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exacto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExacto(Exacto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(DML_DDL.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallInteger(SmallInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInt(Int object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallInt(SmallInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(DML_DDL.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeric(Numeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimal(Decimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aproximado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aproximado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAproximado(Aproximado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Precision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Precision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoublePrecision(DoublePrecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(DML_DDL.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLong(DML_DDL.Long object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongRaw(LongRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacters(Characters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter(DML_DDL.Character object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Varying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Varying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterVarying(CharacterVarying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChar(Char object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarChar(VarChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Char2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Char2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarChar2(VarChar2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NVar Char2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NVar Char2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNVarChar2(NVarChar2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NChar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NChar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNChar(NChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Varying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Varying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharVarying(CharVarying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>National Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>National Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNationalChar(NationalChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>National Char Varying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>National Char Varying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNationalCharVarying(NationalCharVarying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>National Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>National Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNationalCharacter(NationalCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>National Character Varying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>National Character Varying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNationalCharacterVarying(NationalCharacterVarying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NChar Varying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NChar Varying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNCharVarying(NCharVarying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClob(Clob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NClob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NClob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNClob(NClob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBits(Bits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBit(Bit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Varying</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Varying</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitVarying(BitVarying object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Times</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Times</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimes(Times object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimestamp(Timestamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intervals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intervals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervals(Intervals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year Month</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Month</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYearMonth(YearMonth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayTime(DayTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binaries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binaries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaries(Binaries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryDouble(BinaryDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryFloat(BinaryFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFile(BFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlob(Blob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DML_DDLSwitch
