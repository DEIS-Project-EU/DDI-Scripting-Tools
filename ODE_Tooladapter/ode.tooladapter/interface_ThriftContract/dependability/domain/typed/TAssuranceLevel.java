package dependability.domain.typed;

import java.util.List;

import base.iface.IBaseElement;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIKeyValueMap;

public class TAssuranceLevel implements IBaseElement {

	private TDDIAssuranceLevel thriftElement;
	
	private TAssuranceLevel(TDDIAssuranceLevel thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TAssuranceLevel wrap(TDDIAssuranceLevel thriftElement) {
		return new TAssuranceLevel(thriftElement);
	}
	
	public TDDIAssuranceLevel unwrap() {
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
}
