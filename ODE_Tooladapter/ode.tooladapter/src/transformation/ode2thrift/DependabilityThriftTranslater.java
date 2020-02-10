package transformation.ode2thrift;

import dependability.iface.IMeasure;
import dependability.typed.TDependabilityPackage;
import dependability.typed.TFaultToleranceMeasure;
import dependability.typed.TMaintenanceProcedure;
import dependability.typed.TMeasure;
import dependability.typed.TMeasureType;
import thriftContract.TDDIAbstractMeasure;
import thriftContract.TDDIDependabilityPackage;
import thriftContract.TDDIFaultToleranceMeasure;
import thriftContract.TDDIMaintenanceProcedure;
import thriftContract.TDDIMeasure;
import thriftContract.TDDIMeasureType;
import thriftContract.TDDIMeasureUnion;
import thriftContract.TDDIMeasureUnionType;
import top.dependability.DependabilityPackage;
import top.dependability.DomainPackage;
import top.dependability.FaultToleranceMeasure;
import top.dependability.HARAPackage;
import top.dependability.MaintenanceProcedure;
import top.dependability.Measure;
import top.dependability.MeasureType;
import top.dependability.RequirementPackage;
import top.dependability.SecurityControl;
import top.dependability.TARAPackage;

public class DependabilityThriftTranslater {

