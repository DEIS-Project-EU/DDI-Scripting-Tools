package transformation.ode2thrift;

import architecture.Configuration;
import architecture.Context;
import architecture.DesignPackage;
import architecture.Function;
import architecture.LifecycleCondition;
import architecture.LogicalComponent;
import architecture.PerfChars;
import architecture.PhysicalComponent;
import architecture.Port;
import architecture.SafetyFunction;
import architecture.SafetyRelatedSystem;
import architecture.Signal;
import architecture.System;
import architecture.SystemBoundary;
import architecture.iface.IFunction;
import architecture.iface.ISystem;
import architecture.typed.TConfiguration;
import architecture.typed.TContext;
import architecture.typed.TDesignPackage;
import architecture.typed.TFunction;
import architecture.typed.TLifecycleCondition;
import architecture.typed.TLogicalComponent;
import architecture.typed.TPerfChars;
import architecture.typed.TPhysicalComponent;
import architecture.typed.TPort;
import architecture.typed.TSafetyFunction;
import architecture.typed.TSafetyRelatedSystem;
import architecture.typed.TSignal;
import architecture.typed.TSystem;
import architecture.typed.TSystemBoundary;
import dependability.Standard;
import dependability.Malfunction;
import dependability.DependabilityRequirement;
import failureLogic.Failure;
import failureLogic.FailureModel;
import thriftContract.TDDIAbstractDependabilityRequirementRef;
import thriftContract.TDDIAbstractFailureModelRef;
import thriftContract.TDDIAbstractFailureRef;
import thriftContract.TDDIAbstractFunction;
import thriftContract.TDDIAbstractFunctionRef;
import thriftContract.TDDIAbstractStandardRef;
import thriftContract.TDDIAbstractSystem;
import thriftContract.TDDIAbstractSystemRef;
import thriftContract.TDDIConfiguration;
import thriftContract.TDDIContext;
import thriftContract.TDDIDesignPackage;
import thriftContract.TDDIFunction;
import thriftContract.TDDIFunctionUnion;
import thriftContract.TDDIFunctionUnionType;
import thriftContract.TDDILifecycleCondition;
import thriftContract.TDDILogicalComponent;
import thriftContract.TDDILogicalComponentRef;
import thriftContract.TDDIMalfunctionRef;
import thriftContract.TDDIPerfChars;
import thriftContract.TDDIPhysicalComponent;
import thriftContract.TDDIPort;
import thriftContract.TDDIPortDirection;
import thriftContract.TDDIPortRef;
import thriftContract.TDDISafetyFunction;
import thriftContract.TDDISafetyRelatedSystem;
import thriftContract.TDDISignal;
import thriftContract.TDDISystem;
import thriftContract.TDDISystemBoundary;
import thriftContract.TDDISystemUnion;
import thriftContract.TDDISystemUnionType;

public class ArchitectureThriftTranslater {

