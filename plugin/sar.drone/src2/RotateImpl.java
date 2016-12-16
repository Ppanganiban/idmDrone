/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sar.drone.drn.DrnPackage;
import sar.drone.drn.Rotate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.RotateImpl#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.impl.RotateImpl#getAngleCST <em>Angle CST</em>}</li>
 *   <li>{@link sar.drone.drn.impl.RotateImpl#getTempsCST <em>Temps CST</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotateImpl extends MovementImpl implements Rotate
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
   * The default value of the '{@link #getAngleCST() <em>Angle CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngleCST()
   * @generated
   * @ordered
   */
  protected static final String ANGLE_CST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAngleCST() <em>Angle CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngleCST()
   * @generated
   * @ordered
   */
  protected String angleCST = ANGLE_CST_EDEFAULT;

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
  protected RotateImpl()
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
    return DrnPackage.Literals.ROTATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.ROTATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAngleCST()
  {
    return angleCST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAngleCST(String newAngleCST)
  {
    String oldAngleCST = angleCST;
    angleCST = newAngleCST;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.ROTATE__ANGLE_CST, oldAngleCST, angleCST));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.ROTATE__TEMPS_CST, oldTempsCST, tempsCST));
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
      case DrnPackage.ROTATE__NAME:
        return getName();
      case DrnPackage.ROTATE__ANGLE_CST:
        return getAngleCST();
      case DrnPackage.ROTATE__TEMPS_CST:
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
      case DrnPackage.ROTATE__NAME:
        setName((String)newValue);
        return;
      case DrnPackage.ROTATE__ANGLE_CST:
        setAngleCST((String)newValue);
        return;
      case DrnPackage.ROTATE__TEMPS_CST:
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
      case DrnPackage.ROTATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DrnPackage.ROTATE__ANGLE_CST:
        setAngleCST(ANGLE_CST_EDEFAULT);
        return;
      case DrnPackage.ROTATE__TEMPS_CST:
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
      case DrnPackage.ROTATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DrnPackage.ROTATE__ANGLE_CST:
        return ANGLE_CST_EDEFAULT == null ? angleCST != null : !ANGLE_CST_EDEFAULT.equals(angleCST);
      case DrnPackage.ROTATE__TEMPS_CST:
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

    StringBuffer result = new StringBuffer();
    result.append("<"+name+">");
    result.append("<angle>"+angleCST+"</angle>");
    result.append("<time>"+tempsCST+"</time>");
    result.append("</"+name+">");
    return result.toString();
  }

} //RotateImpl
