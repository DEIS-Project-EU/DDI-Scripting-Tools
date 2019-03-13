package dependability.iface;

import java.util.List;

import base.iface.IBaseElement;
import thriftContract.TDDIFinancialCostType;
import thriftContract.TDDISecurityViolationRef;
import thriftContract.TDDITimeUnit;
import thriftContract.TDDIVulnerabilityRef;

public interface IAttack extends IBaseElement {

	boolean isSetCategory();
	String getCategory();
	void setCategory(String value);
	
	boolean isSetFinancialCost();
	double getFinancialCost();
	void setFinancialCost(double value);
	
	boolean isSetFinancialCostType();
	TDDIFinancialCostType getFinancialCostType();
	void setFinancialCostType(TDDIFinancialCostType value);
	
	boolean isSetTimeRequired();
	double getTimeRequired();
	void setTimeRequired(double value);
	
	boolean isSetTimeUnit();
	TDDITimeUnit getTimeUnit();
	void setTimeUnit(TDDITimeUnit value);
	
	boolean isSetDifficulty();
	String getDifficulty();
	void setDifficulty(String value);
	
	boolean isSetDetectability();
	String getDetectability();
	void setDetectability(String value);
	
	boolean isSetViolations();
	List<TDDISecurityViolationRef> getViolations();
	
	boolean isSetExploitedVulnerabilities();
	List<TDDIVulnerabilityRef> getExploitedVulnerabilities();
}
