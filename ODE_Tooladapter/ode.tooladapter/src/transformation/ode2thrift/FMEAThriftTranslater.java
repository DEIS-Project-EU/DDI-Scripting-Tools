package transformation.ode2thrift;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import failureLogic.FMEA;
import failureLogic.FMEAEntry;
import failureLogic.FMEDAEntry;
import failurelogic.fmea.typed.TFMEA;
import failurelogic.fmea.typed.TFMEAEntry;
import failurelogic.fmea.typed.TFMEDAEntry;
import failurelogic.iface.IFMEAEntry;
import thriftContract.TDDIAbstractFMEAEntry;
import thriftContract.TDDIFMEA;
import thriftContract.TDDIFMEAEntry;
import thriftContract.TDDIFMEAEntryUnion;
import thriftContract.TDDIFMEAEntryUnionType;
import thriftContract.TDDIFMEAType;
import thriftContract.TDDIFMEDAEntry;

public class FMEAThriftTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(FMEAThriftTranslater.class);
	
	public static TDDIFMEA transformFMEA(FMEA eFMEA){
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eFMEA)){
			return (TDDIFMEA) BaseThriftTranslater.emf2ThriftMap.get(eFMEA);
		}
		
		TDDIFMEA tFMEA = new TDDIFMEA();
		BaseThriftTranslater.emf2ThriftMap.put(eFMEA, tFMEA);
		FailureLogicThriftTranslater.transformFailureModelContents(TFMEA.wrap(tFMEA), eFMEA);
		
		if(eFMEA.getType() != null){
			switch(eFMEA.getType()){
			case FMEA: tFMEA.setType(TDDIFMEAType.FMEA);
				break;
			case FMEDA: tFMEA.setType(TDDIFMEAType.FMEDA);
				break;
			default:
				Log.warn("Transformation for FMEA type " + eFMEA.getType().getName() + " is not implemented yet.");
			
			}
		}
		
		if(eFMEA.getEntries() != null){
			for(FMEAEntry eFMEAEntry : eFMEA.getEntries()){
				tFMEA.getEntries().add(transformAbstractFMEAEntry(eFMEAEntry));
			}
		}
		
		return tFMEA;
	}

	private static TDDIAbstractFMEAEntry transformAbstractFMEAEntry(FMEAEntry eFMEAEntry) {
		TDDIAbstractFMEAEntry tAbstractFMEAEntry = new TDDIAbstractFMEAEntry();
		tAbstractFMEAEntry.UsedFMEAEntry = new TDDIFMEAEntryUnion();
		if(eFMEAEntry instanceof FMEDAEntry){
			tAbstractFMEAEntry.UsedFMEAEntryType = TDDIFMEAEntryUnionType.FMEAEUTFMEDAEntry;
			tAbstractFMEAEntry.UsedFMEAEntry.setFMEDAEntry(transformFMEDAEntry((FMEDAEntry) eFMEAEntry));
		}
		else if (eFMEAEntry instanceof FMEAEntry) {
			tAbstractFMEAEntry.UsedFMEAEntryType = TDDIFMEAEntryUnionType.FMEAEUTFMEAEntry;
			tAbstractFMEAEntry.UsedFMEAEntry.setFMEAEntry(transformFMEAEntry(eFMEAEntry));
		}
		
		return tAbstractFMEAEntry;
	}
	
	private static TDDIFMEDAEntry transformFMEDAEntry(FMEDAEntry eFMEDAEntry) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eFMEDAEntry)){
			return (TDDIFMEDAEntry) BaseThriftTranslater.emf2ThriftMap.get(eFMEDAEntry);
		}
		
		TDDIFMEDAEntry tFMEDAEntry = new TDDIFMEDAEntry();
		BaseThriftTranslater.emf2ThriftMap.put(eFMEDAEntry, tFMEDAEntry);
		transformFMEAEntryContents(TFMEDAEntry.wrap(tFMEDAEntry), eFMEDAEntry);
		
		tFMEDAEntry.setDiagnosisRate(eFMEDAEntry.getDiagnosisRate());
		
		if(eFMEDAEntry.getDiagnosisProbDistribution() != null){
			tFMEDAEntry.setDiagnosisProbDistribution(FailureLogicThriftTranslater.transformProbDist(eFMEDAEntry.getDiagnosisProbDistribution()));
		}
		
		return tFMEDAEntry;
	}

	private static TDDIFMEAEntry transformFMEAEntry(FMEAEntry eFMEAEntry) {
		if(BaseThriftTranslater.emf2ThriftMap.containsKey(eFMEAEntry)){
			return (TDDIFMEAEntry) BaseThriftTranslater.emf2ThriftMap.get(eFMEAEntry);
		}
		
		TDDIFMEAEntry tFMEAEntry = new TDDIFMEAEntry();
		BaseThriftTranslater.emf2ThriftMap.put(eFMEAEntry, tFMEAEntry);
		transformFMEAEntryContents(TFMEAEntry.wrap(tFMEAEntry), eFMEAEntry);
		
		return tFMEAEntry; 
	}
	
	private static void transformFMEAEntryContents(IFMEAEntry tFMEAEntry, FMEAEntry eFMEAEntry){
		BaseThriftTranslater.transformBaseElementContents(tFMEAEntry, eFMEAEntry);
		
		if(eFMEAEntry.getEffect() != null){
			tFMEAEntry.setEffect(FailureLogicThriftTranslater.transformAbstractFailure(eFMEAEntry.getEffect()));
		}
		
		if(eFMEAEntry.getMode() != null){
			tFMEAEntry.setMode(FailureLogicThriftTranslater.transformAbstractFailure(eFMEAEntry.getMode()));
		}
	}
}
