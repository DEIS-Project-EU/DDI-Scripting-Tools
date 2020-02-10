package transformation.sacmThrift2ode;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sacm.argumentation.typed.TAssuranceCasePackage;
import thriftContract.TDDIAbstractArgumentPackage;
import thriftContract.TDDIAbstractArtifactPackage;
import thriftContract.TDDIAbstractAssuranceCasePackage;
import thriftContract.TDDIAbstractTerminologyPackage;
import thriftContract.TDDIAssuranceCasePackage;
import thriftContract.TDDIAssuranceCasePackageBinding;
import thriftContract.TDDIAssuranceCasePackageInterface;
import top.assuranceCase.AssuranceCasePackage;
import top.assuranceCase.AssuranceCasePackageBinding;
import top.assuranceCase.AssuranceCasePackageInterface;
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

	private static AssuranceCasePackage transformAssuranceCasePackage(TDDIAssuranceCasePackage tAssuranceCasePackage) {
		if (SacmBaseEMFTranslater.thrift2EmfMap.containsKey(tAssuranceCasePackage)) {
			return (AssuranceCasePackage) SacmBaseEMFTranslater.thrift2EmfMap.get(tAssuranceCasePackage);
		}
		
		AssuranceCasePackage eAssuranceCasePackage = EMFFactory.sacmAssuranceCaseFactory.createAssuranceCasePackage();
		SacmBaseEMFTranslater.thrift2EmfMap.put(tAssuranceCasePackage, eAssuranceCasePackage);
		SacmBaseEMFTranslater.transformModelElementContents(TAssuranceCasePackage.wrap(tAssuranceCasePackage), eAssuranceCasePackage);
		
		
		for (TDDIAbstractAssuranceCasePackage tAbstractAssuranceCasePackage : tAssuranceCasePackage.getAssuranceCasePackage()) {
			eAssuranceCasePackage.getAssuranceCasePackage().add(transformAbstractAssuranceCasePackage(tAbstractAssuranceCasePackage));
		}
		
		for (TDDIAssuranceCasePackageInterface tInterface : tAssuranceCasePackage.getInterface().stream().map(ref -> ref.ref).collect(Collectors.toList())){
			eAssuranceCasePackage.getInterface().add(transformAssuranceCasePackageInterface(tInterface));
		}
		
		for (TDDIAbstractArtifactPackage tAbstractArtifactPackage : tAssuranceCasePackage.getArtifactPackage()) {
			eAssuranceCasePackage.getArtifactPackage().add(SacmArtifactEMFTranslater.transformAbstractArtifactPackage(tAbstractArtifactPackage));
		}			

		for (TDDIAbstractArgumentPackage tAbstractArgumentPackage : tAssuranceCasePackage.getArgumentPackage()) {
			eAssuranceCasePackage.getArgumentPackage().add(SacmArgumentEMFTranslater.transformAbstractArgumentPackage(tAbstractArgumentPackage));
		}
		
		for (TDDIAbstractTerminologyPackage tAbstractTerminologyPackage : tAssuranceCasePackage.getTerminologyPackage()) {
			eAssuranceCasePackage.getTerminologyPackage().add(SacmTerminologyEMFTranslater.transformAbstractTerminologyPackage(tAbstractTerminologyPackage));
		}
		
		return eAssuranceCasePackage;
	}
}
