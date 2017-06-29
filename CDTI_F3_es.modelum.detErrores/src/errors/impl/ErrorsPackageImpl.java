/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors.impl;

import DML_DDL.DML_DDLPackage;

import DML_DDL.impl.DML_DDLPackageImpl;

import errors.CheckError;
import errors.Errores;
import errors.ErrorsFactory;
import errors.ErrorsPackage;
import errors.ForeignError;

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
public class ErrorsPackageImpl extends EPackageImpl implements ErrorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erroresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkErrorEClass = null;

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
	 * @see errors.ErrorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErrorsPackageImpl() {
		super(eNS_URI, ErrorsFactory.eINSTANCE);
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
	public static ErrorsPackage init() {
		if (isInited) return (ErrorsPackage)EPackage.Registry.INSTANCE.getEPackage(ErrorsPackage.eNS_URI);

		// Obtain or create and register package
		ErrorsPackageImpl theErrorsPackage = (ErrorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ErrorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ErrorsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DML_DDLPackageImpl theDML_DDLPackage = (DML_DDLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DML_DDLPackage.eNS_URI) instanceof DML_DDLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DML_DDLPackage.eNS_URI) : DML_DDLPackage.eINSTANCE);

		// Create package meta-data objects
		theErrorsPackage.createPackageContents();
		theDML_DDLPackage.createPackageContents();

		// Initialize created meta-data
		theErrorsPackage.initializePackageContents();
		theDML_DDLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theErrorsPackage.freeze();

		return theErrorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrores() {
		return erroresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrores_Errores() {
		return (EReference)erroresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getError() {
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_Id() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_Apply() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeignError() {
		return foreignErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForeignError_Porcent() {
		return (EAttribute)foreignErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignError_TableCont() {
		return (EReference)foreignErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignError_TableRef() {
		return (EReference)foreignErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignError_FkColumns() {
		return (EReference)foreignErrorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignError_Fk() {
		return (EReference)foreignErrorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignError_RegistriesFk() {
		return (EReference)foreignErrorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckError() {
		return checkErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckError_Porcent() {
		return (EAttribute)checkErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckError_Ck() {
		return (EReference)checkErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckError_Table() {
		return (EReference)checkErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckError_RegistriesCk() {
		return (EReference)checkErrorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorsFactory getErrorsFactory() {
		return (ErrorsFactory)getEFactoryInstance();
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
		erroresEClass = createEClass(ERRORES);
		createEReference(erroresEClass, ERRORES__ERRORES);

		errorEClass = createEClass(ERROR);
		createEAttribute(errorEClass, ERROR__ID);
		createEAttribute(errorEClass, ERROR__APPLY);

		foreignErrorEClass = createEClass(FOREIGN_ERROR);
		createEAttribute(foreignErrorEClass, FOREIGN_ERROR__PORCENT);
		createEReference(foreignErrorEClass, FOREIGN_ERROR__TABLE_CONT);
		createEReference(foreignErrorEClass, FOREIGN_ERROR__TABLE_REF);
		createEReference(foreignErrorEClass, FOREIGN_ERROR__FK_COLUMNS);
		createEReference(foreignErrorEClass, FOREIGN_ERROR__FK);
		createEReference(foreignErrorEClass, FOREIGN_ERROR__REGISTRIES_FK);

		checkErrorEClass = createEClass(CHECK_ERROR);
		createEAttribute(checkErrorEClass, CHECK_ERROR__PORCENT);
		createEReference(checkErrorEClass, CHECK_ERROR__CK);
		createEReference(checkErrorEClass, CHECK_ERROR__TABLE);
		createEReference(checkErrorEClass, CHECK_ERROR__REGISTRIES_CK);
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

		// Obtain other dependent packages
		DML_DDLPackage theDML_DDLPackage = (DML_DDLPackage)EPackage.Registry.INSTANCE.getEPackage(DML_DDLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		foreignErrorEClass.getESuperTypes().add(this.getError());
		checkErrorEClass.getESuperTypes().add(this.getError());

		// Initialize classes and features; add operations and parameters
		initEClass(erroresEClass, Errores.class, "Errores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrores_Errores(), this.getError(), null, "errores", null, 0, -1, Errores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorEClass, errors.Error.class, "Error", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getError_Id(), ecorePackage.getEIntegerObject(), "id", null, 1, 1, errors.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Apply(), ecorePackage.getEBooleanObject(), "apply", null, 1, 1, errors.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreignErrorEClass, ForeignError.class, "ForeignError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForeignError_Porcent(), ecorePackage.getEIntegerObject(), "porcent", null, 0, 1, ForeignError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignError_TableCont(), theDML_DDLPackage.getTable(), null, "tableCont", null, 0, 1, ForeignError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignError_TableRef(), theDML_DDLPackage.getTable(), null, "tableRef", null, 0, 1, ForeignError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignError_FkColumns(), theDML_DDLPackage.getColumn(), null, "fkColumns", null, 0, -1, ForeignError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignError_Fk(), theDML_DDLPackage.getFk(), null, "fk", null, 0, 1, ForeignError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignError_RegistriesFk(), theDML_DDLPackage.getRegistry(), null, "registriesFk", null, 0, -1, ForeignError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkErrorEClass, CheckError.class, "CheckError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckError_Porcent(), ecorePackage.getEIntegerObject(), "porcent", null, 0, 1, CheckError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckError_Ck(), theDML_DDLPackage.getCk(), null, "ck", null, 0, 1, CheckError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckError_Table(), theDML_DDLPackage.getTable(), null, "table", null, 0, 1, CheckError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckError_RegistriesCk(), theDML_DDLPackage.getRegistry(), null, "registriesCk", null, 0, -1, CheckError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ErrorsPackageImpl
