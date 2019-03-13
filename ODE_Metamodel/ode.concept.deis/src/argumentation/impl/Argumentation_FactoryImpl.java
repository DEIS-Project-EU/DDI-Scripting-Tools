/**
 */
package argumentation.impl;

import argumentation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Argumentation_FactoryImpl extends EFactoryImpl implements Argumentation_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Argumentation_Factory init() {
		try {
			Argumentation_Factory theArgumentation_Factory = (Argumentation_Factory)EPackage.Registry.INSTANCE.getEFactory(Argumentation_Package.eNS_URI);
			if (theArgumentation_Factory != null) {
				return theArgumentation_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Argumentation_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argumentation_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Argumentation_Package.ARGUMENT_GROUP: return createArgumentGroup();
			case Argumentation_Package.ARGUMENT_PACKAGE: return createArgumentPackage();
			case Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE: return createArgumentPackageInterface();
			case Argumentation_Package.ARGUMENT_PACKAGE_BINDING: return createArgumentPackageBinding();
			case Argumentation_Package.ARGUMENT_REASONING: return createArgumentReasoning();
			case Argumentation_Package.CLAIM: return createClaim();
			case Argumentation_Package.ARTIFACT_REFERENCE: return createArtifactReference();
			case Argumentation_Package.ASSERTED_ARTIFACT_SUPPORT: return createAssertedArtifactSupport();
			case Argumentation_Package.ASSERTED_INFERENCE: return createAssertedInference();
			case Argumentation_Package.ASSERTED_EVIDENCE: return createAssertedEvidence();
			case Argumentation_Package.ASSERTED_CONTEXT: return createAssertedContext();
			case Argumentation_Package.ASSERTED_ARTIFACT_CONTEXT: return createAssertedArtifactContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Argumentation_Package.ASSERTION_DECLARATION:
				return createAssertionDeclarationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Argumentation_Package.ASSERTION_DECLARATION:
				return convertAssertionDeclarationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentGroup createArgumentGroup() {
		ArgumentGroupImpl argumentGroup = new ArgumentGroupImpl();
		return argumentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackage createArgumentPackage() {
		ArgumentPackageImpl argumentPackage = new ArgumentPackageImpl();
		return argumentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackageInterface createArgumentPackageInterface() {
		ArgumentPackageInterfaceImpl argumentPackageInterface = new ArgumentPackageInterfaceImpl();
		return argumentPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackageBinding createArgumentPackageBinding() {
		ArgumentPackageBindingImpl argumentPackageBinding = new ArgumentPackageBindingImpl();
		return argumentPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentReasoning createArgumentReasoning() {
		ArgumentReasoningImpl argumentReasoning = new ArgumentReasoningImpl();
		return argumentReasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactReference createArtifactReference() {
		ArtifactReferenceImpl artifactReference = new ArtifactReferenceImpl();
		return artifactReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedArtifactSupport createAssertedArtifactSupport() {
		AssertedArtifactSupportImpl assertedArtifactSupport = new AssertedArtifactSupportImpl();
		return assertedArtifactSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedInference createAssertedInference() {
		AssertedInferenceImpl assertedInference = new AssertedInferenceImpl();
		return assertedInference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedEvidence createAssertedEvidence() {
		AssertedEvidenceImpl assertedEvidence = new AssertedEvidenceImpl();
		return assertedEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedContext createAssertedContext() {
		AssertedContextImpl assertedContext = new AssertedContextImpl();
		return assertedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedArtifactContext createAssertedArtifactContext() {
		AssertedArtifactContextImpl assertedArtifactContext = new AssertedArtifactContextImpl();
		return assertedArtifactContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDeclaration createAssertionDeclarationFromString(EDataType eDataType, String initialValue) {
		AssertionDeclaration result = AssertionDeclaration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssertionDeclarationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argumentation_Package getArgumentation_Package() {
		return (Argumentation_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Argumentation_Package getPackage() {
		return Argumentation_Package.eINSTANCE;
	}

} //Argumentation_FactoryImpl
