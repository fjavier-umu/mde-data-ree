/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.Table#getTableName <em>Table Name</em>}</li>
 *   <li>{@link DML_DDL.Table#getCommentTable <em>Comment Table</em>}</li>
 *   <li>{@link DML_DDL.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link DML_DDL.Table#getColumnsPk <em>Columns Pk</em>}</li>
 *   <li>{@link DML_DDL.Table#getColumnsFk <em>Columns Fk</em>}</li>
 *   <li>{@link DML_DDL.Table#getChecks <em>Checks</em>}</li>
 *   <li>{@link DML_DDL.Table#getRegistries <em>Registries</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends DataDefinition {
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
	 * @see DML_DDL.DML_DDLPackage#getTable_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link DML_DDL.Table#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Comment Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Table</em>' attribute.
	 * @see #setCommentTable(String)
	 * @see DML_DDL.DML_DDLPackage#getTable_CommentTable()
	 * @model
	 * @generated
	 */
	String getCommentTable();

	/**
	 * Sets the value of the '{@link DML_DDL.Table#getCommentTable <em>Comment Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Table</em>' attribute.
	 * @see #getCommentTable()
	 * @generated
	 */
	void setCommentTable(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link DML_DDL.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see DML_DDL.DML_DDLPackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Columns Pk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns Pk</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns Pk</em>' containment reference.
	 * @see #setColumnsPk(Pk)
	 * @see DML_DDL.DML_DDLPackage#getTable_ColumnsPk()
	 * @model containment="true"
	 * @generated
	 */
	Pk getColumnsPk();

	/**
	 * Sets the value of the '{@link DML_DDL.Table#getColumnsPk <em>Columns Pk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns Pk</em>' containment reference.
	 * @see #getColumnsPk()
	 * @generated
	 */
	void setColumnsPk(Pk value);

	/**
	 * Returns the value of the '<em><b>Columns Fk</b></em>' containment reference list.
	 * The list contents are of type {@link DML_DDL.Fk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns Fk</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns Fk</em>' containment reference list.
	 * @see DML_DDL.DML_DDLPackage#getTable_ColumnsFk()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fk> getColumnsFk();

	/**
	 * Returns the value of the '<em><b>Checks</b></em>' containment reference list.
	 * The list contents are of type {@link DML_DDL.Ck}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' containment reference list.
	 * @see DML_DDL.DML_DDLPackage#getTable_Checks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ck> getChecks();

	/**
	 * Returns the value of the '<em><b>Registries</b></em>' containment reference list.
	 * The list contents are of type {@link DML_DDL.Registry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registries</em>' containment reference list.
	 * @see DML_DDL.DML_DDLPackage#getTable_Registries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Registry> getRegistries();

} // Table
