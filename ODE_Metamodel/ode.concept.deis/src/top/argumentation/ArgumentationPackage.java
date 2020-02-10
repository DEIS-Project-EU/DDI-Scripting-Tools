/**
 */
package top.argumentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import top.base.BasePackage;

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
 * @see top.argumentation.ArgumentationFactory
 * @model kind="package"
 * @generated
 */
public interface ArgumentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "argumentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.deis-project.eu/ode/mergedODE/sacm/argumentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "argumentation_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArgumentationPackage eINSTANCE = top.argumentation.impl.ArgumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link top.argumentation.impl.ArgumentationElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.ArgumentationElementImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentationElement()
	 * @generated
	 */
	int ARGUMENTATION_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__GID = BasePackage.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__IS_CITATION = BasePackage.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__IS_ABSTRACT = BasePackage.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__CITED_ELEMENT = BasePackage.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__ABSTRACT_FORM = BasePackage.ARTIFACT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__NAME = BasePackage.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__DESCRIPTION = BasePackage.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__IMPLEMENTATION_CONSTRAINT = BasePackage.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__NOTE = BasePackage.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__TAGGED_VALUE = BasePackage.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__UNINSTANTIATED = BasePackage.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT_FEATURE_COUNT = BasePackage.ARTIFACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT_OPERATION_COUNT = BasePackage.ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.ArgumentGroupImpl <em>Argument Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.ArgumentGroupImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentGroup()
	 * @generated
	 */
	int ARGUMENT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__GID = ARGUMENTATION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__IS_CITATION = ARGUMENTATION_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__IS_ABSTRACT = ARGUMENTATION_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__CITED_ELEMENT = ARGUMENTATION_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__ABSTRACT_FORM = ARGUMENTATION_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__NAME = ARGUMENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__DESCRIPTION = ARGUMENTATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__IMPLEMENTATION_CONSTRAINT = ARGUMENTATION_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__NOTE = ARGUMENTATION_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__TAGGED_VALUE = ARGUMENTATION_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__UNINSTANTIATED = ARGUMENTATION_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP__ARGUMENTATION_ELEMENT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP_FEATURE_COUNT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argument Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_GROUP_OPERATION_COUNT = ARGUMENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.ArgumentPackageImpl <em>Argument Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.ArgumentPackageImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentPackage()
	 * @generated
	 */
	int ARGUMENT_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__GID = ARGUMENTATION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__IS_CITATION = ARGUMENTATION_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__IS_ABSTRACT = ARGUMENTATION_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__CITED_ELEMENT = ARGUMENTATION_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__ABSTRACT_FORM = ARGUMENTATION_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__NAME = ARGUMENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__DESCRIPTION = ARGUMENTATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__IMPLEMENTATION_CONSTRAINT = ARGUMENTATION_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__NOTE = ARGUMENTATION_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__TAGGED_VALUE = ARGUMENTATION_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__UNINSTANTIATED = ARGUMENTATION_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_FEATURE_COUNT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argument Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_OPERATION_COUNT = ARGUMENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.ArgumentPackageInterfaceImpl <em>Argument Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.ArgumentPackageInterfaceImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentPackageInterface()
	 * @generated
	 */
	int ARGUMENT_PACKAGE_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__GID = ARGUMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__IS_CITATION = ARGUMENT_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__IS_ABSTRACT = ARGUMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__CITED_ELEMENT = ARGUMENT_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__ABSTRACT_FORM = ARGUMENT_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__NAME = ARGUMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__DESCRIPTION = ARGUMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTATION_CONSTRAINT = ARGUMENT_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__NOTE = ARGUMENT_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__TAGGED_VALUE = ARGUMENT_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__UNINSTANTIATED = ARGUMENT_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__ARGUMENTATION_ELEMENT = ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS = ARGUMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE_FEATURE_COUNT = ARGUMENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argument Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_INTERFACE_OPERATION_COUNT = ARGUMENT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.ArgumentPackageBindingImpl <em>Argument Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.ArgumentPackageBindingImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentPackageBinding()
	 * @generated
	 */
	int ARGUMENT_PACKAGE_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__GID = ARGUMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__IS_CITATION = ARGUMENT_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__IS_ABSTRACT = ARGUMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__CITED_ELEMENT = ARGUMENT_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__ABSTRACT_FORM = ARGUMENT_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__NAME = ARGUMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__DESCRIPTION = ARGUMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT = ARGUMENT_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__NOTE = ARGUMENT_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__TAGGED_VALUE = ARGUMENT_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__UNINSTANTIATED = ARGUMENT_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__ARGUMENTATION_ELEMENT = ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = ARGUMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING_FEATURE_COUNT = ARGUMENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argument Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_PACKAGE_BINDING_OPERATION_COUNT = ARGUMENT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.ArgumentAssetImpl <em>Argument Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.ArgumentAssetImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentAsset()
	 * @generated
	 */
	int ARGUMENT_ASSET = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__GID = ARGUMENTATION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__IS_CITATION = ARGUMENTATION_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__IS_ABSTRACT = ARGUMENTATION_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__CITED_ELEMENT = ARGUMENTATION_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__ABSTRACT_FORM = ARGUMENTATION_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__NAME = ARGUMENTATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__DESCRIPTION = ARGUMENTATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT = ARGUMENTATION_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__NOTE = ARGUMENTATION_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__TAGGED_VALUE = ARGUMENTATION_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__UNINSTANTIATED = ARGUMENTATION_ELEMENT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET__CONTENT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_FEATURE_COUNT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argument Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ASSET_OPERATION_COUNT = ARGUMENTATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.AssertionImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__GID = ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__IS_CITATION = ARGUMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__IS_ABSTRACT = ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__CITED_ELEMENT = ARGUMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ABSTRACT_FORM = ARGUMENT_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__NAME = ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__DESCRIPTION = ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__IMPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__NOTE = ARGUMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__TAGGED_VALUE = ARGUMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__UNINSTANTIATED = ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__CONTENT = ARGUMENT_ASSET__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ASSERTION_DECLARATION = ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__META_CLAIM = ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = ARGUMENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = ARGUMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.ArgumentReasoningImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentReasoning()
	 * @generated
	 */
	int ARGUMENT_REASONING = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__GID = ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__IS_CITATION = ARGUMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__IS_ABSTRACT = ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__CITED_ELEMENT = ARGUMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__ABSTRACT_FORM = ARGUMENT_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__NAME = ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__DESCRIPTION = ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__IMPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__NOTE = ARGUMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__TAGGED_VALUE = ARGUMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__UNINSTANTIATED = ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__CONTENT = ARGUMENT_ASSET__CONTENT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__STRUCTURE = ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argument Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING_FEATURE_COUNT = ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argument Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING_OPERATION_COUNT = ARGUMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.ClaimImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__GID = ASSERTION__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__IS_CITATION = ASSERTION__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__IS_ABSTRACT = ASSERTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CITED_ELEMENT = ASSERTION__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__ABSTRACT_FORM = ASSERTION__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__NAME = ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__DESCRIPTION = ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__IMPLEMENTATION_CONSTRAINT = ASSERTION__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__NOTE = ASSERTION__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__TAGGED_VALUE = ASSERTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__UNINSTANTIATED = ASSERTION__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CONTENT = ASSERTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__ASSERTION_DECLARATION = ASSERTION__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__META_CLAIM = ASSERTION__META_CLAIM;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.AssertedRelationshipImpl <em>Asserted Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.AssertedRelationshipImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedRelationship()
	 * @generated
	 */
	int ASSERTED_RELATIONSHIP = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__GID = ASSERTION__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__IS_CITATION = ASSERTION__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__IS_ABSTRACT = ASSERTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__CITED_ELEMENT = ASSERTION__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__ABSTRACT_FORM = ASSERTION__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__NAME = ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__DESCRIPTION = ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT = ASSERTION__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__NOTE = ASSERTION__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__TAGGED_VALUE = ASSERTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__UNINSTANTIATED = ASSERTION__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__CONTENT = ASSERTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__ASSERTION_DECLARATION = ASSERTION__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__META_CLAIM = ASSERTION__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__IS_COUNTER = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__SOURCE = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__TARGET = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__REASONING = ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__REQUIES = ASSERTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Asserted Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Asserted Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP_OPERATION_COUNT = ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.ArtifactReferenceImpl <em>Artifact Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.ArtifactReferenceImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getArtifactReference()
	 * @generated
	 */
	int ARTIFACT_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__GID = ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__IS_CITATION = ARGUMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__IS_ABSTRACT = ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__CITED_ELEMENT = ARGUMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__ABSTRACT_FORM = ARGUMENT_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__NAME = ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__DESCRIPTION = ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT = ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__NOTE = ARGUMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__TAGGED_VALUE = ARGUMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__UNINSTANTIATED = ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__CONTENT = ARGUMENT_ASSET__CONTENT;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT = ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE_FEATURE_COUNT = ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Artifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCE_OPERATION_COUNT = ARGUMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.AssertedArtifactSupportImpl <em>Asserted Artifact Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.AssertedArtifactSupportImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedArtifactSupport()
	 * @generated
	 */
	int ASSERTED_ARTIFACT_SUPPORT = 11;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__IS_CITATION = ASSERTED_RELATIONSHIP__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__CITED_ELEMENT = ASSERTED_RELATIONSHIP__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__ABSTRACT_FORM = ASSERTED_RELATIONSHIP__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__IMPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__NOTE = ASSERTED_RELATIONSHIP__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__ASSERTION_DECLARATION = ASSERTED_RELATIONSHIP__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__META_CLAIM = ASSERTED_RELATIONSHIP__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__IS_COUNTER = ASSERTED_RELATIONSHIP__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__REASONING = ASSERTED_RELATIONSHIP__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT__REQUIES = ASSERTED_RELATIONSHIP__REQUIES;

	/**
	 * The number of structural features of the '<em>Asserted Artifact Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asserted Artifact Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_SUPPORT_OPERATION_COUNT = ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.AssertedInferenceImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedInference()
	 * @generated
	 */
	int ASSERTED_INFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__IS_CITATION = ASSERTED_RELATIONSHIP__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__CITED_ELEMENT = ASSERTED_RELATIONSHIP__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__ABSTRACT_FORM = ASSERTED_RELATIONSHIP__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__IMPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__NOTE = ASSERTED_RELATIONSHIP__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__ASSERTION_DECLARATION = ASSERTED_RELATIONSHIP__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__META_CLAIM = ASSERTED_RELATIONSHIP__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__IS_COUNTER = ASSERTED_RELATIONSHIP__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__REASONING = ASSERTED_RELATIONSHIP__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__REQUIES = ASSERTED_RELATIONSHIP__REQUIES;

	/**
	 * The number of structural features of the '<em>Asserted Inference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asserted Inference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE_OPERATION_COUNT = ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.AssertedEvidenceImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedEvidence()
	 * @generated
	 */
	int ASSERTED_EVIDENCE = 13;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__IS_CITATION = ASSERTED_RELATIONSHIP__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__CITED_ELEMENT = ASSERTED_RELATIONSHIP__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__ABSTRACT_FORM = ASSERTED_RELATIONSHIP__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__IMPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__NOTE = ASSERTED_RELATIONSHIP__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__ASSERTION_DECLARATION = ASSERTED_RELATIONSHIP__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__META_CLAIM = ASSERTED_RELATIONSHIP__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__IS_COUNTER = ASSERTED_RELATIONSHIP__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__REASONING = ASSERTED_RELATIONSHIP__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__REQUIES = ASSERTED_RELATIONSHIP__REQUIES;

	/**
	 * The number of structural features of the '<em>Asserted Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asserted Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE_OPERATION_COUNT = ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.AssertedContextImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedContext()
	 * @generated
	 */
	int ASSERTED_CONTEXT = 14;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__IS_CITATION = ASSERTED_RELATIONSHIP__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__CITED_ELEMENT = ASSERTED_RELATIONSHIP__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__ABSTRACT_FORM = ASSERTED_RELATIONSHIP__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__IMPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__NOTE = ASSERTED_RELATIONSHIP__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__ASSERTION_DECLARATION = ASSERTED_RELATIONSHIP__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__META_CLAIM = ASSERTED_RELATIONSHIP__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__IS_COUNTER = ASSERTED_RELATIONSHIP__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__REASONING = ASSERTED_RELATIONSHIP__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__REQUIES = ASSERTED_RELATIONSHIP__REQUIES;

	/**
	 * The number of structural features of the '<em>Asserted Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asserted Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT_OPERATION_COUNT = ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.impl.AssertedArtifactContextImpl <em>Asserted Artifact Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.impl.AssertedArtifactContextImpl
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedArtifactContext()
	 * @generated
	 */
	int ASSERTED_ARTIFACT_CONTEXT = 15;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__GID = ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__IS_CITATION = ASSERTED_RELATIONSHIP__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__IS_ABSTRACT = ASSERTED_RELATIONSHIP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__CITED_ELEMENT = ASSERTED_RELATIONSHIP__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__ABSTRACT_FORM = ASSERTED_RELATIONSHIP__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__NAME = ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__IMPLEMENTATION_CONSTRAINT = ASSERTED_RELATIONSHIP__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__NOTE = ASSERTED_RELATIONSHIP__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__UNINSTANTIATED = ASSERTED_RELATIONSHIP__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__ASSERTION_DECLARATION = ASSERTED_RELATIONSHIP__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__META_CLAIM = ASSERTED_RELATIONSHIP__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__IS_COUNTER = ASSERTED_RELATIONSHIP__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__REASONING = ASSERTED_RELATIONSHIP__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT__REQUIES = ASSERTED_RELATIONSHIP__REQUIES;

	/**
	 * The number of structural features of the '<em>Asserted Artifact Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asserted Artifact Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_ARTIFACT_CONTEXT_OPERATION_COUNT = ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link top.argumentation.AssertionDeclaration <em>Assertion Declaration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see top.argumentation.AssertionDeclaration
	 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertionDeclaration()
	 * @generated
	 */
	int ASSERTION_DECLARATION = 16;


	/**
	 * Returns the meta object for class '{@link top.argumentation.ArgumentationElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see top.argumentation.ArgumentationElement
	 * @generated
	 */
	EClass getArgumentationElement();

	/**
	 * Returns the meta object for the attribute '{@link top.argumentation.ArgumentationElement#isUninstantiated <em>Uninstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uninstantiated</em>'.
	 * @see top.argumentation.ArgumentationElement#isUninstantiated()
	 * @see #getArgumentationElement()
	 * @generated
	 */
	EAttribute getArgumentationElement_Uninstantiated();

	/**
	 * Returns the meta object for class '{@link top.argumentation.ArgumentGroup <em>Argument Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Group</em>'.
	 * @see top.argumentation.ArgumentGroup
	 * @generated
	 */
	EClass getArgumentGroup();

	/**
	 * Returns the meta object for the reference list '{@link top.argumentation.ArgumentGroup#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argumentation Element</em>'.
	 * @see top.argumentation.ArgumentGroup#getArgumentationElement()
	 * @see #getArgumentGroup()
	 * @generated
	 */
	EReference getArgumentGroup_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link top.argumentation.ArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package</em>'.
	 * @see top.argumentation.ArgumentPackage
	 * @generated
	 */
	EClass getArgumentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link top.argumentation.ArgumentPackage#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argumentation Element</em>'.
	 * @see top.argumentation.ArgumentPackage#getArgumentationElement()
	 * @see #getArgumentPackage()
	 * @generated
	 */
	EReference getArgumentPackage_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link top.argumentation.ArgumentPackageInterface <em>Argument Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package Interface</em>'.
	 * @see top.argumentation.ArgumentPackageInterface
	 * @generated
	 */
	EClass getArgumentPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link top.argumentation.ArgumentPackageInterface#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see top.argumentation.ArgumentPackageInterface#getImplements()
	 * @see #getArgumentPackageInterface()
	 * @generated
	 */
	EReference getArgumentPackageInterface_Implements();

	/**
	 * Returns the meta object for class '{@link top.argumentation.ArgumentPackageBinding <em>Argument Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package Binding</em>'.
	 * @see top.argumentation.ArgumentPackageBinding
	 * @generated
	 */
	EClass getArgumentPackageBinding();

	/**
	 * Returns the meta object for the reference list '{@link top.argumentation.ArgumentPackageBinding#getParticipantPackage <em>Participant Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Package</em>'.
	 * @see top.argumentation.ArgumentPackageBinding#getParticipantPackage()
	 * @see #getArgumentPackageBinding()
	 * @generated
	 */
	EReference getArgumentPackageBinding_ParticipantPackage();

	/**
	 * Returns the meta object for class '{@link top.argumentation.ArgumentAsset <em>Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Asset</em>'.
	 * @see top.argumentation.ArgumentAsset
	 * @generated
	 */
	EClass getArgumentAsset();

	/**
	 * Returns the meta object for the containment reference '{@link top.argumentation.ArgumentAsset#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see top.argumentation.ArgumentAsset#getContent()
	 * @see #getArgumentAsset()
	 * @generated
	 */
	EReference getArgumentAsset_Content();

	/**
	 * Returns the meta object for class '{@link top.argumentation.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see top.argumentation.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link top.argumentation.Assertion#getAssertionDeclaration <em>Assertion Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assertion Declaration</em>'.
	 * @see top.argumentation.Assertion#getAssertionDeclaration()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_AssertionDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link top.argumentation.Assertion#getMetaClaim <em>Meta Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Claim</em>'.
	 * @see top.argumentation.Assertion#getMetaClaim()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_MetaClaim();

	/**
	 * Returns the meta object for class '{@link top.argumentation.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Reasoning</em>'.
	 * @see top.argumentation.ArgumentReasoning
	 * @generated
	 */
	EClass getArgumentReasoning();

	/**
	 * Returns the meta object for the reference '{@link top.argumentation.ArgumentReasoning#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure</em>'.
	 * @see top.argumentation.ArgumentReasoning#getStructure()
	 * @see #getArgumentReasoning()
	 * @generated
	 */
	EReference getArgumentReasoning_Structure();

	/**
	 * Returns the meta object for class '{@link top.argumentation.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see top.argumentation.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for class '{@link top.argumentation.AssertedRelationship <em>Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Relationship</em>'.
	 * @see top.argumentation.AssertedRelationship
	 * @generated
	 */
	EClass getAssertedRelationship();

	/**
	 * Returns the meta object for the attribute '{@link top.argumentation.AssertedRelationship#isIsCounter <em>Is Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Counter</em>'.
	 * @see top.argumentation.AssertedRelationship#isIsCounter()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EAttribute getAssertedRelationship_IsCounter();

	/**
	 * Returns the meta object for the reference list '{@link top.argumentation.AssertedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see top.argumentation.AssertedRelationship#getSource()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link top.argumentation.AssertedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see top.argumentation.AssertedRelationship#getTarget()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link top.argumentation.AssertedRelationship#getReasoning <em>Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reasoning</em>'.
	 * @see top.argumentation.AssertedRelationship#getReasoning()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Reasoning();

	/**
	 * Returns the meta object for the attribute '{@link top.argumentation.AssertedRelationship#getRequies <em>Requies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requies</em>'.
	 * @see top.argumentation.AssertedRelationship#getRequies()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EAttribute getAssertedRelationship_Requies();

	/**
	 * Returns the meta object for class '{@link top.argumentation.ArtifactReference <em>Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Reference</em>'.
	 * @see top.argumentation.ArtifactReference
	 * @generated
	 */
	EClass getArtifactReference();

	/**
	 * Returns the meta object for the reference list '{@link top.argumentation.ArtifactReference#getReferencedArtifactElement <em>Referenced Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Artifact Element</em>'.
	 * @see top.argumentation.ArtifactReference#getReferencedArtifactElement()
	 * @see #getArtifactReference()
	 * @generated
	 */
	EReference getArtifactReference_ReferencedArtifactElement();

	/**
	 * Returns the meta object for class '{@link top.argumentation.AssertedArtifactSupport <em>Asserted Artifact Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Artifact Support</em>'.
	 * @see top.argumentation.AssertedArtifactSupport
	 * @generated
	 */
	EClass getAssertedArtifactSupport();

	/**
	 * Returns the meta object for class '{@link top.argumentation.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Inference</em>'.
	 * @see top.argumentation.AssertedInference
	 * @generated
	 */
	EClass getAssertedInference();

	/**
	 * Returns the meta object for class '{@link top.argumentation.AssertedEvidence <em>Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Evidence</em>'.
	 * @see top.argumentation.AssertedEvidence
	 * @generated
	 */
	EClass getAssertedEvidence();

	/**
	 * Returns the meta object for class '{@link top.argumentation.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Context</em>'.
	 * @see top.argumentation.AssertedContext
	 * @generated
	 */
	EClass getAssertedContext();

	/**
	 * Returns the meta object for class '{@link top.argumentation.AssertedArtifactContext <em>Asserted Artifact Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Artifact Context</em>'.
	 * @see top.argumentation.AssertedArtifactContext
	 * @generated
	 */
	EClass getAssertedArtifactContext();

	/**
	 * Returns the meta object for enum '{@link top.argumentation.AssertionDeclaration <em>Assertion Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Declaration</em>'.
	 * @see top.argumentation.AssertionDeclaration
	 * @generated
	 */
	EEnum getAssertionDeclaration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArgumentationFactory getArgumentationFactory();

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
		 * The meta object literal for the '{@link top.argumentation.impl.ArgumentationElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.ArgumentationElementImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentationElement()
		 * @generated
		 */
		EClass ARGUMENTATION_ELEMENT = eINSTANCE.getArgumentationElement();

		/**
		 * The meta object literal for the '<em><b>Uninstantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENTATION_ELEMENT__UNINSTANTIATED = eINSTANCE.getArgumentationElement_Uninstantiated();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.ArgumentGroupImpl <em>Argument Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.ArgumentGroupImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentGroup()
		 * @generated
		 */
		EClass ARGUMENT_GROUP = eINSTANCE.getArgumentGroup();

		/**
		 * The meta object literal for the '<em><b>Argumentation Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_GROUP__ARGUMENTATION_ELEMENT = eINSTANCE.getArgumentGroup_ArgumentationElement();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.ArgumentPackageImpl <em>Argument Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.ArgumentPackageImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentPackage()
		 * @generated
		 */
		EClass ARGUMENT_PACKAGE = eINSTANCE.getArgumentPackage();

		/**
		 * The meta object literal for the '<em><b>Argumentation Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT = eINSTANCE.getArgumentPackage_ArgumentationElement();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.ArgumentPackageInterfaceImpl <em>Argument Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.ArgumentPackageInterfaceImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentPackageInterface()
		 * @generated
		 */
		EClass ARGUMENT_PACKAGE_INTERFACE = eINSTANCE.getArgumentPackageInterface();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS = eINSTANCE.getArgumentPackageInterface_Implements();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.ArgumentPackageBindingImpl <em>Argument Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.ArgumentPackageBindingImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentPackageBinding()
		 * @generated
		 */
		EClass ARGUMENT_PACKAGE_BINDING = eINSTANCE.getArgumentPackageBinding();

		/**
		 * The meta object literal for the '<em><b>Participant Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE = eINSTANCE.getArgumentPackageBinding_ParticipantPackage();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.ArgumentAssetImpl <em>Argument Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.ArgumentAssetImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentAsset()
		 * @generated
		 */
		EClass ARGUMENT_ASSET = eINSTANCE.getArgumentAsset();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_ASSET__CONTENT = eINSTANCE.getArgumentAsset_Content();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.AssertionImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Assertion Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__ASSERTION_DECLARATION = eINSTANCE.getAssertion_AssertionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Meta Claim</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__META_CLAIM = eINSTANCE.getAssertion_MetaClaim();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.ArgumentReasoningImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getArgumentReasoning()
		 * @generated
		 */
		EClass ARGUMENT_REASONING = eINSTANCE.getArgumentReasoning();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_REASONING__STRUCTURE = eINSTANCE.getArgumentReasoning_Structure();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.ClaimImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.AssertedRelationshipImpl <em>Asserted Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.AssertedRelationshipImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedRelationship()
		 * @generated
		 */
		EClass ASSERTED_RELATIONSHIP = eINSTANCE.getAssertedRelationship();

		/**
		 * The meta object literal for the '<em><b>Is Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTED_RELATIONSHIP__IS_COUNTER = eINSTANCE.getAssertedRelationship_IsCounter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTED_RELATIONSHIP__SOURCE = eINSTANCE.getAssertedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTED_RELATIONSHIP__TARGET = eINSTANCE.getAssertedRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Reasoning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTED_RELATIONSHIP__REASONING = eINSTANCE.getAssertedRelationship_Reasoning();

		/**
		 * The meta object literal for the '<em><b>Requies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTED_RELATIONSHIP__REQUIES = eINSTANCE.getAssertedRelationship_Requies();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.ArtifactReferenceImpl <em>Artifact Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.ArtifactReferenceImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getArtifactReference()
		 * @generated
		 */
		EClass ARTIFACT_REFERENCE = eINSTANCE.getArtifactReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Artifact Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT = eINSTANCE.getArtifactReference_ReferencedArtifactElement();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.AssertedArtifactSupportImpl <em>Asserted Artifact Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.AssertedArtifactSupportImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedArtifactSupport()
		 * @generated
		 */
		EClass ASSERTED_ARTIFACT_SUPPORT = eINSTANCE.getAssertedArtifactSupport();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.AssertedInferenceImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedInference()
		 * @generated
		 */
		EClass ASSERTED_INFERENCE = eINSTANCE.getAssertedInference();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.AssertedEvidenceImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedEvidence()
		 * @generated
		 */
		EClass ASSERTED_EVIDENCE = eINSTANCE.getAssertedEvidence();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.AssertedContextImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedContext()
		 * @generated
		 */
		EClass ASSERTED_CONTEXT = eINSTANCE.getAssertedContext();

		/**
		 * The meta object literal for the '{@link top.argumentation.impl.AssertedArtifactContextImpl <em>Asserted Artifact Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.impl.AssertedArtifactContextImpl
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertedArtifactContext()
		 * @generated
		 */
		EClass ASSERTED_ARTIFACT_CONTEXT = eINSTANCE.getAssertedArtifactContext();

		/**
		 * The meta object literal for the '{@link top.argumentation.AssertionDeclaration <em>Assertion Declaration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see top.argumentation.AssertionDeclaration
		 * @see top.argumentation.impl.ArgumentationPackageImpl#getAssertionDeclaration()
		 * @generated
		 */
		EEnum ASSERTION_DECLARATION = eINSTANCE.getAssertionDeclaration();

	}

} //ArgumentationPackage
