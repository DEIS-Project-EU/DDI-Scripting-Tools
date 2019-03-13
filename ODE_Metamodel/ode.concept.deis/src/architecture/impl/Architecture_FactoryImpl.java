/**
 */
package architecture.impl;

import architecture.Architecture_Factory;
import architecture.Architecture_Package;
import architecture.Configuration;
import architecture.Context;
import architecture.DesignPackage;
import architecture.Function;
import architecture.LifecycleCondition;
import architecture.LogicalComponent;
import architecture.PerfChars;
import architecture.PhysicalComponent;
import architecture.Port;
import architecture.PortDirection;
import architecture.SafetyFunction;
import architecture.SafetyRelatedSystem;
import architecture.Signal;
import architecture.SystemBoundary;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Architecture_FactoryImpl extends EFactoryImpl implements Architecture_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Architecture_Factory init() {
		try {
			Architecture_Factory theArchitecture_Factory = (Architecture_Factory)EPackage.Registry.INSTANCE.getEFactory(Architecture_Package.eNS_URI);
			if (theArchitecture_Factory != null) {
				return theArchitecture_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Architecture_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture_FactoryImpl() {
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
			case Architecture_Package.DESIGN_PACKAGE: return createDesignPackage();
			case Architecture_Package.SYSTEM: return createSystem();
			case Architecture_Package.FUNCTION: return createFunction();
			case Architecture_Package.SAFETY_FUNCTION: return createSafetyFunction();
			case Architecture_Package.PORT: return createPort();
			case Architecture_Package.PERF_CHARS: return createPerfChars();
			case Architecture_Package.SYSTEM_BOUNDARY: return createSystemBoundary();
			case Architecture_Package.CONTEXT: return createContext();
			case Architecture_Package.PHYSICAL_COMPONENT: return createPhysicalComponent();
			case Architecture_Package.LOGICAL_COMPONENT: return createLogicalComponent();
			case Architecture_Package.LIFECYCLE_CONDITION: return createLifecycleCondition();
			case Architecture_Package.SIGNAL: return createSignal();
			case Architecture_Package.SAFETY_RELATED_SYSTEM: return createSafetyRelatedSystem();
			case Architecture_Package.CONFIGURATION: return createConfiguration();
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
			case Architecture_Package.PORT_DIRECTION:
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
			case Architecture_Package.PORT_DIRECTION:
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
	public architecture.System createSystem() {
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
	public Architecture_Package getArchitecture_Package() {
		return (Architecture_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Architecture_Package getPackage() {
		return Architecture_Package.eINSTANCE;
	}

} //Architecture_FactoryImpl
