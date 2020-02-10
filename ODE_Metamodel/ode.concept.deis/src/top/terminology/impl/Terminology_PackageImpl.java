/**
 */
package top.terminology.impl;

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

import top.base.BasePackage;

import top.base.impl.BasePackageImpl;

import top.dependability.Dependability_Package;

import top.dependability.impl.Dependability_PackageImpl;

import top.failureLogic.FailureLogic_Package;

import top.failureLogic.impl.FailureLogic_PackageImpl;

import top.integration.IntegrationPackage;

import top.integration.impl.IntegrationPackageImpl;

import top.odeBase.OdeBasePackage;

import top.odeBase.impl.OdeBasePackageImpl;

import top.terminology.Category;
import top.terminology.Expression;
import top.terminology.ExpressionElement;
import top.terminology.Term;
import top.terminology.TerminologyAsset;
import top.terminology.TerminologyElement;
import top.terminology.TerminologyGroup;
import top.terminology.TerminologyPackage;
import top.terminology.TerminologyPackageBinding;
import top.terminology.TerminologyPackageInterface;
import top.terminology.Terminology_Factory;
import top.terminology.Terminology_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Terminology_PackageImpl extends EPackageImpl implements Terminology_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

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
	 * @see top.terminology.Terminology_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Terminology_PackageImpl() {
		super(eNS_URI, Terminology_Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Terminology_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Terminology_Package init() {
		if (isInited) return (Terminology_Package)EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI);

		// Obtain or create and register package
		Terminology_PackageImpl theTerminology_Package = (Terminology_PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Terminology_PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Terminology_PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		Artifact_PackageImpl theArtifact_Package = (Artifact_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) instanceof Artifact_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Artifact_Package.eNS_URI) : Artifact_Package.eINSTANCE);
		ArgumentationPackageImpl theArgumentationPackage = (ArgumentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) instanceof ArgumentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI) : ArgumentationPackage.eINSTANCE);
		AssuranceCase_PackageImpl theAssuranceCase_Package = (AssuranceCase_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI) instanceof AssuranceCase_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssuranceCase_Package.eNS_URI) : AssuranceCase_Package.eINSTANCE);
		OdeBasePackageImpl theOdeBasePackage = (OdeBasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) instanceof OdeBasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OdeBasePackage.eNS_URI) : OdeBasePackage.eINSTANCE);
		IntegrationPackageImpl theIntegrationPackage = (IntegrationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) instanceof IntegrationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegrationPackage.eNS_URI) : IntegrationPackage.eINSTANCE);
		FailureLogic_PackageImpl theFailureLogic_Package = (FailureLogic_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI) instanceof FailureLogic_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FailureLogic_Package.eNS_URI) : FailureLogic_Package.eINSTANCE);
		Dependability_PackageImpl theDependability_Package = (Dependability_PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) instanceof Dependability_PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Dependability_Package.eNS_URI) : Dependability_Package.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);

		// Create package meta-data objects
		theTerminology_Package.createPackageContents();
		theBasePackage.createPackageContents();
		theArtifact_Package.createPackageContents();
		theArgumentationPackage.createPackageContents();
		theAssuranceCase_Package.createPackageContents();
		theOdeBasePackage.createPackageContents();
		theIntegrationPackage.createPackageContents();
		theFailureLogic_Package.createPackageContents();
		theDependability_Package.createPackageContents();
		theArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theTerminology_Package.initializePackageContents();
		theBasePackage.initializePackageContents();
		theArtifact_Package.initializePackageContents();
		theArgumentationPackage.initializePackageContents();
		theAssuranceCase_Package.initializePackageContents();
		theOdeBasePackage.initializePackageContents();
		theIntegrationPackage.initializePackageContents();
		theFailureLogic_Package.initializePackageContents();
		theDependability_Package.initializePackageContents();
		theArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTerminology_Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Terminology_Package.eNS_URI, theTerminology_Package);
		return theTerminology_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyElement() {
		return terminologyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyGroup() {
		return terminologyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyGroup_TerminologyElement() {
		return (EReference)terminologyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyPackage() {
		return terminologyPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyPackage_TerminologyElement() {
		return (EReference)terminologyPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyPackageBinding() {
		return terminologyPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyPackageBinding_ParticipantPackage() {
		return (EReference)terminologyPackageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyPackageInterface() {
		return terminologyPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyPackageInterface_Implements() {
		return (EReference)terminologyPackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyAsset() {
		return terminologyAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Category() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionElement() {
		return expressionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionElement_Value() {
		return (EAttribute)expressionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionElement_Category() {
		return (EReference)expressionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Element() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerm_ExternalReference() {
		return (EAttribute)termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Origin() {
		return (EReference)termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminology_Factory getTerminology_Factory() {
		return (Terminology_Factory)getEFactoryInstance();
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
		terminologyElementEClass = createEClass(TERMINOLOGY_ELEMENT);

		terminologyGroupEClass = createEClass(TERMINOLOGY_GROUP);
		createEReference(terminologyGroupEClass, TERMINOLOGY_GROUP__TERMINOLOGY_ELEMENT);

		terminologyPackageEClass = createEClass(TERMINOLOGY_PACKAGE);
		createEReference(terminologyPackageEClass, TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT);

		terminologyPackageBindingEClass = createEClass(TERMINOLOGY_PACKAGE_BINDING);
		createEReference(terminologyPackageBindingEClass, TERMINOLOGY_PACKAGE_BINDING__PARTICIPANT_PACKAGE);

		terminologyPackageInterfaceEClass = createEClass(TERMINOLOGY_PACKAGE_INTERFACE);
		createEReference(terminologyPackageInterfaceEClass, TERMINOLOGY_PACKAGE_INTERFACE__IMPLEMENTS);

		terminologyAssetEClass = createEClass(TERMINOLOGY_ASSET);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__CATEGORY);

		expressionElementEClass = createEClass(EXPRESSION_ELEMENT);
		createEAttribute(expressionElementEClass, EXPRESSION_ELEMENT__VALUE);
		createEReference(expressionElementEClass, EXPRESSION_ELEMENT__CATEGORY);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__ELEMENT);

		termEClass = createEClass(TERM);
		createEAttribute(termEClass, TERM__EXTERNAL_REFERENCE);
		createEReference(termEClass, TERM__ORIGIN);
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
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		terminologyElementEClass.getESuperTypes().add(theBasePackage.getArtifactElement());
		terminologyGroupEClass.getESuperTypes().add(this.getTerminologyElement());
		terminologyPackageEClass.getESuperTypes().add(this.getTerminologyElement());
		terminologyPackageBindingEClass.getESuperTypes().add(this.getTerminologyPackage());
		terminologyPackageInterfaceEClass.getESuperTypes().add(this.getTerminologyPackage());
		terminologyAssetEClass.getESuperTypes().add(this.getTerminologyElement());
		categoryEClass.getESuperTypes().add(this.getTerminologyAsset());
		expressionElementEClass.getESuperTypes().add(this.getTerminologyAsset());
		expressionEClass.getESuperTypes().add(this.getExpressionElement());
		termEClass.getESuperTypes().add(this.getExpressionElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(terminologyElementEClass, TerminologyElement.class, "TerminologyElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(terminologyGroupEClass, TerminologyGroup.class, "TerminologyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminologyGroup_TerminologyElement(), this.getTerminologyElement(), null, "terminologyElement", null, 0, -1, TerminologyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminologyPackageEClass, TerminologyPackage.class, "TerminologyPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminologyPackage_TerminologyElement(), this.getTerminologyElement(), null, "terminologyElement", null, 0, -1, TerminologyPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminologyPackageBindingEClass, TerminologyPackageBinding.class, "TerminologyPackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminologyPackageBinding_ParticipantPackage(), this.getTerminologyPackage(), null, "participantPackage", null, 2, -1, TerminologyPackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminologyPackageInterfaceEClass, TerminologyPackageInterface.class, "TerminologyPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminologyPackageInterface_Implements(), this.getTerminologyPackage(), null, "implements", null, 1, 1, TerminologyPackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminologyAssetEClass, TerminologyAsset.class, "TerminologyAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_Category(), this.getCategory(), null, "category", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionElementEClass, ExpressionElement.class, "ExpressionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionElement_Value(), ecorePackage.getEString(), "value", null, 1, 1, ExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionElement_Category(), this.getCategory(), null, "category", null, 0, -1, ExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Element(), this.getExpressionElement(), null, "element", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerm_ExternalReference(), ecorePackage.getEString(), "externalReference", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Origin(), theBasePackage.getModelElement(), null, "origin", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Terminology_PackageImpl
