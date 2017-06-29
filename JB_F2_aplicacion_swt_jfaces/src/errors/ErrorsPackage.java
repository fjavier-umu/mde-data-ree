/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see errors.ErrorsFactory
 * @model kind="package"
 * @generated
 */
public interface ErrorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "errors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelum.es/gra2mol/examples/Error";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ERR";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErrorsPackage eINSTANCE = errors.impl.ErrorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link errors.impl.ErroresImpl <em>Errores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see errors.impl.ErroresImpl
	 * @see errors.impl.ErrorsPackageImpl#getErrores()
	 * @generated
	 */
	int ERRORES = 0;

	/**
	 * The feature id for the '<em><b>Errores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRORES__ERRORES = 0;

	/**
	 * The number of structural features of the '<em>Errores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRORES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link errors.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see errors.impl.ErrorImpl
	 * @see errors.impl.ErrorsPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 1;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link errors.impl.ForeignErrorImpl <em>Foreign Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see errors.impl.ForeignErrorImpl
	 * @see errors.impl.ErrorsPackageImpl#getForeignError()
	 * @generated
	 */
	int FOREIGN_ERROR = 2;

	/**
	 * The feature id for the '<em><b>Name Fk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__NAME_FK = ERROR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Porcent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__PORCENT = ERROR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__TABLE_CONT = ERROR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__TABLE_REF = ERROR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Foreign Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR_FEATURE_COUNT = ERROR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link errors.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see errors.impl.TableImpl
	 * @see errors.impl.ErrorsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 3;

	/**
	 * The feature id for the '<em><b>Name Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Column Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMN_CONT = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link errors.impl.ColumnFkImpl <em>Column Fk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see errors.impl.ColumnFkImpl
	 * @see errors.impl.ErrorsPackageImpl#getColumnFk()
	 * @generated
	 */
	int COLUMN_FK = 4;

	/**
	 * The feature id for the '<em><b>Name Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FK__NAME_COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Column Fk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link errors.impl.CheckErrorImpl <em>Check Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see errors.impl.CheckErrorImpl
	 * @see errors.impl.ErrorsPackageImpl#getCheckError()
	 * @generated
	 */
	int CHECK_ERROR = 5;

	/**
	 * The feature id for the '<em><b>Name Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__NAME_TABLE = ERROR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Ck</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__NAME_CK = ERROR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Porcent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__PORCENT = ERROR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__COLUMNS = ERROR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Check Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR_FEATURE_COUNT = ERROR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link errors.impl.ColumnCkImpl <em>Column Ck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see errors.impl.ColumnCkImpl
	 * @see errors.impl.ErrorsPackageImpl#getColumnCk()
	 * @generated
	 */
	int COLUMN_CK = 6;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CK__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CK__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Column Ck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link errors.impl.ValueCkImpl <em>Value Ck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see errors.impl.ValueCkImpl
	 * @see errors.impl.ErrorsPackageImpl#getValueCk()
	 * @generated
	 */
	int VALUE_CK = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CK__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value Ck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CK_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link errors.Errores <em>Errores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Errores</em>'.
	 * @see errors.Errores
	 * @generated
	 */
	EClass getErrores();

	/**
	 * Returns the meta object for the containment reference list '{@link errors.Errores#getErrores <em>Errores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errores</em>'.
	 * @see errors.Errores#getErrores()
	 * @see #getErrores()
	 * @generated
	 */
	EReference getErrores_Errores();

	/**
	 * Returns the meta object for class '{@link errors.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see errors.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for class '{@link errors.ForeignError <em>Foreign Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Error</em>'.
	 * @see errors.ForeignError
	 * @generated
	 */
	EClass getForeignError();

	/**
	 * Returns the meta object for the attribute '{@link errors.ForeignError#getNameFk <em>Name Fk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Fk</em>'.
	 * @see errors.ForeignError#getNameFk()
	 * @see #getForeignError()
	 * @generated
	 */
	EAttribute getForeignError_NameFk();

	/**
	 * Returns the meta object for the attribute '{@link errors.ForeignError#getPorcent <em>Porcent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Porcent</em>'.
	 * @see errors.ForeignError#getPorcent()
	 * @see #getForeignError()
	 * @generated
	 */
	EAttribute getForeignError_Porcent();

	/**
	 * Returns the meta object for the containment reference '{@link errors.ForeignError#getTableCont <em>Table Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Cont</em>'.
	 * @see errors.ForeignError#getTableCont()
	 * @see #getForeignError()
	 * @generated
	 */
	EReference getForeignError_TableCont();

	/**
	 * Returns the meta object for the containment reference '{@link errors.ForeignError#getTableRef <em>Table Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Ref</em>'.
	 * @see errors.ForeignError#getTableRef()
	 * @see #getForeignError()
	 * @generated
	 */
	EReference getForeignError_TableRef();

	/**
	 * Returns the meta object for class '{@link errors.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see errors.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link errors.Table#getNameTable <em>Name Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Table</em>'.
	 * @see errors.Table#getNameTable()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_NameTable();

	/**
	 * Returns the meta object for the containment reference list '{@link errors.Table#getColumnCont <em>Column Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Cont</em>'.
	 * @see errors.Table#getColumnCont()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ColumnCont();

	/**
	 * Returns the meta object for class '{@link errors.ColumnFk <em>Column Fk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Fk</em>'.
	 * @see errors.ColumnFk
	 * @generated
	 */
	EClass getColumnFk();

	/**
	 * Returns the meta object for the attribute '{@link errors.ColumnFk#getNameColumn <em>Name Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Column</em>'.
	 * @see errors.ColumnFk#getNameColumn()
	 * @see #getColumnFk()
	 * @generated
	 */
	EAttribute getColumnFk_NameColumn();

	/**
	 * Returns the meta object for class '{@link errors.CheckError <em>Check Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Error</em>'.
	 * @see errors.CheckError
	 * @generated
	 */
	EClass getCheckError();

	/**
	 * Returns the meta object for the attribute '{@link errors.CheckError#getNameTable <em>Name Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Table</em>'.
	 * @see errors.CheckError#getNameTable()
	 * @see #getCheckError()
	 * @generated
	 */
	EAttribute getCheckError_NameTable();

	/**
	 * Returns the meta object for the attribute '{@link errors.CheckError#getNameCk <em>Name Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Ck</em>'.
	 * @see errors.CheckError#getNameCk()
	 * @see #getCheckError()
	 * @generated
	 */
	EAttribute getCheckError_NameCk();

	/**
	 * Returns the meta object for the attribute '{@link errors.CheckError#getPorcent <em>Porcent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Porcent</em>'.
	 * @see errors.CheckError#getPorcent()
	 * @see #getCheckError()
	 * @generated
	 */
	EAttribute getCheckError_Porcent();

	/**
	 * Returns the meta object for the containment reference list '{@link errors.CheckError#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see errors.CheckError#getColumns()
	 * @see #getCheckError()
	 * @generated
	 */
	EReference getCheckError_Columns();

	/**
	 * Returns the meta object for class '{@link errors.ColumnCk <em>Column Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Ck</em>'.
	 * @see errors.ColumnCk
	 * @generated
	 */
	EClass getColumnCk();

	/**
	 * Returns the meta object for the attribute '{@link errors.ColumnCk#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see errors.ColumnCk#getColumnName()
	 * @see #getColumnCk()
	 * @generated
	 */
	EAttribute getColumnCk_ColumnName();

	/**
	 * Returns the meta object for the containment reference list '{@link errors.ColumnCk#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see errors.ColumnCk#getValues()
	 * @see #getColumnCk()
	 * @generated
	 */
	EReference getColumnCk_Values();

	/**
	 * Returns the meta object for class '{@link errors.ValueCk <em>Value Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Ck</em>'.
	 * @see errors.ValueCk
	 * @generated
	 */
	EClass getValueCk();

	/**
	 * Returns the meta object for the attribute '{@link errors.ValueCk#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see errors.ValueCk#getValue()
	 * @see #getValueCk()
	 * @generated
	 */
	EAttribute getValueCk_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErrorsFactory getErrorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link errors.impl.ErroresImpl <em>Errores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see errors.impl.ErroresImpl
		 * @see errors.impl.ErrorsPackageImpl#getErrores()
		 * @generated
		 */
		EClass ERRORES = eINSTANCE.getErrores();

		/**
		 * The meta object literal for the '<em><b>Errores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERRORES__ERRORES = eINSTANCE.getErrores_Errores();

		/**
		 * The meta object literal for the '{@link errors.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see errors.impl.ErrorImpl
		 * @see errors.impl.ErrorsPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '{@link errors.impl.ForeignErrorImpl <em>Foreign Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see errors.impl.ForeignErrorImpl
		 * @see errors.impl.ErrorsPackageImpl#getForeignError()
		 * @generated
		 */
		EClass FOREIGN_ERROR = eINSTANCE.getForeignError();

		/**
		 * The meta object literal for the '<em><b>Name Fk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_ERROR__NAME_FK = eINSTANCE.getForeignError_NameFk();

		/**
		 * The meta object literal for the '<em><b>Porcent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_ERROR__PORCENT = eINSTANCE.getForeignError_Porcent();

		/**
		 * The meta object literal for the '<em><b>Table Cont</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_ERROR__TABLE_CONT = eINSTANCE.getForeignError_TableCont();

		/**
		 * The meta object literal for the '<em><b>Table Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_ERROR__TABLE_REF = eINSTANCE.getForeignError_TableRef();

		/**
		 * The meta object literal for the '{@link errors.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see errors.impl.TableImpl
		 * @see errors.impl.ErrorsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME_TABLE = eINSTANCE.getTable_NameTable();

		/**
		 * The meta object literal for the '<em><b>Column Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMN_CONT = eINSTANCE.getTable_ColumnCont();

		/**
		 * The meta object literal for the '{@link errors.impl.ColumnFkImpl <em>Column Fk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see errors.impl.ColumnFkImpl
		 * @see errors.impl.ErrorsPackageImpl#getColumnFk()
		 * @generated
		 */
		EClass COLUMN_FK = eINSTANCE.getColumnFk();

		/**
		 * The meta object literal for the '<em><b>Name Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_FK__NAME_COLUMN = eINSTANCE.getColumnFk_NameColumn();

		/**
		 * The meta object literal for the '{@link errors.impl.CheckErrorImpl <em>Check Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see errors.impl.CheckErrorImpl
		 * @see errors.impl.ErrorsPackageImpl#getCheckError()
		 * @generated
		 */
		EClass CHECK_ERROR = eINSTANCE.getCheckError();

		/**
		 * The meta object literal for the '<em><b>Name Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ERROR__NAME_TABLE = eINSTANCE.getCheckError_NameTable();

		/**
		 * The meta object literal for the '<em><b>Name Ck</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ERROR__NAME_CK = eINSTANCE.getCheckError_NameCk();

		/**
		 * The meta object literal for the '<em><b>Porcent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ERROR__PORCENT = eINSTANCE.getCheckError_Porcent();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_ERROR__COLUMNS = eINSTANCE.getCheckError_Columns();

		/**
		 * The meta object literal for the '{@link errors.impl.ColumnCkImpl <em>Column Ck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see errors.impl.ColumnCkImpl
		 * @see errors.impl.ErrorsPackageImpl#getColumnCk()
		 * @generated
		 */
		EClass COLUMN_CK = eINSTANCE.getColumnCk();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CK__COLUMN_NAME = eINSTANCE.getColumnCk_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_CK__VALUES = eINSTANCE.getColumnCk_Values();

		/**
		 * The meta object literal for the '{@link errors.impl.ValueCkImpl <em>Value Ck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see errors.impl.ValueCkImpl
		 * @see errors.impl.ErrorsPackageImpl#getValueCk()
		 * @generated
		 */
		EClass VALUE_CK = eINSTANCE.getValueCk();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CK__VALUE = eINSTANCE.getValueCk_Value();

	}

} //ErrorsPackage
