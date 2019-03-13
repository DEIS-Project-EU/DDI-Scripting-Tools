/**
 */
package argumentation;

import base.Base_Package;

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
 * @see argumentation.Argumentation_Factory
 * @model kind="package"
 * @generated
 */
public interface Argumentation_Package extends EPackage {
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
	String eNS_URI = "http://omg.sacm/2.0/argumentation";

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
	Argumentation_Package eINSTANCE = argumentation.impl.Argumentation_PackageImpl.init();

	/**
	 * The meta object id for the '{@link argumentation.impl.ArgumentationElementImpl <em>Argumentation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArgumentationElementImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentationElement()
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
	int ARGUMENTATION_ELEMENT__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__ABSTRACT_FORM = Base_Package.ARTIFACT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__IMPLEMENTATION_CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__UNINSTANTIATED = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Argumentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Argumentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT_OPERATION_COUNT = Base_Package.ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link argumentation.impl.ArgumentGroupImpl <em>Argument Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArgumentGroupImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentGroup()
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
	 * The meta object id for the '{@link argumentation.impl.ArgumentPackageImpl <em>Argument Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArgumentPackageImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentPackage()
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
	 * The meta object id for the '{@link argumentation.impl.ArgumentPackageInterfaceImpl <em>Argument Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArgumentPackageInterfaceImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentPackageInterface()
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
	 * The meta object id for the '{@link argumentation.impl.ArgumentPackageBindingImpl <em>Argument Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArgumentPackageBindingImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentPackageBinding()
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
	 * The meta object id for the '{@link argumentation.impl.ArgumentAssetImpl <em>Argument Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArgumentAssetImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentAsset()
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
	 * The meta object id for the '{@link argumentation.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.AssertionImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getAssertion()
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
	 * The meta object id for the '{@link argumentation.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArgumentReasoningImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentReasoning()
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
	 * The meta object id for the '{@link argumentation.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ClaimImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getClaim()
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
	 * The meta object id for the '{@link argumentation.impl.AssertedRelationshipImpl <em>Asserted Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.AssertedRelationshipImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedRelationship()
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
	 * The meta object id for the '{@link argumentation.impl.ArtifactReferenceImpl <em>Artifact Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.ArtifactReferenceImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getArtifactReference()
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
	 * The meta object id for the '{@link argumentation.impl.AssertedArtifactSupportImpl <em>Asserted Artifact Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.AssertedArtifactSupportImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedArtifactSupport()
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
	 * The meta object id for the '{@link argumentation.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.AssertedInferenceImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedInference()
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
	 * The meta object id for the '{@link argumentation.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.AssertedEvidenceImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedEvidence()
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
	 * The meta object id for the '{@link argumentation.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.AssertedContextImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedContext()
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
	 * The meta object id for the '{@link argumentation.impl.AssertedArtifactContextImpl <em>Asserted Artifact Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.impl.AssertedArtifactContextImpl
	 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedArtifactContext()
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
	 * The meta object id for the '{@link argumentation.AssertionDeclaration <em>Assertion Declaration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see argumentation.AssertionDeclaration
	 * @see argumentation.impl.Argumentation_PackageImpl#getAssertionDeclaration()
	 * @generated
	 */
	int ASSERTION_DECLARATION = 16;


	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argumentation Element</em>'.
	 * @see argumentation.ArgumentationElement
	 * @generated
	 */
	EClass getArgumentationElement();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.ArgumentationElement#isUninstantiated <em>Uninstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uninstantiated</em>'.
	 * @see argumentation.ArgumentationElement#isUninstantiated()
	 * @see #getArgumentationElement()
	 * @generated
	 */
	EAttribute getArgumentationElement_Uninstantiated();

	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentGroup <em>Argument Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Group</em>'.
	 * @see argumentation.ArgumentGroup
	 * @generated
	 */
	EClass getArgumentGroup();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.ArgumentGroup#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argumentation Element</em>'.
	 * @see argumentation.ArgumentGroup#getArgumentationElement()
	 * @see #getArgumentGroup()
	 * @generated
	 */
	EReference getArgumentGroup_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package</em>'.
	 * @see argumentation.ArgumentPackage
	 * @generated
	 */
	EClass getArgumentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link argumentation.ArgumentPackage#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argumentation Element</em>'.
	 * @see argumentation.ArgumentPackage#getArgumentationElement()
	 * @see #getArgumentPackage()
	 * @generated
	 */
	EReference getArgumentPackage_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentPackageInterface <em>Argument Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package Interface</em>'.
	 * @see argumentation.ArgumentPackageInterface
	 * @generated
	 */
	EClass getArgumentPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link argumentation.ArgumentPackageInterface#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see argumentation.ArgumentPackageInterface#getImplements()
	 * @see #getArgumentPackageInterface()
	 * @generated
	 */
	EReference getArgumentPackageInterface_Implements();

	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentPackageBinding <em>Argument Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Package Binding</em>'.
	 * @see argumentation.ArgumentPackageBinding
	 * @generated
	 */
	EClass getArgumentPackageBinding();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.ArgumentPackageBinding#getParticipantPackage <em>Participant Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Package</em>'.
	 * @see argumentation.ArgumentPackageBinding#getParticipantPackage()
	 * @see #getArgumentPackageBinding()
	 * @generated
	 */
	EReference getArgumentPackageBinding_ParticipantPackage();

	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentAsset <em>Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Asset</em>'.
	 * @see argumentation.ArgumentAsset
	 * @generated
	 */
	EClass getArgumentAsset();

