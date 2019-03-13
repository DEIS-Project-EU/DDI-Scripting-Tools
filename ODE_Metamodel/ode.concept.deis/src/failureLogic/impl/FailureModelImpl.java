/**
 */
package failureLogic.impl;

import failureLogic.Failure;
import failureLogic.FailureLogic_Package;
import failureLogic.FailureModel;
import failureLogic.MinimalCutSets;

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
 * An implementation of the model object '<em><b>Failure Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.impl.FailureModelImpl#getMinimalCutsets <em>Minimal Cutsets</em>}</li>
 *   <li>{@link failureLogic.impl.FailureModelImpl#getFailures <em>Failures</em>}</li>
 *   <li>{@link failureLogic.impl.FailureModelImpl#getSubModels <em>Sub Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModelImpl extends BaseElementImpl implements FailureModel {
	/**
	 * The cached value of the '{@link #getMinimalCutsets() <em>Minimal Cutsets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalCutsets()
	 * @generated
	 * @ordered
	 */
	protected EList<MinimalCutSets> minimalCutsets;

	/**
	 * The cached value of the '{@link #getFailures() <em>Failures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailures()
	 * @generated
	 * @ordered
	 */
	protected EList<Failure> failures;

	/**
	 * The cached value of the '{@link #getSubModels() <em>Sub Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModels()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModel> subModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.FAILURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MinimalCutSets> getMinimalCutsets() {
		if (minimalCutsets == null) {
			minimalCutsets = new EObjectContainmentEList<MinimalCutSets>(MinimalCutSets.class, this, FailureLogic_Package.FAILURE_MODEL__MINIMAL_CUTSETS);
		}
		return minimalCutsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Failure> getFailures() {
		if (failures == null) {
			failures = new EObjectContainmentEList<Failure>(Failure.class, this, FailureLogic_Package.FAILURE_MODEL__FAILURES);
		}
		return failures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModel> getSubModels() {
		if (subModels == null) {
			subModels = new EObjectResolvingEList<FailureModel>(FailureModel.class, this, FailureLogic_Package.FAILURE_MODEL__SUB_MODELS);
		}
		return subModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailureLogic_Package.FAILURE_MODEL__MINIMAL_CUTSETS:
				return ((InternalEList<?>)getMinimalCutsets()).basicRemove(otherEnd, msgs);
			case FailureLogic_Package.FAILURE_MODEL__FAILURES:
				return ((InternalEList<?>)getFailures()).basicRemove(otherEnd, msgs);
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
			case FailureLogic_Package.FAILURE_MODEL__MINIMAL_CUTSETS:
				return getMinimalCutsets();
			case FailureLogic_Package.FAILURE_MODEL__FAILURES:
				return getFailures();
			case FailureLogic_Package.FAILURE_MODEL__SUB_MODELS:
				return getSubModels();
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
			case FailureLogic_Package.FAILURE_MODEL__MINIMAL_CUTSETS:
				getMinimalCutsets().clear();
				getMinimalCutsets().addAll((Collection<? extends MinimalCutSets>)newValue);
				return;
			case FailureLogic_Package.FAILURE_MODEL__FAILURES:
				getFailures().clear();
				getFailures().addAll((Collection<? extends Failure>)newValue);
				return;
			case FailureLogic_Package.FAILURE_MODEL__SUB_MODELS:
				getSubModels().clear();
				getSubModels().addAll((Collection<? extends FailureModel>)newValue);
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
			case FailureLogic_Package.FAILURE_MODEL__MINIMAL_CUTSETS:
				getMinimalCutsets().clear();
				return;
			case FailureLogic_Package.FAILURE_MODEL__FAILURES:
				getFailures().clear();
				return;
			case FailureLogic_Package.FAILURE_MODEL__SUB_MODELS:
				getSubModels().clear();
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
			case FailureLogic_Package.FAILURE_MODEL__MINIMAL_CUTSETS:
				return minimalCutsets != null && !minimalCutsets.isEmpty();
			case FailureLogic_Package.FAILURE_MODEL__FAILURES:
				return failures != null && !failures.isEmpty();
			case FailureLogic_Package.FAILURE_MODEL__SUB_MODELS:
				return subModels != null && !subModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FailureModelImpl
