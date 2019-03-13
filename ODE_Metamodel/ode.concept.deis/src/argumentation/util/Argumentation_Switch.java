/**
 */
package argumentation.util;

import argumentation.*;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;
import base.SACMElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see argumentation.Argumentation_Package
 * @generated
 */
public class Argumentation_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Argumentation_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argumentation_Switch() {
		if (modelPackage == null) {
			modelPackage = Argumentation_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Argumentation_Package.ARGUMENTATION_ELEMENT: {
				ArgumentationElement argumentationElement = (ArgumentationElement)theEObject;
				T result = caseArgumentationElement(argumentationElement);
				if (result == null) result = caseArtifactElement(argumentationElement);
				if (result == null) result = caseModelElement(argumentationElement);
				if (result == null) result = caseSACMElement(argumentationElement);
				if (result == null) result = caseElement(argumentationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ARGUMENT_GROUP: {
				ArgumentGroup argumentGroup = (ArgumentGroup)theEObject;
				T result = caseArgumentGroup(argumentGroup);
				if (result == null) result = caseArgumentationElement(argumentGroup);
				if (result == null) result = caseArtifactElement(argumentGroup);
				if (result == null) result = caseModelElement(argumentGroup);
				if (result == null) result = caseSACMElement(argumentGroup);
				if (result == null) result = caseElement(argumentGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ARGUMENT_PACKAGE: {
				ArgumentPackage argumentPackage = (ArgumentPackage)theEObject;
				T result = caseArgumentPackage(argumentPackage);
				if (result == null) result = caseArgumentationElement(argumentPackage);
				if (result == null) result = caseArtifactElement(argumentPackage);
				if (result == null) result = caseModelElement(argumentPackage);
				if (result == null) result = caseSACMElement(argumentPackage);
				if (result == null) result = caseElement(argumentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE: {
				ArgumentPackageInterface argumentPackageInterface = (ArgumentPackageInterface)theEObject;
				T result = caseArgumentPackageInterface(argumentPackageInterface);
				if (result == null) result = caseArgumentPackage(argumentPackageInterface);
				if (result == null) result = caseArgumentationElement(argumentPackageInterface);
				if (result == null) result = caseArtifactElement(argumentPackageInterface);
				if (result == null) result = caseModelElement(argumentPackageInterface);
				if (result == null) result = caseSACMElement(argumentPackageInterface);
				if (result == null) result = caseElement(argumentPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ARGUMENT_PACKAGE_BINDING: {
				ArgumentPackageBinding argumentPackageBinding = (ArgumentPackageBinding)theEObject;
				T result = caseArgumentPackageBinding(argumentPackageBinding);
				if (result == null) result = caseArgumentPackage(argumentPackageBinding);
				if (result == null) result = caseArgumentationElement(argumentPackageBinding);
				if (result == null) result = caseArtifactElement(argumentPackageBinding);
				if (result == null) result = caseModelElement(argumentPackageBinding);
				if (result == null) result = caseSACMElement(argumentPackageBinding);
				if (result == null) result = caseElement(argumentPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ARGUMENT_ASSET: {
				ArgumentAsset argumentAsset = (ArgumentAsset)theEObject;
				T result = caseArgumentAsset(argumentAsset);
				if (result == null) result = caseArgumentationElement(argumentAsset);
				if (result == null) result = caseArtifactElement(argumentAsset);
				if (result == null) result = caseModelElement(argumentAsset);
				if (result == null) result = caseSACMElement(argumentAsset);
				if (result == null) result = caseElement(argumentAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseArgumentAsset(assertion);
				if (result == null) result = caseArgumentationElement(assertion);
				if (result == null) result = caseArtifactElement(assertion);
				if (result == null) result = caseModelElement(assertion);
				if (result == null) result = caseSACMElement(assertion);
				if (result == null) result = caseElement(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ARGUMENT_REASONING: {
				ArgumentReasoning argumentReasoning = (ArgumentReasoning)theEObject;
				T result = caseArgumentReasoning(argumentReasoning);
				if (result == null) result = caseArgumentAsset(argumentReasoning);
				if (result == null) result = caseArgumentationElement(argumentReasoning);
				if (result == null) result = caseArtifactElement(argumentReasoning);
				if (result == null) result = caseModelElement(argumentReasoning);
				if (result == null) result = caseSACMElement(argumentReasoning);
				if (result == null) result = caseElement(argumentReasoning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseAssertion(claim);
				if (result == null) result = caseArgumentAsset(claim);
				if (result == null) result = caseArgumentationElement(claim);
				if (result == null) result = caseArtifactElement(claim);
				if (result == null) result = caseModelElement(claim);
				if (result == null) result = caseSACMElement(claim);
				if (result == null) result = caseElement(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ASSERTED_RELATIONSHIP: {
				AssertedRelationship assertedRelationship = (AssertedRelationship)theEObject;
				T result = caseAssertedRelationship(assertedRelationship);
				if (result == null) result = caseAssertion(assertedRelationship);
				if (result == null) result = caseArgumentAsset(assertedRelationship);
				if (result == null) result = caseArgumentationElement(assertedRelationship);
				if (result == null) result = caseArtifactElement(assertedRelationship);
				if (result == null) result = caseModelElement(assertedRelationship);
				if (result == null) result = caseSACMElement(assertedRelationship);
				if (result == null) result = caseElement(assertedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ARTIFACT_REFERENCE: {
				ArtifactReference artifactReference = (ArtifactReference)theEObject;
				T result = caseArtifactReference(artifactReference);
				if (result == null) result = caseArgumentAsset(artifactReference);
				if (result == null) result = caseArgumentationElement(artifactReference);
				if (result == null) result = caseArtifactElement(artifactReference);
				if (result == null) result = caseModelElement(artifactReference);
				if (result == null) result = caseSACMElement(artifactReference);
				if (result == null) result = caseElement(artifactReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ASSERTED_ARTIFACT_SUPPORT: {
				AssertedArtifactSupport assertedArtifactSupport = (AssertedArtifactSupport)theEObject;
				T result = caseAssertedArtifactSupport(assertedArtifactSupport);
				if (result == null) result = caseAssertedRelationship(assertedArtifactSupport);
				if (result == null) result = caseAssertion(assertedArtifactSupport);
				if (result == null) result = caseArgumentAsset(assertedArtifactSupport);
				if (result == null) result = caseArgumentationElement(assertedArtifactSupport);
				if (result == null) result = caseArtifactElement(assertedArtifactSupport);
				if (result == null) result = caseModelElement(assertedArtifactSupport);
				if (result == null) result = caseSACMElement(assertedArtifactSupport);
				if (result == null) result = caseElement(assertedArtifactSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ASSERTED_INFERENCE: {
				AssertedInference assertedInference = (AssertedInference)theEObject;
				T result = caseAssertedInference(assertedInference);
				if (result == null) result = caseAssertedRelationship(assertedInference);
				if (result == null) result = caseAssertion(assertedInference);
				if (result == null) result = caseArgumentAsset(assertedInference);
				if (result == null) result = caseArgumentationElement(assertedInference);
				if (result == null) result = caseArtifactElement(assertedInference);
				if (result == null) result = caseModelElement(assertedInference);
				if (result == null) result = caseSACMElement(assertedInference);
				if (result == null) result = caseElement(assertedInference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ASSERTED_EVIDENCE: {
				AssertedEvidence assertedEvidence = (AssertedEvidence)theEObject;
				T result = caseAssertedEvidence(assertedEvidence);
				if (result == null) result = caseAssertedRelationship(assertedEvidence);
				if (result == null) result = caseAssertion(assertedEvidence);
				if (result == null) result = caseArgumentAsset(assertedEvidence);
				if (result == null) result = caseArgumentationElement(assertedEvidence);
				if (result == null) result = caseArtifactElement(assertedEvidence);
				if (result == null) result = caseModelElement(assertedEvidence);
				if (result == null) result = caseSACMElement(assertedEvidence);
				if (result == null) result = caseElement(assertedEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ASSERTED_CONTEXT: {
				AssertedContext assertedContext = (AssertedContext)theEObject;
				T result = caseAssertedContext(assertedContext);
				if (result == null) result = caseAssertedRelationship(assertedContext);
				if (result == null) result = caseAssertion(assertedContext);
				if (result == null) result = caseArgumentAsset(assertedContext);
				if (result == null) result = caseArgumentationElement(assertedContext);
				if (result == null) result = caseArtifactElement(assertedContext);
				if (result == null) result = caseModelElement(assertedContext);
				if (result == null) result = caseSACMElement(assertedContext);
				if (result == null) result = caseElement(assertedContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Argumentation_Package.ASSERTED_ARTIFACT_CONTEXT: {
				AssertedArtifactContext assertedArtifactContext = (AssertedArtifactContext)theEObject;
				T result = caseAssertedArtifactContext(assertedArtifactContext);
				if (result == null) result = caseAssertedRelationship(assertedArtifactContext);
				if (result == null) result = caseAssertion(assertedArtifactContext);
				if (result == null) result = caseArgumentAsset(assertedArtifactContext);
				if (result == null) result = caseArgumentationElement(assertedArtifactContext);
				if (result == null) result = caseArtifactElement(assertedArtifactContext);
				if (result == null) result = caseModelElement(assertedArtifactContext);
				if (result == null) result = caseSACMElement(assertedArtifactContext);
				if (result == null) result = caseElement(assertedArtifactContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argumentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argumentation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentationElement(ArgumentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentGroup(ArgumentGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackage(ArgumentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackageInterface(ArgumentPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackageBinding(ArgumentPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentAsset(ArgumentAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentReasoning(ArgumentReasoning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedRelationship(AssertedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactReference(ArtifactReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Artifact Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Artifact Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedArtifactSupport(AssertedArtifactSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedInference(AssertedInference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedEvidence(AssertedEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedContext(AssertedContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Artifact Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Artifact Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedArtifactContext(AssertedArtifactContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACMElement(SACMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Argumentation_Switch
