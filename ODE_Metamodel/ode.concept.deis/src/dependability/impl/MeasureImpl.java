/**
 */
package dependability.impl;

import dependability.AssuranceLevel;
import dependability.Dependability_Package;
import dependability.Measure;
import dependability.MeasureType;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.MeasureImpl#getIntrinsicSafety <em>Intrinsic Safety</em>}</li>
 *   <li>{@link dependability.impl.MeasureImpl#getSafeGuard <em>Safe Guard</em>}</li>
 *   <li>{@link dependability.impl.MeasureImpl#getApplierInformation <em>Applier Information</em>}</li>
 *   <li>{@link dependability.impl.MeasureImpl#isRiskAcceptability <em>Risk Acceptability</em>}</li>
 *   <li>{@link dependability.impl.MeasureImpl#getFurtherAction <em>Further Action</em>}</li>
 *   <li>{@link dependability.impl.MeasureImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dependability.impl.MeasureImpl#getMeasureType <em>Measure Type</em>}</li>
 *   <li>{@link dependability.impl.MeasureImpl#getAssuranceLevel <em>Assurance Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureImpl extends BaseElementImpl implements Measure {
	/**
	 * The default value of the '{@link #getIntrinsicSafety() <em>Intrinsic Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntrinsicSafety()
	 * @generated
	 * @ordered
	 */
	protected static final String INTRINSIC_SAFETY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntrinsicSafety() <em>Intrinsic Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntrinsicSafety()
	 * @generated
	 * @ordered
	 */
	protected String intrinsicSafety = INTRINSIC_SAFETY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSafeGuard() <em>Safe Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String SAFE_GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSafeGuard() <em>Safe Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeGuard()
	 * @generated
	 * @ordered
	 */
	protected String safeGuard = SAFE_GUARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplierInformation() <em>Applier Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplierInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLIER_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplierInformation() <em>Applier Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplierInformation()
	 * @generated
	 * @ordered
	 */
	protected String applierInformation = APPLIER_INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRiskAcceptability() <em>Risk Acceptability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRiskAcceptability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RISK_ACCEPTABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRiskAcceptability() <em>Risk Acceptability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRiskAcceptability()
	 * @generated
	 * @ordered
	 */
	protected boolean riskAcceptability = RISK_ACCEPTABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFurtherAction() <em>Further Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurtherAction()
	 * @generated
	 * @ordered
	 */
	protected static final String FURTHER_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFurtherAction() <em>Further Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurtherAction()
	 * @generated
	 * @ordered
	 */
	protected String furtherAction = FURTHER_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasureType() <em>Measure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureType()
	 * @generated
	 * @ordered
	 */
	protected MeasureType measureType;

	/**
	 * The cached value of the '{@link #getAssuranceLevel() <em>Assurance Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceLevel()
	 * @generated
	 * @ordered
	 */
	protected AssuranceLevel assuranceLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntrinsicSafety() {
		return intrinsicSafety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntrinsicSafety(String newIntrinsicSafety) {
		String oldIntrinsicSafety = intrinsicSafety;
		intrinsicSafety = newIntrinsicSafety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MEASURE__INTRINSIC_SAFETY, oldIntrinsicSafety, intrinsicSafety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSafeGuard() {
		return safeGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafeGuard(String newSafeGuard) {
		String oldSafeGuard = safeGuard;
		safeGuard = newSafeGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MEASURE__SAFE_GUARD, oldSafeGuard, safeGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplierInformation() {
		return applierInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplierInformation(String newApplierInformation) {
		String oldApplierInformation = applierInformation;
		applierInformation = newApplierInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MEASURE__APPLIER_INFORMATION, oldApplierInformation, applierInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRiskAcceptability() {
		return riskAcceptability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskAcceptability(boolean newRiskAcceptability) {
		boolean oldRiskAcceptability = riskAcceptability;
		riskAcceptability = newRiskAcceptability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MEASURE__RISK_ACCEPTABILITY, oldRiskAcceptability, riskAcceptability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFurtherAction() {
		return furtherAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFurtherAction(String newFurtherAction) {
		String oldFurtherAction = furtherAction;
		furtherAction = newFurtherAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MEASURE__FURTHER_ACTION, oldFurtherAction, furtherAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MEASURE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getMeasureType() {
		if (measureType != null && measureType.eIsProxy()) {
			InternalEObject oldMeasureType = (InternalEObject)measureType;
			measureType = (MeasureType)eResolveProxy(oldMeasureType);
			if (measureType != oldMeasureType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability_Package.MEASURE__MEASURE_TYPE, oldMeasureType, measureType));
			}
		}
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType basicGetMeasureType() {
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureType(MeasureType newMeasureType) {
		MeasureType oldMeasureType = measureType;
		measureType = newMeasureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MEASURE__MEASURE_TYPE, oldMeasureType, measureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceLevel getAssuranceLevel() {
		if (assuranceLevel != null && assuranceLevel.eIsProxy()) {
			InternalEObject oldAssuranceLevel = (InternalEObject)assuranceLevel;
			assuranceLevel = (AssuranceLevel)eResolveProxy(oldAssuranceLevel);
			if (assuranceLevel != oldAssuranceLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability_Package.MEASURE__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
			}
		}
		return assuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceLevel basicGetAssuranceLevel() {
		return assuranceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssuranceLevel(AssuranceLevel newAssuranceLevel) {
		AssuranceLevel oldAssuranceLevel = assuranceLevel;
		assuranceLevel = newAssuranceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.MEASURE__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.MEASURE__INTRINSIC_SAFETY:
				return getIntrinsicSafety();
			case Dependability_Package.MEASURE__SAFE_GUARD:
				return getSafeGuard();
			case Dependability_Package.MEASURE__APPLIER_INFORMATION:
				return getApplierInformation();
			case Dependability_Package.MEASURE__RISK_ACCEPTABILITY:
				return isRiskAcceptability();
			case Dependability_Package.MEASURE__FURTHER_ACTION:
				return getFurtherAction();
			case Dependability_Package.MEASURE__SOURCE:
				return getSource();
			case Dependability_Package.MEASURE__MEASURE_TYPE:
				if (resolve) return getMeasureType();
				return basicGetMeasureType();
			case Dependability_Package.MEASURE__ASSURANCE_LEVEL:
				if (resolve) return getAssuranceLevel();
				return basicGetAssuranceLevel();
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
			case Dependability_Package.MEASURE__INTRINSIC_SAFETY:
				setIntrinsicSafety((String)newValue);
				return;
			case Dependability_Package.MEASURE__SAFE_GUARD:
				setSafeGuard((String)newValue);
				return;
			case Dependability_Package.MEASURE__APPLIER_INFORMATION:
				setApplierInformation((String)newValue);
				return;
			case Dependability_Package.MEASURE__RISK_ACCEPTABILITY:
				setRiskAcceptability((Boolean)newValue);
				return;
			case Dependability_Package.MEASURE__FURTHER_ACTION:
				setFurtherAction((String)newValue);
				return;
			case Dependability_Package.MEASURE__SOURCE:
				setSource((String)newValue);
				return;
			case Dependability_Package.MEASURE__MEASURE_TYPE:
				setMeasureType((MeasureType)newValue);
				return;
			case Dependability_Package.MEASURE__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)newValue);
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
			case Dependability_Package.MEASURE__INTRINSIC_SAFETY:
				setIntrinsicSafety(INTRINSIC_SAFETY_EDEFAULT);
				return;
			case Dependability_Package.MEASURE__SAFE_GUARD:
				setSafeGuard(SAFE_GUARD_EDEFAULT);
				return;
			case Dependability_Package.MEASURE__APPLIER_INFORMATION:
				setApplierInformation(APPLIER_INFORMATION_EDEFAULT);
				return;
			case Dependability_Package.MEASURE__RISK_ACCEPTABILITY:
				setRiskAcceptability(RISK_ACCEPTABILITY_EDEFAULT);
				return;
			case Dependability_Package.MEASURE__FURTHER_ACTION:
				setFurtherAction(FURTHER_ACTION_EDEFAULT);
				return;
			case Dependability_Package.MEASURE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case Dependability_Package.MEASURE__MEASURE_TYPE:
				setMeasureType((MeasureType)null);
				return;
			case Dependability_Package.MEASURE__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)null);
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
			case Dependability_Package.MEASURE__INTRINSIC_SAFETY:
				return INTRINSIC_SAFETY_EDEFAULT == null ? intrinsicSafety != null : !INTRINSIC_SAFETY_EDEFAULT.equals(intrinsicSafety);
			case Dependability_Package.MEASURE__SAFE_GUARD:
				return SAFE_GUARD_EDEFAULT == null ? safeGuard != null : !SAFE_GUARD_EDEFAULT.equals(safeGuard);
			case Dependability_Package.MEASURE__APPLIER_INFORMATION:
				return APPLIER_INFORMATION_EDEFAULT == null ? applierInformation != null : !APPLIER_INFORMATION_EDEFAULT.equals(applierInformation);
			case Dependability_Package.MEASURE__RISK_ACCEPTABILITY:
				return riskAcceptability != RISK_ACCEPTABILITY_EDEFAULT;
			case Dependability_Package.MEASURE__FURTHER_ACTION:
				return FURTHER_ACTION_EDEFAULT == null ? furtherAction != null : !FURTHER_ACTION_EDEFAULT.equals(furtherAction);
			case Dependability_Package.MEASURE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case Dependability_Package.MEASURE__MEASURE_TYPE:
				return measureType != null;
			case Dependability_Package.MEASURE__ASSURANCE_LEVEL:
				return assuranceLevel != null;
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
		result.append(" (intrinsicSafety: ");
		result.append(intrinsicSafety);
		result.append(", safeGuard: ");
		result.append(safeGuard);
		result.append(", applierInformation: ");
		result.append(applierInformation);
		result.append(", riskAcceptability: ");
		result.append(riskAcceptability);
		result.append(", furtherAction: ");
		result.append(furtherAction);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //MeasureImpl
