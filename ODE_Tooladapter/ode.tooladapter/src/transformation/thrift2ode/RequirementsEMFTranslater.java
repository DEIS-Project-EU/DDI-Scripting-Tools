package transformation.thrift2ode;

import java.util.stream.Collectors;

import dependability.iface.IDependabilityRequirement;
import dependability.iface.IRequirementSource;
import dependability.requirements.typed.TLegalContract;
import dependability.requirements.typed.TRequirementPackage;
import dependability.requirements.typed.TSafetyRequirement;
import dependability.requirements.typed.TSecurityRequirement;
import thriftContract.TDDIAbstractDependabilityRequirement;
import thriftContract.TDDIAbstractFailure;
import thriftContract.TDDIAbstractMeasure;
import thriftContract.TDDIAbstractRequirementSource;
import thriftContract.TDDIHazard;
import thriftContract.TDDILegalContract;
import thriftContract.TDDIMaintenanceProcedure;
import thriftContract.TDDIRequirementPackage;
import thriftContract.TDDISafetyRequirement;
import thriftContract.TDDISecurityCapability;
import thriftContract.TDDISecurityRequirement;
import top.dependability.DependabilityRequirement;
import top.dependability.LegalContract;
import top.dependability.RequirementPackage;
import top.dependability.RequirementSource;
import top.dependability.SafetyRequirement;
import top.dependability.SecurityRequirement;
import util.EMFFactory;

public class RequirementsEMFTranslater {

