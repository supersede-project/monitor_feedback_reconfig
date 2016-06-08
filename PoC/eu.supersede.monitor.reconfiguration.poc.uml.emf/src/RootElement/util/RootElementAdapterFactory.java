/**
 */
package RootElement.util;

import RootElement.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.RootElementPackage
 * @generated
 */
public class RootElementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RootElementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RootElementPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootElementSwitch<Adapter> modelSwitch =
		new RootElementSwitch<Adapter>() {
			@Override
			public Adapter caseAMonitor(AMonitor object) {
				return createAMonitorAdapter();
			}
			@Override
			public Adapter caseAMonitoringSystemConfiguration(AMonitoringSystemConfiguration object) {
				return createAMonitoringSystemConfigurationAdapter();
			}
			@Override
			public Adapter caseSocialNetworksMonitor(SocialNetworksMonitor object) {
				return createSocialNetworksMonitorAdapter();
			}
			@Override
			public Adapter caseMarketPlacesMonitor(MarketPlacesMonitor object) {
				return createMarketPlacesMonitorAdapter();
			}
			@Override
			public Adapter caseMonitoringSystemConfiguration(MonitoringSystemConfiguration object) {
				return createMonitoringSystemConfigurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link RootElement.AMonitor <em>AMonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.AMonitor
	 * @generated
	 */
	public Adapter createAMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.AMonitoringSystemConfiguration <em>AMonitoring System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.AMonitoringSystemConfiguration
	 * @generated
	 */
	public Adapter createAMonitoringSystemConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.SocialNetworksMonitor <em>Social Networks Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.SocialNetworksMonitor
	 * @generated
	 */
	public Adapter createSocialNetworksMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.MarketPlacesMonitor <em>Market Places Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.MarketPlacesMonitor
	 * @generated
	 */
	public Adapter createMarketPlacesMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.MonitoringSystemConfiguration <em>Monitoring System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.MonitoringSystemConfiguration
	 * @generated
	 */
	public Adapter createMonitoringSystemConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RootElementAdapterFactory
