/**
 */
package dependability;

import integration.Integration_Package;

import odeBase.OdeBasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dependability.Dependability_Factory
 * @model kind="package"
 * @generated
 */
public interface Dependability_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dependability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.deis-project.eu/ode/dependability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dependability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dependability_Package eINSTANCE = dependability.impl.Dependability_PackageImpl.init();

	/**
	 * The meta object id for the '{@link dependability.impl.MaintenanceProcedureImpl <em>Maintenance Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.MaintenanceProcedureImpl
	 * @see dependability.impl.Dependability_PackageImpl#getMaintenanceProcedure()
	 * @generated
	 */
	int MAINTENANCE_PROCEDURE = 0;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activity Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__ACTIVITY_DESCRIPTION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technical Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__TECHNICAL_DESCRIPTION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tool Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__TOOL_SPECIFICATION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Staff Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__STAFF_NUMBER = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Staff Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__STAFF_SKILL_LEVEL = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Staff Training Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE__STAFF_TRAINING_DESCRIPTION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Maintenance Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Maintenance Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_PROCEDURE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.MeasureTypeImpl
	 * @see dependability.impl.Dependability_PackageImpl#getMeasureType()
	 * @generated
	 */
	int MEASURE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_TYPE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.MeasureImpl
	 * @see dependability.impl.Dependability_PackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 2;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Intrinsic Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__INTRINSIC_SAFETY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Safe Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SAFE_GUARD = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applier Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__APPLIER_INFORMATION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Risk Acceptability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__RISK_ACCEPTABILITY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Further Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__FURTHER_ACTION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SOURCE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Measure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASURE_TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ASSURANCE_LEVEL = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.FaultToleranceMeasureImpl <em>Fault Tolerance Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.FaultToleranceMeasureImpl
	 * @see dependability.impl.Dependability_PackageImpl#getFaultToleranceMeasure()
	 * @generated
	 */
	int FAULT_TOLERANCE_MEASURE = 3;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__KEY_VALUE_MAPS = MEASURE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__ID = MEASURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Intrinsic Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__INTRINSIC_SAFETY = MEASURE__INTRINSIC_SAFETY;

	/**
	 * The feature id for the '<em><b>Safe Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__SAFE_GUARD = MEASURE__SAFE_GUARD;

	/**
	 * The feature id for the '<em><b>Applier Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__APPLIER_INFORMATION = MEASURE__APPLIER_INFORMATION;

	/**
	 * The feature id for the '<em><b>Risk Acceptability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__RISK_ACCEPTABILITY = MEASURE__RISK_ACCEPTABILITY;

	/**
	 * The feature id for the '<em><b>Further Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__FURTHER_ACTION = MEASURE__FURTHER_ACTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__SOURCE = MEASURE__SOURCE;

	/**
	 * The feature id for the '<em><b>Measure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__MEASURE_TYPE = MEASURE__MEASURE_TYPE;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE__ASSURANCE_LEVEL = MEASURE__ASSURANCE_LEVEL;

	/**
	 * The number of structural features of the '<em>Fault Tolerance Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fault Tolerance Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TOLERANCE_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.DependabilityPackageImpl <em>Dependability Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.DependabilityPackageImpl
	 * @see dependability.impl.Dependability_PackageImpl#getDependabilityPackage()
	 * @generated
	 */
	int DEPENDABILITY_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__KEY_VALUE_MAPS = Integration_Package.ODE_PRODUCT_PACKAGE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__ID = Integration_Package.ODE_PRODUCT_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__NAME = Integration_Package.ODE_PRODUCT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__DESCRIPTION = Integration_Package.ODE_PRODUCT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__MEASURES = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measure Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__MEASURE_TYPES = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maintenance Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>HARA Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__HARA_PACKAGES = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>TARA Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE__TARA_PACKAGES = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dependability Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE_FEATURE_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dependability Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_PACKAGE_OPERATION_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.HARAPackageImpl <em>HARA Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.HARAPackageImpl
	 * @see dependability.impl.Dependability_PackageImpl#getHARAPackage()
	 * @generated
	 */
	int HARA_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__KEY_VALUE_MAPS = Integration_Package.ODE_PRODUCT_PACKAGE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__ID = Integration_Package.ODE_PRODUCT_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__NAME = Integration_Package.ODE_PRODUCT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__DESCRIPTION = Integration_Package.ODE_PRODUCT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__HAZARDS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hazard Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__HAZARD_TYPES = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hazard Type Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__HAZARD_TYPE_SYSTEMS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Malfunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__MALFUNCTIONS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Risk Assessments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__RISK_ASSESSMENTS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Risk Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE__RISK_PARAMETERS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>HARA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE_FEATURE_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>HARA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARA_PACKAGE_OPERATION_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.HazardImpl <em>Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.HazardImpl
	 * @see dependability.impl.Dependability_PackageImpl#getHazard()
	 * @generated
	 */
	int HAZARD = 6;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__CONDITION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__FAILURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__MEASURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hazard Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__HAZARD_TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.HazardTypeSystemImpl <em>Hazard Type System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.HazardTypeSystemImpl
	 * @see dependability.impl.Dependability_PackageImpl#getHazardTypeSystem()
	 * @generated
	 */
	int HAZARD_TYPE_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE_SYSTEM__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE_SYSTEM__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE_SYSTEM__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE_SYSTEM__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Hazard Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE_SYSTEM__HAZARD_TYPES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hazard Type System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE_SYSTEM_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hazard Type System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE_SYSTEM_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.HazardTypeImpl <em>Hazard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.HazardTypeImpl
	 * @see dependability.impl.Dependability_PackageImpl#getHazardType()
	 * @generated
	 */
	int HAZARD_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Hazard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hazard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_TYPE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.MalfunctionImpl <em>Malfunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.MalfunctionImpl
	 * @see dependability.impl.Dependability_PackageImpl#getMalfunction()
	 * @generated
	 */
	int MALFUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTION__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTION__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTION__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTION__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTION__HAZARDS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Malfunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTION_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Malfunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MALFUNCTION_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.RiskAssessmentImpl <em>Risk Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.RiskAssessmentImpl
	 * @see dependability.impl.Dependability_PackageImpl#getRiskAssessment()
	 * @generated
	 */
	int RISK_ASSESSMENT = 10;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Related Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__RELATED_STANDARD = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risk Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__RISK_PARAMETERS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__HAZARD = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Risk Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Risk Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.RiskParameterImpl <em>Risk Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.RiskParameterImpl
	 * @see dependability.impl.Dependability_PackageImpl#getRiskParameter()
	 * @generated
	 */
	int RISK_PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETER__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETER__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETER__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETER__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETER__ARGUMENT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Risk Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETER_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Risk Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETER_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.SituationImpl <em>Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.SituationImpl
	 * @see dependability.impl.Dependability_PackageImpl#getSituation()
	 * @generated
	 */
	int SITUATION = 12;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__KEY_VALUE_MAPS = RISK_PARAMETER__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__ID = RISK_PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__NAME = RISK_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__DESCRIPTION = RISK_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__ARGUMENT = RISK_PARAMETER__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION__LIKELIHOOD = RISK_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_FEATURE_COUNT = RISK_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITUATION_OPERATION_COUNT = RISK_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.AccidentImpl <em>Accident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.AccidentImpl
	 * @see dependability.impl.Dependability_PackageImpl#getAccident()
	 * @generated
	 */
	int ACCIDENT = 13;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT__KEY_VALUE_MAPS = RISK_PARAMETER__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT__ID = RISK_PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT__NAME = RISK_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT__DESCRIPTION = RISK_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT__ARGUMENT = RISK_PARAMETER__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT__SEVERITY = RISK_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_FEATURE_COUNT = RISK_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Accident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENT_OPERATION_COUNT = RISK_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.OperatorMeasureImpl <em>Operator Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.OperatorMeasureImpl
	 * @see dependability.impl.Dependability_PackageImpl#getOperatorMeasure()
	 * @generated
	 */
	int OPERATOR_MEASURE = 14;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_MEASURE__KEY_VALUE_MAPS = RISK_PARAMETER__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_MEASURE__ID = RISK_PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_MEASURE__NAME = RISK_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_MEASURE__DESCRIPTION = RISK_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_MEASURE__ARGUMENT = RISK_PARAMETER__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Controlability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_MEASURE__CONTROLABILITY = RISK_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_MEASURE_FEATURE_COUNT = RISK_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operator Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_MEASURE_OPERATION_COUNT = RISK_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.RequirementPackageImpl <em>Requirement Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.RequirementPackageImpl
	 * @see dependability.impl.Dependability_PackageImpl#getRequirementPackage()
	 * @generated
	 */
	int REQUIREMENT_PACKAGE = 15;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__KEY_VALUE_MAPS = Integration_Package.ODE_PRODUCT_PACKAGE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__ID = Integration_Package.ODE_PRODUCT_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__NAME = Integration_Package.ODE_PRODUCT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__DESCRIPTION = Integration_Package.ODE_PRODUCT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requirement Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__REQUIREMENT_SOURCES = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependability Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__DEPENDABILITY_REQUIREMENTS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_FEATURE_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirement Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_OPERATION_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.RequirementSourceImpl <em>Requirement Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.RequirementSourceImpl
	 * @see dependability.impl.Dependability_PackageImpl#getRequirementSource()
	 * @generated
	 */
	int REQUIREMENT_SOURCE = 16;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SOURCE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SOURCE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SOURCE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SOURCE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Requirement Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SOURCE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SOURCE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.LegalContractImpl <em>Legal Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.LegalContractImpl
	 * @see dependability.impl.Dependability_PackageImpl#getLegalContract()
	 * @generated
	 */
	int LEGAL_CONTRACT = 17;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTRACT__KEY_VALUE_MAPS = REQUIREMENT_SOURCE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTRACT__ID = REQUIREMENT_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTRACT__NAME = REQUIREMENT_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTRACT__DESCRIPTION = REQUIREMENT_SOURCE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Legal Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTRACT_FEATURE_COUNT = REQUIREMENT_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Legal Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTRACT_OPERATION_COUNT = REQUIREMENT_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.DependabilityRequirementImpl <em>Dependability Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.DependabilityRequirementImpl
	 * @see dependability.impl.Dependability_PackageImpl#getDependabilityRequirement()
	 * @generated
	 */
	int DEPENDABILITY_REQUIREMENT = 18;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Decomposition Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refined Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirement Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__MEASURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__FAILURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Maintenance Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dependability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dependability Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_REQUIREMENT_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.SafetyRequirementImpl <em>Safety Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.SafetyRequirementImpl
	 * @see dependability.impl.Dependability_PackageImpl#getSafetyRequirement()
	 * @generated
	 */
	int SAFETY_REQUIREMENT = 19;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__KEY_VALUE_MAPS = DEPENDABILITY_REQUIREMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__ID = DEPENDABILITY_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__NAME = DEPENDABILITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__DESCRIPTION = DEPENDABILITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Decomposition Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__DECOMPOSITION_ARGUMENT = DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Refined Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__REFINED_REQUIREMENTS = DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Requirement Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__REQUIREMENT_SOURCE = DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__MEASURES = DEPENDABILITY_REQUIREMENT__MEASURES;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__FAILURES = DEPENDABILITY_REQUIREMENT__FAILURES;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__ASSURANCE_LEVEL = DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL;

	/**
	 * The feature id for the '<em><b>Maintenance Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__MAINTENANCE_PROCEDURES = DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES;

	/**
	 * The feature id for the '<em><b>Failure Reaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__FAILURE_REACTION_TIME = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Detection Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__FAILURE_DETECTION_TIME = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failure Latency Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__FAILURE_LATENCY_TIME = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Safety Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__IS_SAFETY_GOAL = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__HAZARDS = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT_FEATURE_COUNT = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT_OPERATION_COUNT = DEPENDABILITY_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.SecurityRequirementImpl
	 * @see dependability.impl.Dependability_PackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 20;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__KEY_VALUE_MAPS = DEPENDABILITY_REQUIREMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__ID = DEPENDABILITY_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__NAME = DEPENDABILITY_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__DESCRIPTION = DEPENDABILITY_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Decomposition Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__DECOMPOSITION_ARGUMENT = DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT;

	/**
	 * The feature id for the '<em><b>Refined Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__REFINED_REQUIREMENTS = DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Requirement Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__REQUIREMENT_SOURCE = DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__MEASURES = DEPENDABILITY_REQUIREMENT__MEASURES;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__FAILURES = DEPENDABILITY_REQUIREMENT__FAILURES;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__ASSURANCE_LEVEL = DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL;

	/**
	 * The feature id for the '<em><b>Maintenance Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__MAINTENANCE_PROCEDURES = DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES;

	/**
	 * The feature id for the '<em><b>Security Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__SECURITY_CAPABILITIES = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_FEATURE_COUNT = DEPENDABILITY_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_OPERATION_COUNT = DEPENDABILITY_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.DomainPackageImpl <em>Domain Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.DomainPackageImpl
	 * @see dependability.impl.Dependability_PackageImpl#getDomainPackage()
	 * @generated
	 */
	int DOMAIN_PACKAGE = 21;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE__KEY_VALUE_MAPS = Integration_Package.ODE_PRODUCT_PACKAGE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE__ID = Integration_Package.ODE_PRODUCT_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE__NAME = Integration_Package.ODE_PRODUCT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE__DESCRIPTION = Integration_Package.ODE_PRODUCT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Standards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE__STANDARDS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assurance Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE__ASSURANCE_LEVELS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE_FEATURE_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Domain Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PACKAGE_OPERATION_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.StandardImpl <em>Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.StandardImpl
	 * @see dependability.impl.Dependability_PackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 22;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.AssuranceLevelImpl <em>Assurance Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.AssuranceLevelImpl
	 * @see dependability.impl.Dependability_PackageImpl#getAssuranceLevel()
	 * @generated
	 */
	int ASSURANCE_LEVEL = 23;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_LEVEL__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_LEVEL__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_LEVEL__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_LEVEL__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Assurance Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_LEVEL_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assurance Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_LEVEL_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.SafetyStandardImpl <em>Safety Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.SafetyStandardImpl
	 * @see dependability.impl.Dependability_PackageImpl#getSafetyStandard()
	 * @generated
	 */
	int SAFETY_STANDARD = 24;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_STANDARD__KEY_VALUE_MAPS = STANDARD__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_STANDARD__ID = STANDARD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_STANDARD__NAME = STANDARD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_STANDARD__DESCRIPTION = STANDARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assurance Levels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_STANDARD__ASSURANCE_LEVELS = STANDARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Safety Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_STANDARD_FEATURE_COUNT = STANDARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Safety Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_STANDARD_OPERATION_COUNT = STANDARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.TARAPackageImpl <em>TARA Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.TARAPackageImpl
	 * @see dependability.impl.Dependability_PackageImpl#getTARAPackage()
	 * @generated
	 */
	int TARA_PACKAGE = 25;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE__KEY_VALUE_MAPS = Integration_Package.ODE_PRODUCT_PACKAGE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE__ID = Integration_Package.ODE_PRODUCT_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE__NAME = Integration_Package.ODE_PRODUCT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE__DESCRIPTION = Integration_Package.ODE_PRODUCT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Identified Risks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE__IDENTIFIED_RISKS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE__CONTROLS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Considered Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE__CONSIDERED_ASSETS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Considered Threat Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE__CONSIDERED_THREAT_AGENTS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TARA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE_FEATURE_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TARA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARA_PACKAGE_OPERATION_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.AssetImpl
	 * @see dependability.impl.Dependability_PackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 26;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Financial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__FINANCIAL_VALUE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Financial Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__FINANCIAL_COST_TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operational Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__OPERATIONAL_COST = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operational Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__OPERATIONAL_COST_TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.SecurityControlImpl <em>Security Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.SecurityControlImpl
	 * @see dependability.impl.Dependability_PackageImpl#getSecurityControl()
	 * @generated
	 */
	int SECURITY_CONTROL = 27;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__KEY_VALUE_MAPS = MEASURE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__ID = MEASURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Intrinsic Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__INTRINSIC_SAFETY = MEASURE__INTRINSIC_SAFETY;

	/**
	 * The feature id for the '<em><b>Safe Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__SAFE_GUARD = MEASURE__SAFE_GUARD;

	/**
	 * The feature id for the '<em><b>Applier Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__APPLIER_INFORMATION = MEASURE__APPLIER_INFORMATION;

	/**
	 * The feature id for the '<em><b>Risk Acceptability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__RISK_ACCEPTABILITY = MEASURE__RISK_ACCEPTABILITY;

	/**
	 * The feature id for the '<em><b>Further Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__FURTHER_ACTION = MEASURE__FURTHER_ACTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__SOURCE = MEASURE__SOURCE;

	/**
	 * The feature id for the '<em><b>Measure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__MEASURE_TYPE = MEASURE__MEASURE_TYPE;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__ASSURANCE_LEVEL = MEASURE__ASSURANCE_LEVEL;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__CATEGORY = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__TYPE = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vulnerabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__VULNERABILITIES = MEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Security Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Security Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.SecurityCapabilityImpl <em>Security Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.SecurityCapabilityImpl
	 * @see dependability.impl.Dependability_PackageImpl#getSecurityCapability()
	 * @generated
	 */
	int SECURITY_CAPABILITY = 28;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__CATEGORY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__IMPLEMENTED_BY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Security Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Security Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.VulnerabilityImpl
	 * @see dependability.impl.Dependability_PackageImpl#getVulnerability()
	 * @generated
	 */
	int VULNERABILITY = 29;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__CATEGORY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.VulnerableItemImpl <em>Vulnerable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.VulnerableItemImpl
	 * @see dependability.impl.Dependability_PackageImpl#getVulnerableItem()
	 * @generated
	 */
	int VULNERABLE_ITEM = 30;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM__KEY_VALUE_MAPS = ASSET__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM__ID = ASSET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Financial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM__FINANCIAL_VALUE = ASSET__FINANCIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Financial Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM__FINANCIAL_COST_TYPE = ASSET__FINANCIAL_COST_TYPE;

	/**
	 * The feature id for the '<em><b>Operational Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM__OPERATIONAL_COST = ASSET__OPERATIONAL_COST;

	/**
	 * The feature id for the '<em><b>Operational Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM__OPERATIONAL_COST_TYPE = ASSET__OPERATIONAL_COST_TYPE;

	/**
	 * The feature id for the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM__VULNERABILITIES = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vulnerable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vulnerable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABLE_ITEM_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.AttackerGoalImpl <em>Attacker Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.AttackerGoalImpl
	 * @see dependability.impl.Dependability_PackageImpl#getAttackerGoal()
	 * @generated
	 */
	int ATTACKER_GOAL = 31;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL__CATEGORY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Addressed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL__ADDRESSED_BY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL__ATTACKS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attacked Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL__ATTACKED_ITEMS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attacker Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attacker Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_GOAL_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.SecurityRiskImpl <em>Security Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.SecurityRiskImpl
	 * @see dependability.impl.Dependability_PackageImpl#getSecurityRisk()
	 * @generated
	 */
	int SECURITY_RISK = 32;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK__LIKELIHOOD = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Impact Asset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK__IMPACT_ASSET = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Impact Individuals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK__IMPACT_INDIVIDUALS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Impact Business</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK__IMPACT_BUSINESS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attacker Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK__ATTACKER_GOALS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Security Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Security Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RISK_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.AttackImpl <em>Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.AttackImpl
	 * @see dependability.impl.Dependability_PackageImpl#getAttack()
	 * @generated
	 */
	int ATTACK = 33;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__CATEGORY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Financial Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__FINANCIAL_COST = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Financial Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__FINANCIAL_COST_TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__TIME_REQUIRED = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__TIME_UNIT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__DIFFICULTY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__DETECTABILITY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Violations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__VIOLATIONS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exploited Vulnerabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__EXPLOITED_VULNERABILITIES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.PayloadImpl <em>Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.PayloadImpl
	 * @see dependability.impl.Dependability_PackageImpl#getPayload()
	 * @generated
	 */
	int PAYLOAD = 34;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__KEY_VALUE_MAPS = ATTACK__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__ID = ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__NAME = ATTACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__DESCRIPTION = ATTACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__CATEGORY = ATTACK__CATEGORY;

	/**
	 * The feature id for the '<em><b>Financial Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__FINANCIAL_COST = ATTACK__FINANCIAL_COST;

	/**
	 * The feature id for the '<em><b>Financial Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__FINANCIAL_COST_TYPE = ATTACK__FINANCIAL_COST_TYPE;

	/**
	 * The feature id for the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__TIME_REQUIRED = ATTACK__TIME_REQUIRED;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__TIME_UNIT = ATTACK__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__DIFFICULTY = ATTACK__DIFFICULTY;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__DETECTABILITY = ATTACK__DETECTABILITY;

	/**
	 * The feature id for the '<em><b>Violations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__VIOLATIONS = ATTACK__VIOLATIONS;

	/**
	 * The feature id for the '<em><b>Exploited Vulnerabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__EXPLOITED_VULNERABILITIES = ATTACK__EXPLOITED_VULNERABILITIES;

	/**
	 * The number of structural features of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_FEATURE_COUNT = ATTACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_OPERATION_COUNT = ATTACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.ActionImpl
	 * @see dependability.impl.Dependability_PackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 35;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__KEY_VALUE_MAPS = ATTACK__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = ATTACK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ATTACK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = ATTACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CATEGORY = ATTACK__CATEGORY;

	/**
	 * The feature id for the '<em><b>Financial Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FINANCIAL_COST = ATTACK__FINANCIAL_COST;

	/**
	 * The feature id for the '<em><b>Financial Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FINANCIAL_COST_TYPE = ATTACK__FINANCIAL_COST_TYPE;

	/**
	 * The feature id for the '<em><b>Time Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TIME_REQUIRED = ATTACK__TIME_REQUIRED;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TIME_UNIT = ATTACK__TIME_UNIT;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DIFFICULTY = ATTACK__DIFFICULTY;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DETECTABILITY = ATTACK__DETECTABILITY;

	/**
	 * The feature id for the '<em><b>Violations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VIOLATIONS = ATTACK__VIOLATIONS;

	/**
	 * The feature id for the '<em><b>Exploited Vulnerabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EXPLOITED_VULNERABILITIES = ATTACK__EXPLOITED_VULNERABILITIES;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ATTACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ATTACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.ThreatAgentImpl <em>Threat Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.ThreatAgentImpl
	 * @see dependability.impl.Dependability_PackageImpl#getThreatAgent()
	 * @generated
	 */
	int THREAT_AGENT = 36;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT__SKILL_LEVEL = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Motivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT__MOTIVATION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anonymity Desire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT__ANONYMITY_DESIRE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attacker Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT__ATTACKER_GOALS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Threat Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Threat Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_AGENT_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.HumanImpl <em>Human</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.HumanImpl
	 * @see dependability.impl.Dependability_PackageImpl#getHuman()
	 * @generated
	 */
	int HUMAN = 37;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__KEY_VALUE_MAPS = THREAT_AGENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__ID = THREAT_AGENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__NAME = THREAT_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__DESCRIPTION = THREAT_AGENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__SKILL_LEVEL = THREAT_AGENT__SKILL_LEVEL;

	/**
	 * The feature id for the '<em><b>Motivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__MOTIVATION = THREAT_AGENT__MOTIVATION;

	/**
	 * The feature id for the '<em><b>Anonymity Desire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__ANONYMITY_DESIRE = THREAT_AGENT__ANONYMITY_DESIRE;

	/**
	 * The feature id for the '<em><b>Attacker Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__ATTACKER_GOALS = THREAT_AGENT__ATTACKER_GOALS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN__ACTIONS = THREAT_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_FEATURE_COUNT = THREAT_AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_OPERATION_COUNT = THREAT_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.impl.NonHumanImpl <em>Non Human</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.impl.NonHumanImpl
	 * @see dependability.impl.Dependability_PackageImpl#getNonHuman()
	 * @generated
	 */
	int NON_HUMAN = 38;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN__KEY_VALUE_MAPS = THREAT_AGENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN__ID = THREAT_AGENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN__NAME = THREAT_AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN__DESCRIPTION = THREAT_AGENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN__SKILL_LEVEL = THREAT_AGENT__SKILL_LEVEL;

	/**
	 * The feature id for the '<em><b>Motivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN__MOTIVATION = THREAT_AGENT__MOTIVATION;

	/**
	 * The feature id for the '<em><b>Anonymity Desire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN__ANONYMITY_DESIRE = THREAT_AGENT__ANONYMITY_DESIRE;

	/**
	 * The feature id for the '<em><b>Attacker Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN__ATTACKER_GOALS = THREAT_AGENT__ATTACKER_GOALS;

	/**
	 * The feature id for the '<em><b>Payloads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN__PAYLOADS = THREAT_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN_FEATURE_COUNT = THREAT_AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Human</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_HUMAN_OPERATION_COUNT = THREAT_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dependability.SecurityApplicationType <em>Security Application Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.SecurityApplicationType
	 * @see dependability.impl.Dependability_PackageImpl#getSecurityApplicationType()
	 * @generated
	 */
	int SECURITY_APPLICATION_TYPE = 39;

	/**
	 * The meta object id for the '{@link dependability.FinancialCostType <em>Financial Cost Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.FinancialCostType
	 * @see dependability.impl.Dependability_PackageImpl#getFinancialCostType()
	 * @generated
	 */
	int FINANCIAL_COST_TYPE = 40;

	/**
	 * The meta object id for the '{@link dependability.OperationalCostType <em>Operational Cost Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependability.OperationalCostType
	 * @see dependability.impl.Dependability_PackageImpl#getOperationalCostType()
	 * @generated
	 */
	int OPERATIONAL_COST_TYPE = 41;


	/**
	 * Returns the meta object for class '{@link dependability.MaintenanceProcedure <em>Maintenance Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance Procedure</em>'.
	 * @see dependability.MaintenanceProcedure
	 * @generated
	 */
	EClass getMaintenanceProcedure();

	/**
	 * Returns the meta object for the attribute '{@link dependability.MaintenanceProcedure#getActivityDescription <em>Activity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Description</em>'.
	 * @see dependability.MaintenanceProcedure#getActivityDescription()
	 * @see #getMaintenanceProcedure()
	 * @generated
	 */
	EAttribute getMaintenanceProcedure_ActivityDescription();

	/**
	 * Returns the meta object for the attribute '{@link dependability.MaintenanceProcedure#getTechnicalDescription <em>Technical Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Description</em>'.
	 * @see dependability.MaintenanceProcedure#getTechnicalDescription()
	 * @see #getMaintenanceProcedure()
	 * @generated
	 */
	EAttribute getMaintenanceProcedure_TechnicalDescription();

	/**
	 * Returns the meta object for the attribute '{@link dependability.MaintenanceProcedure#getToolSpecification <em>Tool Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Specification</em>'.
	 * @see dependability.MaintenanceProcedure#getToolSpecification()
	 * @see #getMaintenanceProcedure()
	 * @generated
	 */
	EAttribute getMaintenanceProcedure_ToolSpecification();

	/**
	 * Returns the meta object for the attribute '{@link dependability.MaintenanceProcedure#getStaffNumber <em>Staff Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff Number</em>'.
	 * @see dependability.MaintenanceProcedure#getStaffNumber()
	 * @see #getMaintenanceProcedure()
	 * @generated
	 */
	EAttribute getMaintenanceProcedure_StaffNumber();

	/**
	 * Returns the meta object for the attribute '{@link dependability.MaintenanceProcedure#getStaffSkillLevel <em>Staff Skill Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff Skill Level</em>'.
	 * @see dependability.MaintenanceProcedure#getStaffSkillLevel()
	 * @see #getMaintenanceProcedure()
	 * @generated
	 */
	EAttribute getMaintenanceProcedure_StaffSkillLevel();

	/**
	 * Returns the meta object for the attribute '{@link dependability.MaintenanceProcedure#getStaffTrainingDescription <em>Staff Training Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff Training Description</em>'.
	 * @see dependability.MaintenanceProcedure#getStaffTrainingDescription()
	 * @see #getMaintenanceProcedure()
	 * @generated
	 */
	EAttribute getMaintenanceProcedure_StaffTrainingDescription();

	/**
	 * Returns the meta object for class '{@link dependability.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Type</em>'.
	 * @see dependability.MeasureType
	 * @generated
	 */
	EClass getMeasureType();

	/**
	 * Returns the meta object for class '{@link dependability.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see dependability.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Measure#getIntrinsicSafety <em>Intrinsic Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intrinsic Safety</em>'.
	 * @see dependability.Measure#getIntrinsicSafety()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_IntrinsicSafety();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Measure#getSafeGuard <em>Safe Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe Guard</em>'.
	 * @see dependability.Measure#getSafeGuard()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_SafeGuard();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Measure#getApplierInformation <em>Applier Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applier Information</em>'.
	 * @see dependability.Measure#getApplierInformation()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_ApplierInformation();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Measure#isRiskAcceptability <em>Risk Acceptability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Acceptability</em>'.
	 * @see dependability.Measure#isRiskAcceptability()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_RiskAcceptability();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Measure#getFurtherAction <em>Further Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Further Action</em>'.
	 * @see dependability.Measure#getFurtherAction()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_FurtherAction();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Measure#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see dependability.Measure#getSource()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Source();

	/**
	 * Returns the meta object for the reference '{@link dependability.Measure#getMeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure Type</em>'.
	 * @see dependability.Measure#getMeasureType()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_MeasureType();

	/**
	 * Returns the meta object for the reference '{@link dependability.Measure#getAssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assurance Level</em>'.
	 * @see dependability.Measure#getAssuranceLevel()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_AssuranceLevel();

	/**
	 * Returns the meta object for class '{@link dependability.FaultToleranceMeasure <em>Fault Tolerance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Tolerance Measure</em>'.
	 * @see dependability.FaultToleranceMeasure
	 * @generated
	 */
	EClass getFaultToleranceMeasure();

	/**
	 * Returns the meta object for class '{@link dependability.DependabilityPackage <em>Dependability Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependability Package</em>'.
	 * @see dependability.DependabilityPackage
	 * @generated
	 */
	EClass getDependabilityPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.DependabilityPackage#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see dependability.DependabilityPackage#getMeasures()
	 * @see #getDependabilityPackage()
	 * @generated
	 */
	EReference getDependabilityPackage_Measures();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.DependabilityPackage#getMeasureTypes <em>Measure Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Types</em>'.
	 * @see dependability.DependabilityPackage#getMeasureTypes()
	 * @see #getDependabilityPackage()
	 * @generated
	 */
	EReference getDependabilityPackage_MeasureTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.DependabilityPackage#getMaintenanceProcedures <em>Maintenance Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maintenance Procedures</em>'.
	 * @see dependability.DependabilityPackage#getMaintenanceProcedures()
	 * @see #getDependabilityPackage()
	 * @generated
	 */
	EReference getDependabilityPackage_MaintenanceProcedures();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.DependabilityPackage#getHARAPackages <em>HARA Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>HARA Packages</em>'.
	 * @see dependability.DependabilityPackage#getHARAPackages()
	 * @see #getDependabilityPackage()
	 * @generated
	 */
	EReference getDependabilityPackage_HARAPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.DependabilityPackage#getRequirementPackages <em>Requirement Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Packages</em>'.
	 * @see dependability.DependabilityPackage#getRequirementPackages()
	 * @see #getDependabilityPackage()
	 * @generated
	 */
	EReference getDependabilityPackage_RequirementPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.DependabilityPackage#getDomainPackages <em>Domain Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Packages</em>'.
	 * @see dependability.DependabilityPackage#getDomainPackages()
	 * @see #getDependabilityPackage()
	 * @generated
	 */
	EReference getDependabilityPackage_DomainPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.DependabilityPackage#getTARAPackages <em>TARA Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TARA Packages</em>'.
	 * @see dependability.DependabilityPackage#getTARAPackages()
	 * @see #getDependabilityPackage()
	 * @generated
	 */
	EReference getDependabilityPackage_TARAPackages();

	/**
	 * Returns the meta object for class '{@link dependability.HARAPackage <em>HARA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HARA Package</em>'.
	 * @see dependability.HARAPackage
	 * @generated
	 */
	EClass getHARAPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.HARAPackage#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazards</em>'.
	 * @see dependability.HARAPackage#getHazards()
	 * @see #getHARAPackage()
	 * @generated
	 */
	EReference getHARAPackage_Hazards();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.HARAPackage#getHazardTypes <em>Hazard Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard Types</em>'.
	 * @see dependability.HARAPackage#getHazardTypes()
	 * @see #getHARAPackage()
	 * @generated
	 */
	EReference getHARAPackage_HazardTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.HARAPackage#getHazardTypeSystems <em>Hazard Type Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard Type Systems</em>'.
	 * @see dependability.HARAPackage#getHazardTypeSystems()
	 * @see #getHARAPackage()
	 * @generated
	 */
	EReference getHARAPackage_HazardTypeSystems();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.HARAPackage#getMalfunctions <em>Malfunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Malfunctions</em>'.
	 * @see dependability.HARAPackage#getMalfunctions()
	 * @see #getHARAPackage()
	 * @generated
	 */
	EReference getHARAPackage_Malfunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.HARAPackage#getRiskAssessments <em>Risk Assessments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risk Assessments</em>'.
	 * @see dependability.HARAPackage#getRiskAssessments()
	 * @see #getHARAPackage()
	 * @generated
	 */
	EReference getHARAPackage_RiskAssessments();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.HARAPackage#getRiskParameters <em>Risk Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risk Parameters</em>'.
	 * @see dependability.HARAPackage#getRiskParameters()
	 * @see #getHARAPackage()
	 * @generated
	 */
	EReference getHARAPackage_RiskParameters();

	/**
	 * Returns the meta object for class '{@link dependability.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard</em>'.
	 * @see dependability.Hazard
	 * @generated
	 */
	EClass getHazard();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Hazard#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see dependability.Hazard#getCondition()
	 * @see #getHazard()
	 * @generated
	 */
	EAttribute getHazard_Condition();

	/**
	 * Returns the meta object for the reference list '{@link dependability.Hazard#getFailures <em>Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failures</em>'.
	 * @see dependability.Hazard#getFailures()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_Failures();

	/**
	 * Returns the meta object for the reference list '{@link dependability.Hazard#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measures</em>'.
	 * @see dependability.Hazard#getMeasures()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_Measures();

	/**
	 * Returns the meta object for the reference '{@link dependability.Hazard#getHazardType <em>Hazard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hazard Type</em>'.
	 * @see dependability.Hazard#getHazardType()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_HazardType();

	/**
	 * Returns the meta object for class '{@link dependability.HazardTypeSystem <em>Hazard Type System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Type System</em>'.
	 * @see dependability.HazardTypeSystem
	 * @generated
	 */
	EClass getHazardTypeSystem();

	/**
	 * Returns the meta object for the reference list '{@link dependability.HazardTypeSystem#getHazardTypes <em>Hazard Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazard Types</em>'.
	 * @see dependability.HazardTypeSystem#getHazardTypes()
	 * @see #getHazardTypeSystem()
	 * @generated
	 */
	EReference getHazardTypeSystem_HazardTypes();

	/**
	 * Returns the meta object for class '{@link dependability.HazardType <em>Hazard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Type</em>'.
	 * @see dependability.HazardType
	 * @generated
	 */
	EClass getHazardType();

	/**
	 * Returns the meta object for class '{@link dependability.Malfunction <em>Malfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Malfunction</em>'.
	 * @see dependability.Malfunction
	 * @generated
	 */
	EClass getMalfunction();

	/**
	 * Returns the meta object for the reference list '{@link dependability.Malfunction#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazards</em>'.
	 * @see dependability.Malfunction#getHazards()
	 * @see #getMalfunction()
	 * @generated
	 */
	EReference getMalfunction_Hazards();

	/**
	 * Returns the meta object for class '{@link dependability.RiskAssessment <em>Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Assessment</em>'.
	 * @see dependability.RiskAssessment
	 * @generated
	 */
	EClass getRiskAssessment();

	/**
	 * Returns the meta object for the attribute '{@link dependability.RiskAssessment#getRelatedStandard <em>Related Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Related Standard</em>'.
	 * @see dependability.RiskAssessment#getRelatedStandard()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_RelatedStandard();

	/**
	 * Returns the meta object for the reference list '{@link dependability.RiskAssessment#getRiskParameters <em>Risk Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Risk Parameters</em>'.
	 * @see dependability.RiskAssessment#getRiskParameters()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EReference getRiskAssessment_RiskParameters();

	/**
	 * Returns the meta object for the reference '{@link dependability.RiskAssessment#getHazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hazard</em>'.
	 * @see dependability.RiskAssessment#getHazard()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EReference getRiskAssessment_Hazard();

	/**
	 * Returns the meta object for class '{@link dependability.RiskParameter <em>Risk Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Parameter</em>'.
	 * @see dependability.RiskParameter
	 * @generated
	 */
	EClass getRiskParameter();

	/**
	 * Returns the meta object for the attribute '{@link dependability.RiskParameter#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument</em>'.
	 * @see dependability.RiskParameter#getArgument()
	 * @see #getRiskParameter()
	 * @generated
	 */
	EAttribute getRiskParameter_Argument();

	/**
	 * Returns the meta object for class '{@link dependability.Situation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Situation</em>'.
	 * @see dependability.Situation
	 * @generated
	 */
	EClass getSituation();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Situation#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likelihood</em>'.
	 * @see dependability.Situation#getLikelihood()
	 * @see #getSituation()
	 * @generated
	 */
	EAttribute getSituation_Likelihood();

	/**
	 * Returns the meta object for class '{@link dependability.Accident <em>Accident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accident</em>'.
	 * @see dependability.Accident
	 * @generated
	 */
	EClass getAccident();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Accident#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see dependability.Accident#getSeverity()
	 * @see #getAccident()
	 * @generated
	 */
	EAttribute getAccident_Severity();

	/**
	 * Returns the meta object for class '{@link dependability.OperatorMeasure <em>Operator Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Measure</em>'.
	 * @see dependability.OperatorMeasure
	 * @generated
	 */
	EClass getOperatorMeasure();

	/**
	 * Returns the meta object for the attribute '{@link dependability.OperatorMeasure#getControlability <em>Controlability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controlability</em>'.
	 * @see dependability.OperatorMeasure#getControlability()
	 * @see #getOperatorMeasure()
	 * @generated
	 */
	EAttribute getOperatorMeasure_Controlability();

	/**
	 * Returns the meta object for class '{@link dependability.RequirementPackage <em>Requirement Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Package</em>'.
	 * @see dependability.RequirementPackage
	 * @generated
	 */
	EClass getRequirementPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.RequirementPackage#getRequirementSources <em>Requirement Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Sources</em>'.
	 * @see dependability.RequirementPackage#getRequirementSources()
	 * @see #getRequirementPackage()
	 * @generated
	 */
	EReference getRequirementPackage_RequirementSources();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.RequirementPackage#getDependabilityRequirements <em>Dependability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependability Requirements</em>'.
	 * @see dependability.RequirementPackage#getDependabilityRequirements()
	 * @see #getRequirementPackage()
	 * @generated
	 */
	EReference getRequirementPackage_DependabilityRequirements();

	/**
	 * Returns the meta object for class '{@link dependability.RequirementSource <em>Requirement Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Source</em>'.
	 * @see dependability.RequirementSource
	 * @generated
	 */
	EClass getRequirementSource();

	/**
	 * Returns the meta object for class '{@link dependability.LegalContract <em>Legal Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Contract</em>'.
	 * @see dependability.LegalContract
	 * @generated
	 */
	EClass getLegalContract();

	/**
	 * Returns the meta object for class '{@link dependability.DependabilityRequirement <em>Dependability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependability Requirement</em>'.
	 * @see dependability.DependabilityRequirement
	 * @generated
	 */
	EClass getDependabilityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link dependability.DependabilityRequirement#getDecompositionArgument <em>Decomposition Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decomposition Argument</em>'.
	 * @see dependability.DependabilityRequirement#getDecompositionArgument()
	 * @see #getDependabilityRequirement()
	 * @generated
	 */
	EAttribute getDependabilityRequirement_DecompositionArgument();

	/**
	 * Returns the meta object for the reference list '{@link dependability.DependabilityRequirement#getRefinedRequirements <em>Refined Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined Requirements</em>'.
	 * @see dependability.DependabilityRequirement#getRefinedRequirements()
	 * @see #getDependabilityRequirement()
	 * @generated
	 */
	EReference getDependabilityRequirement_RefinedRequirements();

	/**
	 * Returns the meta object for the reference '{@link dependability.DependabilityRequirement#getRequirementSource <em>Requirement Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Source</em>'.
	 * @see dependability.DependabilityRequirement#getRequirementSource()
	 * @see #getDependabilityRequirement()
	 * @generated
	 */
	EReference getDependabilityRequirement_RequirementSource();

	/**
	 * Returns the meta object for the reference list '{@link dependability.DependabilityRequirement#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measures</em>'.
	 * @see dependability.DependabilityRequirement#getMeasures()
	 * @see #getDependabilityRequirement()
	 * @generated
	 */
	EReference getDependabilityRequirement_Measures();

	/**
	 * Returns the meta object for the reference list '{@link dependability.DependabilityRequirement#getFailures <em>Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failures</em>'.
	 * @see dependability.DependabilityRequirement#getFailures()
	 * @see #getDependabilityRequirement()
	 * @generated
	 */
	EReference getDependabilityRequirement_Failures();

	/**
	 * Returns the meta object for the reference '{@link dependability.DependabilityRequirement#getAssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assurance Level</em>'.
	 * @see dependability.DependabilityRequirement#getAssuranceLevel()
	 * @see #getDependabilityRequirement()
	 * @generated
	 */
	EReference getDependabilityRequirement_AssuranceLevel();

	/**
	 * Returns the meta object for the reference list '{@link dependability.DependabilityRequirement#getMaintenanceProcedures <em>Maintenance Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Maintenance Procedures</em>'.
	 * @see dependability.DependabilityRequirement#getMaintenanceProcedures()
	 * @see #getDependabilityRequirement()
	 * @generated
	 */
	EReference getDependabilityRequirement_MaintenanceProcedures();

	/**
	 * Returns the meta object for class '{@link dependability.SafetyRequirement <em>Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Requirement</em>'.
	 * @see dependability.SafetyRequirement
	 * @generated
	 */
	EClass getSafetyRequirement();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SafetyRequirement#getFailureReactionTime <em>Failure Reaction Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Reaction Time</em>'.
	 * @see dependability.SafetyRequirement#getFailureReactionTime()
	 * @see #getSafetyRequirement()
	 * @generated
	 */
	EAttribute getSafetyRequirement_FailureReactionTime();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SafetyRequirement#getFailureDetectionTime <em>Failure Detection Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Detection Time</em>'.
	 * @see dependability.SafetyRequirement#getFailureDetectionTime()
	 * @see #getSafetyRequirement()
	 * @generated
	 */
	EAttribute getSafetyRequirement_FailureDetectionTime();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SafetyRequirement#getFailureLatencyTime <em>Failure Latency Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Latency Time</em>'.
	 * @see dependability.SafetyRequirement#getFailureLatencyTime()
	 * @see #getSafetyRequirement()
	 * @generated
	 */
	EAttribute getSafetyRequirement_FailureLatencyTime();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SafetyRequirement#isIsSafetyGoal <em>Is Safety Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Safety Goal</em>'.
	 * @see dependability.SafetyRequirement#isIsSafetyGoal()
	 * @see #getSafetyRequirement()
	 * @generated
	 */
	EAttribute getSafetyRequirement_IsSafetyGoal();

	/**
	 * Returns the meta object for the reference list '{@link dependability.SafetyRequirement#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazards</em>'.
	 * @see dependability.SafetyRequirement#getHazards()
	 * @see #getSafetyRequirement()
	 * @generated
	 */
	EReference getSafetyRequirement_Hazards();

	/**
	 * Returns the meta object for class '{@link dependability.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see dependability.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for the reference list '{@link dependability.SecurityRequirement#getSecurityCapabilities <em>Security Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Capabilities</em>'.
	 * @see dependability.SecurityRequirement#getSecurityCapabilities()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_SecurityCapabilities();

	/**
	 * Returns the meta object for class '{@link dependability.DomainPackage <em>Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Package</em>'.
	 * @see dependability.DomainPackage
	 * @generated
	 */
	EClass getDomainPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.DomainPackage#getStandards <em>Standards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standards</em>'.
	 * @see dependability.DomainPackage#getStandards()
	 * @see #getDomainPackage()
	 * @generated
	 */
	EReference getDomainPackage_Standards();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.DomainPackage#getAssuranceLevels <em>Assurance Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assurance Levels</em>'.
	 * @see dependability.DomainPackage#getAssuranceLevels()
	 * @see #getDomainPackage()
	 * @generated
	 */
	EReference getDomainPackage_AssuranceLevels();

	/**
	 * Returns the meta object for class '{@link dependability.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard</em>'.
	 * @see dependability.Standard
	 * @generated
	 */
	EClass getStandard();

	/**
	 * Returns the meta object for class '{@link dependability.AssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assurance Level</em>'.
	 * @see dependability.AssuranceLevel
	 * @generated
	 */
	EClass getAssuranceLevel();

	/**
	 * Returns the meta object for class '{@link dependability.SafetyStandard <em>Safety Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Standard</em>'.
	 * @see dependability.SafetyStandard
	 * @generated
	 */
	EClass getSafetyStandard();

	/**
	 * Returns the meta object for the reference list '{@link dependability.SafetyStandard#getAssuranceLevels <em>Assurance Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assurance Levels</em>'.
	 * @see dependability.SafetyStandard#getAssuranceLevels()
	 * @see #getSafetyStandard()
	 * @generated
	 */
	EReference getSafetyStandard_AssuranceLevels();

	/**
	 * Returns the meta object for class '{@link dependability.TARAPackage <em>TARA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TARA Package</em>'.
	 * @see dependability.TARAPackage
	 * @generated
	 */
	EClass getTARAPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.TARAPackage#getIdentifiedRisks <em>Identified Risks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identified Risks</em>'.
	 * @see dependability.TARAPackage#getIdentifiedRisks()
	 * @see #getTARAPackage()
	 * @generated
	 */
	EReference getTARAPackage_IdentifiedRisks();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.TARAPackage#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see dependability.TARAPackage#getControls()
	 * @see #getTARAPackage()
	 * @generated
	 */
	EReference getTARAPackage_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.TARAPackage#getConsideredAssets <em>Considered Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Considered Assets</em>'.
	 * @see dependability.TARAPackage#getConsideredAssets()
	 * @see #getTARAPackage()
	 * @generated
	 */
	EReference getTARAPackage_ConsideredAssets();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.TARAPackage#getConsideredThreatAgents <em>Considered Threat Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Considered Threat Agents</em>'.
	 * @see dependability.TARAPackage#getConsideredThreatAgents()
	 * @see #getTARAPackage()
	 * @generated
	 */
	EReference getTARAPackage_ConsideredThreatAgents();

	/**
	 * Returns the meta object for class '{@link dependability.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see dependability.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Asset#getFinancialValue <em>Financial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Financial Value</em>'.
	 * @see dependability.Asset#getFinancialValue()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_FinancialValue();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Asset#getFinancialCostType <em>Financial Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Financial Cost Type</em>'.
	 * @see dependability.Asset#getFinancialCostType()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_FinancialCostType();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Asset#getOperationalCost <em>Operational Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational Cost</em>'.
	 * @see dependability.Asset#getOperationalCost()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_OperationalCost();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Asset#getOperationalCostType <em>Operational Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational Cost Type</em>'.
	 * @see dependability.Asset#getOperationalCostType()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_OperationalCostType();

	/**
	 * Returns the meta object for class '{@link dependability.SecurityControl <em>Security Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Control</em>'.
	 * @see dependability.SecurityControl
	 * @generated
	 */
	EClass getSecurityControl();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SecurityControl#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see dependability.SecurityControl#getCategory()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EAttribute getSecurityControl_Category();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SecurityControl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dependability.SecurityControl#getType()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EAttribute getSecurityControl_Type();

	/**
	 * Returns the meta object for the reference list '{@link dependability.SecurityControl#getVulnerabilities <em>Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vulnerabilities</em>'.
	 * @see dependability.SecurityControl#getVulnerabilities()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EReference getSecurityControl_Vulnerabilities();

	/**
	 * Returns the meta object for class '{@link dependability.SecurityCapability <em>Security Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Capability</em>'.
	 * @see dependability.SecurityCapability
	 * @generated
	 */
	EClass getSecurityCapability();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SecurityCapability#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see dependability.SecurityCapability#getCategory()
	 * @see #getSecurityCapability()
	 * @generated
	 */
	EAttribute getSecurityCapability_Category();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SecurityCapability#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dependability.SecurityCapability#getType()
	 * @see #getSecurityCapability()
	 * @generated
	 */
	EAttribute getSecurityCapability_Type();

	/**
	 * Returns the meta object for the reference list '{@link dependability.SecurityCapability#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented By</em>'.
	 * @see dependability.SecurityCapability#getImplementedBy()
	 * @see #getSecurityCapability()
	 * @generated
	 */
	EReference getSecurityCapability_ImplementedBy();

	/**
	 * Returns the meta object for class '{@link dependability.Vulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability</em>'.
	 * @see dependability.Vulnerability
	 * @generated
	 */
	EClass getVulnerability();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Vulnerability#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see dependability.Vulnerability#getCategory()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_Category();

	/**
	 * Returns the meta object for class '{@link dependability.VulnerableItem <em>Vulnerable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerable Item</em>'.
	 * @see dependability.VulnerableItem
	 * @generated
	 */
	EClass getVulnerableItem();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.VulnerableItem#getVulnerabilities <em>Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vulnerabilities</em>'.
	 * @see dependability.VulnerableItem#getVulnerabilities()
	 * @see #getVulnerableItem()
	 * @generated
	 */
	EReference getVulnerableItem_Vulnerabilities();

	/**
	 * Returns the meta object for class '{@link dependability.AttackerGoal <em>Attacker Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attacker Goal</em>'.
	 * @see dependability.AttackerGoal
	 * @generated
	 */
	EClass getAttackerGoal();

	/**
	 * Returns the meta object for the attribute '{@link dependability.AttackerGoal#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see dependability.AttackerGoal#getCategory()
	 * @see #getAttackerGoal()
	 * @generated
	 */
	EAttribute getAttackerGoal_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.AttackerGoal#getAddressedBy <em>Addressed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addressed By</em>'.
	 * @see dependability.AttackerGoal#getAddressedBy()
	 * @see #getAttackerGoal()
	 * @generated
	 */
	EReference getAttackerGoal_AddressedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.AttackerGoal#getAttacks <em>Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attacks</em>'.
	 * @see dependability.AttackerGoal#getAttacks()
	 * @see #getAttackerGoal()
	 * @generated
	 */
	EReference getAttackerGoal_Attacks();

	/**
	 * Returns the meta object for the reference list '{@link dependability.AttackerGoal#getAttackedItems <em>Attacked Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacked Items</em>'.
	 * @see dependability.AttackerGoal#getAttackedItems()
	 * @see #getAttackerGoal()
	 * @generated
	 */
	EReference getAttackerGoal_AttackedItems();

	/**
	 * Returns the meta object for class '{@link dependability.SecurityRisk <em>Security Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Risk</em>'.
	 * @see dependability.SecurityRisk
	 * @generated
	 */
	EClass getSecurityRisk();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SecurityRisk#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likelihood</em>'.
	 * @see dependability.SecurityRisk#getLikelihood()
	 * @see #getSecurityRisk()
	 * @generated
	 */
	EAttribute getSecurityRisk_Likelihood();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SecurityRisk#getImpactAsset <em>Impact Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact Asset</em>'.
	 * @see dependability.SecurityRisk#getImpactAsset()
	 * @see #getSecurityRisk()
	 * @generated
	 */
	EAttribute getSecurityRisk_ImpactAsset();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SecurityRisk#getImpactIndividuals <em>Impact Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact Individuals</em>'.
	 * @see dependability.SecurityRisk#getImpactIndividuals()
	 * @see #getSecurityRisk()
	 * @generated
	 */
	EAttribute getSecurityRisk_ImpactIndividuals();

	/**
	 * Returns the meta object for the attribute '{@link dependability.SecurityRisk#getImpactBusiness <em>Impact Business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact Business</em>'.
	 * @see dependability.SecurityRisk#getImpactBusiness()
	 * @see #getSecurityRisk()
	 * @generated
	 */
	EAttribute getSecurityRisk_ImpactBusiness();

	/**
	 * Returns the meta object for the reference list '{@link dependability.SecurityRisk#getAttackerGoals <em>Attacker Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacker Goals</em>'.
	 * @see dependability.SecurityRisk#getAttackerGoals()
	 * @see #getSecurityRisk()
	 * @generated
	 */
	EReference getSecurityRisk_AttackerGoals();

	/**
	 * Returns the meta object for class '{@link dependability.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack</em>'.
	 * @see dependability.Attack
	 * @generated
	 */
	EClass getAttack();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Attack#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see dependability.Attack#getCategory()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_Category();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Attack#getFinancialCost <em>Financial Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Financial Cost</em>'.
	 * @see dependability.Attack#getFinancialCost()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_FinancialCost();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Attack#getFinancialCostType <em>Financial Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Financial Cost Type</em>'.
	 * @see dependability.Attack#getFinancialCostType()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_FinancialCostType();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Attack#getTimeRequired <em>Time Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Required</em>'.
	 * @see dependability.Attack#getTimeRequired()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_TimeRequired();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Attack#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see dependability.Attack#getTimeUnit()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Attack#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see dependability.Attack#getDifficulty()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link dependability.Attack#getDetectability <em>Detectability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detectability</em>'.
	 * @see dependability.Attack#getDetectability()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_Detectability();

	/**
	 * Returns the meta object for the reference list '{@link dependability.Attack#getViolations <em>Violations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Violations</em>'.
	 * @see dependability.Attack#getViolations()
	 * @see #getAttack()
	 * @generated
	 */
	EReference getAttack_Violations();

	/**
	 * Returns the meta object for the reference list '{@link dependability.Attack#getExploitedVulnerabilities <em>Exploited Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exploited Vulnerabilities</em>'.
	 * @see dependability.Attack#getExploitedVulnerabilities()
	 * @see #getAttack()
	 * @generated
	 */
	EReference getAttack_ExploitedVulnerabilities();

	/**
	 * Returns the meta object for class '{@link dependability.Payload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload</em>'.
	 * @see dependability.Payload
	 * @generated
	 */
	EClass getPayload();

	/**
	 * Returns the meta object for class '{@link dependability.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see dependability.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link dependability.ThreatAgent <em>Threat Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat Agent</em>'.
	 * @see dependability.ThreatAgent
	 * @generated
	 */
	EClass getThreatAgent();

	/**
	 * Returns the meta object for the attribute '{@link dependability.ThreatAgent#getSkillLevel <em>Skill Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill Level</em>'.
	 * @see dependability.ThreatAgent#getSkillLevel()
	 * @see #getThreatAgent()
	 * @generated
	 */
	EAttribute getThreatAgent_SkillLevel();

	/**
	 * Returns the meta object for the attribute '{@link dependability.ThreatAgent#getMotivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motivation</em>'.
	 * @see dependability.ThreatAgent#getMotivation()
	 * @see #getThreatAgent()
	 * @generated
	 */
	EAttribute getThreatAgent_Motivation();

	/**
	 * Returns the meta object for the attribute '{@link dependability.ThreatAgent#getAnonymityDesire <em>Anonymity Desire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymity Desire</em>'.
	 * @see dependability.ThreatAgent#getAnonymityDesire()
	 * @see #getThreatAgent()
	 * @generated
	 */
	EAttribute getThreatAgent_AnonymityDesire();

	/**
	 * Returns the meta object for the containment reference list '{@link dependability.ThreatAgent#getAttackerGoals <em>Attacker Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attacker Goals</em>'.
	 * @see dependability.ThreatAgent#getAttackerGoals()
	 * @see #getThreatAgent()
	 * @generated
	 */
	EReference getThreatAgent_AttackerGoals();

	/**
	 * Returns the meta object for class '{@link dependability.Human <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human</em>'.
	 * @see dependability.Human
	 * @generated
	 */
	EClass getHuman();

	/**
	 * Returns the meta object for the reference list '{@link dependability.Human#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see dependability.Human#getActions()
	 * @see #getHuman()
	 * @generated
	 */
	EReference getHuman_Actions();

	/**
	 * Returns the meta object for class '{@link dependability.NonHuman <em>Non Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Human</em>'.
	 * @see dependability.NonHuman
	 * @generated
	 */
	EClass getNonHuman();

	/**
	 * Returns the meta object for the reference list '{@link dependability.NonHuman#getPayloads <em>Payloads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payloads</em>'.
	 * @see dependability.NonHuman#getPayloads()
	 * @see #getNonHuman()
	 * @generated
	 */
	EReference getNonHuman_Payloads();

	/**
	 * Returns the meta object for enum '{@link dependability.SecurityApplicationType <em>Security Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Application Type</em>'.
	 * @see dependability.SecurityApplicationType
	 * @generated
	 */
	EEnum getSecurityApplicationType();

	/**
	 * Returns the meta object for enum '{@link dependability.FinancialCostType <em>Financial Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Financial Cost Type</em>'.
	 * @see dependability.FinancialCostType
	 * @generated
	 */
	EEnum getFinancialCostType();

	/**
	 * Returns the meta object for enum '{@link dependability.OperationalCostType <em>Operational Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operational Cost Type</em>'.
	 * @see dependability.OperationalCostType
	 * @generated
	 */
	EEnum getOperationalCostType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Dependability_Factory getDependability_Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dependability.impl.MaintenanceProcedureImpl <em>Maintenance Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.MaintenanceProcedureImpl
		 * @see dependability.impl.Dependability_PackageImpl#getMaintenanceProcedure()
		 * @generated
		 */
		EClass MAINTENANCE_PROCEDURE = eINSTANCE.getMaintenanceProcedure();

		/**
		 * The meta object literal for the '<em><b>Activity Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_PROCEDURE__ACTIVITY_DESCRIPTION = eINSTANCE.getMaintenanceProcedure_ActivityDescription();

		/**
		 * The meta object literal for the '<em><b>Technical Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_PROCEDURE__TECHNICAL_DESCRIPTION = eINSTANCE.getMaintenanceProcedure_TechnicalDescription();

		/**
		 * The meta object literal for the '<em><b>Tool Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_PROCEDURE__TOOL_SPECIFICATION = eINSTANCE.getMaintenanceProcedure_ToolSpecification();

		/**
		 * The meta object literal for the '<em><b>Staff Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_PROCEDURE__STAFF_NUMBER = eINSTANCE.getMaintenanceProcedure_StaffNumber();

		/**
		 * The meta object literal for the '<em><b>Staff Skill Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_PROCEDURE__STAFF_SKILL_LEVEL = eINSTANCE.getMaintenanceProcedure_StaffSkillLevel();

		/**
		 * The meta object literal for the '<em><b>Staff Training Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_PROCEDURE__STAFF_TRAINING_DESCRIPTION = eINSTANCE.getMaintenanceProcedure_StaffTrainingDescription();

		/**
		 * The meta object literal for the '{@link dependability.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.MeasureTypeImpl
		 * @see dependability.impl.Dependability_PackageImpl#getMeasureType()
		 * @generated
		 */
		EClass MEASURE_TYPE = eINSTANCE.getMeasureType();

		/**
		 * The meta object literal for the '{@link dependability.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.MeasureImpl
		 * @see dependability.impl.Dependability_PackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Intrinsic Safety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__INTRINSIC_SAFETY = eINSTANCE.getMeasure_IntrinsicSafety();

		/**
		 * The meta object literal for the '<em><b>Safe Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__SAFE_GUARD = eINSTANCE.getMeasure_SafeGuard();

		/**
		 * The meta object literal for the '<em><b>Applier Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__APPLIER_INFORMATION = eINSTANCE.getMeasure_ApplierInformation();

		/**
		 * The meta object literal for the '<em><b>Risk Acceptability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__RISK_ACCEPTABILITY = eINSTANCE.getMeasure_RiskAcceptability();

		/**
		 * The meta object literal for the '<em><b>Further Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__FURTHER_ACTION = eINSTANCE.getMeasure_FurtherAction();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__SOURCE = eINSTANCE.getMeasure_Source();

		/**
		 * The meta object literal for the '<em><b>Measure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__MEASURE_TYPE = eINSTANCE.getMeasure_MeasureType();

		/**
		 * The meta object literal for the '<em><b>Assurance Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__ASSURANCE_LEVEL = eINSTANCE.getMeasure_AssuranceLevel();

		/**
		 * The meta object literal for the '{@link dependability.impl.FaultToleranceMeasureImpl <em>Fault Tolerance Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.FaultToleranceMeasureImpl
		 * @see dependability.impl.Dependability_PackageImpl#getFaultToleranceMeasure()
		 * @generated
		 */
		EClass FAULT_TOLERANCE_MEASURE = eINSTANCE.getFaultToleranceMeasure();

		/**
		 * The meta object literal for the '{@link dependability.impl.DependabilityPackageImpl <em>Dependability Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.DependabilityPackageImpl
		 * @see dependability.impl.Dependability_PackageImpl#getDependabilityPackage()
		 * @generated
		 */
		EClass DEPENDABILITY_PACKAGE = eINSTANCE.getDependabilityPackage();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_PACKAGE__MEASURES = eINSTANCE.getDependabilityPackage_Measures();

		/**
		 * The meta object literal for the '<em><b>Measure Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_PACKAGE__MEASURE_TYPES = eINSTANCE.getDependabilityPackage_MeasureTypes();

		/**
		 * The meta object literal for the '<em><b>Maintenance Procedures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_PACKAGE__MAINTENANCE_PROCEDURES = eINSTANCE.getDependabilityPackage_MaintenanceProcedures();

		/**
		 * The meta object literal for the '<em><b>HARA Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_PACKAGE__HARA_PACKAGES = eINSTANCE.getDependabilityPackage_HARAPackages();

		/**
		 * The meta object literal for the '<em><b>Requirement Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_PACKAGE__REQUIREMENT_PACKAGES = eINSTANCE.getDependabilityPackage_RequirementPackages();

		/**
		 * The meta object literal for the '<em><b>Domain Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_PACKAGE__DOMAIN_PACKAGES = eINSTANCE.getDependabilityPackage_DomainPackages();

		/**
		 * The meta object literal for the '<em><b>TARA Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_PACKAGE__TARA_PACKAGES = eINSTANCE.getDependabilityPackage_TARAPackages();

		/**
		 * The meta object literal for the '{@link dependability.impl.HARAPackageImpl <em>HARA Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.HARAPackageImpl
		 * @see dependability.impl.Dependability_PackageImpl#getHARAPackage()
		 * @generated
		 */
		EClass HARA_PACKAGE = eINSTANCE.getHARAPackage();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARA_PACKAGE__HAZARDS = eINSTANCE.getHARAPackage_Hazards();

		/**
		 * The meta object literal for the '<em><b>Hazard Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARA_PACKAGE__HAZARD_TYPES = eINSTANCE.getHARAPackage_HazardTypes();

		/**
		 * The meta object literal for the '<em><b>Hazard Type Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARA_PACKAGE__HAZARD_TYPE_SYSTEMS = eINSTANCE.getHARAPackage_HazardTypeSystems();

		/**
		 * The meta object literal for the '<em><b>Malfunctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARA_PACKAGE__MALFUNCTIONS = eINSTANCE.getHARAPackage_Malfunctions();

		/**
		 * The meta object literal for the '<em><b>Risk Assessments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARA_PACKAGE__RISK_ASSESSMENTS = eINSTANCE.getHARAPackage_RiskAssessments();

		/**
		 * The meta object literal for the '<em><b>Risk Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARA_PACKAGE__RISK_PARAMETERS = eINSTANCE.getHARAPackage_RiskParameters();

		/**
		 * The meta object literal for the '{@link dependability.impl.HazardImpl <em>Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.HazardImpl
		 * @see dependability.impl.Dependability_PackageImpl#getHazard()
		 * @generated
		 */
		EClass HAZARD = eINSTANCE.getHazard();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD__CONDITION = eINSTANCE.getHazard_Condition();

		/**
		 * The meta object literal for the '<em><b>Failures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__FAILURES = eINSTANCE.getHazard_Failures();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__MEASURES = eINSTANCE.getHazard_Measures();

		/**
		 * The meta object literal for the '<em><b>Hazard Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__HAZARD_TYPE = eINSTANCE.getHazard_HazardType();

		/**
		 * The meta object literal for the '{@link dependability.impl.HazardTypeSystemImpl <em>Hazard Type System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.HazardTypeSystemImpl
		 * @see dependability.impl.Dependability_PackageImpl#getHazardTypeSystem()
		 * @generated
		 */
		EClass HAZARD_TYPE_SYSTEM = eINSTANCE.getHazardTypeSystem();

		/**
		 * The meta object literal for the '<em><b>Hazard Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_TYPE_SYSTEM__HAZARD_TYPES = eINSTANCE.getHazardTypeSystem_HazardTypes();

		/**
		 * The meta object literal for the '{@link dependability.impl.HazardTypeImpl <em>Hazard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.HazardTypeImpl
		 * @see dependability.impl.Dependability_PackageImpl#getHazardType()
		 * @generated
		 */
		EClass HAZARD_TYPE = eINSTANCE.getHazardType();

		/**
		 * The meta object literal for the '{@link dependability.impl.MalfunctionImpl <em>Malfunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.MalfunctionImpl
		 * @see dependability.impl.Dependability_PackageImpl#getMalfunction()
		 * @generated
		 */
		EClass MALFUNCTION = eINSTANCE.getMalfunction();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MALFUNCTION__HAZARDS = eINSTANCE.getMalfunction_Hazards();

		/**
		 * The meta object literal for the '{@link dependability.impl.RiskAssessmentImpl <em>Risk Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.RiskAssessmentImpl
		 * @see dependability.impl.Dependability_PackageImpl#getRiskAssessment()
		 * @generated
		 */
		EClass RISK_ASSESSMENT = eINSTANCE.getRiskAssessment();

		/**
		 * The meta object literal for the '<em><b>Related Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__RELATED_STANDARD = eINSTANCE.getRiskAssessment_RelatedStandard();

		/**
		 * The meta object literal for the '<em><b>Risk Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSMENT__RISK_PARAMETERS = eINSTANCE.getRiskAssessment_RiskParameters();

		/**
		 * The meta object literal for the '<em><b>Hazard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_ASSESSMENT__HAZARD = eINSTANCE.getRiskAssessment_Hazard();

		/**
		 * The meta object literal for the '{@link dependability.impl.RiskParameterImpl <em>Risk Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.RiskParameterImpl
		 * @see dependability.impl.Dependability_PackageImpl#getRiskParameter()
		 * @generated
		 */
		EClass RISK_PARAMETER = eINSTANCE.getRiskParameter();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_PARAMETER__ARGUMENT = eINSTANCE.getRiskParameter_Argument();

		/**
		 * The meta object literal for the '{@link dependability.impl.SituationImpl <em>Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.SituationImpl
		 * @see dependability.impl.Dependability_PackageImpl#getSituation()
		 * @generated
		 */
		EClass SITUATION = eINSTANCE.getSituation();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITUATION__LIKELIHOOD = eINSTANCE.getSituation_Likelihood();

		/**
		 * The meta object literal for the '{@link dependability.impl.AccidentImpl <em>Accident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.AccidentImpl
		 * @see dependability.impl.Dependability_PackageImpl#getAccident()
		 * @generated
		 */
		EClass ACCIDENT = eINSTANCE.getAccident();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCIDENT__SEVERITY = eINSTANCE.getAccident_Severity();

		/**
		 * The meta object literal for the '{@link dependability.impl.OperatorMeasureImpl <em>Operator Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.OperatorMeasureImpl
		 * @see dependability.impl.Dependability_PackageImpl#getOperatorMeasure()
		 * @generated
		 */
		EClass OPERATOR_MEASURE = eINSTANCE.getOperatorMeasure();

		/**
		 * The meta object literal for the '<em><b>Controlability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_MEASURE__CONTROLABILITY = eINSTANCE.getOperatorMeasure_Controlability();

		/**
		 * The meta object literal for the '{@link dependability.impl.RequirementPackageImpl <em>Requirement Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.RequirementPackageImpl
		 * @see dependability.impl.Dependability_PackageImpl#getRequirementPackage()
		 * @generated
		 */
		EClass REQUIREMENT_PACKAGE = eINSTANCE.getRequirementPackage();

		/**
		 * The meta object literal for the '<em><b>Requirement Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_PACKAGE__REQUIREMENT_SOURCES = eINSTANCE.getRequirementPackage_RequirementSources();

		/**
		 * The meta object literal for the '<em><b>Dependability Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_PACKAGE__DEPENDABILITY_REQUIREMENTS = eINSTANCE.getRequirementPackage_DependabilityRequirements();

		/**
		 * The meta object literal for the '{@link dependability.impl.RequirementSourceImpl <em>Requirement Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.RequirementSourceImpl
		 * @see dependability.impl.Dependability_PackageImpl#getRequirementSource()
		 * @generated
		 */
		EClass REQUIREMENT_SOURCE = eINSTANCE.getRequirementSource();

		/**
		 * The meta object literal for the '{@link dependability.impl.LegalContractImpl <em>Legal Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.LegalContractImpl
		 * @see dependability.impl.Dependability_PackageImpl#getLegalContract()
		 * @generated
		 */
		EClass LEGAL_CONTRACT = eINSTANCE.getLegalContract();

		/**
		 * The meta object literal for the '{@link dependability.impl.DependabilityRequirementImpl <em>Dependability Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.DependabilityRequirementImpl
		 * @see dependability.impl.Dependability_PackageImpl#getDependabilityRequirement()
		 * @generated
		 */
		EClass DEPENDABILITY_REQUIREMENT = eINSTANCE.getDependabilityRequirement();

		/**
		 * The meta object literal for the '<em><b>Decomposition Argument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDABILITY_REQUIREMENT__DECOMPOSITION_ARGUMENT = eINSTANCE.getDependabilityRequirement_DecompositionArgument();

		/**
		 * The meta object literal for the '<em><b>Refined Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_REQUIREMENT__REFINED_REQUIREMENTS = eINSTANCE.getDependabilityRequirement_RefinedRequirements();

		/**
		 * The meta object literal for the '<em><b>Requirement Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_REQUIREMENT__REQUIREMENT_SOURCE = eINSTANCE.getDependabilityRequirement_RequirementSource();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_REQUIREMENT__MEASURES = eINSTANCE.getDependabilityRequirement_Measures();

		/**
		 * The meta object literal for the '<em><b>Failures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_REQUIREMENT__FAILURES = eINSTANCE.getDependabilityRequirement_Failures();

		/**
		 * The meta object literal for the '<em><b>Assurance Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_REQUIREMENT__ASSURANCE_LEVEL = eINSTANCE.getDependabilityRequirement_AssuranceLevel();

		/**
		 * The meta object literal for the '<em><b>Maintenance Procedures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_REQUIREMENT__MAINTENANCE_PROCEDURES = eINSTANCE.getDependabilityRequirement_MaintenanceProcedures();

		/**
		 * The meta object literal for the '{@link dependability.impl.SafetyRequirementImpl <em>Safety Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.SafetyRequirementImpl
		 * @see dependability.impl.Dependability_PackageImpl#getSafetyRequirement()
		 * @generated
		 */
		EClass SAFETY_REQUIREMENT = eINSTANCE.getSafetyRequirement();

		/**
		 * The meta object literal for the '<em><b>Failure Reaction Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_REQUIREMENT__FAILURE_REACTION_TIME = eINSTANCE.getSafetyRequirement_FailureReactionTime();

		/**
		 * The meta object literal for the '<em><b>Failure Detection Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_REQUIREMENT__FAILURE_DETECTION_TIME = eINSTANCE.getSafetyRequirement_FailureDetectionTime();

		/**
		 * The meta object literal for the '<em><b>Failure Latency Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_REQUIREMENT__FAILURE_LATENCY_TIME = eINSTANCE.getSafetyRequirement_FailureLatencyTime();

		/**
		 * The meta object literal for the '<em><b>Is Safety Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_REQUIREMENT__IS_SAFETY_GOAL = eINSTANCE.getSafetyRequirement_IsSafetyGoal();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_REQUIREMENT__HAZARDS = eINSTANCE.getSafetyRequirement_Hazards();

		/**
		 * The meta object literal for the '{@link dependability.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.SecurityRequirementImpl
		 * @see dependability.impl.Dependability_PackageImpl#getSecurityRequirement()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENT = eINSTANCE.getSecurityRequirement();

		/**
		 * The meta object literal for the '<em><b>Security Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENT__SECURITY_CAPABILITIES = eINSTANCE.getSecurityRequirement_SecurityCapabilities();

		/**
		 * The meta object literal for the '{@link dependability.impl.DomainPackageImpl <em>Domain Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.DomainPackageImpl
		 * @see dependability.impl.Dependability_PackageImpl#getDomainPackage()
		 * @generated
		 */
		EClass DOMAIN_PACKAGE = eINSTANCE.getDomainPackage();

		/**
		 * The meta object literal for the '<em><b>Standards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PACKAGE__STANDARDS = eINSTANCE.getDomainPackage_Standards();

		/**
		 * The meta object literal for the '<em><b>Assurance Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PACKAGE__ASSURANCE_LEVELS = eINSTANCE.getDomainPackage_AssuranceLevels();

		/**
		 * The meta object literal for the '{@link dependability.impl.StandardImpl <em>Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.StandardImpl
		 * @see dependability.impl.Dependability_PackageImpl#getStandard()
		 * @generated
		 */
		EClass STANDARD = eINSTANCE.getStandard();

		/**
		 * The meta object literal for the '{@link dependability.impl.AssuranceLevelImpl <em>Assurance Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.AssuranceLevelImpl
		 * @see dependability.impl.Dependability_PackageImpl#getAssuranceLevel()
		 * @generated
		 */
		EClass ASSURANCE_LEVEL = eINSTANCE.getAssuranceLevel();

		/**
		 * The meta object literal for the '{@link dependability.impl.SafetyStandardImpl <em>Safety Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.SafetyStandardImpl
		 * @see dependability.impl.Dependability_PackageImpl#getSafetyStandard()
		 * @generated
		 */
		EClass SAFETY_STANDARD = eINSTANCE.getSafetyStandard();

		/**
		 * The meta object literal for the '<em><b>Assurance Levels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_STANDARD__ASSURANCE_LEVELS = eINSTANCE.getSafetyStandard_AssuranceLevels();

		/**
		 * The meta object literal for the '{@link dependability.impl.TARAPackageImpl <em>TARA Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.TARAPackageImpl
		 * @see dependability.impl.Dependability_PackageImpl#getTARAPackage()
		 * @generated
		 */
		EClass TARA_PACKAGE = eINSTANCE.getTARAPackage();

		/**
		 * The meta object literal for the '<em><b>Identified Risks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARA_PACKAGE__IDENTIFIED_RISKS = eINSTANCE.getTARAPackage_IdentifiedRisks();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARA_PACKAGE__CONTROLS = eINSTANCE.getTARAPackage_Controls();

		/**
		 * The meta object literal for the '<em><b>Considered Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARA_PACKAGE__CONSIDERED_ASSETS = eINSTANCE.getTARAPackage_ConsideredAssets();

		/**
		 * The meta object literal for the '<em><b>Considered Threat Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARA_PACKAGE__CONSIDERED_THREAT_AGENTS = eINSTANCE.getTARAPackage_ConsideredThreatAgents();

		/**
		 * The meta object literal for the '{@link dependability.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.AssetImpl
		 * @see dependability.impl.Dependability_PackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Financial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__FINANCIAL_VALUE = eINSTANCE.getAsset_FinancialValue();

		/**
		 * The meta object literal for the '<em><b>Financial Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__FINANCIAL_COST_TYPE = eINSTANCE.getAsset_FinancialCostType();

		/**
		 * The meta object literal for the '<em><b>Operational Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__OPERATIONAL_COST = eINSTANCE.getAsset_OperationalCost();

		/**
		 * The meta object literal for the '<em><b>Operational Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__OPERATIONAL_COST_TYPE = eINSTANCE.getAsset_OperationalCostType();

		/**
		 * The meta object literal for the '{@link dependability.impl.SecurityControlImpl <em>Security Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.SecurityControlImpl
		 * @see dependability.impl.Dependability_PackageImpl#getSecurityControl()
		 * @generated
		 */
		EClass SECURITY_CONTROL = eINSTANCE.getSecurityControl();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTROL__CATEGORY = eINSTANCE.getSecurityControl_Category();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTROL__TYPE = eINSTANCE.getSecurityControl_Type();

		/**
		 * The meta object literal for the '<em><b>Vulnerabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTROL__VULNERABILITIES = eINSTANCE.getSecurityControl_Vulnerabilities();

		/**
		 * The meta object literal for the '{@link dependability.impl.SecurityCapabilityImpl <em>Security Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.SecurityCapabilityImpl
		 * @see dependability.impl.Dependability_PackageImpl#getSecurityCapability()
		 * @generated
		 */
		EClass SECURITY_CAPABILITY = eINSTANCE.getSecurityCapability();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CAPABILITY__CATEGORY = eINSTANCE.getSecurityCapability_Category();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CAPABILITY__TYPE = eINSTANCE.getSecurityCapability_Type();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CAPABILITY__IMPLEMENTED_BY = eINSTANCE.getSecurityCapability_ImplementedBy();

		/**
		 * The meta object literal for the '{@link dependability.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.VulnerabilityImpl
		 * @see dependability.impl.Dependability_PackageImpl#getVulnerability()
		 * @generated
		 */
		EClass VULNERABILITY = eINSTANCE.getVulnerability();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__CATEGORY = eINSTANCE.getVulnerability_Category();

		/**
		 * The meta object literal for the '{@link dependability.impl.VulnerableItemImpl <em>Vulnerable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.VulnerableItemImpl
		 * @see dependability.impl.Dependability_PackageImpl#getVulnerableItem()
		 * @generated
		 */
		EClass VULNERABLE_ITEM = eINSTANCE.getVulnerableItem();

		/**
		 * The meta object literal for the '<em><b>Vulnerabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABLE_ITEM__VULNERABILITIES = eINSTANCE.getVulnerableItem_Vulnerabilities();

		/**
		 * The meta object literal for the '{@link dependability.impl.AttackerGoalImpl <em>Attacker Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.AttackerGoalImpl
		 * @see dependability.impl.Dependability_PackageImpl#getAttackerGoal()
		 * @generated
		 */
		EClass ATTACKER_GOAL = eINSTANCE.getAttackerGoal();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER_GOAL__CATEGORY = eINSTANCE.getAttackerGoal_Category();

		/**
		 * The meta object literal for the '<em><b>Addressed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER_GOAL__ADDRESSED_BY = eINSTANCE.getAttackerGoal_AddressedBy();

		/**
		 * The meta object literal for the '<em><b>Attacks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER_GOAL__ATTACKS = eINSTANCE.getAttackerGoal_Attacks();

		/**
		 * The meta object literal for the '<em><b>Attacked Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER_GOAL__ATTACKED_ITEMS = eINSTANCE.getAttackerGoal_AttackedItems();

		/**
		 * The meta object literal for the '{@link dependability.impl.SecurityRiskImpl <em>Security Risk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.SecurityRiskImpl
		 * @see dependability.impl.Dependability_PackageImpl#getSecurityRisk()
		 * @generated
		 */
		EClass SECURITY_RISK = eINSTANCE.getSecurityRisk();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RISK__LIKELIHOOD = eINSTANCE.getSecurityRisk_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Impact Asset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RISK__IMPACT_ASSET = eINSTANCE.getSecurityRisk_ImpactAsset();

		/**
		 * The meta object literal for the '<em><b>Impact Individuals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RISK__IMPACT_INDIVIDUALS = eINSTANCE.getSecurityRisk_ImpactIndividuals();

		/**
		 * The meta object literal for the '<em><b>Impact Business</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RISK__IMPACT_BUSINESS = eINSTANCE.getSecurityRisk_ImpactBusiness();

		/**
		 * The meta object literal for the '<em><b>Attacker Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_RISK__ATTACKER_GOALS = eINSTANCE.getSecurityRisk_AttackerGoals();

		/**
		 * The meta object literal for the '{@link dependability.impl.AttackImpl <em>Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.AttackImpl
		 * @see dependability.impl.Dependability_PackageImpl#getAttack()
		 * @generated
		 */
		EClass ATTACK = eINSTANCE.getAttack();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__CATEGORY = eINSTANCE.getAttack_Category();

		/**
		 * The meta object literal for the '<em><b>Financial Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__FINANCIAL_COST = eINSTANCE.getAttack_FinancialCost();

		/**
		 * The meta object literal for the '<em><b>Financial Cost Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__FINANCIAL_COST_TYPE = eINSTANCE.getAttack_FinancialCostType();

		/**
		 * The meta object literal for the '<em><b>Time Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__TIME_REQUIRED = eINSTANCE.getAttack_TimeRequired();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__TIME_UNIT = eINSTANCE.getAttack_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__DIFFICULTY = eINSTANCE.getAttack_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Detectability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__DETECTABILITY = eINSTANCE.getAttack_Detectability();

		/**
		 * The meta object literal for the '<em><b>Violations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK__VIOLATIONS = eINSTANCE.getAttack_Violations();

		/**
		 * The meta object literal for the '<em><b>Exploited Vulnerabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK__EXPLOITED_VULNERABILITIES = eINSTANCE.getAttack_ExploitedVulnerabilities();

		/**
		 * The meta object literal for the '{@link dependability.impl.PayloadImpl <em>Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.PayloadImpl
		 * @see dependability.impl.Dependability_PackageImpl#getPayload()
		 * @generated
		 */
		EClass PAYLOAD = eINSTANCE.getPayload();

		/**
		 * The meta object literal for the '{@link dependability.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.ActionImpl
		 * @see dependability.impl.Dependability_PackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link dependability.impl.ThreatAgentImpl <em>Threat Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.ThreatAgentImpl
		 * @see dependability.impl.Dependability_PackageImpl#getThreatAgent()
		 * @generated
		 */
		EClass THREAT_AGENT = eINSTANCE.getThreatAgent();

		/**
		 * The meta object literal for the '<em><b>Skill Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_AGENT__SKILL_LEVEL = eINSTANCE.getThreatAgent_SkillLevel();

		/**
		 * The meta object literal for the '<em><b>Motivation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_AGENT__MOTIVATION = eINSTANCE.getThreatAgent_Motivation();

		/**
		 * The meta object literal for the '<em><b>Anonymity Desire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_AGENT__ANONYMITY_DESIRE = eINSTANCE.getThreatAgent_AnonymityDesire();

		/**
		 * The meta object literal for the '<em><b>Attacker Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_AGENT__ATTACKER_GOALS = eINSTANCE.getThreatAgent_AttackerGoals();

		/**
		 * The meta object literal for the '{@link dependability.impl.HumanImpl <em>Human</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.HumanImpl
		 * @see dependability.impl.Dependability_PackageImpl#getHuman()
		 * @generated
		 */
		EClass HUMAN = eINSTANCE.getHuman();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUMAN__ACTIONS = eINSTANCE.getHuman_Actions();

		/**
		 * The meta object literal for the '{@link dependability.impl.NonHumanImpl <em>Non Human</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.impl.NonHumanImpl
		 * @see dependability.impl.Dependability_PackageImpl#getNonHuman()
		 * @generated
		 */
		EClass NON_HUMAN = eINSTANCE.getNonHuman();

		/**
		 * The meta object literal for the '<em><b>Payloads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_HUMAN__PAYLOADS = eINSTANCE.getNonHuman_Payloads();

		/**
		 * The meta object literal for the '{@link dependability.SecurityApplicationType <em>Security Application Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.SecurityApplicationType
		 * @see dependability.impl.Dependability_PackageImpl#getSecurityApplicationType()
		 * @generated
		 */
		EEnum SECURITY_APPLICATION_TYPE = eINSTANCE.getSecurityApplicationType();

		/**
		 * The meta object literal for the '{@link dependability.FinancialCostType <em>Financial Cost Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.FinancialCostType
		 * @see dependability.impl.Dependability_PackageImpl#getFinancialCostType()
		 * @generated
		 */
		EEnum FINANCIAL_COST_TYPE = eINSTANCE.getFinancialCostType();

		/**
		 * The meta object literal for the '{@link dependability.OperationalCostType <em>Operational Cost Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependability.OperationalCostType
		 * @see dependability.impl.Dependability_PackageImpl#getOperationalCostType()
		 * @generated
		 */
		EEnum OPERATIONAL_COST_TYPE = eINSTANCE.getOperationalCostType();

	}

} //Dependability_Package
