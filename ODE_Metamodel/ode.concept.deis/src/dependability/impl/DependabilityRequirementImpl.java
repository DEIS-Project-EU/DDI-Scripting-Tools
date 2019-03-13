/**
 */
package dependability.impl;

import dependability.AssuranceLevel;
import dependability.DependabilityRequirement;
import dependability.Dependability_Package;
import dependability.MaintenanceProcedure;
import dependability.Measure;
import dependability.RequirementSource;

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
 * An implementation of the model object '<em><b>Dependability Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependability.impl.DependabilityRequirementImpl#getDecompositionArgument <em>Decomposition Argument</em>}</li>
 *   <li>{@link dependability.impl.DependabilityRequirementImpl#getRefinedRequirements <em>Refined Requirements</em>}</li>
 *   <li>{@link dependability.impl.DependabilityRequirementImpl#getRequirementSource <em>Requirement Source</em>}</li>
 *   <li>{@link dependability.impl.DependabilityRequirementImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link dependability.impl.DependabilityRequirementImpl#getFailures <em>Failures</em>}</li>
 *   <li>{@link dependability.impl.DependabilityRequirementImpl#getAssuranceLevel <em>Assurance Level</em>}</li>
 *   <li>{@link dependability.impl.DependabilityRequirementImpl#getMaintenanceProcedures <em>Maintenance Procedures</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DependabilityRequirementImpl extends BaseElementImpl implements DependabilityRequirement {
	/**
	 * The default value of the '{@link #getDecompositionArgument() <em>Decomposition Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositionArgument()
	 * @generated
	 * @ordered
	 */
	protected static final String DECOMPOSITION_ARGUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecompositionArgument() <em>Decomposition Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositionArgument()
	 * @generated
	 * @ordered
	 */
	protected String decompositionArgument = DECOMPOSITION_ARGUMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefinedRequirements() <em>Refined Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<DependabilityRequirement> refinedRequirements;

	/**
	 * The cached value of the '{@link #getRequirementSource() <em>Requirement Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementSource()
	 * @generated
	 * @ordered
	 */
	protected RequirementSource requirementSource;

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
	 * The cached value of the '{@link #getFailures() <em>Failures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailures()
	 * @generated
	 * @ordered
	 */
	protected EList<Failure> failures;

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
	 * The cached value of the '{@link #getMaintenanceProcedures() <em>Maintenance Procedures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<MaintenanceProcedure> maintenanceProcedures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependabilityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability_Package.Literals.DEPENDABILITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecompositionArgument() {
		return decompositionArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecompositionArgument(String newDecompositionArgument) {
		String oldDecompositionArgument = decompositionArgument;
		decompositionArgument = newDecompositionArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT, oldDecompositionArgument, decompositionArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependabilityRequirement> getRefinedRequirements() {
		if (refinedRequirements == null) {
			refinedRequirements = new EObjectResolvingEList<DependabilityRequirement>(DependabilityRequirement.class, this, Dependability_Package.DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS);
		}
		return refinedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementSource getRequirementSource() {
		if (requirementSource != null && requirementSource.eIsProxy()) {
			InternalEObject oldRequirementSource = (InternalEObject)requirementSource;
			requirementSource = (RequirementSource)eResolveProxy(oldRequirementSource);
			if (requirementSource != oldRequirementSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability_Package.DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE, oldRequirementSource, requirementSource));
			}
		}
		return requirementSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementSource basicGetRequirementSource() {
		return requirementSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementSource(RequirementSource newRequirementSource) {
		RequirementSource oldRequirementSource = requirementSource;
		requirementSource = newRequirementSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE, oldRequirementSource, requirementSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectResolvingEList<Measure>(Measure.class, this, Dependability_Package.DEPENDABILITY_REQUIREMENT__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Failure> getFailures() {
		if (failures == null) {
			failures = new EObjectResolvingEList<Failure>(Failure.class, this, Dependability_Package.DEPENDABILITY_REQUIREMENT__FAILURES);
		}
		return failures;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability_Package.DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability_Package.DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL, oldAssuranceLevel, assuranceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaintenanceProcedure> getMaintenanceProcedures() {
		if (maintenanceProcedures == null) {
			maintenanceProcedures = new EObjectResolvingEList<MaintenanceProcedure>(MaintenanceProcedure.class, this, Dependability_Package.DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES);
		}
		return maintenanceProcedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT:
				return getDecompositionArgument();
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS:
				return getRefinedRequirements();
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE:
				if (resolve) return getRequirementSource();
				return basicGetRequirementSource();
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__MEASURES:
				return getMeasures();
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__FAILURES:
				return getFailures();
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL:
				if (resolve) return getAssuranceLevel();
				return basicGetAssuranceLevel();
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES:
				return getMaintenanceProcedures();
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
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT:
				setDecompositionArgument((String)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS:
				getRefinedRequirements().clear();
				getRefinedRequirements().addAll((Collection<? extends DependabilityRequirement>)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE:
				setRequirementSource((RequirementSource)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__FAILURES:
				getFailures().clear();
				getFailures().addAll((Collection<? extends Failure>)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)newValue);
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES:
				getMaintenanceProcedures().clear();
				getMaintenanceProcedures().addAll((Collection<? extends MaintenanceProcedure>)newValue);
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
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT:
				setDecompositionArgument(DECOMPOSITION_ARGUMENT_EDEFAULT);
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS:
				getRefinedRequirements().clear();
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE:
				setRequirementSource((RequirementSource)null);
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__MEASURES:
				getMeasures().clear();
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__FAILURES:
				getFailures().clear();
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL:
				setAssuranceLevel((AssuranceLevel)null);
				return;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES:
				getMaintenanceProcedures().clear();
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
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT:
				return DECOMPOSITION_ARGUMENT_EDEFAULT == null ? decompositionArgument != null : !DECOMPOSITION_ARGUMENT_EDEFAULT.equals(decompositionArgument);
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS:
				return refinedRequirements != null && !refinedRequirements.isEmpty();
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE:
				return requirementSource != null;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__MEASURES:
				return measures != null && !measures.isEmpty();
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__FAILURES:
				return failures != null && !failures.isEmpty();
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL:
				return assuranceLevel != null;
			case Dependability_Package.DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES:
				return maintenanceProcedures != null && !maintenanceProcedures.isEmpty();
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
		result.append(" (decompositionArgument: ");
		result.append(decompositionArgument);
		result.append(')');
		return result.toString();
	}

} //DependabilityRequirementImpl
