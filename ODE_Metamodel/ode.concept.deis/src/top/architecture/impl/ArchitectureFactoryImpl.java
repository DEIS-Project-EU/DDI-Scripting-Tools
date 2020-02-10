/**
 */
package top.architecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import top.architecture.ArchitectureFactory;
import top.architecture.ArchitecturePackage;
import top.architecture.Configuration;
import top.architecture.Context;
import top.architecture.DesignPackage;
import top.architecture.Function;
import top.architecture.LifecycleCondition;
import top.architecture.LogicalComponent;
import top.architecture.PerfChars;
import top.architecture.PhysicalComponent;
import top.architecture.Port;
import top.architecture.PortDirection;
import top.architecture.SafetyFunction;
import top.architecture.SafetyRelatedSystem;
import top.architecture.Signal;
import top.architecture.SystemBoundary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureFactoryImpl extends EFactoryImpl implements ArchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchitectureFactory init() {
		try {
			ArchitectureFactory theArchitectureFactory = (ArchitectureFactory)EPackage.Registry.INSTANCE.getEFactory(ArchitecturePackage.eNS_URI);
			if (theArchitectureFactory != null) {
				return theArchitectureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureFactoryImpl() {
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
			case ArchitecturePackage.DESIGN_PACKAGE: return createDesignPackage();
			case ArchitecturePackage.SYSTEM: return createSystem();
			case ArchitecturePackage.FUNCTION: return createFunction();
			case ArchitecturePackage.SAFETY_FUNCTION: return createSafetyFunction();
			case ArchitecturePackage.PORT: return createPort();
			case ArchitecturePackage.PERF_CHARS: return createPerfChars();
			case ArchitecturePackage.SYSTEM_BOUNDARY: return createSystemBoundary();
			case ArchitecturePackage.CONTEXT: return createContext();
			case ArchitecturePackage.PHYSICAL_COMPONENT: return createPhysicalComponent();
			case ArchitecturePackage.LOGICAL_COMPONENT: return createLogicalComponent();
			case ArchitecturePackage.LIFECYCLE_CONDITION: return createLifecycleCondition();
			case ArchitecturePackage.SIGNAL: return createSignal();
			case ArchitecturePackage.SAFETY_RELATED_SYSTEM: return createSafetyRelatedSystem();
			case ArchitecturePackage.CONFIGURATION: return createConfiguration();
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
			case ArchitecturePackage.PORT_DIRECTION:
				return createPortDirectionFromString(eDataType, initialValue);
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
			case ArchitecturePackage.PORT_DIRECTION:
				return convertPortDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignPackage createDesignPackage() {
		DesignPackageImpl designPackage = new DesignPackageImpl();
		return designPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public top.architecture.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyFunction createSafetyFunction() {
		SafetyFunctionImpl safetyFunction = new SafetyFunctionImpl();
		return safetyFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfChars createPerfChars() {
		PerfCharsImpl perfChars = new PerfCharsImpl();
		return perfChars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemBoundary createSystemBoundary() {
		SystemBoundaryImpl systemBoundary = new SystemBoundaryImpl();
		return systemBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent createPhysicalComponent() {
		PhysicalComponentImpl physicalComponent = new PhysicalComponentImpl();
		return physicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponent createLogicalComponent() {
		LogicalComponentImpl logicalComponent = new LogicalComponentImpl();
		return logicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleCondition createLifecycleCondition() {
		LifecycleConditionImpl lifecycleCondition = new LifecycleConditionImpl();
		return lifecycleCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyRelatedSystem createSafetyRelatedSystem() {
		SafetyRelatedSystemImpl safetyRelatedSystem = new SafetyRelatedSystemImpl();
		return safetyRelatedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirection createPortDirectionFromString(EDataType eDataType, String initialValue) {
		PortDirection result = PortDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturePackage getArchitecturePackage() {
		return (ArchitecturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchitecturePackage getPackage() {
		return ArchitecturePackage.eINSTANCE;
	}

} //ArchitectureFactoryImpl
