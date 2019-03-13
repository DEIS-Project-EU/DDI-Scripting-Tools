package sacm.base.typed;

import sacm.base.iface.IUtilityElement;
import thriftContract.TDDIAbstractSACMElement;
import thriftContract.TDDIMultiLangString;
import thriftContract.TDDINote;

public class TNote implements IUtilityElement{

	private TDDINote thriftElement;
	
	private TNote(TDDINote thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TNote wrap(TDDINote thriftElement) {
		return new TNote(thriftElement);
	}
	
	public TDDINote unwrap() {
		return thriftElement;
	}
	
	@Override
	public boolean isSetGid() {
		return thriftElement.isSetGid();
	}

	@Override
	public String getGid() {
		return thriftElement.getGid();
	}

	@Override
	public void setGid(String Gid) {
		thriftElement.setGidIsSet(true);
		thriftElement.setGid(Gid);
	}

	@Override
	public boolean isSetIsCitation() {
		return thriftElement.isSetIsCitation();
	}

	@Override
	public boolean isIsCitation() {
		return thriftElement.isIsCitation();
	}

	@Override
	public void setIsCitation(boolean value) {
		thriftElement.setIsCitationIsSet(true);
		thriftElement.setIsCitation(value);
	}

	@Override
	public boolean isSetIsAbstract() {
		return thriftElement.isSetIsAbstract();
	}

	@Override
	public boolean isIsAbstract() {
		return thriftElement.isIsAbstract();
	}

	@Override
	public void setIsAbstract(boolean value) {
		thriftElement.setIsAbstractIsSet(true);
		thriftElement.setIsAbstract(value);
	}

	@Override
	public boolean isSetCitedElement() {
		return thriftElement.isSetCitedElement();
	}

	@Override
	public TDDIAbstractSACMElement getCitedElement() {
		return thriftElement.getCitedElement();
	}

	@Override
	public void setCitedElement(TDDIAbstractSACMElement value) {
		thriftElement.setCitedElementIsSet(true);
		thriftElement.setCitedElement(value);
	}

	@Override
	public boolean isSetAbstractForm() {
		return thriftElement.isSetAbstractForm();
	}

	@Override
	public TDDIAbstractSACMElement getAbstractForm() {
		return thriftElement.getAbstractForm();
	}

	@Override
	public void setAbstractForm(TDDIAbstractSACMElement value) {
		thriftElement.setAbstractFormIsSet(true);
		thriftElement.setAbstractForm(value);
	}

	@Override
	public boolean isSetContent() {
		return thriftElement.isSetContent();
	}

	@Override
	public TDDIMultiLangString getContent() {
		return thriftElement.getContent();
	}

	@Override
	public void setContent(TDDIMultiLangString value) {
		thriftElement.setContentIsSet(true);
		thriftElement.setContent(value);
	}
}
