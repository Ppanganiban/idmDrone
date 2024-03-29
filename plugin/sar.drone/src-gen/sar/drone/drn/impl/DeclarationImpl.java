/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sar.drone.drn.Declaration;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.TypeGeneric;
import sar.drone.drn.TypePrimitif;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.DeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link sar.drone.drn.impl.DeclarationImpl#getTypePrimitif <em>Type Primitif</em>}</li>
 *   <li>{@link sar.drone.drn.impl.DeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration
{
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
   * The default value of the '{@link #getTypePrimitif() <em>Type Primitif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypePrimitif()
   * @generated
   * @ordered
   */
  protected static final TypePrimitif TYPE_PRIMITIF_EDEFAULT = TypePrimitif.BOOL_TYPE;

  /**
   * The cached value of the '{@link #getTypePrimitif() <em>Type Primitif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypePrimitif()
   * @generated
   * @ordered
   */
  protected TypePrimitif typePrimitif = TYPE_PRIMITIF_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationImpl()
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
    return DrnPackage.Literals.DECLARATION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DrnPackage.DECLARATION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DECLARATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePrimitif getTypePrimitif()
  {
    return typePrimitif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypePrimitif(TypePrimitif newTypePrimitif)
  {
    TypePrimitif oldTypePrimitif = typePrimitif;
    typePrimitif = newTypePrimitif == null ? TYPE_PRIMITIF_EDEFAULT : newTypePrimitif;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DECLARATION__TYPE_PRIMITIF, oldTypePrimitif, typePrimitif));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.DECLARATION__NAME, oldName, name));
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
      case DrnPackage.DECLARATION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DrnPackage.DECLARATION__TYPE_PRIMITIF:
        return getTypePrimitif();
      case DrnPackage.DECLARATION__NAME:
        return getName();
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
      case DrnPackage.DECLARATION__TYPE:
        setType((TypeGeneric)newValue);
        return;
      case DrnPackage.DECLARATION__TYPE_PRIMITIF:
        setTypePrimitif((TypePrimitif)newValue);
        return;
      case DrnPackage.DECLARATION__NAME:
        setName((String)newValue);
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
      case DrnPackage.DECLARATION__TYPE:
        setType((TypeGeneric)null);
        return;
      case DrnPackage.DECLARATION__TYPE_PRIMITIF:
        setTypePrimitif(TYPE_PRIMITIF_EDEFAULT);
        return;
      case DrnPackage.DECLARATION__NAME:
        setName(NAME_EDEFAULT);
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
      case DrnPackage.DECLARATION__TYPE:
        return type != null;
      case DrnPackage.DECLARATION__TYPE_PRIMITIF:
        return typePrimitif != TYPE_PRIMITIF_EDEFAULT;
      case DrnPackage.DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (typePrimitif: ");
    result.append(typePrimitif);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DeclarationImpl
