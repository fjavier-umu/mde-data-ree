/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.Column#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link DML_DDL.Column#getCommentColumn <em>Comment Column</em>}</li>
 *   <li>{@link DML_DDL.Column#isColumnNull <em>Column Null</em>}</li>
 *   <li>{@link DML_DDL.Column#getColumnType <em>Column Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see DML_DDL.DML_DDLPackage#getColumn_ColumnName()
	 * @model
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link DML_DDL.Column#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Comment Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Column</em>' attribute.
	 * @see #setCommentColumn(String)
	 * @see DML_DDL.DML_DDLPackage#getColumn_CommentColumn()
	 * @model
	 * @generated
	 */
	String getCommentColumn();

	/**
	 * Sets the value of the '{@link DML_DDL.Column#getCommentColumn <em>Comment Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Column</em>' attribute.
	 * @see #getCommentColumn()
	 * @generated
	 */
	void setCommentColumn(String value);

	/**
	 * Returns the value of the '<em><b>Column Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Null</em>' attribute.
	 * @see #setColumnNull(boolean)
	 * @see DML_DDL.DML_DDLPackage#getColumn_ColumnNull()
	 * @model
	 * @generated
	 */
	boolean isColumnNull();

	/**
	 * Sets the value of the '{@link DML_DDL.Column#isColumnNull <em>Column Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Null</em>' attribute.
	 * @see #isColumnNull()
	 * @generated
	 */
	void setColumnNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Column Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Type</em>' reference.
	 * @see #setColumnType(Type)
	 * @see DML_DDL.DML_DDLPackage#getColumn_ColumnType()
	 * @model required="true"
	 * @generated
	 */
	Type getColumnType();

	/**
	 * Sets the value of the '{@link DML_DDL.Column#getColumnType <em>Column Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Type</em>' reference.
	 * @see #getColumnType()
	 * @generated
	 */
	void setColumnType(Type value);

} // Column
