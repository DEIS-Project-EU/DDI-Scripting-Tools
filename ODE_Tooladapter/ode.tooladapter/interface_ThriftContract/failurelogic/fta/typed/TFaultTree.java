package failurelogic.fta.typed;

import java.util.List;

import failurelogic.iface.IFailureModel;
import thriftContract.TDDIAbstractFailure;
import thriftContract.TDDIAbstractFailureModelRef;
import thriftContract.TDDIFaultTree;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDIMinimalCutSets;

public class TFaultTree implements IFailureModel {

	private TDDIFaultTree thriftElement;

	private TFaultTree(TDDIFaultTree thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TFaultTree wrap(TDDIFaultTree tDDIFaultTree) {
		return new TFaultTree(tDDIFaultTree);
	}
	
	public TDDIFaultTree unwrap() {
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
	public boolean isSetMinimalCutsets() {
		return thriftElement.isSetMinimalCutSets();
	}

	@Override
	public List<TDDIMinimalCutSets> getMinimalCutsets() {
		return thriftElement.getMinimalCutSets();
	}

	@Override
	public boolean isSetFailures() {
		return thriftElement.isSetFailures();
	}

	@Override
	public List<TDDIAbstractFailure> getFailures() {
		return thriftElement.getFailures();
	}

	
	@Override
	public boolean isSetSubModels() {
		return thriftElement.isSetSubModels();
	}

	@Override
	public List<TDDIAbstractFailureModelRef> getSubModels() {
		return thriftElement.getSubModels();
	}
}
