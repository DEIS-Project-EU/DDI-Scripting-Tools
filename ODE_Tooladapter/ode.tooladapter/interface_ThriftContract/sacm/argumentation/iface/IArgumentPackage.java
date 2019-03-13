package sacm.argumentation.iface;

import java.util.List;

import thriftContract.TDDIAbstractArgumentationElementRef;

public interface IArgumentPackage extends IArgumentationElement {
	boolean isSetArgumentationElements();
	List<TDDIAbstractArgumentationElementRef> getArgumentationElement();
	void addToArgumentationElement(TDDIAbstractArgumentationElementRef value);
}
