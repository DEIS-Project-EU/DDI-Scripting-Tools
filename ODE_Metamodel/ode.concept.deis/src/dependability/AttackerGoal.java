/**
 */
package dependability;

import odeBase.BaseElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attacker Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependability.AttackerGoal#getCategory <em>Category</em>}</li>
 *   <li>{@link dependability.AttackerGoal#getAddressedBy <em>Addressed By</em>}</li>
 *   <li>{@link dependability.AttackerGoal#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link dependability.AttackerGoal#getAttackedItems <em>Attacked Items</em>}</li>
 * </ul>
 *
 * @see dependability.Dependability_Package#getAttackerGoal()
 * @model
 * @generated
 */
public interface AttackerGoal extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see dependability.Dependability_Package#getAttackerGoal_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link dependability.AttackerGoal#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Addressed By</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.SecurityCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addressed By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addressed By</em>' containment reference list.
	 * @see dependability.Dependability_Package#getAttackerGoal_AddressedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityCapability> getAddressedBy();

	/**
	 * Returns the value of the '<em><b>Attacks</b></em>' containment reference list.
	 * The list contents are of type {@link dependability.Attack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' containment reference list.
	 * @see dependability.Dependability_Package#getAttackerGoal_Attacks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attack> getAttacks();

	/**
	 * Returns the value of the '<em><b>Attacked Items</b></em>' reference list.
	 * The list contents are of type {@link dependability.VulnerableItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacked Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacked Items</em>' reference list.
	 * @see dependability.Dependability_Package#getAttackerGoal_AttackedItems()
	 * @model
	 * @generated
	 */
	EList<VulnerableItem> getAttackedItems();

} // AttackerGoal
