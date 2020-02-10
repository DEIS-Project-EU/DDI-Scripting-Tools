package transformation.ode2thrift;

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
import thriftContract.TDDIAbstractFailureRef;
import thriftContract.TDDIAbstractMeasureRef;
import thriftContract.TDDIAbstractRiskParameter;
import thriftContract.TDDIAbstractRiskParameterRef;
import thriftContract.TDDIAccident;
import thriftContract.TDDIHARAPackage;
import thriftContract.TDDIHazard;
import thriftContract.TDDIHazardRef;
import thriftContract.TDDIHazardType;
import thriftContract.TDDIHazardTypeRef;
import thriftContract.TDDIHazardTypeSystem;
import thriftContract.TDDIMalfunction;
import thriftContract.TDDIOperatorMeasure;
import thriftContract.TDDIRiskAssessment;
import thriftContract.TDDIRiskParameter;
import thriftContract.TDDIRiskParameterUnion;
import thriftContract.TDDIRiskParameterUnionType;
import thriftContract.TDDISituation;
import top.dependability.Accident;
import top.dependability.HARAPackage;
import top.dependability.Hazard;
import top.dependability.HazardType;
import top.dependability.HazardTypeSystem;
import top.dependability.Malfunction;
import top.dependability.Measure;
import top.dependability.OperatorMeasure;
import top.dependability.RiskAssessment;
import top.dependability.RiskParameter;
import top.dependability.Situation;
import top.failureLogic.Failure;

public class HARAThriftTranslater {

