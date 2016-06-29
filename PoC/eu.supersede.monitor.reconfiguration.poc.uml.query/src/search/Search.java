package search;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import queries.ClassGeneralizationsMatch;
import queries.ClassGeneralizationsMatcher;
import queries.ClassesMatch;
import queries.ClassesMatcher;
import queries.InstancesMatch;
import queries.InstancesMatcher;
import queries.Monitoring_reconfiguration_queries;
import queries.MonitorsMatch;
import queries.MonitorsMatcher;
import queries.RealizationsMatch;
import queries.RealizationsMatcher;

public class Search {

	private static ResourceSet resourceSet = new ResourceSetImpl();
	private ViatraQueryEngine engine;
	private Monitoring_reconfiguration_queries queries = null;
	static {
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
	}
	
	public Search(String modelPath) throws ViatraQueryException{
		queries = Monitoring_reconfiguration_queries.instance();
		Resource modelResource = resourceSet.getResource(URI.createURI(modelPath), true);
		EMFScope scope = new EMFScope (modelResource);
		engine = AdvancedViatraQueryEngine.createUnmanagedEngine(scope);
	}
	
	public void searchClasses () throws ViatraQueryException{
		//Searching classes
		ClassesMatcher matcher = queries.getClasses(engine);
		Collection<ClassesMatch> matches = matcher.getAllMatches();
		System.out.println("Classes: " + matches);
	}
		
	public void searchClassesGeneralizations () throws ViatraQueryException{
		//Searching classes generalizations
		ClassGeneralizationsMatcher matcher = queries.getClassGeneralizations(engine);
		Collection<ClassGeneralizationsMatch> matches = matcher.getAllMatches();
		System.out.println("Classes Generalizations: " + matches);
	}
	
	public void searchClassesInstances () throws ViatraQueryException{
		//Searching classes realizations
		InstancesMatcher matcher = queries.getInstances(engine);
		Collection<InstancesMatch> matches = matcher.getAllMatches();
		System.out.println("Classes Instances: " + matches);
	}
	
	public void searchClassesRealizations () throws ViatraQueryException{
		//Searching classes realizations
		RealizationsMatcher matcher = queries.getRealizations(engine);
		Collection<RealizationsMatch> matches = matcher.getAllMatches();
		System.out.println("Classes Realizations: " + matches);
	}
	
	public void searchMonitors () throws ViatraQueryException{
		//Searching classes realizations
		MonitorsMatcher matcher = queries.getMonitors(engine);
		Collection<MonitorsMatch> matches = matcher.getAllMatches();
		System.out.println("Monitors: " + matches);
	}
	
	public static void main(String[] args) throws ViatraQueryException {
		String modelPath = "file://home/edith/git/eu.supersede.monitor.reconfiguration.poc.uml.papyrus/ClassDiagrams/MonitoringSystemBaseModel.uml";
		Search s = new Search(modelPath);
		s.searchMonitors();
	}

}
