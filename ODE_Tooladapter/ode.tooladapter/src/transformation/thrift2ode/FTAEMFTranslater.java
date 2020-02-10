package transformation.thrift2ode;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import failurelogic.fta.typed.TCause;
import failurelogic.fta.typed.TFaultTree;
import failurelogic.fta.typed.TGate;
import failurelogic.iface.ICause;
import thriftContract.TDDIAbstractCause;
import thriftContract.TDDICause;
import thriftContract.TDDIFaultTree;
import thriftContract.TDDIGate;
import top.failureLogic.Cause;
import top.failureLogic.CauseType;
import top.failureLogic.FaultTree;
import top.failureLogic.Gate;
import top.failureLogic.GateType;
import util.EMFFactory;

public class FTAEMFTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(FTAEMFTranslater.class);

	public static FaultTree transformFaultTree(TDDIFaultTree tFaultTree){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tFaultTree)){
			return (FaultTree) BaseEMFTranslater.thrift2EmfMap.get(tFaultTree);
		}
		
		FaultTree emfFaultTree = EMFFactory.failureLogicFactory.createFaultTree();
		BaseEMFTranslater.thrift2EmfMap.put(tFaultTree, emfFaultTree);
		FailureLogicEMFTranslater.transformFailureModelContents(TFaultTree.wrap(tFaultTree), emfFaultTree);
		
		if(tFaultTree.isSetCauses()){
			for(TDDIAbstractCause tAbstractCause : tFaultTree.getCauses()){
				emfFaultTree.getCauses().add(transformAbstractCause(tAbstractCause));
			}
		}
		return emfFaultTree;
	}
	
	private static Cause transformAbstractCause(TDDIAbstractCause tAbstractCause){
		if(tAbstractCause.isSetUsedCauseType()){
			switch (tAbstractCause.UsedCauseType){
			case CUTCause:
				return transformCause(tAbstractCause.UsedCause.getCause());
			case CutGate:
				return transformGate(tAbstractCause.UsedCause.getGate());
			default:
				break;
			}
		}
		return EMFFactory.failureLogicFactory.createCause();
	}
	
	
	private static Cause transformCause(TDDICause tCause) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tCause)){
			return (Cause) BaseEMFTranslater.thrift2EmfMap.get(tCause);
		}
		
		Cause emfCause = EMFFactory.failureLogicFactory.createCause();
		BaseEMFTranslater.thrift2EmfMap.put(tCause, emfCause);
		transformCauseContents(TCause.wrap(tCause), emfCause);
		
		return emfCause;
	}
	
	private static Gate transformGate(TDDIGate tGate) {
		if (BaseEMFTranslater.thrift2EmfMap.containsKey(tGate))
			return (Gate) BaseEMFTranslater.thrift2EmfMap.get(tGate);
		
		Gate emfGate = EMFFactory.failureLogicFactory.createGate();
		BaseEMFTranslater.thrift2EmfMap.put(tGate,emfGate);
		transformCauseContents(TGate.wrap(tGate), emfGate);
		
		if (tGate.isSetGateType()) {
			switch (tGate.getGateType()) {
			case GTAND:
				emfGate.setGateType(GateType.AND);
				break;
			case GTNOT:
				emfGate.setGateType(GateType.NOT);
				break;
			case GTOR:
				emfGate.setGateType(GateType.OR);
				break;
			case GTPAND:
				emfGate.setGateType(GateType.PAND);
				break;
			case GTPOR:
				emfGate.setGateType(GateType.POR);
				break;
			case GTSAND:
				emfGate.setGateType(GateType.SAND);
				break;
			case GTVOTE:
				emfGate.setGateType(GateType.VOTE);
				break;
			case GTXOR:
				emfGate.setGateType(GateType.XOR);
				break;
			case InputEvent:
				emfGate.setGateType(GateType.INPUT_EVENT);
				break;
			case OutputEvent:
				emfGate.setGateType(GateType.OUTPUT_EVENT);
			default:
				break;
			}
		}
		
		if(tGate.isSetCauses()){
			for(TDDIAbstractCause tAbstractCause : tGate.getCauses().stream().map(ref -> ref.ref).collect(Collectors.toList())){
				emfGate.getCauses().add(transformAbstractCause(tAbstractCause));
			}
		}
		return emfGate;
	}
	
	private static void transformCauseContents(ICause tCause, Cause emfCause){
		BaseEMFTranslater.transformBaseElementContents(tCause, emfCause);
		
		if(tCause.isSetType()){
			switch (tCause.getType()){
			case CTBasicEvent:
				emfCause.setCauseType(CauseType.BASIC_EVENT);
				break;
			case CTGate:
				emfCause.setCauseType(CauseType.GATE);
				break;
			case CTInputEvent:
				emfCause.setCauseType(CauseType.INPUT_EVENT);
				break;
			case CTOutputEvent:
				emfCause.setCauseType(CauseType.OUTPUT_EVENT);
				break;
			default:
				break;
			}
		}
		
		if(tCause.isSetFailure()){
			emfCause.setFailure(FailureLogicEMFTranslater.transformAbstractFailure(tCause.getFailure()));
		}
	}
}
