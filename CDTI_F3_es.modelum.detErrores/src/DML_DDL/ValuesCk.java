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
 * A representation of the model object '<em><b>Values Ck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DML_DDL.ValuesCk#getValue <em>Value</em>}</li>
 *   <li>{@link DML_DDL.ValuesCk#getComparator <em>Comparator</em>}</li>
 *   <li>{@link DML_DDL.ValuesCk#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link DML_DDL.ValuesCk#getLogConjuntion <em>Log Conjuntion</em>}</li>
 * </ul>
 * </p>
 *
 * @see DML_DDL.DML_DDLPackage#getValuesCk()
 * @model
 * @generated
 */
public interface ValuesCk extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see DML_DDL.DML_DDLPackage#getValuesCk_Value()
	 * @model
	 * @generated
	 */
	EList<String> getValue();

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see #setComparator(String)
	 * @see DML_DDL.DML_DDLPackage#getValuesCk_Comparator()
	 * @model
	 * @generated
	 */
	String getComparator();

	/**
	 * Sets the value of the '{@link DML_DDL.ValuesCk#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(String value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see DML_DDL.DML_DDLPackage#getValuesCk_ColumnName()
	 * @model
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link DML_DDL.ValuesCk#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Log Conjuntion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Conjuntion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Conjuntion</em>' attribute.
	 * @see #setLogConjuntion(String)
	 * @see DML_DDL.DML_DDLPackage#getValuesCk_LogConjuntion()
	 * @model
	 * @generated
	 */
	String getLogConjuntion();

	/**
	 * Sets the value of the '{@link DML_DDL.ValuesCk#getLogConjuntion <em>Log Conjuntion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Conjuntion</em>' attribute.
	 * @see #getLogConjuntion()
	 * @generated
	 */
	void setLogConjuntion(String value);

} // ValuesCk
