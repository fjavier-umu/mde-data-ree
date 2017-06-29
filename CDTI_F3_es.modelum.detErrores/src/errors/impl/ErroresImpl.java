/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package errors.impl;

import errors.Errores;
import errors.ErrorsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Errores</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link errors.impl.ErroresImpl#getErrores <em>Errores</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErroresImpl extends EObjectImpl implements Errores {
	/**
	 * The cached value of the '{@link #getErrores() <em>Errores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrores()
	 * @generated
	 * @ordered
	 */
	protected EList<errors.Error> errores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErroresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorsPackage.Literals.ERRORES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<errors.Error> getErrores() {
		if (errores == null) {
			errores = new EObjectContainmentEList<errors.Error>(errors.Error.class, this, ErrorsPackage.ERRORES__ERRORES);
		}
		return errores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorsPackage.ERRORES__ERRORES:
				return ((InternalEList<?>)getErrores()).basicRemove(otherEnd, msgs);
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
			case ErrorsPackage.ERRORES__ERRORES:
				return getErrores();
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
			case ErrorsPackage.ERRORES__ERRORES:
				getErrores().clear();
				getErrores().addAll((Collection<? extends errors.Error>)newValue);
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
			case ErrorsPackage.ERRORES__ERRORES:
				getErrores().clear();
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
			case ErrorsPackage.ERRORES__ERRORES:
				return errores != null && !errores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErroresImpl
