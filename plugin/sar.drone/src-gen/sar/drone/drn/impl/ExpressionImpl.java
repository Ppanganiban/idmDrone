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

import sar.drone.drn.DrnPackage;
import sar.drone.drn.Expression;
import sar.drone.drn.Movement;
import sar.drone.drn.Parametre;
import sar.drone.drn.With;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.impl.ExpressionImpl#getMove <em>Move</em>}</li>
 *   <li>{@link sar.drone.drn.impl.ExpressionImpl#getRepeatCST <em>Repeat CST</em>}</li>
 *   <li>{@link sar.drone.drn.impl.ExpressionImpl#getRepeatVAR <em>Repeat VAR</em>}</li>
 *   <li>{@link sar.drone.drn.impl.ExpressionImpl#getWith <em>With</em>}</li>
 *   <li>{@link sar.drone.drn.impl.ExpressionImpl#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getMove() <em>Move</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMove()
   * @generated
   * @ordered
   */
  protected Movement move;

  /**
   * The default value of the '{@link #getRepeatCST() <em>Repeat CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatCST()
   * @generated
   * @ordered
   */
  protected static final int REPEAT_CST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRepeatCST() <em>Repeat CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatCST()
   * @generated
   * @ordered
   */
  protected int repeatCST = REPEAT_CST_EDEFAULT;

  /**
   * The cached value of the '{@link #getRepeatVAR() <em>Repeat VAR</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatVAR()
   * @generated
   * @ordered
   */
  protected Parametre repeatVAR;

  /**
   * The cached value of the '{@link #getWith() <em>With</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWith()
   * @generated
   * @ordered
   */
  protected EList<With> with;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected EList<Expression> then;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return DrnPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Movement getMove()
  {
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMove(Movement newMove, NotificationChain msgs)
  {
    Movement oldMove = move;
    move = newMove;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DrnPackage.EXPRESSION__MOVE, oldMove, newMove);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMove(Movement newMove)
  {
    if (newMove != move)
    {
      NotificationChain msgs = null;
      if (move != null)
        msgs = ((InternalEObject)move).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DrnPackage.EXPRESSION__MOVE, null, msgs);
      if (newMove != null)
        msgs = ((InternalEObject)newMove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DrnPackage.EXPRESSION__MOVE, null, msgs);
      msgs = basicSetMove(newMove, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.EXPRESSION__MOVE, newMove, newMove));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRepeatCST()
  {
    return repeatCST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeatCST(int newRepeatCST)
  {
    int oldRepeatCST = repeatCST;
    repeatCST = newRepeatCST;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.EXPRESSION__REPEAT_CST, oldRepeatCST, repeatCST));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametre getRepeatVAR()
  {
    if (repeatVAR != null && repeatVAR.eIsProxy())
    {
      InternalEObject oldRepeatVAR = (InternalEObject)repeatVAR;
      repeatVAR = (Parametre)eResolveProxy(oldRepeatVAR);
      if (repeatVAR != oldRepeatVAR)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DrnPackage.EXPRESSION__REPEAT_VAR, oldRepeatVAR, repeatVAR));
      }
    }
    return repeatVAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametre basicGetRepeatVAR()
  {
    return repeatVAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeatVAR(Parametre newRepeatVAR)
  {
    Parametre oldRepeatVAR = repeatVAR;
    repeatVAR = newRepeatVAR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DrnPackage.EXPRESSION__REPEAT_VAR, oldRepeatVAR, repeatVAR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<With> getWith()
  {
    if (with == null)
    {
      with = new EObjectContainmentEList<With>(With.class, this, DrnPackage.EXPRESSION__WITH);
    }
    return with;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getThen()
  {
    if (then == null)
    {
      then = new EObjectContainmentEList<Expression>(Expression.class, this, DrnPackage.EXPRESSION__THEN);
    }
    return then;
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
      case DrnPackage.EXPRESSION__MOVE:
        return basicSetMove(null, msgs);
      case DrnPackage.EXPRESSION__WITH:
        return ((InternalEList<?>)getWith()).basicRemove(otherEnd, msgs);
      case DrnPackage.EXPRESSION__THEN:
        return ((InternalEList<?>)getThen()).basicRemove(otherEnd, msgs);
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
      case DrnPackage.EXPRESSION__MOVE:
        return getMove();
      case DrnPackage.EXPRESSION__REPEAT_CST:
        return getRepeatCST();
      case DrnPackage.EXPRESSION__REPEAT_VAR:
        if (resolve) return getRepeatVAR();
        return basicGetRepeatVAR();
      case DrnPackage.EXPRESSION__WITH:
        return getWith();
      case DrnPackage.EXPRESSION__THEN:
        return getThen();
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
      case DrnPackage.EXPRESSION__MOVE:
        setMove((Movement)newValue);
        return;
      case DrnPackage.EXPRESSION__REPEAT_CST:
        setRepeatCST((Integer)newValue);
        return;
      case DrnPackage.EXPRESSION__REPEAT_VAR:
        setRepeatVAR((Parametre)newValue);
        return;
      case DrnPackage.EXPRESSION__WITH:
        getWith().clear();
        getWith().addAll((Collection<? extends With>)newValue);
        return;
      case DrnPackage.EXPRESSION__THEN:
        getThen().clear();
        getThen().addAll((Collection<? extends Expression>)newValue);
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
      case DrnPackage.EXPRESSION__MOVE:
        setMove((Movement)null);
        return;
      case DrnPackage.EXPRESSION__REPEAT_CST:
        setRepeatCST(REPEAT_CST_EDEFAULT);
        return;
      case DrnPackage.EXPRESSION__REPEAT_VAR:
        setRepeatVAR((Parametre)null);
        return;
      case DrnPackage.EXPRESSION__WITH:
        getWith().clear();
        return;
      case DrnPackage.EXPRESSION__THEN:
        getThen().clear();
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
      case DrnPackage.EXPRESSION__MOVE:
        return move != null;
      case DrnPackage.EXPRESSION__REPEAT_CST:
        return repeatCST != REPEAT_CST_EDEFAULT;
      case DrnPackage.EXPRESSION__REPEAT_VAR:
        return repeatVAR != null;
      case DrnPackage.EXPRESSION__WITH:
        return with != null && !with.isEmpty();
      case DrnPackage.EXPRESSION__THEN:
        return then != null && !then.isEmpty();
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
    result.append(" (repeatCST: ");
    result.append(repeatCST);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
