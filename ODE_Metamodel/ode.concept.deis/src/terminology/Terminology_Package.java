/**
 */
package terminology;

import base.Base_Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see terminology.Terminology_Factory
 * @model kind="package"
 * @generated
 */
public interface Terminology_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terminology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://omg.sacm/2.0/terminology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "terminology_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Terminology_Package eINSTANCE = terminology.impl.Terminology_PackageImpl.init();

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyElementImpl <em>Terminology Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyElementImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyElement()
	 * @generated
	 */
	int TERMINOLOGY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__ABSTRACT_FORM = Base_Package.ARTIFACT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__IMPLEMENTATION_CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Terminology Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminology Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT_OPERATION_COUNT = Base_Package.ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyGroupImpl <em>Terminology Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyGroupImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyGroup()
	 * @generated
	 */
	int TERMINOLOGY_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__GID = TERMINOLOGY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__IS_CITATION = TERMINOLOGY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__IS_ABSTRACT = TERMINOLOGY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__CITED_ELEMENT = TERMINOLOGY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__ABSTRACT_FORM = TERMINOLOGY_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__NAME = TERMINOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__DESCRIPTION = TERMINOLOGY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__IMPLEMENTATION_CONSTRAINT = TERMINOLOGY_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__NOTE = TERMINOLOGY_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__TAGGED_VALUE = TERMINOLOGY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Terminology Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP__TERMINOLOGY_ELEMENT = TERMINOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP_FEATURE_COUNT = TERMINOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminology Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_GROUP_OPERATION_COUNT = TERMINOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyPackageImpl <em>Terminology Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyPackageImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackage()
	 * @generated
	 */
	int TERMINOLOGY_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__GID = TERMINOLOGY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__IS_CITATION = TERMINOLOGY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__IS_ABSTRACT = TERMINOLOGY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__CITED_ELEMENT = TERMINOLOGY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__ABSTRACT_FORM = TERMINOLOGY_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__NAME = TERMINOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__DESCRIPTION = TERMINOLOGY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__IMPLEMENTATION_CONSTRAINT = TERMINOLOGY_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__NOTE = TERMINOLOGY_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__TAGGED_VALUE = TERMINOLOGY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Terminology Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT = TERMINOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_FEATURE_COUNT = TERMINOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminology Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_OPERATION_COUNT = TERMINOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyPackageBindingImpl <em>Terminology Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyPackageBindingImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackageBinding()
	 * @generated
	 */
	int TERMINOLOGY_PACKAGE_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__GID = TERMINOLOGY_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__IS_CITATION = TERMINOLOGY_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__IS_ABSTRACT = TERMINOLOGY_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__CITED_ELEMENT = TERMINOLOGY_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__ABSTRACT_FORM = TERMINOLOGY_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__NAME = TERMINOLOGY_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__DESCRIPTION = TERMINOLOGY_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT = TERMINOLOGY_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__NOTE = TERMINOLOGY_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__TAGGED_VALUE = TERMINOLOGY_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Terminology Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__TERMINOLOGY_ELEMENT = TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING__PARTICIPANT_PACKAGE = TERMINOLOGY_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING_FEATURE_COUNT = TERMINOLOGY_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminology Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_BINDING_OPERATION_COUNT = TERMINOLOGY_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyPackageInterfaceImpl <em>Terminology Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyPackageInterfaceImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackageInterface()
	 * @generated
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__GID = TERMINOLOGY_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__IS_CITATION = TERMINOLOGY_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__IS_ABSTRACT = TERMINOLOGY_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__CITED_ELEMENT = TERMINOLOGY_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__ABSTRACT_FORM = TERMINOLOGY_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__NAME = TERMINOLOGY_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__DESCRIPTION = TERMINOLOGY_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__IMPLEMENTATION_CONSTRAINT = TERMINOLOGY_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__NOTE = TERMINOLOGY_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__TAGGED_VALUE = TERMINOLOGY_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Terminology Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__TERMINOLOGY_ELEMENT = TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__IMPLEMENTS = TERMINOLOGY_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE_FEATURE_COUNT = TERMINOLOGY_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminology Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE_OPERATION_COUNT = TERMINOLOGY_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyAssetImpl <em>Terminology Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyAssetImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyAsset()
	 * @generated
	 */
	int TERMINOLOGY_ASSET = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__GID = TERMINOLOGY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__IS_CITATION = TERMINOLOGY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__IS_ABSTRACT = TERMINOLOGY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__CITED_ELEMENT = TERMINOLOGY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__ABSTRACT_FORM = TERMINOLOGY_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__NAME = TERMINOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__DESCRIPTION = TERMINOLOGY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__IMPLEMENTATION_CONSTRAINT = TERMINOLOGY_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__NOTE = TERMINOLOGY_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__TAGGED_VALUE = TERMINOLOGY_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Terminology Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET_FEATURE_COUNT = TERMINOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminology Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET_OPERATION_COUNT = TERMINOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.CategoryImpl
	 * @see terminology.impl.Terminology_PackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__GID = TERMINOLOGY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IS_CITATION = TERMINOLOGY_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IS_ABSTRACT = TERMINOLOGY_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CITED_ELEMENT = TERMINOLOGY_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ABSTRACT_FORM = TERMINOLOGY_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = TERMINOLOGY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = TERMINOLOGY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IMPLEMENTATION_CONSTRAINT = TERMINOLOGY_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NOTE = TERMINOLOGY_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TAGGED_VALUE = TERMINOLOGY_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY = TERMINOLOGY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = TERMINOLOGY_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = TERMINOLOGY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.ExpressionElementImpl <em>Expression Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.ExpressionElementImpl
	 * @see terminology.impl.Terminology_PackageImpl#getExpressionElement()
	 * @generated
	 */
	int EXPRESSION_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__GID = TERMINOLOGY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__IS_CITATION = TERMINOLOGY_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__IS_ABSTRACT = TERMINOLOGY_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__CITED_ELEMENT = TERMINOLOGY_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__ABSTRACT_FORM = TERMINOLOGY_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__NAME = TERMINOLOGY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__DESCRIPTION = TERMINOLOGY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__IMPLEMENTATION_CONSTRAINT = TERMINOLOGY_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__NOTE = TERMINOLOGY_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__TAGGED_VALUE = TERMINOLOGY_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__VALUE = TERMINOLOGY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT__CATEGORY = TERMINOLOGY_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_FEATURE_COUNT = TERMINOLOGY_ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ELEMENT_OPERATION_COUNT = TERMINOLOGY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.ExpressionImpl
	 * @see terminology.impl.Terminology_PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__GID = EXPRESSION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_CITATION = EXPRESSION_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_ABSTRACT = EXPRESSION_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CITED_ELEMENT = EXPRESSION_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ABSTRACT_FORM = EXPRESSION_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = EXPRESSION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = EXPRESSION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IMPLEMENTATION_CONSTRAINT = EXPRESSION_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NOTE = EXPRESSION_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TAGGED_VALUE = EXPRESSION_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = EXPRESSION_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CATEGORY = EXPRESSION_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ELEMENT = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TermImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__GID = EXPRESSION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__IS_CITATION = EXPRESSION_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__IS_ABSTRACT = EXPRESSION_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CITED_ELEMENT = EXPRESSION_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ABSTRACT_FORM = EXPRESSION_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAME = EXPRESSION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__DESCRIPTION = EXPRESSION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__IMPLEMENTATION_CONSTRAINT = EXPRESSION_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NOTE = EXPRESSION_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TAGGED_VALUE = EXPRESSION_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__VALUE = EXPRESSION_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CATEGORY = EXPRESSION_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__EXTERNAL_REFERENCE = EXPRESSION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ORIGIN = EXPRESSION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = EXPRESSION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = EXPRESSION_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link terminology.TerminologyElement <em>Terminology Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Element</em>'.
	 * @see terminology.TerminologyElement
	 * @generated
	 */
	EClass getTerminologyElement();

	/**
	 * Returns the meta object for class '{@link terminology.TerminologyGroup <em>Terminology Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Group</em>'.
	 * @see terminology.TerminologyGroup
	 * @generated
	 */
	EClass getTerminologyGroup();

	/**
	 * Returns the meta object for the reference list '{@link terminology.TerminologyGroup#getTerminologyElement <em>Terminology Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminology Element</em>'.
	 * @see terminology.TerminologyGroup#getTerminologyElement()
	 * @see #getTerminologyGroup()
	 * @generated
	 */
	EReference getTerminologyGroup_TerminologyElement();

	/**
	 * Returns the meta object for class '{@link terminology.TerminologyPackage <em>Terminology Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Package</em>'.
	 * @see terminology.TerminologyPackage
	 * @generated
	 */
	EClass getTerminologyPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link terminology.TerminologyPackage#getTerminologyElement <em>Terminology Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Element</em>'.
	 * @see terminology.TerminologyPackage#getTerminologyElement()
	 * @see #getTerminologyPackage()
	 * @generated
	 */
	EReference getTerminologyPackage_TerminologyElement();

	/**
	 * Returns the meta object for class '{@link terminology.TerminologyPackageBinding <em>Terminology Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Package Binding</em>'.
	 * @see terminology.TerminologyPackageBinding
	 * @generated
	 */
	EClass getTerminologyPackageBinding();

	/**
	 * Returns the meta object for the reference list '{@link terminology.TerminologyPackageBinding#getParticipantPackage <em>Participant Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Package</em>'.
	 * @see terminology.TerminologyPackageBinding#getParticipantPackage()
	 * @see #getTerminologyPackageBinding()
	 * @generated
	 */
	EReference getTerminologyPackageBinding_ParticipantPackage();

	/**
	 * Returns the meta object for class '{@link terminology.TerminologyPackageInterface <em>Terminology Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Package Interface</em>'.
	 * @see terminology.TerminologyPackageInterface
	 * @generated
	 */
	EClass getTerminologyPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link terminology.TerminologyPackageInterface#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see terminology.TerminologyPackageInterface#getImplements()
	 * @see #getTerminologyPackageInterface()
	 * @generated
	 */
	EReference getTerminologyPackageInterface_Implements();

	/**
	 * Returns the meta object for class '{@link terminology.TerminologyAsset <em>Terminology Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Asset</em>'.
	 * @see terminology.TerminologyAsset
	 * @generated
	 */
	EClass getTerminologyAsset();

	/**
	 * Returns the meta object for class '{@link terminology.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see terminology.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the reference '{@link terminology.Category#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see terminology.Category#getCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Category();

	/**
	 * Returns the meta object for class '{@link terminology.ExpressionElement <em>Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Element</em>'.
	 * @see terminology.ExpressionElement
	 * @generated
	 */
	EClass getExpressionElement();

	/**
	 * Returns the meta object for the attribute '{@link terminology.ExpressionElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see terminology.ExpressionElement#getValue()
	 * @see #getExpressionElement()
	 * @generated
	 */
	EAttribute getExpressionElement_Value();

	/**
	 * Returns the meta object for the reference list '{@link terminology.ExpressionElement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see terminology.ExpressionElement#getCategory()
	 * @see #getExpressionElement()
	 * @generated
	 */
	EReference getExpressionElement_Category();

	/**
	 * Returns the meta object for class '{@link terminology.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see terminology.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference list '{@link terminology.Expression#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see terminology.Expression#getElement()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Element();

	/**
	 * Returns the meta object for class '{@link terminology.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see terminology.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the attribute '{@link terminology.Term#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Reference</em>'.
	 * @see terminology.Term#getExternalReference()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_ExternalReference();

	/**
	 * Returns the meta object for the reference '{@link terminology.Term#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see terminology.Term#getOrigin()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Origin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Terminology_Factory getTerminology_Factory();

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
		 * The meta object literal for the '{@link terminology.impl.TerminologyElementImpl <em>Terminology Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyElementImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyElement()
		 * @generated
		 */
		EClass TERMINOLOGY_ELEMENT = eINSTANCE.getTerminologyElement();

		/**
		 * The meta object literal for the '{@link terminology.impl.TerminologyGroupImpl <em>Terminology Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyGroupImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyGroup()
		 * @generated
		 */
		EClass TERMINOLOGY_GROUP = eINSTANCE.getTerminologyGroup();

		/**
		 * The meta object literal for the '<em><b>Terminology Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY_GROUP__TERMINOLOGY_ELEMENT = eINSTANCE.getTerminologyGroup_TerminologyElement();

		/**
		 * The meta object literal for the '{@link terminology.impl.TerminologyPackageImpl <em>Terminology Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyPackageImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackage()
		 * @generated
		 */
		EClass TERMINOLOGY_PACKAGE = eINSTANCE.getTerminologyPackage();

		/**
		 * The meta object literal for the '<em><b>Terminology Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT = eINSTANCE.getTerminologyPackage_TerminologyElement();

		/**
		 * The meta object literal for the '{@link terminology.impl.TerminologyPackageBindingImpl <em>Terminology Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyPackageBindingImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackageBinding()
		 * @generated
		 */
		EClass TERMINOLOGY_PACKAGE_BINDING = eINSTANCE.getTerminologyPackageBinding();

		/**
		 * The meta object literal for the '<em><b>Participant Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY_PACKAGE_BINDING__PARTICIPANT_PACKAGE = eINSTANCE.getTerminologyPackageBinding_ParticipantPackage();

		/**
		 * The meta object literal for the '{@link terminology.impl.TerminologyPackageInterfaceImpl <em>Terminology Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyPackageInterfaceImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackageInterface()
		 * @generated
		 */
		EClass TERMINOLOGY_PACKAGE_INTERFACE = eINSTANCE.getTerminologyPackageInterface();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY_PACKAGE_INTERFACE__IMPLEMENTS = eINSTANCE.getTerminologyPackageInterface_Implements();

		/**
		 * The meta object literal for the '{@link terminology.impl.TerminologyAssetImpl <em>Terminology Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyAssetImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyAsset()
		 * @generated
		 */
		EClass TERMINOLOGY_ASSET = eINSTANCE.getTerminologyAsset();

		/**
		 * The meta object literal for the '{@link terminology.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.CategoryImpl
		 * @see terminology.impl.Terminology_PackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORY = eINSTANCE.getCategory_Category();

		/**
		 * The meta object literal for the '{@link terminology.impl.ExpressionElementImpl <em>Expression Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.ExpressionElementImpl
		 * @see terminology.impl.Terminology_PackageImpl#getExpressionElement()
		 * @generated
		 */
		EClass EXPRESSION_ELEMENT = eINSTANCE.getExpressionElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_ELEMENT__VALUE = eINSTANCE.getExpressionElement_Value();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ELEMENT__CATEGORY = eINSTANCE.getExpressionElement_Category();

		/**
		 * The meta object literal for the '{@link terminology.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.ExpressionImpl
		 * @see terminology.impl.Terminology_PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__ELEMENT = eINSTANCE.getExpression_Element();

		/**
		 * The meta object literal for the '{@link terminology.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TermImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__EXTERNAL_REFERENCE = eINSTANCE.getTerm_ExternalReference();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__ORIGIN = eINSTANCE.getTerm_Origin();

	}

} //Terminology_Package
