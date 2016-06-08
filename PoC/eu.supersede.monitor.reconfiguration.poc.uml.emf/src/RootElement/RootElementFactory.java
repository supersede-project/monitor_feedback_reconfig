/**
 */
package RootElement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.RootElementPackage
 * @generated
 */
public interface RootElementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootElementFactory eINSTANCE = RootElement.impl.RootElementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AMonitoring System Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AMonitoring System Configuration</em>'.
	 * @generated
	 */
	AMonitoringSystemConfiguration createAMonitoringSystemConfiguration();

	/**
	 * Returns a new object of class '<em>Social Networks Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Networks Monitor</em>'.
	 * @generated
	 */
	SocialNetworksMonitor createSocialNetworksMonitor();

	/**
	 * Returns a new object of class '<em>Market Places Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Market Places Monitor</em>'.
	 * @generated
	 */
	MarketPlacesMonitor createMarketPlacesMonitor();

	/**
	 * Returns a new object of class '<em>Monitoring System Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitoring System Configuration</em>'.
	 * @generated
	 */
	MonitoringSystemConfiguration createMonitoringSystemConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RootElementPackage getRootElementPackage();

} //RootElementFactory