	public static TDDIDependabilityPackage transformDependabilityPackage(DependabilityPackage emfDepPackage) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(emfDepPackage)){
			return (TDDIDependabilityPackage) BaseThriftTranslater.emf2ThriftMap.get(emfDepPackage);
		}
		
		TDDIDependabilityPackage tDependabilityPackage = new TDDIDependabilityPackage();
		BaseThriftTranslater.emf2ThriftMap.put(emfDepPackage, tDependabilityPackage);
		ODE2ThriftTranslater.transformODEProductPackageContents(TDependabilityPackage.wrap(tDependabilityPackage), emfDepPackage);
		
		if(emfDepPackage.getMeasureTypes() != null){
			for(MeasureType eMeasureType : emfDepPackage.getMeasureTypes()){
				tDependabilityPackage.getMeasureTypes().add(transformMeasureType(eMeasureType));
			}
		}
		
		if(emfDepPackage.getMeasures() != null){
			for(Measure eMeasure : emfDepPackage.getMeasures()){
				tDependabilityPackage.getMeasures().add(transformAbstractMeasure(eMeasure));
			}
		}
		
		if(emfDepPackage.getMaintenanceProcedures() != null){
			for(MaintenanceProcedure eMaintenanceProcedure : emfDepPackage.getMaintenanceProcedures()){
				tDependabilityPackage.getMaintenanceProcedures().add(transformMaintenanceProcedure(eMaintenanceProcedure));
			}
		}

		if(emfDepPackage.getHARAPackages() != null){
			for(HARAPackage eHARAPackage : emfDepPackage.getHARAPackages()){
				tDependabilityPackage.getHARAPackages().add(HARAThriftTranslater.transformHARAPackage(eHARAPackage));
			}
		}
		
		if(emfDepPackage.getRequirementPackages() != null){
			for(RequirementPackage eRequirementPackage : emfDepPackage.getRequirementPackages()){
				tDependabilityPackage.getRequirementPackages().add(RequirementsThriftTranslater.transformRequirementPackage(eRequirementPackage));
			}
		}
		
		if(emfDepPackage.getDomainPackages() != null){
			for(DomainPackage eDomainPackage : emfDepPackage.getDomainPackages()){
				tDependabilityPackage.getDomainPackages().add(DomainThriftTranslater.transformDomainPackage(eDomainPackage));
			}
		}
		
		if(emfDepPackage.getTARAPackages() != null){
			for(TARAPackage eTARAPackage : emfDepPackage.getTARAPackages()){
				tDependabilityPackage.getTARAPackages().add(TARAThriftTranslater.transformTARAPackage(eTARAPackage));
			}
		}
		
		return tDependabilityPackage;
	}
	
	private static TDDIMeasureType transformMeasureType(MeasureType eMeasureType) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eMeasureType)){
			return (TDDIMeasureType) BaseThriftTranslater.emf2ThriftMap.get(eMeasureType);
		}
		
		TDDIMeasureType tMeasureType = new TDDIMeasureType();
		BaseThriftTranslater.emf2ThriftMap.put(eMeasureType, tMeasureType);
		BaseThriftTranslater.transformBaseElementContents(TMeasureType.wrap(tMeasureType), eMeasureType);
		
		return tMeasureType;
	}
	
	public static TDDIAbstractMeasure transformAbstractMeasure(Measure eAbstractMeasure) {
		TDDIAbstractMeasure tAbstractMeasure = new TDDIAbstractMeasure();
		if(eAbstractMeasure instanceof FaultToleranceMeasure){
			tAbstractMeasure.UsedMeasureType = TDDIMeasureUnionType.MUTFaultToleranceMeasure;
			tAbstractMeasure.UsedMeasure = new TDDIMeasureUnion();
			tAbstractMeasure.UsedMeasure.setFaultToleranceMeasure(transformFaultToleranceMeasure((FaultToleranceMeasure)eAbstractMeasure));
		}
		else if (eAbstractMeasure instanceof SecurityControl) {
			tAbstractMeasure.UsedMeasureType = TDDIMeasureUnionType.MUTSecurityControl;
			tAbstractMeasure.UsedMeasure = new TDDIMeasureUnion();
			tAbstractMeasure.UsedMeasure.setSecurityControl((TARAThriftTranslater.transformSecurityControl((SecurityControl)eAbstractMeasure)));
		}
		else if (eAbstractMeasure instanceof Measure) {
			tAbstractMeasure.UsedMeasureType = TDDIMeasureUnionType.MUTMeasure;
			tAbstractMeasure.UsedMeasure = new TDDIMeasureUnion();
			tAbstractMeasure.UsedMeasure.setMeasure((transformMeasure((Measure)eAbstractMeasure)));
		}
		return tAbstractMeasure;
	}

	

	private static TDDIFaultToleranceMeasure transformFaultToleranceMeasure(FaultToleranceMeasure eFaultToleranceMeasure) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eFaultToleranceMeasure)){
			return (TDDIFaultToleranceMeasure) BaseThriftTranslater.emf2ThriftMap.get(eFaultToleranceMeasure);
		}
		
		TDDIFaultToleranceMeasure tFaultToleranceMeasure = new TDDIFaultToleranceMeasure();
		BaseThriftTranslater.emf2ThriftMap.put(eFaultToleranceMeasure, tFaultToleranceMeasure);
		transformMeasureContents(TFaultToleranceMeasure.wrap(tFaultToleranceMeasure), eFaultToleranceMeasure);
		
		return tFaultToleranceMeasure;
	}
	
	private static TDDIMeasure transformMeasure(Measure eMeasure) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eMeasure)){
			return (TDDIMeasure) BaseThriftTranslater.emf2ThriftMap.get(eMeasure);
		}
		
		TDDIMeasure tMeasure = new TDDIMeasure();
		BaseThriftTranslater.emf2ThriftMap.put(eMeasure, tMeasure);
		transformMeasureContents(TMeasure.wrap(tMeasure), eMeasure);
		
		return tMeasure;
	}
	
	public static void transformMeasureContents(IMeasure tMeasure, Measure eMeasure){
		BaseThriftTranslater.transformBaseElementContents(tMeasure, eMeasure);
		
		if(eMeasure.getIntrinsicSafety() != null){
			tMeasure.setIntrinsicSafety(eMeasure.getIntrinsicSafety());
		}
		
		if(eMeasure.getSafeGuard() != null){
			tMeasure.setSafeGuard(eMeasure.getSafeGuard());
		}
		
		tMeasure.setRiskAcceptability(eMeasure.isRiskAcceptability());
		
		if(eMeasure.getFurtherAction() != null){
			tMeasure.setFurtherAction(eMeasure.getFurtherAction());
		}
		
		if(eMeasure.getSource() != null){
			tMeasure.setSource(eMeasure.getSource());
		}
		
		if(eMeasure.getAssuranceLevel() != null){
			tMeasure.setAssuranceLevel(DomainThriftTranslater.transformAssuranceLevel(eMeasure.getAssuranceLevel()));
		}
		
		if(eMeasure.getMeasureType() != null){
			tMeasure.setMeasureType(transformMeasureType(eMeasure.getMeasureType()));
		}
	}
	
	public static TDDIMaintenanceProcedure transformMaintenanceProcedure(MaintenanceProcedure eMaintenanceProcedure) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eMaintenanceProcedure)){
			return (TDDIMaintenanceProcedure) BaseThriftTranslater.emf2ThriftMap.get(eMaintenanceProcedure);
		}
		
		TDDIMaintenanceProcedure tMaintenanceProcedure = new TDDIMaintenanceProcedure();
		BaseThriftTranslater.emf2ThriftMap.put(eMaintenanceProcedure, tMaintenanceProcedure);
		BaseThriftTranslater.transformBaseElementContents(TMaintenanceProcedure.wrap(tMaintenanceProcedure), eMaintenanceProcedure);
		
		tMaintenanceProcedure.setStaffNumber(eMaintenanceProcedure.getStaffNumber());
		
		if(eMaintenanceProcedure.getActivityDescription() != null){
			tMaintenanceProcedure.setActivityDescription(eMaintenanceProcedure.getActivityDescription());
		}
		
		if(eMaintenanceProcedure.getTechnicalDescription() != null){
			tMaintenanceProcedure.setTechnicalDescription(eMaintenanceProcedure.getTechnicalDescription());
		}

		if(eMaintenanceProcedure.getToolSpecification() != null){
			tMaintenanceProcedure.setToolSpecification(eMaintenanceProcedure.getToolSpecification());
		}
		
		if(eMaintenanceProcedure.getStaffSkillLevel() != null){
			tMaintenanceProcedure.setStaffSkillLevel(eMaintenanceProcedure.getStaffSkillLevel());
		}
		
		if(eMaintenanceProcedure.getStaffTrainingDescription() != null){
			tMaintenanceProcedure.setStaffTrainingDescription(eMaintenanceProcedure.getStaffTrainingDescription());
		}
		return tMaintenanceProcedure;
	}
}
