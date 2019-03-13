package dependability.iface;

import base.iface.IBaseElement;

public interface IRiskParameter extends IBaseElement {

	boolean isSetArgument();
	String getArgument();
	void setArgument(String value);
}
