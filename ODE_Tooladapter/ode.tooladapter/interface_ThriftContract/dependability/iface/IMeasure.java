package dependability.iface;

import base.iface.IBaseElement;
import thriftContract.TDDIAssuranceLevel;
import thriftContract.TDDIMeasureType;

public interface IMeasure extends IBaseElement {

	boolean isSetIntrinsicSafety();
	String getIntrinsicSafety();
	void setIntrinsicSafety(String value);
	
	boolean isSetSafeGuard();
	String getSafeGuard();
	void setSafeGuard(String value);
	
	boolean isSetApplierInformation();
	String getApplierInformation();
	void setApplierInformation(String value);
	
	boolean isSetRiskAcceptability();
	boolean getRiskAcceptability();
	void setRiskAcceptability(boolean value);
	
	boolean isSetFurtherAction();
	String getFurtherAction();
	void setFurtherAction(String value);
	
	boolean isSetSource();
	String getSource();
	void setSource(String value);
	
	boolean isSetMeasureType();
	TDDIMeasureType getMeasureType();
	void setMeasureType(TDDIMeasureType value);
	
	boolean isSetAssuranceLevel();
	TDDIAssuranceLevel getAssuranceLevel();
	void setAssuranceLevel(TDDIAssuranceLevel value);
}
