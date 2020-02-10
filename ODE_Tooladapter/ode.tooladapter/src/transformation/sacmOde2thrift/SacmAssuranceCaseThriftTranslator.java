package transformation.sacmOde2thrift;

import sacm.assuranceCase.iface.IAssuranceCasePackage;
import sacm.assuranceCase.typed.TAssuranceCasePackage;
import sacm.assuranceCase.typed.TAssuranceCasePackageBinding;
import sacm.assuranceCase.typed.TAssuranceCasePackageInterface;
import thriftContract.TDDIAbstractAssuranceCasePackage;
import thriftContract.TDDIAbstractAssuranceCasePackageRef;
import thriftContract.TDDIAssuranceCasePackage;
import thriftContract.TDDIAssuranceCasePackageBinding;
import thriftContract.TDDIAssuranceCasePackageInterface;
import thriftContract.TDDIAssuranceCasePackageInterfaceRef;
import thriftContract.TDDIAssuranceCasePackageUnion;
import thriftContract.TDDIAssuranceCasePackageUnionType;
import top.argumentation.ArgumentPackage;
import top.artifact.ArtifactPackage;
import top.assuranceCase.AssuranceCasePackage;
import top.assuranceCase.AssuranceCasePackageBinding;
import top.assuranceCase.AssuranceCasePackageInterface;
import top.terminology.TerminologyPackage;

public class SacmAssuranceCaseThriftTranslator {
	public static TDDIAbstractAssuranceCasePackage transformAbstractAssuranceCasePackage(AssuranceCasePackage eAssuranceCasePackage) {
		TDDIAbstractAssuranceCasePackage tAbstractAssuranceCasePackage = new TDDIAbstractAssuranceCasePackage();
		
		if(eAssuranceCasePackage instanceof AssuranceCasePackageBinding) {
			tAbstractAssuranceCasePackage.UsedAssuranceCasePackageType = TDDIAssuranceCasePackageUnionType.ACPUTAssuranceCasePackageBinding;
			tAbstractAssuranceCasePackage.UsedAssuranceCasePackage = new TDDIAssuranceCasePackageUnion();
			tAbstractAssuranceCasePackage.UsedAssuranceCasePackage.setAssuranceCasePackageBinding(transformAssuranceCasePackageBinding((AssuranceCasePackageBinding) eAssuranceCasePackage));
		} else if(eAssuranceCasePackage instanceof AssuranceCasePackageInterface) {
			tAbstractAssuranceCasePackage.UsedAssuranceCasePackageType = TDDIAssuranceCasePackageUnionType.ACPUTAssuranceCasePackageInterface;
			tAbstractAssuranceCasePackage.UsedAssuranceCasePackage = new TDDIAssuranceCasePackageUnion();
			tAbstractAssuranceCasePackage.UsedAssuranceCasePackage.setAssuranceCasePackageInterface(transformAssuranceCasePackageInterface((AssuranceCasePackageInterface) eAssuranceCasePackage));
		} else if(eAssuranceCasePackage instanceof AssuranceCasePackage) {
			tAbstractAssuranceCasePackage.UsedAssuranceCasePackageType = TDDIAssuranceCasePackageUnionType.ACPUTAssuranceCasePackage;
			tAbstractAssuranceCasePackage.UsedAssuranceCasePackage = new TDDIAssuranceCasePackageUnion();
			tAbstractAssuranceCasePackage.UsedAssuranceCasePackage.setAssuranceCasePackage(transformAssuranceCasePackage((AssuranceCasePackage) eAssuranceCasePackage));
		}
		return tAbstractAssuranceCasePackage;
	}