	/**
	 * Returns the meta object for the containment reference '{@link argumentation.ArgumentAsset#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see argumentation.ArgumentAsset#getContent()
	 * @see #getArgumentAsset()
	 * @generated
	 */
	EReference getArgumentAsset_Content();

	/**
	 * Returns the meta object for class '{@link argumentation.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see argumentation.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.Assertion#getAssertionDeclaration <em>Assertion Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assertion Declaration</em>'.
	 * @see argumentation.Assertion#getAssertionDeclaration()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_AssertionDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.Assertion#getMetaClaim <em>Meta Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Claim</em>'.
	 * @see argumentation.Assertion#getMetaClaim()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_MetaClaim();

	/**
	 * Returns the meta object for class '{@link argumentation.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Reasoning</em>'.
	 * @see argumentation.ArgumentReasoning
	 * @generated
	 */
	EClass getArgumentReasoning();

	/**
	 * Returns the meta object for the reference '{@link argumentation.ArgumentReasoning#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure</em>'.
	 * @see argumentation.ArgumentReasoning#getStructure()
	 * @see #getArgumentReasoning()
	 * @generated
	 */
	EReference getArgumentReasoning_Structure();

	/**
	 * Returns the meta object for class '{@link argumentation.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see argumentation.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for class '{@link argumentation.AssertedRelationship <em>Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Relationship</em>'.
	 * @see argumentation.AssertedRelationship
	 * @generated
	 */
	EClass getAssertedRelationship();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.AssertedRelationship#isIsCounter <em>Is Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Counter</em>'.
	 * @see argumentation.AssertedRelationship#isIsCounter()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EAttribute getAssertedRelationship_IsCounter();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.AssertedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see argumentation.AssertedRelationship#getSource()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.AssertedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see argumentation.AssertedRelationship#getTarget()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link argumentation.AssertedRelationship#getReasoning <em>Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reasoning</em>'.
	 * @see argumentation.AssertedRelationship#getReasoning()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Reasoning();

	/**
	 * Returns the meta object for the attribute '{@link argumentation.AssertedRelationship#getRequies <em>Requies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requies</em>'.
	 * @see argumentation.AssertedRelationship#getRequies()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EAttribute getAssertedRelationship_Requies();

	/**
	 * Returns the meta object for class '{@link argumentation.ArtifactReference <em>Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Reference</em>'.
	 * @see argumentation.ArtifactReference
	 * @generated
	 */
	EClass getArtifactReference();

	/**
	 * Returns the meta object for the reference list '{@link argumentation.ArtifactReference#getReferencedArtifactElement <em>Referenced Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Artifact Element</em>'.
	 * @see argumentation.ArtifactReference#getReferencedArtifactElement()
	 * @see #getArtifactReference()
	 * @generated
	 */
	EReference getArtifactReference_ReferencedArtifactElement();

	/**
	 * Returns the meta object for class '{@link argumentation.AssertedArtifactSupport <em>Asserted Artifact Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Artifact Support</em>'.
	 * @see argumentation.AssertedArtifactSupport
	 * @generated
	 */
	EClass getAssertedArtifactSupport();

	/**
	 * Returns the meta object for class '{@link argumentation.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Inference</em>'.
	 * @see argumentation.AssertedInference
	 * @generated
	 */
	EClass getAssertedInference();

