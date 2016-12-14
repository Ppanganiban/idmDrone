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

import sar.drone.drn.And;
import sar.drone.drn.DepXY_IMPL;
import sar.drone.drn.DepXZ_IMPL;
import sar.drone.drn.DepX_Impl;
import sar.drone.drn.DepYZ_IMPL;
import sar.drone.drn.DepY_Impl;
import sar.drone.drn.DepZ_Impl;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Rotate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.AndImpl#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AndImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AndImpl#getDepx <em>Depx</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AndImpl#getDepy <em>Depy</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AndImpl#getDepz <em>Depz</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AndImpl#getDepxz <em>Depxz</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AndImpl#getDepxy <em>Depxy</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AndImpl#getDepyz <em>Depyz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndImpl extends MovementImpl implements And
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
   * The cached value of the '{@link #getRotate() <em>Rotate</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotate()
   * @generated
   * @ordered
   */
  protected EList<Rotate> rotate;

  /**
   * The cached value of the '{@link #getDepx() <em>Depx</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepx()
   * @generated
   * @ordered
   */
  protected EList<DepX_Impl> depx;

  /**
   * The cached value of the '{@link #getDepy() <em>Depy</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepy()
   * @generated
   * @ordered
   */
  protected EList<DepY_Impl> depy;

  /**
   * The cached value of the '{@link #getDepz() <em>Depz</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepz()
   * @generated
   * @ordered
   */
  protected EList<DepZ_Impl> depz;

  /**
   * The cached value of the '{@link #getDepxz() <em>Depxz</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepxz()
   * @generated
   * @ordered
   */
  protected EList<DepXZ_IMPL> depxz;

  /**
   * The cached value of the '{@link #getDepxy() <em>Depxy</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepxy()
   * @generated
   * @ordered
   */
  protected EList<DepXY_IMPL> depxy;

  /**
   * The cached value of the '{@link #getDepyz() <em>Depyz</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepyz()
   * @generated
   * @ordered
   */
  protected EList<DepYZ_IMPL> depyz;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndImpl()
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
    return DrnPackage.Literals.AND;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.AND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rotate> getRotate()
  {
    if (rotate == null)
    {
      rotate = new EObjectContainmentEList<Rotate>(Rotate.class, this, DrnPackage.AND__ROTATE);
    }
    return rotate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DepX_Impl> getDepx()
  {
    if (depx == null)
    {
      depx = new EObjectContainmentEList<DepX_Impl>(DepX_Impl.class, this, DrnPackage.AND__DEPX);
    }
    return depx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DepY_Impl> getDepy()
  {
    if (depy == null)
    {
      depy = new EObjectContainmentEList<DepY_Impl>(DepY_Impl.class, this, DrnPackage.AND__DEPY);
    }
    return depy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DepZ_Impl> getDepz()
  {
    if (depz == null)
    {
      depz = new EObjectContainmentEList<DepZ_Impl>(DepZ_Impl.class, this, DrnPackage.AND__DEPZ);
    }
    return depz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DepXZ_IMPL> getDepxz()
  {
    if (depxz == null)
    {
      depxz = new EObjectContainmentEList<DepXZ_IMPL>(DepXZ_IMPL.class, this, DrnPackage.AND__DEPXZ);
    }
    return depxz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DepXY_IMPL> getDepxy()
  {
    if (depxy == null)
    {
      depxy = new EObjectContainmentEList<DepXY_IMPL>(DepXY_IMPL.class, this, DrnPackage.AND__DEPXY);
    }
    return depxy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DepYZ_IMPL> getDepyz()
  {
    if (depyz == null)
    {
      depyz = new EObjectContainmentEList<DepYZ_IMPL>(DepYZ_IMPL.class, this, DrnPackage.AND__DEPYZ);
    }
    return depyz;
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
      case DrnPackage.AND__ROTATE:
        return ((InternalEList<?>)getRotate()).basicRemove(otherEnd, msgs);
      case DrnPackage.AND__DEPX:
        return ((InternalEList<?>)getDepx()).basicRemove(otherEnd, msgs);
      case DrnPackage.AND__DEPY:
        return ((InternalEList<?>)getDepy()).basicRemove(otherEnd, msgs);
      case DrnPackage.AND__DEPZ:
        return ((InternalEList<?>)getDepz()).basicRemove(otherEnd, msgs);
      case DrnPackage.AND__DEPXZ:
        return ((InternalEList<?>)getDepxz()).basicRemove(otherEnd, msgs);
      case DrnPackage.AND__DEPXY:
        return ((InternalEList<?>)getDepxy()).basicRemove(otherEnd, msgs);
      case DrnPackage.AND__DEPYZ:
        return ((InternalEList<?>)getDepyz()).basicRemove(otherEnd, msgs);
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
      case DrnPackage.AND__NAME:
        return getName();
      case DrnPackage.AND__ROTATE:
        return getRotate();
      case DrnPackage.AND__DEPX:
        return getDepx();
      case DrnPackage.AND__DEPY:
        return getDepy();
      case DrnPackage.AND__DEPZ:
        return getDepz();
      case DrnPackage.AND__DEPXZ:
        return getDepxz();
      case DrnPackage.AND__DEPXY:
        return getDepxy();
      case DrnPackage.AND__DEPYZ:
        return getDepyz();
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
      case DrnPackage.AND__NAME:
        setName((String)newValue);
        return;
      case DrnPackage.AND__ROTATE:
        getRotate().clear();
        getRotate().addAll((Collection<? extends Rotate>)newValue);
        return;
      case DrnPackage.AND__DEPX:
        getDepx().clear();
        getDepx().addAll((Collection<? extends DepX_Impl>)newValue);
        return;
      case DrnPackage.AND__DEPY:
        getDepy().clear();
        getDepy().addAll((Collection<? extends DepY_Impl>)newValue);
        return;
      case DrnPackage.AND__DEPZ:
        getDepz().clear();
        getDepz().addAll((Collection<? extends DepZ_Impl>)newValue);
        return;
      case DrnPackage.AND__DEPXZ:
        getDepxz().clear();
        getDepxz().addAll((Collection<? extends DepXZ_IMPL>)newValue);
        return;
      case DrnPackage.AND__DEPXY:
        getDepxy().clear();
        getDepxy().addAll((Collection<? extends DepXY_IMPL>)newValue);
        return;
      case DrnPackage.AND__DEPYZ:
        getDepyz().clear();
        getDepyz().addAll((Collection<? extends DepYZ_IMPL>)newValue);
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
      case DrnPackage.AND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DrnPackage.AND__ROTATE:
        getRotate().clear();
        return;
      case DrnPackage.AND__DEPX:
        getDepx().clear();
        return;
      case DrnPackage.AND__DEPY:
        getDepy().clear();
        return;
      case DrnPackage.AND__DEPZ:
        getDepz().clear();
        return;
      case DrnPackage.AND__DEPXZ:
        getDepxz().clear();
        return;
      case DrnPackage.AND__DEPXY:
        getDepxy().clear();
        return;
      case DrnPackage.AND__DEPYZ:
        getDepyz().clear();
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
      case DrnPackage.AND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DrnPackage.AND__ROTATE:
        return rotate != null && !rotate.isEmpty();
      case DrnPackage.AND__DEPX:
        return depx != null && !depx.isEmpty();
      case DrnPackage.AND__DEPY:
        return depy != null && !depy.isEmpty();
      case DrnPackage.AND__DEPZ:
        return depz != null && !depz.isEmpty();
      case DrnPackage.AND__DEPXZ:
        return depxz != null && !depxz.isEmpty();
      case DrnPackage.AND__DEPXY:
        return depxy != null && !depxy.isEmpty();
      case DrnPackage.AND__DEPYZ:
        return depyz != null && !depyz.isEmpty();
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
    result.append("<merge>");
    if(depx != null)
    	result.append(depx.toString());
    if(depxy != null)
    	result.append(depxy.toString());
    if(depxz != null)
    	result.append(depxz.toString());
    if(depy != null)
    	result.append(depy.toString());
    if(depyz != null)
    	result.append(depyz.toString());
    if(depz != null)
    	result.append(depz.toString());
    result.append("</merge>");
    return result.toString();
  }

} //AndImpl
