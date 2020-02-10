/**
 */
package top.dependability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see top.dependability.Dependability_Package
 * @generated
 */
public interface Dependability_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dependability_Factory eINSTANCE = top.dependability.impl.Dependability_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Maintenance Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintenance Procedure</em>'.
	 * @generated
	 */
	MaintenanceProcedure createMaintenanceProcedure();

	/**
	 * Returns a new object of class '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Type</em>'.
	 * @generated
	 */
	MeasureType createMeasureType();

	/**
	 * Returns a new object of class '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure</em>'.
	 * @generated
	 */
	Measure createMeasure();

	/**
	 * Returns a new object of class '<em>Fault Tolerance Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Tolerance Measure</em>'.
	 * @generated
	 */
	FaultToleranceMeasure createFaultToleranceMeasure();

	/**
	 * Returns a new object of class '<em>Dependability Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependability Package</em>'.
	 * @generated
	 */
	DependabilityPackage createDependabilityPackage();

	/**
	 * Returns a new object of class '<em>HARA Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HARA Package</em>'.
	 * @generated
	 */
	HARAPackage createHARAPackage();

	/**
	 * Returns a new object of class '<em>Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard</em>'.
	 * @generated
	 */
	Hazard createHazard();

	/**
	 * Returns a new object of class '<em>Hazard Type System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Type System</em>'.
	 * @generated
	 */
	HazardTypeSystem createHazardTypeSystem();

	/**
	 * Returns a new object of class '<em>Hazard Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Type</em>'.
	 * @generated
	 */
	HazardType createHazardType();

	/**
	 * Returns a new object of class '<em>Malfunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Malfunction</em>'.
	 * @generated
	 */
	Malfunction createMalfunction();

	/**
	 * Returns a new object of class '<em>Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Assessment</em>'.
	 * @generated
	 */
	RiskAssessment createRiskAssessment();

	/**
	 * Returns a new object of class '<em>Risk Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Parameter</em>'.
	 * @generated
	 */
	RiskParameter createRiskParameter();

	/**
	 * Returns a new object of class '<em>Situation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Situation</em>'.
	 * @generated
	 */
	Situation createSituation();

	/**
	 * Returns a new object of class '<em>Accident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accident</em>'.
	 * @generated
	 */
	Accident createAccident();

	/**
	 * Returns a new object of class '<em>Operator Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Measure</em>'.
	 * @generated
	 */
	OperatorMeasure createOperatorMeasure();

	/**
	 * Returns a new object of class '<em>Requirement Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Package</em>'.
	 * @generated
	 */
	RequirementPackage createRequirementPackage();

	/**
	 * Returns a new object of class '<em>Legal Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Contract</em>'.
	 * @generated
	 */
	LegalContract createLegalContract();

	/**
	 * Returns a new object of class '<em>Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Requirement</em>'.
	 * @generated
	 */
	SafetyRequirement createSafetyRequirement();

	/**
	 * Returns a new object of class '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Requirement</em>'.
	 * @generated
	 */
	SecurityRequirement createSecurityRequirement();

	/**
	 * Returns a new object of class '<em>Domain Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Package</em>'.
	 * @generated
	 */
	DomainPackage createDomainPackage();

	/**
	 * Returns a new object of class '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard</em>'.
	 * @generated
	 */
	Standard createStandard();

	/**
	 * Returns a new object of class '<em>Assurance Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assurance Level</em>'.
	 * @generated
	 */
	AssuranceLevel createAssuranceLevel();

	/**
	 * Returns a new object of class '<em>Safety Standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Standard</em>'.
	 * @generated
	 */
	SafetyStandard createSafetyStandard();

	/**
	 * Returns a new object of class '<em>TARA Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TARA Package</em>'.
	 * @generated
	 */
	TARAPackage createTARAPackage();

	/**
	 * Returns a new object of class '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset</em>'.
	 * @generated
	 */
	Asset createAsset();

	/**
	 * Returns a new object of class '<em>Security Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Control</em>'.
	 * @generated
	 */
	SecurityControl createSecurityControl();

	/**
	 * Returns a new object of class '<em>Security Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Capability</em>'.
	 * @generated
	 */
	SecurityCapability createSecurityCapability();

	/**
	 * Returns a new object of class '<em>Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vulnerability</em>'.
	 * @generated
	 */
	Vulnerability createVulnerability();

	/**
	 * Returns a new object of class '<em>Vulnerable Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vulnerable Item</em>'.
	 * @generated
	 */
	VulnerableItem createVulnerableItem();

	/**
	 * Returns a new object of class '<em>Attacker Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attacker Goal</em>'.
	 * @generated
	 */
	AttackerGoal createAttackerGoal();

	/**
	 * Returns a new object of class '<em>Security Risk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Risk</em>'.
	 * @generated
	 */
	SecurityRisk createSecurityRisk();

	/**
	 * Returns a new object of class '<em>Attack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack</em>'.
	 * @generated
	 */
	Attack createAttack();

	/**
	 * Returns a new object of class '<em>Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payload</em>'.
	 * @generated
	 */
	Payload createPayload();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Threat Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threat Agent</em>'.
	 * @generated
	 */
	ThreatAgent createThreatAgent();

	/**
	 * Returns a new object of class '<em>Human</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human</em>'.
	 * @generated
	 */
	Human createHuman();

	/**
	 * Returns a new object of class '<em>Non Human</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Human</em>'.
	 * @generated
	 */
	NonHuman createNonHuman();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Dependability_Package getDependability_Package();

} //Dependability_Factory
