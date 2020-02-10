package transformation.thrift2ode;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
import thriftContract.TDDIFailure;
import thriftContract.TDDIFailureLogicPackage;
import thriftContract.TDDIFailureModel;
import thriftContract.TDDIMinimalCutSet;
import thriftContract.TDDIMinimalCutSets;
import thriftContract.TDDIProbDist;
import thriftContract.TDDIProbDistParam;
import thriftContract.TDDISecurityViolation;
import top.failureLogic.Failure;
import top.failureLogic.FailureLogicPackage;
import top.failureLogic.FailureModel;
import top.failureLogic.FailureOriginType;
import top.failureLogic.MinimalCutSets;
import top.failureLogic.MinimalCutset;
import top.failureLogic.ProbDist;
import top.failureLogic.ProbDistParam;
import top.failureLogic.SecurityViolation;
import util.EMFFactory;

public class FailureLogicEMFTranslater {
	
	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(FailureLogicEMFTranslater.class);
	
	public static FailureLogicPackage transformFailureLogicPackage(TDDIFailureLogicPackage tFailureLogicPackage){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tFailureLogicPackage)) {
			return (FailureLogicPackage) BaseEMFTranslater.thrift2EmfMap.get(tFailureLogicPackage);
		}
		
		FailureLogicPackage emfFailureLogicPackage = EMFFactory.failureLogicFactory.createFailureLogicPackage();
		BaseEMFTranslater.thrift2EmfMap.put(tFailureLogicPackage, emfFailureLogicPackage);
		BaseEMFTranslater.transformBaseElementContents(TFailureLogicPackage.wrap(tFailureLogicPackage), emfFailureLogicPackage);
		
		if(tFailureLogicPackage.isSetFailureModels()){
			for (TDDIAbstractFailureModel tAbstractFailureModel : tFailureLogicPackage.getFailureModels()){
				emfFailureLogicPackage.getFailureModels().add(transformAbstractFailureModel(tAbstractFailureModel));
			}
		}
		return emfFailureLogicPackage;
	}
	
	public static FailureModel transformAbstractFailureModel(TDDIAbstractFailureModel tAbstractFailureModel) {
		if(tAbstractFailureModel.isSetUsedFailureModelType()){
			switch(tAbstractFailureModel.UsedFailureModelType){
			case FAMUTFMEA:
				return FMEAEMFTranslater.transformFMEA(tAbstractFailureModel.UsedFailureModel.getFMEA());
			case FAMUTFailureModel:
				return transformFailureModel(tAbstractFailureModel.UsedFailureModel.getFailureModel());
			case FAMUTFaultTree:
				return FTAEMFTranslater.transformFaultTree(tAbstractFailureModel.UsedFailureModel.getFaultTree());
			case FAMUTMarkovChain:
				break;
			default:
				break;
			}
		}
		return EMFFactory.failureLogicFactory.createFailureModel();
	}

	public static FailureModel transformFailureModel(TDDIFailureModel tFailureModel) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tFailureModel))
			return (FailureModel) BaseEMFTranslater.thrift2EmfMap.get(tFailureModel);
		
		FailureModel emfFailureModel = EMFFactory.failureLogicFactory.createFailureModel();
		BaseEMFTranslater.thrift2EmfMap.put(tFailureModel, emfFailureModel);
		transformFailureModelContents(TFailureModel.wrap(tFailureModel), emfFailureModel);		
		
		return emfFailureModel;
	}

	public static void transformFailureModelContents(IFailureModel tFailureModel, FailureModel emfFailureModel) {
		BaseEMFTranslater.transformBaseElementContents(tFailureModel, emfFailureModel);
		
		if(tFailureModel.isSetFailures()){
			for(TDDIAbstractFailure tAbstractFailure : tFailureModel.getFailures()){
				emfFailureModel.getFailures().add(transformAbstractFailure(tAbstractFailure));
			}
		}
		
		if(tFailureModel.isSetMinimalCutsets()){
			for(TDDIMinimalCutSets tMinimalCutSets : tFailureModel.getMinimalCutsets()){
				emfFailureModel.getMinimalCutsets().add(transformMinimalCutSets(tMinimalCutSets));
			}
		}
		
		if(tFailureModel.isSetSubModels()){
			for(TDDIAbstractFailureModel tAbstractFailureModel : tFailureModel.getSubModels().stream().map(ref -> ref.ref).collect(Collectors.toList())){
				emfFailureModel.getSubModels().add(transformAbstractFailureModel(tAbstractFailureModel));
			}
		}
	}

	public static MinimalCutSets transformMinimalCutSets(TDDIMinimalCutSets tMinimalCutSets) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tMinimalCutSets)){
			return (MinimalCutSets) BaseEMFTranslater.thrift2EmfMap.get(tMinimalCutSets);
		}
		
		MinimalCutSets emfMinimalCutSets = EMFFactory.failureLogicFactory.createMinimalCutSets();
		BaseEMFTranslater.thrift2EmfMap.put(tMinimalCutSets, emfMinimalCutSets);
		BaseEMFTranslater.transformBaseElementContents(TMinimalCutSets.wrap(tMinimalCutSets), emfMinimalCutSets);
		
		if(tMinimalCutSets.isSetCutsets()){
			for(TDDIMinimalCutSet tMinimalCutSet : tMinimalCutSets.getCutsets()){
				emfMinimalCutSets.getCutsets().add(transformMinimalCutSet(tMinimalCutSet));
			}
		}
		
		if(tMinimalCutSets.isSetFailures()){
			for (TDDIAbstractFailure tAbstractFailure : tMinimalCutSets.getFailures().stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfMinimalCutSets.getFailures().add(transformAbstractFailure(tAbstractFailure));
			}
		}
		
		return emfMinimalCutSets;
	}

	private static MinimalCutset transformMinimalCutSet(TDDIMinimalCutSet tMinimalCutSet) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tMinimalCutSet)){
			return (MinimalCutset) BaseEMFTranslater.thrift2EmfMap.get(tMinimalCutSet);
		}
		
		MinimalCutset emfMinimalCutSet = EMFFactory.failureLogicFactory.createMinimalCutset();
		BaseEMFTranslater.thrift2EmfMap.put(tMinimalCutSet, emfMinimalCutSet);
		BaseEMFTranslater.transformBaseElementContents(TMinimalCutSet.wrap(tMinimalCutSet), emfMinimalCutSet);
		
		if(tMinimalCutSet.isSetFailures()){
			for (TDDIAbstractFailure tAbstractFailure : tMinimalCutSet.getFailures().stream().map(ref -> ref.ref).collect(Collectors.toList())) {
				emfMinimalCutSet.getFailures().add(transformAbstractFailure(tAbstractFailure));
			}
		}
		return emfMinimalCutSet;
	}
	
	public static Failure transformAbstractFailure(TDDIAbstractFailure tAbstractFailure) {
		if (tAbstractFailure.isSetUsedFailureType()) {
			switch (tAbstractFailure.UsedFailureType) {
			case FAILUTFailure:
				return transformFailure(tAbstractFailure.UsedFailure.getFailure());
			case FAILUTSecurityViolation:
				return transformSecurityViolation(tAbstractFailure.UsedFailure.getSecurityViolation());
			default:
				break;					
			}
		}
		return EMFFactory.failureLogicFactory.createFailure();
	}
	
	public static SecurityViolation transformSecurityViolation(TDDISecurityViolation tSecurityViolation) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tSecurityViolation)){
			return (SecurityViolation) BaseEMFTranslater.thrift2EmfMap.get(tSecurityViolation);
		}
		
		SecurityViolation emfSecurityViolation = EMFFactory.failureLogicFactory.createSecurityViolation();
		BaseEMFTranslater.thrift2EmfMap.put(tSecurityViolation, emfSecurityViolation);
		transformFailureContents(TSecurityViolation.wrap(tSecurityViolation), emfSecurityViolation);
			
		return emfSecurityViolation;
	}

	private static Failure transformFailure(TDDIFailure tFailure) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tFailure)){
			return (Failure) BaseEMFTranslater.thrift2EmfMap.get(tFailure);
		}
		
		Failure emfFailure = EMFFactory.failureLogicFactory.createFailure();
		BaseEMFTranslater.thrift2EmfMap.put(tFailure, emfFailure);
		transformFailureContents(TFailure.wrap(tFailure), emfFailure);
			
		return emfFailure;
	}
	
	public static void transformFailureContents(IFailure tFailure, Failure emfFailure) {
		BaseEMFTranslater.transformBaseElementContents(tFailure, emfFailure);
		
		if(tFailure.isSetOriginType()){
			switch (tFailure.getOriginType()){
			case FOTInput:
				emfFailure.setOriginType(FailureOriginType.INPUT);
				break;
			case FOTInternal:
				emfFailure.setOriginType(FailureOriginType.INTERNAL);
				break;
			case FOTOutput:
				emfFailure.setOriginType(FailureOriginType.OUTPUT);
				break;
			default:
				break;
			}
		}
		
		if(tFailure.isSetFailureClass()){
			emfFailure.setFailureClass(tFailure.getFailureClass());
		}
		if (tFailure.isSetFailureRate()) {
			emfFailure.setFailureRate(tFailure.getFailureRate());
		}
		if (tFailure.isSetIsCCF()) {
			emfFailure.setIsCcf(tFailure.getIsCCF());
		}
		if(tFailure.isSetFailureProbDistribution()){
			emfFailure.setFailureProbDistribution(transformProbDist(tFailure.getFailureProbDistribution()));
		}
		if(tFailure.isSetCCFFailures()){
			for(TDDIAbstractFailure tAbstractCCFFailure : tFailure.getCCFFailures().stream().map(ref -> ref.ref).collect(Collectors.toList())){
				emfFailure.getCcfFailures().add(transformAbstractFailure(tAbstractCCFFailure));
			}
		}
	}

	public static ProbDist transformProbDist(TDDIProbDist tProbDist) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tProbDist))
			return (ProbDist) BaseEMFTranslater.thrift2EmfMap.get(tProbDist);
		
		ProbDist emfProDist = EMFFactory.failureLogicFactory.createProbDist();
		BaseEMFTranslater.thrift2EmfMap.put(tProbDist, emfProDist);
		BaseEMFTranslater.transformBaseElementContents(TProbDist.wrap(tProbDist), emfProDist);
		
		if (tProbDist.isSetType()) {
			emfProDist.setType(tProbDist.getType());
		}
		
		if (tProbDist.isSetParameters()) {
			for (TDDIProbDistParam tProbDistParam : tProbDist.getParameters()) {
				emfProDist.getParameters().add(transformProbDistParam(tProbDistParam));
			}
		}
		
		return emfProDist;
	}
	
	
	private static ProbDistParam transformProbDistParam(TDDIProbDistParam tProbDistParam) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tProbDistParam))
			return (ProbDistParam) BaseEMFTranslater.thrift2EmfMap.get(tProbDistParam);
		
		ProbDistParam emfProbDistParam = EMFFactory.failureLogicFactory.createProbDistParam();
		BaseEMFTranslater.thrift2EmfMap.put(tProbDistParam, emfProbDistParam);
		BaseEMFTranslater.transformBaseElementContents(TProbDistParam.wrap(tProbDistParam), emfProbDistParam);
		
		if (tProbDistParam.isSetValue()) {
			emfProbDistParam.setValue(tProbDistParam.getValue());
		}
		
		return emfProbDistParam;
	}

}
