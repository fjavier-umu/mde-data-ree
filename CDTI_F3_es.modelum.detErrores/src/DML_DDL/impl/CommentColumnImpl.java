/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL.impl;

import DML_DDL.CommentColumn;
import DML_DDL.DML_DDLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DML_DDL.impl.CommentColumnImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link DML_DDL.impl.CommentColumnImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link DML_DDL.impl.CommentColumnImpl#getColumnComment <em>Column Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentColumnImpl extends DataDefinitionImpl implements CommentColumn {
	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnComment() <em>Column Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnComment() <em>Column Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnComment()
	 * @generated
	 * @ordered
	 */
	protected String columnComment = COLUMN_COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DML_DDLPackage.Literals.COMMENT_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.COMMENT_COLUMN__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.COMMENT_COLUMN__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnComment() {
		return columnComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnComment(String newColumnComment) {
		String oldColumnComment = columnComment;
		columnComment = newColumnComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.COMMENT_COLUMN__COLUMN_COMMENT, oldColumnComment, columnComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DML_DDLPackage.COMMENT_COLUMN__TABLE_NAME:
				return getTableName();
			case DML_DDLPackage.COMMENT_COLUMN__COLUMN_NAME:
				return getColumnName();
			case DML_DDLPackage.COMMENT_COLUMN__COLUMN_COMMENT:
				return getColumnComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DML_DDLPackage.COMMENT_COLUMN__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case DML_DDLPackage.COMMENT_COLUMN__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case DML_DDLPackage.COMMENT_COLUMN__COLUMN_COMMENT:
				setColumnComment((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DML_DDLPackage.COMMENT_COLUMN__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case DML_DDLPackage.COMMENT_COLUMN__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case DML_DDLPackage.COMMENT_COLUMN__COLUMN_COMMENT:
				setColumnComment(COLUMN_COMMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DML_DDLPackage.COMMENT_COLUMN__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case DML_DDLPackage.COMMENT_COLUMN__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case DML_DDLPackage.COMMENT_COLUMN__COLUMN_COMMENT:
				return COLUMN_COMMENT_EDEFAULT == null ? columnComment != null : !COLUMN_COMMENT_EDEFAULT.equals(columnComment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tableName: ");
		result.append(tableName);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", columnComment: ");
		result.append(columnComment);
		result.append(')');
		return result.toString();
	}

} //CommentColumnImpl
