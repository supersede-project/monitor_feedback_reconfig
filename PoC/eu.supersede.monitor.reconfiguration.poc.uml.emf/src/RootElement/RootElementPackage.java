/**
 */
package RootElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RootElement.RootElementFactory
 * @model kind="package"
 * @generated
 */
public interface RootElementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RootElement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootElementPackage eINSTANCE = RootElement.impl.RootElementPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.impl.AMonitorImpl <em>AMonitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.AMonitorImpl
	 * @see RootElement.impl.RootElementPackageImpl#getAMonitor()
	 * @generated
	 */
	int AMONITOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITOR__STATE = 1;

	/**
	 * The feature id for the '<em><b>Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITOR__TIME_SLOT = 2;

	/**
	 * The feature id for the '<em><b>Kafka Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITOR__KAFKA_ENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>Kafka Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITOR__KAFKA_TOPIC = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITOR__PARAMETERS = 5;

	/**
	 * The number of structural features of the '<em>AMonitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>AMonitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.AMonitoringSystemConfigurationImpl <em>AMonitoring System Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.AMonitoringSystemConfigurationImpl
	 * @see RootElement.impl.RootElementPackageImpl#getAMonitoringSystemConfiguration()
	 * @generated
	 */
	int AMONITORING_SYSTEM_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITORING_SYSTEM_CONFIGURATION__TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Config Sender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITORING_SYSTEM_CONFIGURATION__CONFIG_SENDER = 1;

	/**
	 * The feature id for the '<em><b>Mon Config Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITORING_SYSTEM_CONFIGURATION__MON_CONFIG_PROFILES = 2;

	/**
	 * The number of structural features of the '<em>AMonitoring System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITORING_SYSTEM_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>AMonitoring System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMONITORING_SYSTEM_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.SocialNetworksMonitorImpl <em>Social Networks Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.SocialNetworksMonitorImpl
	 * @see RootElement.impl.RootElementPackageImpl#getSocialNetworksMonitor()
	 * @generated
	 */
	int SOCIAL_NETWORKS_MONITOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORKS_MONITOR__NAME = AMONITOR__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORKS_MONITOR__STATE = AMONITOR__STATE;

	/**
	 * The feature id for the '<em><b>Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORKS_MONITOR__TIME_SLOT = AMONITOR__TIME_SLOT;

	/**
	 * The feature id for the '<em><b>Kafka Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORKS_MONITOR__KAFKA_ENDPOINT = AMONITOR__KAFKA_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Kafka Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORKS_MONITOR__KAFKA_TOPIC = AMONITOR__KAFKA_TOPIC;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORKS_MONITOR__PARAMETERS = AMONITOR__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Social Networks Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORKS_MONITOR_FEATURE_COUNT = AMONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Social Networks Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_NETWORKS_MONITOR_OPERATION_COUNT = AMONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.MarketPlacesMonitorImpl <em>Market Places Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.MarketPlacesMonitorImpl
	 * @see RootElement.impl.RootElementPackageImpl#getMarketPlacesMonitor()
	 * @generated
	 */
	int MARKET_PLACES_MONITOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACES_MONITOR__NAME = AMONITOR__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACES_MONITOR__STATE = AMONITOR__STATE;

	/**
	 * The feature id for the '<em><b>Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACES_MONITOR__TIME_SLOT = AMONITOR__TIME_SLOT;

	/**
	 * The feature id for the '<em><b>Kafka Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACES_MONITOR__KAFKA_ENDPOINT = AMONITOR__KAFKA_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Kafka Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACES_MONITOR__KAFKA_TOPIC = AMONITOR__KAFKA_TOPIC;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACES_MONITOR__PARAMETERS = AMONITOR__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Market Places Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACES_MONITOR_FEATURE_COUNT = AMONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Market Places Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACES_MONITOR_OPERATION_COUNT = AMONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.impl.MonitoringSystemConfigurationImpl <em>Monitoring System Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.impl.MonitoringSystemConfigurationImpl
	 * @see RootElement.impl.RootElementPackageImpl#getMonitoringSystemConfiguration()
	 * @generated
	 */
	int MONITORING_SYSTEM_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SYSTEM_CONFIGURATION__TIME_STAMP = AMONITORING_SYSTEM_CONFIGURATION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Config Sender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SYSTEM_CONFIGURATION__CONFIG_SENDER = AMONITORING_SYSTEM_CONFIGURATION__CONFIG_SENDER;

	/**
	 * The feature id for the '<em><b>Mon Config Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SYSTEM_CONFIGURATION__MON_CONFIG_PROFILES = AMONITORING_SYSTEM_CONFIGURATION__MON_CONFIG_PROFILES;

	/**
	 * The number of structural features of the '<em>Monitoring System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SYSTEM_CONFIGURATION_FEATURE_COUNT = AMONITORING_SYSTEM_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Monitoring System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SYSTEM_CONFIGURATION_OPERATION_COUNT = AMONITORING_SYSTEM_CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link RootElement.AMonitor <em>AMonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMonitor</em>'.
	 * @see RootElement.AMonitor
	 * @generated
	 */
	EClass getAMonitor();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.AMonitor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RootElement.AMonitor#getName()
	 * @see #getAMonitor()
	 * @generated
	 */
	EAttribute getAMonitor_Name();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.AMonitor#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see RootElement.AMonitor#getState()
	 * @see #getAMonitor()
	 * @generated
	 */
	EAttribute getAMonitor_State();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.AMonitor#getTimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Slot</em>'.
	 * @see RootElement.AMonitor#getTimeSlot()
	 * @see #getAMonitor()
	 * @generated
	 */
	EAttribute getAMonitor_TimeSlot();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.AMonitor#getKafkaEndpoint <em>Kafka Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kafka Endpoint</em>'.
	 * @see RootElement.AMonitor#getKafkaEndpoint()
	 * @see #getAMonitor()
	 * @generated
	 */
	EAttribute getAMonitor_KafkaEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.AMonitor#getKafkaTopic <em>Kafka Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kafka Topic</em>'.
	 * @see RootElement.AMonitor#getKafkaTopic()
	 * @see #getAMonitor()
	 * @generated
	 */
	EAttribute getAMonitor_KafkaTopic();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.AMonitor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see RootElement.AMonitor#getParameters()
	 * @see #getAMonitor()
	 * @generated
	 */
	EAttribute getAMonitor_Parameters();

	/**
	 * Returns the meta object for class '{@link RootElement.AMonitoringSystemConfiguration <em>AMonitoring System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMonitoring System Configuration</em>'.
	 * @see RootElement.AMonitoringSystemConfiguration
	 * @generated
	 */
	EClass getAMonitoringSystemConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.AMonitoringSystemConfiguration#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see RootElement.AMonitoringSystemConfiguration#getTimeStamp()
	 * @see #getAMonitoringSystemConfiguration()
	 * @generated
	 */
	EAttribute getAMonitoringSystemConfiguration_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.AMonitoringSystemConfiguration#getConfigSender <em>Config Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Sender</em>'.
	 * @see RootElement.AMonitoringSystemConfiguration#getConfigSender()
	 * @see #getAMonitoringSystemConfiguration()
	 * @generated
	 */
	EAttribute getAMonitoringSystemConfiguration_ConfigSender();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.AMonitoringSystemConfiguration#getMonConfigProfiles <em>Mon Config Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mon Config Profiles</em>'.
	 * @see RootElement.AMonitoringSystemConfiguration#getMonConfigProfiles()
	 * @see #getAMonitoringSystemConfiguration()
	 * @generated
	 */
	EReference getAMonitoringSystemConfiguration_MonConfigProfiles();

	/**
	 * Returns the meta object for class '{@link RootElement.SocialNetworksMonitor <em>Social Networks Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Networks Monitor</em>'.
	 * @see RootElement.SocialNetworksMonitor
	 * @generated
	 */
	EClass getSocialNetworksMonitor();

	/**
	 * Returns the meta object for class '{@link RootElement.MarketPlacesMonitor <em>Market Places Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Places Monitor</em>'.
	 * @see RootElement.MarketPlacesMonitor
	 * @generated
	 */
	EClass getMarketPlacesMonitor();

	/**
	 * Returns the meta object for class '{@link RootElement.MonitoringSystemConfiguration <em>Monitoring System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring System Configuration</em>'.
	 * @see RootElement.MonitoringSystemConfiguration
	 * @generated
	 */
	EClass getMonitoringSystemConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RootElementFactory getRootElementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RootElement.impl.AMonitorImpl <em>AMonitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.AMonitorImpl
		 * @see RootElement.impl.RootElementPackageImpl#getAMonitor()
		 * @generated
		 */
		EClass AMONITOR = eINSTANCE.getAMonitor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMONITOR__NAME = eINSTANCE.getAMonitor_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMONITOR__STATE = eINSTANCE.getAMonitor_State();

		/**
		 * The meta object literal for the '<em><b>Time Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMONITOR__TIME_SLOT = eINSTANCE.getAMonitor_TimeSlot();

		/**
		 * The meta object literal for the '<em><b>Kafka Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMONITOR__KAFKA_ENDPOINT = eINSTANCE.getAMonitor_KafkaEndpoint();

		/**
		 * The meta object literal for the '<em><b>Kafka Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMONITOR__KAFKA_TOPIC = eINSTANCE.getAMonitor_KafkaTopic();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMONITOR__PARAMETERS = eINSTANCE.getAMonitor_Parameters();

		/**
		 * The meta object literal for the '{@link RootElement.impl.AMonitoringSystemConfigurationImpl <em>AMonitoring System Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.AMonitoringSystemConfigurationImpl
		 * @see RootElement.impl.RootElementPackageImpl#getAMonitoringSystemConfiguration()
		 * @generated
		 */
		EClass AMONITORING_SYSTEM_CONFIGURATION = eINSTANCE.getAMonitoringSystemConfiguration();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMONITORING_SYSTEM_CONFIGURATION__TIME_STAMP = eINSTANCE.getAMonitoringSystemConfiguration_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Config Sender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMONITORING_SYSTEM_CONFIGURATION__CONFIG_SENDER = eINSTANCE.getAMonitoringSystemConfiguration_ConfigSender();

		/**
		 * The meta object literal for the '<em><b>Mon Config Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMONITORING_SYSTEM_CONFIGURATION__MON_CONFIG_PROFILES = eINSTANCE.getAMonitoringSystemConfiguration_MonConfigProfiles();

		/**
		 * The meta object literal for the '{@link RootElement.impl.SocialNetworksMonitorImpl <em>Social Networks Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.SocialNetworksMonitorImpl
		 * @see RootElement.impl.RootElementPackageImpl#getSocialNetworksMonitor()
		 * @generated
		 */
		EClass SOCIAL_NETWORKS_MONITOR = eINSTANCE.getSocialNetworksMonitor();

		/**
		 * The meta object literal for the '{@link RootElement.impl.MarketPlacesMonitorImpl <em>Market Places Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.MarketPlacesMonitorImpl
		 * @see RootElement.impl.RootElementPackageImpl#getMarketPlacesMonitor()
		 * @generated
		 */
		EClass MARKET_PLACES_MONITOR = eINSTANCE.getMarketPlacesMonitor();

		/**
		 * The meta object literal for the '{@link RootElement.impl.MonitoringSystemConfigurationImpl <em>Monitoring System Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.impl.MonitoringSystemConfigurationImpl
		 * @see RootElement.impl.RootElementPackageImpl#getMonitoringSystemConfiguration()
		 * @generated
		 */
		EClass MONITORING_SYSTEM_CONFIGURATION = eINSTANCE.getMonitoringSystemConfiguration();

	}

} //RootElementPackage
