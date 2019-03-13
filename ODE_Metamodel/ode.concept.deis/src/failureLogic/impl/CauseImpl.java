/**
 */
package failureLogic.impl;

import failureLogic.Cause;
import failureLogic.CauseType;
import failureLogic.Failure;
import failureLogic.FailureLogic_Package;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.impl.CauseImpl#getCauseType <em>Cause Type</em>}</li>
 *   <li>{@link failureLogic.impl.CauseImpl#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CauseImpl extends BaseElementImpl implements Cause {
	/**
	 * The default value of the '{@link #getCauseType() <em>Cause Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseType()
	 * @generated
	 * @ordered
	 */
	protected static final CauseType CAUSE_TYPE_EDEFAULT = CauseType.INPUT_EVENT;

	/**
	 * The cached value of the '{@link #getCauseType() <em>Cause Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseType()
	 * @generated
	 * @ordered
	 */
	protected CauseType causeType = CAUSE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected Failure failure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.CAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseType getCauseType() {
		return causeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCauseType(CauseType newCauseType) {
		CauseType oldCauseType = causeType;
		causeType = newCauseType == null ? CAUSE_TYPE_EDEFAULT : newCauseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.CAUSE__CAUSE_TYPE, oldCauseType, causeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure getFailure() {
		if (failure != null && failure.eIsProxy()) {
			InternalEObject oldFailure = (InternalEObject)failure;
			failure = (Failure)eResolveProxy(oldFailure);
			if (failure != oldFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FailureLogic_Package.CAUSE__FAILURE, oldFailure, failure));
			}
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure basicGetFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(Failure newFailure) {
		Failure oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.CAUSE__FAILURE, oldFailure, failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureLogic_Package.CAUSE__CAUSE_TYPE:
				return getCauseType();
			case FailureLogic_Package.CAUSE__FAILURE:
				if (resolve) return getFailure();
				return basicGetFailure();
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
			case FailureLogic_Package.CAUSE__CAUSE_TYPE:
				setCauseType((CauseType)newValue);
				return;
			case FailureLogic_Package.CAUSE__FAILURE:
				setFailure((Failure)newValue);
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
			case FailureLogic_Package.CAUSE__CAUSE_TYPE:
				setCauseType(CAUSE_TYPE_EDEFAULT);
				return;
			case FailureLogic_Package.CAUSE__FAILURE:
				setFailure((Failure)null);
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
			case FailureLogic_Package.CAUSE__CAUSE_TYPE:
				return causeType != CAUSE_TYPE_EDEFAULT;
			case FailureLogic_Package.CAUSE__FAILURE:
				return failure != null;
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
		result.append(" (causeType: ");
		result.append(causeType);
		result.append(')');
		return result.toString();
	}

} //CauseImpl
