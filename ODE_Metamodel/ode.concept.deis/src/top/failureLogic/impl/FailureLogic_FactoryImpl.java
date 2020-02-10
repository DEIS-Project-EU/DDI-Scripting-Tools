/**
 */
package top.failureLogic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import top.failureLogic.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureLogic_FactoryImpl extends EFactoryImpl implements FailureLogic_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FailureLogic_Factory init() {
		try {
			FailureLogic_Factory theFailureLogic_Factory = (FailureLogic_Factory)EPackage.Registry.INSTANCE.getEFactory(FailureLogic_Package.eNS_URI);
			if (theFailureLogic_Factory != null) {
				return theFailureLogic_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FailureLogic_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureLogic_FactoryImpl() {
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
			case FailureLogic_Package.FAILURE_LOGIC_PACKAGE: return createFailureLogicPackage();
			case FailureLogic_Package.FAILURE: return createFailure();
			case FailureLogic_Package.SECURITY_VIOLATION: return createSecurityViolation();
			case FailureLogic_Package.FAILURE_MODEL: return createFailureModel();
			case FailureLogic_Package.MINIMAL_CUT_SETS: return createMinimalCutSets();
			case FailureLogic_Package.MINIMAL_CUTSET: return createMinimalCutset();
			case FailureLogic_Package.PROB_DIST: return createProbDist();
			case FailureLogic_Package.PROB_DIST_PARAM: return createProbDistParam();
			case FailureLogic_Package.FAULT_TREE: return createFaultTree();
			case FailureLogic_Package.CAUSE: return createCause();
			case FailureLogic_Package.GATE: return createGate();
			case FailureLogic_Package.MARKOV_CHAIN: return createMarkovChain();
			case FailureLogic_Package.STATE: return createState();
			case FailureLogic_Package.TRANSITION: return createTransition();
			case FailureLogic_Package.FMEA: return createFMEA();
			case FailureLogic_Package.FMEA_ENTRY: return createFMEAEntry();
			case FailureLogic_Package.FMEDA_ENTRY: return createFMEDAEntry();
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
			case FailureLogic_Package.FAILURE_ORIGIN_TYPE:
				return createFailureOriginTypeFromString(eDataType, initialValue);
			case FailureLogic_Package.GATE_TYPE:
				return createGateTypeFromString(eDataType, initialValue);
			case FailureLogic_Package.CAUSE_TYPE:
				return createCauseTypeFromString(eDataType, initialValue);
			case FailureLogic_Package.FMEA_TYPE:
				return createFMEATypeFromString(eDataType, initialValue);
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
			case FailureLogic_Package.FAILURE_ORIGIN_TYPE:
				return convertFailureOriginTypeToString(eDataType, instanceValue);
			case FailureLogic_Package.GATE_TYPE:
				return convertGateTypeToString(eDataType, instanceValue);
			case FailureLogic_Package.CAUSE_TYPE:
				return convertCauseTypeToString(eDataType, instanceValue);
			case FailureLogic_Package.FMEA_TYPE:
				return convertFMEATypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureLogicPackage createFailureLogicPackage() {
		FailureLogicPackageImpl failureLogicPackage = new FailureLogicPackageImpl();
		return failureLogicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure createFailure() {
		FailureImpl failure = new FailureImpl();
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityViolation createSecurityViolation() {
		SecurityViolationImpl securityViolation = new SecurityViolationImpl();
		return securityViolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureModel createFailureModel() {
		FailureModelImpl failureModel = new FailureModelImpl();
		return failureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimalCutSets createMinimalCutSets() {
		MinimalCutSetsImpl minimalCutSets = new MinimalCutSetsImpl();
		return minimalCutSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimalCutset createMinimalCutset() {
		MinimalCutsetImpl minimalCutset = new MinimalCutsetImpl();
		return minimalCutset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbDist createProbDist() {
		ProbDistImpl probDist = new ProbDistImpl();
		return probDist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbDistParam createProbDistParam() {
		ProbDistParamImpl probDistParam = new ProbDistParamImpl();
		return probDistParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTree createFaultTree() {
		FaultTreeImpl faultTree = new FaultTreeImpl();
		return faultTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cause createCause() {
		CauseImpl cause = new CauseImpl();
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkovChain createMarkovChain() {
		MarkovChainImpl markovChain = new MarkovChainImpl();
		return markovChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMEA createFMEA() {
		FMEAImpl fmea = new FMEAImpl();
		return fmea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMEAEntry createFMEAEntry() {
		FMEAEntryImpl fmeaEntry = new FMEAEntryImpl();
		return fmeaEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMEDAEntry createFMEDAEntry() {
		FMEDAEntryImpl fmedaEntry = new FMEDAEntryImpl();
		return fmedaEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureOriginType createFailureOriginTypeFromString(EDataType eDataType, String initialValue) {
		FailureOriginType result = FailureOriginType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFailureOriginTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateType createGateTypeFromString(EDataType eDataType, String initialValue) {
		GateType result = GateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseType createCauseTypeFromString(EDataType eDataType, String initialValue) {
		CauseType result = CauseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCauseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMEAType createFMEATypeFromString(EDataType eDataType, String initialValue) {
		FMEAType result = FMEAType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMEATypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureLogic_Package getFailureLogic_Package() {
		return (FailureLogic_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FailureLogic_Package getPackage() {
		return FailureLogic_Package.eINSTANCE;
	}

} //FailureLogic_FactoryImpl
