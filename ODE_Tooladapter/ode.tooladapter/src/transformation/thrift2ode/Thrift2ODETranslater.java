package transformation.thrift2ode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import integration.DDIPackage;
import integration.ODEProductPackage;
import integration.typed.TDDIPackage;
import thriftContract.TDDIAbstractAssuranceCasePackage;
import thriftContract.TDDIAbstractODEProductPackage;
import thriftContract.TDDIDDIPackage;
import transformation.sacmThrift2ode.SacmAssuranceCaseEMFTranslater;
import util.EMFFactory;
import util.MissingThriftUnionTypeException;


public class Thrift2ODETranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(ArchitectureEMFTranslater.class);
	
	public static DDIPackage transformDDIPackage(TDDIDDIPackage tDDIPackage) throws MissingThriftUnionTypeException{
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tDDIPackage)){
			return (DDIPackage) BaseEMFTranslater.thrift2EmfMap.get(tDDIPackage);
		}
		
		DDIPackage emfOdePackage = EMFFactory.integrationFactory.createDDIPackage();
		BaseEMFTranslater.thrift2EmfMap.put(tDDIPackage, emfOdePackage);
		BaseEMFTranslater.transformBaseElementContents(TDDIPackage.wrap(tDDIPackage), emfOdePackage);
		
		if(tDDIPackage.isSetODEProductPackages()){
			for(TDDIAbstractODEProductPackage tAbstractODEProductPackage : tDDIPackage.getODEProductPackages()){
				emfOdePackage.getOdeProductPackages().add(transformAbstractODEProductPackage(tAbstractODEProductPackage));
			}
		}
		
		if(tDDIPackage.isSetAssuranceCasePackages()){
			for(TDDIAbstractAssuranceCasePackage tAbstractAssuranceCasePackage : tDDIPackage.getAssuranceCasePackages()){
				emfOdePackage.getAssuranceCasePackages().add(SacmAssuranceCaseEMFTranslater.transformAbstractAssuranceCasePackage(tAbstractAssuranceCasePackage));
			}
		}
		return emfOdePackage;
	}
	
	public static ODEProductPackage transformAbstractODEProductPackage(TDDIAbstractODEProductPackage tAbstractODEProductPackage) throws MissingThriftUnionTypeException{
		if(tAbstractODEProductPackage.isSetUsedODEProductPackageType()){
			switch(tAbstractODEProductPackage.UsedODEProductPackageType){
			case OPPUTDependabilityPackage:
				return DependabilityEMFTranslater.transformDependabilityPackage(tAbstractODEProductPackage.UsedODEProductPackage.getDependabilityPackage());
			case OPPUTDesignPackage:
				return ArchitectureEMFTranslater.transformDesignPackage(tAbstractODEProductPackage.UsedODEProductPackage.getDesignPackage());
			case OPPUTDomainPackage:
				return DomainEMFTranslater.transformDomainPackage(tAbstractODEProductPackage.UsedODEProductPackage.getDomainPackage());
			case OPPUTFailureLogicPackage:
				return FailureLogicEMFTranslater.transformFailureLogicPackage(tAbstractODEProductPackage.UsedODEProductPackage.getFailureLogicPackage());
			case OPPUTHARAPackage:
				return HaraEMFTranslater.transformHARAPackage(tAbstractODEProductPackage.UsedODEProductPackage.getHARAPackage());
			case OPPUTRequirementPackage:
				return RequirementsEMFTranslater.transformRequirementPackage(tAbstractODEProductPackage.UsedODEProductPackage.getRequirementPackage());
			case OPPUTTARAPackage:
				return TaraEMFTranslater.transformTARAPackage(tAbstractODEProductPackage.UsedODEProductPackage.getTARAPackage());
			default:
				String message = "Transformation of ODEProductPackage of type " + tAbstractODEProductPackage.UsedODEProductPackageType.name() + " is not implemented yet. Package could not be transformed.";
				Log.warn(message);
				throw new MissingThriftUnionTypeException(message);
			}
		}
		else {
			String message = "Used ODE product package type was not set for abstract ODE product package.";
			Log.warn(message);
			throw new MissingThriftUnionTypeException(message);
		}
	}
}
