/**
 */
package architecture.impl;

import architecture.Architecture_Package;
import architecture.Function;
import architecture.PerfChars;
import architecture.Port;
import architecture.Signal;

import dependability.Asset;
import dependability.AssuranceLevel;
import dependability.DependabilityRequirement;
import dependability.Malfunction;

import failureLogic.FailureModel;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecture.impl.FunctionImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link architecture.impl.FunctionImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link architecture.impl.FunctionImpl#getPerfChars <em>Perf Chars</em>}</li>
 *   <li>{@link architecture.impl.FunctionImpl#getSubFunctions <em>Sub Functions</em>}</li>
 *   <li>{@link architecture.impl.FunctionImpl#getAsAsset <em>As Asset</em>}</li>
 *   <li>{@link architecture.impl.FunctionImpl#getDependabilityRequirements <em>Dependability Requirements</em>}</li>
 *   <li>{@link architecture.impl.FunctionImpl#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link architecture.impl.FunctionImpl#getFailureModels <em>Failure Models</em>}</li>
 *   <li>{@link architecture.impl.FunctionImpl#getMalfunctions <em>Malfunctions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends BaseElementImpl implements Function {
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
	 * The cached value of the '{@link #getPerfChars() <em>Perf Chars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfChars()
	 * @generated
	 * @ordered
	 */
	protected PerfChars perfChars;

	/**
	 * The cached value of the '{@link #getSubFunctions() <em>Sub Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> subFunctions;

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
	 * The cached value of the '{@link #getFailureModels() <em>Failure Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModels()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureModel> failureModels;

	/**
	 * The cached value of the '{@link #getMalfunctions() <em>Malfunctions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMalfunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Malfunction> malfunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Architecture_Package.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectContainmentEList<Signal>(Signal.class, this, Architecture_Package.FUNCTION__SIGNALS);
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
			ports = new EObjectContainmentEList<Port>(Port.class, this, Architecture_Package.FUNCTION__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfChars getPerfChars() {
		return perfChars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerfChars(PerfChars newPerfChars, NotificationChain msgs) {
		PerfChars oldPerfChars = perfChars;
		perfChars = newPerfChars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Architecture_Package.FUNCTION__PERF_CHARS, oldPerfChars, newPerfChars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerfChars(PerfChars newPerfChars) {
		if (newPerfChars != perfChars) {
			NotificationChain msgs = null;
			if (perfChars != null)
				msgs = ((InternalEObject)perfChars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Architecture_Package.FUNCTION__PERF_CHARS, null, msgs);
			if (newPerfChars != null)
				msgs = ((InternalEObject)newPerfChars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Architecture_Package.FUNCTION__PERF_CHARS, null, msgs);
			msgs = basicSetPerfChars(newPerfChars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.FUNCTION__PERF_CHARS, newPerfChars, newPerfChars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getSubFunctions() {
		if (subFunctions == null) {
			subFunctions = new EObjectResolvingEList<Function>(Function.class, this, Architecture_Package.FUNCTION__SUB_FUNCTIONS);
		}
		return subFunctions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architecture_Package.FUNCTION__AS_ASSET, oldAsAsset, asAsset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.FUNCTION__AS_ASSET, oldAsAsset, asAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependabilityRequirement> getDependabilityRequirements() {
		if (dependabilityRequirements == null) {
			dependabilityRequirements = new EObjectResolvingEList<DependabilityRequirement>(DependabilityRequirement.class, this, Architecture_Package.FUNCTION__DEPENDABILITY_REQUIREMENTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Architecture_Package.FUNCTION__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Architecture_Package.FUNCTION__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureModel> getFailureModels() {
		if (failureModels == null) {
			failureModels = new EObjectResolvingEList<FailureModel>(FailureModel.class, this, Architecture_Package.FUNCTION__FAILURE_MODELS);
		}
		return failureModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Malfunction> getMalfunctions() {
		if (malfunctions == null) {
			malfunctions = new EObjectResolvingEList<Malfunction>(Malfunction.class, this, Architecture_Package.FUNCTION__MALFUNCTIONS);
		}
		return malfunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Architecture_Package.FUNCTION__SIGNALS:
				return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
			case Architecture_Package.FUNCTION__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case Architecture_Package.FUNCTION__PERF_CHARS:
				return basicSetPerfChars(null, msgs);
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
			case Architecture_Package.FUNCTION__SIGNALS:
				return getSignals();
			case Architecture_Package.FUNCTION__PORTS:
				return getPorts();
			case Architecture_Package.FUNCTION__PERF_CHARS:
				return getPerfChars();
			case Architecture_Package.FUNCTION__SUB_FUNCTIONS:
				return getSubFunctions();
			case Architecture_Package.FUNCTION__AS_ASSET:
				if (resolve) return getAsAsset();
				return basicGetAsAsset();
			case Architecture_Package.FUNCTION__DEPENDABILITY_REQUIREMENTS:
				return getDependabilityRequirements();
			case Architecture_Package.FUNCTION__ASSURANCE_LEVEL:
				if (resolve) return getAssuranceLevel();
				return basicGetAssuranceLevel();
			case Architecture_Package.FUNCTION__FAILURE_MODELS:
				return getFailureModels();
			case Architecture_Package.FUNCTION__MALFUNCTIONS:
				return getMalfunctions();
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
			case Architecture_Package.FUNCTION__SIGNALS:
				getSignals().clear();
				getSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case Architecture_Package.FUNCTION__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case Architecture_Package.FUNCTION__PERF_CHARS:
				setPerfChars((PerfChars)newValue);
				return;
			case Architecture_Package.FUNCTION__SUB_FUNCTIONS:
				getSubFunctions().clear();
				getSubFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case Architecture_Package.FUNCTION__AS_ASSET:
				setAsAsset((Asset)newValue);
				return;
			case Architecture_Package.FUNCTION__DEPENDABILITY_REQUIREMENTS:
				getDependabilityRequirements().clear();
				getDependabilityRequirements().addAll((Collection<? extends DependabilityRequirement>)newValue);
				return;
			case Architecture_Package.FUNCTION__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)newValue);
				return;
			case Architecture_Package.FUNCTION__FAILURE_MODELS:
				getFailureModels().clear();
				getFailureModels().addAll((Collection<? extends FailureModel>)newValue);
				return;
			case Architecture_Package.FUNCTION__MALFUNCTIONS:
				getMalfunctions().clear();
				getMalfunctions().addAll((Collection<? extends Malfunction>)newValue);
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
			case Architecture_Package.FUNCTION__SIGNALS:
				getSignals().clear();
				return;
			case Architecture_Package.FUNCTION__PORTS:
				getPorts().clear();
				return;
			case Architecture_Package.FUNCTION__PERF_CHARS:
				setPerfChars((PerfChars)null);
				return;
			case Architecture_Package.FUNCTION__SUB_FUNCTIONS:
				getSubFunctions().clear();
				return;
			case Architecture_Package.FUNCTION__AS_ASSET:
				setAsAsset((Asset)null);
				return;
			case Architecture_Package.FUNCTION__DEPENDABILITY_REQUIREMENTS:
				getDependabilityRequirements().clear();
				return;
			case Architecture_Package.FUNCTION__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)null);
				return;
			case Architecture_Package.FUNCTION__FAILURE_MODELS:
				getFailureModels().clear();
				return;
			case Architecture_Package.FUNCTION__MALFUNCTIONS:
				getMalfunctions().clear();
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
			case Architecture_Package.FUNCTION__SIGNALS:
				return signals != null && !signals.isEmpty();
			case Architecture_Package.FUNCTION__PORTS:
				return ports != null && !ports.isEmpty();
			case Architecture_Package.FUNCTION__PERF_CHARS:
				return perfChars != null;
			case Architecture_Package.FUNCTION__SUB_FUNCTIONS:
				return subFunctions != null && !subFunctions.isEmpty();
			case Architecture_Package.FUNCTION__AS_ASSET:
				return asAsset != null;
			case Architecture_Package.FUNCTION__DEPENDABILITY_REQUIREMENTS:
				return dependabilityRequirements != null && !dependabilityRequirements.isEmpty();
			case Architecture_Package.FUNCTION__ASSURANCE_LEVEL:
				return assuranceLevel != null;
			case Architecture_Package.FUNCTION__FAILURE_MODELS:
				return failureModels != null && !failureModels.isEmpty();
			case Architecture_Package.FUNCTION__MALFUNCTIONS:
				return malfunctions != null && !malfunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
