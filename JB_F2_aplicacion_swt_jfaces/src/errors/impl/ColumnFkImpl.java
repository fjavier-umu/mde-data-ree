/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors.impl;

import errors.ColumnFk;
import errors.ErrorsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Fk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link errors.impl.ColumnFkImpl#getNameColumn <em>Name Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnFkImpl extends EObjectImpl implements ColumnFk {
	/**
	 * The default value of the '{@link #getNameColumn() <em>Name Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameColumn() <em>Name Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameColumn()
	 * @generated
	 * @ordered
	 */
	protected String nameColumn = NAME_COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnFkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorsPackage.Literals.COLUMN_FK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameColumn() {
		return nameColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameColumn(String newNameColumn) {
		String oldNameColumn = nameColumn;
		nameColumn = newNameColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorsPackage.COLUMN_FK__NAME_COLUMN, oldNameColumn, nameColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorsPackage.COLUMN_FK__NAME_COLUMN:
				return getNameColumn();
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
			case ErrorsPackage.COLUMN_FK__NAME_COLUMN:
				setNameColumn((String)newValue);
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
			case ErrorsPackage.COLUMN_FK__NAME_COLUMN:
				setNameColumn(NAME_COLUMN_EDEFAULT);
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
			case ErrorsPackage.COLUMN_FK__NAME_COLUMN:
				return NAME_COLUMN_EDEFAULT == null ? nameColumn != null : !NAME_COLUMN_EDEFAULT.equals(nameColumn);
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
		result.append(" (nameColumn: ");
		result.append(nameColumn);
		result.append(')');
		return result.toString();
	}

} //ColumnFkImpl
