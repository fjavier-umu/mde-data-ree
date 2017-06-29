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
 * A representation of the model object '<em><b>Fk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.Fk#getNameFk <em>Name Fk</em>}</li>
 *   <li>{@link DML_DDL.Fk#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link DML_DDL.Fk#getReferences <em>References</em>}</li>
 *   <li>{@link DML_DDL.Fk#getColumnReference <em>Column Reference</em>}</li>
 *   <li>{@link DML_DDL.Fk#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getFk()
 * @model
 * @generated
 */
public interface Fk extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Fk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Fk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Fk</em>' attribute.
	 * @see #setNameFk(String)
	 * @see DML_DDL.DML_DDLPackage#getFk_NameFk()
	 * @model
	 * @generated
	 */
	String getNameFk();

	/**
	 * Sets the value of the '{@link DML_DDL.Fk#getNameFk <em>Name Fk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Fk</em>' attribute.
	 * @see #getNameFk()
	 * @generated
	 */
	void setNameFk(String value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute list.
	 * @see DML_DDL.DML_DDLPackage#getFk_ColumnName()
	 * @model
	 * @generated
	 */
	EList<String> getColumnName();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference.
	 * @see #setReferences(Table)
	 * @see DML_DDL.DML_DDLPackage#getFk_References()
	 * @model
	 * @generated
	 */
	Table getReferences();

	/**
	 * Sets the value of the '{@link DML_DDL.Fk#getReferences <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(Table value);

	/**
	 * Returns the value of the '<em><b>Column Reference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Reference</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Reference</em>' attribute list.
	 * @see DML_DDL.DML_DDLPackage#getFk_ColumnReference()
	 * @model
	 * @generated
	 */
	EList<String> getColumnReference();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see DML_DDL.DML_DDLPackage#getFk_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link DML_DDL.Fk#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // Fk
