/**
 */
package architecture.impl;

import architecture.Architecture_Package;
import architecture.Configuration;
import architecture.Context;
import architecture.Function;
import architecture.Port;
import architecture.Signal;
import architecture.SystemBoundary;

import dependability.Asset;
import dependability.AssuranceLevel;
import dependability.DependabilityRequirement;
import dependability.Standard;

import failureLogic.FailureModel;

import java.util.Collection;

import odeBase.TimeUnit;

import odeBase.impl.BaseElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecture.impl.SystemImpl#getOverallLifetime <em>Overall Lifetime</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getOverallLifetimeTimeUnit <em>Overall Lifetime Time Unit</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getSystemBoundaries <em>System Boundaries</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getSubSystems <em>Sub Systems</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getRealisedFunctions <em>Realised Functions</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getAsAsset <em>As Asset</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getAppliedStandards <em>Applied Standards</em>}</li>
 *   <li>{@link architecture.impl.SystemImpl#getFailureModels <em>Failure Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends BaseElementImpl implements architecture.System {
	/**
	 * The default value of the '{@link #getOverallLifetime() <em>Overall Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final double OVERALL_LIFETIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOverallLifetime() <em>Overall Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallLifetime()
	 * @generated
	 * @ordered
	 */
	protected double overallLifetime = OVERALL_LIFETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverallLifetimeTimeUnit() <em>Overall Lifetime Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallLifetimeTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit OVERALL_LIFETIME_TIME_UNIT_EDEFAULT = TimeUnit.HOUR;

	/**
	 * The cached value of the '{@link #getOverallLifetimeTimeUnit() <em>Overall Lifetime Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallLifetimeTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit overallLifetimeTimeUnit = OVERALL_LIFETIME_TIME_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystemBoundaries() <em>System Boundaries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemBoundaries()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemBoundary> systemBoundaries;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signals;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getSubSystems() <em>Sub Systems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<architecture.System> subSystems;

	/**
	 * The cached value of the '{@link #getRealisedFunctions() <em>Realised Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealisedFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> realisedFunctions;

	/**
	 * The cached value of the '{@link #getAsAsset() <em>As Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asAsset;

	/**
	 * The cached value of the '{@link #getDependabilityRequirements() <em>Dependability Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependabilityRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<DependabilityRequirement> dependabilityRequirements;

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
	 * The cached value of the '{@link #getAppliedStandards() <em>Applied Standards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedStandards()
	 * @generated
	 * @ordered
	 */
	protected EList<Standard> appliedStandards;

	/**
	 * The cached value of the '{@link #getFailureModels() <em>Failure Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModels()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModel> failureModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architecture_Package.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverallLifetime() {
		return overallLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallLifetime(double newOverallLifetime) {
		double oldOverallLifetime = overallLifetime;
		overallLifetime = newOverallLifetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.SYSTEM__OVERALL_LIFETIME, oldOverallLifetime, overallLifetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getOverallLifetimeTimeUnit() {
		return overallLifetimeTimeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallLifetimeTimeUnit(TimeUnit newOverallLifetimeTimeUnit) {
		TimeUnit oldOverallLifetimeTimeUnit = overallLifetimeTimeUnit;
		overallLifetimeTimeUnit = newOverallLifetimeTimeUnit == null ? OVERALL_LIFETIME_TIME_UNIT_EDEFAULT : newOverallLifetimeTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.SYSTEM__OVERALL_LIFETIME_TIME_UNIT, oldOverallLifetimeTimeUnit, overallLifetimeTimeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemBoundary> getSystemBoundaries() {
		if (systemBoundaries == null) {
			systemBoundaries = new EObjectContainmentEList<SystemBoundary>(SystemBoundary.class, this, Architecture_Package.SYSTEM__SYSTEM_BOUNDARIES);
		}
		return systemBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Context>(Context.class, this, Architecture_Package.SYSTEM__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, Architecture_Package.SYSTEM__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectContainmentEList<Signal>(Signal.class, this, Architecture_Package.SYSTEM__SIGNALS);
		}
		return signals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, Architecture_Package.SYSTEM__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<architecture.System> getSubSystems() {
		if (subSystems == null) {
			subSystems = new EObjectResolvingEList<architecture.System>(architecture.System.class, this, Architecture_Package.SYSTEM__SUB_SYSTEMS);
		}
		return subSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getRealisedFunctions() {
		if (realisedFunctions == null) {
			realisedFunctions = new EObjectResolvingEList<Function>(Function.class, this, Architecture_Package.SYSTEM__REALISED_FUNCTIONS);
		}
		return realisedFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsAsset() {
		if (asAsset != null && asAsset.eIsProxy()) {
			InternalEObject oldAsAsset = (InternalEObject)asAsset;
			asAsset = (Asset)eResolveProxy(oldAsAsset);
			if (asAsset != oldAsAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architecture_Package.SYSTEM__AS_ASSET, oldAsAsset, asAsset));
			}
		}
		return asAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsAsset() {
		return asAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsAsset(Asset newAsAsset) {
		Asset oldAsAsset = asAsset;
		asAsset = newAsAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.SYSTEM__AS_ASSET, oldAsAsset, asAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependabilityRequirement> getDependabilityRequirements() {
		if (dependabilityRequirements == null) {
			dependabilityRequirements = new EObjectResolvingEList<DependabilityRequirement>(DependabilityRequirement.class, this, Architecture_Package.SYSTEM__DEPENDABILITY_REQUIREMENTS);
		}
		return dependabilityRequirements;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architecture_Package.SYSTEM__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.SYSTEM__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Standard> getAppliedStandards() {
		if (appliedStandards == null) {
			appliedStandards = new EObjectResolvingEList<Standard>(Standard.class, this, Architecture_Package.SYSTEM__APPLIED_STANDARDS);
		}
		return appliedStandards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModel> getFailureModels() {
		if (failureModels == null) {
			failureModels = new EObjectResolvingEList<FailureModel>(FailureModel.class, this, Architecture_Package.SYSTEM__FAILURE_MODELS);
		}
		return failureModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Architecture_Package.SYSTEM__SYSTEM_BOUNDARIES:
				return ((InternalEList<?>)getSystemBoundaries()).basicRemove(otherEnd, msgs);
			case Architecture_Package.SYSTEM__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
			case Architecture_Package.SYSTEM__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case Architecture_Package.SYSTEM__SIGNALS:
				return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
			case Architecture_Package.SYSTEM__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Architecture_Package.SYSTEM__OVERALL_LIFETIME:
				return getOverallLifetime();
			case Architecture_Package.SYSTEM__OVERALL_LIFETIME_TIME_UNIT:
				return getOverallLifetimeTimeUnit();
			case Architecture_Package.SYSTEM__SYSTEM_BOUNDARIES:
				return getSystemBoundaries();
			case Architecture_Package.SYSTEM__CONTEXTS:
				return getContexts();
			case Architecture_Package.SYSTEM__CONFIGURATIONS:
				return getConfigurations();
			case Architecture_Package.SYSTEM__SIGNALS:
				return getSignals();
			case Architecture_Package.SYSTEM__PORTS:
				return getPorts();
			case Architecture_Package.SYSTEM__SUB_SYSTEMS:
				return getSubSystems();
			case Architecture_Package.SYSTEM__REALISED_FUNCTIONS:
				return getRealisedFunctions();
			case Architecture_Package.SYSTEM__AS_ASSET:
				if (resolve) return getAsAsset();
				return basicGetAsAsset();
			case Architecture_Package.SYSTEM__DEPENDABILITY_REQUIREMENTS:
				return getDependabilityRequirements();
			case Architecture_Package.SYSTEM__ASSURANCE_LEVEL:
				if (resolve) return getAssuranceLevel();
				return basicGetAssuranceLevel();
			case Architecture_Package.SYSTEM__APPLIED_STANDARDS:
				return getAppliedStandards();
			case Architecture_Package.SYSTEM__FAILURE_MODELS:
				return getFailureModels();
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
			case Architecture_Package.SYSTEM__OVERALL_LIFETIME:
				setOverallLifetime((Double)newValue);
				return;
			case Architecture_Package.SYSTEM__OVERALL_LIFETIME_TIME_UNIT:
				setOverallLifetimeTimeUnit((TimeUnit)newValue);
				return;
			case Architecture_Package.SYSTEM__SYSTEM_BOUNDARIES:
				getSystemBoundaries().clear();
				getSystemBoundaries().addAll((Collection<? extends SystemBoundary>)newValue);
				return;
			case Architecture_Package.SYSTEM__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case Architecture_Package.SYSTEM__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case Architecture_Package.SYSTEM__SIGNALS:
				getSignals().clear();
				getSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case Architecture_Package.SYSTEM__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case Architecture_Package.SYSTEM__SUB_SYSTEMS:
				getSubSystems().clear();
				getSubSystems().addAll((Collection<? extends architecture.System>)newValue);
				return;
			case Architecture_Package.SYSTEM__REALISED_FUNCTIONS:
				getRealisedFunctions().clear();
				getRealisedFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case Architecture_Package.SYSTEM__AS_ASSET:
				setAsAsset((Asset)newValue);
				return;
			case Architecture_Package.SYSTEM__DEPENDABILITY_REQUIREMENTS:
				getDependabilityRequirements().clear();
				getDependabilityRequirements().addAll((Collection<? extends DependabilityRequirement>)newValue);
				return;
			case Architecture_Package.SYSTEM__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)newValue);
				return;
			case Architecture_Package.SYSTEM__APPLIED_STANDARDS:
				getAppliedStandards().clear();
				getAppliedStandards().addAll((Collection<? extends Standard>)newValue);
				return;
			case Architecture_Package.SYSTEM__FAILURE_MODELS:
				getFailureModels().clear();
				getFailureModels().addAll((Collection<? extends FailureModel>)newValue);
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
			case Architecture_Package.SYSTEM__OVERALL_LIFETIME:
				setOverallLifetime(OVERALL_LIFETIME_EDEFAULT);
				return;
			case Architecture_Package.SYSTEM__OVERALL_LIFETIME_TIME_UNIT:
				setOverallLifetimeTimeUnit(OVERALL_LIFETIME_TIME_UNIT_EDEFAULT);
				return;
			case Architecture_Package.SYSTEM__SYSTEM_BOUNDARIES:
				getSystemBoundaries().clear();
				return;
			case Architecture_Package.SYSTEM__CONTEXTS:
				getContexts().clear();
				return;
			case Architecture_Package.SYSTEM__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case Architecture_Package.SYSTEM__SIGNALS:
				getSignals().clear();
				return;
			case Architecture_Package.SYSTEM__PORTS:
				getPorts().clear();
				return;
			case Architecture_Package.SYSTEM__SUB_SYSTEMS:
				getSubSystems().clear();
				return;
			case Architecture_Package.SYSTEM__REALISED_FUNCTIONS:
				getRealisedFunctions().clear();
				return;
			case Architecture_Package.SYSTEM__AS_ASSET:
				setAsAsset((Asset)null);
				return;
			case Architecture_Package.SYSTEM__DEPENDABILITY_REQUIREMENTS:
				getDependabilityRequirements().clear();
				return;
			case Architecture_Package.SYSTEM__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)null);
				return;
			case Architecture_Package.SYSTEM__APPLIED_STANDARDS:
				getAppliedStandards().clear();
				return;
			case Architecture_Package.SYSTEM__FAILURE_MODELS:
				getFailureModels().clear();
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
			case Architecture_Package.SYSTEM__OVERALL_LIFETIME:
				return overallLifetime != OVERALL_LIFETIME_EDEFAULT;
			case Architecture_Package.SYSTEM__OVERALL_LIFETIME_TIME_UNIT:
				return overallLifetimeTimeUnit != OVERALL_LIFETIME_TIME_UNIT_EDEFAULT;
			case Architecture_Package.SYSTEM__SYSTEM_BOUNDARIES:
				return systemBoundaries != null && !systemBoundaries.isEmpty();
			case Architecture_Package.SYSTEM__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case Architecture_Package.SYSTEM__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case Architecture_Package.SYSTEM__SIGNALS:
				return signals != null && !signals.isEmpty();
			case Architecture_Package.SYSTEM__PORTS:
				return ports != null && !ports.isEmpty();
			case Architecture_Package.SYSTEM__SUB_SYSTEMS:
				return subSystems != null && !subSystems.isEmpty();
			case Architecture_Package.SYSTEM__REALISED_FUNCTIONS:
				return realisedFunctions != null && !realisedFunctions.isEmpty();
			case Architecture_Package.SYSTEM__AS_ASSET:
				return asAsset != null;
			case Architecture_Package.SYSTEM__DEPENDABILITY_REQUIREMENTS:
				return dependabilityRequirements != null && !dependabilityRequirements.isEmpty();
			case Architecture_Package.SYSTEM__ASSURANCE_LEVEL:
				return assuranceLevel != null;
			case Architecture_Package.SYSTEM__APPLIED_STANDARDS:
				return appliedStandards != null && !appliedStandards.isEmpty();
			case Architecture_Package.SYSTEM__FAILURE_MODELS:
				return failureModels != null && !failureModels.isEmpty();
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
		result.append(" (overallLifetime: ");
		result.append(overallLifetime);
		result.append(", overallLifetimeTimeUnit: ");
		result.append(overallLifetimeTimeUnit);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
