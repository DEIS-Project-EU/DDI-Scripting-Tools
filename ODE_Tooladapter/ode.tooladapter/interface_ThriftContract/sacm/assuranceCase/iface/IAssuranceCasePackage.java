package sacm.assuranceCase.iface;
import java.util.List;

import sacm.base.iface.IArtifactElement;
import thriftContract.TDDIAbstractArgumentPackageRef;
import thriftContract.TDDIAbstractArtifactPackageRef;
import thriftContract.TDDIAbstractAssuranceCasePackageRef;
import thriftContract.TDDIAbstractTerminologyPackageRef;
import thriftContract.TDDIAssuranceCasePackageInterfaceRef;;

public interface IAssuranceCasePackage extends IArtifactElement{
	boolean isSetTerminolgyPackage();
	List<TDDIAbstractTerminologyPackageRef> getTerminologyPackage();
	void addToTerminologyPackage(TDDIAbstractTerminologyPackageRef value);
	
	boolean isSetAssuranceCasePackage();
	List<TDDIAbstractAssuranceCasePackageRef> getAssuranceCasePackage();
	void addToAssuranceCasePackage(TDDIAbstractAssuranceCasePackageRef value);
	
	boolean isSetInterface();
	List<TDDIAssuranceCasePackageInterfaceRef> getInterface();
	void addToInterface(TDDIAssuranceCasePackageInterfaceRef value);
	
	boolean isSetArtifactPackage();
	List<TDDIAbstractArtifactPackageRef> getArtifactPackage();
	void addToArtifactPackage(TDDIAbstractArtifactPackageRef value);
	
	boolean isSetArgumentPackage();
	List<TDDIAbstractArgumentPackageRef> getArgumentPackage();
	void addToArgumentPackage(TDDIAbstractArgumentPackageRef value);
}
