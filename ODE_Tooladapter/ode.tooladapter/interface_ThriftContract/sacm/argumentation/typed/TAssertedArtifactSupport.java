package sacm.argumentation.typed;

import java.util.List;

import sacm.argumentation.iface.IAssertedRelationship;
import thriftContract.TDDIAbstractArgumentAssetRef;
import thriftContract.TDDIAbstractLangString;
import thriftContract.TDDIAbstractSACMElement;
import thriftContract.TDDIArgumentReasoning;
import thriftContract.TDDIAssertedArtifactSupport;
import thriftContract.TDDIAssertionDeclaration;
import thriftContract.TDDIClaim;
import thriftContract.TDDIClaimRef;
import thriftContract.TDDIDescription;
import thriftContract.TDDIImplementationConstraintRef;
import thriftContract.TDDINoteRef;
import thriftContract.TDDITaggedValueRef;

public class TAssertedArtifactSupport implements IAssertedRelationship {
	private TDDIAssertedArtifactSupport thriftElement;
	
	private TAssertedArtifactSupport(TDDIAssertedArtifactSupport thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TAssertedArtifactSupport wrap(TDDIAssertedArtifactSupport thriftElement) {
		return new TAssertedArtifactSupport(thriftElement);
	}
	
	public TDDIAssertedArtifactSupport unwrap() {
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
	public boolean isSetName() {
		return thriftElement.isSetName();
	}

	@Override
	public TDDIAbstractLangString getName() {
		return thriftElement.getName();
	}

	@Override
	public void setName(TDDIAbstractLangString value) {
		thriftElement.setNameIsSet(true);
		thriftElement.setName(value);
	}

	@Override
	public boolean isSetDescription() {
		return thriftElement.isSetDescription();
	}

	@Override
	public TDDIDescription getDescription() {
		return thriftElement.getDescription();
	}

	@Override
	public void setDescription(TDDIDescription value) {
		thriftElement.setDescriptionIsSet(true);
		thriftElement.setDescription(value);
	}

	@Override
	public boolean isSetImplementationConstraint() {
		return thriftElement.isSetImplementationConstraint();
	}

	@Override
	public List<TDDIImplementationConstraintRef> getImplementationConstraint() {
		return thriftElement.getImplementationConstraint();
	}

	@Override
	public void addToImplementationConstraint(TDDIImplementationConstraintRef value) {
		thriftElement.addToImplementationConstraint(value);
	}

	@Override
	public boolean isSetNote() {
		return thriftElement.isSetNote();
	}

	@Override
	public List<TDDINoteRef> getNote() {
		return thriftElement.getNote();
	}

	@Override
	public void addToNote(TDDINoteRef value) {
		thriftElement.addToNote(value);		
	}

	@Override
	public boolean isSetTaggedValue() {
		return thriftElement.isSetTaggedValue();
	}

	@Override
	public List<TDDITaggedValueRef> getTaggedValue() {
		return thriftElement.getTaggedValue();
	}

	@Override
	public void addToTaggedValue(TDDITaggedValueRef value) {
		thriftElement.addToTaggedValue(value);
	}

	@Override
	public boolean isSetIsCounter() {
		return thriftElement.isSetIsCounter();
	}

	@Override
	public boolean isIsCounter() {
		return thriftElement.IsCounter;
	}

	@Override
	public void setIsCounter(boolean value) {
		thriftElement.setIsCounterIsSet(true);
		thriftElement.setIsCounter(value);
	}

	@Override
	public boolean isSetSources() {
		return thriftElement.isSetSource();
	}

	@Override
	public List<TDDIAbstractArgumentAssetRef> getSources() {
		return thriftElement.getSource();
	}

	@Override
	public void addToSources(TDDIAbstractArgumentAssetRef value) {
		thriftElement.setSourceIsSet(true);
		thriftElement.addToSource(value);
	}

	@Override
	public boolean isSetTargets() {
		return thriftElement.isSetTarget();
	}

	@Override
	public List<TDDIAbstractArgumentAssetRef> getTargets() {
		return thriftElement.getTarget();
	}

	@Override
	public void addToTargets(TDDIAbstractArgumentAssetRef value) {
		thriftElement.setTargetIsSet(true);
		thriftElement.addToTarget(value);
	}

	@Override
	public boolean isSetArgumentReasoning() {
		return thriftElement.isSetReasoning();
	}

	@Override
	public TDDIArgumentReasoning getArgumentReasoning() {
		return thriftElement.getReasoning();
	}

	@Override
	public void setArgumentReasoning(TDDIArgumentReasoning value) {
		thriftElement.setReasoningIsSet(true);
		thriftElement.setReasoning(value);
	}
	
	@Override
	public boolean isSetAssertionDeclaration() {
		return thriftElement.isSetAssertionDeclaration();
	}

	@Override
	public TDDIAssertionDeclaration getAssertionDeclaration() {
		return thriftElement.getAssertionDeclaration();
	}

	@Override
	public void setAssertionDeclaration(TDDIAssertionDeclaration value) {
		thriftElement.setAssertionDeclarationIsSet(true);
		thriftElement.setAssertionDeclaration(value);
	}

	@Override
	public boolean isSetMetaClaims() {
		return thriftElement.isSetMetaClaim();
	}

	@Override
	public List<TDDIClaimRef> getMetaClaims() {
		return thriftElement.getMetaClaim();
	}

	@Override
	public void addToMetaClaims(TDDIClaim value) {
		thriftElement.addToMetaClaim(new TDDIClaimRef(value));
	}
}