/**
 */
package top.argumentation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import top.argumentation.*;

import top.base.ArtifactElement;
import top.base.Element;
import top.base.ModelElement;
import top.base.SACMElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see top.argumentation.ArgumentationPackage
 * @generated
 */
public class ArgumentationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArgumentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArgumentationPackage.eINSTANCE;
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
	protected ArgumentationSwitch<Adapter> modelSwitch =
		new ArgumentationSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link top.argumentation.ArgumentationElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.ArgumentationElement
	 * @generated
	 */
	public Adapter createArgumentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.ArgumentGroup <em>Argument Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.ArgumentGroup
	 * @generated
	 */
	public Adapter createArgumentGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.ArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.ArgumentPackage
	 * @generated
	 */
	public Adapter createArgumentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.ArgumentPackageInterface <em>Argument Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.ArgumentPackageInterface
	 * @generated
	 */
	public Adapter createArgumentPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.ArgumentPackageBinding <em>Argument Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.ArgumentPackageBinding
	 * @generated
	 */
	public Adapter createArgumentPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.ArgumentAsset <em>Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.ArgumentAsset
	 * @generated
	 */
	public Adapter createArgumentAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.ArgumentReasoning
	 * @generated
	 */
	public Adapter createArgumentReasoningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.Claim
	 * @generated
	 */
	public Adapter createClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.AssertedRelationship <em>Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.AssertedRelationship
	 * @generated
	 */
	public Adapter createAssertedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.ArtifactReference <em>Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.ArtifactReference
	 * @generated
	 */
	public Adapter createArtifactReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.AssertedArtifactSupport <em>Asserted Artifact Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.AssertedArtifactSupport
	 * @generated
	 */
	public Adapter createAssertedArtifactSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.AssertedInference
	 * @generated
	 */
	public Adapter createAssertedInferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.AssertedEvidence <em>Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.AssertedEvidence
	 * @generated
	 */
	public Adapter createAssertedEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.AssertedContext
	 * @generated
	 */
	public Adapter createAssertedContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.argumentation.AssertedArtifactContext <em>Asserted Artifact Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.argumentation.AssertedArtifactContext
	 * @generated
	 */
	public Adapter createAssertedArtifactContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.base.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.base.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.base.SACMElement <em>SACM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.base.SACMElement
	 * @generated
	 */
	public Adapter createSACMElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.base.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.base.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.base.ArtifactElement <em>Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.base.ArtifactElement
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

} //ArgumentationAdapterFactory
