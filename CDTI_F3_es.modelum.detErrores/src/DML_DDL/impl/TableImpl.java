/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL.impl;

import DML_DDL.Ck;
import DML_DDL.Column;
import DML_DDL.DML_DDLPackage;
import DML_DDL.Fk;
import DML_DDL.Pk;
import DML_DDL.Registry;
import DML_DDL.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DML_DDL.impl.TableImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link DML_DDL.impl.TableImpl#getCommentTable <em>Comment Table</em>}</li>
 *   <li>{@link DML_DDL.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link DML_DDL.impl.TableImpl#getColumnsPk <em>Columns Pk</em>}</li>
 *   <li>{@link DML_DDL.impl.TableImpl#getColumnsFk <em>Columns Fk</em>}</li>
 *   <li>{@link DML_DDL.impl.TableImpl#getChecks <em>Checks</em>}</li>
 *   <li>{@link DML_DDL.impl.TableImpl#getRegistries <em>Registries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends DataDefinitionImpl implements Table {
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
	 * The default value of the '{@link #getCommentTable() <em>Comment Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentTable()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentTable() <em>Comment Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentTable()
	 * @generated
	 * @ordered
	 */
	protected String commentTable = COMMENT_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getColumnsPk() <em>Columns Pk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsPk()
	 * @generated
	 * @ordered
	 */
	protected Pk columnsPk;

	/**
	 * The cached value of the '{@link #getColumnsFk() <em>Columns Fk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsFk()
	 * @generated
	 * @ordered
	 */
	protected EList<Fk> columnsFk;

	/**
	 * The cached value of the '{@link #getChecks() <em>Checks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecks()
	 * @generated
	 * @ordered
	 */
	protected EList<Ck> checks;

	/**
	 * The cached value of the '{@link #getRegistries() <em>Registries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistries()
	 * @generated
	 * @ordered
	 */
	protected EList<Registry> registries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DML_DDLPackage.Literals.TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.TABLE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentTable() {
		return commentTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentTable(String newCommentTable) {
		String oldCommentTable = commentTable;
		commentTable = newCommentTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.TABLE__COMMENT_TABLE, oldCommentTable, commentTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, DML_DDLPackage.TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pk getColumnsPk() {
		return columnsPk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnsPk(Pk newColumnsPk, NotificationChain msgs) {
		Pk oldColumnsPk = columnsPk;
		columnsPk = newColumnsPk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DML_DDLPackage.TABLE__COLUMNS_PK, oldColumnsPk, newColumnsPk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnsPk(Pk newColumnsPk) {
		if (newColumnsPk != columnsPk) {
			NotificationChain msgs = null;
			if (columnsPk != null)
				msgs = ((InternalEObject)columnsPk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DML_DDLPackage.TABLE__COLUMNS_PK, null, msgs);
			if (newColumnsPk != null)
				msgs = ((InternalEObject)newColumnsPk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DML_DDLPackage.TABLE__COLUMNS_PK, null, msgs);
			msgs = basicSetColumnsPk(newColumnsPk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.TABLE__COLUMNS_PK, newColumnsPk, newColumnsPk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fk> getColumnsFk() {
		if (columnsFk == null) {
			columnsFk = new EObjectContainmentEList<Fk>(Fk.class, this, DML_DDLPackage.TABLE__COLUMNS_FK);
		}
		return columnsFk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ck> getChecks() {
		if (checks == null) {
			checks = new EObjectContainmentEList<Ck>(Ck.class, this, DML_DDLPackage.TABLE__CHECKS);
		}
		return checks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Registry> getRegistries() {
		if (registries == null) {
			registries = new EObjectContainmentEList<Registry>(Registry.class, this, DML_DDLPackage.TABLE__REGISTRIES);
		}
		return registries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DML_DDLPackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case DML_DDLPackage.TABLE__COLUMNS_PK:
				return basicSetColumnsPk(null, msgs);
			case DML_DDLPackage.TABLE__COLUMNS_FK:
				return ((InternalEList<?>)getColumnsFk()).basicRemove(otherEnd, msgs);
			case DML_DDLPackage.TABLE__CHECKS:
				return ((InternalEList<?>)getChecks()).basicRemove(otherEnd, msgs);
			case DML_DDLPackage.TABLE__REGISTRIES:
				return ((InternalEList<?>)getRegistries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DML_DDLPackage.TABLE__TABLE_NAME:
				return getTableName();
			case DML_DDLPackage.TABLE__COMMENT_TABLE:
				return getCommentTable();
			case DML_DDLPackage.TABLE__COLUMNS:
				return getColumns();
			case DML_DDLPackage.TABLE__COLUMNS_PK:
				return getColumnsPk();
			case DML_DDLPackage.TABLE__COLUMNS_FK:
				return getColumnsFk();
			case DML_DDLPackage.TABLE__CHECKS:
				return getChecks();
			case DML_DDLPackage.TABLE__REGISTRIES:
				return getRegistries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DML_DDLPackage.TABLE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case DML_DDLPackage.TABLE__COMMENT_TABLE:
				setCommentTable((String)newValue);
				return;
			case DML_DDLPackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case DML_DDLPackage.TABLE__COLUMNS_PK:
				setColumnsPk((Pk)newValue);
				return;
			case DML_DDLPackage.TABLE__COLUMNS_FK:
				getColumnsFk().clear();
				getColumnsFk().addAll((Collection<? extends Fk>)newValue);
				return;
			case DML_DDLPackage.TABLE__CHECKS:
				getChecks().clear();
				getChecks().addAll((Collection<? extends Ck>)newValue);
				return;
			case DML_DDLPackage.TABLE__REGISTRIES:
				getRegistries().clear();
				getRegistries().addAll((Collection<? extends Registry>)newValue);
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
			case DML_DDLPackage.TABLE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case DML_DDLPackage.TABLE__COMMENT_TABLE:
				setCommentTable(COMMENT_TABLE_EDEFAULT);
				return;
			case DML_DDLPackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case DML_DDLPackage.TABLE__COLUMNS_PK:
				setColumnsPk((Pk)null);
				return;
			case DML_DDLPackage.TABLE__COLUMNS_FK:
				getColumnsFk().clear();
				return;
			case DML_DDLPackage.TABLE__CHECKS:
				getChecks().clear();
				return;
			case DML_DDLPackage.TABLE__REGISTRIES:
				getRegistries().clear();
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
			case DML_DDLPackage.TABLE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case DML_DDLPackage.TABLE__COMMENT_TABLE:
				return COMMENT_TABLE_EDEFAULT == null ? commentTable != null : !COMMENT_TABLE_EDEFAULT.equals(commentTable);
			case DML_DDLPackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case DML_DDLPackage.TABLE__COLUMNS_PK:
				return columnsPk != null;
			case DML_DDLPackage.TABLE__COLUMNS_FK:
				return columnsFk != null && !columnsFk.isEmpty();
			case DML_DDLPackage.TABLE__CHECKS:
				return checks != null && !checks.isEmpty();
			case DML_DDLPackage.TABLE__REGISTRIES:
				return registries != null && !registries.isEmpty();
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
		result.append(", commentTable: ");
		result.append(commentTable);
		result.append(')');
		return result.toString();
	}

} //TableImpl
