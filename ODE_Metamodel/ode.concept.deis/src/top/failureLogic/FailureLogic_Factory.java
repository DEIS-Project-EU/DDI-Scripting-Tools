/**
 */
package top.failureLogic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see top.failureLogic.FailureLogic_Package
 * @generated
 */
public interface FailureLogic_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FailureLogic_Factory eINSTANCE = top.failureLogic.impl.FailureLogic_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Failure Logic Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Logic Package</em>'.
	 * @generated
	 */
	FailureLogicPackage createFailureLogicPackage();

	/**
	 * Returns a new object of class '<em>Failure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure</em>'.
	 * @generated
	 */
	Failure createFailure();

	/**
	 * Returns a new object of class '<em>Security Violation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Violation</em>'.
	 * @generated
	 */
	SecurityViolation createSecurityViolation();

	/**
	 * Returns a new object of class '<em>Failure Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Model</em>'.
	 * @generated
	 */
	FailureModel createFailureModel();

	/**
	 * Returns a new object of class '<em>Minimal Cut Sets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimal Cut Sets</em>'.
	 * @generated
	 */
	MinimalCutSets createMinimalCutSets();

	/**
	 * Returns a new object of class '<em>Minimal Cutset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minimal Cutset</em>'.
	 * @generated
	 */
	MinimalCutset createMinimalCutset();

	/**
	 * Returns a new object of class '<em>Prob Dist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prob Dist</em>'.
	 * @generated
	 */
	ProbDist createProbDist();

	/**
	 * Returns a new object of class '<em>Prob Dist Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prob Dist Param</em>'.
	 * @generated
	 */
	ProbDistParam createProbDistParam();

	/**
	 * Returns a new object of class '<em>Fault Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault Tree</em>'.
	 * @generated
	 */
	FaultTree createFaultTree();

	/**
	 * Returns a new object of class '<em>Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cause</em>'.
	 * @generated
	 */
	Cause createCause();

	/**
	 * Returns a new object of class '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate</em>'.
	 * @generated
	 */
	Gate createGate();

	/**
	 * Returns a new object of class '<em>Markov Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markov Chain</em>'.
	 * @generated
	 */
	MarkovChain createMarkovChain();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>FMEA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FMEA</em>'.
	 * @generated
	 */
	FMEA createFMEA();

	/**
	 * Returns a new object of class '<em>FMEA Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FMEA Entry</em>'.
	 * @generated
	 */
	FMEAEntry createFMEAEntry();

	/**
	 * Returns a new object of class '<em>FMEDA Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FMEDA Entry</em>'.
	 * @generated
	 */
	FMEDAEntry createFMEDAEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FailureLogic_Package getFailureLogic_Package();

} //FailureLogic_Factory
