/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors.impl;

import DML_DDL.Column;
import DML_DDL.Fk;
import DML_DDL.Registry;
import DML_DDL.Table;

import errors.ErrorsPackage;
import errors.ForeignError;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link errors.impl.ForeignErrorImpl#getPorcent <em>Porcent</em>}</li>
 *   <li>{@link errors.impl.ForeignErrorImpl#getTableCont <em>Table Cont</em>}</li>
 *   <li>{@link errors.impl.ForeignErrorImpl#getTableRef <em>Table Ref</em>}</li>
 *   <li>{@link errors.impl.ForeignErrorImpl#getFkColumns <em>Fk Columns</em>}</li>
 *   <li>{@link errors.impl.ForeignErrorImpl#getFk <em>Fk</em>}</li>
 *   <li>{@link errors.impl.ForeignErrorImpl#getRegistriesFk <em>Registries Fk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignErrorImpl extends ErrorImpl implements ForeignError {
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
	 * The cached value of the '{@link #getTableCont() <em>Table Cont</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCont()
	 * @generated
	 * @ordered
	 */
	protected Table tableCont;

	/**
	 * The cached value of the '{@link #getTableRef() <em>Table Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableRef()
	 * @generated
	 * @ordered
	 */
	protected Table tableRef;

	/**
	 * The cached value of the '{@link #getFkColumns() <em>Fk Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFkColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> fkColumns;

	/**
	 * The cached value of the '{@link #getFk() <em>Fk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFk()
	 * @generated
	 * @ordered
	 */
	protected Fk fk;

	/**
	 * The cached value of the '{@link #getRegistriesFk() <em>Registries Fk</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistriesFk()
	 * @generated
	 * @ordered
	 */
	protected EList<Registry> registriesFk;

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
		if (tableCont != null && tableCont.eIsProxy()) {
			InternalEObject oldTableCont = (InternalEObject)tableCont;
			tableCont = (Table)eResolveProxy(oldTableCont);
			if (tableCont != oldTableCont) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorsPackage.FOREIGN_ERROR__TABLE_CONT, oldTableCont, tableCont));
			}
		}
		return tableCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTableCont() {
		return tableCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableCont(Table newTableCont) {
		Table oldTableCont = tableCont;
		tableCont = newTableCont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.FOREIGN_ERROR__TABLE_CONT, oldTableCont, tableCont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTableRef() {
		if (tableRef != null && tableRef.eIsProxy()) {
			InternalEObject oldTableRef = (InternalEObject)tableRef;
			tableRef = (Table)eResolveProxy(oldTableRef);
			if (tableRef != oldTableRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorsPackage.FOREIGN_ERROR__TABLE_REF, oldTableRef, tableRef));
			}
		}
		return tableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTableRef() {
		return tableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableRef(Table newTableRef) {
		Table oldTableRef = tableRef;
		tableRef = newTableRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.FOREIGN_ERROR__TABLE_REF, oldTableRef, tableRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getFkColumns() {
		if (fkColumns == null) {
			fkColumns = new EObjectResolvingEList<Column>(Column.class, this, ErrorsPackage.FOREIGN_ERROR__FK_COLUMNS);
		}
		return fkColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fk getFk() {
		if (fk != null && fk.eIsProxy()) {
			InternalEObject oldFk = (InternalEObject)fk;
			fk = (Fk)eResolveProxy(oldFk);
			if (fk != oldFk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorsPackage.FOREIGN_ERROR__FK, oldFk, fk));
			}
		}
		return fk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fk basicGetFk() {
		return fk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFk(Fk newFk) {
		Fk oldFk = fk;
		fk = newFk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.FOREIGN_ERROR__FK, oldFk, fk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Registry> getRegistriesFk() {
		if (registriesFk == null) {
			registriesFk = new EObjectResolvingEList<Registry>(Registry.class, this, ErrorsPackage.FOREIGN_ERROR__REGISTRIES_FK);
		}
		return registriesFk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorsPackage.FOREIGN_ERROR__PORCENT:
				return getPorcent();
			case ErrorsPackage.FOREIGN_ERROR__TABLE_CONT:
				if (resolve) return getTableCont();
				return basicGetTableCont();
			case ErrorsPackage.FOREIGN_ERROR__TABLE_REF:
				if (resolve) return getTableRef();
				return basicGetTableRef();
			case ErrorsPackage.FOREIGN_ERROR__FK_COLUMNS:
				return getFkColumns();
			case ErrorsPackage.FOREIGN_ERROR__FK:
				if (resolve) return getFk();
				return basicGetFk();
			case ErrorsPackage.FOREIGN_ERROR__REGISTRIES_FK:
				return getRegistriesFk();
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
			case ErrorsPackage.FOREIGN_ERROR__PORCENT:
				setPorcent((Integer)newValue);
				return;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_CONT:
				setTableCont((Table)newValue);
				return;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_REF:
				setTableRef((Table)newValue);
				return;
			case ErrorsPackage.FOREIGN_ERROR__FK_COLUMNS:
				getFkColumns().clear();
				getFkColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case ErrorsPackage.FOREIGN_ERROR__FK:
				setFk((Fk)newValue);
				return;
			case ErrorsPackage.FOREIGN_ERROR__REGISTRIES_FK:
				getRegistriesFk().clear();
				getRegistriesFk().addAll((Collection<? extends Registry>)newValue);
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
			case ErrorsPackage.FOREIGN_ERROR__PORCENT:
				setPorcent(PORCENT_EDEFAULT);
				return;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_CONT:
				setTableCont((Table)null);
				return;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_REF:
				setTableRef((Table)null);
				return;
			case ErrorsPackage.FOREIGN_ERROR__FK_COLUMNS:
				getFkColumns().clear();
				return;
			case ErrorsPackage.FOREIGN_ERROR__FK:
				setFk((Fk)null);
				return;
			case ErrorsPackage.FOREIGN_ERROR__REGISTRIES_FK:
				getRegistriesFk().clear();
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
			case ErrorsPackage.FOREIGN_ERROR__PORCENT:
				return PORCENT_EDEFAULT == null ? porcent != null : !PORCENT_EDEFAULT.equals(porcent);
			case ErrorsPackage.FOREIGN_ERROR__TABLE_CONT:
				return tableCont != null;
			case ErrorsPackage.FOREIGN_ERROR__TABLE_REF:
				return tableRef != null;
			case ErrorsPackage.FOREIGN_ERROR__FK_COLUMNS:
				return fkColumns != null && !fkColumns.isEmpty();
			case ErrorsPackage.FOREIGN_ERROR__FK:
				return fk != null;
			case ErrorsPackage.FOREIGN_ERROR__REGISTRIES_FK:
				return registriesFk != null && !registriesFk.isEmpty();
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

} //ForeignErrorImpl
