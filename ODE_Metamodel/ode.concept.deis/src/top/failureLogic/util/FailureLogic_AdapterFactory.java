/**
 */
package top.failureLogic.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import top.failureLogic.*;

import top.integration.ODEProductPackage;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see top.failureLogic.FailureLogic_Package
 * @generated
 */
public class FailureLogic_AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FailureLogic_Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureLogic_AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FailureLogic_Package.eINSTANCE;
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
	protected FailureLogic_Switch<Adapter> modelSwitch =
		new FailureLogic_Switch<Adapter>() {
			@Override
			public Adapter caseFailureLogicPackage(FailureLogicPackage object) {
				return createFailureLogicPackageAdapter();
			}
			@Override
			public Adapter caseFailure(Failure object) {
				return createFailureAdapter();
			}
			@Override
			public Adapter caseSecurityViolation(SecurityViolation object) {
				return createSecurityViolationAdapter();
			}
			@Override
			public Adapter caseFailureModel(FailureModel object) {
				return createFailureModelAdapter();
			}
			@Override
			public Adapter caseMinimalCutSets(MinimalCutSets object) {
				return createMinimalCutSetsAdapter();
			}
			@Override
			public Adapter caseMinimalCutset(MinimalCutset object) {
				return createMinimalCutsetAdapter();
			}
			@Override
			public Adapter caseProbDist(ProbDist object) {
				return createProbDistAdapter();
			}
			@Override
			public Adapter caseProbDistParam(ProbDistParam object) {
				return createProbDistParamAdapter();
			}
			@Override
			public Adapter caseFaultTree(FaultTree object) {
				return createFaultTreeAdapter();
			}
			@Override
			public Adapter caseCause(Cause object) {
				return createCauseAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter caseMarkovChain(MarkovChain object) {
				return createMarkovChainAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseFMEA(FMEA object) {
				return createFMEAAdapter();
			}
			@Override
			public Adapter caseFMEAEntry(FMEAEntry object) {
				return createFMEAEntryAdapter();
			}
			@Override
			public Adapter caseFMEDAEntry(FMEDAEntry object) {
				return createFMEDAEntryAdapter();
			}
			@Override
			public Adapter caseBaseElement(BaseElement object) {
				return createBaseElementAdapter();
			}
			@Override
			public Adapter caseODEProductPackage(ODEProductPackage object) {
				return createODEProductPackageAdapter();
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
	 * Creates a new adapter for an object of class '{@link top.failureLogic.FailureLogicPackage <em>Failure Logic Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.FailureLogicPackage
	 * @generated
	 */
	public Adapter createFailureLogicPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.Failure
	 * @generated
	 */
	public Adapter createFailureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.SecurityViolation <em>Security Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.SecurityViolation
	 * @generated
	 */
	public Adapter createSecurityViolationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.FailureModel <em>Failure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.FailureModel
	 * @generated
	 */
	public Adapter createFailureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.MinimalCutSets <em>Minimal Cut Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.MinimalCutSets
	 * @generated
	 */
	public Adapter createMinimalCutSetsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.MinimalCutset <em>Minimal Cutset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.MinimalCutset
	 * @generated
	 */
	public Adapter createMinimalCutsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.ProbDist <em>Prob Dist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.ProbDist
	 * @generated
	 */
	public Adapter createProbDistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.ProbDistParam <em>Prob Dist Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.ProbDistParam
	 * @generated
	 */
	public Adapter createProbDistParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.FaultTree <em>Fault Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.FaultTree
	 * @generated
	 */
	public Adapter createFaultTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.Cause
	 * @generated
	 */
	public Adapter createCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.MarkovChain <em>Markov Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.MarkovChain
	 * @generated
	 */
	public Adapter createMarkovChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.FMEA <em>FMEA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.FMEA
	 * @generated
	 */
	public Adapter createFMEAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.FMEAEntry <em>FMEA Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.FMEAEntry
	 * @generated
	 */
	public Adapter createFMEAEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.failureLogic.FMEDAEntry <em>FMEDA Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.failureLogic.FMEDAEntry
	 * @generated
	 */
	public Adapter createFMEDAEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.odeBase.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.odeBase.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.integration.ODEProductPackage <em>ODE Product Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.integration.ODEProductPackage
	 * @generated
	 */
	public Adapter createODEProductPackageAdapter() {
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

} //FailureLogic_AdapterFactory
