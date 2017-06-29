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
 * A representation of the model object '<em><b>Pk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.Pk#getNamePk <em>Name Pk</em>}</li>
 *   <li>{@link DML_DDL.Pk#getColumnName <em>Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getPk()
 * @model
 * @generated
 */
public interface Pk extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Pk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Pk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Pk</em>' attribute.
	 * @see #setNamePk(String)
	 * @see DML_DDL.DML_DDLPackage#getPk_NamePk()
	 * @model
	 * @generated
	 */
	String getNamePk();

	/**
	 * Sets the value of the '{@link DML_DDL.Pk#getNamePk <em>Name Pk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Pk</em>' attribute.
	 * @see #getNamePk()
	 * @generated
	 */
	void setNamePk(String value);

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
	 * @see DML_DDL.DML_DDLPackage#getPk_ColumnName()
	 * @model
	 * @generated
	 */
	EList<String> getColumnName();

} // Pk
