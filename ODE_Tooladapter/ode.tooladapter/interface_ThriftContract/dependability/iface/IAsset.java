package dependability.iface;

import base.iface.IBaseElement;
import thriftContract.TDDIFinancialCostType;
import thriftContract.TDDIOperationalCostType;

public interface IAsset extends IBaseElement {

	boolean isSetFinancialValue();
	double getFinancialValue();
	void setFinancialValue(double value);
	
	boolean isSetFinancialCostType();
	TDDIFinancialCostType getFinancialCostType();
	void setFinancialCostType(TDDIFinancialCostType value);
	
	boolean isSetOperationalCost();
	double getOperationalCost();
	void setOperationalCost(double value);
	
	boolean isSetOperationalCostType();
	TDDIOperationalCostType getOperationalCostType();
	void setOperationalCostType(TDDIOperationalCostType value);
}
