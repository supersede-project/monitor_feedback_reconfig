/**
 */
package RootElement.util;

import RootElement.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see RootElement.RootElementPackage
 * @generated
 */
public class RootElementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RootElementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementSwitch() {
		if (modelPackage == null) {
			modelPackage = RootElementPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RootElementPackage.AMONITOR: {
				AMonitor aMonitor = (AMonitor)theEObject;
				T result = caseAMonitor(aMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION: {
				AMonitoringSystemConfiguration aMonitoringSystemConfiguration = (AMonitoringSystemConfiguration)theEObject;
				T result = caseAMonitoringSystemConfiguration(aMonitoringSystemConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.SOCIAL_NETWORKS_MONITOR: {
				SocialNetworksMonitor socialNetworksMonitor = (SocialNetworksMonitor)theEObject;
				T result = caseSocialNetworksMonitor(socialNetworksMonitor);
				if (result == null) result = caseAMonitor(socialNetworksMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.MARKET_PLACES_MONITOR: {
				MarketPlacesMonitor marketPlacesMonitor = (MarketPlacesMonitor)theEObject;
				T result = caseMarketPlacesMonitor(marketPlacesMonitor);
				if (result == null) result = caseAMonitor(marketPlacesMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RootElementPackage.MONITORING_SYSTEM_CONFIGURATION: {
				MonitoringSystemConfiguration monitoringSystemConfiguration = (MonitoringSystemConfiguration)theEObject;
				T result = caseMonitoringSystemConfiguration(monitoringSystemConfiguration);
				if (result == null) result = caseAMonitoringSystemConfiguration(monitoringSystemConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMonitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMonitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMonitor(AMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMonitoring System Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMonitoring System Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMonitoringSystemConfiguration(AMonitoringSystemConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Networks Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Networks Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialNetworksMonitor(SocialNetworksMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Places Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Places Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketPlacesMonitor(MarketPlacesMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring System Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring System Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringSystemConfiguration(MonitoringSystemConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RootElementSwitch
