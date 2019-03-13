package transformation.sacmThrift2ode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import artifact.ArtifactPackage;
import sacm.artifact.iface.IArtifactPackage;
import sacm.artifact.typed.TArtifactPackage;
import thriftContract.TDDIAbstractArtifactPackage;
import thriftContract.TDDIArtifactPackage;
import thriftContract.TDDIArtifactPackageBinding;
import thriftContract.TDDIArtifactPackageInterface;
import util.EMFFactory;

public class SacmArtifactEMFTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(SacmArtifactEMFTranslater.class);
	
	public static ArtifactPackage transformAbstractAssuranceCasePackage(TDDIAbstractArtifactPackage tAbstractArtifactPackage) {
		if (tAbstractArtifactPackage.isSetUsedArtifactPackageType()) {
			switch (tAbstractArtifactPackage.UsedArtifactPackageType) {
			case APUTArtifactPackage:
				return transformArtifactPackage(tAbstractArtifactPackage.UsedArtifactPackage.getArtifactPackage());
			case APUTArtifactPackageBinding:
				return transformArtifactPackageBinding(tAbstractArtifactPackage.UsedArtifactPackage.getArtifactPackageBinding());
			case APUTArtifactPackageInterface:
				return transformArtifactPackageInterface(tAbstractArtifactPackage.UsedArtifactPackage.getArtifactPackageInterface());
			default:
				break;
			
			}
		}
		return EMFFactory.sacmArtifactFactory.createArtifactPackage();
	}
	

	private static ArtifactPackage transformArtifactPackage(TDDIArtifactPackage tArtifactPackage) {
		if(SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tArtifactPackage)){
			return (ArtifactPackage)SacmBaseEMFTranslater.thrift2EmfMap.get(tArtifactPackage); 
		}
		
		ArtifactPackage eArtifactPackage = EMFFactory.sacmArtifactFactory.createArtifactPackage();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tArtifactPackage, eArtifactPackage);
		transformArtifactPackageContents(TArtifactPackage.wrap(tArtifactPackage), eArtifactPackage);
		
		
		return null;
	}


	private static ArtifactPackage transformArtifactPackageBinding(TDDIArtifactPackageBinding tArtifactPackageBinding) {
		// TODO Auto-generated method stub
		return null;
	}


	private static ArtifactPackage transformArtifactPackageInterface(TDDIArtifactPackageInterface tArtifactPackageInterface) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static void transformArtifactPackageContents(IArtifactPackage tArtifactPackage, ArtifactPackage eArtifactPackage){
		SacmBaseEMFTranslater.transformArtifactElementContents(tArtifactPackage, eArtifactPackage);
		
		
	}

	
	
	
	
	
	
}
