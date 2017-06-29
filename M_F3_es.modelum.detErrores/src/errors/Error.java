/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link errors.Error#getId <em>Id</em>}</li>
 *   <li>{@link errors.Error#getApply <em>Apply</em>}</li>
 * </ul>
 * </p>
 *
 * @see errors.ErrorsPackage#getError()
 * @model
 * @generated
 */
public interface Error extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see errors.ErrorsPackage#getError_Id()
	 * @model required="true"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link errors.Error#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Apply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' attribute.
	 * @see #setApply(Boolean)
	 * @see errors.ErrorsPackage#getError_Apply()
	 * @model required="true"
	 * @generated
	 */
	Boolean getApply();

	/**
	 * Sets the value of the '{@link errors.Error#getApply <em>Apply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply</em>' attribute.
	 * @see #getApply()
	 * @generated
	 */
	void setApply(Boolean value);

} // Error
