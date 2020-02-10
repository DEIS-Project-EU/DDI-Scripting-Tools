package sacm.assuranceCase.typed;

import java.util.List;

import sacm.assuranceCase.iface.IAssuranceCasePackage;
import thriftContract.TDDIAbstractArgumentPackage;
import thriftContract.TDDIAbstractArtifactPackage;
import thriftContract.TDDIAbstractAssuranceCasePackage;
import thriftContract.TDDIAbstractLangString;
import thriftContract.TDDIAbstractSACMElement;
import thriftContract.TDDIAbstractTerminologyPackage;
import thriftContract.TDDIAssuranceCasePackageBinding;
import thriftContract.TDDIAssuranceCasePackageInterfaceRef;
import thriftContract.TDDIDescription;
import thriftContract.TDDIImplementationConstraintRef;
import thriftContract.TDDINoteRef;
import thriftContract.TDDITaggedValueRef;

public class TAssuranceCasePackageBinding implements IAssuranceCasePackage{

	TDDIAssuranceCasePackageBinding thriftElement;
	
	public TAssuranceCasePackageBinding(TDDIAssuranceCasePackageBinding thriftElement) {
		this.thriftElement = thriftElement;
	}
	
	public static TAssuranceCasePackageBinding wrap(TDDIAssuranceCasePackageBinding thriftElement) {
		return new TAssuranceCasePackageBinding(thriftElement);
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
		thriftElement.setImplementationConstraintIsSet(true);
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
		thriftElement.setNoteIsSet(true);
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
		thriftElement.setTaggedValueIsSet(true);
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
	public boolean isSetTerminolgyPackage() {
		return thriftElement.isSetTerminologyPackage();
	}

	@Override
	public List<TDDIAbstractTerminologyPackage> getTerminologyPackage() {
		return thriftElement.getTerminologyPackage();
	}

	@Override
	public void addToTerminologyPackage(TDDIAbstractTerminologyPackage value) {
		thriftElement.setTerminologyPackageIsSet(true);
		thriftElement.addToTerminologyPackage(value);
	}

	@Override
	public boolean isSetAssuranceCasePackage() {
		return thriftElement.isSetAssuranceCasePackage();
	}

	@Override
	public List<TDDIAbstractAssuranceCasePackage> getAssuranceCasePackage() {
		return thriftElement.getAssuranceCasePackage();
	}

	@Override
	public void addToAssuranceCasePackage(TDDIAbstractAssuranceCasePackage value) {
		thriftElement.setAssuranceCasePackageIsSet(true);
		thriftElement.addToAssuranceCasePackage(value);
	}

	@Override
	public boolean isSetInterface() {
		return thriftElement.isSetInterface();
	}

	@Override
	public List<TDDIAssuranceCasePackageInterfaceRef> getInterface() {
		return thriftElement.getInterface();
	}

	@Override
	public void addToInterface(TDDIAssuranceCasePackageInterfaceRef value) {
		thriftElement.setInterfaceIsSet(true);
		thriftElement.addToInterface(value);
	}

	@Override
	public boolean isSetArtifactPackage() {
		return thriftElement.isSetArtifactPackage();
	}

	@Override
	public List<TDDIAbstractArtifactPackage> getArtifactPackage() {
		return thriftElement.getArtifactPackage();
	}

	@Override
	public void addToArtifactPackage(TDDIAbstractArtifactPackage value) {
		thriftElement.setArtifactPackageIsSet(true);
		thriftElement.addToArtifactPackage(value);
	}

	@Override
	public boolean isSetArgumentPackage() {
		return thriftElement.isSetArgumentPackage();
	}

	@Override
	public List<TDDIAbstractArgumentPackage> getArgumentPackage() {
		return thriftElement.getArgumentPackage();
	}

	@Override
	public void addToArgumentPackage(TDDIAbstractArgumentPackage value) {
		thriftElement.setArgumentPackageIsSet(true);
		thriftElement.addToArgumentPackage(value);
	}
}
