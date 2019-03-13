package dependability.hara.typed;

import java.util.List;

import dependability.iface.IRiskParameter;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDISituation;

public class TSituation implements IRiskParameter {

	private TDDISituation thriftElement;
	
	private TSituation(TDDISituation thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TSituation wrap(TDDISituation thriftElement) {
		return new TSituation(thriftElement);
	}
	
	public TDDISituation unwrap() {
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
	public boolean isSetArgument() {
		return thriftElement.isSetArgument();
	}

	@Override
	public String getArgument() {
		return thriftElement.getArgument();
	}

	@Override
	public void setArgument(String value) {
		thriftElement.setArgument(value);
		thriftElement.setArgumentIsSet(true);
	}
}
