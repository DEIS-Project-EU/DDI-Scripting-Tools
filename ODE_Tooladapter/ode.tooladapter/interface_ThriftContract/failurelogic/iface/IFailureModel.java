package failurelogic.iface;

import java.util.List;

import base.iface.IBaseElement;
import thriftContract.TDDIAbstractFailure;
import thriftContract.TDDIAbstractFailureModelRef;
import thriftContract.TDDIMinimalCutSets;

public interface IFailureModel extends IBaseElement{

	boolean isSetMinimalCutsets();
	List<TDDIMinimalCutSets> getMinimalCutsets();
	
	boolean isSetFailures();
	List<TDDIAbstractFailure> getFailures();
	
	boolean isSetSubModels();
	List<TDDIAbstractFailureModelRef> getSubModels();
}
