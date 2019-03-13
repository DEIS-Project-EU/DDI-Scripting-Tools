/**
 */
package assuranceCase;

import base.Base_Package;

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
 * @see assuranceCase.AssuranceCase_Factory
 * @model kind="package"
 * @generated
 */
public interface AssuranceCase_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assuranceCase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://omg.sacm/2.0/assurancecase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assuranceCase_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssuranceCase_Package eINSTANCE = assuranceCase.impl.AssuranceCase_PackageImpl.init();

	/**
	 * The meta object id for the '{@link assuranceCase.impl.AssuranceCasePackageImpl <em>Assurance Case Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assuranceCase.impl.AssuranceCasePackageImpl
	 * @see assuranceCase.impl.AssuranceCase_PackageImpl#getAssuranceCasePackage()
	 * @generated
	 */
	int ASSURANCE_CASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__ABSTRACT_FORM = Base_Package.ARTIFACT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__IMPLEMENTATION_CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assurance Case Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__INTERFACE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Terminology Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Assurance Case Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Assurance Case Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_OPERATION_COUNT = Base_Package.ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assuranceCase.impl.AssuranceCasePackageBindingImpl <em>Assurance Case Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assuranceCase.impl.AssuranceCasePackageBindingImpl
	 * @see assuranceCase.impl.AssuranceCase_PackageImpl#getAssuranceCasePackageBinding()
	 * @generated
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__GID = ASSURANCE_CASE_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__IS_CITATION = ASSURANCE_CASE_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__IS_ABSTRACT = ASSURANCE_CASE_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__CITED_ELEMENT = ASSURANCE_CASE_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__ABSTRACT_FORM = ASSURANCE_CASE_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__NAME = ASSURANCE_CASE_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__DESCRIPTION = ASSURANCE_CASE_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT = ASSURANCE_CASE_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__NOTE = ASSURANCE_CASE_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__TAGGED_VALUE = ASSURANCE_CASE_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assurance Case Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__ASSURANCE_CASE_PACKAGE = ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__INTERFACE = ASSURANCE_CASE_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Artifact Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__ARTIFACT_PACKAGE = ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__ARGUMENT_PACKAGE = ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Terminology Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__TERMINOLOGY_PACKAGE = ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING__PARTICIPANT_PACKAGE = ASSURANCE_CASE_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assurance Case Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING_FEATURE_COUNT = ASSURANCE_CASE_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assurance Case Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_BINDING_OPERATION_COUNT = ASSURANCE_CASE_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assuranceCase.impl.AssuranceCasePackageInterfaceImpl <em>Assurance Case Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assuranceCase.impl.AssuranceCasePackageInterfaceImpl
	 * @see assuranceCase.impl.AssuranceCase_PackageImpl#getAssuranceCasePackageInterface()
	 * @generated
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__GID = ASSURANCE_CASE_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__IS_CITATION = ASSURANCE_CASE_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__IS_ABSTRACT = ASSURANCE_CASE_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__CITED_ELEMENT = ASSURANCE_CASE_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__ABSTRACT_FORM = ASSURANCE_CASE_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__NAME = ASSURANCE_CASE_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__DESCRIPTION = ASSURANCE_CASE_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__IMPLEMENTATION_CONSTRAINT = ASSURANCE_CASE_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__NOTE = ASSURANCE_CASE_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__TAGGED_VALUE = ASSURANCE_CASE_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assurance Case Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__ASSURANCE_CASE_PACKAGE = ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__INTERFACE = ASSURANCE_CASE_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Artifact Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__ARTIFACT_PACKAGE = ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Argument Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__ARGUMENT_PACKAGE = ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE;

	/**
	 * The feature id for the '<em><b>Terminology Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__TERMINOLOGY_PACKAGE = ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE__IMPLEMENTS = ASSURANCE_CASE_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assurance Case Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE_FEATURE_COUNT = ASSURANCE_CASE_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assurance Case Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_PACKAGE_INTERFACE_OPERATION_COUNT = ASSURANCE_CASE_PACKAGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link assuranceCase.AssuranceCasePackage <em>Assurance Case Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assurance Case Package</em>'.
	 * @see assuranceCase.AssuranceCasePackage
	 * @generated
	 */
	EClass getAssuranceCasePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link assuranceCase.AssuranceCasePackage#getAssuranceCasePackage <em>Assurance Case Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assurance Case Package</em>'.
	 * @see assuranceCase.AssuranceCasePackage#getAssuranceCasePackage()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_AssuranceCasePackage();

	/**
	 * Returns the meta object for the reference list '{@link assuranceCase.AssuranceCasePackage#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface</em>'.
	 * @see assuranceCase.AssuranceCasePackage#getInterface()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link assuranceCase.AssuranceCasePackage#getArtifactPackage <em>Artifact Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Package</em>'.
	 * @see assuranceCase.AssuranceCasePackage#getArtifactPackage()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_ArtifactPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link assuranceCase.AssuranceCasePackage#getArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Package</em>'.
	 * @see assuranceCase.AssuranceCasePackage#getArgumentPackage()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_ArgumentPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link assuranceCase.AssuranceCasePackage#getTerminologyPackage <em>Terminology Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Package</em>'.
	 * @see assuranceCase.AssuranceCasePackage#getTerminologyPackage()
	 * @see #getAssuranceCasePackage()
	 * @generated
	 */
	EReference getAssuranceCasePackage_TerminologyPackage();

	/**
	 * Returns the meta object for class '{@link assuranceCase.AssuranceCasePackageBinding <em>Assurance Case Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assurance Case Package Binding</em>'.
	 * @see assuranceCase.AssuranceCasePackageBinding
	 * @generated
	 */
	EClass getAssuranceCasePackageBinding();

	/**
	 * Returns the meta object for the reference list '{@link assuranceCase.AssuranceCasePackageBinding#getParticipantPackage <em>Participant Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Package</em>'.
	 * @see assuranceCase.AssuranceCasePackageBinding#getParticipantPackage()
	 * @see #getAssuranceCasePackageBinding()
	 * @generated
	 */
	EReference getAssuranceCasePackageBinding_ParticipantPackage();

	/**
	 * Returns the meta object for class '{@link assuranceCase.AssuranceCasePackageInterface <em>Assurance Case Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assurance Case Package Interface</em>'.
	 * @see assuranceCase.AssuranceCasePackageInterface
	 * @generated
	 */
	EClass getAssuranceCasePackageInterface();

	/**
	 * Returns the meta object for the reference '{@link assuranceCase.AssuranceCasePackageInterface#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see assuranceCase.AssuranceCasePackageInterface#getImplements()
	 * @see #getAssuranceCasePackageInterface()
	 * @generated
	 */
	EReference getAssuranceCasePackageInterface_Implements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssuranceCase_Factory getAssuranceCase_Factory();

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
		 * The meta object literal for the '{@link assuranceCase.impl.AssuranceCasePackageImpl <em>Assurance Case Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assuranceCase.impl.AssuranceCasePackageImpl
		 * @see assuranceCase.impl.AssuranceCase_PackageImpl#getAssuranceCasePackage()
		 * @generated
		 */
		EClass ASSURANCE_CASE_PACKAGE = eINSTANCE.getAssuranceCasePackage();

		/**
		 * The meta object literal for the '<em><b>Assurance Case Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE = eINSTANCE.getAssuranceCasePackage_AssuranceCasePackage();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__INTERFACE = eINSTANCE.getAssuranceCasePackage_Interface();

		/**
		 * The meta object literal for the '<em><b>Artifact Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE = eINSTANCE.getAssuranceCasePackage_ArtifactPackage();

		/**
		 * The meta object literal for the '<em><b>Argument Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE = eINSTANCE.getAssuranceCasePackage_ArgumentPackage();

		/**
		 * The meta object literal for the '<em><b>Terminology Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE = eINSTANCE.getAssuranceCasePackage_TerminologyPackage();

		/**
		 * The meta object literal for the '{@link assuranceCase.impl.AssuranceCasePackageBindingImpl <em>Assurance Case Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assuranceCase.impl.AssuranceCasePackageBindingImpl
		 * @see assuranceCase.impl.AssuranceCase_PackageImpl#getAssuranceCasePackageBinding()
		 * @generated
		 */
		EClass ASSURANCE_CASE_PACKAGE_BINDING = eINSTANCE.getAssuranceCasePackageBinding();

		/**
		 * The meta object literal for the '<em><b>Participant Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE_BINDING__PARTICIPANT_PACKAGE = eINSTANCE.getAssuranceCasePackageBinding_ParticipantPackage();

		/**
		 * The meta object literal for the '{@link assuranceCase.impl.AssuranceCasePackageInterfaceImpl <em>Assurance Case Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assuranceCase.impl.AssuranceCasePackageInterfaceImpl
		 * @see assuranceCase.impl.AssuranceCase_PackageImpl#getAssuranceCasePackageInterface()
		 * @generated
		 */
		EClass ASSURANCE_CASE_PACKAGE_INTERFACE = eINSTANCE.getAssuranceCasePackageInterface();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_PACKAGE_INTERFACE__IMPLEMENTS = eINSTANCE.getAssuranceCasePackageInterface_Implements();

	}

} //AssuranceCase_Package
