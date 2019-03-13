package sacm.base.iface;

public interface ILangString extends IElement{
	boolean isSetLang();
	String getLang();
	void setLang(String lang);
	
	boolean isSetContent();
	String getContent();
	void setContent(String content);
}
