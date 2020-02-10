package sacm.assuranceCase.iface;
import java.util.List;

import sacm.base.iface.IArtifactElement;
import thriftContract.TDDIAbstractArgumentPackage;
import thriftContract.TDDIAbstractArtifactPackage;
import thriftContract.TDDIAbstractAssuranceCasePackage;
import thriftContract.TDDIAbstractTerminologyPackage;
import thriftContract.TDDIAssuranceCasePackageInterfaceRef;;

public interface IAssuranceCasePackage extends IArtifactElement{
	boolean isSetTerminolgyPackage();
	List<TDDIAbstractTerminologyPackage> getTerminologyPackage();
	void addToTerminologyPackage(TDDIAbstractTerminologyPackage value);
	
	boolean isSetAssuranceCasePackage();
	List<TDDIAbstractAssuranceCasePackage> getAssuranceCasePackage();
	void addToAssuranceCasePackage(TDDIAbstractAssuranceCasePackage value);
	
	boolean isSetInterface();
	List<TDDIAssuranceCasePackageInterfaceRef> getInterface();
	void addToInterface(TDDIAssuranceCasePackageInterfaceRef value);
	
	boolean isSetArtifactPackage();
	List<TDDIAbstractArtifactPackage> getArtifactPackage();
	void addToArtifactPackage(TDDIAbstractArtifactPackage value);
	
	boolean isSetArgumentPackage();
	List<TDDIAbstractArgumentPackage> getArgumentPackage();
	void addToArgumentPackage(TDDIAbstractArgumentPackage value);
}
