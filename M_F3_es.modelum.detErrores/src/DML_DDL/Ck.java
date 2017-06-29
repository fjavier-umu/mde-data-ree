/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.Ck#getNameCk <em>Name Ck</em>}</li>
 *   <li>{@link DML_DDL.Ck#getStatus <em>Status</em>}</li>
 *   <li>{@link DML_DDL.Ck#getValuesCk <em>Values Ck</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getCk()
 * @model
 * @generated
 */
public interface Ck extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Ck</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Ck</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Ck</em>' attribute.
	 * @see #setNameCk(String)
	 * @see DML_DDL.DML_DDLPackage#getCk_NameCk()
	 * @model
	 * @generated
	 */
	String getNameCk();

	/**
	 * Sets the value of the '{@link DML_DDL.Ck#getNameCk <em>Name Ck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Ck</em>' attribute.
	 * @see #getNameCk()
	 * @generated
	 */
	void setNameCk(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see DML_DDL.DML_DDLPackage#getCk_Status()
	 * @model default=""
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link DML_DDL.Ck#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Values Ck</b></em>' containment reference list.
	 * The list contents are of type {@link DML_DDL.ValuesCk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Ck</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Ck</em>' containment reference list.
	 * @see DML_DDL.DML_DDLPackage#getCk_ValuesCk()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValuesCk> getValuesCk();

} // Ck
