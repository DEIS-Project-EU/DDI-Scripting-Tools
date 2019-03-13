package transformation.thrift2ode;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
import thriftContract.TDDIAbstractDependabilityRequirement;
import thriftContract.TDDIAbstractFailure;
import thriftContract.TDDIAbstractFailureModel;
import thriftContract.TDDIAbstractFunction;
import thriftContract.TDDIAbstractStandard;
import thriftContract.TDDIAbstractSystem;
import thriftContract.TDDIConfiguration;
import thriftContract.TDDIContext;
import thriftContract.TDDIDesignPackage;
import thriftContract.TDDIFunction;
import thriftContract.TDDILifecycleCondition;
import thriftContract.TDDILogicalComponent;
import thriftContract.TDDIMalfunction;
import thriftContract.TDDIPerfChars;
import thriftContract.TDDIPhysicalComponent;
import thriftContract.TDDIPort;
import thriftContract.TDDISafetyFunction;
import thriftContract.TDDISafetyRelatedSystem;
import thriftContract.TDDISignal;
import thriftContract.TDDISystem;
import thriftContract.TDDISystemBoundary;
import util.EMFFactory;

public class ArchitectureEMFTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(ArchitectureEMFTranslater.class);
	
	public static DesignPackage transformDesignPackage(TDDIDesignPackage tDesignPackage){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tDesignPackage)){
			return (DesignPackage) BaseEMFTranslater.thrift2EmfMap.get(tDesignPackage);
		}
		
		DesignPackage emfDesignPackage = EMFFactory.architectureFactory.createDesignPackage();
		BaseEMFTranslater.thrift2EmfMap.put(tDesignPackage, emfDesignPackage);
		BaseEMFTranslater.transformBaseElementContents(TDesignPackage.wrap(tDesignPackage), emfDesignPackage);
		
		if(tDesignPackage.isSetSystems()){
			for(TDDIAbstractSystem tAbstractSystem : tDesignPackage.getSystems()){
				emfDesignPackage.getSystems().add(transformAbstractSystem(tAbstractSystem));
			}	
		}
		
		if(tDesignPackage.isSetFunctions()){
			for(TDDIAbstractFunction tAbstractFunction : tDesignPackage.getFunctions()){
				emfDesignPackage.getFunctions().add(transformAbstractFunction(tAbstractFunction));
			}
		}
		return emfDesignPackage;
	}
	
	private static System transformAbstractSystem(TDDIAbstractSystem tAbstractSystem) {
		if(tAbstractSystem.isSetUsedSystemType()){
			switch(tAbstractSystem.UsedSystemType){
			case SUTLogicalComponent:
				return transformLogicalComponent(tAbstractSystem.UsedSystem.getLogicalComponent());
			case SUTPhysicalComponent:
				return transformPhysicalComponent(tAbstractSystem.UsedSystem.getPhysicalComponent());
			case SUTSafetyRelatedSystem:
				return transformSafetyRelatedSystem(tAbstractSystem.UsedSystem.getSafetyRelatedSystem());
			case SUTSystem:
				return transformSystem(tAbstractSystem.UsedSystem.getSystem());
			default:
				break;
			
			}
		}
		return EMFFactory.architectureFactory.createSystem();
	}

	private static LogicalComponent transformLogicalComponent(TDDILogicalComponent tddiLogicalComponent) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiLogicalComponent)) {
			Log.info("Reusing LogicalComponent '"+tddiLogicalComponent.Name+"' from Map");
			return (LogicalComponent) BaseEMFTranslater.thrift2EmfMap.get(tddiLogicalComponent);
		}
		LogicalComponent emfLogicalComponent = EMFFactory.architectureFactory.createLogicalComponent();
		BaseEMFTranslater.thrift2EmfMap.put(tddiLogicalComponent,emfLogicalComponent );
		Log.info("LogicalComponent '"+tddiLogicalComponent.Name+"' created");
		transformSystemContents(TLogicalComponent.wrap(tddiLogicalComponent), emfLogicalComponent);			
		
		return emfLogicalComponent;
	}

	private static PhysicalComponent transformPhysicalComponent(TDDIPhysicalComponent tddiPhysicalComponent) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiPhysicalComponent)) {
			Log.info("Reusing PhysicalComponent '"+tddiPhysicalComponent.Name+"' from Map");
			return (PhysicalComponent) BaseEMFTranslater.thrift2EmfMap.get(tddiPhysicalComponent);
		}
		PhysicalComponent emfPhysicalComponent = EMFFactory.architectureFactory.createPhysicalComponent();
		BaseEMFTranslater.thrift2EmfMap.put(tddiPhysicalComponent,emfPhysicalComponent );
		Log.info("PhysicalComponent '"+tddiPhysicalComponent.Name+"' created");
		transformSystemContents(TPhysicalComponent.wrap(tddiPhysicalComponent), emfPhysicalComponent);
		
		if (tddiPhysicalComponent.isSetDimensions())
			emfPhysicalComponent.setDimensions(tddiPhysicalComponent.Dimensions);
		if (tddiPhysicalComponent.isSetPricePerUnit())
			emfPhysicalComponent.setPricePerUnit(tddiPhysicalComponent.PricePerUnit);
		if (tddiPhysicalComponent.isSetMass())
			emfPhysicalComponent.setMass(tddiPhysicalComponent.Mass);
		if (tddiPhysicalComponent.isSetProtectionCategory())
			emfPhysicalComponent.setProtectionCategory(tddiPhysicalComponent.ProtectionCategory);
		if (tddiPhysicalComponent.isSetUsefulLifetime())
			emfPhysicalComponent.setUsefulLifetime(tddiPhysicalComponent.UsefulLifetime);
		if (tddiPhysicalComponent.isSetUsefulLifetimeTimeUnit())
			emfPhysicalComponent.setUsefulLifetimeTimeUnit(BaseEMFTranslater.transformTimeUnit(tddiPhysicalComponent.getUsefulLifetimeTimeUnit()));
		
		if (tddiPhysicalComponent.isSetLogicalComponents())
			for (TDDILogicalComponent tLogicalComponent : tddiPhysicalComponent.getLogicalComponents().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfPhysicalComponent.getLogicalComponents().add(transformLogicalComponent(tLogicalComponent));
			}
		
		if (tddiPhysicalComponent.isSetLifecycleConditions())
			for (TDDILifecycleCondition tLifecycleCondition : tddiPhysicalComponent.LifecycleConditions){
				emfPhysicalComponent.getLifecycleConditions().add(transformLifecycleCondition(tLifecycleCondition));
			}
		
		if (tddiPhysicalComponent.isSetMaintenanceProcedure()) {
			emfPhysicalComponent.setMaintenanceProcedure(DependabilityEMFTranslater.transformMaintenanceProcedure(tddiPhysicalComponent.MaintenanceProcedure));
		}
		return emfPhysicalComponent;
	}
	
	private static LifecycleCondition transformLifecycleCondition(TDDILifecycleCondition tddiLifecycleCondition) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiLifecycleCondition)) {
			Log.info("Reusing LifecycleCondition '"+tddiLifecycleCondition.Name+"' from Map");
			return (LifecycleCondition) BaseEMFTranslater.thrift2EmfMap.get(tddiLifecycleCondition);
		}
		
		LifecycleCondition emfLifecycleCondition = EMFFactory.architectureFactory.createLifecycleCondition();	
		BaseEMFTranslater.thrift2EmfMap.put(tddiLifecycleCondition, emfLifecycleCondition);
		Log.info("LifecycleCondition '"+tddiLifecycleCondition.Name+"' created");
		BaseEMFTranslater.transformBaseElementContents(TLifecycleCondition.wrap(tddiLifecycleCondition), emfLifecycleCondition);
		
		if (tddiLifecycleCondition.isSetValue())
			emfLifecycleCondition.setValue(tddiLifecycleCondition.Value);		
		if (tddiLifecycleCondition.isSetConditions()) {
			for (TDDILifecycleCondition tSubCondition : tddiLifecycleCondition.getConditions()) {			
				emfLifecycleCondition.getConditions().add(transformLifecycleCondition(tSubCondition));
			}
		}
		return emfLifecycleCondition;
	}
	
	private static SafetyRelatedSystem transformSafetyRelatedSystem(TDDISafetyRelatedSystem tddiSafetyRelatedSystem) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiSafetyRelatedSystem)) {
			Log.info("Reusing SafetyRelatedSystem '"+tddiSafetyRelatedSystem.Name+"' from Map");
			return (SafetyRelatedSystem) BaseEMFTranslater.thrift2EmfMap.get(tddiSafetyRelatedSystem);
		}
		SafetyRelatedSystem emfSafetyRelatedSystem = EMFFactory.architectureFactory.createSafetyRelatedSystem();
		BaseEMFTranslater.thrift2EmfMap.put(tddiSafetyRelatedSystem, emfSafetyRelatedSystem);
		Log.info("SafetyRelatedSystem '"+tddiSafetyRelatedSystem.Name+"' created");
		transformSystemContents(TSafetyRelatedSystem.wrap(tddiSafetyRelatedSystem), emfSafetyRelatedSystem);
		
		if (tddiSafetyRelatedSystem.isSetSafeState())
			emfSafetyRelatedSystem.setSafeState(tddiSafetyRelatedSystem.SafeState);
		
		return emfSafetyRelatedSystem;
	}

	private static System transformSystem(TDDISystem tddiSystem) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiSystem)) {
			Log.info("Reusing System '"+tddiSystem.Name+"' from Map");
			return (System) BaseEMFTranslater.thrift2EmfMap.get(tddiSystem);
		}
		System emfSystem = EMFFactory.architectureFactory.createSystem();	
		BaseEMFTranslater.thrift2EmfMap.put(tddiSystem, emfSystem);
		Log.info("System '"+tddiSystem.Name+"' created");
		transformSystemContents(TSystem.wrap(tddiSystem), emfSystem);		
		
		return emfSystem;
	}

	private static void transformSystemContents(ISystem tSystem, System emfSystem) {
		BaseEMFTranslater.transformBaseElementContents(tSystem, emfSystem);
		
		if (tSystem.isSetOverallLifetime())
			emfSystem.setOverallLifetime(tSystem.getOverallLifetime());
		if (tSystem.isSetOverallLifetimeTimeUnit())
			emfSystem.setOverallLifetimeTimeUnit(BaseEMFTranslater.transformTimeUnit(tSystem.getOverallLifetimeTimeUnit()));
		
		
		if (tSystem.isSetSystemBoundaries()) {
			for (TDDISystemBoundary tSystemBoundary: tSystem.getSystemBoundaries()) {
				emfSystem.getSystemBoundaries().add(transformSystemBoundary(tSystemBoundary));
			}
		}		
		if (tSystem.isSetPorts()) {
			for (TDDIPort tPort : tSystem.getPorts()) {
				emfSystem.getPorts().add(transformPort(tPort));
			}
		}
		if(tSystem.isSetSignals()){
			for(TDDISignal tSignal : tSystem.getSignals()){
				emfSystem.getSignals().add(transformSignal(tSignal));
			}
		}
		if (tSystem.isSetContexts()) {
			for (TDDIContext tContext : tSystem.getContexts()) {
				emfSystem.getContexts().add(transformContext(tContext));
			}
		}		
		if (tSystem.isSetConfigurations()) {
			for (TDDIConfiguration tConfiguration : tSystem.getConfigurations()) {
				emfSystem.getConfigurations().add(transformConfiguration(tConfiguration));
			}
		}
		if (tSystem.isSetFailureModels()) {
			for (TDDIAbstractFailureModel tAbstractFailureModel : tSystem.getFailureModels().stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfSystem.getFailureModels().add(FailureLogicEMFTranslater.transformAbstractFailureModel(tAbstractFailureModel));
			}
		}
		if (tSystem.isSetAssuranceLevel()) {
			emfSystem.setAssuranceLevel(DomainEMFTranslater.transformAssuranceLevel(tSystem.getAssuranceLevel()));
		}
		if (tSystem.isSetDependabilityRequirements()){
			for(TDDIAbstractDependabilityRequirement tAbstractDependabilityRequirement : tSystem.getDependabilityRequirements().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfSystem.getDependabilityRequirements().add(RequirementsEMFTranslater.transformAbstractDependabilityRequirement(tAbstractDependabilityRequirement));
			}
		}
		if (tSystem.isSetAsAsset()){
			emfSystem.setAsAsset(TaraEMFTranslater.transformAbstractAsset(tSystem.getAsAsset()));
		}
		
		if (tSystem.isSetAppliedStandards()) {
			for (TDDIAbstractStandard tAbstractStandard : tSystem.getAppliedStandards().stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfSystem.getAppliedStandards().add(DomainEMFTranslater.transformAbstractStandard(tAbstractStandard));
			}
		}
		
		if (tSystem.isSetRealisedFunctions()) {
			for (TDDIAbstractFunction tAbstractRealizedFunction : tSystem.getRealisedFunctions().stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfSystem.getRealisedFunctions().add(transformAbstractFunction(tAbstractRealizedFunction));
			}
		}		
		if (tSystem.isSetSubSystems()) {
			for (TDDIAbstractSystem tAbstractSubSystem : tSystem.getSubSystems().stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				if (tAbstractSubSystem.isSetUsedSystemType()) {
					emfSystem.getSubSystems().add(transformAbstractSystem(tAbstractSubSystem));
				}
			}
		}		
	}
	
	private static SystemBoundary transformSystemBoundary(TDDISystemBoundary tddiSystemBoundary) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiSystemBoundary)) {
			Log.info("Reusing SystemBoundary '"+tddiSystemBoundary.Name+"' from Map");
			return (SystemBoundary) BaseEMFTranslater.thrift2EmfMap.get(tddiSystemBoundary);
		}
		SystemBoundary emfSystemBoundary = EMFFactory.architectureFactory.createSystemBoundary();
		BaseEMFTranslater.thrift2EmfMap.put(tddiSystemBoundary, emfSystemBoundary);
		Log.info("SystemBoundary '"+tddiSystemBoundary.Name+"' created");
		BaseEMFTranslater.transformBaseElementContents(TSystemBoundary.wrap(tddiSystemBoundary), emfSystemBoundary);
		
		if (tddiSystemBoundary.isSetPorts()) {
			for (TDDIPort tPort : tddiSystemBoundary.Ports.stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfSystemBoundary.getPorts().add(transformPort(tPort));
			}
		}
		return emfSystemBoundary;
	}
	
	private static Port transformPort(TDDIPort tddiPort) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiPort)) {
			Log.info("Reusing Port '"+tddiPort.Name+"' from Map");
			return (Port) BaseEMFTranslater.thrift2EmfMap.get(tddiPort);
		}
		
		Port emfPort = EMFFactory.architectureFactory.createPort();			
		BaseEMFTranslater.thrift2EmfMap.put(tddiPort, emfPort);
		Log.info("Port '"+tddiPort.Name+"' created");
		BaseEMFTranslater.transformBaseElementContents(TPort.wrap(tddiPort), emfPort);
		
		if (tddiPort.isSetFlowType())
			emfPort.setFlowType(tddiPort.FlowType);
		if (tddiPort.isSetDirection()) {
			switch (tddiPort.Direction) {
				case PDIN: emfPort.setDirection(PortDirection.IN);
					break;
				case PDINOUT: emfPort.setDirection(PortDirection.INOUT);
					break;
				case PDOUT: emfPort.setDirection(PortDirection.OUT);
					break;
			}
		}
		if (tddiPort.isSetRefinedPorts()) {
			for (TDDIPort tRefinedPort : tddiPort.RefinedPorts.stream().map(Ref -> Ref.ref).collect(Collectors.toList())) {			
				emfPort.getRefinedPorts().add(transformPort(tRefinedPort));
			}
		}
		if (tddiPort.isSetInterfaceFailures()) {
			for (TDDIAbstractFailure tAbstractFailure : tddiPort.InterfaceFailures.stream().map(Ref -> Ref.ref).collect(Collectors.toList())) {			
				emfPort.getInterfaceFailures().add(FailureLogicEMFTranslater.transformAbstractFailure(tAbstractFailure));
			}
		}
		if(tddiPort.isSetAssuranceLevel()){
			emfPort.setAssuranceLevel(DomainEMFTranslater.transformAssuranceLevel(tddiPort.getAssuranceLevel()));
		}
		if(tddiPort.isSetDependabilityRequirements()){
			for(TDDIAbstractDependabilityRequirement tAbstractDependabilityRequirement : tddiPort.getDependabilityRequirements().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfPort.getDependabilityRequirements().add(RequirementsEMFTranslater.transformAbstractDependabilityRequirement(tAbstractDependabilityRequirement));
			}
		}
		return emfPort;
	}
	
	private static Signal transformSignal(TDDISignal tddiSignal) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiSignal)) {
			Log.info("Reusing Signal '"+tddiSignal.Name+"' from Map");		
			return (Signal) BaseEMFTranslater.thrift2EmfMap.get(tddiSignal);
		}
		
		Signal emfSignal = EMFFactory.architectureFactory.createSignal();
		BaseEMFTranslater.thrift2EmfMap.put(tddiSignal, emfSignal);
		Log.info("Signal '"+tddiSignal.Name+"' created");
		BaseEMFTranslater.transformBaseElementContents(TSignal.wrap(tddiSignal), emfSignal);
		
		if (tddiSignal.isSetFromPort()) {
			emfSignal.setFromPort(transformPort(tddiSignal.FromPort));			
		}
		if (tddiSignal.isSetToPort()) {
			emfSignal.setToPort(transformPort(tddiSignal.ToPort));			
		}
		
		return emfSignal;
	}
	
	private static Context transformContext(TDDIContext tddiContext) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiContext)) {
			Log.info("Reusing Context '"+tddiContext.Name+"' from Map");
			return (Context) BaseEMFTranslater.thrift2EmfMap.get(tddiContext);
		}
		
		Context emfContext = EMFFactory.architectureFactory.createContext();
		BaseEMFTranslater.thrift2EmfMap.put(tddiContext, emfContext);
		Log.info("Context '"+tddiContext.Name+"' created");
		BaseEMFTranslater.transformBaseElementContents(TContext.wrap(tddiContext), emfContext);	
		
		if (tddiContext.isSetUsageHistory())
			emfContext.setUsageHistory(tddiContext.UsageHistory);
		if (tddiContext.isSetMissionTime())
			emfContext.setMissionTime(tddiContext.MissionTime);
		if (tddiContext.isSetMissionTimeTimeUnit())
			emfContext.setMissionTimeTimeUnit(BaseEMFTranslater.transformTimeUnit(tddiContext.getMissionTimeTimeUnit()));
		return emfContext;
	}
	
	private static Configuration transformConfiguration(TDDIConfiguration tddiConfiguration) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiConfiguration)) {
			Log.info("Reusing Configuration '"+tddiConfiguration.Name+"' from Map");
			return (Configuration) BaseEMFTranslater.thrift2EmfMap.get(tddiConfiguration);
		}
		
		Configuration emfConfiguration = EMFFactory.architectureFactory.createConfiguration();
		BaseEMFTranslater.thrift2EmfMap.put(tddiConfiguration, emfConfiguration);
		Log.info("Configuration '"+tddiConfiguration.Name+"' created");
		BaseEMFTranslater.transformBaseElementContents(TConfiguration.wrap(tddiConfiguration), emfConfiguration);
		
		if (tddiConfiguration.isSetSubSystems()) {
			for (TDDIAbstractSystem tAbstractSubSystem : tddiConfiguration.SubSystems.stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfConfiguration.getSubSystems().add(transformAbstractSystem(tAbstractSubSystem));
			}
		}
		return emfConfiguration;
	}

	private static Function transformAbstractFunction(TDDIAbstractFunction tAbstractFunction) {
		if(tAbstractFunction.isSetUsedFunctionType()){
			switch (tAbstractFunction.UsedFunctionType){
			case FUTFunction:
				return transformFunction(tAbstractFunction.UsedFunction.getFunction());
			case FUTSafetyFunction:
				return transformSafetyFunction(tAbstractFunction.UsedFunction.getSafetyFunction());
			default:
				break;
			}
		}
		return EMFFactory.architectureFactory.createFunction();
	}
	
	private static Function transformFunction(TDDIFunction tddiFunction) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiFunction)) {
			Log.info("Reusing Function '"+tddiFunction.Name+"' from Map");
			return (Function) BaseEMFTranslater.thrift2EmfMap.get(tddiFunction);
		}
		
		Function emfFunction = EMFFactory.architectureFactory.createFunction();	
		BaseEMFTranslater.thrift2EmfMap.put(tddiFunction, emfFunction);
		Log.info("Function '"+tddiFunction.Name+"' created");
		transformFunctionContents(TFunction.wrap(tddiFunction), emfFunction);
		
		return emfFunction;
	}
	
	private static SafetyFunction transformSafetyFunction(TDDISafetyFunction tddiSafetyFunction) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiSafetyFunction)) {
			Log.info("Reusing SafetyFunction '"+tddiSafetyFunction.Name+"' from Map");
			return (SafetyFunction) BaseEMFTranslater.thrift2EmfMap.get(tddiSafetyFunction);
		}
		SafetyFunction emfSafetyFunction = EMFFactory.architectureFactory.createSafetyFunction();
		BaseEMFTranslater.thrift2EmfMap.put(tddiSafetyFunction, emfSafetyFunction);
		Log.info("SafetyFunction '"+tddiSafetyFunction.Name+"' created");
		transformFunctionContents(TSafetyFunction.wrap(tddiSafetyFunction), emfSafetyFunction);
	
		if (tddiSafetyFunction.isSetObject())
			emfSafetyFunction.setObject(tddiSafetyFunction.Object);
		if (tddiSafetyFunction.isSetBehavior())
			emfSafetyFunction.setBehavior(tddiSafetyFunction.Behavior);
		if (tddiSafetyFunction.isSetSafeState())
			emfSafetyFunction.setSafeState(tddiSafetyFunction.SafeState);
		
		return emfSafetyFunction;
	}

	private static void transformFunctionContents(IFunction tFunction, Function emfFunction) {
		BaseEMFTranslater.transformBaseElementContents(tFunction, emfFunction);
		
		if (tFunction.isSetPerfChars()) {
			emfFunction.setPerfChars(transformPerfChars(tFunction.getPerfChars()));
		}
		if (tFunction.isSetPorts()) {
			for (TDDIPort tPort : tFunction.getPorts()) {
				emfFunction.getPorts().add(transformPort(tPort));
			}
		}
		if(tFunction.isSetSignals()){
			for(TDDISignal tSignal : tFunction.getSignals()){
				emfFunction.getSignals().add(transformSignal(tSignal));
			}
		}
		if (tFunction.isSetSubFunctions()) {
			for (TDDIAbstractFunction tAbstractSubFunction : tFunction.getSubFunctions().stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfFunction.getSubFunctions().add(transformAbstractFunction(tAbstractSubFunction));
			}
		}		
		if (tFunction.isSetFailureModels()) {
			for (TDDIAbstractFailureModel tAbstractFailureModel : tFunction.getFailureModels().stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfFunction.getFailureModels().add(FailureLogicEMFTranslater.transformAbstractFailureModel(tAbstractFailureModel));
			}
		}
		if (tFunction.isSetMalfunctions()) {
			for (TDDIMalfunction tMalfunction : tFunction.getMalfunctions().stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfFunction.getMalfunctions().add(HaraEMFTranslater.transformMalfunction(tMalfunction));
			}
		}
		if(tFunction.isSetAssuranceLevel()){
			emfFunction.setAssuranceLevel(DomainEMFTranslater.transformAssuranceLevel(tFunction.getAssuranceLevel()));
		}
		if(tFunction.isSetDependabilityRequirements()){
			for(TDDIAbstractDependabilityRequirement tAbstractDependabilityRequirement : tFunction.getDependabilityRequirements().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfFunction.getDependabilityRequirements().add(RequirementsEMFTranslater.transformAbstractDependabilityRequirement(tAbstractDependabilityRequirement));
			}
		}
		if(tFunction.isSetAsAsset()){
			emfFunction.setAsAsset(TaraEMFTranslater.transformAbstractAsset(tFunction.getAsAsset()));
		}
	}

	private static PerfChars transformPerfChars(TDDIPerfChars tddiPerfChars) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tddiPerfChars)) {
			Log.info("Reusing PerfChars '"+tddiPerfChars.Name+"' from Map");
			return (PerfChars) BaseEMFTranslater.thrift2EmfMap.get(tddiPerfChars);			
		}
		
		PerfChars emfPerfChars = EMFFactory.architectureFactory.createPerfChars();
		BaseEMFTranslater.thrift2EmfMap.put(tddiPerfChars, emfPerfChars);
		Log.info("PerfChars '"+tddiPerfChars.Name+"' created");
		BaseEMFTranslater.transformBaseElementContents(TPerfChars.wrap(tddiPerfChars), emfPerfChars);
		
		if (tddiPerfChars.isSetResponseTime())
			emfPerfChars.setResponseTime(tddiPerfChars.ResponseTime);
		
		return emfPerfChars;
	}
}
