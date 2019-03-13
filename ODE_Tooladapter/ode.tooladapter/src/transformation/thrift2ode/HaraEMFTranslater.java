package transformation.thrift2ode;

import java.util.stream.Collectors;

import dependability.Accident;
import dependability.HARAPackage;
import dependability.Hazard;
import dependability.HazardType;
import dependability.HazardTypeSystem;
import dependability.Malfunction;
import dependability.OperatorMeasure;
import dependability.RiskAssessment;
import dependability.RiskParameter;
import dependability.Situation;
import dependability.hara.typed.TAccident;
import dependability.hara.typed.THARAPackage;
import dependability.hara.typed.THazard;
import dependability.hara.typed.THazardType;
import dependability.hara.typed.THazardTypeSystem;
import dependability.hara.typed.TMalfunction;
import dependability.hara.typed.TOperatorMeasure;
import dependability.hara.typed.TRiskAssessment;
import dependability.hara.typed.TRiskParameter;
import dependability.hara.typed.TSituation;
import dependability.iface.IRiskParameter;
import thriftContract.TDDIAbstractFailure;
import thriftContract.TDDIAbstractMeasure;
import thriftContract.TDDIAbstractRiskParameter;
import thriftContract.TDDIAccident;
import thriftContract.TDDIHARAPackage;
import thriftContract.TDDIHazard;
import thriftContract.TDDIHazardType;
import thriftContract.TDDIHazardTypeSystem;
import thriftContract.TDDIMalfunction;
import thriftContract.TDDIOperatorMeasure;
import thriftContract.TDDIRiskAssessment;
import thriftContract.TDDIRiskParameter;
import thriftContract.TDDISituation;
import util.EMFFactory;

public class HaraEMFTranslater {

