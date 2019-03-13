/**
 */
package dependability.util;

import dependability.*;

import integration.ODEProductPackage;

import odeBase.BaseElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dependability.Dependability_Package
 * @generated
 */
public class Dependability_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dependability_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability_Switch() {
		if (modelPackage == null) {
			modelPackage = Dependability_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Dependability_Package.MAINTENANCE_PROCEDURE: {
				MaintenanceProcedure maintenanceProcedure = (MaintenanceProcedure)theEObject;
				T result = caseMaintenanceProcedure(maintenanceProcedure);
				if (result == null) result = caseBaseElement(maintenanceProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.MEASURE_TYPE: {
				MeasureType measureType = (MeasureType)theEObject;
				T result = caseMeasureType(measureType);
				if (result == null) result = caseBaseElement(measureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = caseBaseElement(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.FAULT_TOLERANCE_MEASURE: {
				FaultToleranceMeasure faultToleranceMeasure = (FaultToleranceMeasure)theEObject;
				T result = caseFaultToleranceMeasure(faultToleranceMeasure);
				if (result == null) result = caseMeasure(faultToleranceMeasure);
				if (result == null) result = caseBaseElement(faultToleranceMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.DEPENDABILITY_PACKAGE: {
				DependabilityPackage dependabilityPackage = (DependabilityPackage)theEObject;
				T result = caseDependabilityPackage(dependabilityPackage);
				if (result == null) result = caseODEProductPackage(dependabilityPackage);
				if (result == null) result = caseBaseElement(dependabilityPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.HARA_PACKAGE: {
				HARAPackage haraPackage = (HARAPackage)theEObject;
				T result = caseHARAPackage(haraPackage);
				if (result == null) result = caseODEProductPackage(haraPackage);
				if (result == null) result = caseBaseElement(haraPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.HAZARD: {
				Hazard hazard = (Hazard)theEObject;
				T result = caseHazard(hazard);
				if (result == null) result = caseBaseElement(hazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.HAZARD_TYPE_SYSTEM: {
				HazardTypeSystem hazardTypeSystem = (HazardTypeSystem)theEObject;
				T result = caseHazardTypeSystem(hazardTypeSystem);
				if (result == null) result = caseBaseElement(hazardTypeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.HAZARD_TYPE: {
				HazardType hazardType = (HazardType)theEObject;
				T result = caseHazardType(hazardType);
				if (result == null) result = caseBaseElement(hazardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.MALFUNCTION: {
				Malfunction malfunction = (Malfunction)theEObject;
				T result = caseMalfunction(malfunction);
				if (result == null) result = caseBaseElement(malfunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.RISK_ASSESSMENT: {
				RiskAssessment riskAssessment = (RiskAssessment)theEObject;
				T result = caseRiskAssessment(riskAssessment);
				if (result == null) result = caseBaseElement(riskAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.RISK_PARAMETER: {
				RiskParameter riskParameter = (RiskParameter)theEObject;
				T result = caseRiskParameter(riskParameter);
				if (result == null) result = caseBaseElement(riskParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.SITUATION: {
				Situation situation = (Situation)theEObject;
				T result = caseSituation(situation);
				if (result == null) result = caseRiskParameter(situation);
				if (result == null) result = caseBaseElement(situation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.ACCIDENT: {
				Accident accident = (Accident)theEObject;
				T result = caseAccident(accident);
				if (result == null) result = caseRiskParameter(accident);
				if (result == null) result = caseBaseElement(accident);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.OPERATOR_MEASURE: {
				OperatorMeasure operatorMeasure = (OperatorMeasure)theEObject;
				T result = caseOperatorMeasure(operatorMeasure);
				if (result == null) result = caseRiskParameter(operatorMeasure);
				if (result == null) result = caseBaseElement(operatorMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.REQUIREMENT_PACKAGE: {
				RequirementPackage requirementPackage = (RequirementPackage)theEObject;
				T result = caseRequirementPackage(requirementPackage);
				if (result == null) result = caseODEProductPackage(requirementPackage);
				if (result == null) result = caseBaseElement(requirementPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.REQUIREMENT_SOURCE: {
				RequirementSource requirementSource = (RequirementSource)theEObject;
				T result = caseRequirementSource(requirementSource);
				if (result == null) result = caseBaseElement(requirementSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.LEGAL_CONTRACT: {
				LegalContract legalContract = (LegalContract)theEObject;
				T result = caseLegalContract(legalContract);
				if (result == null) result = caseRequirementSource(legalContract);
				if (result == null) result = caseBaseElement(legalContract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.DEPENDABILITY_REQUIREMENT: {
				DependabilityRequirement dependabilityRequirement = (DependabilityRequirement)theEObject;
				T result = caseDependabilityRequirement(dependabilityRequirement);
				if (result == null) result = caseBaseElement(dependabilityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.SAFETY_REQUIREMENT: {
				SafetyRequirement safetyRequirement = (SafetyRequirement)theEObject;
				T result = caseSafetyRequirement(safetyRequirement);
				if (result == null) result = caseDependabilityRequirement(safetyRequirement);
				if (result == null) result = caseBaseElement(safetyRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = caseDependabilityRequirement(securityRequirement);
				if (result == null) result = caseBaseElement(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.DOMAIN_PACKAGE: {
				DomainPackage domainPackage = (DomainPackage)theEObject;
				T result = caseDomainPackage(domainPackage);
				if (result == null) result = caseODEProductPackage(domainPackage);
				if (result == null) result = caseBaseElement(domainPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.STANDARD: {
				Standard standard = (Standard)theEObject;
				T result = caseStandard(standard);
				if (result == null) result = caseBaseElement(standard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.ASSURANCE_LEVEL: {
				AssuranceLevel assuranceLevel = (AssuranceLevel)theEObject;
				T result = caseAssuranceLevel(assuranceLevel);
				if (result == null) result = caseBaseElement(assuranceLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.SAFETY_STANDARD: {
				SafetyStandard safetyStandard = (SafetyStandard)theEObject;
				T result = caseSafetyStandard(safetyStandard);
				if (result == null) result = caseStandard(safetyStandard);
				if (result == null) result = caseBaseElement(safetyStandard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.TARA_PACKAGE: {
				TARAPackage taraPackage = (TARAPackage)theEObject;
				T result = caseTARAPackage(taraPackage);
				if (result == null) result = caseODEProductPackage(taraPackage);
				if (result == null) result = caseBaseElement(taraPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = caseBaseElement(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.SECURITY_CONTROL: {
				SecurityControl securityControl = (SecurityControl)theEObject;
				T result = caseSecurityControl(securityControl);
				if (result == null) result = caseMeasure(securityControl);
				if (result == null) result = caseBaseElement(securityControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.SECURITY_CAPABILITY: {
				SecurityCapability securityCapability = (SecurityCapability)theEObject;
				T result = caseSecurityCapability(securityCapability);
				if (result == null) result = caseBaseElement(securityCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.VULNERABILITY: {
				Vulnerability vulnerability = (Vulnerability)theEObject;
				T result = caseVulnerability(vulnerability);
				if (result == null) result = caseBaseElement(vulnerability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.VULNERABLE_ITEM: {
				VulnerableItem vulnerableItem = (VulnerableItem)theEObject;
				T result = caseVulnerableItem(vulnerableItem);
				if (result == null) result = caseAsset(vulnerableItem);
				if (result == null) result = caseBaseElement(vulnerableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.ATTACKER_GOAL: {
				AttackerGoal attackerGoal = (AttackerGoal)theEObject;
				T result = caseAttackerGoal(attackerGoal);
				if (result == null) result = caseBaseElement(attackerGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.SECURITY_RISK: {
				SecurityRisk securityRisk = (SecurityRisk)theEObject;
				T result = caseSecurityRisk(securityRisk);
				if (result == null) result = caseBaseElement(securityRisk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.ATTACK: {
				Attack attack = (Attack)theEObject;
				T result = caseAttack(attack);
				if (result == null) result = caseBaseElement(attack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.PAYLOAD: {
				Payload payload = (Payload)theEObject;
				T result = casePayload(payload);
				if (result == null) result = caseAttack(payload);
				if (result == null) result = caseBaseElement(payload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseAttack(action);
				if (result == null) result = caseBaseElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.THREAT_AGENT: {
				ThreatAgent threatAgent = (ThreatAgent)theEObject;
				T result = caseThreatAgent(threatAgent);
				if (result == null) result = caseBaseElement(threatAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.HUMAN: {
				Human human = (Human)theEObject;
				T result = caseHuman(human);
				if (result == null) result = caseThreatAgent(human);
				if (result == null) result = caseBaseElement(human);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dependability_Package.NON_HUMAN: {
				NonHuman nonHuman = (NonHuman)theEObject;
				T result = caseNonHuman(nonHuman);
				if (result == null) result = caseThreatAgent(nonHuman);
				if (result == null) result = caseBaseElement(nonHuman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintenance Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintenance Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintenanceProcedure(MaintenanceProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureType(MeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Tolerance Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Tolerance Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultToleranceMeasure(FaultToleranceMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependability Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependability Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependabilityPackage(DependabilityPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HARA Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HARA Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHARAPackage(HARAPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazard(Hazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Type System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Type System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardTypeSystem(HazardTypeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardType(HazardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Malfunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Malfunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMalfunction(Malfunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskAssessment(RiskAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskParameter(RiskParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSituation(Situation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccident(Accident object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorMeasure(OperatorMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementPackage(RequirementPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementSource(RequirementSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalContract(LegalContract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependability Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependability Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependabilityRequirement(DependabilityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyRequirement(SafetyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRequirement(SecurityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainPackage(DomainPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandard(Standard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assurance Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assurance Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssuranceLevel(AssuranceLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyStandard(SafetyStandard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TARA Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TARA Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTARAPackage(TARAPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityControl(SecurityControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityCapability(SecurityCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerability(Vulnerability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerableItem(VulnerableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attacker Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacker Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackerGoal(AttackerGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRisk(SecurityRisk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttack(Attack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayload(Payload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreatAgent(ThreatAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHuman(Human object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Human</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Human</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonHuman(NonHuman object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseElement(BaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ODE Product Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ODE Product Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODEProductPackage(ODEProductPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Dependability_Switch
