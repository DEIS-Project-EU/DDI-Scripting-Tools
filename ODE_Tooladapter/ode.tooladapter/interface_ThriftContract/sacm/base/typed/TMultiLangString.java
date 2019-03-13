package sacm.base.typed;

import sacm.base.iface.IElement;
import thriftContract.TDDIMultiLangString;

public class TMultiLangString implements IElement {

	TDDIMultiLangString thriftElement;
	
	public TMultiLangString(TDDIMultiLangString thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TMultiLangString wrap(TDDIMultiLangString thriftElement) {
		return new TMultiLangString(thriftElement);
	}
}
