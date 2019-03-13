package dependability.typed;

import java.util.List;

import dependability.iface.IMeasure;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIFaultToleranceMeasure;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDIMeasureType;

public class TFaultToleranceMeasure implements IMeasure {

	private TDDIFaultToleranceMeasure thriftElement;
	
	private TFaultToleranceMeasure(TDDIFaultToleranceMeasure thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TFaultToleranceMeasure wrap(TDDIFaultToleranceMeasure thriftElement) {
		return new TFaultToleranceMeasure(thriftElement);
	}
	
	public TDDIFaultToleranceMeasure unwrap() {
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
	public boolean isSetIntrinsicSafety() {
		return thriftElement.isSetIntrinsicSafety();
	}

	@Override
	public String getIntrinsicSafety() {
		return thriftElement.getIntrinsicSafety();
	}

	@Override
	public void setIntrinsicSafety(String value) {
		thriftElement.setIntrinsicSafety(value);
		thriftElement.setIntrinsicSafetyIsSet(true);
	}

	@Override
	public boolean isSetSafeGuard() {
		return thriftElement.isSetSafeGuard();
	}

	@Override
	public String getSafeGuard() {
		return thriftElement.getSafeGuard();
	}

	@Override
	public void setSafeGuard(String value) {
		thriftElement.setSafeGuard(value);
		thriftElement.setSafeGuardIsSet(true);
	}

	@Override
	public boolean isSetApplierInformation() {
		return thriftElement.isSetApplierInformation();
	}

	@Override
	public String getApplierInformation() {
		return thriftElement.getApplierInformation();
	}

	@Override
	public void setApplierInformation(String value) {
		thriftElement.setApplierInformation(value);
		thriftElement.setApplierInformationIsSet(true);
	}

	@Override
	public boolean isSetRiskAcceptability() {
		return thriftElement.isSetRiskAcceptability();
	}

	@Override
	public boolean getRiskAcceptability() {
		return thriftElement.RiskAcceptability;
	}

	@Override
	public void setRiskAcceptability(boolean value) {
		thriftElement.setRiskAcceptability(value);
		thriftElement.setRiskAcceptabilityIsSet(true);
	}

	@Override
	public boolean isSetFurtherAction() {
		return thriftElement.isSetFurtherAction();
	}

	@Override
	public String getFurtherAction() {
		return thriftElement.getFurtherAction();
	}

	@Override
	public void setFurtherAction(String value) {
		thriftElement.setFurtherAction(value);
		thriftElement.setFurtherActionIsSet(true);
	}

	@Override
	public boolean isSetSource() {
		return thriftElement.isSetSource();
	}

	@Override
	public String getSource() {
		return thriftElement.getSource();
	}

	@Override
	public void setSource(String value) {
		thriftElement.setSource(value);
		thriftElement.setSourceIsSet(true);
	}

	@Override
	public boolean isSetMeasureType() {
		return thriftElement.isSetMeasureType();
	}

	@Override
	public TDDIMeasureType getMeasureType() {
		return thriftElement.getMeasureType();
	}

	@Override
	public void setMeasureType(TDDIMeasureType value) {
		thriftElement.setMeasureType(value);
		thriftElement.setMeasureTypeIsSet(true);
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
	public void setAssuranceLevel(TDDIAssuranceLevel value) {
		thriftElement.setAssuranceLevel(value);
		thriftElement.setAssuranceLevelIsSet(true);
	}
}
