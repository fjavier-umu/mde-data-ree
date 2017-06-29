/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors.impl;

import errors.ErrorsPackage;
import errors.ForeignError;
import errors.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link errors.impl.ForeignErrorImpl#getNameFk <em>Name Fk</em>}</li>
 *   <li>{@link errors.impl.ForeignErrorImpl#getPorcent <em>Porcent</em>}</li>
 *   <li>{@link errors.impl.ForeignErrorImpl#getTableCont <em>Table Cont</em>}</li>
 *   <li>{@link errors.impl.ForeignErrorImpl#getTableRef <em>Table Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignErrorImpl extends ErrorImpl implements ForeignError {
	/**
	 * The default value of the '{@link #getNameFk() <em>Name Fk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFk()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFk() <em>Name Fk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFk()
	 * @generated
	 * @ordered
	 */
	protected String nameFk = NAME_FK_EDEFAULT;

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
	 * The cached value of the '{@link #getTableCont() <em>Table Cont</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCont()
	 * @generated
	 * @ordered
	 */
	protected Table tableCont;

	/**
	 * The cached value of the '{@link #getTableRef() <em>Table Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableRef()
	 * @generated
	 * @ordered
	 */
	protected Table tableRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorsPackage.Literals.FOREIGN_ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameFk() {
		return nameFk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameFk(String newNameFk) {
		String oldNameFk = nameFk;
		nameFk = newNameFk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.FOREIGN_ERROR__NAME_FK, oldNameFk, nameFk));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.FOREIGN_ERROR__PORCENT, oldPorcent, porcent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTableCont() {
		return tableCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableCont(Table newTableCont, NotificationChain msgs) {
		Table oldTableCont = tableCont;
		tableCont = newTableCont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorsPackage.FOREIGN_ERROR__TABLE_CONT, oldTableCont, newTableCont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableCont(Table newTableCont) {
		if (newTableCont != tableCont) {
			NotificationChain msgs = null;
			if (tableCont != null)
				msgs = ((InternalEObject)tableCont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorsPackage.FOREIGN_ERROR__TABLE_CONT, null, msgs);
			if (newTableCont != null)
				msgs = ((InternalEObject)newTableCont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorsPackage.FOREIGN_ERROR__TABLE_CONT, null, msgs);
			msgs = basicSetTableCont(newTableCont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.FOREIGN_ERROR__TABLE_CONT, newTableCont, newTableCont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTableRef() {
		return tableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableRef(Table newTableRef, NotificationChain msgs) {
		Table oldTableRef = tableRef;
		tableRef = newTableRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorsPackage.FOREIGN_ERROR__TABLE_REF, oldTableRef, newTableRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableRef(Table newTableRef) {
		if (newTableRef != tableRef) {
			NotificationChain msgs = null;
			if (tableRef != null)
				msgs = ((InternalEObject)tableRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorsPackage.FOREIGN_ERROR__TABLE_REF, null, msgs);
			if (newTableRef != null)
				msgs = ((InternalEObject)newTableRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorsPackage.FOREIGN_ERROR__TABLE_REF, null, msgs);
			msgs = basicSetTableRef(newTableRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.FOREIGN_ERROR__TABLE_REF, newTableRef, newTableRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorsPackage.FOREIGN_ERROR__TABLE_CONT:
				return basicSetTableCont(null, msgs);
			case ErrorsPackage.FOREIGN_ERROR__TABLE_REF:
				return basicSetTableRef(null, msgs);
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
			case ErrorsPackage.FOREIGN_ERROR__NAME_FK:
				return getNameFk();
			case ErrorsPackage.FOREIGN_ERROR__PORCENT:
				return getPorcent();
			case ErrorsPackage.FOREIGN_ERROR__TABLE_CONT:
				return getTableCont();
			case ErrorsPackage.FOREIGN_ERROR__TABLE_REF:
				return getTableRef();
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
			case ErrorsPackage.FOREIGN_ERROR__NAME_FK:
				setNameFk((String)newValue);
				return;
			case ErrorsPackage.FOREIGN_ERROR__PORCENT:
				setPorcent((Integer)newValue);
				return;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_CONT:
				setTableCont((Table)newValue);
				return;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_REF:
				setTableRef((Table)newValue);
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
			case ErrorsPackage.FOREIGN_ERROR__NAME_FK:
				setNameFk(NAME_FK_EDEFAULT);
				return;
			case ErrorsPackage.FOREIGN_ERROR__PORCENT:
				setPorcent(PORCENT_EDEFAULT);
				return;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_CONT:
				setTableCont((Table)null);
				return;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_REF:
				setTableRef((Table)null);
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
			case ErrorsPackage.FOREIGN_ERROR__NAME_FK:
				return NAME_FK_EDEFAULT == null ? nameFk != null : !NAME_FK_EDEFAULT.equals(nameFk);
			case ErrorsPackage.FOREIGN_ERROR__PORCENT:
				return PORCENT_EDEFAULT == null ? porcent != null : !PORCENT_EDEFAULT.equals(porcent);
			case ErrorsPackage.FOREIGN_ERROR__TABLE_CONT:
				return tableCont != null;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_REF:
				return tableRef != null;
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
		result.append(" (nameFk: ");
		result.append(nameFk);
		result.append(", porcent: ");
		result.append(porcent);
		result.append(')');
		return result.toString();
	}

} //ForeignErrorImpl
