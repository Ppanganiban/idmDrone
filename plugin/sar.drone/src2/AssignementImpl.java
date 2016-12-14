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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sar.drone.drn.Assignement;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.AssignementImpl#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.impl.AssignementImpl#getOperandes <em>Operandes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignementImpl extends MinimalEObjectImpl.Container implements Assignement
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
   * The cached value of the '{@link #getOperandes() <em>Operandes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperandes()
   * @generated
   * @ordered
   */
  protected EList<Expression> operandes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignementImpl()
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
    return DrnPackage.Literals.ASSIGNEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.ASSIGNEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getOperandes()
  {
    if (operandes == null)
    {
      operandes = new EObjectContainmentEList<Expression>(Expression.class, this, DrnPackage.ASSIGNEMENT__OPERANDES);
    }
    return operandes;
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
      case DrnPackage.ASSIGNEMENT__OPERANDES:
        return ((InternalEList<?>)getOperandes()).basicRemove(otherEnd, msgs);
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
      case DrnPackage.ASSIGNEMENT__NAME:
        return getName();
      case DrnPackage.ASSIGNEMENT__OPERANDES:
        return getOperandes();
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
      case DrnPackage.ASSIGNEMENT__NAME:
        setName((String)newValue);
        return;
      case DrnPackage.ASSIGNEMENT__OPERANDES:
        getOperandes().clear();
        getOperandes().addAll((Collection<? extends Expression>)newValue);
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
      case DrnPackage.ASSIGNEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DrnPackage.ASSIGNEMENT__OPERANDES:
        getOperandes().clear();
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
      case DrnPackage.ASSIGNEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DrnPackage.ASSIGNEMENT__OPERANDES:
        return operandes != null && !operandes.isEmpty();
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
    result.append("<part>");
    result.append("<name>"+name+"</name>");
    for (Expression e : operandes){
        result.append("<action>");
        if(e.getRepeatCST()>1)
    		result.append("<repeat>"+e.getRepeatCST()+"</repeat>");

        if(e.getWith().size() > 0)
    		result.append(e.getWith().get(0).toString());
        
        result.append(e.getMove().toString());
        for (Expression t : e.getThen())
            result.append(t.getMove().toString());

        result.append("</action>");
    }
    result.append("</part>");
    return result.toString();
  }

  protected boolean mark = true;
@Override
public boolean isMark() {
	// TODO Auto-generated method stub
	return mark;
}

@Override
public void setMark(boolean b) {
	// TODO Auto-generated method stub
	mark = b;
}

} //AssignementImpl