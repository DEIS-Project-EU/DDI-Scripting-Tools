/**
 */
package dependability.impl;

import dependability.Dependability_Package;
import dependability.OperatorMeasure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.OperatorMeasureImpl#getControlability <em>Controlability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorMeasureImpl extends RiskParameterImpl implements OperatorMeasure {
	/**
	 * The default value of the '{@link #getControlability() <em>Controlability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlability()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlability() <em>Controlability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlability()
	 * @generated
	 * @ordered
	 */
	protected String controlability = CONTROLABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.OPERATOR_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlability() {
		return controlability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlability(String newControlability) {
		String oldControlability = controlability;
		controlability = newControlability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.OPERATOR_MEASURE__CONTROLABILITY, oldControlability, controlability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.OPERATOR_MEASURE__CONTROLABILITY:
				return getControlability();
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
			case Dependability_Package.OPERATOR_MEASURE__CONTROLABILITY:
				setControlability((String)newValue);
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
			case Dependability_Package.OPERATOR_MEASURE__CONTROLABILITY:
				setControlability(CONTROLABILITY_EDEFAULT);
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
			case Dependability_Package.OPERATOR_MEASURE__CONTROLABILITY:
				return CONTROLABILITY_EDEFAULT == null ? controlability != null : !CONTROLABILITY_EDEFAULT.equals(controlability);
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
		result.append(" (controlability: ");
		result.append(controlability);
		result.append(')');
		return result.toString();
	}

} //OperatorMeasureImpl
