package eu.supersede.monitor.reconfiguration.enact.emfjson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emfjson.jackson.resource.JsonResourceFactory;

import RootElement.impl.RootElementPackageImpl;

public class EmfJsonExample {

	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new JsonResourceFactory());
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		
		//Initialize the meta-model
		EPackage e = RootElementPackageImpl.init();
		
		//Create some instances
		EObject monitoringConfig = EcoreUtil.create(((RootElementPackageImpl) e).getMonitoringSystemConfiguration());	
		EObject twitterMonitor = EcoreUtil.create(((RootElementPackageImpl) e).getSocialNetworksMonitor());
		twitterMonitor.eSet(((RootElementPackageImpl) e).getAMonitor_Name(), "twitterMonitoring");
		
		EObject marketPlacesMonitor = EcoreUtil.create(((RootElementPackageImpl) e).getMarketPlacesMonitor());
		marketPlacesMonitor.eSet(((RootElementPackageImpl) e).getAMonitor_Name(), "marketPlacesMonitoring");
		
		//Relate monitors to a configuration
		List c = new ArrayList<Object>();
		c.add(twitterMonitor);
		c.add(marketPlacesMonitor);
		monitoringConfig.eSet(((RootElementPackageImpl) e).getAMonitoringSystemConfiguration_MonConfigProfiles(), c);
		
		//Add instances to a model
		Resource resource = resourceSet.createResource(URI.createURI("data.json"));
		resource.getContents().add(monitoringConfig);
		resource.getContents().add(twitterMonitor);
		resource.getContents().add(marketPlacesMonitor);
		
		try {
			//Save and print the model
			resource.save(System.out, null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
