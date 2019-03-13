package dependability.tara.typed;

import java.util.List;

import dependability.iface.IAttack;
import thriftContract.TDDIFinancialCostType;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDIPayload;
import thriftContract.TDDISecurityViolationRef;
import thriftContract.TDDITimeUnit;
import thriftContract.TDDIVulnerabilityRef;

public class TPayload implements IAttack {

	private TDDIPayload thriftElement;
	
	private TPayload(TDDIPayload thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TPayload wrap(TDDIPayload thriftElement) {
		return new TPayload(thriftElement);
	}
	
	public TDDIPayload unwrap() {
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
	public boolean isSetCategory() {
		return thriftElement.isSetCategory();
	}

	@Override
	public String getCategory() {
		return thriftElement.getCategory();
	}

	@Override
	public void setCategory(String value) {
		thriftElement.setCategory(value);
		thriftElement.setCategoryIsSet(true);
	}

	@Override
	public boolean isSetFinancialCost() {
		return thriftElement.isSetFinancialCost();
	}

	@Override
	public double getFinancialCost() {
		return thriftElement.getFinancialCost();
	}

	@Override
	public void setFinancialCost(double value) {
		thriftElement.setFinancialCost(value);
		thriftElement.setFinancialCostIsSet(true);
	}

	@Override
	public boolean isSetFinancialCostType() {
		return thriftElement.isSetFinancialCostType();
	}

	@Override
	public TDDIFinancialCostType getFinancialCostType() {
		return thriftElement.getFinancialCostType();
	}

	@Override
	public void setFinancialCostType(TDDIFinancialCostType value) {
		thriftElement.setFinancialCostType(value);
		thriftElement.setFinancialCostTypeIsSet(true);
	}

	@Override
	public boolean isSetTimeRequired() {
		return thriftElement.isSetTimeRequired();
	}

	@Override
	public double getTimeRequired() {
		return thriftElement.getTimeRequired();
	}

	@Override
	public void setTimeRequired(double value) {
		thriftElement.setTimeRequired(value);
		thriftElement.setTimeRequiredIsSet(true);
	}

	@Override
	public boolean isSetTimeUnit() {
		return thriftElement.isSetTimeUnit();
	}

	@Override
	public TDDITimeUnit getTimeUnit() {
		return thriftElement.getTimeUnit();
	}

	@Override
	public void setTimeUnit(TDDITimeUnit value) {
		thriftElement.setTimeUnit(value);
		thriftElement.setTimeUnitIsSet(true);
	}

	@Override
	public boolean isSetDifficulty() {
		return thriftElement.isSetDifficulty();
	}

	@Override
	public String getDifficulty() {
		return thriftElement.getDifficulty();
	}

	@Override
	public void setDifficulty(String value) {
		thriftElement.setDifficulty(value);
		thriftElement.setDifficultyIsSet(true);
	}

	@Override
	public boolean isSetDetectability() {
		return thriftElement.isSetDetectability();
	}

	@Override
	public String getDetectability() {
		return thriftElement.getDetectability();
	}

	@Override
	public void setDetectability(String value) {
		thriftElement.setDetectability(value);
		thriftElement.setDetectabilityIsSet(true);
	}

	@Override
	public boolean isSetViolations() {
		return thriftElement.isSetViolations();
	}

	@Override
	public List<TDDISecurityViolationRef> getViolations() {
		return thriftElement.getViolations();
	}

	@Override
	public boolean isSetExploitedVulnerabilities() {
		return thriftElement.isSetExploitedVulnerabilities();
	}

	@Override
	public List<TDDIVulnerabilityRef> getExploitedVulnerabilities() {
		return thriftElement.getExploitedVulnerabilities();
	}
}
