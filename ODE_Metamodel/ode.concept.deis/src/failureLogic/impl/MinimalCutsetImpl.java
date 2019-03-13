/**
 */
package failureLogic.impl;

import failureLogic.Failure;
import failureLogic.FailureLogic_Package;
import failureLogic.MinimalCutset;

import java.util.Collection;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minimal Cutset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.impl.MinimalCutsetImpl#getFailures <em>Failures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinimalCutsetImpl extends BaseElementImpl implements MinimalCutset {
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
	protected MinimalCutsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.MINIMAL_CUTSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Failure> getFailures() {
		if (failures == null) {
			failures = new EObjectResolvingEList<Failure>(Failure.class, this, FailureLogic_Package.MINIMAL_CUTSET__FAILURES);
		}
		return failures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureLogic_Package.MINIMAL_CUTSET__FAILURES:
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
			case FailureLogic_Package.MINIMAL_CUTSET__FAILURES:
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
			case FailureLogic_Package.MINIMAL_CUTSET__FAILURES:
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
			case FailureLogic_Package.MINIMAL_CUTSET__FAILURES:
				return failures != null && !failures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MinimalCutsetImpl
