package sacm.base.iface;

import thriftContract.TDDIMultiLangString;

public interface IUtilityElement extends ISacmElement {
	boolean isSetContent();
	TDDIMultiLangString getContent();
	void setContent(TDDIMultiLangString value);
}