	public static HARAPackage transformHARAPackage(TDDIHARAPackage tHARAPackage){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tHARAPackage)){
			return (HARAPackage) BaseEMFTranslater.thrift2EmfMap.get(tHARAPackage);
		}
		
		HARAPackage emfHARAPackage = EMFFactory.dependabilityFactory.createHARAPackage();
		BaseEMFTranslater.thrift2EmfMap.put(tHARAPackage, emfHARAPackage);
		BaseEMFTranslater.transformBaseElementContents(THARAPackage.wrap(tHARAPackage), emfHARAPackage);
		
		if(tHARAPackage.isSetHazardTypes()){
			for(TDDIHazardType tHazardType : tHARAPackage.getHazardTypes()){
				emfHARAPackage.getHazardTypes().add(transformHazardType(tHazardType));
			}
		}
		
		if(tHARAPackage.isSetHazards()){
			for(TDDIHazard tHazard : tHARAPackage.getHazards()){
				emfHARAPackage.getHazards().add(transformHazard(tHazard));
			}
		}
		
		if(tHARAPackage.isSetMalfunctions()){
			for(TDDIMalfunction tMalFunction : tHARAPackage.getMalfunctions()){
				emfHARAPackage.getMalfunctions().add(transformMalfunction(tMalFunction));
			}
		}
		
		if(tHARAPackage.isSetHazardTypeSystems()){
			for(TDDIHazardTypeSystem tHazardTypeSystem : tHARAPackage.getHazardTypeSystems()){
				emfHARAPackage.getHazardTypeSystems().add(transformHazardTypeSystem(tHazardTypeSystem));
			}
		}
		
		if(tHARAPackage.isSetRiskParameters()){
			for(TDDIAbstractRiskParameter tAbstractRiskParameter : tHARAPackage.getRiskParameters()){
				emfHARAPackage.getRiskParameters().add(transformAbstractRiskParameter(tAbstractRiskParameter));
			}
		}
		
		if(tHARAPackage.isSetRiskAssessments()){
			for(TDDIRiskAssessment tRiskAssessment : tHARAPackage.getRiskAssessments()){
				emfHARAPackage.getRiskAssessments().add(transformRiskAssessment(tRiskAssessment));
			}
		}
		
		return emfHARAPackage;
	}
	
	private static RiskAssessment transformRiskAssessment(TDDIRiskAssessment tRiskAssessment) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tRiskAssessment)){
			return (RiskAssessment) BaseEMFTranslater.thrift2EmfMap.get(tRiskAssessment);
		}
		
		RiskAssessment emfRiskAssessment = EMFFactory.dependabilityFactory.createRiskAssessment();
		BaseEMFTranslater.thrift2EmfMap.put(tRiskAssessment, emfRiskAssessment);
		BaseEMFTranslater.transformBaseElementContents(TRiskAssessment.wrap(tRiskAssessment), emfRiskAssessment);
		
		if(tRiskAssessment.isSetRelatedStandard()){
			emfRiskAssessment.setRelatedStandard(tRiskAssessment.getRelatedStandard());
		}
		
		if(tRiskAssessment.isSetRiskParamaters()){
			for(TDDIAbstractRiskParameter tAbstractRiskParameter : tRiskAssessment.getRiskParamaters().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfRiskAssessment.getRiskParameters().add(transformAbstractRiskParameter(tAbstractRiskParameter));
			}
		}
		
		if(tRiskAssessment.isSetHazard()){
			emfRiskAssessment.setHazard(transformHazard(tRiskAssessment.getHazard()));
		}
		
		return emfRiskAssessment;
	}

	private static RiskParameter transformAbstractRiskParameter(TDDIAbstractRiskParameter tAbstractRiskParameter) {
		if(tAbstractRiskParameter.isSetUsedRiskParameterType()){
			switch(tAbstractRiskParameter.UsedRiskParameterType){
			case RPUTAccident:
				return transformAccident(tAbstractRiskParameter.UsedRiskParameter.getAccident());
			case RPUTOperatorMeasure:
				return transformOperatorMeasure(tAbstractRiskParameter.UsedRiskParameter.getOperatorMeasure());
			case RPUTRiskParameter:
				return transformRiskParameter(tAbstractRiskParameter.UsedRiskParameter.getRiskParameter());
			case RPUTSituation:
				return transformSituation(tAbstractRiskParameter.UsedRiskParameter.getSituation());
			
			}
		}
		return EMFFactory.dependabilityFactory.createRiskParameter();
	}
	
	private static Accident transformAccident(TDDIAccident tAccident) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tAccident)){
			return (Accident) BaseEMFTranslater.thrift2EmfMap.get(tAccident);
		}
		
		Accident emfAccident = EMFFactory.dependabilityFactory.createAccident();
		BaseEMFTranslater.thrift2EmfMap.put(tAccident, emfAccident);
		transformRiskparameterContents(TAccident.wrap(tAccident), emfAccident);
		
		if(tAccident.isSetSeverity()){
			emfAccident.setSeverity(tAccident.getSeverity());
		}
		
		return emfAccident;
	}

	private static OperatorMeasure transformOperatorMeasure(TDDIOperatorMeasure tOperatorMeasure) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tOperatorMeasure)){
			return (OperatorMeasure) BaseEMFTranslater.thrift2EmfMap.get(tOperatorMeasure);
		}
		
		OperatorMeasure emfOperatorMeasure = EMFFactory.dependabilityFactory.createOperatorMeasure();
		BaseEMFTranslater.thrift2EmfMap.put(tOperatorMeasure, emfOperatorMeasure);
		transformRiskparameterContents(TOperatorMeasure.wrap(tOperatorMeasure), emfOperatorMeasure);
		
		if(tOperatorMeasure.isSetControlability()){
			emfOperatorMeasure.setControlability(tOperatorMeasure.getControlability());
		}
		return emfOperatorMeasure;
	}

	private static RiskParameter transformRiskParameter(TDDIRiskParameter tRiskParameter) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tRiskParameter)){
			return (RiskParameter) BaseEMFTranslater.thrift2EmfMap.get(tRiskParameter);
		}
		
		RiskParameter emfRiskParameter = EMFFactory.dependabilityFactory.createRiskParameter();
		BaseEMFTranslater.thrift2EmfMap.put(tRiskParameter, emfRiskParameter);
		transformRiskparameterContents(TRiskParameter.wrap(tRiskParameter), emfRiskParameter);
		return emfRiskParameter;
	}
	
	private static Situation transformSituation(TDDISituation tSituation) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tSituation)){
			return (Situation) BaseEMFTranslater.thrift2EmfMap.get(tSituation);
		}
		
		Situation emfSituation = EMFFactory.dependabilityFactory.createSituation();
		BaseEMFTranslater.thrift2EmfMap.put(tSituation, emfSituation);
		transformRiskparameterContents(TSituation.wrap(tSituation), emfSituation);
		
		if(tSituation.isSetLikelihood()){
			emfSituation.setLikelihood(tSituation.getLikelihood());
		}
		
		return emfSituation;
	}
	
	private static void transformRiskparameterContents(IRiskParameter tRiskParameter, RiskParameter emfRiskParameter){
		BaseEMFTranslater.transformBaseElementContents(tRiskParameter, emfRiskParameter);
		if(tRiskParameter.isSetArgument()){
			emfRiskParameter.setArgument(tRiskParameter.getArgument());
		}
	}

	private static HazardTypeSystem transformHazardTypeSystem(TDDIHazardTypeSystem tHazardTypeSystem) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tHazardTypeSystem)){
			return (HazardTypeSystem) BaseEMFTranslater.thrift2EmfMap.get(tHazardTypeSystem);
		}
		
		HazardTypeSystem emfHazardTypeSystem = EMFFactory.dependabilityFactory.createHazardTypeSystem();
		BaseEMFTranslater.thrift2EmfMap.put(tHazardTypeSystem, emfHazardTypeSystem);
		BaseEMFTranslater.transformBaseElementContents(THazardTypeSystem.wrap(tHazardTypeSystem), emfHazardTypeSystem);
		
		if(tHazardTypeSystem.isSetHazardTypes()){
			for(TDDIHazardType tHazardType : tHazardTypeSystem.getHazardTypes().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfHazardTypeSystem.getHazardTypes().add(transformHazardType(tHazardType));
			}
		}
		
		return emfHazardTypeSystem;
	}

	public static Hazard transformHazard(TDDIHazard tHazard) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tHazard)){
			return (Hazard) BaseEMFTranslater.thrift2EmfMap.get(tHazard);
		}
		
		Hazard emfHazard = EMFFactory.dependabilityFactory.createHazard();
		BaseEMFTranslater.thrift2EmfMap.put(tHazard, emfHazard);
		BaseEMFTranslater.transformBaseElementContents(THazard.wrap(tHazard), emfHazard);
		
		if(tHazard.isSetHazardType()){
			emfHazard.setHazardType(transformHazardType(tHazard.getHazardType()));
		}
		
		if(tHazard.isSetCondition()){
			emfHazard.setCondition(tHazard.getCondition());
		}
		
		if(tHazard.isSetMeasures()){
			for(TDDIAbstractMeasure tAbstractMeasure : tHazard.getMeasures().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfHazard.getMeasures().add(DependabilityEMFTranslater.transformAbstractMeasure(tAbstractMeasure));
			}
		}
		
		if(tHazard.isSetFailures()){
			for(TDDIAbstractFailure tAbstractFailure : tHazard.getFailures().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfHazard.getFailures().add(FailureLogicEMFTranslater.transformAbstractFailure(tAbstractFailure));
			}
		}
		
		return emfHazard;
	}

	private static HazardType transformHazardType(TDDIHazardType tHazardType) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tHazardType)){
			return (HazardType) BaseEMFTranslater.thrift2EmfMap.get(tHazardType);
		}
		
		HazardType emfHazardType = EMFFactory.dependabilityFactory.createHazardType();
		BaseEMFTranslater.thrift2EmfMap.put(tHazardType, emfHazardType);
		BaseEMFTranslater.transformBaseElementContents(THazardType.wrap(tHazardType), emfHazardType);
		
		return emfHazardType;
	}

	public static Malfunction transformMalfunction(TDDIMalfunction tMalfunction) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tMalfunction)){
			return (Malfunction) BaseEMFTranslater.thrift2EmfMap.get(tMalfunction);
		}
		
		Malfunction emfMalfunction = EMFFactory.dependabilityFactory.createMalfunction();
		BaseEMFTranslater.thrift2EmfMap.put(tMalfunction, emfMalfunction);
		BaseEMFTranslater.transformBaseElementContents(TMalfunction.wrap(tMalfunction), emfMalfunction);
		
		if(tMalfunction.isSetHazards()){
			for(TDDIHazard tHazard : tMalfunction.getHazards().stream().map(ref->ref.ref).collect(Collectors.toList())){
				emfMalfunction.getHazards().add(transformHazard(tHazard));
			}
		}
		
		return emfMalfunction;
	}
}
