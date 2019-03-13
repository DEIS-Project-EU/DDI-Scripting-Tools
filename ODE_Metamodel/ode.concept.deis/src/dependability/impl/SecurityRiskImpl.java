/**
 */
package dependability.impl;

import dependability.AttackerGoal;
import dependability.Dependability_Package;
import dependability.SecurityRisk;

import java.util.Collection;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Risk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.SecurityRiskImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link dependability.impl.SecurityRiskImpl#getImpactAsset <em>Impact Asset</em>}</li>
 *   <li>{@link dependability.impl.SecurityRiskImpl#getImpactIndividuals <em>Impact Individuals</em>}</li>
 *   <li>{@link dependability.impl.SecurityRiskImpl#getImpactBusiness <em>Impact Business</em>}</li>
 *   <li>{@link dependability.impl.SecurityRiskImpl#getAttackerGoals <em>Attacker Goals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRiskImpl extends BaseElementImpl implements SecurityRisk {
	/**
	 * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final double LIKELIHOOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected double likelihood = LIKELIHOOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpactAsset() <em>Impact Asset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactAsset()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_ASSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpactAsset() <em>Impact Asset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactAsset()
	 * @generated
	 * @ordered
	 */
	protected String impactAsset = IMPACT_ASSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpactIndividuals() <em>Impact Individuals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactIndividuals()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_INDIVIDUALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpactIndividuals() <em>Impact Individuals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactIndividuals()
	 * @generated
	 * @ordered
	 */
	protected String impactIndividuals = IMPACT_INDIVIDUALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpactBusiness() <em>Impact Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactBusiness()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_BUSINESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpactBusiness() <em>Impact Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactBusiness()
	 * @generated
	 * @ordered
	 */
	protected String impactBusiness = IMPACT_BUSINESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttackerGoals() <em>Attacker Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackerGoal> attackerGoals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.SECURITY_RISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLikelihood() {
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLikelihood(double newLikelihood) {
		double oldLikelihood = likelihood;
		likelihood = newLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SECURITY_RISK__LIKELIHOOD, oldLikelihood, likelihood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpactAsset() {
		return impactAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactAsset(String newImpactAsset) {
		String oldImpactAsset = impactAsset;
		impactAsset = newImpactAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SECURITY_RISK__IMPACT_ASSET, oldImpactAsset, impactAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpactIndividuals() {
		return impactIndividuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactIndividuals(String newImpactIndividuals) {
		String oldImpactIndividuals = impactIndividuals;
		impactIndividuals = newImpactIndividuals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SECURITY_RISK__IMPACT_INDIVIDUALS, oldImpactIndividuals, impactIndividuals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpactBusiness() {
		return impactBusiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactBusiness(String newImpactBusiness) {
		String oldImpactBusiness = impactBusiness;
		impactBusiness = newImpactBusiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SECURITY_RISK__IMPACT_BUSINESS, oldImpactBusiness, impactBusiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttackerGoal> getAttackerGoals() {
		if (attackerGoals == null) {
			attackerGoals = new EObjectResolvingEList<AttackerGoal>(AttackerGoal.class, this, Dependability_Package.SECURITY_RISK__ATTACKER_GOALS);
		}
		return attackerGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.SECURITY_RISK__LIKELIHOOD:
				return getLikelihood();
			case Dependability_Package.SECURITY_RISK__IMPACT_ASSET:
				return getImpactAsset();
			case Dependability_Package.SECURITY_RISK__IMPACT_INDIVIDUALS:
				return getImpactIndividuals();
			case Dependability_Package.SECURITY_RISK__IMPACT_BUSINESS:
				return getImpactBusiness();
			case Dependability_Package.SECURITY_RISK__ATTACKER_GOALS:
				return getAttackerGoals();
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
			case Dependability_Package.SECURITY_RISK__LIKELIHOOD:
				setLikelihood((Double)newValue);
				return;
			case Dependability_Package.SECURITY_RISK__IMPACT_ASSET:
				setImpactAsset((String)newValue);
				return;
			case Dependability_Package.SECURITY_RISK__IMPACT_INDIVIDUALS:
				setImpactIndividuals((String)newValue);
				return;
			case Dependability_Package.SECURITY_RISK__IMPACT_BUSINESS:
				setImpactBusiness((String)newValue);
				return;
			case Dependability_Package.SECURITY_RISK__ATTACKER_GOALS:
				getAttackerGoals().clear();
				getAttackerGoals().addAll((Collection<? extends AttackerGoal>)newValue);
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
			case Dependability_Package.SECURITY_RISK__LIKELIHOOD:
				setLikelihood(LIKELIHOOD_EDEFAULT);
				return;
			case Dependability_Package.SECURITY_RISK__IMPACT_ASSET:
				setImpactAsset(IMPACT_ASSET_EDEFAULT);
				return;
			case Dependability_Package.SECURITY_RISK__IMPACT_INDIVIDUALS:
				setImpactIndividuals(IMPACT_INDIVIDUALS_EDEFAULT);
				return;
			case Dependability_Package.SECURITY_RISK__IMPACT_BUSINESS:
				setImpactBusiness(IMPACT_BUSINESS_EDEFAULT);
				return;
			case Dependability_Package.SECURITY_RISK__ATTACKER_GOALS:
				getAttackerGoals().clear();
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
			case Dependability_Package.SECURITY_RISK__LIKELIHOOD:
				return likelihood != LIKELIHOOD_EDEFAULT;
			case Dependability_Package.SECURITY_RISK__IMPACT_ASSET:
				return IMPACT_ASSET_EDEFAULT == null ? impactAsset != null : !IMPACT_ASSET_EDEFAULT.equals(impactAsset);
			case Dependability_Package.SECURITY_RISK__IMPACT_INDIVIDUALS:
				return IMPACT_INDIVIDUALS_EDEFAULT == null ? impactIndividuals != null : !IMPACT_INDIVIDUALS_EDEFAULT.equals(impactIndividuals);
			case Dependability_Package.SECURITY_RISK__IMPACT_BUSINESS:
				return IMPACT_BUSINESS_EDEFAULT == null ? impactBusiness != null : !IMPACT_BUSINESS_EDEFAULT.equals(impactBusiness);
			case Dependability_Package.SECURITY_RISK__ATTACKER_GOALS:
				return attackerGoals != null && !attackerGoals.isEmpty();
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
		result.append(", impactAsset: ");
		result.append(impactAsset);
		result.append(", impactIndividuals: ");
		result.append(impactIndividuals);
		result.append(", impactBusiness: ");
		result.append(impactBusiness);
		result.append(')');
		return result.toString();
	}

} //SecurityRiskImpl
