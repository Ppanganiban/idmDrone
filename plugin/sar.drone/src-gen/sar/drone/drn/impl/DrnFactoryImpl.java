/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sar.drone.drn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DrnFactoryImpl extends EFactoryImpl implements DrnFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DrnFactory init()
  {
    try
    {
      DrnFactory theDrnFactory = (DrnFactory)EPackage.Registry.INSTANCE.getEFactory(DrnPackage.eNS_URI);
      if (theDrnFactory != null)
      {
        return theDrnFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DrnFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrnFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DrnPackage.ROOT: return createRoot();
      case DrnPackage.MODEL: return createModel();
      case DrnPackage.LIBRARY: return createLibrary();
      case DrnPackage.CONTEXT: return createContext();
      case DrnPackage.LIMIT: return createLimit();
      case DrnPackage.SURFACE: return createSurface();
      case DrnPackage.INITIAL_POSITION: return createInitialPosition();
      case DrnPackage.INITIAL_DIRECTION: return createInitialDirection();
      case DrnPackage.INITIAL_POSITION_X: return createInitialPositionX();
      case DrnPackage.INITIAL_POSITION_Y: return createInitialPositionY();
      case DrnPackage.MAX_LENGTH: return createMaxLength();
      case DrnPackage.MAX_WIDTH: return createMaxWidth();
      case DrnPackage.MAX_SPEED: return createMaxSpeed();
      case DrnPackage.MAX_HEIGHT: return createMaxHeight();
      case DrnPackage.ASSIGNEMENT: return createAssignement();
      case DrnPackage.EXPRESSION: return createExpression();
      case DrnPackage.MOVEMENT: return createMovement();
      case DrnPackage.REF_PART: return createRefPart();
      case DrnPackage.REF_PART_LIB: return createRefPartLib();
      case DrnPackage.AND: return createAnd();
      case DrnPackage.DEP_YIMPL: return createDepY_Impl();
      case DrnPackage.FORWARD: return createFORWARD();
      case DrnPackage.BACKWARD: return createBACKWARD();
      case DrnPackage.DEP_XIMPL: return createDepX_Impl();
      case DrnPackage.LEFT: return createLEFT();
      case DrnPackage.RIGHT: return createRIGHT();
      case DrnPackage.DEP_ZIMPL: return createDepZ_Impl();
      case DrnPackage.UP: return createUP();
      case DrnPackage.DOWN: return createDOWN();
      case DrnPackage.DEP_XY_IMPL: return createDepXY_IMPL();
      case DrnPackage.CERCLEXY: return createCERCLEXY();
      case DrnPackage.CARREXY: return createCARREXY();
      case DrnPackage.DEP_YZ_IMPL: return createDepYZ_IMPL();
      case DrnPackage.CERCLEYZ: return createCERCLEYZ();
      case DrnPackage.CARREYZ: return createCARREYZ();
      case DrnPackage.DEP_XZ_IMPL: return createDepXZ_IMPL();
      case DrnPackage.CERCLEXZ: return createCERCLEXZ();
      case DrnPackage.CARREXZ: return createCARREXZ();
      case DrnPackage.DEP_XYZ_IMPL: return createDepXYZ_IMPL();
      case DrnPackage.FLIP: return createFlip();
      case DrnPackage.ROTATE: return createRotate();
      case DrnPackage.WAIT: return createWait();
      case DrnPackage.TAKE_OFF: return createTakeOff();
      case DrnPackage.LAND: return createLand();
      case DrnPackage.DEVICE: return createDevice();
      case DrnPackage.DECLARATION: return createDeclaration();
      case DrnPackage.DEFINITION: return createDefinition();
      case DrnPackage.WITH: return createWith();
      case DrnPackage.REF_DEVICE: return createRefDevice();
      case DrnPackage.TYPE_GENERIC: return createTypeGeneric();
      case DrnPackage.ELEMENT: return createElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DrnPackage.TYPE_PRIMITIF:
        return createTypePrimitifFromString(eDataType, initialValue);
      case DrnPackage.MODE:
        return createModeFromString(eDataType, initialValue);
      case DrnPackage.EBOOL:
        return createEBoolFromString(eDataType, initialValue);
      case DrnPackage.DIRECTION_TYPE:
        return createDirectionTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DrnPackage.TYPE_PRIMITIF:
        return convertTypePrimitifToString(eDataType, instanceValue);
      case DrnPackage.MODE:
        return convertModeToString(eDataType, instanceValue);
      case DrnPackage.EBOOL:
        return convertEBoolToString(eDataType, instanceValue);
      case DrnPackage.DIRECTION_TYPE:
        return convertDirectionTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Library createLibrary()
  {
    LibraryImpl library = new LibraryImpl();
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit createLimit()
  {
    LimitImpl limit = new LimitImpl();
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Surface createSurface()
  {
    SurfaceImpl surface = new SurfaceImpl();
    return surface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialPosition createInitialPosition()
  {
    InitialPositionImpl initialPosition = new InitialPositionImpl();
    return initialPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialDirection createInitialDirection()
  {
    InitialDirectionImpl initialDirection = new InitialDirectionImpl();
    return initialDirection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialPositionX createInitialPositionX()
  {
    InitialPositionXImpl initialPositionX = new InitialPositionXImpl();
    return initialPositionX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialPositionY createInitialPositionY()
  {
    InitialPositionYImpl initialPositionY = new InitialPositionYImpl();
    return initialPositionY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxLength createMaxLength()
  {
    MaxLengthImpl maxLength = new MaxLengthImpl();
    return maxLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxWidth createMaxWidth()
  {
    MaxWidthImpl maxWidth = new MaxWidthImpl();
    return maxWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxSpeed createMaxSpeed()
  {
    MaxSpeedImpl maxSpeed = new MaxSpeedImpl();
    return maxSpeed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxHeight createMaxHeight()
  {
    MaxHeightImpl maxHeight = new MaxHeightImpl();
    return maxHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignement createAssignement()
  {
    AssignementImpl assignement = new AssignementImpl();
    return assignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Movement createMovement()
  {
    MovementImpl movement = new MovementImpl();
    return movement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefPart createRefPart()
  {
    RefPartImpl refPart = new RefPartImpl();
    return refPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefPartLib createRefPartLib()
  {
    RefPartLibImpl refPartLib = new RefPartLibImpl();
    return refPartLib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepY_Impl createDepY_Impl()
  {
    DepY_ImplImpl depY_Impl = new DepY_ImplImpl();
    return depY_Impl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FORWARD createFORWARD()
  {
    FORWARDImpl forward = new FORWARDImpl();
    return forward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BACKWARD createBACKWARD()
  {
    BACKWARDImpl backward = new BACKWARDImpl();
    return backward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepX_Impl createDepX_Impl()
  {
    DepX_ImplImpl depX_Impl = new DepX_ImplImpl();
    return depX_Impl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEFT createLEFT()
  {
    LEFTImpl left = new LEFTImpl();
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RIGHT createRIGHT()
  {
    RIGHTImpl right = new RIGHTImpl();
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepZ_Impl createDepZ_Impl()
  {
    DepZ_ImplImpl depZ_Impl = new DepZ_ImplImpl();
    return depZ_Impl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UP createUP()
  {
    UPImpl up = new UPImpl();
    return up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DOWN createDOWN()
  {
    DOWNImpl down = new DOWNImpl();
    return down;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepXY_IMPL createDepXY_IMPL()
  {
    DepXY_IMPLImpl depXY_IMPL = new DepXY_IMPLImpl();
    return depXY_IMPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CERCLEXY createCERCLEXY()
  {
    CERCLEXYImpl cerclexy = new CERCLEXYImpl();
    return cerclexy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CARREXY createCARREXY()
  {
    CARREXYImpl carrexy = new CARREXYImpl();
    return carrexy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepYZ_IMPL createDepYZ_IMPL()
  {
    DepYZ_IMPLImpl depYZ_IMPL = new DepYZ_IMPLImpl();
    return depYZ_IMPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CERCLEYZ createCERCLEYZ()
  {
    CERCLEYZImpl cercleyz = new CERCLEYZImpl();
    return cercleyz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CARREYZ createCARREYZ()
  {
    CARREYZImpl carreyz = new CARREYZImpl();
    return carreyz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepXZ_IMPL createDepXZ_IMPL()
  {
    DepXZ_IMPLImpl depXZ_IMPL = new DepXZ_IMPLImpl();
    return depXZ_IMPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CERCLEXZ createCERCLEXZ()
  {
    CERCLEXZImpl cerclexz = new CERCLEXZImpl();
    return cerclexz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CARREXZ createCARREXZ()
  {
    CARREXZImpl carrexz = new CARREXZImpl();
    return carrexz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepXYZ_IMPL createDepXYZ_IMPL()
  {
    DepXYZ_IMPLImpl depXYZ_IMPL = new DepXYZ_IMPLImpl();
    return depXYZ_IMPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flip createFlip()
  {
    FlipImpl flip = new FlipImpl();
    return flip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rotate createRotate()
  {
    RotateImpl rotate = new RotateImpl();
    return rotate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wait createWait()
  {
    WaitImpl wait = new WaitImpl();
    return wait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TakeOff createTakeOff()
  {
    TakeOffImpl takeOff = new TakeOffImpl();
    return takeOff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Land createLand()
  {
    LandImpl land = new LandImpl();
    return land;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public With createWith()
  {
    WithImpl with = new WithImpl();
    return with;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefDevice createRefDevice()
  {
    RefDeviceImpl refDevice = new RefDeviceImpl();
    return refDevice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeGeneric createTypeGeneric()
  {
    TypeGenericImpl typeGeneric = new TypeGenericImpl();
    return typeGeneric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePrimitif createTypePrimitifFromString(EDataType eDataType, String initialValue)
  {
    TypePrimitif result = TypePrimitif.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypePrimitifToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode createModeFromString(EDataType eDataType, String initialValue)
  {
    Mode result = Mode.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertModeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EBool createEBoolFromString(EDataType eDataType, String initialValue)
  {
    EBool result = EBool.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEBoolToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue)
  {
    DirectionType result = DirectionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrnPackage getDrnPackage()
  {
    return (DrnPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DrnPackage getPackage()
  {
    return DrnPackage.eINSTANCE;
  }

} //DrnFactoryImpl
