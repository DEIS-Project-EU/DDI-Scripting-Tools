/**
 */
package failureLogic.impl;

import failureLogic.Cause;
import failureLogic.FailureLogic_Package;
import failureLogic.Gate;
import failureLogic.GateType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link failureLogic.impl.GateImpl#getGateType <em>Gate Type</em>}</li>
 *   <li>{@link failureLogic.impl.GateImpl#getCauses <em>Causes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GateImpl extends CauseImpl implements Gate {
	/**
	 * The default value of the '{@link #getGateType() <em>Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateType()
	 * @generated
	 * @ordered
	 */
	protected static final GateType GATE_TYPE_EDEFAULT = GateType.OR;

	/**
	 * The cached value of the '{@link #getGateType() <em>Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateType()
	 * @generated
	 * @ordered
	 */
	protected GateType gateType = GATE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCauses() <em>Causes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauses()
	 * @generated
	 * @ordered
	 */
	protected EList<Cause> causes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FailureLogic_Package.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateType getGateType() {
		return gateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateType(GateType newGateType) {
		GateType oldGateType = gateType;
		gateType = newGateType == null ? GATE_TYPE_EDEFAULT : newGateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FailureLogic_Package.GATE__GATE_TYPE, oldGateType, gateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cause> getCauses() {
		if (causes == null) {
			causes = new EObjectResolvingEList<Cause>(Cause.class, this, FailureLogic_Package.GATE__CAUSES);
		}
		return causes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FailureLogic_Package.GATE__GATE_TYPE:
				return getGateType();
			case FailureLogic_Package.GATE__CAUSES:
				return getCauses();
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
			case FailureLogic_Package.GATE__GATE_TYPE:
				setGateType((GateType)newValue);
				return;
			case FailureLogic_Package.GATE__CAUSES:
				getCauses().clear();
				getCauses().addAll((Collection<? extends Cause>)newValue);
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
			case FailureLogic_Package.GATE__GATE_TYPE:
				setGateType(GATE_TYPE_EDEFAULT);
				return;
			case FailureLogic_Package.GATE__CAUSES:
				getCauses().clear();
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
			case FailureLogic_Package.GATE__GATE_TYPE:
				return gateType != GATE_TYPE_EDEFAULT;
			case FailureLogic_Package.GATE__CAUSES:
				return causes != null && !causes.isEmpty();
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
		result.append(" (gateType: ");
		result.append(gateType);
		result.append(')');
		return result.toString();
	}

} //GateImpl
