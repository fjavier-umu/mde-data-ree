/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see errors.ErrorsPackage
 * @generated
 */
public interface ErrorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErrorsFactory eINSTANCE = errors.impl.ErrorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Errores</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Errores</em>'.
	 * @generated
	 */
	Errores createErrores();

	/**
	 * Returns a new object of class '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error</em>'.
	 * @generated
	 */
	errors.Error createError();

	/**
	 * Returns a new object of class '<em>Foreign Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Error</em>'.
	 * @generated
	 */
	ForeignError createForeignError();

	/**
	 * Returns a new object of class '<em>Check Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Error</em>'.
	 * @generated
	 */
	CheckError createCheckError();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ErrorsPackage getErrorsPackage();

} //ErrorsFactory
