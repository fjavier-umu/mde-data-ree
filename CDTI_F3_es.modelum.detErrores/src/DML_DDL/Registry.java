/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.Registry#getRegistryValues <em>Registry Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getRegistry()
 * @model
 * @generated
 */
public interface Registry extends EObject {
	/**
	 * Returns the value of the '<em><b>Registry Values</b></em>' containment reference list.
	 * The list contents are of type {@link DML_DDL.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Values</em>' containment reference list.
	 * @see DML_DDL.DML_DDLPackage#getRegistry_RegistryValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getRegistryValues();

} // Registry
