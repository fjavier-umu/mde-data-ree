/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors;

import DML_DDL.Ck;
import DML_DDL.Registry;
import DML_DDL.Table;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link errors.CheckError#getPorcent <em>Porcent</em>}</li>
 *   <li>{@link errors.CheckError#getCk <em>Ck</em>}</li>
 *   <li>{@link errors.CheckError#getTable <em>Table</em>}</li>
 *   <li>{@link errors.CheckError#getRegistriesCk <em>Registries Ck</em>}</li>
 * </ul>
 * </p>
 *
 * @see errors.ErrorsPackage#getCheckError()
 * @model
 * @generated
 */
public interface CheckError extends errors.Error {
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
	 * Returns the value of the '<em><b>Ck</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ck</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ck</em>' reference.
	 * @see #setCk(Ck)
	 * @see errors.ErrorsPackage#getCheckError_Ck()
	 * @model
	 * @generated
	 */
	Ck getCk();

	/**
	 * Sets the value of the '{@link errors.CheckError#getCk <em>Ck</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ck</em>' reference.
	 * @see #getCk()
	 * @generated
	 */
	void setCk(Ck value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see errors.ErrorsPackage#getCheckError_Table()
	 * @model
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link errors.CheckError#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Registries Ck</b></em>' reference list.
	 * The list contents are of type {@link DML_DDL.Registry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registries Ck</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registries Ck</em>' reference list.
	 * @see errors.ErrorsPackage#getCheckError_RegistriesCk()
	 * @model
	 * @generated
	 */
	EList<Registry> getRegistriesCk();

} // CheckError
