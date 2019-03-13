/**
 */
package architecture.impl;

import architecture.Architecture_Package;
import architecture.SafetyFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecture.impl.SafetyFunctionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link architecture.impl.SafetyFunctionImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link architecture.impl.SafetyFunctionImpl#getSafeState <em>Safe State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyFunctionImpl extends FunctionImpl implements SafetyFunction {
	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected String object = OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected String behavior = BEHAVIOR_EDEFAULT;

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
	protected SafetyFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architecture_Package.Literals.SAFETY_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(String newObject) {
		String oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.SAFETY_FUNCTION__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(String newBehavior) {
		String oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.SAFETY_FUNCTION__BEHAVIOR, oldBehavior, behavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.SAFETY_FUNCTION__SAFE_STATE, oldSafeState, safeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Architecture_Package.SAFETY_FUNCTION__OBJECT:
				return getObject();
			case Architecture_Package.SAFETY_FUNCTION__BEHAVIOR:
				return getBehavior();
			case Architecture_Package.SAFETY_FUNCTION__SAFE_STATE:
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
			case Architecture_Package.SAFETY_FUNCTION__OBJECT:
				setObject((String)newValue);
				return;
			case Architecture_Package.SAFETY_FUNCTION__BEHAVIOR:
				setBehavior((String)newValue);
				return;
			case Architecture_Package.SAFETY_FUNCTION__SAFE_STATE:
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
			case Architecture_Package.SAFETY_FUNCTION__OBJECT:
				setObject(OBJECT_EDEFAULT);
				return;
			case Architecture_Package.SAFETY_FUNCTION__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
				return;
			case Architecture_Package.SAFETY_FUNCTION__SAFE_STATE:
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
			case Architecture_Package.SAFETY_FUNCTION__OBJECT:
				return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
			case Architecture_Package.SAFETY_FUNCTION__BEHAVIOR:
				return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
			case Architecture_Package.SAFETY_FUNCTION__SAFE_STATE:
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
		result.append(" (object: ");
		result.append(object);
		result.append(", behavior: ");
		result.append(behavior);
		result.append(", safeState: ");
		result.append(safeState);
		result.append(')');
		return result.toString();
	}

} //SafetyFunctionImpl
