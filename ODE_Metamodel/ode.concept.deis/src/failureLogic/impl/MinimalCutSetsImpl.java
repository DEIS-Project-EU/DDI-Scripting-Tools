/**
 */
package failureLogic.impl;

import failureLogic.Failure;
import failureLogic.FailureLogic_Package;
import failureLogic.MinimalCutSets;
import failureLogic.MinimalCutset;

import java.util.Collection;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minimal Cut Sets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.impl.MinimalCutSetsImpl#getCutsets <em>Cutsets</em>}</li>
 *   <li>{@link failureLogic.impl.MinimalCutSetsImpl#getFailures <em>Failures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinimalCutSetsImpl extends BaseElementImpl implements MinimalCutSets {
	/**
	 * The cached value of the '{@link #getCutsets() <em>Cutsets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutsets()
	 * @generated
	 * @ordered
	 */
	protected EList<MinimalCutset> cutsets;

	/**
	 * The cached value of the '{@link #getFailures() <em>Failures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailures()
	 * @generated
	 * @ordered
	 */
	protected EList<Failure> failures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinimalCutSetsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.MINIMAL_CUT_SETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MinimalCutset> getCutsets() {
		if (cutsets == null) {
			cutsets = new EObjectContainmentEList<MinimalCutset>(MinimalCutset.class, this, FailureLogic_Package.MINIMAL_CUT_SETS__CUTSETS);
		}
		return cutsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Failure> getFailures() {
		if (failures == null) {
			failures = new EObjectResolvingEList<Failure>(Failure.class, this, FailureLogic_Package.MINIMAL_CUT_SETS__FAILURES);
		}
		return failures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailureLogic_Package.MINIMAL_CUT_SETS__CUTSETS:
				return ((InternalEList<?>)getCutsets()).basicRemove(otherEnd, msgs);
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
			case FailureLogic_Package.MINIMAL_CUT_SETS__CUTSETS:
				return getCutsets();
			case FailureLogic_Package.MINIMAL_CUT_SETS__FAILURES:
				return getFailures();
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
			case FailureLogic_Package.MINIMAL_CUT_SETS__CUTSETS:
				getCutsets().clear();
				getCutsets().addAll((Collection<? extends MinimalCutset>)newValue);
				return;
			case FailureLogic_Package.MINIMAL_CUT_SETS__FAILURES:
				getFailures().clear();
				getFailures().addAll((Collection<? extends Failure>)newValue);
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
			case FailureLogic_Package.MINIMAL_CUT_SETS__CUTSETS:
				getCutsets().clear();
				return;
			case FailureLogic_Package.MINIMAL_CUT_SETS__FAILURES:
				getFailures().clear();
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
			case FailureLogic_Package.MINIMAL_CUT_SETS__CUTSETS:
				return cutsets != null && !cutsets.isEmpty();
			case FailureLogic_Package.MINIMAL_CUT_SETS__FAILURES:
				return failures != null && !failures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MinimalCutSetsImpl
