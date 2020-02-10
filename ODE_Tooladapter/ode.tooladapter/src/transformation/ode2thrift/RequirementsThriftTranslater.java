package transformation.ode2thrift;

import dependability.iface.IDependabilityRequirement;
import dependability.iface.IRequirementSource;
import dependability.requirements.typed.TLegalContract;
import dependability.requirements.typed.TRequirementPackage;
import dependability.requirements.typed.TSafetyRequirement;
import dependability.requirements.typed.TSecurityRequirement;
import thriftContract.TDDIAbstractDependabilityRequirement;
import thriftContract.TDDIAbstractDependabilityRequirementRef;
import thriftContract.TDDIAbstractFailureRef;
import thriftContract.TDDIAbstractMeasureRef;
import thriftContract.TDDIAbstractRequirementSource;
import thriftContract.TDDIDependabilityRequirementUnion;
import thriftContract.TDDIDependabilityRequirementUnionType;
import thriftContract.TDDIHazardRef;
import thriftContract.TDDILegalContract;
import thriftContract.TDDIMaintenanceProcedureRef;
import thriftContract.TDDIRequirementPackage;
import thriftContract.TDDIRequirementSourceUnionType;
import thriftContract.TDDISafetyRequirement;
import thriftContract.TDDISecurityCapabilityRef;
import thriftContract.TDDISecurityRequirement;
import top.dependability.DependabilityRequirement;
import top.dependability.Hazard;
import top.dependability.LegalContract;
import top.dependability.MaintenanceProcedure;
import top.dependability.Measure;
import top.dependability.RequirementPackage;
import top.dependability.RequirementSource;
import top.dependability.SafetyRequirement;
import top.dependability.SecurityCapability;
import top.dependability.SecurityRequirement;
import top.failureLogic.Failure;

public class RequirementsThriftTranslater {

