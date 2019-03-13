package sacm.argumentation.iface;

import java.util.List;

import thriftContract.TDDIAbstractArgumentAssetRef;
import thriftContract.TDDIArgumentReasoning;

public interface IAssertedRelationship extends IAssertion {
	boolean isSetIsCounter();
	boolean isIsCounter();
	void setIsCounter(boolean value);
	
	boolean isSetSources();
	List<TDDIAbstractArgumentAssetRef> getSources();
	void addToSources(TDDIAbstractArgumentAssetRef value);
	
	boolean isSetTargets();
	List<TDDIAbstractArgumentAssetRef> getTargets();
	void addToTargets(TDDIAbstractArgumentAssetRef value);
	
	boolean isSetArgumentReasoning();
	TDDIArgumentReasoning getArgumentReasoning();
	void setArgumentReasoning(TDDIArgumentReasoning value);
}
