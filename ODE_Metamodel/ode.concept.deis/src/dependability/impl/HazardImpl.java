/**
 */
package dependability.impl;

import dependability.Dependability_Package;
import dependability.Hazard;
import dependability.HazardType;
import dependability.Measure;

import failureLogic.Failure;

import java.util.Collection;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.HazardImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link dependability.impl.HazardImpl#getFailures <em>Failures</em>}</li>
 *   <li>{@link dependability.impl.HazardImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link dependability.impl.HazardImpl#getHazardType <em>Hazard Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardImpl extends BaseElementImpl implements Hazard {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailures() <em>Failures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailures()
	 * @generated
	 * @ordered
	 */
	protected EList<Failure> failures;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The cached value of the '{@link #getHazardType() <em>Hazard Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardType()
	 * @generated
	 * @ordered
	 */
	protected HazardType hazardType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.HAZARD__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Failure> getFailures() {
		if (failures == null) {
			failures = new EObjectResolvingEList<Failure>(Failure.class, this, Dependability_Package.HAZARD__FAILURES);
		}
		return failures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectResolvingEList<Measure>(Measure.class, this, Dependability_Package.HAZARD__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardType getHazardType() {
		if (hazardType != null && hazardType.eIsProxy()) {
			InternalEObject oldHazardType = (InternalEObject)hazardType;
			hazardType = (HazardType)eResolveProxy(oldHazardType);
			if (hazardType != oldHazardType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability_Package.HAZARD__HAZARD_TYPE, oldHazardType, hazardType));
			}
		}
		return hazardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardType basicGetHazardType() {
		return hazardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardType(HazardType newHazardType) {
		HazardType oldHazardType = hazardType;
		hazardType = newHazardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.HAZARD__HAZARD_TYPE, oldHazardType, hazardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.HAZARD__CONDITION:
				return getCondition();
			case Dependability_Package.HAZARD__FAILURES:
				return getFailures();
			case Dependability_Package.HAZARD__MEASURES:
				return getMeasures();
			case Dependability_Package.HAZARD__HAZARD_TYPE:
				if (resolve) return getHazardType();
				return basicGetHazardType();
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
			case Dependability_Package.HAZARD__CONDITION:
				setCondition((String)newValue);
				return;
			case Dependability_Package.HAZARD__FAILURES:
				getFailures().clear();
				getFailures().addAll((Collection<? extends Failure>)newValue);
				return;
			case Dependability_Package.HAZARD__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case Dependability_Package.HAZARD__HAZARD_TYPE:
				setHazardType((HazardType)newValue);
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
			case Dependability_Package.HAZARD__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case Dependability_Package.HAZARD__FAILURES:
				getFailures().clear();
				return;
			case Dependability_Package.HAZARD__MEASURES:
				getMeasures().clear();
				return;
			case Dependability_Package.HAZARD__HAZARD_TYPE:
				setHazardType((HazardType)null);
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
			case Dependability_Package.HAZARD__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case Dependability_Package.HAZARD__FAILURES:
				return failures != null && !failures.isEmpty();
			case Dependability_Package.HAZARD__MEASURES:
				return measures != null && !measures.isEmpty();
			case Dependability_Package.HAZARD__HAZARD_TYPE:
				return hazardType != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //HazardImpl
