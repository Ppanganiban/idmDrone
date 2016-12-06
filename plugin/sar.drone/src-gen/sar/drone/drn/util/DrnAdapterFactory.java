/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sar.drone.drn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sar.drone.drn.DrnPackage
 * @generated
 */
public class DrnAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DrnPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrnAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DrnPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DrnSwitch<Adapter> modelSwitch =
    new DrnSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseLimit(Limit object)
      {
        return createLimitAdapter();
      }
      @Override
      public Adapter caseSurface(Surface object)
      {
        return createSurfaceAdapter();
      }
      @Override
      public Adapter caseInitialPosition(InitialPosition object)
      {
        return createInitialPositionAdapter();
      }
      @Override
      public Adapter caseInitialDirection(InitialDirection object)
      {
        return createInitialDirectionAdapter();
      }
      @Override
      public Adapter caseInitialPositionX(InitialPositionX object)
      {
        return createInitialPositionXAdapter();
      }
      @Override
      public Adapter caseInitialPositionY(InitialPositionY object)
      {
        return createInitialPositionYAdapter();
      }
      @Override
      public Adapter caseMaxLength(MaxLength object)
      {
        return createMaxLengthAdapter();
      }
      @Override
      public Adapter caseMaxWidth(MaxWidth object)
      {
        return createMaxWidthAdapter();
      }
      @Override
      public Adapter caseMaxSpeed(MaxSpeed object)
      {
        return createMaxSpeedAdapter();
      }
      @Override
      public Adapter caseMaxHeigth(MaxHeigth object)
      {
        return createMaxHeigthAdapter();
      }
      @Override
      public Adapter caseAssignement(Assignement object)
      {
        return createAssignementAdapter();
      }
      @Override
      public Adapter caseParametre(Parametre object)
      {
        return createParametreAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseMovement(Movement object)
      {
        return createMovementAdapter();
      }
      @Override
      public Adapter caseRefPart(RefPart object)
      {
        return createRefPartAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseDepY_Impl(DepY_Impl object)
      {
        return createDepY_ImplAdapter();
      }
      @Override
      public Adapter caseFORWARD(FORWARD object)
      {
        return createFORWARDAdapter();
      }
      @Override
      public Adapter caseBACKWARD(BACKWARD object)
      {
        return createBACKWARDAdapter();
      }
      @Override
      public Adapter caseDepX_Impl(DepX_Impl object)
      {
        return createDepX_ImplAdapter();
      }
      @Override
      public Adapter caseLEFT(LEFT object)
      {
        return createLEFTAdapter();
      }
      @Override
      public Adapter caseRIGHT(RIGHT object)
      {
        return createRIGHTAdapter();
      }
      @Override
      public Adapter caseDepZ_Impl(DepZ_Impl object)
      {
        return createDepZ_ImplAdapter();
      }
      @Override
      public Adapter caseUP(UP object)
      {
        return createUPAdapter();
      }
      @Override
      public Adapter caseDOWN(DOWN object)
      {
        return createDOWNAdapter();
      }
      @Override
      public Adapter caseDepXY_IMPL(DepXY_IMPL object)
      {
        return createDepXY_IMPLAdapter();
      }
      @Override
      public Adapter caseCERCLEXY(CERCLEXY object)
      {
        return createCERCLEXYAdapter();
      }
      @Override
      public Adapter caseCARREXY(CARREXY object)
      {
        return createCARREXYAdapter();
      }
      @Override
      public Adapter caseDepYZ_IMPL(DepYZ_IMPL object)
      {
        return createDepYZ_IMPLAdapter();
      }
      @Override
      public Adapter caseCERCLEYZ(CERCLEYZ object)
      {
        return createCERCLEYZAdapter();
      }
      @Override
      public Adapter caseCARREYZ(CARREYZ object)
      {
        return createCARREYZAdapter();
      }
      @Override
      public Adapter caseDepXZ_IMPL(DepXZ_IMPL object)
      {
        return createDepXZ_IMPLAdapter();
      }
      @Override
      public Adapter caseCERCLEXZ(CERCLEXZ object)
      {
        return createCERCLEXZAdapter();
      }
      @Override
      public Adapter caseCARREXZ(CARREXZ object)
      {
        return createCARREXZAdapter();
      }
      @Override
      public Adapter caseDepXYZ_IMPL(DepXYZ_IMPL object)
      {
        return createDepXYZ_IMPLAdapter();
      }
      @Override
      public Adapter caseFlip(Flip object)
      {
        return createFlipAdapter();
      }
      @Override
      public Adapter caseRotate(Rotate object)
      {
        return createRotateAdapter();
      }
      @Override
      public Adapter caseWait(Wait object)
      {
        return createWaitAdapter();
      }
      @Override
      public Adapter caseTakeOff(TakeOff object)
      {
        return createTakeOffAdapter();
      }
      @Override
      public Adapter caseLand(Land object)
      {
        return createLandAdapter();
      }
      @Override
      public Adapter caseDevice(Device object)
      {
        return createDeviceAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseWith(With object)
      {
        return createWithAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter caseRefDevice(RefDevice object)
      {
        return createRefDeviceAdapter();
      }
      @Override
      public Adapter caseAttribut(Attribut object)
      {
        return createAttributAdapter();
      }
      @Override
      public Adapter caseLed_Impl(Led_Impl object)
      {
        return createLed_ImplAdapter();
      }
      @Override
      public Adapter caseLedBlink(LedBlink object)
      {
        return createLedBlinkAdapter();
      }
      @Override
      public Adapter caseCamera(Camera object)
      {
        return createCameraAdapter();
      }
      @Override
      public Adapter caseTypeGeneric(TypeGeneric object)
      {
        return createTypeGenericAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Limit
   * @generated
   */
  public Adapter createLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Surface <em>Surface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Surface
   * @generated
   */
  public Adapter createSurfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.InitialPosition <em>Initial Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.InitialPosition
   * @generated
   */
  public Adapter createInitialPositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.InitialDirection <em>Initial Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.InitialDirection
   * @generated
   */
  public Adapter createInitialDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.InitialPositionX <em>Initial Position X</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.InitialPositionX
   * @generated
   */
  public Adapter createInitialPositionXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.InitialPositionY <em>Initial Position Y</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.InitialPositionY
   * @generated
   */
  public Adapter createInitialPositionYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.MaxLength <em>Max Length</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.MaxLength
   * @generated
   */
  public Adapter createMaxLengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.MaxWidth <em>Max Width</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.MaxWidth
   * @generated
   */
  public Adapter createMaxWidthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.MaxSpeed <em>Max Speed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.MaxSpeed
   * @generated
   */
  public Adapter createMaxSpeedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.MaxHeigth <em>Max Heigth</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.MaxHeigth
   * @generated
   */
  public Adapter createMaxHeigthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Assignement <em>Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Assignement
   * @generated
   */
  public Adapter createAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Parametre <em>Parametre</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Parametre
   * @generated
   */
  public Adapter createParametreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Movement <em>Movement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Movement
   * @generated
   */
  public Adapter createMovementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.RefPart <em>Ref Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.RefPart
   * @generated
   */
  public Adapter createRefPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.DepY_Impl <em>Dep YImpl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.DepY_Impl
   * @generated
   */
  public Adapter createDepY_ImplAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.FORWARD <em>FORWARD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.FORWARD
   * @generated
   */
  public Adapter createFORWARDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.BACKWARD <em>BACKWARD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.BACKWARD
   * @generated
   */
  public Adapter createBACKWARDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.DepX_Impl <em>Dep XImpl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.DepX_Impl
   * @generated
   */
  public Adapter createDepX_ImplAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.LEFT <em>LEFT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.LEFT
   * @generated
   */
  public Adapter createLEFTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.RIGHT <em>RIGHT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.RIGHT
   * @generated
   */
  public Adapter createRIGHTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.DepZ_Impl <em>Dep ZImpl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.DepZ_Impl
   * @generated
   */
  public Adapter createDepZ_ImplAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.UP <em>UP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.UP
   * @generated
   */
  public Adapter createUPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.DOWN <em>DOWN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.DOWN
   * @generated
   */
  public Adapter createDOWNAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.DepXY_IMPL <em>Dep XY IMPL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.DepXY_IMPL
   * @generated
   */
  public Adapter createDepXY_IMPLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.CERCLEXY <em>CERCLEXY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.CERCLEXY
   * @generated
   */
  public Adapter createCERCLEXYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.CARREXY <em>CARREXY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.CARREXY
   * @generated
   */
  public Adapter createCARREXYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.DepYZ_IMPL <em>Dep YZ IMPL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.DepYZ_IMPL
   * @generated
   */
  public Adapter createDepYZ_IMPLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.CERCLEYZ <em>CERCLEYZ</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.CERCLEYZ
   * @generated
   */
  public Adapter createCERCLEYZAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.CARREYZ <em>CARREYZ</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.CARREYZ
   * @generated
   */
  public Adapter createCARREYZAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.DepXZ_IMPL <em>Dep XZ IMPL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.DepXZ_IMPL
   * @generated
   */
  public Adapter createDepXZ_IMPLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.CERCLEXZ <em>CERCLEXZ</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.CERCLEXZ
   * @generated
   */
  public Adapter createCERCLEXZAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.CARREXZ <em>CARREXZ</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.CARREXZ
   * @generated
   */
  public Adapter createCARREXZAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.DepXYZ_IMPL <em>Dep XYZ IMPL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.DepXYZ_IMPL
   * @generated
   */
  public Adapter createDepXYZ_IMPLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Flip <em>Flip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Flip
   * @generated
   */
  public Adapter createFlipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Rotate <em>Rotate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Rotate
   * @generated
   */
  public Adapter createRotateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Wait <em>Wait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Wait
   * @generated
   */
  public Adapter createWaitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.TakeOff <em>Take Off</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.TakeOff
   * @generated
   */
  public Adapter createTakeOffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Land <em>Land</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Land
   * @generated
   */
  public Adapter createLandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Device
   * @generated
   */
  public Adapter createDeviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.With <em>With</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.With
   * @generated
   */
  public Adapter createWithAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.RefDevice <em>Ref Device</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.RefDevice
   * @generated
   */
  public Adapter createRefDeviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Attribut <em>Attribut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Attribut
   * @generated
   */
  public Adapter createAttributAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Led_Impl <em>Led Impl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Led_Impl
   * @generated
   */
  public Adapter createLed_ImplAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.LedBlink <em>Led Blink</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.LedBlink
   * @generated
   */
  public Adapter createLedBlinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Camera <em>Camera</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Camera
   * @generated
   */
  public Adapter createCameraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.TypeGeneric <em>Type Generic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.TypeGeneric
   * @generated
   */
  public Adapter createTypeGenericAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sar.drone.drn.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sar.drone.drn.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DrnAdapterFactory
