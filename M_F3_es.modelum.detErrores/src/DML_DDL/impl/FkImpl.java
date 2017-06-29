/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL.impl;

import DML_DDL.DML_DDLPackage;
import DML_DDL.Fk;
import DML_DDL.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DML_DDL.impl.FkImpl#getNameFk <em>Name Fk</em>}</li>
 *   <li>{@link DML_DDL.impl.FkImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link DML_DDL.impl.FkImpl#getReferences <em>References</em>}</li>
 *   <li>{@link DML_DDL.impl.FkImpl#getColumnReference <em>Column Reference</em>}</li>
 *   <li>{@link DML_DDL.impl.FkImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FkImpl extends EObjectImpl implements Fk {
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
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> columnName;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected Table references;

	/**
	 * The cached value of the '{@link #getColumnReference() <em>Column Reference</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnReference()
	 * @generated
	 * @ordered
	 */
	protected EList<String> columnReference;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DML_DDLPackage.Literals.FK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.FK__NAME_FK, oldNameFk, nameFk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getColumnName() {
		if (columnName == null) {
			columnName = new EDataTypeUniqueEList<String>(String.class, this, DML_DDLPackage.FK__COLUMN_NAME);
		}
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getReferences() {
		if (references != null && references.eIsProxy()) {
			InternalEObject oldReferences = (InternalEObject)references;
			references = (Table)eResolveProxy(oldReferences);
			if (references != oldReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DML_DDLPackage.FK__REFERENCES, oldReferences, references));
			}
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(Table newReferences) {
		Table oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.FK__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getColumnReference() {
		if (columnReference == null) {
			columnReference = new EDataTypeUniqueEList<String>(String.class, this, DML_DDLPackage.FK__COLUMN_REFERENCE);
		}
		return columnReference;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.FK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DML_DDLPackage.FK__NAME_FK:
				return getNameFk();
			case DML_DDLPackage.FK__COLUMN_NAME:
				return getColumnName();
			case DML_DDLPackage.FK__REFERENCES:
				if (resolve) return getReferences();
				return basicGetReferences();
			case DML_DDLPackage.FK__COLUMN_REFERENCE:
				return getColumnReference();
			case DML_DDLPackage.FK__STATUS:
				return getStatus();
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
			case DML_DDLPackage.FK__NAME_FK:
				setNameFk((String)newValue);
				return;
			case DML_DDLPackage.FK__COLUMN_NAME:
				getColumnName().clear();
				getColumnName().addAll((Collection<? extends String>)newValue);
				return;
			case DML_DDLPackage.FK__REFERENCES:
				setReferences((Table)newValue);
				return;
			case DML_DDLPackage.FK__COLUMN_REFERENCE:
				getColumnReference().clear();
				getColumnReference().addAll((Collection<? extends String>)newValue);
				return;
			case DML_DDLPackage.FK__STATUS:
				setStatus((String)newValue);
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
			case DML_DDLPackage.FK__NAME_FK:
				setNameFk(NAME_FK_EDEFAULT);
				return;
			case DML_DDLPackage.FK__COLUMN_NAME:
				getColumnName().clear();
				return;
			case DML_DDLPackage.FK__REFERENCES:
				setReferences((Table)null);
				return;
			case DML_DDLPackage.FK__COLUMN_REFERENCE:
				getColumnReference().clear();
				return;
			case DML_DDLPackage.FK__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case DML_DDLPackage.FK__NAME_FK:
				return NAME_FK_EDEFAULT == null ? nameFk != null : !NAME_FK_EDEFAULT.equals(nameFk);
			case DML_DDLPackage.FK__COLUMN_NAME:
				return columnName != null && !columnName.isEmpty();
			case DML_DDLPackage.FK__REFERENCES:
				return references != null;
			case DML_DDLPackage.FK__COLUMN_REFERENCE:
				return columnReference != null && !columnReference.isEmpty();
			case DML_DDLPackage.FK__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", columnReference: ");
		result.append(columnReference);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //FkImpl
