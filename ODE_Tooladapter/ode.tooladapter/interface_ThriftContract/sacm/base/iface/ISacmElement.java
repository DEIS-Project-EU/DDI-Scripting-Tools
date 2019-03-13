package sacm.base.iface;

import thriftContract.TDDIAbstractSACMElement;

public interface ISacmElement extends IElement {
	boolean isSetGid();
	String getGid();
	void setGid(String Gid);
	
	boolean isSetIsCitation();
	boolean isIsCitation();
	void setIsCitation(boolean value);
	
	boolean isSetIsAbstract();
	boolean isIsAbstract();
	void setIsAbstract(boolean value);
	
	boolean isSetCitedElement();
	TDDIAbstractSACMElement getCitedElement();
	void setCitedElement(TDDIAbstractSACMElement value);
	
	boolean isSetAbstractForm();
	TDDIAbstractSACMElement getAbstractForm();
	void setAbstractForm(TDDIAbstractSACMElement value);
}
