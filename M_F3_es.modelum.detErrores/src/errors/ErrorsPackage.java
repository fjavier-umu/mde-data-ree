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
	String eNS_URI = "http://modelum.es/Error";

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ID = 0;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__APPLY = 1;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__ID = ERROR__ID;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__APPLY = ERROR__APPLY;

	/**
	 * The feature id for the '<em><b>Porcent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__PORCENT = ERROR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Cont</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__TABLE_CONT = ERROR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__TABLE_REF = ERROR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fk Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__FK_COLUMNS = ERROR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__FK = ERROR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Registries Fk</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR__REGISTRIES_FK = ERROR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Foreign Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_ERROR_FEATURE_COUNT = ERROR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link errors.impl.CheckErrorImpl <em>Check Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see errors.impl.CheckErrorImpl
	 * @see errors.impl.ErrorsPackageImpl#getCheckError()
	 * @generated
	 */
	int CHECK_ERROR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__ID = ERROR__ID;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__APPLY = ERROR__APPLY;

	/**
	 * The feature id for the '<em><b>Porcent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__PORCENT = ERROR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ck</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__CK = ERROR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__TABLE = ERROR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registries Ck</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR__REGISTRIES_CK = ERROR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Check Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ERROR_FEATURE_COUNT = ERROR_FEATURE_COUNT + 4;


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
	 * Returns the meta object for the attribute '{@link errors.Error#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see errors.Error#getId()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Id();

	/**
	 * Returns the meta object for the attribute '{@link errors.Error#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply</em>'.
	 * @see errors.Error#getApply()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Apply();

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
	 * Returns the meta object for the reference '{@link errors.ForeignError#getTableCont <em>Table Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Cont</em>'.
	 * @see errors.ForeignError#getTableCont()
	 * @see #getForeignError()
	 * @generated
	 */
	EReference getForeignError_TableCont();

	/**
	 * Returns the meta object for the reference '{@link errors.ForeignError#getTableRef <em>Table Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Ref</em>'.
	 * @see errors.ForeignError#getTableRef()
	 * @see #getForeignError()
	 * @generated
	 */
	EReference getForeignError_TableRef();

	/**
	 * Returns the meta object for the reference list '{@link errors.ForeignError#getFkColumns <em>Fk Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fk Columns</em>'.
	 * @see errors.ForeignError#getFkColumns()
	 * @see #getForeignError()
	 * @generated
	 */
	EReference getForeignError_FkColumns();

	/**
	 * Returns the meta object for the reference '{@link errors.ForeignError#getFk <em>Fk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fk</em>'.
	 * @see errors.ForeignError#getFk()
	 * @see #getForeignError()
	 * @generated
	 */
	EReference getForeignError_Fk();

	/**
	 * Returns the meta object for the reference list '{@link errors.ForeignError#getRegistriesFk <em>Registries Fk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registries Fk</em>'.
	 * @see errors.ForeignError#getRegistriesFk()
	 * @see #getForeignError()
	 * @generated
	 */
	EReference getForeignError_RegistriesFk();

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
	 * Returns the meta object for the reference '{@link errors.CheckError#getCk <em>Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ck</em>'.
	 * @see errors.CheckError#getCk()
	 * @see #getCheckError()
	 * @generated
	 */
	EReference getCheckError_Ck();

	/**
	 * Returns the meta object for the reference '{@link errors.CheckError#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see errors.CheckError#getTable()
	 * @see #getCheckError()
	 * @generated
	 */
	EReference getCheckError_Table();

	/**
	 * Returns the meta object for the reference list '{@link errors.CheckError#getRegistriesCk <em>Registries Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registries Ck</em>'.
	 * @see errors.CheckError#getRegistriesCk()
	 * @see #getCheckError()
	 * @generated
	 */
	EReference getCheckError_RegistriesCk();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__ID = eINSTANCE.getError_Id();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__APPLY = eINSTANCE.getError_Apply();

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
		 * The meta object literal for the '<em><b>Porcent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_ERROR__PORCENT = eINSTANCE.getForeignError_Porcent();

		/**
		 * The meta object literal for the '<em><b>Table Cont</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_ERROR__TABLE_CONT = eINSTANCE.getForeignError_TableCont();

		/**
		 * The meta object literal for the '<em><b>Table Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_ERROR__TABLE_REF = eINSTANCE.getForeignError_TableRef();

		/**
		 * The meta object literal for the '<em><b>Fk Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_ERROR__FK_COLUMNS = eINSTANCE.getForeignError_FkColumns();

		/**
		 * The meta object literal for the '<em><b>Fk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_ERROR__FK = eINSTANCE.getForeignError_Fk();

		/**
		 * The meta object literal for the '<em><b>Registries Fk</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_ERROR__REGISTRIES_FK = eINSTANCE.getForeignError_RegistriesFk();

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
		 * The meta object literal for the '<em><b>Porcent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ERROR__PORCENT = eINSTANCE.getCheckError_Porcent();

		/**
		 * The meta object literal for the '<em><b>Ck</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_ERROR__CK = eINSTANCE.getCheckError_Ck();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_ERROR__TABLE = eINSTANCE.getCheckError_Table();

		/**
		 * The meta object literal for the '<em><b>Registries Ck</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_ERROR__REGISTRIES_CK = eINSTANCE.getCheckError_RegistriesCk();

	}

} //ErrorsPackage
