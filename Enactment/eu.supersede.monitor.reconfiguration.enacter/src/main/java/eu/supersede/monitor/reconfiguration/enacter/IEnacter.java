package eu.supersede.monitor.reconfiguration.enacter;

public interface IEnacter {

	public void applyAddEnactment(String absoluteSourcePath, String sourceModel, String absoluteTarget) throws Exception;
	
	public void applyDeleteEnactment(String absoluteSourcePath, String sourceModel, String absoluteTarget) throws Exception;
	
	public void applyUpdateEnactment(String absoluteSourcePath, String sourceModel, String absoluteTargetFolderPath) throws Exception;
	
}
