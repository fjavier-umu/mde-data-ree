/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL.impl;

import DML_DDL.DML_DDLPackage;
import DML_DDL.Pk;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DML_DDL.impl.PkImpl#getNamePk <em>Name Pk</em>}</li>
 *   <li>{@link DML_DDL.impl.PkImpl#getColumnName <em>Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PkImpl extends EObjectImpl implements Pk {
	/**
	 * The default value of the '{@link #getNamePk() <em>Name Pk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePk()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_PK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamePk() <em>Name Pk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePk()
	 * @generated
	 * @ordered
	 */
	protected String namePk = NAME_PK_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DML_DDLPackage.Literals.PK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamePk() {
		return namePk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePk(String newNamePk) {
		String oldNamePk = namePk;
		namePk = newNamePk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.PK__NAME_PK, oldNamePk, namePk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getColumnName() {
		if (columnName == null) {
			columnName = new EDataTypeUniqueEList<String>(String.class, this, DML_DDLPackage.PK__COLUMN_NAME);
		}
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DML_DDLPackage.PK__NAME_PK:
				return getNamePk();
			case DML_DDLPackage.PK__COLUMN_NAME:
				return getColumnName();
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
			case DML_DDLPackage.PK__NAME_PK:
				setNamePk((String)newValue);
				return;
			case DML_DDLPackage.PK__COLUMN_NAME:
				getColumnName().clear();
				getColumnName().addAll((Collection<? extends String>)newValue);
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
			case DML_DDLPackage.PK__NAME_PK:
				setNamePk(NAME_PK_EDEFAULT);
				return;
			case DML_DDLPackage.PK__COLUMN_NAME:
				getColumnName().clear();
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
			case DML_DDLPackage.PK__NAME_PK:
				return NAME_PK_EDEFAULT == null ? namePk != null : !NAME_PK_EDEFAULT.equals(namePk);
			case DML_DDLPackage.PK__COLUMN_NAME:
				return columnName != null && !columnName.isEmpty();
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
		result.append(" (namePk: ");
		result.append(namePk);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(')');
		return result.toString();
	}

} //PkImpl
