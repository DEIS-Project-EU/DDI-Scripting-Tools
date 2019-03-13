package sacm.artifact.iface;

import java.util.List;

import sacm.base.iface.IArtifactElement;
import thriftContract.TDDIAbstractArtifactElementRef;

public interface IArtifactPackage extends IArtifactElement {
	boolean isSetArtifactElement();
	List<TDDIAbstractArtifactElementRef> getArtifactElement();
	void addToArtifactElement(TDDIAbstractArtifactElementRef value);
}