	public static TDDIRequirementPackage transformRequirementPackage(RequirementPackage eRequirementPackage){
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eRequirementPackage)){
			return (TDDIRequirementPackage) BaseThriftTranslater.emf2ThriftMap.get(eRequirementPackage);
		}
		
		TDDIRequirementPackage tRequirementPackage = new TDDIRequirementPackage();
		BaseThriftTranslater.emf2ThriftMap.put(eRequirementPackage, tRequirementPackage);
		ODE2ThriftTranslater.transformODEProductPackageContents(TRequirementPackage.wrap(tRequirementPackage), eRequirementPackage);
		
		if(eRequirementPackage.getRequirementSources() != null){
			for(RequirementSource eAbstractRequirementSource : eRequirementPackage.getRequirementSources()){
				tRequirementPackage.getRequirementSources().add(transformAbstractRequirementSource(eAbstractRequirementSource));
			}
		}
		
		if(eRequirementPackage.getDependabilityRequirements() != null){
			for(DependabilityRequirement eAbstractDependabilityRequirement : eRequirementPackage.getDependabilityRequirements()){
				tRequirementPackage.getDependabilityRequirements().add(transformAbstractDependabilityRequirement(eAbstractDependabilityRequirement));
			}
		}
		
		return tRequirementPackage;
	}
	
	private static TDDIAbstractRequirementSource transformAbstractRequirementSource(RequirementSource eAbstractRequirementSource) {
		TDDIAbstractRequirementSource tAbstractRequirementSource = new TDDIAbstractRequirementSource();
		
		if(eAbstractRequirementSource instanceof LegalContract){
			tAbstractRequirementSource.UsedRequirementSourceType = TDDIRequirementSourceUnionType.RSUTLegalContract;
			tAbstractRequirementSource.UsedRequirementSource.setLegalContract(transformLegalContract((LegalContract) eAbstractRequirementSource));
		}
		return tAbstractRequirementSource;
	}

	private static TDDILegalContract transformLegalContract(LegalContract eLegalContract) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eLegalContract)){
			return (TDDILegalContract) BaseThriftTranslater.emf2ThriftMap.get(eLegalContract);
		}
		
		TDDILegalContract tLegalContract = new TDDILegalContract();
		BaseThriftTranslater.emf2ThriftMap.put(eLegalContract, tLegalContract);
		transformRequirementSourceContents(TLegalContract.wrap(tLegalContract), eLegalContract);
		
		return tLegalContract;
	}
	
	private static void transformRequirementSourceContents(IRequirementSource tRequirementSource, RequirementSource eRequirementSource){
		BaseThriftTranslater.transformBaseElementContents(tRequirementSource, eRequirementSource);
	}

	public static TDDIAbstractDependabilityRequirement transformAbstractDependabilityRequirement(DependabilityRequirement eAbstractDependabilityRequirement) {
		TDDIAbstractDependabilityRequirement tAbstractDependabilityRequirement = new TDDIAbstractDependabilityRequirement();
		tAbstractDependabilityRequirement.UsedDependabilityRequirement = new TDDIDependabilityRequirementUnion();
		if(eAbstractDependabilityRequirement instanceof SecurityRequirement){
			tAbstractDependabilityRequirement.UsedDependabilityRequirementType = TDDIDependabilityRequirementUnionType.DRUTSecurityRequirement;
			tAbstractDependabilityRequirement.UsedDependabilityRequirement.setSecurityRequirement(transformSecurityRequirement((SecurityRequirement) eAbstractDependabilityRequirement));
		}
		
		else if (eAbstractDependabilityRequirement instanceof SafetyRequirement) {
			tAbstractDependabilityRequirement.UsedDependabilityRequirementType = TDDIDependabilityRequirementUnionType.DRUTSafetyRequirement;
			tAbstractDependabilityRequirement.UsedDependabilityRequirement.setSafetyRequirement(transformSafetyRequirement((SafetyRequirement) eAbstractDependabilityRequirement));
		}
		return tAbstractDependabilityRequirement;
	}

	private static TDDISecurityRequirement transformSecurityRequirement(SecurityRequirement eSecurityRequirement) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eSecurityRequirement)){
			return (TDDISecurityRequirement) BaseThriftTranslater.emf2ThriftMap.get(eSecurityRequirement);
		}
		
		TDDISecurityRequirement tSecurityRequirement = new TDDISecurityRequirement();
		BaseThriftTranslater.emf2ThriftMap.put(eSecurityRequirement, tSecurityRequirement);
		transformDependabilityRequirementContents(TSecurityRequirement.wrap(tSecurityRequirement), eSecurityRequirement);
		
		if(eSecurityRequirement.getSecurityCapabilities() != null){
			for(SecurityCapability eSecurityCapability : eSecurityRequirement.getSecurityCapabilities()){
				tSecurityRequirement.getSecurityCapabilities().add(new TDDISecurityCapabilityRef(TARAThriftTranslater.transformSecurityCapability(eSecurityCapability)));
			}
		}
		
		return tSecurityRequirement;
	}

	private static TDDISafetyRequirement transformSafetyRequirement(SafetyRequirement eSafetyRequirement) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eSafetyRequirement)){
			return (TDDISafetyRequirement) BaseThriftTranslater.emf2ThriftMap.get(eSafetyRequirement);
		}
		
		TDDISafetyRequirement tSafetyRequirement = new TDDISafetyRequirement();
		BaseThriftTranslater.emf2ThriftMap.put(eSafetyRequirement, tSafetyRequirement);
		transformDependabilityRequirementContents(TSafetyRequirement.wrap(tSafetyRequirement), eSafetyRequirement);
		
		tSafetyRequirement.setFailureReactionTime(eSafetyRequirement.getFailureReactionTime());
		tSafetyRequirement.setFailureDetectionTime(eSafetyRequirement.getFailureDetectionTime());
		tSafetyRequirement.setFailureLatencyTime(eSafetyRequirement.getFailureLatencyTime());
		
		tSafetyRequirement.setIsSafetyGoal(eSafetyRequirement.isIsSafetyGoal());
		
		if(eSafetyRequirement.getHazards() != null){
			for(Hazard eHazard : eSafetyRequirement.getHazards()){
				tSafetyRequirement.getHazards().add(new TDDIHazardRef(HARAThriftTranslater.transformHazard(eHazard)));
			}
		}
		
		return tSafetyRequirement;
	}
	
	private static void transformDependabilityRequirementContents(IDependabilityRequirement tDependabilityRequirement, DependabilityRequirement eDependabilityRequirement){
		BaseThriftTranslater.transformBaseElementContents(tDependabilityRequirement, eDependabilityRequirement);
		
		if(eDependabilityRequirement.getDecompositionArgument() != null){
			tDependabilityRequirement.setDecompositionArgument(eDependabilityRequirement.getDecompositionArgument());
		}
		
		if(eDependabilityRequirement.getMeasures() != null){
			for(Measure eAbstractMeasure : eDependabilityRequirement.getMeasures()){
				tDependabilityRequirement.getMeasures().add(new TDDIAbstractMeasureRef(DependabilityThriftTranslater.transformAbstractMeasure(eAbstractMeasure)));
			}
		}
		
		if(eDependabilityRequirement.getRefinedRequirements() != null){
			for(DependabilityRequirement eAbstractRefinedRequirement : eDependabilityRequirement.getRefinedRequirements()){
				tDependabilityRequirement.getRefinedRequiremnts().add(new TDDIAbstractDependabilityRequirementRef(transformAbstractDependabilityRequirement(eAbstractRefinedRequirement)));
			}
		}
		
		if(eDependabilityRequirement.getFailures() != null){
			for(Failure eAbstractFailure : eDependabilityRequirement.getFailures()){
				tDependabilityRequirement.getFailures().add(new TDDIAbstractFailureRef(FailureLogicThriftTranslater.transformAbstractFailure(eAbstractFailure)));
			}
		}
		
		if(eDependabilityRequirement.getAssuranceLevel() != null){
			tDependabilityRequirement.setAssuranceLevel(DomainThriftTranslater.transformAssuranceLevel(eDependabilityRequirement.getAssuranceLevel()));
		}
		
		if(eDependabilityRequirement.getMaintenanceProcedures() != null){
			for(MaintenanceProcedure eMaintenanceProcedure : eDependabilityRequirement.getMaintenanceProcedures()){
				tDependabilityRequirement.getMaintenanceProcedures().add(new TDDIMaintenanceProcedureRef(DependabilityThriftTranslater.transformMaintenanceProcedure(eMaintenanceProcedure)));
			}
		}
	}
}
