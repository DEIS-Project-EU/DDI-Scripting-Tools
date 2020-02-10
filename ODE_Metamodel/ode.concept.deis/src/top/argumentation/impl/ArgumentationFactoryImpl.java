/**
 */
package top.argumentation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import top.argumentation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationFactoryImpl extends EFactoryImpl implements ArgumentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArgumentationFactory init() {
		try {
			ArgumentationFactory theArgumentationFactory = (ArgumentationFactory)EPackage.Registry.INSTANCE.getEFactory(ArgumentationPackage.eNS_URI);
			if (theArgumentationFactory != null) {
				return theArgumentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArgumentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFactoryImpl() {
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
			case ArgumentationPackage.ARGUMENT_GROUP: return createArgumentGroup();
			case ArgumentationPackage.ARGUMENT_PACKAGE: return createArgumentPackage();
			case ArgumentationPackage.ARGUMENT_PACKAGE_INTERFACE: return createArgumentPackageInterface();
			case ArgumentationPackage.ARGUMENT_PACKAGE_BINDING: return createArgumentPackageBinding();
			case ArgumentationPackage.ARGUMENT_REASONING: return createArgumentReasoning();
			case ArgumentationPackage.CLAIM: return createClaim();
			case ArgumentationPackage.ARTIFACT_REFERENCE: return createArtifactReference();
			case ArgumentationPackage.ASSERTED_ARTIFACT_SUPPORT: return createAssertedArtifactSupport();
			case ArgumentationPackage.ASSERTED_INFERENCE: return createAssertedInference();
			case ArgumentationPackage.ASSERTED_EVIDENCE: return createAssertedEvidence();
			case ArgumentationPackage.ASSERTED_CONTEXT: return createAssertedContext();
			case ArgumentationPackage.ASSERTED_ARTIFACT_CONTEXT: return createAssertedArtifactContext();
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
			case ArgumentationPackage.ASSERTION_DECLARATION:
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
			case ArgumentationPackage.ASSERTION_DECLARATION:
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
	public ArgumentationPackage getArgumentationPackage() {
		return (ArgumentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArgumentationPackage getPackage() {
		return ArgumentationPackage.eINSTANCE;
	}

} //ArgumentationFactoryImpl
