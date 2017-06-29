/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors.impl;

import errors.CheckError;
import errors.ColumnCk;
import errors.ErrorsPackage;

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
 * An implementation of the model object '<em><b>Check Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link errors.impl.CheckErrorImpl#getNameTable <em>Name Table</em>}</li>
 *   <li>{@link errors.impl.CheckErrorImpl#getNameCk <em>Name Ck</em>}</li>
 *   <li>{@link errors.impl.CheckErrorImpl#getPorcent <em>Porcent</em>}</li>
 *   <li>{@link errors.impl.CheckErrorImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckErrorImpl extends ErrorImpl implements CheckError {
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
	 * The default value of the '{@link #getNameCk() <em>Name Ck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCk()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameCk() <em>Name Ck</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCk()
	 * @generated
	 * @ordered
	 */
	protected String nameCk = NAME_CK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPorcent() <em>Porcent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorcent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPorcent() <em>Porcent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorcent()
	 * @generated
	 * @ordered
	 */
	protected Integer porcent = PORCENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnCk> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorsPackage.Literals.CHECK_ERROR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.CHECK_ERROR__NAME_TABLE, oldNameTable, nameTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameCk() {
		return nameCk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameCk(String newNameCk) {
		String oldNameCk = nameCk;
		nameCk = newNameCk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.CHECK_ERROR__NAME_CK, oldNameCk, nameCk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPorcent() {
		return porcent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorcent(Integer newPorcent) {
		Integer oldPorcent = porcent;
		porcent = newPorcent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.CHECK_ERROR__PORCENT, oldPorcent, porcent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnCk> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<ColumnCk>(ColumnCk.class, this, ErrorsPackage.CHECK_ERROR__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorsPackage.CHECK_ERROR__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
			case ErrorsPackage.CHECK_ERROR__NAME_TABLE:
				return getNameTable();
			case ErrorsPackage.CHECK_ERROR__NAME_CK:
				return getNameCk();
			case ErrorsPackage.CHECK_ERROR__PORCENT:
				return getPorcent();
			case ErrorsPackage.CHECK_ERROR__COLUMNS:
				return getColumns();
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
			case ErrorsPackage.CHECK_ERROR__NAME_TABLE:
				setNameTable((String)newValue);
				return;
			case ErrorsPackage.CHECK_ERROR__NAME_CK:
				setNameCk((String)newValue);
				return;
			case ErrorsPackage.CHECK_ERROR__PORCENT:
				setPorcent((Integer)newValue);
				return;
			case ErrorsPackage.CHECK_ERROR__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends ColumnCk>)newValue);
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
			case ErrorsPackage.CHECK_ERROR__NAME_TABLE:
				setNameTable(NAME_TABLE_EDEFAULT);
				return;
			case ErrorsPackage.CHECK_ERROR__NAME_CK:
				setNameCk(NAME_CK_EDEFAULT);
				return;
			case ErrorsPackage.CHECK_ERROR__PORCENT:
				setPorcent(PORCENT_EDEFAULT);
				return;
			case ErrorsPackage.CHECK_ERROR__COLUMNS:
				getColumns().clear();
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
			case ErrorsPackage.CHECK_ERROR__NAME_TABLE:
				return NAME_TABLE_EDEFAULT == null ? nameTable != null : !NAME_TABLE_EDEFAULT.equals(nameTable);
			case ErrorsPackage.CHECK_ERROR__NAME_CK:
				return NAME_CK_EDEFAULT == null ? nameCk != null : !NAME_CK_EDEFAULT.equals(nameCk);
			case ErrorsPackage.CHECK_ERROR__PORCENT:
				return PORCENT_EDEFAULT == null ? porcent != null : !PORCENT_EDEFAULT.equals(porcent);
			case ErrorsPackage.CHECK_ERROR__COLUMNS:
				return columns != null && !columns.isEmpty();
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
		result.append(", nameCk: ");
		result.append(nameCk);
		result.append(", porcent: ");
		result.append(porcent);
		result.append(')');
		return result.toString();
	}

} //CheckErrorImpl
