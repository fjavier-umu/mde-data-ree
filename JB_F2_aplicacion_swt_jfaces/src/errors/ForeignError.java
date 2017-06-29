/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link errors.ForeignError#getNameFk <em>Name Fk</em>}</li>
 *   <li>{@link errors.ForeignError#getPorcent <em>Porcent</em>}</li>
 *   <li>{@link errors.ForeignError#getTableCont <em>Table Cont</em>}</li>
 *   <li>{@link errors.ForeignError#getTableRef <em>Table Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see errors.ErrorsPackage#getForeignError()
 * @model
 * @generated
 */
public interface ForeignError extends errors.Error {
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
	 * @see errors.ErrorsPackage#getForeignError_NameFk()
	 * @model
	 * @generated
	 */
	String getNameFk();

	/**
	 * Sets the value of the '{@link errors.ForeignError#getNameFk <em>Name Fk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Fk</em>' attribute.
	 * @see #getNameFk()
	 * @generated
	 */
	void setNameFk(String value);

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
	 * @see errors.ErrorsPackage#getForeignError_Porcent()
	 * @model
	 * @generated
	 */
	Integer getPorcent();

	/**
	 * Sets the value of the '{@link errors.ForeignError#getPorcent <em>Porcent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porcent</em>' attribute.
	 * @see #getPorcent()
	 * @generated
	 */
	void setPorcent(Integer value);

	/**
	 * Returns the value of the '<em><b>Table Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Cont</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cont</em>' containment reference.
	 * @see #setTableCont(Table)
	 * @see errors.ErrorsPackage#getForeignError_TableCont()
	 * @model containment="true"
	 * @generated
	 */
	Table getTableCont();

	/**
	 * Sets the value of the '{@link errors.ForeignError#getTableCont <em>Table Cont</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Cont</em>' containment reference.
	 * @see #getTableCont()
	 * @generated
	 */
	void setTableCont(Table value);

	/**
	 * Returns the value of the '<em><b>Table Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Ref</em>' containment reference.
	 * @see #setTableRef(Table)
	 * @see errors.ErrorsPackage#getForeignError_TableRef()
	 * @model containment="true"
	 * @generated
	 */
	Table getTableRef();

	/**
	 * Sets the value of the '{@link errors.ForeignError#getTableRef <em>Table Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Ref</em>' containment reference.
	 * @see #getTableRef()
	 * @generated
	 */
	void setTableRef(Table value);

} // ForeignError
