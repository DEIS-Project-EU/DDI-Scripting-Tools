package util;

import architecture.Architecture_Factory;
import odeBase.OdeBaseFactory;
import dependability.Dependability_Factory;
import failureLogic.FailureLogic_Factory;
import integration.Integration_Factory;
import argumentation.Argumentation_Factory;
import artifact.Artifact_Factory;
import assuranceCase.AssuranceCase_Factory;
import base.Base_Factory;
import terminology.Terminology_Factory;

public class EMFFactory {
	public static final OdeBaseFactory baseFactory = OdeBaseFactory.eINSTANCE;
	public static final Integration_Factory integrationFactory = Integration_Factory.eINSTANCE;
	public static final Architecture_Factory architectureFactory = Architecture_Factory.eINSTANCE;
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
	public static final Argumentation_Factory sacmArgumentationFactory = Argumentation_Factory.eINSTANCE;
	public static final Terminology_Factory sacmTerminologyFactory = Terminology_Factory.eINSTANCE;
	public static final AssuranceCase_Factory sacmAssuranceCaseFactory = AssuranceCase_Factory.eINSTANCE;
	public static final Base_Factory sacmBaseFactory = Base_Factory.eINSTANCE;
}
