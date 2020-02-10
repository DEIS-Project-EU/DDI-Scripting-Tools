package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import top.architecture.ArchitecturePackage;
import top.argumentation.ArgumentationPackage;
import top.artifact.Artifact_Package;
import top.assuranceCase.AssuranceCase_Package;
import top.base.BasePackage;
import top.dependability.Dependability_Package;
import top.failureLogic.FailureLogic_Package;
import top.integration.DDIPackage;
import top.integration.IntegrationPackage;
import top.odeBase.OdeBasePackage;
import top.terminology.Terminology_Package;

public class EMFSerialization {
	public static void saveEMFModelToFile(String Path, DDIPackage emfDDIPackage) {
		// Register the XMI resource factory for the .ddi extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ddi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(IntegrationPackage.eNS_URI, IntegrationPackage.eINSTANCE);
		resSet.getPackageRegistry().put(OdeBasePackage.eNS_URI, OdeBasePackage.eINSTANCE);
		resSet.getPackageRegistry().put(ArchitecturePackage.eNS_URI, ArchitecturePackage.eINSTANCE);
		resSet.getPackageRegistry().put(FailureLogic_Package.eNS_URI, FailureLogic_Package.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEFTAPackage.eNS_URI, ODEFTAPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEFMEAPackage.eNS_URI, ODEFMEAPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEMarkovPackage.eNS_URI, ODEMarkovPackage.eINSTANCE);
		resSet.getPackageRegistry().put(Dependability_Package.eNS_URI, Dependability_Package.eINSTANCE);
		//resSet.getPackageRegistry().put(ODERequirementsPackage.eNS_URI, ODERequirementsPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEDomainPackage.eNS_URI, ODEDomainPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEHARAPackage.eNS_URI, ODEHARAPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODETARAPackage.eNS_URI, ODETARAPackage.eINSTANCE);
		resSet.getPackageRegistry().put(BasePackage.eNS_URI, BasePackage.eINSTANCE);
		resSet.getPackageRegistry().put(AssuranceCase_Package.eNS_URI, AssuranceCase_Package.eINSTANCE);
		resSet.getPackageRegistry().put(Artifact_Package.eNS_URI, Artifact_Package.eINSTANCE);
		resSet.getPackageRegistry().put(ArgumentationPackage.eNS_URI, ArgumentationPackage.eINSTANCE);
		resSet.getPackageRegistry().put(Terminology_Package.eNS_URI, Terminology_Package.eINSTANCE);
		
		
		// create a resource
		File file = new File(Path);
		URI fileURI = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resSet.createResource(fileURI);
		resource.getContents().add(emfDDIPackage);

		// now save the content.
		try {
		    resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	

	public static DDIPackage loadEMFModelFromFile(String Path) {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(IntegrationPackage.eNS_URI, IntegrationPackage.eINSTANCE);
		resSet.getPackageRegistry().put(OdeBasePackage.eNS_URI, OdeBasePackage.eINSTANCE);
		resSet.getPackageRegistry().put(ArchitecturePackage.eNS_URI, ArchitecturePackage.eINSTANCE);
		resSet.getPackageRegistry().put(FailureLogic_Package.eNS_URI, FailureLogic_Package.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEFTAPackage.eNS_URI, ODEFTAPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEFMEAPackage.eNS_URI, ODEFMEAPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEMarkovPackage.eNS_URI, ODEMarkovPackage.eINSTANCE);
		resSet.getPackageRegistry().put(Dependability_Package.eNS_URI, Dependability_Package.eINSTANCE);
		//resSet.getPackageRegistry().put(ODERequirementsPackage.eNS_URI, ODERequirementsPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEDomainPackage.eNS_URI, ODEDomainPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODEHARAPackage.eNS_URI, ODEHARAPackage.eINSTANCE);
		//resSet.getPackageRegistry().put(ODETARAPackage.eNS_URI, ODETARAPackage.eINSTANCE);
		resSet.getPackageRegistry().put(BasePackage.eNS_URI, BasePackage.eINSTANCE);
		resSet.getPackageRegistry().put(AssuranceCase_Package.eNS_URI, AssuranceCase_Package.eINSTANCE);
		resSet.getPackageRegistry().put(Artifact_Package.eNS_URI, Artifact_Package.eINSTANCE);
		resSet.getPackageRegistry().put(ArgumentationPackage.eNS_URI, ArgumentationPackage.eINSTANCE);
		resSet.getPackageRegistry().put(Terminology_Package.eNS_URI, Terminology_Package.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ddi", new XMIResourceFactoryImpl());
		
		File file = new File(Path);
		URI fileURI = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resSet.createResource(fileURI);
		File source = new File(Path);
		try {
			resource.load( new FileInputStream(source), new HashMap<Object,Object>());
			DDIPackage importedDDIPackage = (DDIPackage)resource.getContents().get(0);
			return importedDDIPackage;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
