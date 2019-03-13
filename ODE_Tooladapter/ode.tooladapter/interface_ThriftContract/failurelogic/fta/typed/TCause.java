package failurelogic.fta.typed;

import java.util.List;

import failurelogic.iface.ICause;
import thriftContract.TDDIAbstractFailure;
import thriftContract.TDDICause;
import thriftContract.TDDICauseType;
import thriftContract.TDDIKeyValueMap;

public class TCause implements ICause {

	private TDDICause thriftElement;

	private TCause(TDDICause thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TCause wrap(TDDICause tDDICause) {
		return new TCause(tDDICause);
	}
	
	public TDDICause unwrap() {
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
	public boolean isSetType() {
		return thriftElement.isSetType();
	}

	@Override
	public TDDICauseType getType() {
		return thriftElement.getType();
	}

	@Override
	public void setType(TDDICauseType value) {
		thriftElement.setType(value);
		thriftElement.setTypeIsSet(true);
	}

	@Override
	public boolean isSetFailure() {
		return thriftElement.isSetFailure();
	}

	@Override
	public TDDIAbstractFailure getFailure() {
		return thriftElement.getFailure();
	}

	@Override
	public void setFailure(TDDIAbstractFailure value) {
		thriftElement.setFailure(value);
		thriftElement.setFailureIsSet(true);
	}
}
