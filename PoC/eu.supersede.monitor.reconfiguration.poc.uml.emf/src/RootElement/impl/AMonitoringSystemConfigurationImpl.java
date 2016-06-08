/**
 */
package RootElement.impl;

import RootElement.AMonitor;
import RootElement.AMonitoringSystemConfiguration;
import RootElement.RootElementPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AMonitoring System Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.impl.AMonitoringSystemConfigurationImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link RootElement.impl.AMonitoringSystemConfigurationImpl#getConfigSender <em>Config Sender</em>}</li>
 *   <li>{@link RootElement.impl.AMonitoringSystemConfigurationImpl#getMonConfigProfiles <em>Mon Config Profiles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AMonitoringSystemConfigurationImpl extends MinimalEObjectImpl.Container implements AMonitoringSystemConfiguration {
	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigSender() <em>Config Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigSender()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_SENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigSender() <em>Config Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigSender()
	 * @generated
	 * @ordered
	 */
	protected String configSender = CONFIG_SENDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonConfigProfiles() <em>Mon Config Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonConfigProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<AMonitor> monConfigProfiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AMonitoringSystemConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.AMONITORING_SYSTEM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		Date oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigSender() {
		return configSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigSender(String newConfigSender) {
		String oldConfigSender = configSender;
		configSender = newConfigSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__CONFIG_SENDER, oldConfigSender, configSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AMonitor> getMonConfigProfiles() {
		if (monConfigProfiles == null) {
			monConfigProfiles = new EObjectResolvingEList<AMonitor>(AMonitor.class, this, RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__MON_CONFIG_PROFILES);
		}
		return monConfigProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__TIME_STAMP:
				return getTimeStamp();
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__CONFIG_SENDER:
				return getConfigSender();
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__MON_CONFIG_PROFILES:
				return getMonConfigProfiles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__TIME_STAMP:
				setTimeStamp((Date)newValue);
				return;
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__CONFIG_SENDER:
				setConfigSender((String)newValue);
				return;
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__MON_CONFIG_PROFILES:
				getMonConfigProfiles().clear();
				getMonConfigProfiles().addAll((Collection<? extends AMonitor>)newValue);
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
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__CONFIG_SENDER:
				setConfigSender(CONFIG_SENDER_EDEFAULT);
				return;
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__MON_CONFIG_PROFILES:
				getMonConfigProfiles().clear();
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
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__CONFIG_SENDER:
				return CONFIG_SENDER_EDEFAULT == null ? configSender != null : !CONFIG_SENDER_EDEFAULT.equals(configSender);
			case RootElementPackage.AMONITORING_SYSTEM_CONFIGURATION__MON_CONFIG_PROFILES:
				return monConfigProfiles != null && !monConfigProfiles.isEmpty();
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
		result.append(" (timeStamp: ");
		result.append(timeStamp);
		result.append(", configSender: ");
		result.append(configSender);
		result.append(')');
		return result.toString();
	}

} //AMonitoringSystemConfigurationImpl