	private static TDDIAssuranceCasePackageBinding transformAssuranceCasePackageBinding(AssuranceCasePackageBinding eAssuranceCasePackageBinding) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eAssuranceCasePackageBinding)) {
			return (TDDIAssuranceCasePackageBinding) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eAssuranceCasePackageBinding); 
		}
		
		TDDIAssuranceCasePackageBinding tAssuranceCasePackageBinding = new TDDIAssuranceCasePackageBinding();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eAssuranceCasePackageBinding, tAssuranceCasePackageBinding);
		transformAssuranceCasePackageContents(TAssuranceCasePackageBinding.wrap(tAssuranceCasePackageBinding), eAssuranceCasePackageBinding);
		
		if(eAssuranceCasePackageBinding.getParticipantPackage() != null && eAssuranceCasePackageBinding.getParticipantPackage().size() >= 2) {
			for(AssuranceCasePackage eParticipantPackage : eAssuranceCasePackageBinding.getParticipantPackage()) {
				tAssuranceCasePackageBinding.addToParticipantPackage(new TDDIAbstractAssuranceCasePackageRef(transformAbstractAssuranceCasePackage(eParticipantPackage)));
			}
		}
		return tAssuranceCasePackageBinding;
	}
	
	private static TDDIAssuranceCasePackageInterface transformAssuranceCasePackageInterface(AssuranceCasePackageInterface eAssuranceCasePackageInterface) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eAssuranceCasePackageInterface)) {
			return (TDDIAssuranceCasePackageInterface) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eAssuranceCasePackageInterface); 
		}
		
		TDDIAssuranceCasePackageInterface tAssuranceCasePackageInterface = new TDDIAssuranceCasePackageInterface();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eAssuranceCasePackageInterface, tAssuranceCasePackageInterface);
		transformAssuranceCasePackageContents(TAssuranceCasePackageInterface.wrap(tAssuranceCasePackageInterface), eAssuranceCasePackageInterface);
		
		if(eAssuranceCasePackageInterface.getImplements() != null) {
			tAssuranceCasePackageInterface.setImplements(transformAbstractAssuranceCasePackage(eAssuranceCasePackageInterface.getImplements()));
		}
		
		return tAssuranceCasePackageInterface;
	}
	
	private static TDDIAssuranceCasePackage transformAssuranceCasePackage(AssuranceCasePackage eAssuranceCasePackage) {
		if(SacmBaseThriftTranslator.sacmEmf2ThriftMap.containsKey(eAssuranceCasePackage)) {
			return (TDDIAssuranceCasePackage) SacmBaseThriftTranslator.sacmEmf2ThriftMap.get(eAssuranceCasePackage); 
		}
		
		TDDIAssuranceCasePackage tAssuranceCasePackage = new TDDIAssuranceCasePackage();
		SacmBaseThriftTranslator.sacmEmf2ThriftMap.put(eAssuranceCasePackage, tAssuranceCasePackage);
		transformAssuranceCasePackageContents(TAssuranceCasePackage.wrap(tAssuranceCasePackage), eAssuranceCasePackage);
		
		return tAssuranceCasePackage;
	}

	private static void transformAssuranceCasePackageContents(IAssuranceCasePackage tAssuranceCasePackage, AssuranceCasePackage emfAssuranceCasePackage) {
		SacmBaseThriftTranslator.transformArtifactElementContents(tAssuranceCasePackage, emfAssuranceCasePackage);
		
		if(emfAssuranceCasePackage.getTerminologyPackage() != null) {
			for(TerminologyPackage eTerminologyPackgage : emfAssuranceCasePackage.getTerminologyPackage()) {
				tAssuranceCasePackage.addToTerminologyPackage(SacmTerminologyThriftTranslator.transformAbstractTerminologyPackage(eTerminologyPackgage));
			}
		}
		
		if(emfAssuranceCasePackage.getAssuranceCasePackage() != null) {
			for(AssuranceCasePackage eAssuranceCasePackage : emfAssuranceCasePackage.getAssuranceCasePackage()) {
				tAssuranceCasePackage.addToAssuranceCasePackage(transformAbstractAssuranceCasePackage(eAssuranceCasePackage));
			}
		}
		
		if(emfAssuranceCasePackage.getInterface() != null) {
			for(AssuranceCasePackageInterface eAssuranceCasePackageInterface : emfAssuranceCasePackage.getInterface()) {
				tAssuranceCasePackage.addToInterface(new TDDIAssuranceCasePackageInterfaceRef(transformAssuranceCasePackageInterface(eAssuranceCasePackageInterface)));
			}
		}
		
		if(emfAssuranceCasePackage.getArtifactPackage() != null) {
			for(ArtifactPackage eArtifactPackage : emfAssuranceCasePackage.getArtifactPackage()) {
				tAssuranceCasePackage.addToArtifactPackage(SacmArtifactThriftTranslator.transformAbstractArtifactPackage(eArtifactPackage));
			}
		}
		
		if(emfAssuranceCasePackage.getArgumentPackage() != null) {
			for(ArgumentPackage eArgumentPackage : emfAssuranceCasePackage.getArgumentPackage()) {
				tAssuranceCasePackage.addToArgumentPackage(SacmArgumentThriftTranslator.transformAbstractArgumentPackage(eArgumentPackage));
			}
		}
	}
}