	/**
	 * Returns the meta object for class '{@link argumentation.AssertedEvidence <em>Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Evidence</em>'.
	 * @see argumentation.AssertedEvidence
	 * @generated
	 */
	EClass getAssertedEvidence();

	/**
	 * Returns the meta object for class '{@link argumentation.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Context</em>'.
	 * @see argumentation.AssertedContext
	 * @generated
	 */
	EClass getAssertedContext();

	/**
	 * Returns the meta object for class '{@link argumentation.AssertedArtifactContext <em>Asserted Artifact Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Artifact Context</em>'.
	 * @see argumentation.AssertedArtifactContext
	 * @generated
	 */
	EClass getAssertedArtifactContext();

	/**
	 * Returns the meta object for enum '{@link argumentation.AssertionDeclaration <em>Assertion Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assertion Declaration</em>'.
	 * @see argumentation.AssertionDeclaration
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
	Argumentation_Factory getArgumentation_Factory();

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
		 * The meta object literal for the '{@link argumentation.impl.ArgumentationElementImpl <em>Argumentation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArgumentationElementImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentationElement()
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
		 * The meta object literal for the '{@link argumentation.impl.ArgumentGroupImpl <em>Argument Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArgumentGroupImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentGroup()
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
		 * The meta object literal for the '{@link argumentation.impl.ArgumentPackageImpl <em>Argument Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArgumentPackageImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentPackage()
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
		 * The meta object literal for the '{@link argumentation.impl.ArgumentPackageInterfaceImpl <em>Argument Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArgumentPackageInterfaceImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentPackageInterface()
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
		 * The meta object literal for the '{@link argumentation.impl.ArgumentPackageBindingImpl <em>Argument Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArgumentPackageBindingImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentPackageBinding()
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
		 * The meta object literal for the '{@link argumentation.impl.ArgumentAssetImpl <em>Argument Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArgumentAssetImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentAsset()
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
		 * The meta object literal for the '{@link argumentation.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.AssertionImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getAssertion()
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
		 * The meta object literal for the '{@link argumentation.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArgumentReasoningImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getArgumentReasoning()
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
		 * The meta object literal for the '{@link argumentation.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ClaimImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '{@link argumentation.impl.AssertedRelationshipImpl <em>Asserted Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.AssertedRelationshipImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedRelationship()
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
		 * The meta object literal for the '{@link argumentation.impl.ArtifactReferenceImpl <em>Artifact Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.ArtifactReferenceImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getArtifactReference()
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
		 * The meta object literal for the '{@link argumentation.impl.AssertedArtifactSupportImpl <em>Asserted Artifact Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.AssertedArtifactSupportImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedArtifactSupport()
		 * @generated
		 */
		EClass ASSERTED_ARTIFACT_SUPPORT = eINSTANCE.getAssertedArtifactSupport();

		/**
		 * The meta object literal for the '{@link argumentation.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.AssertedInferenceImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedInference()
		 * @generated
		 */
		EClass ASSERTED_INFERENCE = eINSTANCE.getAssertedInference();

		/**
		 * The meta object literal for the '{@link argumentation.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.AssertedEvidenceImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedEvidence()
		 * @generated
		 */
		EClass ASSERTED_EVIDENCE = eINSTANCE.getAssertedEvidence();

		/**
		 * The meta object literal for the '{@link argumentation.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.AssertedContextImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedContext()
		 * @generated
		 */
		EClass ASSERTED_CONTEXT = eINSTANCE.getAssertedContext();

		/**
		 * The meta object literal for the '{@link argumentation.impl.AssertedArtifactContextImpl <em>Asserted Artifact Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.impl.AssertedArtifactContextImpl
		 * @see argumentation.impl.Argumentation_PackageImpl#getAssertedArtifactContext()
		 * @generated
		 */
		EClass ASSERTED_ARTIFACT_CONTEXT = eINSTANCE.getAssertedArtifactContext();

		/**
		 * The meta object literal for the '{@link argumentation.AssertionDeclaration <em>Assertion Declaration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see argumentation.AssertionDeclaration
		 * @see argumentation.impl.Argumentation_PackageImpl#getAssertionDeclaration()
		 * @generated
		 */
		EEnum ASSERTION_DECLARATION = eINSTANCE.getAssertionDeclaration();

	}

} //Argumentation_Package
