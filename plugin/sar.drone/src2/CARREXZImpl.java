/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sar.drone.drn.CARREXZ;
import sar.drone.drn.DrnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CARREXZ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.CARREXZImpl#getCoteCST <em>Cote CST</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CARREXZImpl extends DepXZ_IMPLImpl implements CARREXZ
{
  /**
   * The default value of the '{@link #getCoteCST() <em>Cote CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoteCST()
   * @generated
   * @ordered
   */
  protected static final int COTE_CST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCoteCST() <em>Cote CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoteCST()
   * @generated
   * @ordered
   */
  protected int coteCST = COTE_CST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CARREXZImpl()
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
    return DrnPackage.Literals.CARREXZ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCoteCST()
  {
    return coteCST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoteCST(int newCoteCST)
  {
    int oldCoteCST = coteCST;
    coteCST = newCoteCST;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.CARREXZ__COTE_CST, oldCoteCST, coteCST));
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
      case DrnPackage.CARREXZ__COTE_CST:
        return getCoteCST();
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
      case DrnPackage.CARREXZ__COTE_CST:
        setCoteCST((Integer)newValue);
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
      case DrnPackage.CARREXZ__COTE_CST:
        setCoteCST(COTE_CST_EDEFAULT);
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
      case DrnPackage.CARREXZ__COTE_CST:
        return coteCST != COTE_CST_EDEFAULT;
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
    result.append("<cote>"+coteCST+"</cote>");
    result.append("<time>"+tempsCST+"</time>");
    result.append("</"+name+">");
    return result.toString();
  }

} //CARREXZImpl
