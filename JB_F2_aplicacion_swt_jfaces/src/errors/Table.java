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
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link errors.Table#getNameTable <em>Name Table</em>}</li>
 *   <li>{@link errors.Table#getColumnCont <em>Column Cont</em>}</li>
 * </ul>
 * </p>
 *
 * @see errors.ErrorsPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Table</em>' attribute.
	 * @see #setNameTable(String)
	 * @see errors.ErrorsPackage#getTable_NameTable()
	 * @model
	 * @generated
	 */
	String getNameTable();

	/**
	 * Sets the value of the '{@link errors.Table#getNameTable <em>Name Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Table</em>' attribute.
	 * @see #getNameTable()
	 * @generated
	 */
	void setNameTable(String value);

	/**
	 * Returns the value of the '<em><b>Column Cont</b></em>' containment reference list.
	 * The list contents are of type {@link errors.ColumnFk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Cont</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Cont</em>' containment reference list.
	 * @see errors.ErrorsPackage#getTable_ColumnCont()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnFk> getColumnCont();

} // Table
