/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors.impl;

import DML_DDL.Ck;
import DML_DDL.Registry;
import DML_DDL.Table;

import errors.CheckError;
import errors.ErrorsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link errors.impl.CheckErrorImpl#getPorcent <em>Porcent</em>}</li>
 *   <li>{@link errors.impl.CheckErrorImpl#getCk <em>Ck</em>}</li>
 *   <li>{@link errors.impl.CheckErrorImpl#getTable <em>Table</em>}</li>
 *   <li>{@link errors.impl.CheckErrorImpl#getRegistriesCk <em>Registries Ck</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckErrorImpl extends ErrorImpl implements CheckError {
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
	 * The cached value of the '{@link #getCk() <em>Ck</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCk()
	 * @generated
	 * @ordered
	 */
	protected Ck ck;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

	/**
	 * The cached value of the '{@link #getRegistriesCk() <em>Registries Ck</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistriesCk()
	 * @generated
	 * @ordered
	 */
	protected EList<Registry> registriesCk;

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
	public Ck getCk() {
		if (ck != null && ck.eIsProxy()) {
			InternalEObject oldCk = (InternalEObject)ck;
			ck = (Ck)eResolveProxy(oldCk);
			if (ck != oldCk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorsPackage.CHECK_ERROR__CK, oldCk, ck));
			}
		}
		return ck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ck basicGetCk() {
		return ck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCk(Ck newCk) {
		Ck oldCk = ck;
		ck = newCk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.CHECK_ERROR__CK, oldCk, ck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (Table)eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorsPackage.CHECK_ERROR__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.CHECK_ERROR__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Registry> getRegistriesCk() {
		if (registriesCk == null) {
			registriesCk = new EObjectResolvingEList<Registry>(Registry.class, this, ErrorsPackage.CHECK_ERROR__REGISTRIES_CK);
		}
		return registriesCk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorsPackage.CHECK_ERROR__PORCENT:
				return getPorcent();
			case ErrorsPackage.CHECK_ERROR__CK:
				if (resolve) return getCk();
				return basicGetCk();
			case ErrorsPackage.CHECK_ERROR__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case ErrorsPackage.CHECK_ERROR__REGISTRIES_CK:
				return getRegistriesCk();
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
			case ErrorsPackage.CHECK_ERROR__PORCENT:
				setPorcent((Integer)newValue);
				return;
			case ErrorsPackage.CHECK_ERROR__CK:
				setCk((Ck)newValue);
				return;
			case ErrorsPackage.CHECK_ERROR__TABLE:
				setTable((Table)newValue);
				return;
			case ErrorsPackage.CHECK_ERROR__REGISTRIES_CK:
				getRegistriesCk().clear();
				getRegistriesCk().addAll((Collection<? extends Registry>)newValue);
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
			case ErrorsPackage.CHECK_ERROR__PORCENT:
				setPorcent(PORCENT_EDEFAULT);
				return;
			case ErrorsPackage.CHECK_ERROR__CK:
				setCk((Ck)null);
				return;
			case ErrorsPackage.CHECK_ERROR__TABLE:
				setTable((Table)null);
				return;
			case ErrorsPackage.CHECK_ERROR__REGISTRIES_CK:
				getRegistriesCk().clear();
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
			case ErrorsPackage.CHECK_ERROR__PORCENT:
				return PORCENT_EDEFAULT == null ? porcent != null : !PORCENT_EDEFAULT.equals(porcent);
			case ErrorsPackage.CHECK_ERROR__CK:
				return ck != null;
			case ErrorsPackage.CHECK_ERROR__TABLE:
				return table != null;
			case ErrorsPackage.CHECK_ERROR__REGISTRIES_CK:
				return registriesCk != null && !registriesCk.isEmpty();
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
		result.append(" (porcent: ");
		result.append(porcent);
		result.append(')');
		return result.toString();
	}

} //CheckErrorImpl
