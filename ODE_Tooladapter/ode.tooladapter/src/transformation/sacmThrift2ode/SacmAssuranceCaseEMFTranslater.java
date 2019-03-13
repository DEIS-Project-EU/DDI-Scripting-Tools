package transformation.sacmThrift2ode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sacm.argumentation.typed.TAssuranceCasePackage;
import assuranceCase.AssuranceCasePackage;
import assuranceCase.AssuranceCasePackageBinding;
import assuranceCase.AssuranceCasePackageInterface;
import thriftContract.TDDIAbstractArgumentPackageRef;
import thriftContract.TDDIAbstractArtifactPackageRef;
import thriftContract.TDDIAbstractAssuranceCasePackage;
import thriftContract.TDDIAbstractAssuranceCasePackageRef;
import thriftContract.TDDIAbstractTerminologyPackageRef;
import thriftContract.TDDIAssuranceCasePackage;
import thriftContract.TDDIAssuranceCasePackageBinding;
import thriftContract.TDDIAssuranceCasePackageInterface;
import thriftContract.TDDIAssuranceCasePackageInterfaceRef;
import util.EMFFactory;

public class SacmAssuranceCaseEMFTranslater {

	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(SacmAssuranceCaseEMFTranslater.class);
	
	public static AssuranceCasePackage transformAbstractAssuranceCasePackage(TDDIAbstractAssuranceCasePackage tAbstractAssuranceCasePackage) {
		if (tAbstractAssuranceCasePackage.isSetUsedAssuranceCasePackageType()) {
			switch (tAbstractAssuranceCasePackage.UsedAssuranceCasePackageType) {
				case ACPUTAssuranceCasePackage:
					return transformAssuranceCasePackage(tAbstractAssuranceCasePackage.UsedAssuranceCasePackage.getAssuranceCasePackage());				
				case ACPUTAssuranceCasePackageBinding:
					return transformAssuranceCasePackageBinding(tAbstractAssuranceCasePackage.UsedAssuranceCasePackage.getAssuranceCasePackageBinding());	
				case ACPUTAssuranceCasePackageInterface:
					return transformAssuranceCasePackageInterface(tAbstractAssuranceCasePackage.UsedAssuranceCasePackage.getAssuranceCasePackageInterface());		
			}
		}
		return EMFFactory.sacmAssuranceCaseFactory.createAssuranceCasePackage();
	}
	
	private static AssuranceCasePackageInterface transformAssuranceCasePackageInterface(TDDIAssuranceCasePackageInterface assuranceCasePackageInterface) {
		// TODO
		return EMFFactory.sacmAssuranceCaseFactory.createAssuranceCasePackageInterface();
	}

	private static AssuranceCasePackageBinding transformAssuranceCasePackageBinding(TDDIAssuranceCasePackageBinding assuranceCasePackageBinding) {
		// TODO
		return EMFFactory.sacmAssuranceCaseFactory.createAssuranceCasePackageBinding();
	}

	private static AssuranceCasePackage transformAssuranceCasePackage(TDDIAssuranceCasePackage tElement) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tElement)) {
			return (AssuranceCasePackage) SacmBaseEMFTranslater.thrift2EmfMap.get(tElement);
		}
		
		AssuranceCasePackage emfElement = EMFFactory.sacmAssuranceCaseFactory.createAssuranceCasePackage();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tElement, emfElement);
		SacmBaseEMFTranslater.transformModelElementContents(TAssuranceCasePackage.wrap(tElement), emfElement);
		
		for (TDDIAbstractAssuranceCasePackageRef tSubElement : tElement.getAssuranceCasePackage()) {
			emfElement.getAssuranceCasePackage().add(transformAbstractAssuranceCasePackage(tSubElement.getRef()));
		}
		
		for (TDDIAssuranceCasePackageInterfaceRef tinterface : tElement.getInterface()) {
			//TODO
		}
		
		for (TDDIAbstractArtifactPackageRef tArtifactPackage : tElement.getArtifactPackage()) {
			//TODO
		}			

		for (TDDIAbstractArgumentPackageRef tArgumentPackage : tElement.getArgumentPackage()) {
			emfElement.getArgumentPackage().add(SacmArgumentEMFTranslater.transformAbstractArgumentPackage(tArgumentPackage.ref));
		}
		
		for (TDDIAbstractTerminologyPackageRef tSubElement : tElement.getTerminologyPackage()) {
			//TODO
		}
		
		return emfElement;
	}
}
