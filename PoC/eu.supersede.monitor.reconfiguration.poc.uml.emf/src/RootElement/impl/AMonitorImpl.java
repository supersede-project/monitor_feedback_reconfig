/**
 */
package RootElement.impl;

import RootElement.AMonitor;
import RootElement.RootElementPackage;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AMonitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.AMonitorImpl#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.impl.AMonitorImpl#getState <em>State</em>}</li>
 *   <li>{@link RootElement.impl.AMonitorImpl#getTimeSlot <em>Time Slot</em>}</li>
 *   <li>{@link RootElement.impl.AMonitorImpl#getKafkaEndpoint <em>Kafka Endpoint</em>}</li>
 *   <li>{@link RootElement.impl.AMonitorImpl#getKafkaTopic <em>Kafka Topic</em>}</li>
 *   <li>{@link RootElement.impl.AMonitorImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AMonitorImpl extends MinimalEObjectImpl.Container implements AMonitor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeSlot() <em>Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_SLOT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeSlot() <em>Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected int timeSlot = TIME_SLOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKafkaEndpoint() <em>Kafka Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String KAFKA_ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKafkaEndpoint() <em>Kafka Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String kafkaEndpoint = KAFKA_ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKafkaTopic() <em>Kafka Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String KAFKA_TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKafkaTopic() <em>Kafka Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKafkaTopic()
	 * @generated
	 * @ordered
	 */
	protected String kafkaTopic = KAFKA_TOPIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected Map parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AMonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.AMONITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.AMONITOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.AMONITOR__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeSlot() {
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSlot(int newTimeSlot) {
		int oldTimeSlot = timeSlot;
		timeSlot = newTimeSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.AMONITOR__TIME_SLOT, oldTimeSlot, timeSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKafkaEndpoint() {
		return kafkaEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKafkaEndpoint(String newKafkaEndpoint) {
		String oldKafkaEndpoint = kafkaEndpoint;
		kafkaEndpoint = newKafkaEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.AMONITOR__KAFKA_ENDPOINT, oldKafkaEndpoint, kafkaEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKafkaTopic() {
		return kafkaTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKafkaTopic(String newKafkaTopic) {
		String oldKafkaTopic = kafkaTopic;
		kafkaTopic = newKafkaTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.AMONITOR__KAFKA_TOPIC, oldKafkaTopic, kafkaTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(Map newParameters) {
		Map oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.AMONITOR__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.AMONITOR__NAME:
				return getName();
			case RootElementPackage.AMONITOR__STATE:
				return getState();
			case RootElementPackage.AMONITOR__TIME_SLOT:
				return getTimeSlot();
			case RootElementPackage.AMONITOR__KAFKA_ENDPOINT:
				return getKafkaEndpoint();
			case RootElementPackage.AMONITOR__KAFKA_TOPIC:
				return getKafkaTopic();
			case RootElementPackage.AMONITOR__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RootElementPackage.AMONITOR__NAME:
				setName((String)newValue);
				return;
			case RootElementPackage.AMONITOR__STATE:
				setState((String)newValue);
				return;
			case RootElementPackage.AMONITOR__TIME_SLOT:
				setTimeSlot((Integer)newValue);
				return;
			case RootElementPackage.AMONITOR__KAFKA_ENDPOINT:
				setKafkaEndpoint((String)newValue);
				return;
			case RootElementPackage.AMONITOR__KAFKA_TOPIC:
				setKafkaTopic((String)newValue);
				return;
			case RootElementPackage.AMONITOR__PARAMETERS:
				setParameters((Map)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RootElementPackage.AMONITOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RootElementPackage.AMONITOR__STATE:
				setState(STATE_EDEFAULT);
				return;
			case RootElementPackage.AMONITOR__TIME_SLOT:
				setTimeSlot(TIME_SLOT_EDEFAULT);
				return;
			case RootElementPackage.AMONITOR__KAFKA_ENDPOINT:
				setKafkaEndpoint(KAFKA_ENDPOINT_EDEFAULT);
				return;
			case RootElementPackage.AMONITOR__KAFKA_TOPIC:
				setKafkaTopic(KAFKA_TOPIC_EDEFAULT);
				return;
			case RootElementPackage.AMONITOR__PARAMETERS:
				setParameters((Map)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RootElementPackage.AMONITOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RootElementPackage.AMONITOR__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case RootElementPackage.AMONITOR__TIME_SLOT:
				return timeSlot != TIME_SLOT_EDEFAULT;
			case RootElementPackage.AMONITOR__KAFKA_ENDPOINT:
				return KAFKA_ENDPOINT_EDEFAULT == null ? kafkaEndpoint != null : !KAFKA_ENDPOINT_EDEFAULT.equals(kafkaEndpoint);
			case RootElementPackage.AMONITOR__KAFKA_TOPIC:
				return KAFKA_TOPIC_EDEFAULT == null ? kafkaTopic != null : !KAFKA_TOPIC_EDEFAULT.equals(kafkaTopic);
			case RootElementPackage.AMONITOR__PARAMETERS:
				return parameters != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", state: ");
		result.append(state);
		result.append(", timeSlot: ");
		result.append(timeSlot);
		result.append(", kafkaEndpoint: ");
		result.append(kafkaEndpoint);
		result.append(", kafkaTopic: ");
		result.append(kafkaTopic);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(')');
		return result.toString();
	}

} //AMonitorImpl
