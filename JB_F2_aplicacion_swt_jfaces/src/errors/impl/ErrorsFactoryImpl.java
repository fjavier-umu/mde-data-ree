/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors.impl;

import errors.CheckError;
import errors.ColumnCk;
import errors.ColumnFk;
import errors.Errores;
import errors.ErrorsFactory;
import errors.ErrorsPackage;
import errors.ForeignError;
import errors.Table;
import errors.ValueCk;

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
public class ErrorsFactoryImpl extends EFactoryImpl implements ErrorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErrorsFactory init() {
		try {
			ErrorsFactory theErrorsFactory = (ErrorsFactory)EPackage.Registry.INSTANCE.getEFactory("http://modelum.es/gra2mol/examples/Error"); 
			if (theErrorsFactory != null) {
				return theErrorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErrorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorsFactoryImpl() {
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
			case ErrorsPackage.ERRORES: return createErrores();
			case ErrorsPackage.ERROR: return createError();
			case ErrorsPackage.FOREIGN_ERROR: return createForeignError();
			case ErrorsPackage.TABLE: return createTable();
			case ErrorsPackage.COLUMN_FK: return createColumnFk();
			case ErrorsPackage.CHECK_ERROR: return createCheckError();
			case ErrorsPackage.COLUMN_CK: return createColumnCk();
			case ErrorsPackage.VALUE_CK: return createValueCk();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Errores createErrores() {
		ErroresImpl errores = new ErroresImpl();
		return errores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public errors.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignError createForeignError() {
		ForeignErrorImpl foreignError = new ForeignErrorImpl();
		return foreignError;
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
	public ColumnFk createColumnFk() {
		ColumnFkImpl columnFk = new ColumnFkImpl();
		return columnFk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckError createCheckError() {
		CheckErrorImpl checkError = new CheckErrorImpl();
		return checkError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnCk createColumnCk() {
		ColumnCkImpl columnCk = new ColumnCkImpl();
		return columnCk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueCk createValueCk() {
		ValueCkImpl valueCk = new ValueCkImpl();
		return valueCk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorsPackage getErrorsPackage() {
		return (ErrorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErrorsPackage getPackage() {
		return ErrorsPackage.eINSTANCE;
	}

} //ErrorsFactoryImpl
