package dependability.hara.typed;

import java.util.List;

import integration.iface.IODEProductPackage;
import thriftContract.TDDIHARAPackage;
import thriftContract.TDDIKeyValueMap;

public class THARAPackage implements IODEProductPackage {

	private TDDIHARAPackage thriftElement;

	private THARAPackage(TDDIHARAPackage thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static THARAPackage wrap(TDDIHARAPackage tDDIHARAPackage) {
		return new THARAPackage(tDDIHARAPackage);
	}
	
	public TDDIHARAPackage unwrap() {
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
