/**
 */
package top.dependability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import top.dependability.Attack;
import top.dependability.AttackerGoal;
import top.dependability.Dependability_Package;
import top.dependability.SecurityCapability;
import top.dependability.VulnerableItem;

import top.odeBase.impl.BaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacker Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.AttackerGoalImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link top.dependability.impl.AttackerGoalImpl#getAddressedBy <em>Addressed By</em>}</li>
 *   <li>{@link top.dependability.impl.AttackerGoalImpl#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link top.dependability.impl.AttackerGoalImpl#getAttackedItems <em>Attacked Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerGoalImpl extends BaseElementImpl implements AttackerGoal {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddressedBy() <em>Addressed By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityCapability> addressedBy;

	/**
	 * The cached value of the '{@link #getAttacks() <em>Attacks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Attack> attacks;

	/**
	 * The cached value of the '{@link #getAttackedItems() <em>Attacked Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<VulnerableItem> attackedItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.ATTACKER_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.ATTACKER_GOAL__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityCapability> getAddressedBy() {
		if (addressedBy == null) {
			addressedBy = new EObjectContainmentEList<SecurityCapability>(SecurityCapability.class, this, Dependability_Package.ATTACKER_GOAL__ADDRESSED_BY);
		}
		return addressedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attack> getAttacks() {
		if (attacks == null) {
			attacks = new EObjectContainmentEList<Attack>(Attack.class, this, Dependability_Package.ATTACKER_GOAL__ATTACKS);
		}
		return attacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VulnerableItem> getAttackedItems() {
		if (attackedItems == null) {
			attackedItems = new EObjectResolvingEList<VulnerableItem>(VulnerableItem.class, this, Dependability_Package.ATTACKER_GOAL__ATTACKED_ITEMS);
		}
		return attackedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dependability_Package.ATTACKER_GOAL__ADDRESSED_BY:
				return ((InternalEList<?>)getAddressedBy()).basicRemove(otherEnd, msgs);
			case Dependability_Package.ATTACKER_GOAL__ATTACKS:
				return ((InternalEList<?>)getAttacks()).basicRemove(otherEnd, msgs);
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
			case Dependability_Package.ATTACKER_GOAL__CATEGORY:
				return getCategory();
			case Dependability_Package.ATTACKER_GOAL__ADDRESSED_BY:
				return getAddressedBy();
			case Dependability_Package.ATTACKER_GOAL__ATTACKS:
				return getAttacks();
			case Dependability_Package.ATTACKER_GOAL__ATTACKED_ITEMS:
				return getAttackedItems();
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
			case Dependability_Package.ATTACKER_GOAL__CATEGORY:
				setCategory((String)newValue);
				return;
			case Dependability_Package.ATTACKER_GOAL__ADDRESSED_BY:
				getAddressedBy().clear();
				getAddressedBy().addAll((Collection<? extends SecurityCapability>)newValue);
				return;
			case Dependability_Package.ATTACKER_GOAL__ATTACKS:
				getAttacks().clear();
				getAttacks().addAll((Collection<? extends Attack>)newValue);
				return;
			case Dependability_Package.ATTACKER_GOAL__ATTACKED_ITEMS:
				getAttackedItems().clear();
				getAttackedItems().addAll((Collection<? extends VulnerableItem>)newValue);
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
			case Dependability_Package.ATTACKER_GOAL__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case Dependability_Package.ATTACKER_GOAL__ADDRESSED_BY:
				getAddressedBy().clear();
				return;
			case Dependability_Package.ATTACKER_GOAL__ATTACKS:
				getAttacks().clear();
				return;
			case Dependability_Package.ATTACKER_GOAL__ATTACKED_ITEMS:
				getAttackedItems().clear();
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
			case Dependability_Package.ATTACKER_GOAL__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case Dependability_Package.ATTACKER_GOAL__ADDRESSED_BY:
				return addressedBy != null && !addressedBy.isEmpty();
			case Dependability_Package.ATTACKER_GOAL__ATTACKS:
				return attacks != null && !attacks.isEmpty();
			case Dependability_Package.ATTACKER_GOAL__ATTACKED_ITEMS:
				return attackedItems != null && !attackedItems.isEmpty();
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
		result.append(" (category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //AttackerGoalImpl
