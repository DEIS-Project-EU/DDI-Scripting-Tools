package sacm.terminology.iface;

import java.util.List;

import thriftContract.TDDIAbstractTerminologyElement;

public interface ITerminologyPackage extends ITerminologyElement{

	boolean isSetTerminologyElements();
	List<TDDIAbstractTerminologyElement> getTerminologyElements();
	void addToTerminologyElements(TDDIAbstractTerminologyElement value);
		
}
