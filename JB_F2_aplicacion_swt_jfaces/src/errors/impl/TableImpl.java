/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors.impl;

import errors.ColumnFk;
import errors.ErrorsPackage;
import errors.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link errors.impl.TableImpl#getNameTable <em>Name Table</em>}</li>
 *   <li>{@link errors.impl.TableImpl#getColumnCont <em>Column Cont</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
	/**
	 * The default value of the '{@link #getNameTable() <em>Name Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTable()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTable() <em>Name Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTable()
	 * @generated
	 * @ordered
	 */
	protected String nameTable = NAME_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnCont() <em>Column Cont</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnCont()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnFk> columnCont;

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
		return ErrorsPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameTable() {
		return nameTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameTable(String newNameTable) {
		String oldNameTable = nameTable;
		nameTable = newNameTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.TABLE__NAME_TABLE, oldNameTable, nameTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnFk> getColumnCont() {
		if (columnCont == null) {
			columnCont = new EObjectContainmentEList<ColumnFk>(ColumnFk.class, this, ErrorsPackage.TABLE__COLUMN_CONT);
		}
		return columnCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorsPackage.TABLE__COLUMN_CONT:
				return ((InternalEList<?>)getColumnCont()).basicRemove(otherEnd, msgs);
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
			case ErrorsPackage.TABLE__NAME_TABLE:
				return getNameTable();
			case ErrorsPackage.TABLE__COLUMN_CONT:
				return getColumnCont();
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
			case ErrorsPackage.TABLE__NAME_TABLE:
				setNameTable((String)newValue);
				return;
			case ErrorsPackage.TABLE__COLUMN_CONT:
				getColumnCont().clear();
				getColumnCont().addAll((Collection<? extends ColumnFk>)newValue);
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
			case ErrorsPackage.TABLE__NAME_TABLE:
				setNameTable(NAME_TABLE_EDEFAULT);
				return;
			case ErrorsPackage.TABLE__COLUMN_CONT:
				getColumnCont().clear();
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
			case ErrorsPackage.TABLE__NAME_TABLE:
				return NAME_TABLE_EDEFAULT == null ? nameTable != null : !NAME_TABLE_EDEFAULT.equals(nameTable);
			case ErrorsPackage.TABLE__COLUMN_CONT:
				return columnCont != null && !columnCont.isEmpty();
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
		result.append(" (nameTable: ");
		result.append(nameTable);
		result.append(')');
		return result.toString();
	}

} //TableImpl
