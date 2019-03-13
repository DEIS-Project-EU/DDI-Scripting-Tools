/**
 */
package architecture;

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
 * @see architecture.Architecture_Factory
 * @model kind="package"
 * @generated
 */
public interface Architecture_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.deis-project.eu/ode/architecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Architecture_Package eINSTANCE = architecture.impl.Architecture_PackageImpl.init();

	/**
	 * The meta object id for the '{@link architecture.impl.DesignPackageImpl <em>Design Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.DesignPackageImpl
	 * @see architecture.impl.Architecture_PackageImpl#getDesignPackage()
	 * @generated
	 */
	int DESIGN_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PACKAGE__KEY_VALUE_MAPS = Integration_Package.ODE_PRODUCT_PACKAGE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PACKAGE__ID = Integration_Package.ODE_PRODUCT_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PACKAGE__NAME = Integration_Package.ODE_PRODUCT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PACKAGE__DESCRIPTION = Integration_Package.ODE_PRODUCT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PACKAGE__SYSTEMS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PACKAGE__FUNCTIONS = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Design Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PACKAGE_FEATURE_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Design Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_PACKAGE_OPERATION_COUNT = Integration_Package.ODE_PRODUCT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.SystemImpl
	 * @see architecture.impl.Architecture_PackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Overall Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OVERALL_LIFETIME = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overall Lifetime Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OVERALL_LIFETIME_TIME_UNIT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System Boundaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_BOUNDARIES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTEXTS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONFIGURATIONS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SIGNALS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PORTS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUB_SYSTEMS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Realised Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REALISED_FUNCTIONS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>As Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__AS_ASSET = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Dependability Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DEPENDABILITY_REQUIREMENTS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ASSURANCE_LEVEL = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Applied Standards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__APPLIED_STANDARDS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Failure Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FAILURE_MODELS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.FunctionImpl
	 * @see architecture.impl.Architecture_PackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SIGNALS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PORTS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Perf Chars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PERF_CHARS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SUB_FUNCTIONS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>As Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__AS_ASSET = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependability Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DEPENDABILITY_REQUIREMENTS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ASSURANCE_LEVEL = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Failure Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FAILURE_MODELS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Malfunctions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MALFUNCTIONS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.SafetyFunctionImpl <em>Safety Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.SafetyFunctionImpl
	 * @see architecture.impl.Architecture_PackageImpl#getSafetyFunction()
	 * @generated
	 */
	int SAFETY_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__KEY_VALUE_MAPS = FUNCTION__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__DESCRIPTION = FUNCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__SIGNALS = FUNCTION__SIGNALS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__PORTS = FUNCTION__PORTS;

	/**
	 * The feature id for the '<em><b>Perf Chars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__PERF_CHARS = FUNCTION__PERF_CHARS;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__SUB_FUNCTIONS = FUNCTION__SUB_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>As Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__AS_ASSET = FUNCTION__AS_ASSET;

	/**
	 * The feature id for the '<em><b>Dependability Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__DEPENDABILITY_REQUIREMENTS = FUNCTION__DEPENDABILITY_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__ASSURANCE_LEVEL = FUNCTION__ASSURANCE_LEVEL;

	/**
	 * The feature id for the '<em><b>Failure Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__FAILURE_MODELS = FUNCTION__FAILURE_MODELS;

	/**
	 * The feature id for the '<em><b>Malfunctions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__MALFUNCTIONS = FUNCTION__MALFUNCTIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__OBJECT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__BEHAVIOR = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Safe State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION__SAFE_STATE = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Safety Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Safety Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.PortImpl
	 * @see architecture.impl.Architecture_PackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Flow Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__FLOW_TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DIRECTION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INTERFACE_FAILURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refined Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REFINED_PORTS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ASSURANCE_LEVEL = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependability Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DEPENDABILITY_REQUIREMENTS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.PerfCharsImpl <em>Perf Chars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.PerfCharsImpl
	 * @see architecture.impl.Architecture_PackageImpl#getPerfChars()
	 * @generated
	 */
	int PERF_CHARS = 5;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_CHARS__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_CHARS__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_CHARS__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_CHARS__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_CHARS__RESPONSE_TIME = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perf Chars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_CHARS_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Perf Chars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_CHARS_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.SystemBoundaryImpl <em>System Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.SystemBoundaryImpl
	 * @see architecture.impl.Architecture_PackageImpl#getSystemBoundary()
	 * @generated
	 */
	int SYSTEM_BOUNDARY = 6;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BOUNDARY__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BOUNDARY__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BOUNDARY__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BOUNDARY__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BOUNDARY__PORTS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BOUNDARY_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BOUNDARY_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.ContextImpl
	 * @see architecture.impl.Architecture_PackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 7;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Usage History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__USAGE_HISTORY = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__MISSION_TIME = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mission Time Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__MISSION_TIME_TIME_UNIT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.PhysicalComponentImpl
	 * @see architecture.impl.Architecture_PackageImpl#getPhysicalComponent()
	 * @generated
	 */
	int PHYSICAL_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__KEY_VALUE_MAPS = SYSTEM__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__ID = SYSTEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__NAME = SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__DESCRIPTION = SYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Overall Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OVERALL_LIFETIME = SYSTEM__OVERALL_LIFETIME;

	/**
	 * The feature id for the '<em><b>Overall Lifetime Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__OVERALL_LIFETIME_TIME_UNIT = SYSTEM__OVERALL_LIFETIME_TIME_UNIT;

	/**
	 * The feature id for the '<em><b>System Boundaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__SYSTEM_BOUNDARIES = SYSTEM__SYSTEM_BOUNDARIES;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__CONTEXTS = SYSTEM__CONTEXTS;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__CONFIGURATIONS = SYSTEM__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__SIGNALS = SYSTEM__SIGNALS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__PORTS = SYSTEM__PORTS;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__SUB_SYSTEMS = SYSTEM__SUB_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Realised Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__REALISED_FUNCTIONS = SYSTEM__REALISED_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>As Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__AS_ASSET = SYSTEM__AS_ASSET;

	/**
	 * The feature id for the '<em><b>Dependability Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__DEPENDABILITY_REQUIREMENTS = SYSTEM__DEPENDABILITY_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__ASSURANCE_LEVEL = SYSTEM__ASSURANCE_LEVEL;

	/**
	 * The feature id for the '<em><b>Applied Standards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__APPLIED_STANDARDS = SYSTEM__APPLIED_STANDARDS;

	/**
	 * The feature id for the '<em><b>Failure Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__FAILURE_MODELS = SYSTEM__FAILURE_MODELS;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__DIMENSIONS = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Price Per Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__PRICE_PER_UNIT = SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__MASS = SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protection Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__PROTECTION_CATEGORY = SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Useful Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__USEFUL_LIFETIME = SYSTEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Useful Lifetime Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT = SYSTEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lifecycle Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS = SYSTEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Logical Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__LOGICAL_COMPONENTS = SYSTEM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Maintenance Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE = SYSTEM_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Physical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Physical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPONENT_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.LogicalComponentImpl <em>Logical Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.LogicalComponentImpl
	 * @see architecture.impl.Architecture_PackageImpl#getLogicalComponent()
	 * @generated
	 */
	int LOGICAL_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__KEY_VALUE_MAPS = SYSTEM__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__ID = SYSTEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__NAME = SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__DESCRIPTION = SYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Overall Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OVERALL_LIFETIME = SYSTEM__OVERALL_LIFETIME;

	/**
	 * The feature id for the '<em><b>Overall Lifetime Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__OVERALL_LIFETIME_TIME_UNIT = SYSTEM__OVERALL_LIFETIME_TIME_UNIT;

	/**
	 * The feature id for the '<em><b>System Boundaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__SYSTEM_BOUNDARIES = SYSTEM__SYSTEM_BOUNDARIES;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__CONTEXTS = SYSTEM__CONTEXTS;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__CONFIGURATIONS = SYSTEM__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__SIGNALS = SYSTEM__SIGNALS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__PORTS = SYSTEM__PORTS;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__SUB_SYSTEMS = SYSTEM__SUB_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Realised Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__REALISED_FUNCTIONS = SYSTEM__REALISED_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>As Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__AS_ASSET = SYSTEM__AS_ASSET;

	/**
	 * The feature id for the '<em><b>Dependability Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__DEPENDABILITY_REQUIREMENTS = SYSTEM__DEPENDABILITY_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__ASSURANCE_LEVEL = SYSTEM__ASSURANCE_LEVEL;

	/**
	 * The feature id for the '<em><b>Applied Standards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__APPLIED_STANDARDS = SYSTEM__APPLIED_STANDARDS;

	/**
	 * The feature id for the '<em><b>Failure Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT__FAILURE_MODELS = SYSTEM__FAILURE_MODELS;

	/**
	 * The number of structural features of the '<em>Logical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_COMPONENT_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.LifecycleConditionImpl <em>Lifecycle Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.LifecycleConditionImpl
	 * @see architecture.impl.Architecture_PackageImpl#getLifecycleCondition()
	 * @generated
	 */
	int LIFECYCLE_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CONDITION__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CONDITION__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CONDITION__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CONDITION__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CONDITION__VALUE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CONDITION__CONDITIONS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lifecycle Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CONDITION_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lifecycle Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CONDITION_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.SignalImpl
	 * @see architecture.impl.Architecture_PackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 11;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__FROM_PORT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TO_PORT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.SafetyRelatedSystemImpl <em>Safety Related System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.SafetyRelatedSystemImpl
	 * @see architecture.impl.Architecture_PackageImpl#getSafetyRelatedSystem()
	 * @generated
	 */
	int SAFETY_RELATED_SYSTEM = 12;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__KEY_VALUE_MAPS = SYSTEM__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__ID = SYSTEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__NAME = SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__DESCRIPTION = SYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Overall Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__OVERALL_LIFETIME = SYSTEM__OVERALL_LIFETIME;

	/**
	 * The feature id for the '<em><b>Overall Lifetime Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__OVERALL_LIFETIME_TIME_UNIT = SYSTEM__OVERALL_LIFETIME_TIME_UNIT;

	/**
	 * The feature id for the '<em><b>System Boundaries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__SYSTEM_BOUNDARIES = SYSTEM__SYSTEM_BOUNDARIES;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__CONTEXTS = SYSTEM__CONTEXTS;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__CONFIGURATIONS = SYSTEM__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__SIGNALS = SYSTEM__SIGNALS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__PORTS = SYSTEM__PORTS;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__SUB_SYSTEMS = SYSTEM__SUB_SYSTEMS;

	/**
	 * The feature id for the '<em><b>Realised Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__REALISED_FUNCTIONS = SYSTEM__REALISED_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>As Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__AS_ASSET = SYSTEM__AS_ASSET;

	/**
	 * The feature id for the '<em><b>Dependability Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__DEPENDABILITY_REQUIREMENTS = SYSTEM__DEPENDABILITY_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Assurance Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__ASSURANCE_LEVEL = SYSTEM__ASSURANCE_LEVEL;

	/**
	 * The feature id for the '<em><b>Applied Standards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__APPLIED_STANDARDS = SYSTEM__APPLIED_STANDARDS;

	/**
	 * The feature id for the '<em><b>Failure Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__FAILURE_MODELS = SYSTEM__FAILURE_MODELS;

	/**
	 * The feature id for the '<em><b>Safe State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM__SAFE_STATE = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Safety Related System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Safety Related System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_RELATED_SYSTEM_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.impl.ConfigurationImpl
	 * @see architecture.impl.Architecture_PackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sub Systems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SUB_SYSTEMS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link architecture.PortDirection <em>Port Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecture.PortDirection
	 * @see architecture.impl.Architecture_PackageImpl#getPortDirection()
	 * @generated
	 */
	int PORT_DIRECTION = 14;


	/**
	 * Returns the meta object for class '{@link architecture.DesignPackage <em>Design Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Package</em>'.
	 * @see architecture.DesignPackage
	 * @generated
	 */
	EClass getDesignPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.DesignPackage#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systems</em>'.
	 * @see architecture.DesignPackage#getSystems()
	 * @see #getDesignPackage()
	 * @generated
	 */
	EReference getDesignPackage_Systems();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.DesignPackage#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see architecture.DesignPackage#getFunctions()
	 * @see #getDesignPackage()
	 * @generated
	 */
	EReference getDesignPackage_Functions();

	/**
	 * Returns the meta object for class '{@link architecture.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see architecture.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link architecture.System#getOverallLifetime <em>Overall Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Lifetime</em>'.
	 * @see architecture.System#getOverallLifetime()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_OverallLifetime();

	/**
	 * Returns the meta object for the attribute '{@link architecture.System#getOverallLifetimeTimeUnit <em>Overall Lifetime Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Lifetime Time Unit</em>'.
	 * @see architecture.System#getOverallLifetimeTimeUnit()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_OverallLifetimeTimeUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.System#getSystemBoundaries <em>System Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Boundaries</em>'.
	 * @see architecture.System#getSystemBoundaries()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SystemBoundaries();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.System#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see architecture.System#getContexts()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.System#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see architecture.System#getConfigurations()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Configurations();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.System#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see architecture.System#getSignals()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Signals();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.System#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see architecture.System#getPorts()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Ports();

	/**
	 * Returns the meta object for the reference list '{@link architecture.System#getSubSystems <em>Sub Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Systems</em>'.
	 * @see architecture.System#getSubSystems()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SubSystems();

	/**
	 * Returns the meta object for the reference list '{@link architecture.System#getRealisedFunctions <em>Realised Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realised Functions</em>'.
	 * @see architecture.System#getRealisedFunctions()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_RealisedFunctions();

	/**
	 * Returns the meta object for the reference '{@link architecture.System#getAsAsset <em>As Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>As Asset</em>'.
	 * @see architecture.System#getAsAsset()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_AsAsset();

	/**
	 * Returns the meta object for the reference list '{@link architecture.System#getDependabilityRequirements <em>Dependability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependability Requirements</em>'.
	 * @see architecture.System#getDependabilityRequirements()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_DependabilityRequirements();

	/**
	 * Returns the meta object for the reference '{@link architecture.System#getAssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assurance Level</em>'.
	 * @see architecture.System#getAssuranceLevel()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_AssuranceLevel();

	/**
	 * Returns the meta object for the reference list '{@link architecture.System#getAppliedStandards <em>Applied Standards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied Standards</em>'.
	 * @see architecture.System#getAppliedStandards()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_AppliedStandards();

	/**
	 * Returns the meta object for the reference list '{@link architecture.System#getFailureModels <em>Failure Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure Models</em>'.
	 * @see architecture.System#getFailureModels()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_FailureModels();

	/**
	 * Returns the meta object for class '{@link architecture.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see architecture.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.Function#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see architecture.Function#getSignals()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Signals();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.Function#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see architecture.Function#getPorts()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link architecture.Function#getPerfChars <em>Perf Chars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Perf Chars</em>'.
	 * @see architecture.Function#getPerfChars()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_PerfChars();

	/**
	 * Returns the meta object for the reference list '{@link architecture.Function#getSubFunctions <em>Sub Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Functions</em>'.
	 * @see architecture.Function#getSubFunctions()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_SubFunctions();

	/**
	 * Returns the meta object for the reference '{@link architecture.Function#getAsAsset <em>As Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>As Asset</em>'.
	 * @see architecture.Function#getAsAsset()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_AsAsset();

	/**
	 * Returns the meta object for the reference list '{@link architecture.Function#getDependabilityRequirements <em>Dependability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependability Requirements</em>'.
	 * @see architecture.Function#getDependabilityRequirements()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_DependabilityRequirements();

	/**
	 * Returns the meta object for the reference '{@link architecture.Function#getAssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assurance Level</em>'.
	 * @see architecture.Function#getAssuranceLevel()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_AssuranceLevel();

	/**
	 * Returns the meta object for the reference list '{@link architecture.Function#getFailureModels <em>Failure Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure Models</em>'.
	 * @see architecture.Function#getFailureModels()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_FailureModels();

	/**
	 * Returns the meta object for the reference list '{@link architecture.Function#getMalfunctions <em>Malfunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Malfunctions</em>'.
	 * @see architecture.Function#getMalfunctions()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Malfunctions();

	/**
	 * Returns the meta object for class '{@link architecture.SafetyFunction <em>Safety Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Function</em>'.
	 * @see architecture.SafetyFunction
	 * @generated
	 */
	EClass getSafetyFunction();

	/**
	 * Returns the meta object for the attribute '{@link architecture.SafetyFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see architecture.SafetyFunction#getObject()
	 * @see #getSafetyFunction()
	 * @generated
	 */
	EAttribute getSafetyFunction_Object();

	/**
	 * Returns the meta object for the attribute '{@link architecture.SafetyFunction#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see architecture.SafetyFunction#getBehavior()
	 * @see #getSafetyFunction()
	 * @generated
	 */
	EAttribute getSafetyFunction_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link architecture.SafetyFunction#getSafeState <em>Safe State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe State</em>'.
	 * @see architecture.SafetyFunction#getSafeState()
	 * @see #getSafetyFunction()
	 * @generated
	 */
	EAttribute getSafetyFunction_SafeState();

	/**
	 * Returns the meta object for class '{@link architecture.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see architecture.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link architecture.Port#getFlowType <em>Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Type</em>'.
	 * @see architecture.Port#getFlowType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_FlowType();

	/**
	 * Returns the meta object for the attribute '{@link architecture.Port#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see architecture.Port#getDirection()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Direction();

	/**
	 * Returns the meta object for the reference list '{@link architecture.Port#getInterfaceFailures <em>Interface Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface Failures</em>'.
	 * @see architecture.Port#getInterfaceFailures()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_InterfaceFailures();

	/**
	 * Returns the meta object for the reference list '{@link architecture.Port#getRefinedPorts <em>Refined Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined Ports</em>'.
	 * @see architecture.Port#getRefinedPorts()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_RefinedPorts();

	/**
	 * Returns the meta object for the reference '{@link architecture.Port#getAssuranceLevel <em>Assurance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assurance Level</em>'.
	 * @see architecture.Port#getAssuranceLevel()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_AssuranceLevel();

	/**
	 * Returns the meta object for the reference list '{@link architecture.Port#getDependabilityRequirements <em>Dependability Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependability Requirements</em>'.
	 * @see architecture.Port#getDependabilityRequirements()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_DependabilityRequirements();

	/**
	 * Returns the meta object for class '{@link architecture.PerfChars <em>Perf Chars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perf Chars</em>'.
	 * @see architecture.PerfChars
	 * @generated
	 */
	EClass getPerfChars();

	/**
	 * Returns the meta object for the attribute '{@link architecture.PerfChars#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see architecture.PerfChars#getResponseTime()
	 * @see #getPerfChars()
	 * @generated
	 */
	EAttribute getPerfChars_ResponseTime();

	/**
	 * Returns the meta object for class '{@link architecture.SystemBoundary <em>System Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Boundary</em>'.
	 * @see architecture.SystemBoundary
	 * @generated
	 */
	EClass getSystemBoundary();

	/**
	 * Returns the meta object for the reference list '{@link architecture.SystemBoundary#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see architecture.SystemBoundary#getPorts()
	 * @see #getSystemBoundary()
	 * @generated
	 */
	EReference getSystemBoundary_Ports();

	/**
	 * Returns the meta object for class '{@link architecture.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see architecture.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link architecture.Context#getUsageHistory <em>Usage History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage History</em>'.
	 * @see architecture.Context#getUsageHistory()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_UsageHistory();

	/**
	 * Returns the meta object for the attribute '{@link architecture.Context#getMissionTime <em>Mission Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mission Time</em>'.
	 * @see architecture.Context#getMissionTime()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_MissionTime();

	/**
	 * Returns the meta object for the attribute '{@link architecture.Context#getMissionTimeTimeUnit <em>Mission Time Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mission Time Time Unit</em>'.
	 * @see architecture.Context#getMissionTimeTimeUnit()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_MissionTimeTimeUnit();

	/**
	 * Returns the meta object for class '{@link architecture.PhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Component</em>'.
	 * @see architecture.PhysicalComponent
	 * @generated
	 */
	EClass getPhysicalComponent();

	/**
	 * Returns the meta object for the attribute '{@link architecture.PhysicalComponent#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see architecture.PhysicalComponent#getDimensions()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EAttribute getPhysicalComponent_Dimensions();

	/**
	 * Returns the meta object for the attribute '{@link architecture.PhysicalComponent#getPricePerUnit <em>Price Per Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Unit</em>'.
	 * @see architecture.PhysicalComponent#getPricePerUnit()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EAttribute getPhysicalComponent_PricePerUnit();

	/**
	 * Returns the meta object for the attribute '{@link architecture.PhysicalComponent#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see architecture.PhysicalComponent#getMass()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EAttribute getPhysicalComponent_Mass();

	/**
	 * Returns the meta object for the attribute '{@link architecture.PhysicalComponent#getProtectionCategory <em>Protection Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protection Category</em>'.
	 * @see architecture.PhysicalComponent#getProtectionCategory()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EAttribute getPhysicalComponent_ProtectionCategory();

	/**
	 * Returns the meta object for the attribute '{@link architecture.PhysicalComponent#getUsefulLifetime <em>Useful Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Useful Lifetime</em>'.
	 * @see architecture.PhysicalComponent#getUsefulLifetime()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EAttribute getPhysicalComponent_UsefulLifetime();

	/**
	 * Returns the meta object for the attribute '{@link architecture.PhysicalComponent#getUsefulLifetimeTimeUnit <em>Useful Lifetime Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Useful Lifetime Time Unit</em>'.
	 * @see architecture.PhysicalComponent#getUsefulLifetimeTimeUnit()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EAttribute getPhysicalComponent_UsefulLifetimeTimeUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.PhysicalComponent#getLifecycleConditions <em>Lifecycle Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifecycle Conditions</em>'.
	 * @see architecture.PhysicalComponent#getLifecycleConditions()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_LifecycleConditions();

	/**
	 * Returns the meta object for the reference list '{@link architecture.PhysicalComponent#getLogicalComponents <em>Logical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical Components</em>'.
	 * @see architecture.PhysicalComponent#getLogicalComponents()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_LogicalComponents();

	/**
	 * Returns the meta object for the reference '{@link architecture.PhysicalComponent#getMaintenanceProcedure <em>Maintenance Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maintenance Procedure</em>'.
	 * @see architecture.PhysicalComponent#getMaintenanceProcedure()
	 * @see #getPhysicalComponent()
	 * @generated
	 */
	EReference getPhysicalComponent_MaintenanceProcedure();

	/**
	 * Returns the meta object for class '{@link architecture.LogicalComponent <em>Logical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Component</em>'.
	 * @see architecture.LogicalComponent
	 * @generated
	 */
	EClass getLogicalComponent();

	/**
	 * Returns the meta object for class '{@link architecture.LifecycleCondition <em>Lifecycle Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Condition</em>'.
	 * @see architecture.LifecycleCondition
	 * @generated
	 */
	EClass getLifecycleCondition();

	/**
	 * Returns the meta object for the attribute '{@link architecture.LifecycleCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see architecture.LifecycleCondition#getValue()
	 * @see #getLifecycleCondition()
	 * @generated
	 */
	EAttribute getLifecycleCondition_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link architecture.LifecycleCondition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see architecture.LifecycleCondition#getConditions()
	 * @see #getLifecycleCondition()
	 * @generated
	 */
	EReference getLifecycleCondition_Conditions();

	/**
	 * Returns the meta object for class '{@link architecture.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see architecture.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the reference '{@link architecture.Signal#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Port</em>'.
	 * @see architecture.Signal#getFromPort()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_FromPort();

	/**
	 * Returns the meta object for the reference '{@link architecture.Signal#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Port</em>'.
	 * @see architecture.Signal#getToPort()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_ToPort();

	/**
	 * Returns the meta object for class '{@link architecture.SafetyRelatedSystem <em>Safety Related System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Related System</em>'.
	 * @see architecture.SafetyRelatedSystem
	 * @generated
	 */
	EClass getSafetyRelatedSystem();

	/**
	 * Returns the meta object for the attribute '{@link architecture.SafetyRelatedSystem#getSafeState <em>Safe State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe State</em>'.
	 * @see architecture.SafetyRelatedSystem#getSafeState()
	 * @see #getSafetyRelatedSystem()
	 * @generated
	 */
	EAttribute getSafetyRelatedSystem_SafeState();

	/**
	 * Returns the meta object for class '{@link architecture.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see architecture.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link architecture.Configuration#getSubSystems <em>Sub Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Systems</em>'.
	 * @see architecture.Configuration#getSubSystems()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_SubSystems();

	/**
	 * Returns the meta object for enum '{@link architecture.PortDirection <em>Port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction</em>'.
	 * @see architecture.PortDirection
	 * @generated
	 */
	EEnum getPortDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Architecture_Factory getArchitecture_Factory();

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
		 * The meta object literal for the '{@link architecture.impl.DesignPackageImpl <em>Design Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.DesignPackageImpl
		 * @see architecture.impl.Architecture_PackageImpl#getDesignPackage()
		 * @generated
		 */
		EClass DESIGN_PACKAGE = eINSTANCE.getDesignPackage();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PACKAGE__SYSTEMS = eINSTANCE.getDesignPackage_Systems();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_PACKAGE__FUNCTIONS = eINSTANCE.getDesignPackage_Functions();

		/**
		 * The meta object literal for the '{@link architecture.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.SystemImpl
		 * @see architecture.impl.Architecture_PackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Overall Lifetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__OVERALL_LIFETIME = eINSTANCE.getSystem_OverallLifetime();

		/**
		 * The meta object literal for the '<em><b>Overall Lifetime Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__OVERALL_LIFETIME_TIME_UNIT = eINSTANCE.getSystem_OverallLifetimeTimeUnit();

		/**
		 * The meta object literal for the '<em><b>System Boundaries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEM_BOUNDARIES = eINSTANCE.getSystem_SystemBoundaries();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTEXTS = eINSTANCE.getSystem_Contexts();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONFIGURATIONS = eINSTANCE.getSystem_Configurations();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SIGNALS = eINSTANCE.getSystem_Signals();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PORTS = eINSTANCE.getSystem_Ports();

		/**
		 * The meta object literal for the '<em><b>Sub Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SUB_SYSTEMS = eINSTANCE.getSystem_SubSystems();

		/**
		 * The meta object literal for the '<em><b>Realised Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__REALISED_FUNCTIONS = eINSTANCE.getSystem_RealisedFunctions();

		/**
		 * The meta object literal for the '<em><b>As Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__AS_ASSET = eINSTANCE.getSystem_AsAsset();

		/**
		 * The meta object literal for the '<em><b>Dependability Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__DEPENDABILITY_REQUIREMENTS = eINSTANCE.getSystem_DependabilityRequirements();

		/**
		 * The meta object literal for the '<em><b>Assurance Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ASSURANCE_LEVEL = eINSTANCE.getSystem_AssuranceLevel();

		/**
		 * The meta object literal for the '<em><b>Applied Standards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__APPLIED_STANDARDS = eINSTANCE.getSystem_AppliedStandards();

		/**
		 * The meta object literal for the '<em><b>Failure Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__FAILURE_MODELS = eINSTANCE.getSystem_FailureModels();

		/**
		 * The meta object literal for the '{@link architecture.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.FunctionImpl
		 * @see architecture.impl.Architecture_PackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__SIGNALS = eINSTANCE.getFunction_Signals();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PORTS = eINSTANCE.getFunction_Ports();

		/**
		 * The meta object literal for the '<em><b>Perf Chars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PERF_CHARS = eINSTANCE.getFunction_PerfChars();

		/**
		 * The meta object literal for the '<em><b>Sub Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__SUB_FUNCTIONS = eINSTANCE.getFunction_SubFunctions();

		/**
		 * The meta object literal for the '<em><b>As Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__AS_ASSET = eINSTANCE.getFunction_AsAsset();

		/**
		 * The meta object literal for the '<em><b>Dependability Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DEPENDABILITY_REQUIREMENTS = eINSTANCE.getFunction_DependabilityRequirements();

		/**
		 * The meta object literal for the '<em><b>Assurance Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__ASSURANCE_LEVEL = eINSTANCE.getFunction_AssuranceLevel();

		/**
		 * The meta object literal for the '<em><b>Failure Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FAILURE_MODELS = eINSTANCE.getFunction_FailureModels();

		/**
		 * The meta object literal for the '<em><b>Malfunctions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__MALFUNCTIONS = eINSTANCE.getFunction_Malfunctions();

		/**
		 * The meta object literal for the '{@link architecture.impl.SafetyFunctionImpl <em>Safety Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.SafetyFunctionImpl
		 * @see architecture.impl.Architecture_PackageImpl#getSafetyFunction()
		 * @generated
		 */
		EClass SAFETY_FUNCTION = eINSTANCE.getSafetyFunction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_FUNCTION__OBJECT = eINSTANCE.getSafetyFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_FUNCTION__BEHAVIOR = eINSTANCE.getSafetyFunction_Behavior();

		/**
		 * The meta object literal for the '<em><b>Safe State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_FUNCTION__SAFE_STATE = eINSTANCE.getSafetyFunction_SafeState();

		/**
		 * The meta object literal for the '{@link architecture.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.PortImpl
		 * @see architecture.impl.Architecture_PackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Flow Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__FLOW_TYPE = eINSTANCE.getPort_FlowType();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DIRECTION = eINSTANCE.getPort_Direction();

		/**
		 * The meta object literal for the '<em><b>Interface Failures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__INTERFACE_FAILURES = eINSTANCE.getPort_InterfaceFailures();

		/**
		 * The meta object literal for the '<em><b>Refined Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__REFINED_PORTS = eINSTANCE.getPort_RefinedPorts();

		/**
		 * The meta object literal for the '<em><b>Assurance Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ASSURANCE_LEVEL = eINSTANCE.getPort_AssuranceLevel();

		/**
		 * The meta object literal for the '<em><b>Dependability Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__DEPENDABILITY_REQUIREMENTS = eINSTANCE.getPort_DependabilityRequirements();

		/**
		 * The meta object literal for the '{@link architecture.impl.PerfCharsImpl <em>Perf Chars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.PerfCharsImpl
		 * @see architecture.impl.Architecture_PackageImpl#getPerfChars()
		 * @generated
		 */
		EClass PERF_CHARS = eINSTANCE.getPerfChars();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_CHARS__RESPONSE_TIME = eINSTANCE.getPerfChars_ResponseTime();

		/**
		 * The meta object literal for the '{@link architecture.impl.SystemBoundaryImpl <em>System Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.SystemBoundaryImpl
		 * @see architecture.impl.Architecture_PackageImpl#getSystemBoundary()
		 * @generated
		 */
		EClass SYSTEM_BOUNDARY = eINSTANCE.getSystemBoundary();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BOUNDARY__PORTS = eINSTANCE.getSystemBoundary_Ports();

		/**
		 * The meta object literal for the '{@link architecture.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.ContextImpl
		 * @see architecture.impl.Architecture_PackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Usage History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__USAGE_HISTORY = eINSTANCE.getContext_UsageHistory();

		/**
		 * The meta object literal for the '<em><b>Mission Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__MISSION_TIME = eINSTANCE.getContext_MissionTime();

		/**
		 * The meta object literal for the '<em><b>Mission Time Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__MISSION_TIME_TIME_UNIT = eINSTANCE.getContext_MissionTimeTimeUnit();

		/**
		 * The meta object literal for the '{@link architecture.impl.PhysicalComponentImpl <em>Physical Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.PhysicalComponentImpl
		 * @see architecture.impl.Architecture_PackageImpl#getPhysicalComponent()
		 * @generated
		 */
		EClass PHYSICAL_COMPONENT = eINSTANCE.getPhysicalComponent();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_COMPONENT__DIMENSIONS = eINSTANCE.getPhysicalComponent_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Price Per Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_COMPONENT__PRICE_PER_UNIT = eINSTANCE.getPhysicalComponent_PricePerUnit();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_COMPONENT__MASS = eINSTANCE.getPhysicalComponent_Mass();

		/**
		 * The meta object literal for the '<em><b>Protection Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_COMPONENT__PROTECTION_CATEGORY = eINSTANCE.getPhysicalComponent_ProtectionCategory();

		/**
		 * The meta object literal for the '<em><b>Useful Lifetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_COMPONENT__USEFUL_LIFETIME = eINSTANCE.getPhysicalComponent_UsefulLifetime();

		/**
		 * The meta object literal for the '<em><b>Useful Lifetime Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_COMPONENT__USEFUL_LIFETIME_TIME_UNIT = eINSTANCE.getPhysicalComponent_UsefulLifetimeTimeUnit();

		/**
		 * The meta object literal for the '<em><b>Lifecycle Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__LIFECYCLE_CONDITIONS = eINSTANCE.getPhysicalComponent_LifecycleConditions();

		/**
		 * The meta object literal for the '<em><b>Logical Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__LOGICAL_COMPONENTS = eINSTANCE.getPhysicalComponent_LogicalComponents();

		/**
		 * The meta object literal for the '<em><b>Maintenance Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPONENT__MAINTENANCE_PROCEDURE = eINSTANCE.getPhysicalComponent_MaintenanceProcedure();

		/**
		 * The meta object literal for the '{@link architecture.impl.LogicalComponentImpl <em>Logical Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.LogicalComponentImpl
		 * @see architecture.impl.Architecture_PackageImpl#getLogicalComponent()
		 * @generated
		 */
		EClass LOGICAL_COMPONENT = eINSTANCE.getLogicalComponent();

		/**
		 * The meta object literal for the '{@link architecture.impl.LifecycleConditionImpl <em>Lifecycle Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.LifecycleConditionImpl
		 * @see architecture.impl.Architecture_PackageImpl#getLifecycleCondition()
		 * @generated
		 */
		EClass LIFECYCLE_CONDITION = eINSTANCE.getLifecycleCondition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE_CONDITION__VALUE = eINSTANCE.getLifecycleCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFECYCLE_CONDITION__CONDITIONS = eINSTANCE.getLifecycleCondition_Conditions();

		/**
		 * The meta object literal for the '{@link architecture.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.SignalImpl
		 * @see architecture.impl.Architecture_PackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>From Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__FROM_PORT = eINSTANCE.getSignal_FromPort();

		/**
		 * The meta object literal for the '<em><b>To Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__TO_PORT = eINSTANCE.getSignal_ToPort();

		/**
		 * The meta object literal for the '{@link architecture.impl.SafetyRelatedSystemImpl <em>Safety Related System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.SafetyRelatedSystemImpl
		 * @see architecture.impl.Architecture_PackageImpl#getSafetyRelatedSystem()
		 * @generated
		 */
		EClass SAFETY_RELATED_SYSTEM = eINSTANCE.getSafetyRelatedSystem();

		/**
		 * The meta object literal for the '<em><b>Safe State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_RELATED_SYSTEM__SAFE_STATE = eINSTANCE.getSafetyRelatedSystem_SafeState();

		/**
		 * The meta object literal for the '{@link architecture.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.impl.ConfigurationImpl
		 * @see architecture.impl.Architecture_PackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Sub Systems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__SUB_SYSTEMS = eINSTANCE.getConfiguration_SubSystems();

		/**
		 * The meta object literal for the '{@link architecture.PortDirection <em>Port Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecture.PortDirection
		 * @see architecture.impl.Architecture_PackageImpl#getPortDirection()
		 * @generated
		 */
		EEnum PORT_DIRECTION = eINSTANCE.getPortDirection();

	}

} //Architecture_Package