	public static RequirementPackage transformRequirementPackage(TDDIRequirementPackage tRequirementPackage){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tRequirementPackage)){
			return (RequirementPackage) BaseEMFTranslater.thrift2EmfMap.get(tRequirementPackage);
		}
		
		RequirementPackage emfRequirementPackage = EMFFactory.dependabilityFactory.createRequirementPackage();
		BaseEMFTranslater.thrift2EmfMap.put(tRequirementPackage, emfRequirementPackage);
		BaseEMFTranslater.transformBaseElementContents(TRequirementPackage.wrap(tRequirementPackage), emfRequirementPackage);
		
		if(tRequirementPackage.isSetRequirementSources()){
			for(TDDIAbstractRequirementSource tAbstractRequirementSource : tRequirementPackage.getRequirementSources()){
				emfRequirementPackage.getRequirementSources().add(transformAbstractRequirementSource(tAbstractRequirementSource));
			}
		}
		
		if(tRequirementPackage.isSetDependabilityRequirements()){
			for(TDDIAbstractDependabilityRequirement tAbstractDependabilityRequirement : tRequirementPackage.getDependabilityRequirements()){
				emfRequirementPackage.getDependabilityRequirements().add(transformAbstractDependabilityRequirement(tAbstractDependabilityRequirement));
			}
		}
		
		return emfRequirementPackage;
	}
	
	private static RequirementSource transformAbstractRequirementSource(TDDIAbstractRequirementSource tAbstractRequirementSource) {
		if(tAbstractRequirementSource.isSetUsedRequirementSourceType()){
			switch(tAbstractRequirementSource.UsedRequirementSourceType){
			case RSUTLegalContract:
				return transformLegalContract(tAbstractRequirementSource.UsedRequirementSource.getLegalContract());
			default:
				break;
			}
		}
		return EMFFactory.dependabilityFactory.createLegalContract();
	}

	private static LegalContract transformLegalContract(TDDILegalContract tLegalContract) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tLegalContract)){
			return (LegalContract) BaseEMFTranslater.thrift2EmfMap.get(tLegalContract);
		}
		
		LegalContract emfLegalContract = EMFFactory.dependabilityFactory.createLegalContract();
		BaseEMFTranslater.thrift2EmfMap.put(tLegalContract, emfLegalContract);
		transformRequirementSourceContents(TLegalContract.wrap(tLegalContract), emfLegalContract);
		
		return emfLegalContract;
	}
	
	private static void transformRequirementSourceContents(IRequirementSource tRequirementSource, RequirementSource emfRequirementSource){
		BaseEMFTranslater.transformBaseElementContents(tRequirementSource, emfRequirementSource);
	}
	

	public static DependabilityRequirement transformAbstractDependabilityRequirement(TDDIAbstractDependabilityRequirement tAbstractDependabilityRequirement) {
		if (tAbstractDependabilityRequirement.isSetUsedDependabilityRequirementType()) {
			switch (tAbstractDependabilityRequirement.UsedDependabilityRequirementType) {
				case DRUTSafetyRequirement:
					return transformSafetyRequirement(tAbstractDependabilityRequirement.UsedDependabilityRequirement.getSafetyRequirement());
				case DRUTSecurityRequirement:
					return transformSecurityRequirement(tAbstractDependabilityRequirement.UsedDependabilityRequirement.getSecurityRequirement());
			}
		}
		return EMFFactory.dependabilityFactory.createSafetyRequirement();
	}
	
	private static SafetyRequirement transformSafetyRequirement(TDDISafetyRequirement tSafetyRequirement) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tSafetyRequirement)){
			return (SafetyRequirement) BaseEMFTranslater.thrift2EmfMap.get(tSafetyRequirement);
		}
		
		SafetyRequirement emfSafetyRequirement = EMFFactory.dependabilityFactory.createSafetyRequirement();
		BaseEMFTranslater.thrift2EmfMap.put(tSafetyRequirement, emfSafetyRequirement);
		transformDependabilityRequirementContents(TSafetyRequirement.wrap(tSafetyRequirement), emfSafetyRequirement);
		
		if(tSafetyRequirement.isSetFailureReactionTime()){
			emfSafetyRequirement.setFailureReactionTime(tSafetyRequirement.getFailureReactionTime());
		}
		if(tSafetyRequirement.isSetFailureDetectionTime()){
			emfSafetyRequirement.setFailureDetectionTime(tSafetyRequirement.getFailureDetectionTime());
		}
		if(tSafetyRequirement.isSetFailureLatencyTime()){
			emfSafetyRequirement.setFailureLatencyTime(tSafetyRequirement.getFailureLatencyTime());
		}
		if(tSafetyRequirement.isSetHazards()){
			for(TDDIHazard tHazard : tSafetyRequirement.getHazards().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfSafetyRequirement.getHazards().add(HaraEMFTranslater.transformHazard(tHazard));
			}
		}
		
		return emfSafetyRequirement;
	}
	
	private static SecurityRequirement transformSecurityRequirement(TDDISecurityRequirement tSecurityRequirement) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tSecurityRequirement)){
			return (SecurityRequirement) BaseEMFTranslater.thrift2EmfMap.get(tSecurityRequirement);
		}
		
		SecurityRequirement emfSecurityRequirement = EMFFactory.dependabilityFactory.createSecurityRequirement();
		BaseEMFTranslater.thrift2EmfMap.put(tSecurityRequirement, emfSecurityRequirement);
		transformDependabilityRequirementContents(TSecurityRequirement.wrap(tSecurityRequirement), emfSecurityRequirement);
		
		if(tSecurityRequirement.isSetSecurityCapabilities()){
			for(TDDISecurityCapability tSecurityCapability : tSecurityRequirement.getSecurityCapabilities().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfSecurityRequirement.getSecurityCapabilities().add(TaraEMFTranslater.transformSecurityCapability(tSecurityCapability));
			}
		}
		
		return emfSecurityRequirement;
	}
	
	private static void transformDependabilityRequirementContents(IDependabilityRequirement tDependabilityRequirement, DependabilityRequirement emfDependabilityRequirement){
		BaseEMFTranslater.transformBaseElementContents(tDependabilityRequirement, emfDependabilityRequirement);
		
		if(tDependabilityRequirement.isSetDecompositionArgument()){
			emfDependabilityRequirement.setDecompositionArgument(tDependabilityRequirement.getDecompositionArgument());
		}
		
		if(tDependabilityRequirement.isSetRefinedRequirements()){
			for(TDDIAbstractDependabilityRequirement tAbstractDependabilityRequirement : tDependabilityRequirement.getRefinedRequiremnts().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfDependabilityRequirement.getRefinedRequirements().add(transformAbstractDependabilityRequirement(tAbstractDependabilityRequirement));
			}
		}
		
		if(tDependabilityRequirement.isSetRequirementSource()){
			emfDependabilityRequirement.setRequirementSource(transformAbstractRequirementSource(tDependabilityRequirement.getRequirementSource()));
		}
		
		if(tDependabilityRequirement.isSetMeasures()){
			for(TDDIAbstractMeasure tAbstractMeasure : tDependabilityRequirement.getMeasures().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfDependabilityRequirement.getMeasures().add(DependabilityEMFTranslater.transformAbstractMeasure(tAbstractMeasure));
			}
		}
		
		if(tDependabilityRequirement.isSetFailures()){
			for(TDDIAbstractFailure tAbstractFailure : tDependabilityRequirement.getFailures().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfDependabilityRequirement.getFailures().add(FailureLogicEMFTranslater.transformAbstractFailure(tAbstractFailure));
			}
		}
		
		if(tDependabilityRequirement.isSetAssuranceLevel()){
			emfDependabilityRequirement.setAssuranceLevel(DomainEMFTranslater.transformAssuranceLevel(tDependabilityRequirement.getAssuranceLevel()));
		}
		
		if(tDependabilityRequirement.isSetMaintenanceProcedures()){
			for(TDDIMaintenanceProcedure tMaintenanceProcedure : tDependabilityRequirement.getMaintenanceProcedures().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfDependabilityRequirement.getMaintenanceProcedures().add(DependabilityEMFTranslater.transformMaintenanceProcedure(tMaintenanceProcedure));
			}
		}
	}
}
