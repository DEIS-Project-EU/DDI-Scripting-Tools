package failurelogic.fmea.typed;

import java.util.List;

import failurelogic.iface.IFMEAEntry;
import thriftContract.TDDIAbstractFailure;
import thriftContract.TDDIFMEAEntry;
import thriftContract.TDDIKeyValueMap;

public class TFMEAEntry implements IFMEAEntry {

	private TDDIFMEAEntry thriftElement;

	private TFMEAEntry(TDDIFMEAEntry thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TFMEAEntry wrap(TDDIFMEAEntry tDDIFMEAEntry) {
		return new TFMEAEntry(tDDIFMEAEntry);
	}
	
	public TDDIFMEAEntry unwrap() {
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
	public boolean isSetEffect() {
		return thriftElement.isSetEffect();
	}

	@Override
	public TDDIAbstractFailure getEffect() {
		return thriftElement.getEffect();
	}

	@Override
	public void setEffect(TDDIAbstractFailure value) {
		thriftElement.setEffect(value);
		thriftElement.setEffectIsSet(true);
	}

	@Override
	public boolean isSetMode() {
		return thriftElement.isSetMode();
	}

	@Override
	public TDDIAbstractFailure getMode() {
		return thriftElement.getMode();
	}

	@Override
	public void setMode(TDDIAbstractFailure value) {
		thriftElement.setMode(value);
		thriftElement.setModeIsSet(true);
	}
}
