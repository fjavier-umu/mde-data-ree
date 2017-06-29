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
 * A representation of the model object '<em><b>DDL Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.DDLDefinition#getStatements <em>Statements</em>}</li>
 *   <li>{@link DML_DDL.DDLDefinition#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getDDLDefinition()
 * @model
 * @generated
 */
public interface DDLDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link DML_DDL.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see DML_DDL.DML_DDLPackage#getDDLDefinition_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(DataType)
	 * @see DML_DDL.DML_DDLPackage#getDDLDefinition_DataType()
	 * @model containment="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link DML_DDL.DDLDefinition#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // DDLDefinition
