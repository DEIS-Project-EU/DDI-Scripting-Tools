/**
 */
package failureLogic.impl;

import failureLogic.FailureLogicPackage;
import failureLogic.FailureLogic_Package;
import failureLogic.FailureModel;

import integration.impl.ODEProductPackageImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Logic Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.impl.FailureLogicPackageImpl#getFailureModels <em>Failure Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureLogicPackageImpl extends ODEProductPackageImpl implements FailureLogicPackage {
	/**
	 * The cached value of the '{@link #getFailureModels() <em>Failure Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModels()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModel> failureModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureLogicPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.FAILURE_LOGIC_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModel> getFailureModels() {
		if (failureModels == null) {
			failureModels = new EObjectContainmentEList<FailureModel>(FailureModel.class, this, FailureLogic_Package.FAILURE_LOGIC_PACKAGE__FAILURE_MODELS);
		}
		return failureModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FailureLogic_Package.FAILURE_LOGIC_PACKAGE__FAILURE_MODELS:
				return ((InternalEList<?>)getFailureModels()).basicRemove(otherEnd, msgs);
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
			case FailureLogic_Package.FAILURE_LOGIC_PACKAGE__FAILURE_MODELS:
				return getFailureModels();
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
			case FailureLogic_Package.FAILURE_LOGIC_PACKAGE__FAILURE_MODELS:
				getFailureModels().clear();
				getFailureModels().addAll((Collection<? extends FailureModel>)newValue);
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
			case FailureLogic_Package.FAILURE_LOGIC_PACKAGE__FAILURE_MODELS:
				getFailureModels().clear();
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
			case FailureLogic_Package.FAILURE_LOGIC_PACKAGE__FAILURE_MODELS:
				return failureModels != null && !failureModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FailureLogicPackageImpl
