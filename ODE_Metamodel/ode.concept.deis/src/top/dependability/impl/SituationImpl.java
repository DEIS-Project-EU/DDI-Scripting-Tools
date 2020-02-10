/**
 */
package top.dependability.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import top.dependability.Dependability_Package;
import top.dependability.Situation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Situation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.SituationImpl#getLikelihood <em>Likelihood</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SituationImpl extends RiskParameterImpl implements Situation {
	/**
	 * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final String LIKELIHOOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected String likelihood = LIKELIHOOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SituationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.SITUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLikelihood() {
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLikelihood(String newLikelihood) {
		String oldLikelihood = likelihood;
		likelihood = newLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SITUATION__LIKELIHOOD, oldLikelihood, likelihood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.SITUATION__LIKELIHOOD:
				return getLikelihood();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dependability_Package.SITUATION__LIKELIHOOD:
				setLikelihood((String)newValue);
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
			case Dependability_Package.SITUATION__LIKELIHOOD:
				setLikelihood(LIKELIHOOD_EDEFAULT);
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
			case Dependability_Package.SITUATION__LIKELIHOOD:
				return LIKELIHOOD_EDEFAULT == null ? likelihood != null : !LIKELIHOOD_EDEFAULT.equals(likelihood);
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
		result.append(" (likelihood: ");
		result.append(likelihood);
		result.append(')');
		return result.toString();
	}

} //SituationImpl
