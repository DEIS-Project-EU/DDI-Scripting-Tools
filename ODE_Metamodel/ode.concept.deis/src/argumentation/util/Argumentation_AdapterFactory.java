/**
 */
package argumentation.util;

import argumentation.*;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;
import base.SACMElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see argumentation.Argumentation_Package
 * @generated
 */
public class Argumentation_AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Argumentation_Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argumentation_AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Argumentation_Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Argumentation_Switch<Adapter> modelSwitch =
		new Argumentation_Switch<Adapter>() {
			@Override
			public Adapter caseArgumentationElement(ArgumentationElement object) {
				return createArgumentationElementAdapter();
			}
			@Override
			public Adapter caseArgumentGroup(ArgumentGroup object) {
				return createArgumentGroupAdapter();
			}
			@Override
			public Adapter caseArgumentPackage(ArgumentPackage object) {
				return createArgumentPackageAdapter();
			}
			@Override
			public Adapter caseArgumentPackageInterface(ArgumentPackageInterface object) {
				return createArgumentPackageInterfaceAdapter();
			}
			@Override
			public Adapter caseArgumentPackageBinding(ArgumentPackageBinding object) {
				return createArgumentPackageBindingAdapter();
			}
			@Override
			public Adapter caseArgumentAsset(ArgumentAsset object) {
				return createArgumentAssetAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseArgumentReasoning(ArgumentReasoning object) {
				return createArgumentReasoningAdapter();
			}
			@Override
			public Adapter caseClaim(Claim object) {
				return createClaimAdapter();
			}
			@Override
			public Adapter caseAssertedRelationship(AssertedRelationship object) {
				return createAssertedRelationshipAdapter();
			}
			@Override
			public Adapter caseArtifactReference(ArtifactReference object) {
				return createArtifactReferenceAdapter();
			}
			@Override
			public Adapter caseAssertedArtifactSupport(AssertedArtifactSupport object) {
				return createAssertedArtifactSupportAdapter();
			}
			@Override
			public Adapter caseAssertedInference(AssertedInference object) {
				return createAssertedInferenceAdapter();
			}
			@Override
			public Adapter caseAssertedEvidence(AssertedEvidence object) {
				return createAssertedEvidenceAdapter();
			}
			@Override
			public Adapter caseAssertedContext(AssertedContext object) {
				return createAssertedContextAdapter();
			}
			@Override
			public Adapter caseAssertedArtifactContext(AssertedArtifactContext object) {
				return createAssertedArtifactContextAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseSACMElement(SACMElement object) {
				return createSACMElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseArtifactElement(ArtifactElement object) {
				return createArtifactElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentationElement
	 * @generated
	 */
	public Adapter createArgumentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentGroup <em>Argument Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentGroup
	 * @generated
	 */
	public Adapter createArgumentGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentPackage
	 * @generated
	 */
	public Adapter createArgumentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentPackageInterface <em>Argument Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentPackageInterface
	 * @generated
	 */
	public Adapter createArgumentPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentPackageBinding <em>Argument Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentPackageBinding
	 * @generated
	 */
	public Adapter createArgumentPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentAsset <em>Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentAsset
	 * @generated
	 */
	public Adapter createArgumentAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentReasoning
	 * @generated
	 */
	public Adapter createArgumentReasoningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Claim
	 * @generated
	 */
	public Adapter createClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.AssertedRelationship <em>Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.AssertedRelationship
	 * @generated
	 */
	public Adapter createAssertedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArtifactReference <em>Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArtifactReference
	 * @generated
	 */
	public Adapter createArtifactReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.AssertedArtifactSupport <em>Asserted Artifact Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.AssertedArtifactSupport
	 * @generated
	 */
	public Adapter createAssertedArtifactSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.AssertedInference
	 * @generated
	 */
	public Adapter createAssertedInferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.AssertedEvidence <em>Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.AssertedEvidence
	 * @generated
	 */
	public Adapter createAssertedEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.AssertedContext
	 * @generated
	 */
	public Adapter createAssertedContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.AssertedArtifactContext <em>Asserted Artifact Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.AssertedArtifactContext
	 * @generated
	 */
	public Adapter createAssertedArtifactContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.SACMElement <em>SACM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.SACMElement
	 * @generated
	 */
	public Adapter createSACMElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.ArtifactElement <em>Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.ArtifactElement
	 * @generated
	 */
	public Adapter createArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Argumentation_AdapterFactory
