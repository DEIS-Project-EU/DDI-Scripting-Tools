package sacm.terminology.iface;

import java.util.List;

import thriftContract.TDDICategoryRef;

public interface IExpressionElement extends ITerminologyAsset {
	boolean isSetCategory();
	List<TDDICategoryRef> getCategory();
	void addToCategory(TDDICategoryRef value);
	
	boolean isSetValue();
	String getValue();
	void setValue(String value);
}
