/**
 */
package top.failureLogic.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import top.failureLogic.Failure;
import top.failureLogic.FailureLogic_Package;
import top.failureLogic.State;

import top.odeBase.impl.BaseElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.failureLogic.impl.StateImpl#isIsInitialState <em>Is Initial State</em>}</li>
 *   <li>{@link top.failureLogic.impl.StateImpl#isIsFailState <em>Is Fail State</em>}</li>
 *   <li>{@link top.failureLogic.impl.StateImpl#getFailState <em>Fail State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends BaseElementImpl implements State {
	/**
	 * The default value of the '{@link #isIsInitialState() <em>Is Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInitialState() <em>Is Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitialState()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitialState = IS_INITIAL_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFailState() <em>Is Fail State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFailState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FAIL_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFailState() <em>Is Fail State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFailState()
	 * @generated
	 * @ordered
	 */
	protected boolean isFailState = IS_FAIL_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailState() <em>Fail State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailState()
	 * @generated
	 * @ordered
	 */
	protected Failure failState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInitialState() {
		return isInitialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitialState(boolean newIsInitialState) {
		boolean oldIsInitialState = isInitialState;
		isInitialState = newIsInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.STATE__IS_INITIAL_STATE, oldIsInitialState, isInitialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFailState() {
		return isFailState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFailState(boolean newIsFailState) {
		boolean oldIsFailState = isFailState;
		isFailState = newIsFailState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.STATE__IS_FAIL_STATE, oldIsFailState, isFailState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure getFailState() {
		if (failState != null && failState.eIsProxy()) {
			InternalEObject oldFailState = (InternalEObject)failState;
			failState = (Failure)eResolveProxy(oldFailState);
			if (failState != oldFailState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureLogic_Package.STATE__FAIL_STATE, oldFailState, failState));
			}
		}
		return failState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure basicGetFailState() {
		return failState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailState(Failure newFailState) {
		Failure oldFailState = failState;
		failState = newFailState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.STATE__FAIL_STATE, oldFailState, failState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureLogic_Package.STATE__IS_INITIAL_STATE:
				return isIsInitialState();
			case FailureLogic_Package.STATE__IS_FAIL_STATE:
				return isIsFailState();
			case FailureLogic_Package.STATE__FAIL_STATE:
				if (resolve) return getFailState();
				return basicGetFailState();
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
			case FailureLogic_Package.STATE__IS_INITIAL_STATE:
				setIsInitialState((Boolean)newValue);
				return;
			case FailureLogic_Package.STATE__IS_FAIL_STATE:
				setIsFailState((Boolean)newValue);
				return;
			case FailureLogic_Package.STATE__FAIL_STATE:
				setFailState((Failure)newValue);
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
			case FailureLogic_Package.STATE__IS_INITIAL_STATE:
				setIsInitialState(IS_INITIAL_STATE_EDEFAULT);
				return;
			case FailureLogic_Package.STATE__IS_FAIL_STATE:
				setIsFailState(IS_FAIL_STATE_EDEFAULT);
				return;
			case FailureLogic_Package.STATE__FAIL_STATE:
				setFailState((Failure)null);
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
			case FailureLogic_Package.STATE__IS_INITIAL_STATE:
				return isInitialState != IS_INITIAL_STATE_EDEFAULT;
			case FailureLogic_Package.STATE__IS_FAIL_STATE:
				return isFailState != IS_FAIL_STATE_EDEFAULT;
			case FailureLogic_Package.STATE__FAIL_STATE:
				return failState != null;
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
		result.append(" (isInitialState: ");
		result.append(isInitialState);
		result.append(", isFailState: ");
		result.append(isFailState);
		result.append(')');
		return result.toString();
	}

} //StateImpl