	public static TDDIHARAPackage transformHARAPackage(HARAPackage eHARAPackage) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eHARAPackage)){
			return (TDDIHARAPackage) BaseThriftTranslater.emf2ThriftMap.get(eHARAPackage);
		}
		
		TDDIHARAPackage tHARAPackage = new TDDIHARAPackage();
		BaseThriftTranslater.emf2ThriftMap.put(eHARAPackage, tHARAPackage);
		ODE2ThriftTranslater.transformODEProductPackageContents(THARAPackage.wrap(tHARAPackage), eHARAPackage);
		
		if(eHARAPackage.getHazardTypes() != null){
			for(HazardType eHazardType : eHARAPackage.getHazardTypes()){
				tHARAPackage.getHazardTypes().add(transformHazardType(eHazardType));	
			}
		}
		
		if(eHARAPackage.getHazards() != null){
			for(Hazard eHazard : eHARAPackage.getHazards()){
				tHARAPackage.getHazards().add(transformHazard(eHazard));	
			}
		}
		
		if(eHARAPackage.getHazardTypeSystems() != null){
			for(HazardTypeSystem eHazardTypeSystem : eHARAPackage.getHazardTypeSystems()){
				tHARAPackage.getHazardTypeSystems().add(transformHazardTypeSystem(eHazardTypeSystem));	
			}
		}
		
		if(eHARAPackage.getMalfunctions() != null){
			for(Malfunction eMalfunction : eHARAPackage.getMalfunctions()){
				tHARAPackage.getMalfunctions().add(transformMalfunction(eMalfunction));	
			}
		}
		
		if(eHARAPackage.getRiskAssessments() != null){
			for(RiskAssessment eRiskAssessment : eHARAPackage.getRiskAssessments()){
				tHARAPackage.getRiskAssessments().add(transformRiskAssessment(eRiskAssessment));	
			}
		}
		
		if(eHARAPackage.getRiskParameters() != null){
			for(RiskParameter eRiskParameter : eHARAPackage.getRiskParameters()){
				tHARAPackage.getRiskParameters().add(transformAbstractRiskParameter(eRiskParameter));	
			}
		}
		
		return tHARAPackage;
	}
	
	private static TDDIHazardType transformHazardType(HazardType eHazardType) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eHazardType)){
			return (TDDIHazardType) BaseThriftTranslater.emf2ThriftMap.get(eHazardType);
		}
		
		TDDIHazardType tHazardType = new TDDIHazardType();
		BaseThriftTranslater.emf2ThriftMap.put(eHazardType, tHazardType);
		BaseThriftTranslater.transformBaseElementContents(THazardType.wrap(tHazardType), eHazardType);
		
		return tHazardType;
	}

	public static TDDIHazard transformHazard(Hazard eHazard) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eHazard)){
			return (TDDIHazard) BaseThriftTranslater.emf2ThriftMap.get(eHazard);
		}
		
		TDDIHazard tHazard = new TDDIHazard();
		BaseThriftTranslater.emf2ThriftMap.put(eHazard, tHazard);
		BaseThriftTranslater.transformBaseElementContents(THazard.wrap(tHazard), eHazard);
		
		if(eHazard.getCondition() != null){
			tHazard.setCondition(eHazard.getCondition());	
		}
		
		if(eHazard.getFailures() != null){
			for(Failure eAbstractFailure : eHazard.getFailures()){
				tHazard.getFailures().add(new TDDIAbstractFailureRef(FailureLogicThriftTranslater.transformAbstractFailure(eAbstractFailure)));	
			}
		}
	
		if(eHazard.getMeasures() != null){
			for(Measure eAbstractMeasure : eHazard.getMeasures()){
				tHazard.getMeasures().add(new TDDIAbstractMeasureRef(DependabilityThriftTranslater.transformAbstractMeasure(eAbstractMeasure)));	
			}
		}
		
		return tHazard;
	}

	private static TDDIHazardTypeSystem transformHazardTypeSystem(HazardTypeSystem eHazardTypeSystem) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eHazardTypeSystem)){
			return (TDDIHazardTypeSystem) BaseThriftTranslater.emf2ThriftMap.get(eHazardTypeSystem);
		}
		
		TDDIHazardTypeSystem tHazardTypeSystem = new TDDIHazardTypeSystem();
		BaseThriftTranslater.emf2ThriftMap.put(eHazardTypeSystem, tHazardTypeSystem);
		BaseThriftTranslater.transformBaseElementContents(THazardTypeSystem.wrap(tHazardTypeSystem), eHazardTypeSystem);
		
		if(eHazardTypeSystem.getHazardTypes() != null){
			for(HazardType eHazardType : eHazardTypeSystem.getHazardTypes()){
				tHazardTypeSystem.getHazardTypes().add(new TDDIHazardTypeRef(transformHazardType(eHazardType)));	
			}
		}
	
		return tHazardTypeSystem;
	}

	public static TDDIMalfunction transformMalfunction(Malfunction eMalfunction) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eMalfunction)){
			return (TDDIMalfunction) BaseThriftTranslater.emf2ThriftMap.get(eMalfunction);
		}
		
		TDDIMalfunction tMalfunction = new TDDIMalfunction();
		BaseThriftTranslater.emf2ThriftMap.put(eMalfunction, tMalfunction);
		BaseThriftTranslater.transformBaseElementContents(TMalfunction.wrap(tMalfunction), eMalfunction);
		
		if(eMalfunction.getHazards() != null){
			for(Hazard eHazardType : eMalfunction.getHazards()){
				tMalfunction.getHazards().add(new TDDIHazardRef(transformHazard(eHazardType)));	
			}
		}
	
		return tMalfunction;
	}
	
	private static TDDIRiskAssessment transformRiskAssessment(RiskAssessment eRiskAssessment) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eRiskAssessment)){
			return (TDDIRiskAssessment) BaseThriftTranslater.emf2ThriftMap.get(eRiskAssessment);
		}
		
		TDDIRiskAssessment tRiskAssessment = new TDDIRiskAssessment();
		BaseThriftTranslater.emf2ThriftMap.put(eRiskAssessment, tRiskAssessment);
		BaseThriftTranslater.transformBaseElementContents(TRiskAssessment.wrap(tRiskAssessment), eRiskAssessment);
		
		if(eRiskAssessment.getRelatedStandard() != null){
			tRiskAssessment.setRelatedStandard(eRiskAssessment.getRelatedStandard());	
		}
		
		if(eRiskAssessment.getHazard() != null){
			tRiskAssessment.setHazard(transformHazard(eRiskAssessment.getHazard()));	
		}
		
		if(eRiskAssessment.getRiskParameters() != null){
			for(RiskParameter eRiskParameter : eRiskAssessment.getRiskParameters()){
				tRiskAssessment.getRiskParamaters().add(new TDDIAbstractRiskParameterRef(transformAbstractRiskParameter(eRiskParameter)));	
			}
		}
		return tRiskAssessment;
	}

	private static TDDIAbstractRiskParameter transformAbstractRiskParameter(RiskParameter eAbstractRiskParameter) {
		TDDIAbstractRiskParameter tAbstractRiskParameter = new TDDIAbstractRiskParameter();
		tAbstractRiskParameter.UsedRiskParameter = new TDDIRiskParameterUnion();
		if(eAbstractRiskParameter instanceof Situation){
			tAbstractRiskParameter.UsedRiskParameterType = TDDIRiskParameterUnionType.RPUTSituation;
			tAbstractRiskParameter.UsedRiskParameter.setSituation(transformSituation((Situation)eAbstractRiskParameter));
		}
		else if (eAbstractRiskParameter instanceof Accident) {
			tAbstractRiskParameter.UsedRiskParameterType = TDDIRiskParameterUnionType.RPUTAccident;
			tAbstractRiskParameter.UsedRiskParameter.setAccident(transformAccident((Accident)eAbstractRiskParameter));
		}
		else if (eAbstractRiskParameter instanceof OperatorMeasure) {
			tAbstractRiskParameter.UsedRiskParameterType = TDDIRiskParameterUnionType.RPUTOperatorMeasure;
			tAbstractRiskParameter.UsedRiskParameter.setOperatorMeasure(transformOperatorMeasure((OperatorMeasure)eAbstractRiskParameter));
		}
		else if (eAbstractRiskParameter instanceof RiskParameter) {
			tAbstractRiskParameter.UsedRiskParameterType = TDDIRiskParameterUnionType.RPUTRiskParameter;
			tAbstractRiskParameter.UsedRiskParameter.setRiskParameter(transformRiskParameter((RiskParameter)eAbstractRiskParameter));
		}
		return tAbstractRiskParameter;
	}

	private static TDDISituation transformSituation(Situation eSituation) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eSituation)){
			return (TDDISituation) BaseThriftTranslater.emf2ThriftMap.get(eSituation);
		}
		
		TDDISituation tSituation = new TDDISituation();
		BaseThriftTranslater.emf2ThriftMap.put(eSituation, tSituation);
		transformRiskParameterContents(TSituation.wrap(tSituation), eSituation);
		
		if(eSituation.getLikelihood() != null){
			tSituation.setLikelihood(eSituation.getLikelihood());
		}
		
		return tSituation;
	}

	private static TDDIAccident transformAccident(Accident eAccident) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eAccident)){
			return (TDDIAccident) BaseThriftTranslater.emf2ThriftMap.get(eAccident);
		}
		
		TDDIAccident tAccident = new TDDIAccident();
		BaseThriftTranslater.emf2ThriftMap.put(eAccident, tAccident);
		transformRiskParameterContents(TAccident.wrap(tAccident), eAccident);
		
		if(eAccident.getSeverity() != null){
			tAccident.setSeverity(eAccident.getSeverity());
		}
		
		return tAccident;
	}

	private static TDDIOperatorMeasure transformOperatorMeasure(OperatorMeasure eOperatorMeasure) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eOperatorMeasure)){
			return (TDDIOperatorMeasure) BaseThriftTranslater.emf2ThriftMap.get(eOperatorMeasure);
		}
		
		TDDIOperatorMeasure tOperatorMeasure = new TDDIOperatorMeasure();
		BaseThriftTranslater.emf2ThriftMap.put(eOperatorMeasure, tOperatorMeasure);
		transformRiskParameterContents(TOperatorMeasure.wrap(tOperatorMeasure), eOperatorMeasure);
		
		if(eOperatorMeasure.getControlability() != null){
			tOperatorMeasure.setControlability(eOperatorMeasure.getControlability());
		}
		
		return tOperatorMeasure;
	}

	private static TDDIRiskParameter transformRiskParameter(RiskParameter eRiskParameter) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eRiskParameter)){
			return (TDDIRiskParameter) BaseThriftTranslater.emf2ThriftMap.get(eRiskParameter);
		}
		
		TDDIRiskParameter tRiskParameter = new TDDIRiskParameter();
		BaseThriftTranslater.emf2ThriftMap.put(eRiskParameter, tRiskParameter);
		transformRiskParameterContents(TRiskParameter.wrap(tRiskParameter), eRiskParameter);
		return tRiskParameter;
	}
	
	private static void transformRiskParameterContents(IRiskParameter tRiskParameter, RiskParameter eRiskParameter){
		BaseThriftTranslater.transformBaseElementContents(tRiskParameter, eRiskParameter);
		
		if(eRiskParameter.getArgument() != null){
			tRiskParameter.setArgument(eRiskParameter.getArgument());
		}
	}
}
