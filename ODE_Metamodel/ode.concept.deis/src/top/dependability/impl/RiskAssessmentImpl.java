/**
 */
package top.dependability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.dependability.Dependability_Package;
import top.dependability.Hazard;
import top.dependability.RiskAssessment;
import top.dependability.RiskParameter;

import top.odeBase.impl.BaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.RiskAssessmentImpl#getRelatedStandard <em>Related Standard</em>}</li>
 *   <li>{@link top.dependability.impl.RiskAssessmentImpl#getRiskParameters <em>Risk Parameters</em>}</li>
 *   <li>{@link top.dependability.impl.RiskAssessmentImpl#getHazard <em>Hazard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskAssessmentImpl extends BaseElementImpl implements RiskAssessment {
	/**
	 * The default value of the '{@link #getRelatedStandard() <em>Related Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStandard()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATED_STANDARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedStandard() <em>Related Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStandard()
	 * @generated
	 * @ordered
	 */
	protected String relatedStandard = RELATED_STANDARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRiskParameters() <em>Risk Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskParameter> riskParameters;

	/**
	 * The cached value of the '{@link #getHazard() <em>Hazard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazard()
	 * @generated
	 * @ordered
	 */
	protected Hazard hazard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.RISK_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelatedStandard() {
		return relatedStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStandard(String newRelatedStandard) {
		String oldRelatedStandard = relatedStandard;
		relatedStandard = newRelatedStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.RISK_ASSESSMENT__RELATED_STANDARD, oldRelatedStandard, relatedStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RiskParameter> getRiskParameters() {
		if (riskParameters == null) {
			riskParameters = new EObjectResolvingEList<RiskParameter>(RiskParameter.class, this, Dependability_Package.RISK_ASSESSMENT__RISK_PARAMETERS);
		}
		return riskParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard getHazard() {
		if (hazard != null && hazard.eIsProxy()) {
			InternalEObject oldHazard = (InternalEObject)hazard;
			hazard = (Hazard)eResolveProxy(oldHazard);
			if (hazard != oldHazard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability_Package.RISK_ASSESSMENT__HAZARD, oldHazard, hazard));
			}
		}
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard basicGetHazard() {
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazard(Hazard newHazard) {
		Hazard oldHazard = hazard;
		hazard = newHazard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.RISK_ASSESSMENT__HAZARD, oldHazard, hazard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.RISK_ASSESSMENT__RELATED_STANDARD:
				return getRelatedStandard();
			case Dependability_Package.RISK_ASSESSMENT__RISK_PARAMETERS:
				return getRiskParameters();
			case Dependability_Package.RISK_ASSESSMENT__HAZARD:
				if (resolve) return getHazard();
				return basicGetHazard();
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
			case Dependability_Package.RISK_ASSESSMENT__RELATED_STANDARD:
				setRelatedStandard((String)newValue);
				return;
			case Dependability_Package.RISK_ASSESSMENT__RISK_PARAMETERS:
				getRiskParameters().clear();
				getRiskParameters().addAll((Collection<? extends RiskParameter>)newValue);
				return;
			case Dependability_Package.RISK_ASSESSMENT__HAZARD:
				setHazard((Hazard)newValue);
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
			case Dependability_Package.RISK_ASSESSMENT__RELATED_STANDARD:
				setRelatedStandard(RELATED_STANDARD_EDEFAULT);
				return;
			case Dependability_Package.RISK_ASSESSMENT__RISK_PARAMETERS:
				getRiskParameters().clear();
				return;
			case Dependability_Package.RISK_ASSESSMENT__HAZARD:
				setHazard((Hazard)null);
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
			case Dependability_Package.RISK_ASSESSMENT__RELATED_STANDARD:
				return RELATED_STANDARD_EDEFAULT == null ? relatedStandard != null : !RELATED_STANDARD_EDEFAULT.equals(relatedStandard);
			case Dependability_Package.RISK_ASSESSMENT__RISK_PARAMETERS:
				return riskParameters != null && !riskParameters.isEmpty();
			case Dependability_Package.RISK_ASSESSMENT__HAZARD:
				return hazard != null;
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
		result.append(" (relatedStandard: ");
		result.append(relatedStandard);
		result.append(')');
		return result.toString();
	}

} //RiskAssessmentImpl
