/**
 */
package architecture.impl;

import architecture.Architecture_Package;
import architecture.Context;

import odeBase.TimeUnit;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecture.impl.ContextImpl#getUsageHistory <em>Usage History</em>}</li>
 *   <li>{@link architecture.impl.ContextImpl#getMissionTime <em>Mission Time</em>}</li>
 *   <li>{@link architecture.impl.ContextImpl#getMissionTimeTimeUnit <em>Mission Time Time Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends BaseElementImpl implements Context {
	/**
	 * The default value of the '{@link #getUsageHistory() <em>Usage History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_HISTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageHistory() <em>Usage History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageHistory()
	 * @generated
	 * @ordered
	 */
	protected String usageHistory = USAGE_HISTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissionTime() <em>Mission Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MISSION_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMissionTime() <em>Mission Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionTime()
	 * @generated
	 * @ordered
	 */
	protected double missionTime = MISSION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissionTimeTimeUnit() <em>Mission Time Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionTimeTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit MISSION_TIME_TIME_UNIT_EDEFAULT = TimeUnit.HOUR;

	/**
	 * The cached value of the '{@link #getMissionTimeTimeUnit() <em>Mission Time Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionTimeTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit missionTimeTimeUnit = MISSION_TIME_TIME_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architecture_Package.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageHistory() {
		return usageHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageHistory(String newUsageHistory) {
		String oldUsageHistory = usageHistory;
		usageHistory = newUsageHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.CONTEXT__USAGE_HISTORY, oldUsageHistory, usageHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMissionTime() {
		return missionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionTime(double newMissionTime) {
		double oldMissionTime = missionTime;
		missionTime = newMissionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.CONTEXT__MISSION_TIME, oldMissionTime, missionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getMissionTimeTimeUnit() {
		return missionTimeTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionTimeTimeUnit(TimeUnit newMissionTimeTimeUnit) {
		TimeUnit oldMissionTimeTimeUnit = missionTimeTimeUnit;
		missionTimeTimeUnit = newMissionTimeTimeUnit == null ? MISSION_TIME_TIME_UNIT_EDEFAULT : newMissionTimeTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.CONTEXT__MISSION_TIME_TIME_UNIT, oldMissionTimeTimeUnit, missionTimeTimeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Architecture_Package.CONTEXT__USAGE_HISTORY:
				return getUsageHistory();
			case Architecture_Package.CONTEXT__MISSION_TIME:
				return getMissionTime();
			case Architecture_Package.CONTEXT__MISSION_TIME_TIME_UNIT:
				return getMissionTimeTimeUnit();
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
			case Architecture_Package.CONTEXT__USAGE_HISTORY:
				setUsageHistory((String)newValue);
				return;
			case Architecture_Package.CONTEXT__MISSION_TIME:
				setMissionTime((Double)newValue);
				return;
			case Architecture_Package.CONTEXT__MISSION_TIME_TIME_UNIT:
				setMissionTimeTimeUnit((TimeUnit)newValue);
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
			case Architecture_Package.CONTEXT__USAGE_HISTORY:
				setUsageHistory(USAGE_HISTORY_EDEFAULT);
				return;
			case Architecture_Package.CONTEXT__MISSION_TIME:
				setMissionTime(MISSION_TIME_EDEFAULT);
				return;
			case Architecture_Package.CONTEXT__MISSION_TIME_TIME_UNIT:
				setMissionTimeTimeUnit(MISSION_TIME_TIME_UNIT_EDEFAULT);
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
			case Architecture_Package.CONTEXT__USAGE_HISTORY:
				return USAGE_HISTORY_EDEFAULT == null ? usageHistory != null : !USAGE_HISTORY_EDEFAULT.equals(usageHistory);
			case Architecture_Package.CONTEXT__MISSION_TIME:
				return missionTime != MISSION_TIME_EDEFAULT;
			case Architecture_Package.CONTEXT__MISSION_TIME_TIME_UNIT:
				return missionTimeTimeUnit != MISSION_TIME_TIME_UNIT_EDEFAULT;
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
		result.append(" (usageHistory: ");
		result.append(usageHistory);
		result.append(", missionTime: ");
		result.append(missionTime);
		result.append(", missionTimeTimeUnit: ");
		result.append(missionTimeTimeUnit);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
