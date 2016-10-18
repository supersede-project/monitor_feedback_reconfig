package eu.supersede.monitor.reconfiguration.adapter;

import org.eclipse.uml2.uml.Model;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import cz.zcu.yafmt.model.fm.FeatureModel;
import eu.supersede.dynadapt.dsl.aspect.Aspect;

public interface IAdapter {

	public void adapt(FeatureModel variability, Aspect adaptationModel, Model baseModel) throws Exception;
	
}