	public static TDDIDesignPackage transformDesignPackage(DesignPackage eDesignPackage){
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eDesignPackage)){
			return (TDDIDesignPackage) BaseThriftTranslater.emf2ThriftMap.get(eDesignPackage);
		}
		
		TDDIDesignPackage tDesignPackage = new TDDIDesignPackage();
		BaseThriftTranslater.emf2ThriftMap.put(eDesignPackage, tDesignPackage);
		ODE2ThriftTranslater.transformODEProductPackageContents(TDesignPackage.wrap(tDesignPackage), eDesignPackage);
		
		if(eDesignPackage.getSystems() != null){
			for(System eAbstractSystem : eDesignPackage.getSystems()){
				tDesignPackage.getSystems().add(transformAbstractSystem(eAbstractSystem));
			}
		}
		
		if(eDesignPackage.getFunctions() != null){
			for(Function eAbstractFunction : eDesignPackage.getFunctions()){
				tDesignPackage.getFunctions().add(transformAbstractFunction(eAbstractFunction));
			}
		}
		
		return tDesignPackage;
	}
	
	private static TDDIAbstractSystem transformAbstractSystem(System eAbstractSystem) {
		TDDIAbstractSystem tAbstractSystem = new TDDIAbstractSystem();
		if (eAbstractSystem instanceof LogicalComponent) {
			tAbstractSystem.UsedSystemType = TDDISystemUnionType.SUTLogicalComponent;
			tAbstractSystem.UsedSystem = new TDDISystemUnion();
			tAbstractSystem.UsedSystem.setLogicalComponent(transformLogicalComponent((LogicalComponent)eAbstractSystem));
		} else if (eAbstractSystem instanceof PhysicalComponent) {
			tAbstractSystem.UsedSystemType = TDDISystemUnionType.SUTPhysicalComponent;
			tAbstractSystem.UsedSystem = new TDDISystemUnion();
			tAbstractSystem.UsedSystem.setPhysicalComponent(transformPhysicalComponent((PhysicalComponent)eAbstractSystem));
		} else if (eAbstractSystem instanceof SafetyRelatedSystem) {
			tAbstractSystem.UsedSystemType = TDDISystemUnionType.SUTSafetyRelatedSystem;
			tAbstractSystem.UsedSystem = new TDDISystemUnion();
			tAbstractSystem.UsedSystem.setSafetyRelatedSystem(transformSafetyRelatedSystem((SafetyRelatedSystem)eAbstractSystem));
		}else if (eAbstractSystem instanceof System) {
			tAbstractSystem.UsedSystemType = TDDISystemUnionType.SUTSystem;
			tAbstractSystem.UsedSystem = new TDDISystemUnion();
			tAbstractSystem.UsedSystem.setSystem(transformSystem(eAbstractSystem));
		}
		return tAbstractSystem;
	}
	
	private static TDDILogicalComponent transformLogicalComponent(LogicalComponent eLogicalComponent) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eLogicalComponent)) {
			return (TDDILogicalComponent) BaseThriftTranslater.emf2ThriftMap.get(eLogicalComponent);
		}
		
		TDDILogicalComponent tLogicalComponent = new TDDILogicalComponent();
		BaseThriftTranslater.emf2ThriftMap.put(eLogicalComponent, tLogicalComponent);		
		transformSystemContents(TLogicalComponent.wrap(tLogicalComponent), eLogicalComponent);			
		
		return tLogicalComponent;
	}

	private static TDDIPhysicalComponent transformPhysicalComponent(PhysicalComponent ePhysicalComponent) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(ePhysicalComponent)) {
			return (TDDIPhysicalComponent) BaseThriftTranslater.emf2ThriftMap.get(ePhysicalComponent);
		}
		
		TDDIPhysicalComponent tPhysicalComponent = new TDDIPhysicalComponent();
		BaseThriftTranslater.emf2ThriftMap.put(ePhysicalComponent, tPhysicalComponent);		
		transformSystemContents(TPhysicalComponent.wrap(tPhysicalComponent), ePhysicalComponent);	
		
		if (ePhysicalComponent.getDimensions() != null)
			tPhysicalComponent.setDimensions(ePhysicalComponent.getDimensions());
		tPhysicalComponent.setPricePerUnit(ePhysicalComponent.getPricePerUnit());
		tPhysicalComponent.setMass(ePhysicalComponent.getMass());
		tPhysicalComponent.setProtectionCategory(ePhysicalComponent.getProtectionCategory());
		tPhysicalComponent.setUsefulLifetime(ePhysicalComponent.getUsefulLifetime());
		tPhysicalComponent.setUsefulLifetimeTimeUnit(BaseThriftTranslater.transformTimeUnit(ePhysicalComponent.getUsefulLifetimeTimeUnit()));
		
		if (ePhysicalComponent.getLogicalComponents() != null)
			for (LogicalComponent eLogicalComponent : ePhysicalComponent.getLogicalComponents())
				tPhysicalComponent.getLogicalComponents().add(new TDDILogicalComponentRef(transformLogicalComponent(eLogicalComponent)));
		
		if (ePhysicalComponent.getLifecycleConditions() != null)
			for (LifecycleCondition eLifecycleCondition : ePhysicalComponent.getLifecycleConditions())
				tPhysicalComponent.getLifecycleConditions().add(transformLifecycleCondition(eLifecycleCondition));
		
		if (ePhysicalComponent.getMaintenanceProcedure() != null) {
			tPhysicalComponent.setMaintenanceProcedure(DependabilityThriftTranslater.transformMaintenanceProcedure(ePhysicalComponent.getMaintenanceProcedure()));
		}
		return tPhysicalComponent;
	}
	
	private static TDDILifecycleCondition transformLifecycleCondition(LifecycleCondition eLifecycleCondition) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eLifecycleCondition)) {
			return (TDDILifecycleCondition) BaseThriftTranslater.emf2ThriftMap.get(eLifecycleCondition);
		}
		
		TDDILifecycleCondition tLifecycleCondition = new TDDILifecycleCondition();
		BaseThriftTranslater.emf2ThriftMap.put(eLifecycleCondition, tLifecycleCondition);		
		BaseThriftTranslater.transformBaseElementContents(TLifecycleCondition.wrap(tLifecycleCondition), eLifecycleCondition);	
		
		if (eLifecycleCondition.getValue() != null)
			tLifecycleCondition.setValue(eLifecycleCondition.getValue());		
		if (eLifecycleCondition.getConditions() != null) {
			for (LifecycleCondition eSubCondition : eLifecycleCondition.getConditions()) {			
				tLifecycleCondition.getConditions().add(new TDDILifecycleCondition(transformLifecycleCondition(eSubCondition)));
			}
		}
		return tLifecycleCondition;
	}

	private static TDDISafetyRelatedSystem transformSafetyRelatedSystem(SafetyRelatedSystem eSafetyRelatedSystem) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eSafetyRelatedSystem)) {
			return (TDDISafetyRelatedSystem) BaseThriftTranslater.emf2ThriftMap.get(eSafetyRelatedSystem);
		}
		
		TDDISafetyRelatedSystem tSafetyRelatedSystem = new TDDISafetyRelatedSystem();
		BaseThriftTranslater.emf2ThriftMap.put(eSafetyRelatedSystem, tSafetyRelatedSystem);		
		transformSystemContents(TSafetyRelatedSystem.wrap(tSafetyRelatedSystem), eSafetyRelatedSystem);	
		
		if (eSafetyRelatedSystem.getSafeState() != null)
			tSafetyRelatedSystem.setSafeState(eSafetyRelatedSystem.getSafeState());

		return tSafetyRelatedSystem;
	}

	private static TDDISystem transformSystem(System eSystem) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eSystem)) {
			return (TDDISystem) BaseThriftTranslater.emf2ThriftMap.get(eSystem);
		}
		
		TDDISystem tSystem = new TDDISystem();
		BaseThriftTranslater.emf2ThriftMap.put(eSystem, tSystem);		
		transformSystemContents(TSystem.wrap(tSystem), eSystem);			
		
		return tSystem;
	}

	private static void transformSystemContents(ISystem tSystem, System emfSystem) {
		BaseThriftTranslater.transformBaseElementContents(tSystem, emfSystem);
		
		tSystem.setOverallLifetime(emfSystem.getOverallLifetime());
		tSystem.setOverallLifetimeTimeUnit(BaseThriftTranslater.transformTimeUnit(emfSystem.getOverallLifetimeTimeUnit()));
		
		if (emfSystem.getRealisedFunctions() != null) {
			for (Function emfFunc : emfSystem.getRealisedFunctions())
				tSystem.getRealisedFunctions().add(new TDDIAbstractFunctionRef(transformAbstractFunction(emfFunc)));
		}		
		if (emfSystem.getSubSystems() != null) {
			for (System emfSubsystem : emfSystem.getSubSystems())
				tSystem.getSubSystems().add(new TDDIAbstractSystemRef(transformAbstractSystem(emfSubsystem)));
		}		
		if (emfSystem.getSystemBoundaries() != null) {
			for (SystemBoundary eSystemBoundary: emfSystem.getSystemBoundaries()) {
				tSystem.getSystemBoundaries().add(transformSystemBoundary(eSystemBoundary));
			}
		}		
		if (emfSystem.getContexts() != null) {
			for (Context eContext : emfSystem.getContexts()) {
				tSystem.getContexts().add(transformContext(eContext));
			}
		}		
		if (emfSystem.getConfigurations() != null) {
			for (Configuration eConfiguration : emfSystem.getConfigurations()) {
				tSystem.getConfigurations().add(transformConfiguration(eConfiguration));
			}
		}
		if (emfSystem.getFailureModels() != null) {
			for (FailureModel eAbstractFailureModel : emfSystem.getFailureModels()) {
				tSystem.getFailureModels().add(new TDDIAbstractFailureModelRef(FailureLogicThriftTranslater.transformAbstractFailureModel(eAbstractFailureModel)));
			}
		}
		if (emfSystem.getPorts() != null) {
			for (Port ePort : emfSystem.getPorts()) {
				tSystem.getPorts().add(transformPort(ePort));
			}
		}
		if (emfSystem.getAppliedStandards() != null) {
			for (Standard eAbstractStandard : emfSystem.getAppliedStandards()) {
				tSystem.getAppliedStandards().add(new TDDIAbstractStandardRef(DomainThriftTranslater.transformAbstractStandard(eAbstractStandard)));
			}
		}
		
		if (emfSystem.getSignals() != null) {
			for (Signal eSignal : emfSystem.getSignals()) {
				tSystem.getSignals().add(transformSignal(eSignal));
			}
		}
		
		if (emfSystem.getAsAsset() != null) {
				tSystem.setAsAsset(TARAThriftTranslater.transformAbstractAsset(emfSystem.getAsAsset()));
			}
		
		if (emfSystem.getAssuranceLevel() != null) {
			tSystem.setAssuranceLevel(DomainThriftTranslater.transformAssuranceLevel(emfSystem.getAssuranceLevel()));
		}
		
		if (emfSystem.getDependabilityRequirements() != null) {
			for (DependabilityRequirement eAbstractDependabilityRequirement : emfSystem.getDependabilityRequirements()) {
				tSystem.getDependabilityRequirements().add(new TDDIAbstractDependabilityRequirementRef(RequirementsThriftTranslater.transformAbstractDependabilityRequirement(eAbstractDependabilityRequirement)));
			}
		}
	}
	
	private static TDDIAbstractFunction transformAbstractFunction(Function eFunction) {
		TDDIAbstractFunction tAbstractFunction = new TDDIAbstractFunction();
		if (eFunction instanceof SafetyFunction) {
			tAbstractFunction.UsedFunctionType = TDDIFunctionUnionType.FUTSafetyFunction;
			tAbstractFunction.UsedFunction = new TDDIFunctionUnion();
			tAbstractFunction.UsedFunction.setSafetyFunction(transformSafetyFunction((SafetyFunction) eFunction));
		} else if (eFunction instanceof Function) {
			tAbstractFunction.UsedFunctionType = TDDIFunctionUnionType.FUTFunction;
			tAbstractFunction.UsedFunction = new TDDIFunctionUnion();
			tAbstractFunction.UsedFunction.setFunction(transformFunction(eFunction));
		}
		return tAbstractFunction;
	}
	
	
	private static TDDISafetyFunction transformSafetyFunction(SafetyFunction eFunction) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eFunction)) {
			return (TDDISafetyFunction) BaseThriftTranslater.emf2ThriftMap.get(eFunction);
		}
		
		TDDISafetyFunction tFunction = new TDDISafetyFunction();
		BaseThriftTranslater.emf2ThriftMap.put(eFunction, tFunction);		
		transformFunctionContents(TSafetyFunction.wrap(tFunction), eFunction);	
	
		if (eFunction.getObject() != null)
			tFunction.setObject(eFunction.getObject());
		if (eFunction.getBehavior() != null)
			tFunction.setBehavior(eFunction.getBehavior());
		if (eFunction.getSafeState() != null)
			tFunction.setSafeState(eFunction.getSafeState());
		
		return tFunction;
	}
	
	private static TDDIFunction transformFunction(Function eFunction) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eFunction)) {
			return (TDDIFunction) BaseThriftTranslater.emf2ThriftMap.get(eFunction);
		}
		
		TDDIFunction tFunction = new TDDIFunction();
		BaseThriftTranslater.emf2ThriftMap.put(eFunction, tFunction);		
		transformFunctionContents(TFunction.wrap(tFunction), eFunction);	
		
		return tFunction;
	}
	
	

	private static void transformFunctionContents(IFunction tFunction, Function emfFunction) {
		BaseThriftTranslater.transformBaseElementContents(tFunction, emfFunction);
		
		if (emfFunction.getPerfChars() != null) {
			tFunction.setPerfChars(transformPerfChars(emfFunction.getPerfChars()));
		}
		if (emfFunction.getPorts() != null) {
			for (Port ePort : emfFunction.getPorts()) {
				tFunction.getPorts().add(transformPort(ePort));
			}
		}
		if (emfFunction.getSubFunctions() != null) {
			for (Function eSubFunction : emfFunction.getSubFunctions()) {
				tFunction.getSubFunctions().add(new TDDIAbstractFunctionRef(transformAbstractFunction(eSubFunction)));
			}
		}		
		if (emfFunction.getFailureModels() != null) {
			for (FailureModel eAbstractFailureModel : emfFunction.getFailureModels()) {
				tFunction.getFailureModels().add(new TDDIAbstractFailureModelRef(FailureLogicThriftTranslater.transformAbstractFailureModel(eAbstractFailureModel)));
			}
		}
		if (emfFunction.getMalfunctions() != null) {
			for (Malfunction eMalfunction : emfFunction.getMalfunctions()) {
				tFunction.getMalfunctions().add(new TDDIMalfunctionRef(HARAThriftTranslater.transformMalfunction(eMalfunction)));
			}
		}
		
		if (emfFunction.getSignals() != null) {
			for (Signal eSignal : emfFunction.getSignals()) {
				tFunction.getSignals().add(transformSignal(eSignal));
			}
		}
		
		if (emfFunction.getAsAsset() != null) {
				tFunction.setAsAsset(TARAThriftTranslater.transformAbstractAsset(emfFunction.getAsAsset()));
			}
		
		if (emfFunction.getAssuranceLevel() != null) {
			tFunction.setAssuranceLevel(DomainThriftTranslater.transformAssuranceLevel(emfFunction.getAssuranceLevel()));
		}
		
		if (emfFunction.getDependabilityRequirements() != null) {
			for (DependabilityRequirement eAbstractDependabilityRequirement : emfFunction.getDependabilityRequirements()) {
				tFunction.getDependabilityRequirements().add(new TDDIAbstractDependabilityRequirementRef(RequirementsThriftTranslater.transformAbstractDependabilityRequirement(eAbstractDependabilityRequirement)));
			}
		}
	}
	
	private static TDDISystemBoundary transformSystemBoundary(SystemBoundary eBoundary) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eBoundary)) {
			return (TDDISystemBoundary) BaseThriftTranslater.emf2ThriftMap.get(eBoundary);
		}
		
		TDDISystemBoundary tBoundary = new TDDISystemBoundary();
		BaseThriftTranslater.emf2ThriftMap.put(eBoundary, tBoundary);		
		BaseThriftTranslater.transformBaseElementContents(TSystemBoundary.wrap(tBoundary), eBoundary);	
		
		if (eBoundary.getPorts() != null) {
			for (Port ePort : eBoundary.getPorts()) {
				tBoundary.getPorts().add(new TDDIPortRef(transformPort(ePort)));
			}
		}
		
		return tBoundary;
	}
	
	private static TDDIContext transformContext(Context eContext) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eContext)) {
			return (TDDIContext) BaseThriftTranslater.emf2ThriftMap.get(eContext);
		}
		
		TDDIContext tContext = new TDDIContext();
		BaseThriftTranslater.emf2ThriftMap.put(eContext, tContext);		
		BaseThriftTranslater.transformBaseElementContents(TContext.wrap(tContext), eContext);			
		
		if (eContext.getUsageHistory() != null)
			tContext.setUsageHistory(eContext.getUsageHistory());
		tContext.setMissionTime(eContext.getMissionTime());
		if (eContext.getMissionTimeTimeUnit() != null)
			tContext.setMissionTimeTimeUnit(BaseThriftTranslater.transformTimeUnit(eContext.getMissionTimeTimeUnit()));
		return tContext;
	}
	
	private static TDDIConfiguration transformConfiguration(Configuration eConfiguration) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eConfiguration)) {
			return (TDDIConfiguration) BaseThriftTranslater.emf2ThriftMap.get(eConfiguration);
		}
		
		TDDIConfiguration tConfiguration = new TDDIConfiguration();
		BaseThriftTranslater.emf2ThriftMap.put(eConfiguration, tConfiguration);		
		BaseThriftTranslater.transformBaseElementContents(TConfiguration.wrap(tConfiguration), eConfiguration);	
		
		if (eConfiguration.getSubSystems() != null) {
			for (System eAbstractSystem : eConfiguration.getSubSystems()) {
				tConfiguration.getSubSystems().add(new TDDIAbstractSystemRef(transformAbstractSystem(eAbstractSystem)));
			}
		}
		
		return tConfiguration;
	}
	
	private static TDDIPort transformPort(Port ePort) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(ePort)) {
			return (TDDIPort) BaseThriftTranslater.emf2ThriftMap.get(ePort);
		}
		
		TDDIPort tPort = new TDDIPort();
		BaseThriftTranslater.emf2ThriftMap.put(ePort, tPort);		
		BaseThriftTranslater.transformBaseElementContents(TPort.wrap(tPort), ePort);	
		
		if (ePort.getFlowType() != null)
			tPort.setFlowType(ePort.getFlowType());
		if (ePort.getDirection() != null) {
			switch (ePort.getDirection()) {
			case IN: tPort.setDirection(TDDIPortDirection.PDIN);
				break;
			case INOUT: tPort.setDirection(TDDIPortDirection.PDINOUT);
				break;
			case OUT: tPort.setDirection(TDDIPortDirection.PDOUT);
				break;
			}
		}
		if (ePort.getRefinedPorts() != null) {
			for (Port eRefinedPort : ePort.getRefinedPorts()) {			
				tPort.getRefinedPorts().add(new TDDIPortRef(transformPort(eRefinedPort)));
			}
		}
		if (ePort.getInterfaceFailures() != null) {
			for (Failure eAbstractInterfaceFailure : ePort.getInterfaceFailures()) {			
				tPort.getInterfaceFailures().add(new TDDIAbstractFailureRef(FailureLogicThriftTranslater.transformAbstractFailure(eAbstractInterfaceFailure)));
			}
		}
		return tPort;
	}
	
	private static TDDISignal transformSignal(Signal eSignal) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eSignal)) {
			return (TDDISignal) BaseThriftTranslater.emf2ThriftMap.get(eSignal);
		}
		
		TDDISignal tSignal = new TDDISignal();
		BaseThriftTranslater.emf2ThriftMap.put(eSignal, tSignal);		
		BaseThriftTranslater.transformBaseElementContents(TSignal.wrap(tSignal), eSignal);	
	
		if (eSignal.getFromPort() != null)
			tSignal.setFromPort(transformPort(eSignal.getFromPort()));
		if (eSignal.getToPort() != null)
			tSignal.setToPort(transformPort(eSignal.getToPort()));
		
		return tSignal;
	}
	
	private static TDDIPerfChars transformPerfChars(PerfChars ePerfChars) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(ePerfChars)) {
			return (TDDIPerfChars) BaseThriftTranslater.emf2ThriftMap.get(ePerfChars);
		}
		
		TDDIPerfChars tPerfChars = new TDDIPerfChars();
		BaseThriftTranslater.emf2ThriftMap.put(ePerfChars, tPerfChars);		
		BaseThriftTranslater.transformBaseElementContents(TPerfChars.wrap(tPerfChars), ePerfChars);	
		
		tPerfChars.setResponseTime(ePerfChars.getResponseTime());
		
		return tPerfChars;
	}
}
