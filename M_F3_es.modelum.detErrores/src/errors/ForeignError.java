/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors;

import DML_DDL.Column;
import DML_DDL.Fk;
import DML_DDL.Registry;
import DML_DDL.Table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link errors.ForeignError#getPorcent <em>Porcent</em>}</li>
 *   <li>{@link errors.ForeignError#getTableCont <em>Table Cont</em>}</li>
 *   <li>{@link errors.ForeignError#getTableRef <em>Table Ref</em>}</li>
 *   <li>{@link errors.ForeignError#getFkColumns <em>Fk Columns</em>}</li>
 *   <li>{@link errors.ForeignError#getFk <em>Fk</em>}</li>
 *   <li>{@link errors.ForeignError#getRegistriesFk <em>Registries Fk</em>}</li>
 * </ul>
 * </p>
 *
 * @see errors.ErrorsPackage#getForeignError()
 * @model
 * @generated
 */
public interface ForeignError extends errors.Error {
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
	 * Returns the value of the '<em><b>Table Cont</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Cont</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cont</em>' reference.
	 * @see #setTableCont(Table)
	 * @see errors.ErrorsPackage#getForeignError_TableCont()
	 * @model
	 * @generated
	 */
	Table getTableCont();

	/**
	 * Sets the value of the '{@link errors.ForeignError#getTableCont <em>Table Cont</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Cont</em>' reference.
	 * @see #getTableCont()
	 * @generated
	 */
	void setTableCont(Table value);

	/**
	 * Returns the value of the '<em><b>Table Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Ref</em>' reference.
	 * @see #setTableRef(Table)
	 * @see errors.ErrorsPackage#getForeignError_TableRef()
	 * @model
	 * @generated
	 */
	Table getTableRef();

	/**
	 * Sets the value of the '{@link errors.ForeignError#getTableRef <em>Table Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Ref</em>' reference.
	 * @see #getTableRef()
	 * @generated
	 */
	void setTableRef(Table value);

	/**
	 * Returns the value of the '<em><b>Fk Columns</b></em>' reference list.
	 * The list contents are of type {@link DML_DDL.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fk Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fk Columns</em>' reference list.
	 * @see errors.ErrorsPackage#getForeignError_FkColumns()
	 * @model
	 * @generated
	 */
	EList<Column> getFkColumns();

	/**
	 * Returns the value of the '<em><b>Fk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fk</em>' reference.
	 * @see #setFk(Fk)
	 * @see errors.ErrorsPackage#getForeignError_Fk()
	 * @model
	 * @generated
	 */
	Fk getFk();

	/**
	 * Sets the value of the '{@link errors.ForeignError#getFk <em>Fk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fk</em>' reference.
	 * @see #getFk()
	 * @generated
	 */
	void setFk(Fk value);

	/**
	 * Returns the value of the '<em><b>Registries Fk</b></em>' reference list.
	 * The list contents are of type {@link DML_DDL.Registry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registries Fk</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registries Fk</em>' reference list.
	 * @see errors.ErrorsPackage#getForeignError_RegistriesFk()
	 * @model
	 * @generated
	 */
	EList<Registry> getRegistriesFk();

} // ForeignError
