package transformation.ode2thrift;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import failureLogic.Cause;
import failureLogic.FaultTree;
import failureLogic.Gate;
import failurelogic.fta.typed.TCause;
import failurelogic.fta.typed.TFaultTree;
import failurelogic.fta.typed.TGate;
import failurelogic.iface.ICause;
import thriftContract.TDDIAbstractCause;
import thriftContract.TDDIAbstractCauseRef;
import thriftContract.TDDICause;
import thriftContract.TDDICauseType;
import thriftContract.TDDICauseUnion;
import thriftContract.TDDICauseUnionType;
import thriftContract.TDDIFaultTree;
import thriftContract.TDDIGate;
import thriftContract.TDDIGateType;

public class FTAThriftTranslater {
	
	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(FTAThriftTranslater.class);

	public static TDDIFaultTree transformFaultTree(FaultTree eFaultTree){
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eFaultTree)){
			return (TDDIFaultTree) BaseThriftTranslater.emf2ThriftMap.get(eFaultTree);
		}
		
		TDDIFaultTree tFaultTree = new TDDIFaultTree();
		BaseThriftTranslater.emf2ThriftMap.put(eFaultTree, tFaultTree);
		FailureLogicThriftTranslater.transformFailureModelContents(TFaultTree.wrap(tFaultTree), eFaultTree);
		
		if(eFaultTree.getCauses() != null){
			for(Cause eAbstractCause : eFaultTree.getCauses()){
				tFaultTree.getCauses().add(transformAbstractCause(eAbstractCause));
			}
		}
		return tFaultTree;
	}
	
	private static TDDIAbstractCause transformAbstractCause(Cause eAbstractCause) {
		TDDIAbstractCause tAbstractCause = new TDDIAbstractCause();
		tAbstractCause.UsedCause = new TDDICauseUnion();
		if(eAbstractCause instanceof Gate){
			tAbstractCause.UsedCauseType = TDDICauseUnionType.CutGate;
			tAbstractCause.UsedCause.setGate(transformGate((Gate)eAbstractCause));
		}
		else if (eAbstractCause instanceof Cause) {
			tAbstractCause.UsedCauseType = TDDICauseUnionType.CUTCause;
			tAbstractCause.UsedCause.setCause(transformCause(eAbstractCause));
		}
		return tAbstractCause;
	}

	private static TDDIGate transformGate(Gate eGate) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eGate)) {
			return (TDDIGate) BaseThriftTranslater.emf2ThriftMap.get(eGate);
		}
		
		TDDIGate tGate = new TDDIGate();
		BaseThriftTranslater.emf2ThriftMap.put(eGate, tGate);	
		transformCauseContents(TGate.wrap(tGate), eGate);
		
			switch (eGate.getGateType()) {
			case AND:
				tGate.setGateType(TDDIGateType.GTAND);
				break;
			case INPUT_EVENT:
				tGate.setGateType(TDDIGateType.InputEvent);
				break;
			case NOT:
				tGate.setGateType(TDDIGateType.GTNOT);
				break;
			case OR:
				tGate.setGateType(TDDIGateType.GTOR);
				break;
			case OUTPUT_EVENT:
				tGate.setGateType(TDDIGateType.OutputEvent);
				break;
			case PAND:
				tGate.setGateType(TDDIGateType.GTPAND);
				break;
			case POR:
				tGate.setGateType(TDDIGateType.GTPOR);
				break;
			case SAND:
				tGate.setGateType(TDDIGateType.GTSAND);
				break;
			case VOTE:
				tGate.setGateType(TDDIGateType.GTVOTE);
				break;
			case XOR:
				tGate.setGateType(TDDIGateType.GTXOR);
				break;
			default:
				break;
			}
		
		if (eGate.getCauses() != null){ 
			for (Cause eAbstractCause : eGate.getCauses()) {
				tGate.getCauses().add(new TDDIAbstractCauseRef(transformAbstractCause(eAbstractCause)));
			}
		}
		return tGate;
	}
	
	private static TDDICause transformCause(Cause eCause) {
		if (BaseThriftTranslater.emf2ThriftMap.containsKey(eCause)) {
			return (TDDICause) BaseThriftTranslater.emf2ThriftMap.get(eCause);
		}
		
		TDDICause tCause = new TDDICause();
		BaseThriftTranslater.emf2ThriftMap.put(eCause, tCause);	
		transformCauseContents(TCause.wrap(tCause), eCause);
		return tCause;
	}
	
	private static void transformCauseContents(ICause tCause, Cause eCause) {
		BaseThriftTranslater.transformBaseElementContents(tCause, eCause);
		
		if(eCause.getCauseType() != null){
			switch (eCause.getCauseType()){
			case BASIC_EVENT:
				tCause.setType(TDDICauseType.CTBasicEvent);
				break;
			case GATE:
				tCause.setType(TDDICauseType.CTGate);
				break;
			case INPUT_EVENT:
				tCause.setType(TDDICauseType.CTInputEvent);
				break;
			case OUTPUT_EVENT:
				tCause.setType(TDDICauseType.CTOutputEvent);
				break;
			default:
				break;
			
			}
		}
		
		if(eCause.getFailure() != null){
			tCause.setFailure(FailureLogicThriftTranslater.transformAbstractFailure(eCause.getFailure()));
		}
	}
}
