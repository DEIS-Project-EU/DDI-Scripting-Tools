/**
 */
package top.failureLogic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import top.integration.IntegrationPackage;

import top.odeBase.OdeBasePackage;

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
 * @see top.failureLogic.FailureLogic_Factory
 * @model kind="package"
 * @generated
 */
public interface FailureLogic_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "failureLogic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.deis-project.eu/ode/mergedODE/failureLogic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "failureLogic_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailureLogic_Package eINSTANCE = top.failureLogic.impl.FailureLogic_PackageImpl.init();

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.FailureLogicPackageImpl <em>Failure Logic Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.FailureLogicPackageImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFailureLogicPackage()
	 * @generated
	 */
	int FAILURE_LOGIC_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_LOGIC_PACKAGE__KEY_VALUE_MAPS = IntegrationPackage.ODE_PRODUCT_PACKAGE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_LOGIC_PACKAGE__ID = IntegrationPackage.ODE_PRODUCT_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_LOGIC_PACKAGE__NAME = IntegrationPackage.ODE_PRODUCT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_LOGIC_PACKAGE__DESCRIPTION = IntegrationPackage.ODE_PRODUCT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Failure Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_LOGIC_PACKAGE__FAILURE_MODELS = IntegrationPackage.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Logic Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_LOGIC_PACKAGE_FEATURE_COUNT = IntegrationPackage.ODE_PRODUCT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Failure Logic Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_LOGIC_PACKAGE_OPERATION_COUNT = IntegrationPackage.ODE_PRODUCT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.FailureImpl <em>Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.FailureImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFailure()
	 * @generated
	 */
	int FAILURE = 1;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origin Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__ORIGIN_TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__FAILURE_CLASS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__FAILURE_RATE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Ccf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__IS_CCF = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Failure Prob Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__FAILURE_PROB_DISTRIBUTION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ccf Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE__CCF_FAILURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.SecurityViolationImpl <em>Security Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.SecurityViolationImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getSecurityViolation()
	 * @generated
	 */
	int SECURITY_VIOLATION = 2;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__KEY_VALUE_MAPS = FAILURE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__ID = FAILURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__NAME = FAILURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__DESCRIPTION = FAILURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origin Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__ORIGIN_TYPE = FAILURE__ORIGIN_TYPE;

	/**
	 * The feature id for the '<em><b>Failure Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__FAILURE_CLASS = FAILURE__FAILURE_CLASS;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__FAILURE_RATE = FAILURE__FAILURE_RATE;

	/**
	 * The feature id for the '<em><b>Is Ccf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__IS_CCF = FAILURE__IS_CCF;

	/**
	 * The feature id for the '<em><b>Failure Prob Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__FAILURE_PROB_DISTRIBUTION = FAILURE__FAILURE_PROB_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Ccf Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION__CCF_FAILURES = FAILURE__CCF_FAILURES;

	/**
	 * The number of structural features of the '<em>Security Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION_FEATURE_COUNT = FAILURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_VIOLATION_OPERATION_COUNT = FAILURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.FailureModelImpl <em>Failure Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.FailureModelImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFailureModel()
	 * @generated
	 */
	int FAILURE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Minimal Cutsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL__MINIMAL_CUTSETS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL__FAILURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL__SUB_MODELS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Failure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Failure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_MODEL_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.MinimalCutSetsImpl <em>Minimal Cut Sets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.MinimalCutSetsImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getMinimalCutSets()
	 * @generated
	 */
	int MINIMAL_CUT_SETS = 4;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUT_SETS__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUT_SETS__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUT_SETS__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUT_SETS__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cutsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUT_SETS__CUTSETS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUT_SETS__FAILURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Minimal Cut Sets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUT_SETS_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Minimal Cut Sets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUT_SETS_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.MinimalCutsetImpl <em>Minimal Cutset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.MinimalCutsetImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getMinimalCutset()
	 * @generated
	 */
	int MINIMAL_CUTSET = 5;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUTSET__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUTSET__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUTSET__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUTSET__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUTSET__FAILURES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minimal Cutset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUTSET_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Minimal Cutset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_CUTSET_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.ProbDistImpl <em>Prob Dist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.ProbDistImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getProbDist()
	 * @generated
	 */
	int PROB_DIST = 6;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST__TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST__PARAMETERS = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prob Dist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Prob Dist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.ProbDistParamImpl <em>Prob Dist Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.ProbDistParamImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getProbDistParam()
	 * @generated
	 */
	int PROB_DIST_PARAM = 7;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST_PARAM__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST_PARAM__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST_PARAM__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST_PARAM__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST_PARAM__VALUE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prob Dist Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST_PARAM_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Prob Dist Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_DIST_PARAM_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.FaultTreeImpl <em>Fault Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.FaultTreeImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFaultTree()
	 * @generated
	 */
	int FAULT_TREE = 8;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__KEY_VALUE_MAPS = FAILURE_MODEL__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__ID = FAILURE_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__NAME = FAILURE_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__DESCRIPTION = FAILURE_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Minimal Cutsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__MINIMAL_CUTSETS = FAILURE_MODEL__MINIMAL_CUTSETS;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__FAILURES = FAILURE_MODEL__FAILURES;

	/**
	 * The feature id for the '<em><b>Sub Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__SUB_MODELS = FAILURE_MODEL__SUB_MODELS;

	/**
	 * The feature id for the '<em><b>Causes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE__CAUSES = FAILURE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fault Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_FEATURE_COUNT = FAILURE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fault Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_TREE_OPERATION_COUNT = FAILURE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.CauseImpl <em>Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.CauseImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getCause()
	 * @generated
	 */
	int CAUSE = 9;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cause Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__CAUSE_TYPE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__FAILURE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.GateImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getGate()
	 * @generated
	 */
	int GATE = 10;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__KEY_VALUE_MAPS = CAUSE__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ID = CAUSE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = CAUSE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__DESCRIPTION = CAUSE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cause Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CAUSE_TYPE = CAUSE__CAUSE_TYPE;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__FAILURE = CAUSE__FAILURE;

	/**
	 * The feature id for the '<em><b>Gate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__GATE_TYPE = CAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Causes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CAUSES = CAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = CAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = CAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.MarkovChainImpl <em>Markov Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.MarkovChainImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getMarkovChain()
	 * @generated
	 */
	int MARKOV_CHAIN = 11;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN__KEY_VALUE_MAPS = FAILURE_MODEL__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN__ID = FAILURE_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN__NAME = FAILURE_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN__DESCRIPTION = FAILURE_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Minimal Cutsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN__MINIMAL_CUTSETS = FAILURE_MODEL__MINIMAL_CUTSETS;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN__FAILURES = FAILURE_MODEL__FAILURES;

	/**
	 * The feature id for the '<em><b>Sub Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN__SUB_MODELS = FAILURE_MODEL__SUB_MODELS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN__TRANSITIONS = FAILURE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN__STATES = FAILURE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Markov Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN_FEATURE_COUNT = FAILURE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Markov Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKOV_CHAIN_OPERATION_COUNT = FAILURE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.StateImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getState()
	 * @generated
	 */
	int STATE = 12;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_INITIAL_STATE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Fail State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_FAIL_STATE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fail State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FAIL_STATE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.TransitionImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition Prob Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_PROB_DISTRIBUTION = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM_STATES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO_STATES = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.FMEAImpl <em>FMEA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.FMEAImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFMEA()
	 * @generated
	 */
	int FMEA = 14;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__KEY_VALUE_MAPS = FAILURE_MODEL__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__ID = FAILURE_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__NAME = FAILURE_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__DESCRIPTION = FAILURE_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Minimal Cutsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__MINIMAL_CUTSETS = FAILURE_MODEL__MINIMAL_CUTSETS;

	/**
	 * The feature id for the '<em><b>Failures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__FAILURES = FAILURE_MODEL__FAILURES;

	/**
	 * The feature id for the '<em><b>Sub Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__SUB_MODELS = FAILURE_MODEL__SUB_MODELS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__TYPE = FAILURE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__ENTRIES = FAILURE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FMEA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_FEATURE_COUNT = FAILURE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FMEA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_OPERATION_COUNT = FAILURE_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.FMEAEntryImpl <em>FMEA Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.FMEAEntryImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFMEAEntry()
	 * @generated
	 */
	int FMEA_ENTRY = 15;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ENTRY__KEY_VALUE_MAPS = OdeBasePackage.BASE_ELEMENT__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ENTRY__ID = OdeBasePackage.BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ENTRY__NAME = OdeBasePackage.BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ENTRY__DESCRIPTION = OdeBasePackage.BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ENTRY__EFFECT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ENTRY__MODE = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FMEA Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ENTRY_FEATURE_COUNT = OdeBasePackage.BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FMEA Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ENTRY_OPERATION_COUNT = OdeBasePackage.BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.impl.FMEDAEntryImpl <em>FMEDA Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.impl.FMEDAEntryImpl
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFMEDAEntry()
	 * @generated
	 */
	int FMEDA_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Key Value Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY__KEY_VALUE_MAPS = FMEA_ENTRY__KEY_VALUE_MAPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY__ID = FMEA_ENTRY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY__NAME = FMEA_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY__DESCRIPTION = FMEA_ENTRY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY__EFFECT = FMEA_ENTRY__EFFECT;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY__MODE = FMEA_ENTRY__MODE;

	/**
	 * The feature id for the '<em><b>Diagnosis Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY__DIAGNOSIS_RATE = FMEA_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagnosis Prob Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION = FMEA_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FMEDA Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY_FEATURE_COUNT = FMEA_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FMEDA Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEDA_ENTRY_OPERATION_COUNT = FMEA_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.failureLogic.FailureOriginType <em>Failure Origin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.FailureOriginType
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFailureOriginType()
	 * @generated
	 */
	int FAILURE_ORIGIN_TYPE = 17;

	/**
	 * The meta object id for the '{@link top.failureLogic.GateType <em>Gate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.GateType
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getGateType()
	 * @generated
	 */
	int GATE_TYPE = 18;

	/**
	 * The meta object id for the '{@link top.failureLogic.CauseType <em>Cause Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.CauseType
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getCauseType()
	 * @generated
	 */
	int CAUSE_TYPE = 19;

	/**
	 * The meta object id for the '{@link top.failureLogic.FMEAType <em>FMEA Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.failureLogic.FMEAType
	 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFMEAType()
	 * @generated
	 */
	int FMEA_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link top.failureLogic.FailureLogicPackage <em>Failure Logic Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Logic Package</em>'.
	 * @see top.failureLogic.FailureLogicPackage
	 * @generated
	 */
	EClass getFailureLogicPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link top.failureLogic.FailureLogicPackage#getFailureModels <em>Failure Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Models</em>'.
	 * @see top.failureLogic.FailureLogicPackage#getFailureModels()
	 * @see #getFailureLogicPackage()
	 * @generated
	 */
	EReference getFailureLogicPackage_FailureModels();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure</em>'.
	 * @see top.failureLogic.Failure
	 * @generated
	 */
	EClass getFailure();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.Failure#getOriginType <em>Origin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Type</em>'.
	 * @see top.failureLogic.Failure#getOriginType()
	 * @see #getFailure()
	 * @generated
	 */
	EAttribute getFailure_OriginType();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.Failure#getFailureClass <em>Failure Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Class</em>'.
	 * @see top.failureLogic.Failure#getFailureClass()
	 * @see #getFailure()
	 * @generated
	 */
	EAttribute getFailure_FailureClass();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.Failure#getFailureRate <em>Failure Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Rate</em>'.
	 * @see top.failureLogic.Failure#getFailureRate()
	 * @see #getFailure()
	 * @generated
	 */
	EAttribute getFailure_FailureRate();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.Failure#isIsCcf <em>Is Ccf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ccf</em>'.
	 * @see top.failureLogic.Failure#isIsCcf()
	 * @see #getFailure()
	 * @generated
	 */
	EAttribute getFailure_IsCcf();

	/**
	 * Returns the meta object for the containment reference '{@link top.failureLogic.Failure#getFailureProbDistribution <em>Failure Prob Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failure Prob Distribution</em>'.
	 * @see top.failureLogic.Failure#getFailureProbDistribution()
	 * @see #getFailure()
	 * @generated
	 */
	EReference getFailure_FailureProbDistribution();

	/**
	 * Returns the meta object for the reference list '{@link top.failureLogic.Failure#getCcfFailures <em>Ccf Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ccf Failures</em>'.
	 * @see top.failureLogic.Failure#getCcfFailures()
	 * @see #getFailure()
	 * @generated
	 */
	EReference getFailure_CcfFailures();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.SecurityViolation <em>Security Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Violation</em>'.
	 * @see top.failureLogic.SecurityViolation
	 * @generated
	 */
	EClass getSecurityViolation();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.FailureModel <em>Failure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Model</em>'.
	 * @see top.failureLogic.FailureModel
	 * @generated
	 */
	EClass getFailureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link top.failureLogic.FailureModel#getMinimalCutsets <em>Minimal Cutsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minimal Cutsets</em>'.
	 * @see top.failureLogic.FailureModel#getMinimalCutsets()
	 * @see #getFailureModel()
	 * @generated
	 */
	EReference getFailureModel_MinimalCutsets();

	/**
	 * Returns the meta object for the containment reference list '{@link top.failureLogic.FailureModel#getFailures <em>Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failures</em>'.
	 * @see top.failureLogic.FailureModel#getFailures()
	 * @see #getFailureModel()
	 * @generated
	 */
	EReference getFailureModel_Failures();

	/**
	 * Returns the meta object for the reference list '{@link top.failureLogic.FailureModel#getSubModels <em>Sub Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Models</em>'.
	 * @see top.failureLogic.FailureModel#getSubModels()
	 * @see #getFailureModel()
	 * @generated
	 */
	EReference getFailureModel_SubModels();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.MinimalCutSets <em>Minimal Cut Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimal Cut Sets</em>'.
	 * @see top.failureLogic.MinimalCutSets
	 * @generated
	 */
	EClass getMinimalCutSets();

	/**
	 * Returns the meta object for the containment reference list '{@link top.failureLogic.MinimalCutSets#getCutsets <em>Cutsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cutsets</em>'.
	 * @see top.failureLogic.MinimalCutSets#getCutsets()
	 * @see #getMinimalCutSets()
	 * @generated
	 */
	EReference getMinimalCutSets_Cutsets();

	/**
	 * Returns the meta object for the reference list '{@link top.failureLogic.MinimalCutSets#getFailures <em>Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failures</em>'.
	 * @see top.failureLogic.MinimalCutSets#getFailures()
	 * @see #getMinimalCutSets()
	 * @generated
	 */
	EReference getMinimalCutSets_Failures();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.MinimalCutset <em>Minimal Cutset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimal Cutset</em>'.
	 * @see top.failureLogic.MinimalCutset
	 * @generated
	 */
	EClass getMinimalCutset();

	/**
	 * Returns the meta object for the reference list '{@link top.failureLogic.MinimalCutset#getFailures <em>Failures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failures</em>'.
	 * @see top.failureLogic.MinimalCutset#getFailures()
	 * @see #getMinimalCutset()
	 * @generated
	 */
	EReference getMinimalCutset_Failures();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.ProbDist <em>Prob Dist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prob Dist</em>'.
	 * @see top.failureLogic.ProbDist
	 * @generated
	 */
	EClass getProbDist();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.ProbDist#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see top.failureLogic.ProbDist#getType()
	 * @see #getProbDist()
	 * @generated
	 */
	EAttribute getProbDist_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link top.failureLogic.ProbDist#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see top.failureLogic.ProbDist#getParameters()
	 * @see #getProbDist()
	 * @generated
	 */
	EReference getProbDist_Parameters();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.ProbDistParam <em>Prob Dist Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prob Dist Param</em>'.
	 * @see top.failureLogic.ProbDistParam
	 * @generated
	 */
	EClass getProbDistParam();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.ProbDistParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see top.failureLogic.ProbDistParam#getValue()
	 * @see #getProbDistParam()
	 * @generated
	 */
	EAttribute getProbDistParam_Value();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.FaultTree <em>Fault Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Tree</em>'.
	 * @see top.failureLogic.FaultTree
	 * @generated
	 */
	EClass getFaultTree();

	/**
	 * Returns the meta object for the containment reference list '{@link top.failureLogic.FaultTree#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Causes</em>'.
	 * @see top.failureLogic.FaultTree#getCauses()
	 * @see #getFaultTree()
	 * @generated
	 */
	EReference getFaultTree_Causes();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause</em>'.
	 * @see top.failureLogic.Cause
	 * @generated
	 */
	EClass getCause();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.Cause#getCauseType <em>Cause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause Type</em>'.
	 * @see top.failureLogic.Cause#getCauseType()
	 * @see #getCause()
	 * @generated
	 */
	EAttribute getCause_CauseType();

	/**
	 * Returns the meta object for the reference '{@link top.failureLogic.Cause#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure</em>'.
	 * @see top.failureLogic.Cause#getFailure()
	 * @see #getCause()
	 * @generated
	 */
	EReference getCause_Failure();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see top.failureLogic.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.Gate#getGateType <em>Gate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gate Type</em>'.
	 * @see top.failureLogic.Gate#getGateType()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_GateType();

	/**
	 * Returns the meta object for the reference list '{@link top.failureLogic.Gate#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Causes</em>'.
	 * @see top.failureLogic.Gate#getCauses()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Causes();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.MarkovChain <em>Markov Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markov Chain</em>'.
	 * @see top.failureLogic.MarkovChain
	 * @generated
	 */
	EClass getMarkovChain();

	/**
	 * Returns the meta object for the containment reference list '{@link top.failureLogic.MarkovChain#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see top.failureLogic.MarkovChain#getTransitions()
	 * @see #getMarkovChain()
	 * @generated
	 */
	EReference getMarkovChain_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link top.failureLogic.MarkovChain#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see top.failureLogic.MarkovChain#getStates()
	 * @see #getMarkovChain()
	 * @generated
	 */
	EReference getMarkovChain_States();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see top.failureLogic.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.State#isIsInitialState <em>Is Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial State</em>'.
	 * @see top.failureLogic.State#isIsInitialState()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInitialState();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.State#isIsFailState <em>Is Fail State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fail State</em>'.
	 * @see top.failureLogic.State#isIsFailState()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsFailState();

	/**
	 * Returns the meta object for the reference '{@link top.failureLogic.State#getFailState <em>Fail State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fail State</em>'.
	 * @see top.failureLogic.State#getFailState()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_FailState();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see top.failureLogic.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.Transition#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition</em>'.
	 * @see top.failureLogic.Transition#getTransition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Transition();

	/**
	 * Returns the meta object for the containment reference '{@link top.failureLogic.Transition#getTransitionProbDistribution <em>Transition Prob Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Prob Distribution</em>'.
	 * @see top.failureLogic.Transition#getTransitionProbDistribution()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TransitionProbDistribution();

	/**
	 * Returns the meta object for the reference list '{@link top.failureLogic.Transition#getFromStates <em>From States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From States</em>'.
	 * @see top.failureLogic.Transition#getFromStates()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_FromStates();

	/**
	 * Returns the meta object for the reference list '{@link top.failureLogic.Transition#getToStates <em>To States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To States</em>'.
	 * @see top.failureLogic.Transition#getToStates()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ToStates();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.FMEA <em>FMEA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEA</em>'.
	 * @see top.failureLogic.FMEA
	 * @generated
	 */
	EClass getFMEA();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.FMEA#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see top.failureLogic.FMEA#getType()
	 * @see #getFMEA()
	 * @generated
	 */
	EAttribute getFMEA_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link top.failureLogic.FMEA#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see top.failureLogic.FMEA#getEntries()
	 * @see #getFMEA()
	 * @generated
	 */
	EReference getFMEA_Entries();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.FMEAEntry <em>FMEA Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEA Entry</em>'.
	 * @see top.failureLogic.FMEAEntry
	 * @generated
	 */
	EClass getFMEAEntry();

	/**
	 * Returns the meta object for the reference '{@link top.failureLogic.FMEAEntry#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effect</em>'.
	 * @see top.failureLogic.FMEAEntry#getEffect()
	 * @see #getFMEAEntry()
	 * @generated
	 */
	EReference getFMEAEntry_Effect();

	/**
	 * Returns the meta object for the reference '{@link top.failureLogic.FMEAEntry#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see top.failureLogic.FMEAEntry#getMode()
	 * @see #getFMEAEntry()
	 * @generated
	 */
	EReference getFMEAEntry_Mode();

	/**
	 * Returns the meta object for class '{@link top.failureLogic.FMEDAEntry <em>FMEDA Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEDA Entry</em>'.
	 * @see top.failureLogic.FMEDAEntry
	 * @generated
	 */
	EClass getFMEDAEntry();

	/**
	 * Returns the meta object for the attribute '{@link top.failureLogic.FMEDAEntry#getDiagnosisRate <em>Diagnosis Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnosis Rate</em>'.
	 * @see top.failureLogic.FMEDAEntry#getDiagnosisRate()
	 * @see #getFMEDAEntry()
	 * @generated
	 */
	EAttribute getFMEDAEntry_DiagnosisRate();

	/**
	 * Returns the meta object for the containment reference '{@link top.failureLogic.FMEDAEntry#getDiagnosisProbDistribution <em>Diagnosis Prob Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagnosis Prob Distribution</em>'.
	 * @see top.failureLogic.FMEDAEntry#getDiagnosisProbDistribution()
	 * @see #getFMEDAEntry()
	 * @generated
	 */
	EReference getFMEDAEntry_DiagnosisProbDistribution();

	/**
	 * Returns the meta object for enum '{@link top.failureLogic.FailureOriginType <em>Failure Origin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failure Origin Type</em>'.
	 * @see top.failureLogic.FailureOriginType
	 * @generated
	 */
	EEnum getFailureOriginType();

	/**
	 * Returns the meta object for enum '{@link top.failureLogic.GateType <em>Gate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gate Type</em>'.
	 * @see top.failureLogic.GateType
	 * @generated
	 */
	EEnum getGateType();

	/**
	 * Returns the meta object for enum '{@link top.failureLogic.CauseType <em>Cause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cause Type</em>'.
	 * @see top.failureLogic.CauseType
	 * @generated
	 */
	EEnum getCauseType();

	/**
	 * Returns the meta object for enum '{@link top.failureLogic.FMEAType <em>FMEA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FMEA Type</em>'.
	 * @see top.failureLogic.FMEAType
	 * @generated
	 */
	EEnum getFMEAType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FailureLogic_Factory getFailureLogic_Factory();

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
		 * The meta object literal for the '{@link top.failureLogic.impl.FailureLogicPackageImpl <em>Failure Logic Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.FailureLogicPackageImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFailureLogicPackage()
		 * @generated
		 */
		EClass FAILURE_LOGIC_PACKAGE = eINSTANCE.getFailureLogicPackage();

		/**
		 * The meta object literal for the '<em><b>Failure Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_LOGIC_PACKAGE__FAILURE_MODELS = eINSTANCE.getFailureLogicPackage_FailureModels();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.FailureImpl <em>Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.FailureImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFailure()
		 * @generated
		 */
		EClass FAILURE = eINSTANCE.getFailure();

		/**
		 * The meta object literal for the '<em><b>Origin Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE__ORIGIN_TYPE = eINSTANCE.getFailure_OriginType();

		/**
		 * The meta object literal for the '<em><b>Failure Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE__FAILURE_CLASS = eINSTANCE.getFailure_FailureClass();

		/**
		 * The meta object literal for the '<em><b>Failure Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE__FAILURE_RATE = eINSTANCE.getFailure_FailureRate();

		/**
		 * The meta object literal for the '<em><b>Is Ccf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE__IS_CCF = eINSTANCE.getFailure_IsCcf();

		/**
		 * The meta object literal for the '<em><b>Failure Prob Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE__FAILURE_PROB_DISTRIBUTION = eINSTANCE.getFailure_FailureProbDistribution();

		/**
		 * The meta object literal for the '<em><b>Ccf Failures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE__CCF_FAILURES = eINSTANCE.getFailure_CcfFailures();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.SecurityViolationImpl <em>Security Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.SecurityViolationImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getSecurityViolation()
		 * @generated
		 */
		EClass SECURITY_VIOLATION = eINSTANCE.getSecurityViolation();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.FailureModelImpl <em>Failure Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.FailureModelImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFailureModel()
		 * @generated
		 */
		EClass FAILURE_MODEL = eINSTANCE.getFailureModel();

		/**
		 * The meta object literal for the '<em><b>Minimal Cutsets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODEL__MINIMAL_CUTSETS = eINSTANCE.getFailureModel_MinimalCutsets();

		/**
		 * The meta object literal for the '<em><b>Failures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODEL__FAILURES = eINSTANCE.getFailureModel_Failures();

		/**
		 * The meta object literal for the '<em><b>Sub Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_MODEL__SUB_MODELS = eINSTANCE.getFailureModel_SubModels();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.MinimalCutSetsImpl <em>Minimal Cut Sets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.MinimalCutSetsImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getMinimalCutSets()
		 * @generated
		 */
		EClass MINIMAL_CUT_SETS = eINSTANCE.getMinimalCutSets();

		/**
		 * The meta object literal for the '<em><b>Cutsets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINIMAL_CUT_SETS__CUTSETS = eINSTANCE.getMinimalCutSets_Cutsets();

		/**
		 * The meta object literal for the '<em><b>Failures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINIMAL_CUT_SETS__FAILURES = eINSTANCE.getMinimalCutSets_Failures();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.MinimalCutsetImpl <em>Minimal Cutset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.MinimalCutsetImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getMinimalCutset()
		 * @generated
		 */
		EClass MINIMAL_CUTSET = eINSTANCE.getMinimalCutset();

		/**
		 * The meta object literal for the '<em><b>Failures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINIMAL_CUTSET__FAILURES = eINSTANCE.getMinimalCutset_Failures();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.ProbDistImpl <em>Prob Dist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.ProbDistImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getProbDist()
		 * @generated
		 */
		EClass PROB_DIST = eINSTANCE.getProbDist();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROB_DIST__TYPE = eINSTANCE.getProbDist_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROB_DIST__PARAMETERS = eINSTANCE.getProbDist_Parameters();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.ProbDistParamImpl <em>Prob Dist Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.ProbDistParamImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getProbDistParam()
		 * @generated
		 */
		EClass PROB_DIST_PARAM = eINSTANCE.getProbDistParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROB_DIST_PARAM__VALUE = eINSTANCE.getProbDistParam_Value();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.FaultTreeImpl <em>Fault Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.FaultTreeImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFaultTree()
		 * @generated
		 */
		EClass FAULT_TREE = eINSTANCE.getFaultTree();

		/**
		 * The meta object literal for the '<em><b>Causes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_TREE__CAUSES = eINSTANCE.getFaultTree_Causes();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.CauseImpl <em>Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.CauseImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getCause()
		 * @generated
		 */
		EClass CAUSE = eINSTANCE.getCause();

		/**
		 * The meta object literal for the '<em><b>Cause Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAUSE__CAUSE_TYPE = eINSTANCE.getCause_CauseType();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAUSE__FAILURE = eINSTANCE.getCause_Failure();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.GateImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Gate Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__GATE_TYPE = eINSTANCE.getGate_GateType();

		/**
		 * The meta object literal for the '<em><b>Causes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__CAUSES = eINSTANCE.getGate_Causes();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.MarkovChainImpl <em>Markov Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.MarkovChainImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getMarkovChain()
		 * @generated
		 */
		EClass MARKOV_CHAIN = eINSTANCE.getMarkovChain();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKOV_CHAIN__TRANSITIONS = eINSTANCE.getMarkovChain_Transitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKOV_CHAIN__STATES = eINSTANCE.getMarkovChain_States();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.StateImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Is Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_INITIAL_STATE = eINSTANCE.getState_IsInitialState();

		/**
		 * The meta object literal for the '<em><b>Is Fail State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_FAIL_STATE = eINSTANCE.getState_IsFailState();

		/**
		 * The meta object literal for the '<em><b>Fail State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FAIL_STATE = eINSTANCE.getState_FailState();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.TransitionImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRANSITION = eINSTANCE.getTransition_Transition();

		/**
		 * The meta object literal for the '<em><b>Transition Prob Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITION_PROB_DISTRIBUTION = eINSTANCE.getTransition_TransitionProbDistribution();

		/**
		 * The meta object literal for the '<em><b>From States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM_STATES = eINSTANCE.getTransition_FromStates();

		/**
		 * The meta object literal for the '<em><b>To States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO_STATES = eINSTANCE.getTransition_ToStates();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.FMEAImpl <em>FMEA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.FMEAImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFMEA()
		 * @generated
		 */
		EClass FMEA = eINSTANCE.getFMEA();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA__TYPE = eINSTANCE.getFMEA_Type();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA__ENTRIES = eINSTANCE.getFMEA_Entries();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.FMEAEntryImpl <em>FMEA Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.FMEAEntryImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFMEAEntry()
		 * @generated
		 */
		EClass FMEA_ENTRY = eINSTANCE.getFMEAEntry();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA_ENTRY__EFFECT = eINSTANCE.getFMEAEntry_Effect();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA_ENTRY__MODE = eINSTANCE.getFMEAEntry_Mode();

		/**
		 * The meta object literal for the '{@link top.failureLogic.impl.FMEDAEntryImpl <em>FMEDA Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.impl.FMEDAEntryImpl
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFMEDAEntry()
		 * @generated
		 */
		EClass FMEDA_ENTRY = eINSTANCE.getFMEDAEntry();

		/**
		 * The meta object literal for the '<em><b>Diagnosis Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEDA_ENTRY__DIAGNOSIS_RATE = eINSTANCE.getFMEDAEntry_DiagnosisRate();

		/**
		 * The meta object literal for the '<em><b>Diagnosis Prob Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEDA_ENTRY__DIAGNOSIS_PROB_DISTRIBUTION = eINSTANCE.getFMEDAEntry_DiagnosisProbDistribution();

		/**
		 * The meta object literal for the '{@link top.failureLogic.FailureOriginType <em>Failure Origin Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.FailureOriginType
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFailureOriginType()
		 * @generated
		 */
		EEnum FAILURE_ORIGIN_TYPE = eINSTANCE.getFailureOriginType();

		/**
		 * The meta object literal for the '{@link top.failureLogic.GateType <em>Gate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.GateType
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getGateType()
		 * @generated
		 */
		EEnum GATE_TYPE = eINSTANCE.getGateType();

		/**
		 * The meta object literal for the '{@link top.failureLogic.CauseType <em>Cause Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.CauseType
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getCauseType()
		 * @generated
		 */
		EEnum CAUSE_TYPE = eINSTANCE.getCauseType();

		/**
		 * The meta object literal for the '{@link top.failureLogic.FMEAType <em>FMEA Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.failureLogic.FMEAType
		 * @see top.failureLogic.impl.FailureLogic_PackageImpl#getFMEAType()
		 * @generated
		 */
		EEnum FMEA_TYPE = eINSTANCE.getFMEAType();

	}

} //FailureLogic_Package
