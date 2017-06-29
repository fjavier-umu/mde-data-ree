/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL.impl;

import DML_DDL.Column;
import DML_DDL.DML_DDLPackage;
import DML_DDL.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DML_DDL.impl.ColumnImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link DML_DDL.impl.ColumnImpl#getCommentColumn <em>Comment Column</em>}</li>
 *   <li>{@link DML_DDL.impl.ColumnImpl#isColumnNull <em>Column Null</em>}</li>
 *   <li>{@link DML_DDL.impl.ColumnImpl#getColumnType <em>Column Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
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
	 * The default value of the '{@link #getCommentColumn() <em>Comment Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentColumn() <em>Comment Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentColumn()
	 * @generated
	 * @ordered
	 */
	protected String commentColumn = COMMENT_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #isColumnNull() <em>Column Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isColumnNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLUMN_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isColumnNull() <em>Column Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isColumnNull()
	 * @generated
	 * @ordered
	 */
	protected boolean columnNull = COLUMN_NULL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnType() <em>Column Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnType()
	 * @generated
	 * @ordered
	 */
	protected Type columnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DML_DDLPackage.Literals.COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.COLUMN__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentColumn() {
		return commentColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentColumn(String newCommentColumn) {
		String oldCommentColumn = commentColumn;
		commentColumn = newCommentColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.COLUMN__COMMENT_COLUMN, oldCommentColumn, commentColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isColumnNull() {
		return columnNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnNull(boolean newColumnNull) {
		boolean oldColumnNull = columnNull;
		columnNull = newColumnNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.COLUMN__COLUMN_NULL, oldColumnNull, columnNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getColumnType() {
		if (columnType != null && columnType.eIsProxy()) {
			InternalEObject oldColumnType = (InternalEObject)columnType;
			columnType = (Type)eResolveProxy(oldColumnType);
			if (columnType != oldColumnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DML_DDLPackage.COLUMN__COLUMN_TYPE, oldColumnType, columnType));
			}
		}
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetColumnType() {
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnType(Type newColumnType) {
		Type oldColumnType = columnType;
		columnType = newColumnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.COLUMN__COLUMN_TYPE, oldColumnType, columnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DML_DDLPackage.COLUMN__COLUMN_NAME:
				return getColumnName();
			case DML_DDLPackage.COLUMN__COMMENT_COLUMN:
				return getCommentColumn();
			case DML_DDLPackage.COLUMN__COLUMN_NULL:
				return isColumnNull() ? Boolean.TRUE : Boolean.FALSE;
			case DML_DDLPackage.COLUMN__COLUMN_TYPE:
				if (resolve) return getColumnType();
				return basicGetColumnType();
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
			case DML_DDLPackage.COLUMN__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case DML_DDLPackage.COLUMN__COMMENT_COLUMN:
				setCommentColumn((String)newValue);
				return;
			case DML_DDLPackage.COLUMN__COLUMN_NULL:
				setColumnNull(((Boolean)newValue).booleanValue());
				return;
			case DML_DDLPackage.COLUMN__COLUMN_TYPE:
				setColumnType((Type)newValue);
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
			case DML_DDLPackage.COLUMN__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case DML_DDLPackage.COLUMN__COMMENT_COLUMN:
				setCommentColumn(COMMENT_COLUMN_EDEFAULT);
				return;
			case DML_DDLPackage.COLUMN__COLUMN_NULL:
				setColumnNull(COLUMN_NULL_EDEFAULT);
				return;
			case DML_DDLPackage.COLUMN__COLUMN_TYPE:
				setColumnType((Type)null);
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
			case DML_DDLPackage.COLUMN__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case DML_DDLPackage.COLUMN__COMMENT_COLUMN:
				return COMMENT_COLUMN_EDEFAULT == null ? commentColumn != null : !COMMENT_COLUMN_EDEFAULT.equals(commentColumn);
			case DML_DDLPackage.COLUMN__COLUMN_NULL:
				return columnNull != COLUMN_NULL_EDEFAULT;
			case DML_DDLPackage.COLUMN__COLUMN_TYPE:
				return columnType != null;
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
		result.append(" (columnName: ");
		result.append(columnName);
		result.append(", commentColumn: ");
		result.append(commentColumn);
		result.append(", columnNull: ");
		result.append(columnNull);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
