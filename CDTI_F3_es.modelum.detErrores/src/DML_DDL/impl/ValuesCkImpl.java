/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL.impl;

import DML_DDL.DML_DDLPackage;
import DML_DDL.ValuesCk;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Values Ck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DML_DDL.impl.ValuesCkImpl#getValue <em>Value</em>}</li>
 *   <li>{@link DML_DDL.impl.ValuesCkImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link DML_DDL.impl.ValuesCkImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link DML_DDL.impl.ValuesCkImpl#getLogConjuntion <em>Log Conjuntion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValuesCkImpl extends EObjectImpl implements ValuesCk {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> value;

	/**
	 * The default value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected String comparator = COMPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogConjuntion() <em>Log Conjuntion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogConjuntion()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_CONJUNTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogConjuntion() <em>Log Conjuntion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogConjuntion()
	 * @generated
	 * @ordered
	 */
	protected String logConjuntion = LOG_CONJUNTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuesCkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DML_DDLPackage.Literals.VALUES_CK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValue() {
		if (value == null) {
			value = new EDataTypeUniqueEList<String>(String.class, this, DML_DDLPackage.VALUES_CK__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparator(String newComparator) {
		String oldComparator = comparator;
		comparator = newComparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.VALUES_CK__COMPARATOR, oldComparator, comparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.VALUES_CK__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogConjuntion() {
		return logConjuntion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogConjuntion(String newLogConjuntion) {
		String oldLogConjuntion = logConjuntion;
		logConjuntion = newLogConjuntion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DML_DDLPackage.VALUES_CK__LOG_CONJUNTION, oldLogConjuntion, logConjuntion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DML_DDLPackage.VALUES_CK__VALUE:
				return getValue();
			case DML_DDLPackage.VALUES_CK__COMPARATOR:
				return getComparator();
			case DML_DDLPackage.VALUES_CK__COLUMN_NAME:
				return getColumnName();
			case DML_DDLPackage.VALUES_CK__LOG_CONJUNTION:
				return getLogConjuntion();
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
			case DML_DDLPackage.VALUES_CK__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends String>)newValue);
				return;
			case DML_DDLPackage.VALUES_CK__COMPARATOR:
				setComparator((String)newValue);
				return;
			case DML_DDLPackage.VALUES_CK__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case DML_DDLPackage.VALUES_CK__LOG_CONJUNTION:
				setLogConjuntion((String)newValue);
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
			case DML_DDLPackage.VALUES_CK__VALUE:
				getValue().clear();
				return;
			case DML_DDLPackage.VALUES_CK__COMPARATOR:
				setComparator(COMPARATOR_EDEFAULT);
				return;
			case DML_DDLPackage.VALUES_CK__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case DML_DDLPackage.VALUES_CK__LOG_CONJUNTION:
				setLogConjuntion(LOG_CONJUNTION_EDEFAULT);
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
			case DML_DDLPackage.VALUES_CK__VALUE:
				return value != null && !value.isEmpty();
			case DML_DDLPackage.VALUES_CK__COMPARATOR:
				return COMPARATOR_EDEFAULT == null ? comparator != null : !COMPARATOR_EDEFAULT.equals(comparator);
			case DML_DDLPackage.VALUES_CK__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case DML_DDLPackage.VALUES_CK__LOG_CONJUNTION:
				return LOG_CONJUNTION_EDEFAULT == null ? logConjuntion != null : !LOG_CONJUNTION_EDEFAULT.equals(logConjuntion);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", comparator: ");
		result.append(comparator);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", logConjuntion: ");
		result.append(logConjuntion);
		result.append(')');
		return result.toString();
	}

} //ValuesCkImpl
