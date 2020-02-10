/**
 */
package top.base.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import top.architecture.ArchitecturePackage;

import top.architecture.impl.ArchitecturePackageImpl;

import top.argumentation.ArgumentationPackage;

import top.argumentation.impl.ArgumentationPackageImpl;

import top.artifact.Artifact_Package;

import top.artifact.impl.Artifact_PackageImpl;

import top.assuranceCase.AssuranceCase_Package;

import top.assuranceCase.impl.AssuranceCase_PackageImpl;

import top.base.ArtifactElement;
import top.base.BaseFactory;
import top.base.BasePackage;
import top.base.Description;
import top.base.Element;
import top.base.ExpressionLangString;
import top.base.ImplementationConstraint;
import top.base.LangString;
import top.base.ModelElement;
import top.base.MultiLangString;
import top.base.Note;
import top.base.SACMElement;
import top.base.TaggedValue;
import top.base.UtilityElement;

import top.dependability.Dependability_Package;

import top.dependability.impl.Dependability_PackageImpl;

import top.failureLogic.FailureLogic_Package;

import top.failureLogic.impl.FailureLogic_PackageImpl;

import top.integration.IntegrationPackage;

import top.integration.impl.IntegrationPackageImpl;

import top.odeBase.OdeBasePackage;

import top.odeBase.impl.OdeBasePackageImpl;

import top.terminology.Terminology_Package;

