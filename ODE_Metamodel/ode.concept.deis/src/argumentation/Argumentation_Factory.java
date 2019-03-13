/**
 */
package argumentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see argumentation.Argumentation_Package
 * @generated
 */
public interface Argumentation_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Argumentation_Factory eINSTANCE = argumentation.impl.Argumentation_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Argument Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Group</em>'.
	 * @generated
	 */
	ArgumentGroup createArgumentGroup();

	/**
	 * Returns a new object of class '<em>Argument Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Package</em>'.
	 * @generated
	 */
	ArgumentPackage createArgumentPackage();

	/**
	 * Returns a new object of class '<em>Argument Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Package Interface</em>'.
	 * @generated
	 */
	ArgumentPackageInterface createArgumentPackageInterface();

	/**
	 * Returns a new object of class '<em>Argument Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Package Binding</em>'.
	 * @generated
	 */
	ArgumentPackageBinding createArgumentPackageBinding();

	/**
	 * Returns a new object of class '<em>Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Reasoning</em>'.
	 * @generated
	 */
	ArgumentReasoning createArgumentReasoning();

	/**
	 * Returns a new object of class '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim</em>'.
	 * @generated
	 */
	Claim createClaim();

	/**
	 * Returns a new object of class '<em>Artifact Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Reference</em>'.
	 * @generated
	 */
	ArtifactReference createArtifactReference();

	/**
	 * Returns a new object of class '<em>Asserted Artifact Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Artifact Support</em>'.
	 * @generated
	 */
	AssertedArtifactSupport createAssertedArtifactSupport();

	/**
	 * Returns a new object of class '<em>Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Inference</em>'.
	 * @generated
	 */
	AssertedInference createAssertedInference();

	/**
	 * Returns a new object of class '<em>Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Evidence</em>'.
	 * @generated
	 */
	AssertedEvidence createAssertedEvidence();

	/**
	 * Returns a new object of class '<em>Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Context</em>'.
	 * @generated
	 */
	AssertedContext createAssertedContext();

	/**
	 * Returns a new object of class '<em>Asserted Artifact Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asserted Artifact Context</em>'.
	 * @generated
	 */
	AssertedArtifactContext createAssertedArtifactContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Argumentation_Package getArgumentation_Package();

} //Argumentation_Factory
