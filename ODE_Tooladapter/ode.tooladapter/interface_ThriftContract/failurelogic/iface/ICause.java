package failurelogic.iface;

import base.iface.IBaseElement;
import thriftContract.TDDIAbstractFailure;
import thriftContract.TDDICauseType;

public interface ICause extends IBaseElement {

	boolean isSetType();
	TDDICauseType getType();
	void setType(TDDICauseType value);
	
	boolean isSetFailure();
	TDDIAbstractFailure getFailure();
	void setFailure(TDDIAbstractFailure value);
}
