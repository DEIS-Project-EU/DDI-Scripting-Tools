/**
 */
package top.failureLogic.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import top.failureLogic.*;

import top.integration.ODEProductPackage;

import top.odeBase.BaseElement;

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
 * @see top.failureLogic.FailureLogic_Package
 * @generated
 */
public class FailureLogic_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FailureLogic_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureLogic_Switch() {
		if (modelPackage == null) {
			modelPackage = FailureLogic_Package.eINSTANCE;
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
			case FailureLogic_Package.FAILURE_LOGIC_PACKAGE: {
				FailureLogicPackage failureLogicPackage = (FailureLogicPackage)theEObject;
				T result = caseFailureLogicPackage(failureLogicPackage);
				if (result == null) result = caseODEProductPackage(failureLogicPackage);
				if (result == null) result = caseBaseElement(failureLogicPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.FAILURE: {
				Failure failure = (Failure)theEObject;
				T result = caseFailure(failure);
				if (result == null) result = caseBaseElement(failure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.SECURITY_VIOLATION: {
				SecurityViolation securityViolation = (SecurityViolation)theEObject;
				T result = caseSecurityViolation(securityViolation);
				if (result == null) result = caseFailure(securityViolation);
				if (result == null) result = caseBaseElement(securityViolation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.FAILURE_MODEL: {
				FailureModel failureModel = (FailureModel)theEObject;
				T result = caseFailureModel(failureModel);
				if (result == null) result = caseBaseElement(failureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.MINIMAL_CUT_SETS: {
				MinimalCutSets minimalCutSets = (MinimalCutSets)theEObject;
				T result = caseMinimalCutSets(minimalCutSets);
				if (result == null) result = caseBaseElement(minimalCutSets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.MINIMAL_CUTSET: {
				MinimalCutset minimalCutset = (MinimalCutset)theEObject;
				T result = caseMinimalCutset(minimalCutset);
				if (result == null) result = caseBaseElement(minimalCutset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.PROB_DIST: {
				ProbDist probDist = (ProbDist)theEObject;
				T result = caseProbDist(probDist);
				if (result == null) result = caseBaseElement(probDist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.PROB_DIST_PARAM: {
				ProbDistParam probDistParam = (ProbDistParam)theEObject;
				T result = caseProbDistParam(probDistParam);
				if (result == null) result = caseBaseElement(probDistParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.FAULT_TREE: {
				FaultTree faultTree = (FaultTree)theEObject;
				T result = caseFaultTree(faultTree);
				if (result == null) result = caseFailureModel(faultTree);
				if (result == null) result = caseBaseElement(faultTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.CAUSE: {
				Cause cause = (Cause)theEObject;
				T result = caseCause(cause);
				if (result == null) result = caseBaseElement(cause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseCause(gate);
				if (result == null) result = caseBaseElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.MARKOV_CHAIN: {
				MarkovChain markovChain = (MarkovChain)theEObject;
				T result = caseMarkovChain(markovChain);
				if (result == null) result = caseFailureModel(markovChain);
				if (result == null) result = caseBaseElement(markovChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseBaseElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseBaseElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.FMEA: {
				FMEA fmea = (FMEA)theEObject;
				T result = caseFMEA(fmea);
				if (result == null) result = caseFailureModel(fmea);
				if (result == null) result = caseBaseElement(fmea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.FMEA_ENTRY: {
				FMEAEntry fmeaEntry = (FMEAEntry)theEObject;
				T result = caseFMEAEntry(fmeaEntry);
				if (result == null) result = caseBaseElement(fmeaEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FailureLogic_Package.FMEDA_ENTRY: {
				FMEDAEntry fmedaEntry = (FMEDAEntry)theEObject;
				T result = caseFMEDAEntry(fmedaEntry);
				if (result == null) result = caseFMEAEntry(fmedaEntry);
				if (result == null) result = caseBaseElement(fmedaEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Logic Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Logic Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureLogicPackage(FailureLogicPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailure(Failure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Violation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Violation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityViolation(SecurityViolation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureModel(FailureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimal Cut Sets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimal Cut Sets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimalCutSets(MinimalCutSets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimal Cutset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimal Cutset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimalCutset(MinimalCutset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prob Dist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prob Dist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbDist(ProbDist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prob Dist Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prob Dist Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbDistParam(ProbDistParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultTree(FaultTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCause(Cause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markov Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markov Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkovChain(MarkovChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMEA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMEA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMEA(FMEA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMEA Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMEA Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMEAEntry(FMEAEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMEDA Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMEDA Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMEDAEntry(FMEDAEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseElement(BaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ODE Product Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ODE Product Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODEProductPackage(ODEProductPackage object) {
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

} //FailureLogic_Switch
