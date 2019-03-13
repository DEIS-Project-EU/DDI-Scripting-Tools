package sacm.base.iface;

import java.util.List;

import thriftContract.TDDIAbstractLangString;
import thriftContract.TDDIDescription;
import thriftContract.TDDIImplementationConstraintRef;
import thriftContract.TDDINoteRef;
import thriftContract.TDDITaggedValueRef;

public interface IModelElement extends ISacmElement {
	boolean isSetName();
	TDDIAbstractLangString getName();
	void setName(TDDIAbstractLangString value);
	
	boolean isSetDescription();
	TDDIDescription getDescription();
	void setDescription(TDDIDescription value);
	
	boolean isSetImplementationConstraint();
	List<TDDIImplementationConstraintRef> getImplementationConstraint();
	void addToImplementationConstraint(TDDIImplementationConstraintRef value);
	
	boolean isSetNote();
	List<TDDINoteRef> getNote();
	void addToNote(TDDINoteRef value);
	
	boolean isSetTaggedValue();
	List<TDDITaggedValueRef> getTaggedValue();
	void addToTaggedValue(TDDITaggedValueRef value);
}
