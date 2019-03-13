/**
 */
package architecture.impl;

import architecture.Architecture_Package;
import architecture.SafetyRelatedSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Related System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecture.impl.SafetyRelatedSystemImpl#getSafeState <em>Safe State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyRelatedSystemImpl extends SystemImpl implements SafetyRelatedSystem {
	/**
	 * The default value of the '{@link #getSafeState() <em>Safe State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeState()
	 * @generated
	 * @ordered
	 */
	protected static final String SAFE_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSafeState() <em>Safe State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeState()
	 * @generated
	 * @ordered
	 */
	protected String safeState = SAFE_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyRelatedSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architecture_Package.Literals.SAFETY_RELATED_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSafeState() {
		return safeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafeState(String newSafeState) {
		String oldSafeState = safeState;
		safeState = newSafeState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.SAFETY_RELATED_SYSTEM__SAFE_STATE, oldSafeState, safeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Architecture_Package.SAFETY_RELATED_SYSTEM__SAFE_STATE:
				return getSafeState();
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
			case Architecture_Package.SAFETY_RELATED_SYSTEM__SAFE_STATE:
				setSafeState((String)newValue);
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
			case Architecture_Package.SAFETY_RELATED_SYSTEM__SAFE_STATE:
				setSafeState(SAFE_STATE_EDEFAULT);
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
			case Architecture_Package.SAFETY_RELATED_SYSTEM__SAFE_STATE:
				return SAFE_STATE_EDEFAULT == null ? safeState != null : !SAFE_STATE_EDEFAULT.equals(safeState);
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
		result.append(" (safeState: ");
		result.append(safeState);
		result.append(')');
		return result.toString();
	}

} //SafetyRelatedSystemImpl
