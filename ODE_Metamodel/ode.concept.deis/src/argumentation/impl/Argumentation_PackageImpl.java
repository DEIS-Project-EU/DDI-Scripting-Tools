/**
 */
package argumentation.impl;

import argumentation.ArgumentAsset;
import argumentation.ArgumentGroup;
import argumentation.ArgumentPackage;
import argumentation.ArgumentPackageBinding;
import argumentation.ArgumentPackageInterface;
import argumentation.ArgumentReasoning;
import argumentation.ArgumentationElement;
import argumentation.Argumentation_Factory;
import argumentation.Argumentation_Package;
import argumentation.ArtifactReference;
import argumentation.AssertedArtifactContext;
import argumentation.AssertedArtifactSupport;
import argumentation.AssertedContext;
import argumentation.AssertedEvidence;
import argumentation.AssertedInference;
import argumentation.AssertedRelationship;
import argumentation.Assertion;
import argumentation.AssertionDeclaration;
import argumentation.Claim;

import base.Base_Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Argumentation_PackageImpl extends EPackageImpl implements Argumentation_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentReasoningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedArtifactSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedInferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedArtifactContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assertionDeclarationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see argumentation.Argumentation_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Argumentation_PackageImpl() {
		super(eNS_URI, Argumentation_Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Argumentation_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Argumentation_Package init() {
		if (isInited) return (Argumentation_Package)EPackage.Registry.INSTANCE.getEPackage(Argumentation_Package.eNS_URI);

		// Obtain or create and register package
		Argumentation_PackageImpl theArgumentation_Package = (Argumentation_PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Argumentation_PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Argumentation_PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Base_Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theArgumentation_Package.createPackageContents();

		// Initialize created meta-data
		theArgumentation_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArgumentation_Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Argumentation_Package.eNS_URI, theArgumentation_Package);
		return theArgumentation_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentationElement() {
		return argumentationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentationElement_Uninstantiated() {
		return (EAttribute)argumentationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentGroup() {
		return argumentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentGroup_ArgumentationElement() {
		return (EReference)argumentGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentPackage() {
		return argumentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentPackage_ArgumentationElement() {
		return (EReference)argumentPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentPackageInterface() {
		return argumentPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentPackageInterface_Implements() {
		return (EReference)argumentPackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentPackageBinding() {
		return argumentPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentPackageBinding_ParticipantPackage() {
		return (EReference)argumentPackageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentAsset() {
		return argumentAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentAsset_Content() {
		return (EReference)argumentAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_AssertionDeclaration() {
		return (EAttribute)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_MetaClaim() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentReasoning() {
		return argumentReasoningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentReasoning_Structure() {
		return (EReference)argumentReasoningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedRelationship() {
		return assertedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertedRelationship_IsCounter() {
		return (EAttribute)assertedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertedRelationship_Source() {
		return (EReference)assertedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertedRelationship_Target() {
		return (EReference)assertedRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertedRelationship_Reasoning() {
		return (EReference)assertedRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertedRelationship_Requies() {
		return (EAttribute)assertedRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactReference() {
		return artifactReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactReference_ReferencedArtifactElement() {
		return (EReference)artifactReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedArtifactSupport() {
		return assertedArtifactSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedInference() {
		return assertedInferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedEvidence() {
		return assertedEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedContext() {
		return assertedContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedArtifactContext() {
		return assertedArtifactContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssertionDeclaration() {
		return assertionDeclarationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argumentation_Factory getArgumentation_Factory() {
		return (Argumentation_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		argumentationElementEClass = createEClass(ARGUMENTATION_ELEMENT);
		createEAttribute(argumentationElementEClass, ARGUMENTATION_ELEMENT__UNINSTANTIATED);

		argumentGroupEClass = createEClass(ARGUMENT_GROUP);
		createEReference(argumentGroupEClass, ARGUMENT_GROUP__ARGUMENTATION_ELEMENT);

		argumentPackageEClass = createEClass(ARGUMENT_PACKAGE);
		createEReference(argumentPackageEClass, ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT);

		argumentPackageInterfaceEClass = createEClass(ARGUMENT_PACKAGE_INTERFACE);
		createEReference(argumentPackageInterfaceEClass, ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS);

		argumentPackageBindingEClass = createEClass(ARGUMENT_PACKAGE_BINDING);
		createEReference(argumentPackageBindingEClass, ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE);

		argumentAssetEClass = createEClass(ARGUMENT_ASSET);
		createEReference(argumentAssetEClass, ARGUMENT_ASSET__CONTENT);

		assertionEClass = createEClass(ASSERTION);
		createEAttribute(assertionEClass, ASSERTION__ASSERTION_DECLARATION);
		createEReference(assertionEClass, ASSERTION__META_CLAIM);

		argumentReasoningEClass = createEClass(ARGUMENT_REASONING);
		createEReference(argumentReasoningEClass, ARGUMENT_REASONING__STRUCTURE);

		claimEClass = createEClass(CLAIM);

		assertedRelationshipEClass = createEClass(ASSERTED_RELATIONSHIP);
		createEAttribute(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__IS_COUNTER);
		createEReference(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__SOURCE);
		createEReference(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__TARGET);
		createEReference(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__REASONING);
		createEAttribute(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__REQUIES);

		artifactReferenceEClass = createEClass(ARTIFACT_REFERENCE);
		createEReference(artifactReferenceEClass, ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT);

		assertedArtifactSupportEClass = createEClass(ASSERTED_ARTIFACT_SUPPORT);

		assertedInferenceEClass = createEClass(ASSERTED_INFERENCE);

		assertedEvidenceEClass = createEClass(ASSERTED_EVIDENCE);

		assertedContextEClass = createEClass(ASSERTED_CONTEXT);

		assertedArtifactContextEClass = createEClass(ASSERTED_ARTIFACT_CONTEXT);

		// Create enums
		assertionDeclarationEEnum = createEEnum(ASSERTION_DECLARATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		argumentationElementEClass.getESuperTypes().add(theBase_Package.getArtifactElement());
		argumentGroupEClass.getESuperTypes().add(this.getArgumentationElement());
		argumentPackageEClass.getESuperTypes().add(this.getArgumentationElement());
		argumentPackageInterfaceEClass.getESuperTypes().add(this.getArgumentPackage());
		argumentPackageBindingEClass.getESuperTypes().add(this.getArgumentPackage());
		argumentAssetEClass.getESuperTypes().add(this.getArgumentationElement());
		assertionEClass.getESuperTypes().add(this.getArgumentAsset());
		argumentReasoningEClass.getESuperTypes().add(this.getArgumentAsset());
		claimEClass.getESuperTypes().add(this.getAssertion());
		assertedRelationshipEClass.getESuperTypes().add(this.getAssertion());
		artifactReferenceEClass.getESuperTypes().add(this.getArgumentAsset());
		assertedArtifactSupportEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedInferenceEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedEvidenceEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedContextEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedArtifactContextEClass.getESuperTypes().add(this.getAssertedRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(argumentationElementEClass, ArgumentationElement.class, "ArgumentationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgumentationElement_Uninstantiated(), ecorePackage.getEBoolean(), "uninstantiated", "false", 1, 1, ArgumentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentGroupEClass, ArgumentGroup.class, "ArgumentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentGroup_ArgumentationElement(), this.getArgumentationElement(), null, "argumentationElement", null, 0, -1, ArgumentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentPackageEClass, ArgumentPackage.class, "ArgumentPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentPackage_ArgumentationElement(), this.getArgumentationElement(), null, "argumentationElement", null, 0, -1, ArgumentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentPackageInterfaceEClass, ArgumentPackageInterface.class, "ArgumentPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentPackageInterface_Implements(), this.getArgumentPackage(), null, "implements", null, 1, 1, ArgumentPackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentPackageBindingEClass, ArgumentPackageBinding.class, "ArgumentPackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentPackageBinding_ParticipantPackage(), this.getArgumentPackage(), null, "participantPackage", null, 2, -1, ArgumentPackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentAssetEClass, ArgumentAsset.class, "ArgumentAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentAsset_Content(), theBase_Package.getMultiLangString(), null, "content", null, 0, 1, ArgumentAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertion_AssertionDeclaration(), this.getAssertionDeclaration(), "assertionDeclaration", "asserted", 1, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertion_MetaClaim(), this.getClaim(), null, "metaClaim", null, 0, -1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentReasoningEClass, ArgumentReasoning.class, "ArgumentReasoning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentReasoning_Structure(), this.getArgumentPackage(), null, "structure", null, 0, 1, ArgumentReasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claimEClass, Claim.class, "Claim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedRelationshipEClass, AssertedRelationship.class, "AssertedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertedRelationship_IsCounter(), ecorePackage.getEBoolean(), "isCounter", "false", 1, 1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertedRelationship_Source(), this.getArgumentAsset(), null, "source", null, 1, -1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertedRelationship_Target(), this.getArgumentAsset(), null, "target", null, 1, -1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertedRelationship_Reasoning(), this.getArgumentReasoning(), null, "reasoning", null, 0, 1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertedRelationship_Requies(), ecorePackage.getEInt(), "requies", "0", 0, 1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactReferenceEClass, ArtifactReference.class, "ArtifactReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactReference_ReferencedArtifactElement(), theBase_Package.getArtifactElement(), null, "referencedArtifactElement", null, 0, -1, ArtifactReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertedArtifactSupportEClass, AssertedArtifactSupport.class, "AssertedArtifactSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedInferenceEClass, AssertedInference.class, "AssertedInference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedEvidenceEClass, AssertedEvidence.class, "AssertedEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedContextEClass, AssertedContext.class, "AssertedContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedArtifactContextEClass, AssertedArtifactContext.class, "AssertedArtifactContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(assertionDeclarationEEnum, AssertionDeclaration.class, "AssertionDeclaration");
		addEEnumLiteral(assertionDeclarationEEnum, AssertionDeclaration.ASSERTED);
		addEEnumLiteral(assertionDeclarationEEnum, AssertionDeclaration.NEEDS_SUPPORT);
		addEEnumLiteral(assertionDeclarationEEnum, AssertionDeclaration.ASSUMED);
		addEEnumLiteral(assertionDeclarationEEnum, AssertionDeclaration.AXIOMATIC);
		addEEnumLiteral(assertionDeclarationEEnum, AssertionDeclaration.DEFEATED);
		addEEnumLiteral(assertionDeclarationEEnum, AssertionDeclaration.AS_CITED);

		// Create resource
		createResource(eNS_URI);
	}

} //Argumentation_PackageImpl
