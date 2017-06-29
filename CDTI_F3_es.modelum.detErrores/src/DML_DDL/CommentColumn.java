/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.CommentColumn#getTableName <em>Table Name</em>}</li>
 *   <li>{@link DML_DDL.CommentColumn#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link DML_DDL.CommentColumn#getColumnComment <em>Column Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getCommentColumn()
 * @model
 * @generated
 */
public interface CommentColumn extends DataDefinition {
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
	 * @see DML_DDL.DML_DDLPackage#getCommentColumn_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link DML_DDL.CommentColumn#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

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
	 * @see DML_DDL.DML_DDLPackage#getCommentColumn_ColumnName()
	 * @model
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link DML_DDL.CommentColumn#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Column Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Comment</em>' attribute.
	 * @see #setColumnComment(String)
	 * @see DML_DDL.DML_DDLPackage#getCommentColumn_ColumnComment()
	 * @model
	 * @generated
	 */
	String getColumnComment();

	/**
	 * Sets the value of the '{@link DML_DDL.CommentColumn#getColumnComment <em>Column Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Comment</em>' attribute.
	 * @see #getColumnComment()
	 * @generated
	 */
	void setColumnComment(String value);

} // CommentColumn
