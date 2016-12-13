/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sar.drone.drn.DepY_Impl;
import sar.drone.drn.DrnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dep YImpl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.DepY_ImplImpl#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.impl.DepY_ImplImpl#getDistanceCST <em>Distance CST</em>}</li>
 *   <li>{@link sar.drone.drn.impl.DepY_ImplImpl#getTempsCST <em>Temps CST</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepY_ImplImpl extends MovementImpl implements DepY_Impl
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
   * The default value of the '{@link #getDistanceCST() <em>Distance CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistanceCST()
   * @generated
   * @ordered
   */
  protected static final int DISTANCE_CST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDistanceCST() <em>Distance CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistanceCST()
   * @generated
   * @ordered
   */
  protected int distanceCST = DISTANCE_CST_EDEFAULT;

  /**
   * The default value of the '{@link #getTempsCST() <em>Temps CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempsCST()
   * @generated
   * @ordered
   */
  protected static final int TEMPS_CST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTempsCST() <em>Temps CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempsCST()
   * @generated
   * @ordered
   */
  protected int tempsCST = TEMPS_CST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DepY_ImplImpl()
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
    return DrnPackage.Literals.DEP_YIMPL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DEP_YIMPL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDistanceCST()
  {
    return distanceCST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistanceCST(int newDistanceCST)
  {
    int oldDistanceCST = distanceCST;
    distanceCST = newDistanceCST;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DEP_YIMPL__DISTANCE_CST, oldDistanceCST, distanceCST));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTempsCST()
  {
    return tempsCST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTempsCST(int newTempsCST)
  {
    int oldTempsCST = tempsCST;
    tempsCST = newTempsCST;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DEP_YIMPL__TEMPS_CST, oldTempsCST, tempsCST));
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
      case DrnPackage.DEP_YIMPL__NAME:
        return getName();
      case DrnPackage.DEP_YIMPL__DISTANCE_CST:
        return getDistanceCST();
      case DrnPackage.DEP_YIMPL__TEMPS_CST:
        return getTempsCST();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DrnPackage.DEP_YIMPL__NAME:
        setName((String)newValue);
        return;
      case DrnPackage.DEP_YIMPL__DISTANCE_CST:
        setDistanceCST((Integer)newValue);
        return;
      case DrnPackage.DEP_YIMPL__TEMPS_CST:
        setTempsCST((Integer)newValue);
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
      case DrnPackage.DEP_YIMPL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DrnPackage.DEP_YIMPL__DISTANCE_CST:
        setDistanceCST(DISTANCE_CST_EDEFAULT);
        return;
      case DrnPackage.DEP_YIMPL__TEMPS_CST:
        setTempsCST(TEMPS_CST_EDEFAULT);
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
      case DrnPackage.DEP_YIMPL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DrnPackage.DEP_YIMPL__DISTANCE_CST:
        return distanceCST != DISTANCE_CST_EDEFAULT;
      case DrnPackage.DEP_YIMPL__TEMPS_CST:
        return tempsCST != TEMPS_CST_EDEFAULT;
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
    result.append("<"+name+">");
    result.append("<distance>"+distanceCST+"</distance>");
    result.append("<time>"+tempsCST+"</time>");
    result.append("</"+name+">");
    return result.toString();
  }

} //DepY_ImplImpl
