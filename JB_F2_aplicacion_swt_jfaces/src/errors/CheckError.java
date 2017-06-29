/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link errors.CheckError#getNameTable <em>Name Table</em>}</li>
 *   <li>{@link errors.CheckError#getNameCk <em>Name Ck</em>}</li>
 *   <li>{@link errors.CheckError#getPorcent <em>Porcent</em>}</li>
 *   <li>{@link errors.CheckError#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see errors.ErrorsPackage#getCheckError()
 * @model
 * @generated
 */
public interface CheckError extends errors.Error {
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
	 * @see errors.ErrorsPackage#getCheckError_NameTable()
	 * @model
	 * @generated
	 */
	String getNameTable();

	/**
	 * Sets the value of the '{@link errors.CheckError#getNameTable <em>Name Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Table</em>' attribute.
	 * @see #getNameTable()
	 * @generated
	 */
	void setNameTable(String value);

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
	 * @see errors.ErrorsPackage#getCheckError_NameCk()
	 * @model
	 * @generated
	 */
	String getNameCk();

	/**
	 * Sets the value of the '{@link errors.CheckError#getNameCk <em>Name Ck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Ck</em>' attribute.
	 * @see #getNameCk()
	 * @generated
	 */
	void setNameCk(String value);

	/**
	 * Returns the value of the '<em><b>Porcent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porcent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porcent</em>' attribute.
	 * @see #setPorcent(Integer)
	 * @see errors.ErrorsPackage#getCheckError_Porcent()
	 * @model
	 * @generated
	 */
	Integer getPorcent();

	/**
	 * Sets the value of the '{@link errors.CheckError#getPorcent <em>Porcent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porcent</em>' attribute.
	 * @see #getPorcent()
	 * @generated
	 */
	void setPorcent(Integer value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link errors.ColumnCk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see errors.ErrorsPackage#getCheckError_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnCk> getColumns();

} // CheckError
