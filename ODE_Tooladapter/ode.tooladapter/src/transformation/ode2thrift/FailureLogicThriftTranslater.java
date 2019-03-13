package transformation.ode2thrift;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import failureLogic.Failure;
import failureLogic.FailureLogicPackage;
import failureLogic.FailureModel;
import failureLogic.MinimalCutSets;
import failureLogic.MinimalCutset;
import failureLogic.ProbDist;
import failureLogic.ProbDistParam;
import failureLogic.SecurityViolation;
import failureLogic.FMEA;
import failureLogic.FaultTree;
import failureLogic.MarkovChain;
import failurelogic.iface.IFailure;
import failurelogic.iface.IFailureModel;
import failurelogic.typed.TFailure;
import failurelogic.typed.TFailureLogicPackage;
import failurelogic.typed.TFailureModel;
import failurelogic.typed.TMinimalCutSet;
import failurelogic.typed.TMinimalCutSets;
import failurelogic.typed.TProbDist;
import failurelogic.typed.TProbDistParam;
import failurelogic.typed.TSecurityViolation;
import thriftContract.TDDIAbstractFailure;
import thriftContract.TDDIAbstractFailureModel;
import thriftContract.TDDIAbstractFailureModelRef;
import thriftContract.TDDIAbstractFailureRef;
import thriftContract.TDDIFailure;
import thriftContract.TDDIFailureLogicPackage;
import thriftContract.TDDIFailureModel;
import thriftContract.TDDIFailureModelUnion;
import thriftContract.TDDIFailureModelUnionType;
import thriftContract.TDDIFailureOriginType;
import thriftContract.TDDIFailureUnion;
import thriftContract.TDDIFailureUnionType;
import thriftContract.TDDIMinimalCutSet;
import thriftContract.TDDIMinimalCutSets;
import thriftContract.TDDIProbDist;
import thriftContract.TDDIProbDistParam;
import thriftContract.TDDISecurityViolation;

