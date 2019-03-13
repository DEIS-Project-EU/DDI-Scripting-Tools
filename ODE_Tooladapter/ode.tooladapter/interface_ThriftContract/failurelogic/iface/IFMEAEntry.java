package failurelogic.iface;

import base.iface.IBaseElement;
import thriftContract.TDDIAbstractFailure;

public interface IFMEAEntry extends IBaseElement{
	boolean isSetEffect();
	TDDIAbstractFailure getEffect();
	void setEffect(TDDIAbstractFailure value);
	
	boolean isSetMode();
	TDDIAbstractFailure getMode();
	void setMode(TDDIAbstractFailure value);
}
