/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL.impl;

import DML_DDL.Ck;
import DML_DDL.DML_DDLPackage;
import DML_DDL.ValuesCk;

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
 * An implementation of the model object '<em><b>Ck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DML_DDL.impl.CkImpl#getNameCk <em>Name Ck</em>}</li>
 *   <li>{@link DML_DDL.impl.CkImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link DML_DDL.impl.CkImpl#getValuesCk <em>Values Ck</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CkImpl extends EObjectImpl implements Ck {
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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValuesCk() <em>Values Ck</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesCk()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuesCk> valuesCk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DML_DDLPackage.Literals.CK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.CK__NAME_CK, oldNameCk, nameCk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.CK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuesCk> getValuesCk() {
		if (valuesCk == null) {
			valuesCk = new EObjectContainmentEList<ValuesCk>(ValuesCk.class, this, DML_DDLPackage.CK__VALUES_CK);
		}
		return valuesCk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DML_DDLPackage.CK__VALUES_CK:
				return ((InternalEList<?>)getValuesCk()).basicRemove(otherEnd, msgs);
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
			case DML_DDLPackage.CK__NAME_CK:
				return getNameCk();
			case DML_DDLPackage.CK__STATUS:
				return getStatus();
			case DML_DDLPackage.CK__VALUES_CK:
				return getValuesCk();
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
			case DML_DDLPackage.CK__NAME_CK:
				setNameCk((String)newValue);
				return;
			case DML_DDLPackage.CK__STATUS:
				setStatus((String)newValue);
				return;
			case DML_DDLPackage.CK__VALUES_CK:
				getValuesCk().clear();
				getValuesCk().addAll((Collection<? extends ValuesCk>)newValue);
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
			case DML_DDLPackage.CK__NAME_CK:
				setNameCk(NAME_CK_EDEFAULT);
				return;
			case DML_DDLPackage.CK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case DML_DDLPackage.CK__VALUES_CK:
				getValuesCk().clear();
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
			case DML_DDLPackage.CK__NAME_CK:
				return NAME_CK_EDEFAULT == null ? nameCk != null : !NAME_CK_EDEFAULT.equals(nameCk);
			case DML_DDLPackage.CK__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case DML_DDLPackage.CK__VALUES_CK:
				return valuesCk != null && !valuesCk.isEmpty();
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
		result.append(" (nameCk: ");
		result.append(nameCk);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //CkImpl
