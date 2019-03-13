package architecture.typed;

import java.util.List;

import architecture.iface.IFunction;
import thriftContract.TDDIAbstractAsset;
import thriftContract.TDDIAbstractDependabilityRequirementRef;
import thriftContract.TDDIAbstractFailureModelRef;
import thriftContract.TDDIAbstractFunctionRef;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDIMalfunctionRef;
import thriftContract.TDDIPerfChars;
import thriftContract.TDDIPort;
import thriftContract.TDDISafetyFunction;
import thriftContract.TDDISignal;

public class TSafetyFunction implements IFunction {
	private TDDISafetyFunction thriftElement;
	
	private TSafetyFunction(TDDISafetyFunction thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TSafetyFunction wrap(TDDISafetyFunction thriftElement) {
		return new TSafetyFunction(thriftElement);
	}
	
	public TDDISafetyFunction unwrap() {
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
	public boolean isSetPerfChars() {
		return thriftElement.isSetPerfChars();
	}

	@Override
	public TDDIPerfChars getPerfChars() {
		return thriftElement.getPerfChars();
	}

	@Override
	public boolean isSetSubFunctions() {
		return thriftElement.isSetSubFunctions();
	}

	@Override
	public List<TDDIAbstractFunctionRef> getSubFunctions() {
		return thriftElement.getSubFunctions();
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
	public boolean isSetMalfunctions() {
		return thriftElement.isSetMalfunctions();
	}

	@Override
	public List<TDDIMalfunctionRef> getMalfunctions() {
		return thriftElement.getMalfunctions();
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
	public void setPerfChars(TDDIPerfChars value) {
		thriftElement.setPerfChars(value);
		thriftElement.setPerfCharsIsSet(true);
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
