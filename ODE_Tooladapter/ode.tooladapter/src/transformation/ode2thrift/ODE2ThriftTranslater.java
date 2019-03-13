package transformation.ode2thrift;

import architecture.DesignPackage;
import dependability.DependabilityPackage;
import dependability.DomainPackage;
import dependability.HARAPackage;
import dependability.RequirementPackage;
import dependability.TARAPackage;
import failureLogic.FailureLogicPackage;
import integration.DDIPackage;
import integration.ODEProductPackage;
import integration.iface.IODEProductPackage;
import integration.typed.TDDIPackage;
import assuranceCase.AssuranceCasePackage;
import thriftContract.TDDIAbstractODEProductPackage;
import thriftContract.TDDIDDIPackage;
import thriftContract.TDDIODEProductPackageUnion;
import thriftContract.TDDIODEProductPackageUnionType;
import transformation.sacmOde2thrift.SacmAssuranceCaseThriftTranslator;

public class ODE2ThriftTranslater {
	
	public static TDDIDDIPackage transformDDIPackage(DDIPackage emfDDIPackage) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(emfDDIPackage)) {
			return (TDDIDDIPackage) BaseThriftTranslater.emf2ThriftMap.get(emfDDIPackage);
		}
		
		TDDIDDIPackage tDDIPackage = new TDDIDDIPackage();
		BaseThriftTranslater.emf2ThriftMap.put(emfDDIPackage, tDDIPackage);
		BaseThriftTranslater.transformBaseElementContents(TDDIPackage.wrap(tDDIPackage), emfDDIPackage);
		
		if(emfDDIPackage.getOdeProductPackages() != null){
			for(ODEProductPackage emfOdeProductPackage : emfDDIPackage.getOdeProductPackages()){
				tDDIPackage.getODEProductPackages().add(transformAbstractODEProductPackage(emfOdeProductPackage));
			}
		}
		
		if(emfDDIPackage.getAssuranceCasePackages() != null){
			for(AssuranceCasePackage eAssuranceCasePackage : emfDDIPackage.getAssuranceCasePackages()){
				tDDIPackage.getAssuranceCasePackages().add(SacmAssuranceCaseThriftTranslator.transformAbstractAssuranceCasePackage(eAssuranceCasePackage));
			}
		}
		return tDDIPackage;
	}

	private static TDDIAbstractODEProductPackage transformAbstractODEProductPackage(ODEProductPackage emfOdeProductPackage) {
		TDDIAbstractODEProductPackage tAbstractOdeProductPackage = new TDDIAbstractODEProductPackage();
		tAbstractOdeProductPackage.UsedODEProductPackage = new TDDIODEProductPackageUnion();
		if(emfOdeProductPackage instanceof DesignPackage){
			tAbstractOdeProductPackage.UsedODEProductPackageType = TDDIODEProductPackageUnionType.OPPUTDesignPackage;
			tAbstractOdeProductPackage.UsedODEProductPackage.setDesignPackage(ArchitectureThriftTranslater.transformDesignPackage((DesignPackage) emfOdeProductPackage));
		}
		else if (emfOdeProductPackage instanceof FailureLogicPackage) {
			tAbstractOdeProductPackage.UsedODEProductPackageType = TDDIODEProductPackageUnionType.OPPUTFailureLogicPackage;
			tAbstractOdeProductPackage.UsedODEProductPackage.setFailureLogicPackage(FailureLogicThriftTranslater.transformFailureLogicPackage((FailureLogicPackage) emfOdeProductPackage));
		}
		else if (emfOdeProductPackage instanceof DependabilityPackage) {
			tAbstractOdeProductPackage.UsedODEProductPackageType = TDDIODEProductPackageUnionType.OPPUTDependabilityPackage;
			tAbstractOdeProductPackage.UsedODEProductPackage.setDependabilityPackage(DependabilityThriftTranslater.transformDependabilityPackage((DependabilityPackage) emfOdeProductPackage));
		}
		else if (emfOdeProductPackage instanceof DomainPackage){
			tAbstractOdeProductPackage.UsedODEProductPackageType = TDDIODEProductPackageUnionType.OPPUTDomainPackage;
			tAbstractOdeProductPackage.UsedODEProductPackage.setDomainPackage(DomainThriftTranslater.transformDomainPackage((DomainPackage) emfOdeProductPackage));
		}
		else if (emfOdeProductPackage instanceof RequirementPackage){
			tAbstractOdeProductPackage.UsedODEProductPackageType = TDDIODEProductPackageUnionType.OPPUTRequirementPackage;
			tAbstractOdeProductPackage.UsedODEProductPackage.setRequirementPackage(RequirementsThriftTranslater.transformRequirementPackage((RequirementPackage) emfOdeProductPackage));
		}
		else if (emfOdeProductPackage instanceof HARAPackage){
			tAbstractOdeProductPackage.UsedODEProductPackageType = TDDIODEProductPackageUnionType.OPPUTHARAPackage;
			tAbstractOdeProductPackage.UsedODEProductPackage.setHARAPackage(HARAThriftTranslater.transformHARAPackage((HARAPackage) emfOdeProductPackage));
		}
		else if (emfOdeProductPackage instanceof TARAPackage){
			tAbstractOdeProductPackage.UsedODEProductPackageType = TDDIODEProductPackageUnionType.OPPUTTARAPackage;
			tAbstractOdeProductPackage.UsedODEProductPackage.setTARAPackage(TARAThriftTranslater.transformTARAPackage((TARAPackage) emfOdeProductPackage));
		}
		return tAbstractOdeProductPackage;
	}
	
	public static void transformODEProductPackageContents(IODEProductPackage tOdeProductPackage, ODEProductPackage eOdeProductPackage){
		BaseThriftTranslater.transformBaseElementContents(tOdeProductPackage, eOdeProductPackage);
	}

}
