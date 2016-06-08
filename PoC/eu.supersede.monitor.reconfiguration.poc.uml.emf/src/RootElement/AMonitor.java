/**
 */
package RootElement;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AMonitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.AMonitor#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.AMonitor#getState <em>State</em>}</li>
 *   <li>{@link RootElement.AMonitor#getTimeSlot <em>Time Slot</em>}</li>
 *   <li>{@link RootElement.AMonitor#getKafkaEndpoint <em>Kafka Endpoint</em>}</li>
 *   <li>{@link RootElement.AMonitor#getKafkaTopic <em>Kafka Topic</em>}</li>
 *   <li>{@link RootElement.AMonitor#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see RootElement.RootElementPackage#getAMonitor()
 * @model abstract="true"
 * @generated
 */
public interface AMonitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RootElement.RootElementPackage#getAMonitor_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RootElement.AMonitor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see RootElement.RootElementPackage#getAMonitor_State()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link RootElement.AMonitor#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slot</em>' attribute.
	 * @see #setTimeSlot(int)
	 * @see RootElement.RootElementPackage#getAMonitor_TimeSlot()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getTimeSlot();

	/**
	 * Sets the value of the '{@link RootElement.AMonitor#getTimeSlot <em>Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Slot</em>' attribute.
	 * @see #getTimeSlot()
	 * @generated
	 */
	void setTimeSlot(int value);

	/**
	 * Returns the value of the '<em><b>Kafka Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kafka Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Endpoint</em>' attribute.
	 * @see #setKafkaEndpoint(String)
	 * @see RootElement.RootElementPackage#getAMonitor_KafkaEndpoint()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getKafkaEndpoint();

	/**
	 * Sets the value of the '{@link RootElement.AMonitor#getKafkaEndpoint <em>Kafka Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kafka Endpoint</em>' attribute.
	 * @see #getKafkaEndpoint()
	 * @generated
	 */
	void setKafkaEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Kafka Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kafka Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kafka Topic</em>' attribute.
	 * @see #setKafkaTopic(String)
	 * @see RootElement.RootElementPackage#getAMonitor_KafkaTopic()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getKafkaTopic();

	/**
	 * Sets the value of the '{@link RootElement.AMonitor#getKafkaTopic <em>Kafka Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kafka Topic</em>' attribute.
	 * @see #getKafkaTopic()
	 * @generated
	 */
	void setKafkaTopic(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(Map)
	 * @see RootElement.RootElementPackage#getAMonitor_Parameters()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Map getParameters();

	/**
	 * Sets the value of the '{@link RootElement.AMonitor#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Map value);

} // AMonitor
