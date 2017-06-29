/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.CommentTable#getTableName <em>Table Name</em>}</li>
 *   <li>{@link DML_DDL.CommentTable#getTableComment <em>Table Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getCommentTable()
 * @model
 * @generated
 */
public interface CommentTable extends DataDefinition {
	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see DML_DDL.DML_DDLPackage#getCommentTable_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link DML_DDL.CommentTable#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Table Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Comment</em>' attribute.
	 * @see #setTableComment(String)
	 * @see DML_DDL.DML_DDLPackage#getCommentTable_TableComment()
	 * @model
	 * @generated
	 */
	String getTableComment();

	/**
	 * Sets the value of the '{@link DML_DDL.CommentTable#getTableComment <em>Table Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Comment</em>' attribute.
	 * @see #getTableComment()
	 * @generated
	 */
	void setTableComment(String value);

} // CommentTable