public class FailureLogicThriftTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(FailureLogicThriftTranslater.class);
	
	public static TDDIFailureLogicPackage transformFailureLogicPackage(FailureLogicPackage eFailureLogicPackage){
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eFailureLogicPackage)){
			return (TDDIFailureLogicPackage) BaseThriftTranslater.emf2ThriftMap.get(eFailureLogicPackage);
		}
		
		TDDIFailureLogicPackage tFailureLogicPackage = new TDDIFailureLogicPackage();
		BaseThriftTranslater.emf2ThriftMap.put(eFailureLogicPackage, tFailureLogicPackage);
		ODE2ThriftTranslater.transformODEProductPackageContents(TFailureLogicPackage.wrap(tFailureLogicPackage), eFailureLogicPackage);
		
		if(eFailureLogicPackage.getFailureModels() != null){
			for (FailureModel eFailureModel : eFailureLogicPackage.getFailureModels()){
				tFailureLogicPackage.getFailureModels().add(transformAbstractFailureModel(eFailureModel));
			}
		}
		
		return tFailureLogicPackage;
	}
	
	public static TDDIAbstractFailureModel transformAbstractFailureModel(FailureModel eFailureModel) {
		TDDIAbstractFailureModel tAbstractFailureModel = new TDDIAbstractFailureModel();
		tAbstractFailureModel.UsedFailureModel = new TDDIFailureModelUnion();
		
		if (eFailureModel instanceof MarkovChain) {
			tAbstractFailureModel.UsedFailureModelType = TDDIFailureModelUnionType.FAMUTMarkovChain;
			tAbstractFailureModel.UsedFailureModel.setMarkovChain(MarkovThriftTranslater.transformMarkovChain((MarkovChain) eFailureModel));
		}
		else if (eFailureModel instanceof FaultTree){
			tAbstractFailureModel.UsedFailureModelType = TDDIFailureModelUnionType.FAMUTFaultTree;
			tAbstractFailureModel.UsedFailureModel.setFaultTree(FTAThriftTranslater.transformFaultTree((FaultTree) eFailureModel));
		}
		else if (eFailureModel instanceof FMEA){
			tAbstractFailureModel.UsedFailureModelType = TDDIFailureModelUnionType.FAMUTFMEA;
			tAbstractFailureModel.UsedFailureModel.setFMEA(FMEAThriftTranslater.transformFMEA((FMEA) eFailureModel));
		}
		else if (eFailureModel instanceof FailureModel){
			tAbstractFailureModel.UsedFailureModelType = TDDIFailureModelUnionType.FAMUTFailureModel;
			tAbstractFailureModel.UsedFailureModel.setFailureModel(transformFailureModel(eFailureModel));
		}

		return tAbstractFailureModel;
	}
	
	private static TDDIFailureModel transformFailureModel(FailureModel eFailureModel){
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eFailureModel)){
			return (TDDIFailureModel) BaseThriftTranslater.emf2ThriftMap.get(eFailureModel);
		}
		
		TDDIFailureModel tFailureModel = new TDDIFailureModel();
		BaseThriftTranslater.emf2ThriftMap.put(eFailureModel, tFailureModel);
		transformFailureModelContents(TFailureModel.wrap(tFailureModel), eFailureModel);
		
		return null;
	}
	

	public static void transformFailureModelContents(IFailureModel tFailureModel, FailureModel eFailureModel) {
		BaseThriftTranslater.transformBaseElementContents(tFailureModel, eFailureModel);
		
		if(eFailureModel.getFailures() != null){
			for (Failure eFailure : eFailureModel.getFailures()){
				tFailureModel.getFailures().add(transformAbstractFailure(eFailure));
			}
		}
		
		if(eFailureModel.getMinimalCutsets() != null){
			for (MinimalCutSets eMinimalCutSets : eFailureModel.getMinimalCutsets()){
				tFailureModel.getMinimalCutsets().add(transformMinimalCutSets(eMinimalCutSets));
			}
		}
		
		if(eFailureModel.getSubModels() != null){
			for(FailureModel eSubModel : eFailureModel.getSubModels()){
				tFailureModel.getSubModels().add(new TDDIAbstractFailureModelRef(transformAbstractFailureModel(eSubModel)));
			}
		}
	}
	
	public static TDDIAbstractFailure transformAbstractFailure(Failure eAbstractFailure) {
		TDDIAbstractFailure tAbstractFailure = new TDDIAbstractFailure();
		tAbstractFailure.UsedFailure = new TDDIFailureUnion();
		
		if (eAbstractFailure instanceof SecurityViolation) {
			tAbstractFailure.UsedFailureType = TDDIFailureUnionType.FAILUTSecurityViolation;
			tAbstractFailure.UsedFailure.setSecurityViolation(transformSecurityViolation((SecurityViolation) eAbstractFailure));
		}
		else if (eAbstractFailure instanceof Failure) {
			tAbstractFailure.UsedFailureType = TDDIFailureUnionType.FAILUTFailure;
			tAbstractFailure.UsedFailure.setFailure(transformFailure(eAbstractFailure));
		}
		return tAbstractFailure;
	}

	private static TDDIFailure transformFailure(Failure eFailure) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eFailure)){
			return (TDDIFailure) BaseThriftTranslater.emf2ThriftMap.get(eFailure);
		}
		
		TDDIFailure tFailure = new TDDIFailure();
		BaseThriftTranslater.emf2ThriftMap.put(eFailure, tFailure);
		transformFailureContents(TFailure.wrap(tFailure), eFailure);
		
		return tFailure;
	}
	
	public static TDDISecurityViolation transformSecurityViolation(SecurityViolation eSecurityViolation){
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eSecurityViolation)){
			return (TDDISecurityViolation) BaseThriftTranslater.emf2ThriftMap.get(eSecurityViolation);
		}
		
		TDDISecurityViolation tSecurityViolation = new TDDISecurityViolation();
		BaseThriftTranslater.emf2ThriftMap.put(eSecurityViolation, tSecurityViolation);
		transformFailureContents(TSecurityViolation.wrap(tSecurityViolation), eSecurityViolation);
		
		return tSecurityViolation;
	}

	public static void transformFailureContents(IFailure tFailure, Failure eFailure) {
		BaseThriftTranslater.transformBaseElementContents(tFailure, eFailure);		
		
		if (eFailure.getOriginType() != null){
			switch (eFailure.getOriginType()){
			case INPUT:
				tFailure.setOriginType(TDDIFailureOriginType.FOTInput);
				break;
			case INTERNAL:
				tFailure.setOriginType(TDDIFailureOriginType.FOTInternal);
				break;
			case OUTPUT:
				tFailure.setOriginType(TDDIFailureOriginType.FOTOutput);
				break;
			default:
				Log.warn("Transformation for failure origin type " + eFailure.getOriginType().getName() + " is not implemented yet.");
				break;
			}
		}
		
		if (eFailure.getFailureClass() != null){
			tFailure.setFailureClass(eFailure.getFailureClass());
		}
		
		tFailure.setFailureRate(eFailure.getFailureRate());
		
		tFailure.setIsCCF(eFailure.isIsCcf());
		
		if (eFailure.getFailureProbDistribution() != null){
			tFailure.setFailureProbDistribution(transformProbDist(eFailure.getFailureProbDistribution()));
		}
		
		if (eFailure.getCcfFailures() != null){
			for (Failure eCcfFailure : eFailure.getCcfFailures()){
				tFailure.getCCFFailures().add(new TDDIAbstractFailureRef(transformAbstractFailure(eCcfFailure)));
			}
		}
	}

	public static TDDIProbDist transformProbDist(ProbDist eProbDist) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eProbDist)){
			return (TDDIProbDist) BaseThriftTranslater.emf2ThriftMap.get(eProbDist);
		}
		
		TDDIProbDist tProbDist = new TDDIProbDist();
		BaseThriftTranslater.emf2ThriftMap.put(eProbDist, tProbDist);
		BaseThriftTranslater.transformBaseElementContents(TProbDist.wrap(tProbDist), eProbDist);
		
		if(eProbDist.getType() != null){
			tProbDist.setType(eProbDist.getType());
		}
		
		if(eProbDist.getParameters() != null){
			for(ProbDistParam eProbDistParam : eProbDist.getParameters()){
				tProbDist.getParameters().add(transformProbDistParam(eProbDistParam));
			}
		}
		return tProbDist;
	}
	
	private static TDDIProbDistParam transformProbDistParam(ProbDistParam eProbDistParam) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eProbDistParam)) {
			return (TDDIProbDistParam) BaseThriftTranslater.emf2ThriftMap.get(eProbDistParam);
		}
		
		TDDIProbDistParam tProbDistParam = new TDDIProbDistParam();
		BaseThriftTranslater.emf2ThriftMap.put(eProbDistParam, tProbDistParam);	
		BaseThriftTranslater.transformBaseElementContents(TProbDistParam.wrap(tProbDistParam), eProbDistParam);
		
		if (eProbDistParam.getValue() != null) {
			tProbDistParam.setValue(eProbDistParam.getValue());
		}
		
		return tProbDistParam;
	}


	private static TDDIMinimalCutSets transformMinimalCutSets(MinimalCutSets eMinimalCutSets) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eMinimalCutSets)){
			return (TDDIMinimalCutSets) BaseThriftTranslater.emf2ThriftMap.get(eMinimalCutSets);
		}
		
		TDDIMinimalCutSets tMinimalCutSets = new TDDIMinimalCutSets();
		BaseThriftTranslater.emf2ThriftMap.put(eMinimalCutSets, tMinimalCutSets);
		BaseThriftTranslater.transformBaseElementContents(TMinimalCutSets.wrap(tMinimalCutSets), eMinimalCutSets);
		
		if(eMinimalCutSets.getFailures() != null){
			for(Failure eAbstractFailure : eMinimalCutSets.getFailures()){
				tMinimalCutSets.getFailures().add(new TDDIAbstractFailureRef(transformAbstractFailure(eAbstractFailure)));
			}
		}
		
		if(eMinimalCutSets.getCutsets() != null){
			for(MinimalCutset eMinimalCutSet : eMinimalCutSets.getCutsets()){
				tMinimalCutSets.getCutsets().add(transformMinimalCutSet(eMinimalCutSet));
			}
		}
		
		
		return tMinimalCutSets;
	}

	private static TDDIMinimalCutSet transformMinimalCutSet(MinimalCutset eMinimalCutSet) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eMinimalCutSet)){
			return (TDDIMinimalCutSet) BaseThriftTranslater.emf2ThriftMap.get(eMinimalCutSet);
		}
		
		TDDIMinimalCutSet tMinimalCutSet = new TDDIMinimalCutSet();
		BaseThriftTranslater.emf2ThriftMap.put(eMinimalCutSet, tMinimalCutSet);
		BaseThriftTranslater.transformBaseElementContents(TMinimalCutSet.wrap(tMinimalCutSet), eMinimalCutSet);
		
		if(eMinimalCutSet.getFailures() != null){
			for(Failure eAbstractFailure : eMinimalCutSet.getFailures()){
				tMinimalCutSet.getFailures().add(new TDDIAbstractFailureRef(transformAbstractFailure(eAbstractFailure)));
			}
		}
		return tMinimalCutSet;
	}
}
