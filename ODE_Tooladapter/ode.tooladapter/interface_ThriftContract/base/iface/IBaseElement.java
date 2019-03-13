package base.iface;

import java.util.List;

import thriftContract.TDDIKeyValueMap;

public interface IBaseElement {
	boolean isSetId();
	long getId();
	void setId(long id);
	boolean isSetName();
	String getName();
	void setName(String name);
	boolean isSetDescription();
	String getDescription();
	void setDescription(String name);
	boolean isSetKeyValueMaps();
	List<TDDIKeyValueMap> getKeyValueMaps();
	void setKeyValueMaps(List<TDDIKeyValueMap> tKeyValueMaps);
}
