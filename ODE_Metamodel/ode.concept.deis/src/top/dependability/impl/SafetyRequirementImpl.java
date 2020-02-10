/**
 */
package top.dependability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.dependability.Dependability_Package;
import top.dependability.Hazard;
import top.dependability.SafetyRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.dependability.impl.SafetyRequirementImpl#getFailureReactionTime <em>Failure Reaction Time</em>}</li>
 *   <li>{@link top.dependability.impl.SafetyRequirementImpl#getFailureDetectionTime <em>Failure Detection Time</em>}</li>
 *   <li>{@link top.dependability.impl.SafetyRequirementImpl#getFailureLatencyTime <em>Failure Latency Time</em>}</li>
 *   <li>{@link top.dependability.impl.SafetyRequirementImpl#isIsSafetyGoal <em>Is Safety Goal</em>}</li>
 *   <li>{@link top.dependability.impl.SafetyRequirementImpl#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyRequirementImpl extends DependabilityRequirementImpl implements SafetyRequirement {
	/**
	 * The default value of the '{@link #getFailureReactionTime() <em>Failure Reaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureReactionTime()
	 * @generated
	 * @ordered
	 */
	protected static final double FAILURE_REACTION_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFailureReactionTime() <em>Failure Reaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureReactionTime()
	 * @generated
	 * @ordered
	 */
	protected double failureReactionTime = FAILURE_REACTION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureDetectionTime() <em>Failure Detection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureDetectionTime()
	 * @generated
	 * @ordered
	 */
	protected static final double FAILURE_DETECTION_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFailureDetectionTime() <em>Failure Detection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureDetectionTime()
	 * @generated
	 * @ordered
	 */
	protected double failureDetectionTime = FAILURE_DETECTION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureLatencyTime() <em>Failure Latency Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureLatencyTime()
	 * @generated
	 * @ordered
	 */
	protected static final double FAILURE_LATENCY_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFailureLatencyTime() <em>Failure Latency Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureLatencyTime()
	 * @generated
	 * @ordered
	 */
	protected double failureLatencyTime = FAILURE_LATENCY_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSafetyGoal() <em>Is Safety Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSafetyGoal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SAFETY_GOAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSafetyGoal() <em>Is Safety Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSafetyGoal()
	 * @generated
	 * @ordered
	 */
	protected boolean isSafetyGoal = IS_SAFETY_GOAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.SAFETY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFailureReactionTime() {
		return failureReactionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureReactionTime(double newFailureReactionTime) {
		double oldFailureReactionTime = failureReactionTime;
		failureReactionTime = newFailureReactionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SAFETY_REQUIREMENT__FAILURE_REACTION_TIME, oldFailureReactionTime, failureReactionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFailureDetectionTime() {
		return failureDetectionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureDetectionTime(double newFailureDetectionTime) {
		double oldFailureDetectionTime = failureDetectionTime;
		failureDetectionTime = newFailureDetectionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SAFETY_REQUIREMENT__FAILURE_DETECTION_TIME, oldFailureDetectionTime, failureDetectionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFailureLatencyTime() {
		return failureLatencyTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureLatencyTime(double newFailureLatencyTime) {
		double oldFailureLatencyTime = failureLatencyTime;
		failureLatencyTime = newFailureLatencyTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SAFETY_REQUIREMENT__FAILURE_LATENCY_TIME, oldFailureLatencyTime, failureLatencyTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSafetyGoal() {
		return isSafetyGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSafetyGoal(boolean newIsSafetyGoal) {
		boolean oldIsSafetyGoal = isSafetyGoal;
		isSafetyGoal = newIsSafetyGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.SAFETY_REQUIREMENT__IS_SAFETY_GOAL, oldIsSafetyGoal, isSafetyGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hazard> getHazards() {
		if (hazards == null) {
			hazards = new EObjectResolvingEList<Hazard>(Hazard.class, this, Dependability_Package.SAFETY_REQUIREMENT__HAZARDS);
		}
		return hazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_REACTION_TIME:
				return getFailureReactionTime();
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_DETECTION_TIME:
				return getFailureDetectionTime();
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_LATENCY_TIME:
				return getFailureLatencyTime();
			case Dependability_Package.SAFETY_REQUIREMENT__IS_SAFETY_GOAL:
				return isIsSafetyGoal();
			case Dependability_Package.SAFETY_REQUIREMENT__HAZARDS:
				return getHazards();
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
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_REACTION_TIME:
				setFailureReactionTime((Double)newValue);
				return;
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_DETECTION_TIME:
				setFailureDetectionTime((Double)newValue);
				return;
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_LATENCY_TIME:
				setFailureLatencyTime((Double)newValue);
				return;
			case Dependability_Package.SAFETY_REQUIREMENT__IS_SAFETY_GOAL:
				setIsSafetyGoal((Boolean)newValue);
				return;
			case Dependability_Package.SAFETY_REQUIREMENT__HAZARDS:
				getHazards().clear();
				getHazards().addAll((Collection<? extends Hazard>)newValue);
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
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_REACTION_TIME:
				setFailureReactionTime(FAILURE_REACTION_TIME_EDEFAULT);
				return;
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_DETECTION_TIME:
				setFailureDetectionTime(FAILURE_DETECTION_TIME_EDEFAULT);
				return;
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_LATENCY_TIME:
				setFailureLatencyTime(FAILURE_LATENCY_TIME_EDEFAULT);
				return;
			case Dependability_Package.SAFETY_REQUIREMENT__IS_SAFETY_GOAL:
				setIsSafetyGoal(IS_SAFETY_GOAL_EDEFAULT);
				return;
			case Dependability_Package.SAFETY_REQUIREMENT__HAZARDS:
				getHazards().clear();
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
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_REACTION_TIME:
				return failureReactionTime != FAILURE_REACTION_TIME_EDEFAULT;
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_DETECTION_TIME:
				return failureDetectionTime != FAILURE_DETECTION_TIME_EDEFAULT;
			case Dependability_Package.SAFETY_REQUIREMENT__FAILURE_LATENCY_TIME:
				return failureLatencyTime != FAILURE_LATENCY_TIME_EDEFAULT;
			case Dependability_Package.SAFETY_REQUIREMENT__IS_SAFETY_GOAL:
				return isSafetyGoal != IS_SAFETY_GOAL_EDEFAULT;
			case Dependability_Package.SAFETY_REQUIREMENT__HAZARDS:
				return hazards != null && !hazards.isEmpty();
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
		result.append(" (failureReactionTime: ");
		result.append(failureReactionTime);
		result.append(", failureDetectionTime: ");
		result.append(failureDetectionTime);
		result.append(", failureLatencyTime: ");
		result.append(failureLatencyTime);
		result.append(", isSafetyGoal: ");
		result.append(isSafetyGoal);
		result.append(')');
		return result.toString();
	}

} //SafetyRequirementImpl
