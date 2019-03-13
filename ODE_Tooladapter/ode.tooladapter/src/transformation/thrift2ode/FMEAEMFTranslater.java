package transformation.thrift2ode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import failureLogic.FMEA;
import failureLogic.FMEAEntry;
import failureLogic.FMEAType;
import failureLogic.FMEDAEntry;
import failurelogic.fmea.typed.TFMEA;
import failurelogic.fmea.typed.TFMEAEntry;
import failurelogic.fmea.typed.TFMEDAEntry;
import failurelogic.iface.IFMEAEntry;
import thriftContract.TDDIAbstractFMEAEntry;
import thriftContract.TDDIFMEA;
import thriftContract.TDDIFMEAEntry;
import thriftContract.TDDIFMEDAEntry;
import util.EMFFactory;

public class FMEAEMFTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(FMEAEMFTranslater.class);

	public static FMEA transformFMEA(TDDIFMEA tFMEA){
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tFMEA)){
			return (FMEA) BaseEMFTranslater.thrift2EmfMap.get(tFMEA);
		}
		
		FMEA emfFMEA = EMFFactory.failureLogicFactory.createFMEA();
		FailureLogicEMFTranslater.transformFailureModelContents(TFMEA.wrap(tFMEA), emfFMEA);
		
		if(tFMEA.isSetType()){
			switch(tFMEA.getType()){
			case FMEA:
				emfFMEA.setType(FMEAType.FMEA);
				break;
			case FMEDA:
				emfFMEA.setType(FMEAType.FMEDA);
				break;
			default:
				break;
			}
		}
		
		if(tFMEA.isSetEntries()){
			for(TDDIAbstractFMEAEntry tAbstractFMEAEntry : tFMEA.getEntries()){
				emfFMEA.getEntries().add(transformAbstractFMEAEntry(tAbstractFMEAEntry));
			}
		}
		
		return emfFMEA;
	}

	private static FMEAEntry transformAbstractFMEAEntry(TDDIAbstractFMEAEntry tAbstractFMEAEntry) {
		if(tAbstractFMEAEntry.isSetUsedFMEAEntryType()){
			switch (tAbstractFMEAEntry.UsedFMEAEntryType){
			case FMEAEUTFMEAEntry:
				return transformFMEAEntry(tAbstractFMEAEntry.UsedFMEAEntry.getFMEAEntry());
			case FMEAEUTFMEDAEntry:
				return transformFMEDAEntry(tAbstractFMEAEntry.UsedFMEAEntry.getFMEDAEntry());
			default:
				break;
			}
		}
		return EMFFactory.failureLogicFactory.createFMEAEntry();
	}

	private static FMEAEntry transformFMEAEntry(TDDIFMEAEntry tFMEAEntry) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tFMEAEntry)){
			return (FMEAEntry) BaseEMFTranslater.thrift2EmfMap.get(tFMEAEntry);
		}
		
		FMEAEntry emfFMEAEntry = EMFFactory.failureLogicFactory.createFMEAEntry();
		BaseEMFTranslater.thrift2EmfMap.put(tFMEAEntry, emfFMEAEntry);
		transformFMEAEntryContents(TFMEAEntry.wrap(tFMEAEntry), emfFMEAEntry);

		return emfFMEAEntry;
	}
	
	private static FMEDAEntry transformFMEDAEntry(TDDIFMEDAEntry tFMEDAEntry) {
		if(BaseEMFTranslater.thrift2EmfMap.containsKey(tFMEDAEntry)){
			return (FMEDAEntry) BaseEMFTranslater.thrift2EmfMap.get(tFMEDAEntry);
		}
		
		FMEDAEntry emfFMEDAEntry = EMFFactory.failureLogicFactory.createFMEDAEntry();
		BaseEMFTranslater.thrift2EmfMap.put(tFMEDAEntry, emfFMEDAEntry);
		transformFMEAEntryContents(TFMEDAEntry.wrap(tFMEDAEntry), emfFMEDAEntry);

		return emfFMEDAEntry;
	}

	private static void transformFMEAEntryContents(IFMEAEntry tFMEAEntry, FMEAEntry emfFMEAEntry){
		BaseEMFTranslater.transformBaseElementContents(tFMEAEntry, emfFMEAEntry);
		
		if(tFMEAEntry.isSetEffect()){
			emfFMEAEntry.setEffect(FailureLogicEMFTranslater.transformAbstractFailure(tFMEAEntry.getEffect()));
		}
		if(tFMEAEntry.isSetMode()){
			emfFMEAEntry.setMode(FailureLogicEMFTranslater.transformAbstractFailure(tFMEAEntry.getMode()));
		}
	}
}
