/**
 */
package argumentation.impl;

import argumentation.ArgumentAsset;
import argumentation.ArgumentReasoning;
import argumentation.Argumentation_Package;
import argumentation.AssertedRelationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asserted Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.AssertedRelationshipImpl#isIsCounter <em>Is Counter</em>}</li>
 *   <li>{@link argumentation.impl.AssertedRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link argumentation.impl.AssertedRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link argumentation.impl.AssertedRelationshipImpl#getReasoning <em>Reasoning</em>}</li>
 *   <li>{@link argumentation.impl.AssertedRelationshipImpl#getRequies <em>Requies</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssertedRelationshipImpl extends AssertionImpl implements AssertedRelationship {
	/**
	 * The default value of the '{@link #isIsCounter() <em>Is Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCounter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COUNTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCounter() <em>Is Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCounter()
	 * @generated
	 * @ordered
	 */
	protected boolean isCounter = IS_COUNTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentAsset> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentAsset> target;

	/**
	 * The cached value of the '{@link #getReasoning() <em>Reasoning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasoning()
	 * @generated
	 * @ordered
	 */
	protected ArgumentReasoning reasoning;

	/**
	 * The default value of the '{@link #getRequies() <em>Requies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequies()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequies() <em>Requies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequies()
	 * @generated
	 * @ordered
	 */
	protected int requies = REQUIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Argumentation_Package.Literals.ASSERTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCounter() {
		return isCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCounter(boolean newIsCounter) {
		boolean oldIsCounter = isCounter;
		isCounter = newIsCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Argumentation_Package.ASSERTED_RELATIONSHIP__IS_COUNTER, oldIsCounter, isCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentAsset> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<ArgumentAsset>(ArgumentAsset.class, this, Argumentation_Package.ASSERTED_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentAsset> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<ArgumentAsset>(ArgumentAsset.class, this, Argumentation_Package.ASSERTED_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentReasoning getReasoning() {
		if (reasoning != null && reasoning.eIsProxy()) {
			InternalEObject oldReasoning = (InternalEObject)reasoning;
			reasoning = (ArgumentReasoning)eResolveProxy(oldReasoning);
			if (reasoning != oldReasoning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Argumentation_Package.ASSERTED_RELATIONSHIP__REASONING, oldReasoning, reasoning));
			}
		}
		return reasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentReasoning basicGetReasoning() {
		return reasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasoning(ArgumentReasoning newReasoning) {
		ArgumentReasoning oldReasoning = reasoning;
		reasoning = newReasoning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Argumentation_Package.ASSERTED_RELATIONSHIP__REASONING, oldReasoning, reasoning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequies() {
		return requies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequies(int newRequies) {
		int oldRequies = requies;
		requies = newRequies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Argumentation_Package.ASSERTED_RELATIONSHIP__REQUIES, oldRequies, requies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Argumentation_Package.ASSERTED_RELATIONSHIP__IS_COUNTER:
				return isIsCounter();
			case Argumentation_Package.ASSERTED_RELATIONSHIP__SOURCE:
				return getSource();
			case Argumentation_Package.ASSERTED_RELATIONSHIP__TARGET:
				return getTarget();
			case Argumentation_Package.ASSERTED_RELATIONSHIP__REASONING:
				if (resolve) return getReasoning();
				return basicGetReasoning();
			case Argumentation_Package.ASSERTED_RELATIONSHIP__REQUIES:
				return getRequies();
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
			case Argumentation_Package.ASSERTED_RELATIONSHIP__IS_COUNTER:
				setIsCounter((Boolean)newValue);
				return;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ArgumentAsset>)newValue);
				return;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ArgumentAsset>)newValue);
				return;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__REASONING:
				setReasoning((ArgumentReasoning)newValue);
				return;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__REQUIES:
				setRequies((Integer)newValue);
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
			case Argumentation_Package.ASSERTED_RELATIONSHIP__IS_COUNTER:
				setIsCounter(IS_COUNTER_EDEFAULT);
				return;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				return;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__TARGET:
				getTarget().clear();
				return;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__REASONING:
				setReasoning((ArgumentReasoning)null);
				return;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__REQUIES:
				setRequies(REQUIES_EDEFAULT);
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
			case Argumentation_Package.ASSERTED_RELATIONSHIP__IS_COUNTER:
				return isCounter != IS_COUNTER_EDEFAULT;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
			case Argumentation_Package.ASSERTED_RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
			case Argumentation_Package.ASSERTED_RELATIONSHIP__REASONING:
				return reasoning != null;
			case Argumentation_Package.ASSERTED_RELATIONSHIP__REQUIES:
				return requies != REQUIES_EDEFAULT;
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
		result.append(" (isCounter: ");
		result.append(isCounter);
		result.append(", requies: ");
		result.append(requies);
		result.append(')');
		return result.toString();
	}

} //AssertedRelationshipImpl
