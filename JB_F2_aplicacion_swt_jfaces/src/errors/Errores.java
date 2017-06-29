/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Errores</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link errors.Errores#getErrores <em>Errores</em>}</li>
 * </ul>
 * </p>
 *
 * @see errors.ErrorsPackage#getErrores()
 * @model
 * @generated
 */
public interface Errores extends EObject {
	/**
	 * Returns the value of the '<em><b>Errores</b></em>' containment reference list.
	 * The list contents are of type {@link errors.Error}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errores</em>' containment reference list.
	 * @see errors.ErrorsPackage#getErrores_Errores()
	 * @model containment="true"
	 * @generated
	 */
	EList<errors.Error> getErrores();

} // Errores
