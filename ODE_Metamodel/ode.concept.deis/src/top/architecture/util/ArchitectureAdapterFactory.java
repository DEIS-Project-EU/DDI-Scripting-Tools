/**
 */
package top.architecture.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
import top.architecture.SafetyFunction;
import top.architecture.SafetyRelatedSystem;
import top.architecture.Signal;
import top.architecture.SystemBoundary;

import top.integration.ODEProductPackage;

import top.odeBase.BaseElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see top.architecture.ArchitecturePackage
 * @generated
 */
public class ArchitectureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArchitecturePackage.eINSTANCE;
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
	protected ArchitectureSwitch<Adapter> modelSwitch =
		new ArchitectureSwitch<Adapter>() {
			@Override
			public Adapter caseDesignPackage(DesignPackage object) {
				return createDesignPackageAdapter();
			}
			@Override
			public Adapter caseSystem(top.architecture.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseSafetyFunction(SafetyFunction object) {
				return createSafetyFunctionAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter casePerfChars(PerfChars object) {
				return createPerfCharsAdapter();
			}
			@Override
			public Adapter caseSystemBoundary(SystemBoundary object) {
				return createSystemBoundaryAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter casePhysicalComponent(PhysicalComponent object) {
				return createPhysicalComponentAdapter();
			}
			@Override
			public Adapter caseLogicalComponent(LogicalComponent object) {
				return createLogicalComponentAdapter();
			}
			@Override
			public Adapter caseLifecycleCondition(LifecycleCondition object) {
				return createLifecycleConditionAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter caseSafetyRelatedSystem(SafetyRelatedSystem object) {
				return createSafetyRelatedSystemAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
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
	 * Creates a new adapter for an object of class '{@link top.architecture.DesignPackage <em>Design Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.DesignPackage
	 * @generated
	 */
	public Adapter createDesignPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.SafetyFunction <em>Safety Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.SafetyFunction
	 * @generated
	 */
	public Adapter createSafetyFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.PerfChars <em>Perf Chars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.PerfChars
	 * @generated
	 */
	public Adapter createPerfCharsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.SystemBoundary <em>System Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.SystemBoundary
	 * @generated
	 */
	public Adapter createSystemBoundaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.PhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.PhysicalComponent
	 * @generated
	 */
	public Adapter createPhysicalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.LogicalComponent <em>Logical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.LogicalComponent
	 * @generated
	 */
	public Adapter createLogicalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.LifecycleCondition <em>Lifecycle Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.LifecycleCondition
	 * @generated
	 */
	public Adapter createLifecycleConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.SafetyRelatedSystem <em>Safety Related System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.SafetyRelatedSystem
	 * @generated
	 */
	public Adapter createSafetyRelatedSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link top.architecture.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see top.architecture.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
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

} //ArchitectureAdapterFactory
