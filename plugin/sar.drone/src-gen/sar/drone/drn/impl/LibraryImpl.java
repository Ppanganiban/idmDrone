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

import sar.drone.drn.Device;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Library;
import sar.drone.drn.TypeGeneric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.impl.LibraryImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link sar.drone.drn.impl.LibraryImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends RootImpl implements Library
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LibraryImpl()
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
    return DrnPackage.Literals.LIBRARY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.LIBRARY__NAME, oldName, name));
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
      types = new EObjectContainmentEList<TypeGeneric>(TypeGeneric.class, this, DrnPackage.LIBRARY__TYPES);
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
      devices = new EObjectContainmentEList<Device>(Device.class, this, DrnPackage.LIBRARY__DEVICES);
    }
    return devices;
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
      case DrnPackage.LIBRARY__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case DrnPackage.LIBRARY__DEVICES:
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
      case DrnPackage.LIBRARY__NAME:
        return getName();
      case DrnPackage.LIBRARY__TYPES:
        return getTypes();
      case DrnPackage.LIBRARY__DEVICES:
        return getDevices();
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
      case DrnPackage.LIBRARY__NAME:
        setName((String)newValue);
        return;
      case DrnPackage.LIBRARY__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends TypeGeneric>)newValue);
        return;
      case DrnPackage.LIBRARY__DEVICES:
        getDevices().clear();
        getDevices().addAll((Collection<? extends Device>)newValue);
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
      case DrnPackage.LIBRARY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DrnPackage.LIBRARY__TYPES:
        getTypes().clear();
        return;
      case DrnPackage.LIBRARY__DEVICES:
        getDevices().clear();
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
      case DrnPackage.LIBRARY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DrnPackage.LIBRARY__TYPES:
        return types != null && !types.isEmpty();
      case DrnPackage.LIBRARY__DEVICES:
        return devices != null && !devices.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LibraryImpl