package transformation.thrift2ode;

import dependability.iface.IMeasure;
import dependability.typed.TDependabilityPackage;
import dependability.typed.TFaultToleranceMeasure;
import dependability.typed.TMaintenanceProcedure;
import dependability.typed.TMeasure;
import dependability.typed.TMeasureType;
import thriftContract.TDDIAbstractMeasure;
import thriftContract.TDDIDependabilityPackage;
import thriftContract.TDDIDomainPackage;
import thriftContract.TDDIFaultToleranceMeasure;
import thriftContract.TDDIHARAPackage;
import thriftContract.TDDIMaintenanceProcedure;
import thriftContract.TDDIMeasure;
import thriftContract.TDDIMeasureType;
import thriftContract.TDDIRequirementPackage;
import thriftContract.TDDITARAPackage;
import top.dependability.DependabilityPackage;
import top.dependability.FaultToleranceMeasure;
import top.dependability.MaintenanceProcedure;
import top.dependability.Measure;
import top.dependability.MeasureType;
import util.EMFFactory;

public class DependabilityEMFTranslater {

	public static DependabilityPackage transformDependabilityPackage(TDDIDependabilityPackage tDependabilityPackage){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tDependabilityPackage)) {
			return (DependabilityPackage) BaseEMFTranslater.thrift2EmfMap.get(tDependabilityPackage);
		}
		
		DependabilityPackage emfDependabilityPackage = EMFFactory.dependabilityFactory.createDependabilityPackage();
		BaseEMFTranslater.thrift2EmfMap.put(tDependabilityPackage, emfDependabilityPackage);
		BaseEMFTranslater.transformBaseElementContents(TDependabilityPackage.wrap(tDependabilityPackage), emfDependabilityPackage);
		
		if(tDependabilityPackage.isSetMeasures()){
			for(TDDIAbstractMeasure tAbstractMeasure : tDependabilityPackage.getMeasures()){
				emfDependabilityPackage.getMeasures().add(transformAbstractMeasure(tAbstractMeasure));
			}
		}
		
		if(tDependabilityPackage.isSetMeasureTypes()){
			for(TDDIMeasureType tMeasureType : tDependabilityPackage.getMeasureTypes()){
				emfDependabilityPackage.getMeasureTypes().add(transformMeasureType(tMeasureType));
			}
		}
		
		if(tDependabilityPackage.isSetMaintenanceProcedures()){
			for(TDDIMaintenanceProcedure tMaintenanceProcedure : tDependabilityPackage.getMaintenanceProcedures()){
				emfDependabilityPackage.getMaintenanceProcedures().add(transformMaintenanceProcedure(tMaintenanceProcedure));
			}
		}
		
		if(tDependabilityPackage.isSetHARAPackages()){
			for(TDDIHARAPackage tHARAPackage : tDependabilityPackage.getHARAPackages()){
				emfDependabilityPackage.getHARAPackages().add(HaraEMFTranslater.transformHARAPackage(tHARAPackage));
			}
		}
		
		if(tDependabilityPackage.isSetRequirementPackages()){
			for(TDDIRequirementPackage tRequirementPackage : tDependabilityPackage.getRequirementPackages()){
				emfDependabilityPackage.getRequirementPackages().add(RequirementsEMFTranslater.transformRequirementPackage(tRequirementPackage));
			}
		}
		
		if(tDependabilityPackage.isSetDomainPackages()){
			for(TDDIDomainPackage tDomainPackage : tDependabilityPackage.getDomainPackages()){
				emfDependabilityPackage.getDomainPackages().add(DomainEMFTranslater.transformDomainPackage(tDomainPackage));
			}
		}
		
		if(tDependabilityPackage.isSetTARAPackages()){
			for(TDDITARAPackage tTARAPackage : tDependabilityPackage.getTARAPackages()){
				emfDependabilityPackage.getTARAPackages().add(TaraEMFTranslater.transformTARAPackage(tTARAPackage));
			}
		}
		
		return emfDependabilityPackage;
	}
	
	public static Measure transformAbstractMeasure(TDDIAbstractMeasure tAbstractMeasure) {
		if(tAbstractMeasure.isSetUsedMeasureType()){
			switch (tAbstractMeasure.UsedMeasureType){
			case MUTFaultToleranceMeasure:
				return transformFaultToleranceMeasure(tAbstractMeasure.UsedMeasure.getFaultToleranceMeasure());
			case MUTMeasure:
				return transformMeasure(tAbstractMeasure.UsedMeasure.getMeasure());
			case MUTSecurityControl:
				return TaraEMFTranslater.transformSecurityControl(tAbstractMeasure.UsedMeasure.getSecurityControl());
			default:
				break;
			
			}
		}
		return EMFFactory.dependabilityFactory.createMeasure();
	}
	
	private static FaultToleranceMeasure transformFaultToleranceMeasure(TDDIFaultToleranceMeasure tFaultToleranceMeasure) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tFaultToleranceMeasure)){
			return (FaultToleranceMeasure) BaseEMFTranslater.thrift2EmfMap.get(tFaultToleranceMeasure);
		}
		
		FaultToleranceMeasure emfFaultToleranceMeasure = EMFFactory.dependabilityFactory.createFaultToleranceMeasure();
		BaseEMFTranslater.thrift2EmfMap.put(tFaultToleranceMeasure, emfFaultToleranceMeasure);
		transformMeasureContents(TFaultToleranceMeasure.wrap(tFaultToleranceMeasure), emfFaultToleranceMeasure);
		
		return emfFaultToleranceMeasure;
	}

	private static Measure transformMeasure(TDDIMeasure tMeasure) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tMeasure)){
			return (Measure) BaseEMFTranslater.thrift2EmfMap.get(tMeasure);
		}
		
		Measure emfMeasure = EMFFactory.dependabilityFactory.createFaultToleranceMeasure();
		BaseEMFTranslater.thrift2EmfMap.put(tMeasure, emfMeasure);
		transformMeasureContents(TMeasure.wrap(tMeasure), emfMeasure);
		
		return emfMeasure;
	}
	
	public static void transformMeasureContents(IMeasure tMeasure, Measure emfMeasure) {
		BaseEMFTranslater.transformBaseElementContents(tMeasure, emfMeasure);
		
		if(tMeasure.isSetIntrinsicSafety()){
			emfMeasure.setIntrinsicSafety(tMeasure.getIntrinsicSafety());
		}
		if(tMeasure.isSetSafeGuard()){
			emfMeasure.setSafeGuard(tMeasure.getSafeGuard());
		}
		if(tMeasure.isSetApplierInformation()){
			emfMeasure.setApplierInformation(tMeasure.getApplierInformation());
		}
		if(tMeasure.isSetRiskAcceptability()){
			emfMeasure.setRiskAcceptability(tMeasure.getRiskAcceptability());
		}
		if(tMeasure.isSetFurtherAction()){
			emfMeasure.setFurtherAction(tMeasure.getFurtherAction());
		}
		if(tMeasure.isSetSource()){
			emfMeasure.setSource(tMeasure.getSource());
		}
		if(tMeasure.isSetAssuranceLevel()){
			emfMeasure.setAssuranceLevel(DomainEMFTranslater.transformAssuranceLevel(tMeasure.getAssuranceLevel()));
		}
		if(tMeasure.isSetMeasureType()){
			emfMeasure.setMeasureType(transformMeasureType(tMeasure.getMeasureType()));
		}
	}

	private static MeasureType transformMeasureType(TDDIMeasureType tMeasureType) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tMeasureType)){
			return (MeasureType) BaseEMFTranslater.thrift2EmfMap.get(tMeasureType);
		}
		
		MeasureType emfMeasureType = EMFFactory.dependabilityFactory.createMeasureType();
		BaseEMFTranslater.thrift2EmfMap.put(tMeasureType, emfMeasureType);
		BaseEMFTranslater.transformBaseElementContents(TMeasureType.wrap(tMeasureType), emfMeasureType);
		
		return emfMeasureType;
	}

	public static MaintenanceProcedure transformMaintenanceProcedure(TDDIMaintenanceProcedure tMaintenanceProcedure) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tMaintenanceProcedure)){
			return (MaintenanceProcedure) BaseEMFTranslater.thrift2EmfMap.get(tMaintenanceProcedure);
		}
		
		MaintenanceProcedure emfMaintenanceProcedure = EMFFactory.dependabilityFactory.createMaintenanceProcedure();
		BaseEMFTranslater.thrift2EmfMap.put(tMaintenanceProcedure, emfMaintenanceProcedure);
		BaseEMFTranslater.transformBaseElementContents(TMaintenanceProcedure.wrap(tMaintenanceProcedure), emfMaintenanceProcedure);
		
		if(tMaintenanceProcedure.isSetActivityDescription()){
			emfMaintenanceProcedure.setActivityDescription(tMaintenanceProcedure.getActivityDescription());
		}
		
		if(tMaintenanceProcedure.isSetTechnicalDescription()){
			emfMaintenanceProcedure.setTechnicalDescription(tMaintenanceProcedure.getTechnicalDescription());
		}
		
		if(tMaintenanceProcedure.isSetToolSpecification()){
			emfMaintenanceProcedure.setToolSpecification(tMaintenanceProcedure.getToolSpecification());
		}
		
		if(tMaintenanceProcedure.isSetStaffNumber()){
			emfMaintenanceProcedure.setStaffNumber(tMaintenanceProcedure.getStaffNumber());
		}
		
		if(tMaintenanceProcedure.isSetStaffSkillLevel()){
			emfMaintenanceProcedure.setStaffSkillLevel(tMaintenanceProcedure.getStaffSkillLevel());
		}
		
		if(tMaintenanceProcedure.isSetStaffTrainingDescription()){
			emfMaintenanceProcedure.setStaffTrainingDescription(tMaintenanceProcedure.getStaffTrainingDescription());
		}
		
		return emfMaintenanceProcedure;
	}
}
