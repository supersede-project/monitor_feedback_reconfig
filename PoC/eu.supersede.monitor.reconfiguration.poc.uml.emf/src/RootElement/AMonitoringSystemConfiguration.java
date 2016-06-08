/**
 */
package RootElement;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AMonitoring System Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.AMonitoringSystemConfiguration#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link RootElement.AMonitoringSystemConfiguration#getConfigSender <em>Config Sender</em>}</li>
 *   <li>{@link RootElement.AMonitoringSystemConfiguration#getMonConfigProfiles <em>Mon Config Profiles</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getAMonitoringSystemConfiguration()
 * @model
 * @generated
 */
public interface AMonitoringSystemConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see RootElement.RootElementPackage#getAMonitoringSystemConfiguration_TimeStamp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link RootElement.AMonitoringSystemConfiguration#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Config Sender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Sender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Sender</em>' attribute.
	 * @see #setConfigSender(String)
	 * @see RootElement.RootElementPackage#getAMonitoringSystemConfiguration_ConfigSender()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getConfigSender();

	/**
	 * Sets the value of the '{@link RootElement.AMonitoringSystemConfiguration#getConfigSender <em>Config Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Sender</em>' attribute.
	 * @see #getConfigSender()
	 * @generated
	 */
	void setConfigSender(String value);

	/**
	 * Returns the value of the '<em><b>Mon Config Profiles</b></em>' reference list.
	 * The list contents are of type {@link RootElement.AMonitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mon Config Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mon Config Profiles</em>' reference list.
	 * @see RootElement.RootElementPackage#getAMonitoringSystemConfiguration_MonConfigProfiles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AMonitor> getMonConfigProfiles();

} // AMonitoringSystemConfiguration
