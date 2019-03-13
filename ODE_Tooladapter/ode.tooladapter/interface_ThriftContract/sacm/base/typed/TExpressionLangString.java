package sacm.base.typed;

import sacm.base.iface.ILangString;
import thriftContract.TDDIExpressionLangString;

public class TExpressionLangString implements ILangString {

	TDDIExpressionLangString thriftElement;
	
	public TExpressionLangString(TDDIExpressionLangString thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TExpressionLangString wrap(TDDIExpressionLangString thriftElement) {
		return new TExpressionLangString(thriftElement);
	}
	
	@Override
	public boolean isSetLang() {
		return this.thriftElement.isSetLang();
	}

	@Override
	public String getLang() {
		return this.thriftElement.getLang();
	}

	@Override
	public void setLang(String lang) {
		this.thriftElement.setLangIsSet(true);
		this.thriftElement.setLang(lang);
	}

	@Override
	public boolean isSetContent() {
		return this.thriftElement.isSetContent();
	}

	@Override
	public String getContent() {
		return this.thriftElement.getContent();
	}

	@Override
	public void setContent(String content) {
		this.thriftElement.setContentIsSet(true);
		this.thriftElement.setContent(content);
	}
}
