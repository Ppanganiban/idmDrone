/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sar.drone.drn.Assignement;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Library;
import sar.drone.drn.RefPartLib;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Part Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.RefPartLibImpl#getLib <em>Lib</em>}</li>
 *   <li>{@link sar.drone.drn.impl.RefPartLibImpl#getAssignement <em>Assignement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefPartLibImpl extends MovementImpl implements RefPartLib
{
  /**
   * The cached value of the '{@link #getLib() <em>Lib</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLib()
   * @generated
   * @ordered
   */
  protected Library lib;

  /**
   * The cached value of the '{@link #getAssignement() <em>Assignement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignement()
   * @generated
   * @ordered
   */
  protected Assignement assignement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefPartLibImpl()
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
    return DrnPackage.Literals.REF_PART_LIB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Library getLib()
  {
    if (lib != null && lib.eIsProxy())
    {
      InternalEObject oldLib = (InternalEObject)lib;
      lib = (Library)eResolveProxy(oldLib);
      if (lib != oldLib)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DrnPackage.REF_PART_LIB__LIB, oldLib, lib));
      }
    }
    return lib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Library basicGetLib()
  {
    return lib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLib(Library newLib)
  {
    Library oldLib = lib;
    lib = newLib;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.REF_PART_LIB__LIB, oldLib, lib));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignement getAssignement()
  {
    if (assignement != null && assignement.eIsProxy())
    {
      InternalEObject oldAssignement = (InternalEObject)assignement;
      assignement = (Assignement)eResolveProxy(oldAssignement);
      if (assignement != oldAssignement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DrnPackage.REF_PART_LIB__ASSIGNEMENT, oldAssignement, assignement));
      }
    }
    return assignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignement basicGetAssignement()
  {
    return assignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignement(Assignement newAssignement)
  {
    Assignement oldAssignement = assignement;
    assignement = newAssignement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.REF_PART_LIB__ASSIGNEMENT, oldAssignement, assignement));
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
      case DrnPackage.REF_PART_LIB__LIB:
        if (resolve) return getLib();
        return basicGetLib();
      case DrnPackage.REF_PART_LIB__ASSIGNEMENT:
        if (resolve) return getAssignement();
        return basicGetAssignement();
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
      case DrnPackage.REF_PART_LIB__LIB:
        setLib((Library)newValue);
        return;
      case DrnPackage.REF_PART_LIB__ASSIGNEMENT:
        setAssignement((Assignement)newValue);
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
      case DrnPackage.REF_PART_LIB__LIB:
        setLib((Library)null);
        return;
      case DrnPackage.REF_PART_LIB__ASSIGNEMENT:
        setAssignement((Assignement)null);
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
      case DrnPackage.REF_PART_LIB__LIB:
        return lib != null;
      case DrnPackage.REF_PART_LIB__ASSIGNEMENT:
        return assignement != null;
    }
    return super.eIsSet(featureID);
  }

  @Override
  public String toString(){
	  if (eIsProxy()) return super.toString();
	  
	  StringBuffer result = new StringBuffer();
	  result.append("<reference>");
	  result.append("<name>"+assignement.getName()+"</name>");
	  result.append("</reference>");
	  return result.toString();
  }
} //RefPartLibImpl
