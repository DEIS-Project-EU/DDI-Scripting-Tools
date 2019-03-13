package sacm.artifact.iface;

import java.util.List;

import sacm.base.iface.IArtifactElement;
import thriftContract.TDDIPropertyRef;

public interface IArtifactAsset extends IArtifactElement {
	boolean isSetProperty();
	List<TDDIPropertyRef> getProperty();
	void addToProperty(TDDIPropertyRef value);
}
