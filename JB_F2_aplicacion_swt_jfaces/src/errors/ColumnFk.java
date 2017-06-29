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
 * A representation of the model object '<em><b>Column Fk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link errors.ColumnFk#getNameColumn <em>Name Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see errors.ErrorsPackage#getColumnFk()
 * @model
 * @generated
 */
public interface ColumnFk extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Column</em>' attribute.
	 * @see #setNameColumn(String)
	 * @see errors.ErrorsPackage#getColumnFk_NameColumn()
	 * @model
	 * @generated
	 */
	String getNameColumn();

	/**
	 * Sets the value of the '{@link errors.ColumnFk#getNameColumn <em>Name Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Column</em>' attribute.
	 * @see #getNameColumn()
	 * @generated
	 */
	void setNameColumn(String value);

} // ColumnFk
