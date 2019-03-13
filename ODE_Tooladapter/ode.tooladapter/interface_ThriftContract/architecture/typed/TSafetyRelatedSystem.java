package architecture.typed;

import java.util.List;

import architecture.iface.ISystem;
import thriftContract.TDDIAbstractAsset;
import thriftContract.TDDIAbstractDependabilityRequirementRef;
import thriftContract.TDDIAbstractFailureModelRef;
import thriftContract.TDDIAbstractFunctionRef;
import thriftContract.TDDIAbstractStandardRef;
import thriftContract.TDDIAbstractSystemRef;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIConfiguration;
import thriftContract.TDDIContext;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDIPort;
import thriftContract.TDDISafetyRelatedSystem;
import thriftContract.TDDISignal;
import thriftContract.TDDISystemBoundary;
import thriftContract.TDDITimeUnit;

public class TSafetyRelatedSystem implements ISystem {
	private TDDISafetyRelatedSystem thriftElement;
	
	private TSafetyRelatedSystem(TDDISafetyRelatedSystem thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TSafetyRelatedSystem wrap(TDDISafetyRelatedSystem thriftElement) {
		return new TSafetyRelatedSystem(thriftElement);
	}
	
	public TDDISafetyRelatedSystem unwrap() {
		return thriftElement;
	}
	
	@Override
	public boolean isSetId() {
		return thriftElement.isSetId();
	}

	@Override
	public long getId() {
		return thriftElement.getId();
	}

	@Override
	public boolean isSetName() {
		return thriftElement.isSetName();
	}

	@Override
	public String getName() {
		return thriftElement.getName();
	}

	@Override
	public boolean isSetDescription() {
		return thriftElement.isSetDescription();
	}

	@Override
	public String getDescription() {
		return thriftElement.getDescription();
	}

	@Override
	public boolean isSetKeyValueMaps() {
		return thriftElement.isSetKeyValueMaps();
	}

	@Override
	public List<TDDIKeyValueMap> getKeyValueMaps() {
		return thriftElement.getKeyValueMaps();
	}

	@Override
	public void setKeyValueMaps(List<TDDIKeyValueMap> tKeyValueMaps){
		thriftElement.setKeyValueMaps(tKeyValueMaps);
	}

	@Override
	public boolean isSetDependabilityRequirements() {
		return thriftElement.isSetDependabilityRequirements();
	}

	@Override
	public List<TDDIAbstractDependabilityRequirementRef> getDependabilityRequirements() {
		return thriftElement.getDependabilityRequirements();
	}

	@Override
	public boolean isSetAssuranceLevel() {
		return thriftElement.isSetAssuranceLevel();
	}

	@Override
	public TDDIAssuranceLevel getAssuranceLevel() {
		return thriftElement.getAssuranceLevel();
	}

	@Override
	public boolean isSetOverallLifetime() {
		return thriftElement.isSetOverallLifetime();
	}

	@Override
	public double getOverallLifetime() {
		return thriftElement.getOverallLifetime();
	}

	@Override
	public boolean isSetOverallLifetimeTimeUnit() {
		return thriftElement.isSetOverallLifetimeTimeUnit();
	}

	@Override
	public TDDITimeUnit getOverallLifetimeTimeUnit() {
		return thriftElement.getOverallLifetimeTimeUnit();
	}

	@Override
	public boolean isSetSystemBoundaries() {
		return thriftElement.isSetSystemBoundaries();
	}

	@Override
	public List<TDDISystemBoundary> getSystemBoundaries() {
		return thriftElement.getSystemBoundaries();
	}

	@Override
	public boolean isSetAppliedStandards() {
		return thriftElement.isSetAppliedStandards();
	}

	@Override
	public List<TDDIAbstractStandardRef> getAppliedStandards() {
		return thriftElement.getAppliedStandards();
	}

	@Override
	public boolean isSetConfigurations() {
		return thriftElement.isSetConfigurations();
	}

	@Override
	public List<TDDIConfiguration> getConfigurations() {
		return thriftElement.getConfigurations();
	}

	@Override
	public boolean isSetContexts() {
		return thriftElement.isSetContexts();
	}

	@Override
	public List<TDDIContext> getContexts() {
		return thriftElement.getContexts();
	}

	@Override
	public boolean isSetRealisedFunctions() {
		return thriftElement.isSetRealisedFunctions();
	}

	@Override
	public List<TDDIAbstractFunctionRef> getRealisedFunctions() {
		return thriftElement.getRealisedFunctions();
	}

	@Override
	public boolean isSetSubSystems() {
		return thriftElement.isSetSubSystems();
	}

	@Override
	public List<TDDIAbstractSystemRef> getSubSystems() {
		return thriftElement.getSubSystems();
	}

	@Override
	public boolean isSetFailureModels() {
		return thriftElement.isSetFailureModels();
	}

	@Override
	public List<TDDIAbstractFailureModelRef> getFailureModels() {
		return thriftElement.getFailureModels();
	}

	@Override
	public boolean isSetPorts() {
		return thriftElement.isSetPorts();
	}

	@Override
	public List<TDDIPort> getPorts() {
		return thriftElement.getPorts();
	}
	
	@Override
	public void setId(long id) {
		thriftElement.setId(id);
		thriftElement.setIdIsSet(true);
	}

	@Override
	public void setName(String name) {
		thriftElement.setName(name);
		thriftElement.setNameIsSet(true);
	}

	@Override
	public void setDescription(String description) {
		thriftElement.setDescription(description);
		thriftElement.setDescriptionIsSet(true);
	}

	@Override
	public void setAssuranceLevel(TDDIAssuranceLevel value) {
		thriftElement.setAssuranceLevel(value);
		thriftElement.setAssuranceLevelIsSet(true);
	}
	
	@Override
	public void setOverallLifetime(double value) {
		thriftElement.setOverallLifetime(value);
		thriftElement.setOverallLifetimeIsSet(true);
	}

	@Override
	public void setOverallLifetimeTimeUnit(TDDITimeUnit value) {
		thriftElement.setOverallLifetimeTimeUnit(value);
		thriftElement.setOverallLifetimeTimeUnitIsSet(true);
	}

	@Override
	public boolean isSetAsAsset() {
		return thriftElement.isSetAsAsset();
	}

	@Override
	public TDDIAbstractAsset getAsAsset() {
		return thriftElement.getAsAsset();
	}

	@Override
	public void setAsAsset(TDDIAbstractAsset value) {
		thriftElement.setAsAsset(value);
		thriftElement.setAsAssetIsSet(true);
	}

	@Override
	public boolean isSetSignals() {
		return thriftElement.isSetSignals();
	}

	@Override
	public List<TDDISignal> getSignals() {
		return thriftElement.getSignals();
	}
}
