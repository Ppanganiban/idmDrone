/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sar.drone.drn.Configuration;
import sar.drone.drn.ConnectionType;
import sar.drone.drn.Device;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.TypeGeneric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.impl.ConfigurationImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link sar.drone.drn.impl.ConfigurationImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link sar.drone.drn.impl.ConfigurationImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link sar.drone.drn.impl.ConfigurationImpl#getIp <em>Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends RootImpl implements Configuration
{
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
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<TypeGeneric> types;

  /**
   * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevices()
   * @generated
   * @ordered
   */
  protected EList<Device> devices;

  /**
   * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected static final ConnectionType CONNECTION_EDEFAULT = ConnectionType.BLUETOOTH;

  /**
   * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected ConnectionType connection = CONNECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected static final String IP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected String ip = IP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DrnPackage.Literals.CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.CONFIGURATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeGeneric> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<TypeGeneric>(TypeGeneric.class, this, DrnPackage.CONFIGURATION__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Device> getDevices()
  {
    if (devices == null)
    {
      devices = new EObjectContainmentEList<Device>(Device.class, this, DrnPackage.CONFIGURATION__DEVICES);
    }
    return devices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionType getConnection()
  {
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnection(ConnectionType newConnection)
  {
    ConnectionType oldConnection = connection;
    connection = newConnection == null ? CONNECTION_EDEFAULT : newConnection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.CONFIGURATION__CONNECTION, oldConnection, connection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIp()
  {
    return ip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIp(String newIp)
  {
    String oldIp = ip;
    ip = newIp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.CONFIGURATION__IP, oldIp, ip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DrnPackage.CONFIGURATION__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case DrnPackage.CONFIGURATION__DEVICES:
        return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DrnPackage.CONFIGURATION__NAME:
        return getName();
      case DrnPackage.CONFIGURATION__TYPES:
        return getTypes();
      case DrnPackage.CONFIGURATION__DEVICES:
        return getDevices();
      case DrnPackage.CONFIGURATION__CONNECTION:
        return getConnection();
      case DrnPackage.CONFIGURATION__IP:
        return getIp();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DrnPackage.CONFIGURATION__NAME:
        setName((String)newValue);
        return;
      case DrnPackage.CONFIGURATION__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends TypeGeneric>)newValue);
        return;
      case DrnPackage.CONFIGURATION__DEVICES:
        getDevices().clear();
        getDevices().addAll((Collection<? extends Device>)newValue);
        return;
      case DrnPackage.CONFIGURATION__CONNECTION:
        setConnection((ConnectionType)newValue);
        return;
      case DrnPackage.CONFIGURATION__IP:
        setIp((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DrnPackage.CONFIGURATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DrnPackage.CONFIGURATION__TYPES:
        getTypes().clear();
        return;
      case DrnPackage.CONFIGURATION__DEVICES:
        getDevices().clear();
        return;
      case DrnPackage.CONFIGURATION__CONNECTION:
        setConnection(CONNECTION_EDEFAULT);
        return;
      case DrnPackage.CONFIGURATION__IP:
        setIp(IP_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DrnPackage.CONFIGURATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DrnPackage.CONFIGURATION__TYPES:
        return types != null && !types.isEmpty();
      case DrnPackage.CONFIGURATION__DEVICES:
        return devices != null && !devices.isEmpty();
      case DrnPackage.CONFIGURATION__CONNECTION:
        return connection != CONNECTION_EDEFAULT;
      case DrnPackage.CONFIGURATION__IP:
        return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer();
    result.append("<config name="+name+">");
    result.append("<connection>"+connection+"</connection>");
    result.append("<ip>"+ip+"</ip>");
    result.append("</config>");
    return result.toString();
  }

} //ConfigurationImpl
