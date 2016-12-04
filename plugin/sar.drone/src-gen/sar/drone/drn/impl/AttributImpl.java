/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sar.drone.drn.Attribut;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Element;
import sar.drone.drn.TypeGeneric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.AttributImpl#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AttributImpl#getType <em>Type</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AttributImpl#getElmt <em>Elmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributImpl extends MinimalEObjectImpl.Container implements Attribut
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeGeneric type;

  /**
   * The cached value of the '{@link #getElmt() <em>Elmt</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElmt()
   * @generated
   * @ordered
   */
  protected EList<Element> elmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributImpl()
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
    return DrnPackage.Literals.ATTRIBUT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.ATTRIBUT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeGeneric getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (TypeGeneric)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DrnPackage.ATTRIBUT__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeGeneric basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeGeneric newType)
  {
    TypeGeneric oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.ATTRIBUT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getElmt()
  {
    if (elmt == null)
    {
      elmt = new EObjectResolvingEList<Element>(Element.class, this, DrnPackage.ATTRIBUT__ELMT);
    }
    return elmt;
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
      case DrnPackage.ATTRIBUT__NAME:
        return getName();
      case DrnPackage.ATTRIBUT__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DrnPackage.ATTRIBUT__ELMT:
        return getElmt();
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
      case DrnPackage.ATTRIBUT__NAME:
        setName((String)newValue);
        return;
      case DrnPackage.ATTRIBUT__TYPE:
        setType((TypeGeneric)newValue);
        return;
      case DrnPackage.ATTRIBUT__ELMT:
        getElmt().clear();
        getElmt().addAll((Collection<? extends Element>)newValue);
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
      case DrnPackage.ATTRIBUT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DrnPackage.ATTRIBUT__TYPE:
        setType((TypeGeneric)null);
        return;
      case DrnPackage.ATTRIBUT__ELMT:
        getElmt().clear();
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
      case DrnPackage.ATTRIBUT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DrnPackage.ATTRIBUT__TYPE:
        return type != null;
      case DrnPackage.ATTRIBUT__ELMT:
        return elmt != null && !elmt.isEmpty();
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

} //AttributImpl
