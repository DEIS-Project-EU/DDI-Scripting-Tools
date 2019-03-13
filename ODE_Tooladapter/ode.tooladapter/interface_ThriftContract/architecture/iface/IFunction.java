package architecture.iface;

import java.util.List;

import base.iface.IBaseElement;
import thriftContract.TDDIAbstractAsset;
import thriftContract.TDDIAbstractDependabilityRequirementRef;
import thriftContract.TDDIAbstractFailureModelRef;
import thriftContract.TDDIAbstractFunctionRef;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIMalfunctionRef;
import thriftContract.TDDIPerfChars;
import thriftContract.TDDIPort;
import thriftContract.TDDISignal;

public interface IFunction extends IBaseElement {
	
	boolean isSetPerfChars();
	TDDIPerfChars getPerfChars();
	void setPerfChars(TDDIPerfChars value);
	
	boolean isSetSubFunctions();
	List<TDDIAbstractFunctionRef> getSubFunctions();
	
	boolean isSetFailureModels();
	List<TDDIAbstractFailureModelRef> getFailureModels();
	
	boolean isSetMalfunctions();
	List<TDDIMalfunctionRef> getMalfunctions();
	
	boolean isSetPorts();
	List<TDDIPort> getPorts();
	
	boolean isSetAsAsset();
	TDDIAbstractAsset getAsAsset();
	void setAsAsset(TDDIAbstractAsset value);
	
	boolean isSetDependabilityRequirements();
	List<TDDIAbstractDependabilityRequirementRef> getDependabilityRequirements();
	
	boolean isSetAssuranceLevel();
	TDDIAssuranceLevel getAssuranceLevel();
	void setAssuranceLevel(TDDIAssuranceLevel value);
	
	boolean isSetSignals();
	List<TDDISignal> getSignals();
}
