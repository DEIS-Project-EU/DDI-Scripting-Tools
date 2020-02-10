/**
 */
package top.dependability.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import top.dependability.*;

import top.integration.ODEProductPackage;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see top.dependability.Dependability_Package
 * @generated
 */
public class Dependability_AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dependability_Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability_AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Dependability_Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dependability_Switch<Adapter> modelSwitch =
		new Dependability_Switch<Adapter>() {
			@Override
			public Adapter caseMaintenanceProcedure(MaintenanceProcedure object) {
				return createMaintenanceProcedureAdapter();
			}
			@Override
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseFaultToleranceMeasure(FaultToleranceMeasure object) {
				return createFaultToleranceMeasureAdapter();
			}
			@Override
			public Adapter caseDependabilityPackage(DependabilityPackage object) {
				return createDependabilityPackageAdapter();
			}
			@Override
			public Adapter caseHARAPackage(HARAPackage object) {
				return createHARAPackageAdapter();
			}
			@Override
			public Adapter caseHazard(Hazard object) {
				return createHazardAdapter();
			}
			@Override
			public Adapter caseHazardTypeSystem(HazardTypeSystem object) {
				return createHazardTypeSystemAdapter();
			}
			@Override
			public Adapter caseHazardType(HazardType object) {
				return createHazardTypeAdapter();
			}
			@Override
			public Adapter caseMalfunction(Malfunction object) {
				return createMalfunctionAdapter();
			}
			@Override
			public Adapter caseRiskAssessment(RiskAssessment object) {
				return createRiskAssessmentAdapter();
			}
			@Override
			public Adapter caseRiskParameter(RiskParameter object) {
				return createRiskParameterAdapter();
			}
			@Override
			public Adapter caseSituation(Situation object) {
				return createSituationAdapter();
			}
			@Override
			public Adapter caseAccident(Accident object) {
				return createAccidentAdapter();
			}
			@Override
			public Adapter caseOperatorMeasure(OperatorMeasure object) {
				return createOperatorMeasureAdapter();
			}
			@Override
			public Adapter caseRequirementPackage(RequirementPackage object) {
				return createRequirementPackageAdapter();
			}
			@Override
			public Adapter caseRequirementSource(RequirementSource object) {
				return createRequirementSourceAdapter();
			}
			@Override
			public Adapter caseLegalContract(LegalContract object) {
				return createLegalContractAdapter();
			}
			@Override
			public Adapter caseDependabilityRequirement(DependabilityRequirement object) {
				return createDependabilityRequirementAdapter();
			}
			@Override
			public Adapter caseSafetyRequirement(SafetyRequirement object) {
				return createSafetyRequirementAdapter();
			}
			@Override
			public Adapter caseSecurityRequirement(SecurityRequirement object) {
				return createSecurityRequirementAdapter();
			}
			@Override
			public Adapter caseDomainPackage(DomainPackage object) {
				return createDomainPackageAdapter();
			}
			@Override
			public Adapter caseStandard(Standard object) {
				return createStandardAdapter();
			}
			@Override
			public Adapter caseAssuranceLevel(AssuranceLevel object) {
				return createAssuranceLevelAdapter();
			}
			@Override
			public Adapter caseSafetyStandard(SafetyStandard object) {
				return createSafetyStandardAdapter();
			}
			@Override
			public Adapter caseTARAPackage(TARAPackage object) {
				return createTARAPackageAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseSecurityControl(SecurityControl object) {
				return createSecurityControlAdapter();
			}
			@Override
			public Adapter caseSecurityCapability(SecurityCapability object) {
				return createSecurityCapabilityAdapter();
			}
			@Override
			public Adapter caseVulnerability(Vulnerability object) {
				return createVulnerabilityAdapter();
			}
			@Override
			public Adapter caseVulnerableItem(VulnerableItem object) {
				return createVulnerableItemAdapter();
			}
			@Override
			public Adapter caseAttackerGoal(AttackerGoal object) {
				return createAttackerGoalAdapter();
			}
			@Override
			public Adapter caseSecurityRisk(SecurityRisk object) {
				return createSecurityRiskAdapter();
			}
			@Override
			public Adapter caseAttack(Attack object) {
				return createAttackAdapter();
			}
			@Override
			public Adapter casePayload(Payload object) {
				return createPayloadAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseThreatAgent(ThreatAgent object) {
				return createThreatAgentAdapter();
			}
			@Override
			public Adapter caseHuman(Human object) {
				return createHumanAdapter();
			}
			@Override
			public Adapter caseNonHuman(NonHuman object) {
				return createNonHumanAdapter();
			}
			@Override
			public Adapter caseBaseElement(BaseElement object) {
				return createBaseElementAdapter();
			}
			@Override
			public Adapter caseODEProductPackage(ODEProductPackage object) {
				return createODEProductPackageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.MaintenanceProcedure <em>Maintenance Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.MaintenanceProcedure
	 * @generated
	 */
	public Adapter createMaintenanceProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.FaultToleranceMeasure <em>Fault Tolerance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.FaultToleranceMeasure
	 * @generated
	 */
	public Adapter createFaultToleranceMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.DependabilityPackage <em>Dependability Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.DependabilityPackage
	 * @generated
	 */
	public Adapter createDependabilityPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.HARAPackage <em>HARA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.HARAPackage
	 * @generated
	 */
	public Adapter createHARAPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Hazard
	 * @generated
	 */
	public Adapter createHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.HazardTypeSystem <em>Hazard Type System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.HazardTypeSystem
	 * @generated
	 */
	public Adapter createHazardTypeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.HazardType <em>Hazard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.HazardType
	 * @generated
	 */
	public Adapter createHazardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Malfunction <em>Malfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Malfunction
	 * @generated
	 */
	public Adapter createMalfunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.RiskAssessment <em>Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.RiskAssessment
	 * @generated
	 */
	public Adapter createRiskAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.RiskParameter <em>Risk Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.RiskParameter
	 * @generated
	 */
	public Adapter createRiskParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Situation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Situation
	 * @generated
	 */
	public Adapter createSituationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Accident <em>Accident</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Accident
	 * @generated
	 */
	public Adapter createAccidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.OperatorMeasure <em>Operator Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.OperatorMeasure
	 * @generated
	 */
	public Adapter createOperatorMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.RequirementPackage <em>Requirement Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.RequirementPackage
	 * @generated
	 */
	public Adapter createRequirementPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.RequirementSource <em>Requirement Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.RequirementSource
	 * @generated
	 */
	public Adapter createRequirementSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.LegalContract <em>Legal Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.LegalContract
	 * @generated
	 */
	public Adapter createLegalContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.DependabilityRequirement <em>Dependability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.DependabilityRequirement
	 * @generated
	 */
	public Adapter createDependabilityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.SafetyRequirement <em>Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.SafetyRequirement
	 * @generated
	 */
	public Adapter createSafetyRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.SecurityRequirement
	 * @generated
	 */
	public Adapter createSecurityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.DomainPackage <em>Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.DomainPackage
	 * @generated
	 */
	public Adapter createDomainPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Standard
	 * @generated
	 */
	public Adapter createStandardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.AssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.AssuranceLevel
	 * @generated
	 */
	public Adapter createAssuranceLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.SafetyStandard <em>Safety Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.SafetyStandard
	 * @generated
	 */
	public Adapter createSafetyStandardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.TARAPackage <em>TARA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.TARAPackage
	 * @generated
	 */
	public Adapter createTARAPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.SecurityControl <em>Security Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.SecurityControl
	 * @generated
	 */
	public Adapter createSecurityControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.SecurityCapability <em>Security Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.SecurityCapability
	 * @generated
	 */
	public Adapter createSecurityCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Vulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Vulnerability
	 * @generated
	 */
	public Adapter createVulnerabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.VulnerableItem <em>Vulnerable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.VulnerableItem
	 * @generated
	 */
	public Adapter createVulnerableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.AttackerGoal <em>Attacker Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.AttackerGoal
	 * @generated
	 */
	public Adapter createAttackerGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.SecurityRisk <em>Security Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.SecurityRisk
	 * @generated
	 */
	public Adapter createSecurityRiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Attack
	 * @generated
	 */
	public Adapter createAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Payload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Payload
	 * @generated
	 */
	public Adapter createPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.ThreatAgent <em>Threat Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.ThreatAgent
	 * @generated
	 */
	public Adapter createThreatAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.Human <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.Human
	 * @generated
	 */
	public Adapter createHumanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.dependability.NonHuman <em>Non Human</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.dependability.NonHuman
	 * @generated
	 */
	public Adapter createNonHumanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.odeBase.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.odeBase.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.integration.ODEProductPackage <em>ODE Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.integration.ODEProductPackage
	 * @generated
	 */
	public Adapter createODEProductPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Dependability_AdapterFactory
