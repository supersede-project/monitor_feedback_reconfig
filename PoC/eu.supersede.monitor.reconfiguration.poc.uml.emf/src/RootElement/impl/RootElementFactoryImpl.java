/**
 */
package RootElement.impl;

import RootElement.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootElementFactoryImpl extends EFactoryImpl implements RootElementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RootElementFactory init() {
		try {
			RootElementFactory theRootElementFactory = (RootElementFactory)EPackage.Registry.INSTANCE.getEFactory(RootElementPackage.eNS_URI);
			if (theRootElementFactory != null) {
				return theRootElementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RootElementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION: return createAMonitoringSystemConfiguration();
			case RootElementPackage.SOCIAL_NETWORKS_MONITOR: return createSocialNetworksMonitor();
			case RootElementPackage.MARKET_PLACES_MONITOR: return createMarketPlacesMonitor();
			case RootElementPackage.MONITORING_SYSTEM_CONFIGURATION: return createMonitoringSystemConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMonitoringSystemConfiguration createAMonitoringSystemConfiguration() {
		AMonitoringSystemConfigurationImpl aMonitoringSystemConfiguration = new AMonitoringSystemConfigurationImpl();
		return aMonitoringSystemConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworksMonitor createSocialNetworksMonitor() {
		SocialNetworksMonitorImpl socialNetworksMonitor = new SocialNetworksMonitorImpl();
		return socialNetworksMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketPlacesMonitor createMarketPlacesMonitor() {
		MarketPlacesMonitorImpl marketPlacesMonitor = new MarketPlacesMonitorImpl();
		return marketPlacesMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringSystemConfiguration createMonitoringSystemConfiguration() {
		MonitoringSystemConfigurationImpl monitoringSystemConfiguration = new MonitoringSystemConfigurationImpl();
		return monitoringSystemConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementPackage getRootElementPackage() {
		return (RootElementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RootElementPackage getPackage() {
		return RootElementPackage.eINSTANCE;
	}

} //RootElementFactoryImpl
