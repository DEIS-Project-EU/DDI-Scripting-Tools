package dependability.tara.typed;

import java.util.List;

import base.iface.IBaseElement;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDISecurityRisk;

public class TSecurityRisk implements IBaseElement {

	private TDDISecurityRisk thriftElement;
	
	private TSecurityRisk(TDDISecurityRisk thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TSecurityRisk wrap(TDDISecurityRisk thriftElement) {
		return new TSecurityRisk(thriftElement);
	}
	
	public TDDISecurityRisk unwrap() {
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
