package util;

import top.architecture.ArchitectureFactory;
import top.argumentation.ArgumentationFactory;
import top.artifact.Artifact_Factory;
import top.assuranceCase.AssuranceCase_Factory;
import top.base.BaseFactory;
import top.dependability.Dependability_Factory;
import top.failureLogic.FailureLogic_Factory;
import top.integration.IntegrationFactory;
import top.odeBase.OdeBaseFactory;
import top.terminology.Terminology_Factory;

public class EMFFactory {
	public static final OdeBaseFactory baseFactory = OdeBaseFactory.eINSTANCE;
	public static final IntegrationFactory integrationFactory = IntegrationFactory.eINSTANCE;
	public static final ArchitectureFactory architectureFactory = ArchitectureFactory.eINSTANCE;
	public static final FailureLogic_Factory failureLogicFactory = FailureLogic_Factory.eINSTANCE;
	//public static final ODEFTAFactory ftaFactory = ODEFTAFactory.eINSTANCE;
	//public static final ODEFMEAFactory fmeaFactory = ODEFMEAFactory.eINSTANCE;
	//public static final ODEMarkovFactory markovFactory = ODEMarkovFactory.eINSTANCE;
	public static final Dependability_Factory dependabilityFactory = Dependability_Factory.eINSTANCE;
	//public static final ODEDomainFactory domainFactory = ODEDomainFactory.eINSTANCE;
	//public static final ODETARAFactory taraFactory = ODETARAFactory.eINSTANCE;
	//public static final ODERequirementsFactory requirementsFactory = ODERequirementsFactory.eINSTANCE;
	//public static final ODEHARAFactory haraFactory = ODEHARAFactory.eINSTANCE;
	public static final Artifact_Factory sacmArtifactFactory = Artifact_Factory.eINSTANCE;
	public static final ArgumentationFactory sacmArgumentationFactory = ArgumentationFactory.eINSTANCE;
	public static final Terminology_Factory sacmTerminologyFactory = Terminology_Factory.eINSTANCE;
	public static final AssuranceCase_Factory sacmAssuranceCaseFactory = AssuranceCase_Factory.eINSTANCE;
	public static final BaseFactory sacmBaseFactory = BaseFactory.eINSTANCE;
}
