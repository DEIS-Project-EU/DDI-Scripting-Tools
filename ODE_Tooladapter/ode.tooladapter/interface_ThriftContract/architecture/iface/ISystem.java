package architecture.iface;

import java.util.List;

import base.iface.IBaseElement;
import thriftContract.TDDIAbstractAsset;
import thriftContract.TDDIAbstractDependabilityRequirementRef;
import thriftContract.TDDIAbstractFailureModelRef;
import thriftContract.TDDIAbstractFunctionRef;
import thriftContract.TDDIAbstractStandardRef;
import thriftContract.TDDIAbstractSystemRef;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIConfiguration;
import thriftContract.TDDIContext;
import thriftContract.TDDIPort;
import thriftContract.TDDISignal;
import thriftContract.TDDISystemBoundary;
import thriftContract.TDDITimeUnit;

public interface ISystem extends IBaseElement {
	
	boolean isSetOverallLifetime();
	double getOverallLifetime();
	void setOverallLifetime(double value);
	
	boolean isSetOverallLifetimeTimeUnit();
	TDDITimeUnit getOverallLifetimeTimeUnit();
	void setOverallLifetimeTimeUnit(TDDITimeUnit value);
	
	boolean isSetSystemBoundaries();
	List<TDDISystemBoundary> getSystemBoundaries();
	
	boolean isSetAppliedStandards();
	List<TDDIAbstractStandardRef> getAppliedStandards();
	
	boolean isSetConfigurations();
	List<TDDIConfiguration> getConfigurations();
	
	boolean isSetContexts();
	List<TDDIContext> getContexts();
	
	boolean isSetRealisedFunctions();
	List<TDDIAbstractFunctionRef> getRealisedFunctions();
	
	boolean isSetSubSystems();
	List<TDDIAbstractSystemRef> getSubSystems();
	
	boolean isSetFailureModels();
	List<TDDIAbstractFailureModelRef> getFailureModels();
	
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
