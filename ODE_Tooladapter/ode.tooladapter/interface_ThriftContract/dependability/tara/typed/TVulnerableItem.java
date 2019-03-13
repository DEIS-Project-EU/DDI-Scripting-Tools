package dependability.tara.typed;

import java.util.List;

import dependability.iface.IAsset;
import thriftContract.TDDIFinancialCostType;
import thriftContract.TDDIKeyValueMap;
import thriftContract.TDDIOperationalCostType;
import thriftContract.TDDIVulnerableItem;

public class TVulnerableItem implements IAsset {

	private TDDIVulnerableItem thriftElement;
	
	private TVulnerableItem(TDDIVulnerableItem thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TVulnerableItem wrap(TDDIVulnerableItem thriftElement) {
		return new TVulnerableItem(thriftElement);
	}
	
	public TDDIVulnerableItem unwrap() {
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
	public boolean isSetFinancialValue() {
		return thriftElement.isSetFinancialValue();
	}

	@Override
	public double getFinancialValue() {
		return thriftElement.getFinancialValue();
	}

	@Override
	public void setFinancialValue(double value) {
		thriftElement.setFinancialValue(value);
		thriftElement.setFinancialValueIsSet(true);
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
	public boolean isSetOperationalCost() {
		return thriftElement.isSetOperationalCost();
	}

	@Override
	public double getOperationalCost() {
		return getOperationalCost();
	}

	@Override
	public void setOperationalCost(double value) {
		thriftElement.setOperationalCost(value);
		thriftElement.setOperationalCostIsSet(true);
	}

	@Override
	public boolean isSetOperationalCostType() {
		return thriftElement.isSetOperationalCostType();
	}

	@Override
	public TDDIOperationalCostType getOperationalCostType() {
		return thriftElement.getOperationalCostType();
	}

	@Override
	public void setOperationalCostType(TDDIOperationalCostType value) {
		thriftElement.setOperationalCostType(value);
		thriftElement.setOperationalCostTypeIsSet(true);
	}
}