import top.terminology.impl.Terminology_PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasePackageImpl extends EPackageImpl implements BasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass langStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionLangStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiLangStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sacmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactElementEClass = null;

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
	 * @see top.base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, BaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init() {
		if (isInited) return (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Artifact_PackageImpl theArtifact_Package = (Artifact_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) instanceof Artifact_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) : Artifact_Package.eINSTANCE);
		Terminology_PackageImpl theTerminology_Package = (Terminology_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI) instanceof Terminology_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI) : Terminology_Package.eINSTANCE);
		ArgumentationPackageImpl theArgumentationPackage = (ArgumentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) instanceof ArgumentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) : ArgumentationPackage.eINSTANCE);
		AssuranceCase_PackageImpl theAssuranceCase_Package = (AssuranceCase_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI) instanceof AssuranceCase_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI) : AssuranceCase_Package.eINSTANCE);
		OdeBasePackageImpl theOdeBasePackage = (OdeBasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) instanceof OdeBasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) : OdeBasePackage.eINSTANCE);
		IntegrationPackageImpl theIntegrationPackage = (IntegrationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) instanceof IntegrationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) : IntegrationPackage.eINSTANCE);
		FailureLogic_PackageImpl theFailureLogic_Package = (FailureLogic_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI) instanceof FailureLogic_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI) : FailureLogic_Package.eINSTANCE);
		Dependability_PackageImpl theDependability_Package = (Dependability_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) instanceof Dependability_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) : Dependability_Package.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theArtifact_Package.createPackageContents();
		theTerminology_Package.createPackageContents();
		theArgumentationPackage.createPackageContents();
		theAssuranceCase_Package.createPackageContents();
		theOdeBasePackage.createPackageContents();
		theIntegrationPackage.createPackageContents();
		theFailureLogic_Package.createPackageContents();
		theDependability_Package.createPackageContents();
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theArtifact_Package.initializePackageContents();
		theTerminology_Package.initializePackageContents();
		theArgumentationPackage.initializePackageContents();
		theAssuranceCase_Package.initializePackageContents();
		theOdeBasePackage.initializePackageContents();
		theIntegrationPackage.initializePackageContents();
		theFailureLogic_Package.initializePackageContents();
		theDependability_Package.initializePackageContents();
		theArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLangString() {
		return langStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangString_Lang() {
		return (EAttribute)langStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangString_Content() {
		return (EAttribute)langStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionLangString() {
		return expressionLangStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionLangString_Expression() {
		return (EReference)expressionLangStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiLangString() {
		return multiLangStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiLangString_Value() {
		return (EReference)multiLangStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSACMElement() {
		return sacmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSACMElement_Gid() {
		return (EAttribute)sacmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSACMElement_IsCitation() {
		return (EAttribute)sacmElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSACMElement_IsAbstract() {
		return (EAttribute)sacmElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSACMElement_CitedElement() {
		return (EReference)sacmElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSACMElement_AbstractForm() {
		return (EReference)sacmElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilityElement() {
		return utilityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilityElement_Content() {
		return (EReference)utilityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationConstraint() {
		return implementationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaggedValue() {
		return taggedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaggedValue_Key() {
		return (EReference)taggedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Name() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Description() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_ImplementationConstraint() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Note() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_TaggedValue() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactElement() {
		return artifactElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory getBaseFactory() {
		return (BaseFactory)getEFactoryInstance();
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
		elementEClass = createEClass(ELEMENT);

		langStringEClass = createEClass(LANG_STRING);
		createEAttribute(langStringEClass, LANG_STRING__LANG);
		createEAttribute(langStringEClass, LANG_STRING__CONTENT);

		expressionLangStringEClass = createEClass(EXPRESSION_LANG_STRING);
		createEReference(expressionLangStringEClass, EXPRESSION_LANG_STRING__EXPRESSION);

		multiLangStringEClass = createEClass(MULTI_LANG_STRING);
		createEReference(multiLangStringEClass, MULTI_LANG_STRING__VALUE);

		sacmElementEClass = createEClass(SACM_ELEMENT);
		createEAttribute(sacmElementEClass, SACM_ELEMENT__GID);
		createEAttribute(sacmElementEClass, SACM_ELEMENT__IS_CITATION);
		createEAttribute(sacmElementEClass, SACM_ELEMENT__IS_ABSTRACT);
		createEReference(sacmElementEClass, SACM_ELEMENT__CITED_ELEMENT);
		createEReference(sacmElementEClass, SACM_ELEMENT__ABSTRACT_FORM);

		utilityElementEClass = createEClass(UTILITY_ELEMENT);
		createEReference(utilityElementEClass, UTILITY_ELEMENT__CONTENT);

		descriptionEClass = createEClass(DESCRIPTION);

		implementationConstraintEClass = createEClass(IMPLEMENTATION_CONSTRAINT);

		noteEClass = createEClass(NOTE);

		taggedValueEClass = createEClass(TAGGED_VALUE);
		createEReference(taggedValueEClass, TAGGED_VALUE__KEY);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__NAME);
		createEReference(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEReference(modelElementEClass, MODEL_ELEMENT__IMPLEMENTATION_CONSTRAINT);
		createEReference(modelElementEClass, MODEL_ELEMENT__NOTE);
		createEReference(modelElementEClass, MODEL_ELEMENT__TAGGED_VALUE);

		artifactElementEClass = createEClass(ARTIFACT_ELEMENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		langStringEClass.getESuperTypes().add(this.getElement());
		expressionLangStringEClass.getESuperTypes().add(this.getLangString());
		multiLangStringEClass.getESuperTypes().add(this.getElement());
		sacmElementEClass.getESuperTypes().add(this.getElement());
		utilityElementEClass.getESuperTypes().add(this.getSACMElement());
		descriptionEClass.getESuperTypes().add(this.getUtilityElement());
		implementationConstraintEClass.getESuperTypes().add(this.getUtilityElement());
		noteEClass.getESuperTypes().add(this.getUtilityElement());
		taggedValueEClass.getESuperTypes().add(this.getUtilityElement());
		modelElementEClass.getESuperTypes().add(this.getSACMElement());
		artifactElementEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(langStringEClass, LangString.class, "LangString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLangString_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, LangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangString_Content(), ecorePackage.getEString(), "content", null, 0, 1, LangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionLangStringEClass, ExpressionLangString.class, "ExpressionLangString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionLangString_Expression(), this.getArtifactElement(), null, "expression", null, 1, 1, ExpressionLangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiLangStringEClass, MultiLangString.class, "MultiLangString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiLangString_Value(), this.getLangString(), null, "value", null, 1, -1, MultiLangString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sacmElementEClass, SACMElement.class, "SACMElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSACMElement_Gid(), ecorePackage.getEString(), "gid", null, 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSACMElement_IsCitation(), ecorePackage.getEBoolean(), "isCitation", "false", 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSACMElement_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", "false", 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSACMElement_CitedElement(), this.getSACMElement(), null, "citedElement", null, 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSACMElement_AbstractForm(), this.getSACMElement(), null, "abstractForm", null, 0, 1, SACMElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilityElementEClass, UtilityElement.class, "UtilityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUtilityElement_Content(), this.getMultiLangString(), null, "content", null, 0, 1, UtilityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationConstraintEClass, ImplementationConstraint.class, "ImplementationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taggedValueEClass, TaggedValue.class, "TaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaggedValue_Key(), this.getMultiLangString(), null, "key", null, 1, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_Name(), this.getLangString(), null, "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Description(), this.getDescription(), null, "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_ImplementationConstraint(), this.getImplementationConstraint(), null, "implementationConstraint", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Note(), this.getNote(), null, "note", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_TaggedValue(), this.getTaggedValue(), null, "taggedValue", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactElementEClass, ArtifactElement.class, "ArtifactElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BasePackageImpl
