/**
 */
package top.architecture.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import top.architecture.ArchitecturePackage;
import top.architecture.PerfChars;

import top.odeBase.impl.BaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perf Chars</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.architecture.impl.PerfCharsImpl#getResponseTime <em>Response Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerfCharsImpl extends BaseElementImpl implements PerfChars {
	/**
	 * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final double RESPONSE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected double responseTime = RESPONSE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfCharsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.PERF_CHARS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTime(double newResponseTime) {
		double oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.PERF_CHARS__RESPONSE_TIME, oldResponseTime, responseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.PERF_CHARS__RESPONSE_TIME:
				return getResponseTime();
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
			case ArchitecturePackage.PERF_CHARS__RESPONSE_TIME:
				setResponseTime((Double)newValue);
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
			case ArchitecturePackage.PERF_CHARS__RESPONSE_TIME:
				setResponseTime(RESPONSE_TIME_EDEFAULT);
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
			case ArchitecturePackage.PERF_CHARS__RESPONSE_TIME:
				return responseTime != RESPONSE_TIME_EDEFAULT;
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
		result.append(" (responseTime: ");
		result.append(responseTime);
		result.append(')');
		return result.toString();
	}

} //PerfCharsImpl
