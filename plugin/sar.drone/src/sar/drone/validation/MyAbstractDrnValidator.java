package sar.drone.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;

import com.google.common.base.Objects;
import com.google.common.net.InetAddresses;

import sar.drone.drn.And;
import sar.drone.drn.Assignement;
import sar.drone.drn.BACKWARD;
import sar.drone.drn.CARREXY;
import sar.drone.drn.CARREXZ;
import sar.drone.drn.CARREYZ;
import sar.drone.drn.CERCLEXY;
import sar.drone.drn.CERCLEXZ;
import sar.drone.drn.CERCLEYZ;
import sar.drone.drn.ConnectionType;
import sar.drone.drn.DOWN;
import sar.drone.drn.Declaration;
import sar.drone.drn.DepXY_IMPL;
import sar.drone.drn.DepXZ_IMPL;
import sar.drone.drn.DepX_Impl;
import sar.drone.drn.DepYZ_IMPL;
import sar.drone.drn.DepY_Impl;
import sar.drone.drn.DepZ_Impl;
import sar.drone.drn.DirectionType;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Expression;
import sar.drone.drn.InitialDirection;
import sar.drone.drn.InitialPositionX;
import sar.drone.drn.InitialPositionY;
import sar.drone.drn.LEFT;
import sar.drone.drn.Library;
import sar.drone.drn.Limit;
import sar.drone.drn.MaxHeight;
import sar.drone.drn.MaxLength;
import sar.drone.drn.MaxWidth;
import sar.drone.drn.Model;
import sar.drone.drn.Movement;
import sar.drone.drn.RIGHT;
import sar.drone.drn.RefDevice;
import sar.drone.drn.RefPart;
import sar.drone.drn.RefPartLib;
import sar.drone.drn.Rotate;
import sar.drone.drn.Surface;
import sar.drone.drn.UP;
import sar.drone.drn.Wifi;
import sar.drone.drn.impl.AndImpl;
import sar.drone.drn.impl.BACKWARDImpl;
import sar.drone.drn.impl.ContextImpl;
import sar.drone.drn.impl.DOWNImpl;
import sar.drone.drn.impl.DepX_ImplImpl;
import sar.drone.drn.impl.DepY_ImplImpl;
import sar.drone.drn.impl.DepZ_ImplImpl;
import sar.drone.drn.impl.FORWARDImpl;
import sar.drone.drn.impl.LEFTImpl;
import sar.drone.drn.impl.RIGHTImpl;
import sar.drone.drn.impl.RefPartImpl;
import sar.drone.drn.impl.RefPartLibImpl;
import sar.drone.drn.impl.RotateImpl;
import sar.drone.drn.impl.UPImpl;

public abstract class MyAbstractDrnValidator extends AbstractDeclarativeValidator {
	static float DEFAULTMAXSPEED = 20; //dm per sec
	static float DEFAULTMINSPEED = 1; //dm per sec
	static float MAXSPEED = -1; //dm per sec
	static float MINSPEED = -1; //dm per sec
	
	static int xCurr;
	static int yCurr;
	static int zCurr;
	static int angleCurr;
	static int MAXW = Integer.MAX_VALUE;
	static int MAXL = Integer.MAX_VALUE;
	static int MAXZ = Integer.MAX_VALUE;
	static int nbmodel = 0;
	static int nbconfig = 0;
	
	@Check
	public void checkOnlyOneModel(final Model model){
		nbmodel++;
		if (nbmodel > 1){
			EList<EStructuralFeature> _eStructuralFeatures = DrnPackage.Literals.MODEL.getEStructuralFeatures();
			EStructuralFeature _get = _eStructuralFeatures.get(0);
		    this.error("There is already a choreography in the folder", model, _get);
		}
		nbmodel--;
	}

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(sar.drone.drn.DrnPackage.eINSTANCE);
		return result;
	}

	public final static String INVALID_NAME = "invalidast";

		/******************* Check merge ************************/
		/*
		 * Check if Merge arguments are compatible
		 */
	  @Check
	  public void checkMerge(final AndImpl and) {
	  	int rotate	= 0;
	  	int depx	= 0;
	  	int depy	= 0;
	  	int depz	= 0;

	  	rotate = and.getRotate().size();

	  	depx	= and.getDepx().size();
	  	depy	= and.getDepy().size();
	  	depz	= and.getDepz().size();

	    if ((depx > 1)) {
	      EList<EStructuralFeature> _eStructuralFeatures = DrnPackage.Literals.AND.getEStructuralFeatures();
	      EStructuralFeature _get = _eStructuralFeatures.get(0);
	      this.error("Can \'t merge many movements on X axis", and, _get);
	    }
	    if ((depy > 1)) {
	      EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.AND.getEStructuralFeatures();
	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
	      this.error("Can \'t merge many movements on Y axis", and, _get_1);
	    }
	    if ((depz > 1)) {
	      EList<EStructuralFeature> _eStructuralFeatures_2 = DrnPackage.Literals.AND.getEStructuralFeatures();
	      EStructuralFeature _get_2 = _eStructuralFeatures_2.get(0);
	      this.error("Can \'t merge many movements on Z axis", and, _get_2);
	    }
	    if ((rotate > 1)) {
	      EList<EStructuralFeature> _eStructuralFeatures_3 = DrnPackage.Literals.AND.getEStructuralFeatures();
	      EStructuralFeature _get_3 = _eStructuralFeatures_3.get(0);
	      this.error("Can \'t merge many rotations", and, _get_3);
	    }
	    if (((((depx + depy) + depz) + rotate) < 2)) {
	      EList<EStructuralFeature> _eStructuralFeatures_4 = DrnPackage.Literals.MODEL.getEStructuralFeatures();
	      EStructuralFeature _get_4 = _eStructuralFeatures_4.get(0);
	      this.error("Missing operands", and, _get_4);
	    }
	  }

	  /******************* Check reference on device ************************/
	  /*
	   * Check if a Reference to a device defines correctly the Device declared
	   */
	  @Check
	  public void checkRefDevice(final RefDevice ref) {

	    if ((Objects.equal(ref.getDev().getDeclarations(), null) && (!Objects.equal(ref.getDefinitions(), null))))
	    {
	      EList<EStructuralFeature> _eStructuralFeatures = DrnPackage.Literals.REF_DEVICE.getEStructuralFeatures();
	      EStructuralFeature _get = _eStructuralFeatures.get(0);
	      this.error("Too many arguments", ref, _get);
	    } 
	    else if (((!Objects.equal(ref.getDev().getDeclarations(), null)) && Objects.equal(ref.getDefinitions(), null)))
	    {
	        EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_DEVICE.getEStructuralFeatures();
	        EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
	        this.error("Missing arguments", ref, _get_1);
	    }
	    else if(ref.getDev().getDeclarations().size() > ref.getDefinitions().size())
	    {
	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_DEVICE.getEStructuralFeatures();
	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
	    	this.error("Missing arguments", ref, _get_1);
	    }
	    else if(ref.getDev().getDeclarations().size() < ref.getDefinitions().size())
	    {
	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_DEVICE.getEStructuralFeatures();
	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
	    	this.error("Too many arguments", ref, _get_1);
	    }
	    else{
	    	Boolean ok;
	    	int i;
	    	for( Declaration d : ref.getDev().getDeclarations()) {
	    		ok = false;
	    		i = 0;
	    		while(!ok && i < ref.getDefinitions().size()){
	    			if(d.getType() != null){
	    				if (d  ==  ref.getDefinitions().get(i).getLeft())
	    					ok = true;	    				
	    			}
    				else if(d.getTypePrimitif() != null){
	    				switch (d.getTypePrimitif()) {
						case STRING_TYPE:
							if (ref.getDefinitions().get(i).getText() != null) {
				    	    	ok = true;
							}	
							break;
						case INT_TYPE:
							if (ref.getDefinitions().get(i).getInt() != null) {
				    	    	ok = true;
							}

							break;
						case REAL_TYPE:
							if (ref.getDefinitions().get(i).getReal() != null) {
								ok = true;
							}
							break;
						case BOOL_TYPE:
							if (ref.getDefinitions().get(i).getInt() == null
							&& ref.getDefinitions().get(i).getText() == null
							&& ref.getDefinitions().get(i).getReal() == null) {
				    	    	ok = true;
							}
							break;
						default:
							break;
						}				
	    			}

	    			i++;
	    		}
	    		if(!ok) {
	    	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_DEVICE.getEStructuralFeatures();
	    	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
	    	    	this.error(d.getName()+" was not correctly defined", ref, _get_1);	    			
	    		}
	    	}
	    }
	  }

	  /******************* Check context ************************/
	  /*
	   * Check and set the context
	   */
	 
	  public static void checkContext(final ContextImpl ref, MyAbstractDrnValidator adv) {
		  Boolean toCheck = false;
		  int countX = 0;
		  int countD = 0;
		  int countY = 0;
		  zCurr = 0;
		  yCurr = 0;
		  xCurr = 0;
		  MAXW = Integer.MAX_VALUE;
		  MAXL = Integer.MAX_VALUE;
		  MAXZ = Integer.MAX_VALUE;

		  DirectionType d = null;
		  
		  for (Limit l : ref.getLimit()){
			  if (l instanceof Surface)
				  toCheck = true;
			  if (l instanceof InitialPositionX){
				  countX = 1;
				  xCurr = ((InitialPositionX) l).getValue();
			  }

			  if (l instanceof InitialPositionY){
				  countY = 1;
				  yCurr = ((InitialPositionY) l).getValue();
			  }
			  
			  if (l instanceof InitialDirection){
				  countD = 1;
				  d = ((InitialDirection) l).getValue();
				  if (d.equals(DirectionType.FRONT)){
					  angleCurr=0;					  
				  }
				  else if (d.equals(DirectionType.BEHIND)){
					  angleCurr=180;
				  }
				  else if (d.equals(DirectionType.RIGHT)){
					  angleCurr=90;
				  }
				  else{
					  angleCurr=-90;
				  }
			  }

			  
			  if (l instanceof MaxWidth)
				 MAXW = ((MaxWidth) l).getValue();

			  if (l instanceof MaxLength)
				  MAXL = ((MaxLength) l).getValue();

			  if (l instanceof MaxHeight)
				  MAXZ = ((MaxHeight) l).getValue();
			  
		  }

		  if (countX > 1) {
  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
  	    	adv.error("Too many initial positions X", ref, _get_1);
		  }
		  if (countY > 1) {
  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
  	    	adv.error("Too many initial positions Y", ref, _get_1);
		  }
		  if (countD > 1) {
  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
  	    	adv.error("Too many initial direction", ref, _get_1);
		  }
		  if (toCheck) {	 
			  //Check if there are intial position X, position Y and an initial direction
			  if (countX == 0) {
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	adv.error("Initial position X is not iniatialized", ref, _get_1);				  
			  }
			  
			  if (countY == 0) {
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	adv.error("Initial position Y is not iniatialized", ref, _get_1);				  
			  }
			  if (countD == 0) {
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	adv.error("Initial direction is not iniatialized", ref, _get_1);				  
			  }
			  
			  //Check if initial position are inside the surface
			  if(yCurr > MAXL){
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	adv.error("Drone is out of max length", ref, _get_1);
			  }
			  if(xCurr > MAXW){
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	adv.error("Drone is out of max width", ref, _get_1);
			  }
		  }
	  }

	  /******************* Check drone position ************************/
		class ReccException extends Exception {
			private static final long serialVersionUID = 1L;
			EObject target;
			boolean contained;
			public ReccException(EObject ref, boolean isContained){
				target = ref;
				contained = isContained;
			}
		}

		class OutNotContainedException extends Exception {
			private static final long serialVersionUID = 1L;
		}
	  /*
	   * Check the position of the drone during all the choreogrphy
	   */
	  @Check
	  public void checkDronePosition(final Model ref) throws OutNotContainedException {
	  	if (ref.getMain() != null && ref.getContext() != null) {
	  		  MyAbstractDrnValidator.checkContext((ContextImpl) ref.getContext(), this);
			  System.out.println("*******************************");
			  System.out.println("Initial Drone state : "+"("+xCurr+","+yCurr+","+zCurr+")"+"("+angleCurr+")");
			  try {
			  	MyAbstractDrnValidator.checkDronePositionRef(ref.getMain(), this, true);
			  	((RefPartImpl)ref.getMain()).canBeWrite = true;
			  }
			  catch (ReccException e) {
				  EList<EStructuralFeature> _eStructuralFeatures_1;
				  EStructuralFeature _get_1;
				  if (e.target instanceof RefPart && e.contained){
					  _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
					  _get_1 = _eStructuralFeatures_1.get(0);
					  RefPartImpl r = (RefPartImpl) e.target;
					  r.canBeWrite = false;
					  this.error("This call creates an infinite loop", e.target, _get_1);
				  }
				  else if(e.target instanceof RefPartLib) {
					  _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART_LIB.getEStructuralFeatures();
					  _get_1 = _eStructuralFeatures_1.get(0);
					  RefPartLibImpl r = (RefPartLibImpl) e.target;
					  r.canBeWrite = false;
					  this.error("This call creates an infinite loop", e.target, _get_1);
				  }
			  }
			  finally {
				  MyAbstractDrnValidator.resetRefMark(ref.getMain());				
			  }
		  }
	  }

	  static void checkDronePositionRef(final RefPart ref, MyAbstractDrnValidator adv, boolean isContained) throws ReccException, OutNotContainedException{
		  Assignement a = ref.getVariable_partie();
		  Assignement c;
		  System.out.println("---Assignement : "+a.getName()+"---");
		  if (a.getCaller() == null){
			  a.setCaller(a);
		  }
		  System.out.println("call by : "+a.getCaller().getName());			  

		  for (Expression e : a.getOperandes()) {
			  if(e.getMove() instanceof RefPart) {
				  c = (Assignement)((RefPart) e.getMove()).getVariable_partie().getCaller();
				  if(c == null) {
					  ((RefPart) e.getMove()).getVariable_partie().setCaller(a);
				  }
				  else if (c != a
						  || ((RefPart) e.getMove()).getVariable_partie() == a
						  || ((RefPart) e.getMove()).getVariable_partie() == c){
					  System.out.println("LOOP:"+ref);
					  ReccException rex = adv.new ReccException(ref, isContained);
					  throw rex;
				  }
			  }
			  else if (e.getMove() instanceof RefPartLib){
				  c = (Assignement)((RefPartLib) e.getMove()).getAssignement().getCaller();
				  if(c == null) {
					  ((RefPartLib) e.getMove()).getAssignement().setCaller(a);
				  }
				  else if (c != a
						  || ((RefPartLib) e.getMove()).getAssignement() == a
						  || ((RefPartLib) e.getMove()).getAssignement() == c){
					  ReccException rex = adv.new ReccException(ref, isContained);
					  throw rex;
				  }
			  }
			  MyAbstractDrnValidator.checkDronePositionExpression(e, adv, isContained);	
			  for (int i = 1; i < e.getRepeatCST(); i++){
				  MyAbstractDrnValidator.checkDronePositionExpression(e, adv, isContained);					  
			  }
			  
			  if(e instanceof RefPart)
				  ((RefPart) e.getMove()).getVariable_partie().setCaller(null);
			  else if(e instanceof RefPartLib)
					  ((RefPartLib) e.getMove()).getAssignement().setCaller(null);

			  //If we are in a contained ref we print the error on it
			  //else we throws an error which will be catched by the concerned ref part lib
			  if(xCurr < 0 || xCurr > MAXW) {
				  if(isContained) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);							  
				  }
				  else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }

			  if(yCurr < 0 || yCurr > MAXL) {
				  if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);							  
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }

			  if(zCurr < 0 || zCurr > MAXZ) {
				  if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);							  
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
		  }
		  a.setCaller(null);
	  }
  
	  static void checkDronePositionRefPartLib(final RefPartLib ref, MyAbstractDrnValidator adv, boolean isContained) throws ReccException{
		  Assignement a = ref.getAssignement();
		  Assignement c;
		  System.out.println("---Assignement : "+a.getName()+"---");
		  if (a.getCaller() != null)
			  System.out.println("call by : "+a.getCaller().getName());
		  else
			  System.out.println("call by : null");

		  for (Expression e : a.getOperandes()) {
			  
			  try {
				  if(e.getMove() instanceof RefPart) {
					  c = (Assignement)((RefPart) e.getMove()).getVariable_partie().getCaller();
					  if(c == null) {
						  ((RefPart) e.getMove()).getVariable_partie().setCaller(a);
					  }
					  else if(c != a
							  || ((RefPartLib) e.getMove()).getAssignement() == a
							  || ((RefPartLib) e.getMove()).getAssignement() == c){
						  ReccException rex = adv.new ReccException(ref, isContained);
						  throw rex;
					  }
				  }

				  MyAbstractDrnValidator.checkDronePositionExpression(e, adv, false);
				  for (int i = 1; i < e.getRepeatCST(); i++){
					  MyAbstractDrnValidator.checkDronePositionExpression(e, adv, false);					  
				  }
				  if(e instanceof RefPart)
					  ((RefPart) e.getMove()).getVariable_partie().setCaller(null);
			  }
			  //If we catch an error we will print the error on the current ref part lib
			  catch(OutNotContainedException oe) {
				  if(xCurr < 0 || xCurr > MAXW) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART_LIB.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  
				  if(yCurr < 0 || yCurr > MAXL) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART_LIB.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
				  if(zCurr < 0 || zCurr > MAXZ) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART_LIB.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }	
			  }
		  }
		  a.setCaller(null);
	  }

	  static void checkDronePositionExpression(final Expression ref, MyAbstractDrnValidator adv, boolean isContained) throws ReccException, OutNotContainedException{
		  MyAbstractDrnValidator.checkDronePositionMovement(ref.getMove(),adv, isContained);
		  for (Expression eThen : ref.getThen()) {
				  MyAbstractDrnValidator.checkDronePositionExpression(eThen, adv, isContained);
		  }
	  }

	  static void checkDronePositionMovement(final Movement ref, MyAbstractDrnValidator adv, boolean isContained) throws ReccException, OutNotContainedException{
		  if(ref instanceof RefPart){
			  MyAbstractDrnValidator.checkDronePositionRef((RefPart)ref, adv, isContained);
			  ((RefPartImpl)ref).canBeWrite = true;
		  }
		  if(ref instanceof RefPartLib){
			  MyAbstractDrnValidator.checkDronePositionRefPartLib((RefPartLib)ref, adv, isContained);
			  ((RefPartLibImpl)ref).canBeWrite = true;
		  }
		  else if (ref instanceof Rotate){
			  MyAbstractDrnValidator.checkDronePositionRotate((Rotate) ref, adv, isContained);
		  }
		  else if (ref instanceof DepZ_Impl){
		  	MyAbstractDrnValidator.checkDronePositionDepZ((DepZ_Impl) ref, adv, isContained);
		  }
		  else if ( ref instanceof DepY_Impl){
		  	MyAbstractDrnValidator.checkDronePositionDepY((DepY_Impl) ref, adv, isContained);
		  }
		  else if(ref instanceof DepX_Impl){
		  	MyAbstractDrnValidator.checkDronePositionDepX((DepX_Impl) ref, adv, isContained);
		  }
		  else if (ref instanceof DepXY_IMPL){
		  	MyAbstractDrnValidator.checkDronePositionDepXY((DepXY_IMPL) ref, adv, isContained);
		  }
		  else if (ref instanceof DepXZ_IMPL){
		  	MyAbstractDrnValidator.checkDronePositionDepXZ( (DepXZ_IMPL) ref, adv, isContained);
		  }
		  else if (ref instanceof DepYZ_IMPL){
		  	MyAbstractDrnValidator.checkDronePositionDepYZ((DepYZ_IMPL) ref, adv, isContained);
		  }
		  else if (ref instanceof And){
		  	MyAbstractDrnValidator.checkDronePositionAnd((And) ref, adv, isContained);
		  }
	  }

	  static void checkDronePositionRotate(final Rotate ref, MyAbstractDrnValidator adv, boolean isContained){
		  angleCurr = ((angleCurr + Integer.parseInt(((Rotate)ref).getAngleCST())) + 361) % 361;
		  System.out.println(((Rotate) ref).getName()+"Drone state : "+"("+xCurr+","+yCurr+","+zCurr+")"+"("+angleCurr+")");
	  }

	  static void checkDronePositionDepX(final DepX_Impl ref, MyAbstractDrnValidator adv, boolean isContained) throws OutNotContainedException{
	  	int angleTMP, l;
		  angleTMP = angleCurr;
		  l = ((DepX_Impl) ref).getDistanceCST();
		  
		  if (ref instanceof LEFT)
			  angleTMP = (270 + angleTMP) % 361;
		  else if (ref instanceof RIGHT)
			  angleTMP = (90 + angleTMP) % 361;

		  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
		  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);

		  if(xCurr < 0 || xCurr > MAXW) {
	  	      if(isContained){
	  	    	  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
		  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);							  
			  }else{
				  OutNotContainedException oe = adv.new OutNotContainedException();
				  throw oe;
			  }
		  }

		  if(yCurr < 0 || yCurr > MAXL) {
			  if(isContained){
				  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
		  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);				  
			  }else{
				  OutNotContainedException oe = adv.new OutNotContainedException();
				  throw oe;
			  }
		  }

		  if(zCurr < 0 || zCurr > MAXZ) {
			  if(isContained){
				  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
		  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
			  }else{
				  OutNotContainedException oe = adv.new OutNotContainedException();
				  throw oe;
			  }
		  }
		  System.out.println(((DepX_Impl) ref).getName()+"Drone state : "+"("+xCurr+","+yCurr+","+zCurr+")"+"("+angleCurr+")");
	  }

	  static void checkDronePositionDepY(final DepY_Impl ref, MyAbstractDrnValidator adv, boolean isContained) throws OutNotContainedException{
	  	int angleTMP, l;
	  	angleTMP = angleCurr;
		  l = ((DepY_Impl) ref).getDistanceCST();
		  
		  if (ref instanceof BACKWARD)
			  angleTMP = (180 + angleTMP) % 361 ;

		  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
		  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);

		  if(xCurr < 0 || xCurr > MAXW) {
			  if(isContained){
	  	    	  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
		  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);							  
			  }else{
				  OutNotContainedException oe = adv.new OutNotContainedException();
				  throw oe;
			  }
	  	      
		  }
		  
		  if(yCurr < 0 || yCurr > MAXL) {
	  	      if(isContained){
	  	    	  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
		  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);							  
			  }else{
				  OutNotContainedException oe = adv.new OutNotContainedException();
				  throw oe;
			  }
		  }
		  
		  if(zCurr < 0 || zCurr > MAXZ) {
	  	      if(isContained){
	  	    	  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
		  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);							  
			  }else{
				  OutNotContainedException oe = adv.new OutNotContainedException();
				  throw oe;
			  }
		  }
		  System.out.println(((DepY_Impl) ref).getName()+"Drone state : "+"("+xCurr+","+yCurr+","+zCurr+")"+"("+angleCurr+")");
	  }

	  static void checkDronePositionDepZ(final DepZ_Impl ref, MyAbstractDrnValidator adv, boolean isContained) throws OutNotContainedException{
		  if (ref instanceof DOWN) {
			  zCurr -= ((DOWN)ref).getDistanceCST();			  
		  }
		  else if (ref instanceof UP) {
			  zCurr += ((UP)ref).getDistanceCST();			  
		  }
		  if( zCurr > MAXZ) {
	  	      if(isContained){
	  	    	  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_ZIMPL.getEStructuralFeatures();
		  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);							  
			  }else{
				  OutNotContainedException oe = adv.new OutNotContainedException();
				  throw oe;
			  }
		  }
		  
		  if( zCurr < 0) {
	  	      if(isContained){
	  	    	  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_ZIMPL.getEStructuralFeatures();
		  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);							  
			  }else{
				  OutNotContainedException oe = adv.new OutNotContainedException();
				  throw oe;
			  }
		  }
		  System.out.println(((DepZ_Impl) ref).getName()+"Drone state : "+"("+xCurr+","+yCurr+","+zCurr+")"+"("+angleCurr+")");
	  }

	  static void checkDronePositionAnd(final And ref, MyAbstractDrnValidator adv, boolean isContained){
		  System.out.println("******** AND CHECK ********");
		  int precx, precy, precz, precangle;
		  
		  precx = xCurr;
		  precy = yCurr;
		  precz = zCurr;
		  precangle = angleCurr;

		  DepX_Impl depX= ref.getDepx().size()>0 ? ref.getDepx().get(0) : null;
		  DepX_Impl subX;
		  int nbiterX = 0;
		  
		  DepY_Impl depY = ref.getDepy().size()>0 ? ref.getDepy().get(0) : null;
		  DepY_Impl subY;
		  int nbiterY = 0;

		  DepZ_Impl depZ = ref.getDepz().size()>0 ? ref.getDepz().get(0) : null;
		  DepZ_Impl subZ;
		  int nbiterZ = 0;

		  Rotate depR = ref.getRotate().size()>0 ? ref.getRotate().get(0) : null;
		  Rotate subR;
		  int nbiterR = 0;

		  ArrayList<Movement> moves = new ArrayList<Movement>();

		  if (depX != null){
			  if(depX instanceof RIGHTImpl){
				  subX = new RIGHTImpl();
			  }
			  else{
				  subX = new LEFTImpl();				  
			  }
			  subX.setTempsCST(1);
			  subX.setDistanceCST(depX.getDistanceCST()/depX.getTempsCST());
			  nbiterX = depX.getTempsCST();
			  moves.add(subX);
			  subX.setName(depX.getName());
		  }
		  if (depY != null){
			  if(depY instanceof FORWARDImpl)
				  subY = new FORWARDImpl();
			  else
				  subY = new BACKWARDImpl();

			  subY.setTempsCST(1);
			  subY.setDistanceCST(depY.getDistanceCST()/depY.getTempsCST());
			  nbiterY = depY.getTempsCST();
			  subY.setName(depY.getName());
			  moves.add(subY);
		  }
		  if (depZ != null){
			  if(depZ instanceof UPImpl)
				  subZ = new UPImpl();
			  else
				  subZ = new DOWNImpl();			  
			  subZ.setTempsCST(1);
			  subZ.setDistanceCST(depZ.getDistanceCST()/depZ.getTempsCST());
			  moves.add(subZ);
			  subZ.setName(depZ.getName());
			  nbiterZ = depZ.getTempsCST();
		  }
		  if (depR != null){  
			  subR = new RotateImpl();
			  moves.add(subR);
			  subR.setTempsCST(1);
			  subR.setAngleCST(""+ Integer.parseInt(depR.getAngleCST()) / depR.getTempsCST());
			  nbiterR = depR.getTempsCST();
			  subR.setName(depR.getName());
		  }

		  //Compute the total time of merge
		  try{
			  while ( nbiterR > 0 || nbiterX > 0 || nbiterY > 0 || nbiterZ > 0) {
				  for(Movement m : moves){
					  if(m instanceof Rotate && nbiterR > 0){
						  checkDronePositionRotate((Rotate) m, adv, false);
						  nbiterR--;
					  }
					  else if (m instanceof DepX_ImplImpl && nbiterX > 0){
						  checkDronePositionDepX((DepX_Impl) m, adv, false);
						  nbiterX--;
					  }
					  else if (m instanceof DepY_ImplImpl && nbiterY > 0){
						  checkDronePositionDepY((DepY_Impl) m, adv, false);
						  nbiterY--;
					  }
					  else if (m instanceof DepZ_ImplImpl && nbiterZ > 0){
						  checkDronePositionDepZ((DepZ_Impl) m, adv, false);
						  nbiterZ--;
					  }
				  }
			  }			  
		  }
		  catch(OutNotContainedException e){
  	    	  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.AND.getEStructuralFeatures();
	  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
	  	      adv.error("Drone is out of range"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
	  	      xCurr = precx;
	  	      yCurr = precy;
	  	      zCurr = precz;
	  	      angleCurr = precangle;
		  }

		  System.out.println("******** FIN AND CHECK ********");
	  }

	  static void checkDronePositionDepXY(final DepXY_IMPL ref, MyAbstractDrnValidator adv, boolean isContained) throws OutNotContainedException{
	  	int angleTMP, l;
	  	if( ref instanceof CARREXY){
			  l = ((CARREXY) ref).getCoteCST();
			  //Go to the left
			  angleTMP = (270 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);

			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }

			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  //Go forward
			  xCurr = MyAbstractDrnValidator.calculX(angleCurr, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleCurr, l, yCurr);

			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  
			  //Go to the right
			  angleTMP = (90 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  //Go backward
			  angleTMP = (180 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  
			  //Go to the left
			  angleTMP = (270 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
	  	}
	  	
	  	if( ref instanceof CERCLEXY){
			  l = ((CERCLEXY) ref).getRayonCST()*2;

			  //Go to the left
			  angleTMP = (270 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);

			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }

			  //Go forward
			  xCurr = MyAbstractDrnValidator.calculX(angleCurr, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleCurr, l, yCurr);

			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
		  	      }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }				  
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  
			  //Go to the right
			  angleTMP = (90 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }

			  //Go backward
			  angleTMP = (180 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  
			  //Go to the left
			  angleTMP = (270 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
		  	    	  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
			  	  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
				  if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXY.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
	  	}
	  	System.out.println(((DepXY_IMPL) ref).getName()+"Drone state : "+"("+xCurr+","+yCurr+","+zCurr+")"+"("+angleCurr+")");
	  }

	  static void checkDronePositionDepYZ(final DepYZ_IMPL ref, MyAbstractDrnValidator adv, boolean isContained) throws OutNotContainedException{
		  int angleTMP, l;

		  if( ref instanceof CARREYZ){
			  l = ((CARREYZ) ref).getCoteCST();
			  
			  //Go backward
			  angleTMP = (180 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);

			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }

			  //Go UP
			  zCurr += l;
			  if(zCurr < 0 || zCurr > MAXZ) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }

			  //Go forward
			  angleTMP = angleCurr;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }

			  //Go DOWN
			  zCurr -= l;

			  //Go backward
			  angleTMP = (180 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
	  	}
	  	
	  	if( ref instanceof CERCLEYZ){
			  l = ((CERCLEYZ) ref).getRayonCST()*2;
			  
			  //Go backward
			  angleTMP = (180 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }

			  //Go UP
			  zCurr += l;
			  if(zCurr < 0 || zCurr > MAXZ) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }				  
			  }

			  //Go forward
			  angleTMP = angleCurr;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }				  
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }				  
			  }

			  //Go DOWN
			  zCurr -= l;

			  //Go backward
			  angleTMP = (180 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }				  
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEYZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }				  
			  }
	  	}
	  	System.out.println(((DepYZ_IMPL) ref).getName()+"Drone state : "+"("+xCurr+","+yCurr+","+zCurr+")"+"("+angleCurr+")");
	  }

	  static void checkDronePositionDepXZ(final DepXZ_IMPL ref, MyAbstractDrnValidator adv, boolean isContained) throws OutNotContainedException{
	  	int angleTMP,l;
	  	if( ref instanceof CARREXZ){
			  l = ((CARREXZ) ref).getCoteCST();
			  //Go to the left
			  angleTMP = (270 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);

			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  //Go UP
			  zCurr += l;
			  if(zCurr < 0 || zCurr > MAXZ) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }

			  //Go to the right
			  angleTMP = (90 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }
			  //Go DOWN
			  zCurr -= l;
			  
			  //Go to the left
			  angleTMP = (270 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CARREXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }
	  	}
	  	
	  	if( ref instanceof CERCLEXZ){
			  l = ((CERCLEXZ) ref).getRayonCST() *2;
			  
			//Go to the left
			  angleTMP = (270 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }
			  //Go UP
			  zCurr += l;
			  if(zCurr < 0 || zCurr > MAXZ) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }

			  //Go to the right
			  angleTMP = (90 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.warning("Drone can be out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }
			  }
			  //Go DOWN
			  zCurr -= l;
			  
			  //Go to the left
			  angleTMP = (270 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);
			  if(xCurr < 0 || xCurr > MAXW) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }
			  if(yCurr < 0 || yCurr > MAXL) {
		  	      if(isContained){
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CERCLEXZ.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }else{
					  OutNotContainedException oe = adv.new OutNotContainedException();
					  throw oe;
				  }

			  }
	  	}
	  	System.out.println(((DepXZ_IMPL) ref).getName()+"Drone state : "+"("+xCurr+","+yCurr+","+zCurr+")"+"("+angleCurr+")");
	  }

	  @Check
	  public void checkLibRecc(final Library ref){
		  for (Assignement a : ref.getAssignement()) {
			  a.setCaller(a);
			  try {
				  for (Expression e : a.getOperandes()) {
					  if (e.getMove() instanceof RefPart){
						  MyAbstractDrnValidator.checkLibReccRef((RefPart)e.getMove(), this);
					  }
				  }
			  }catch (ReccException e) {
				  EList<EStructuralFeature> _eStructuralFeatures_1;
				  _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
				  EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
				  RefPartImpl r = (RefPartImpl) e.target;
				  r.canBeWrite = false;
				  this.error("This call creates an infinite loop", e.target, _get_1);
			  }
			  finally {
				  MyAbstractDrnValidator.resetRefMark(a);				
			  }
		  }
	  }
	  static void checkLibReccRef(final RefPart ref, MyAbstractDrnValidator adv) throws ReccException{
		  Assignement a = ref.getVariable_partie();
		  Assignement c;
		  
		  for (Expression e : a.getOperandes()) {
			  if (e.getMove() instanceof RefPart){
				  c = (Assignement)((RefPart) e.getMove()).getVariable_partie().getCaller();
				  if(c == null) {
					  ((RefPart) e.getMove()).getVariable_partie().setCaller(a);
				  }
				  else if (c !=a
						  || ((RefPart) e.getMove()).getVariable_partie() == a
						  || ((RefPart) e.getMove()).getVariable_partie() == c){
					  
					  ReccException rex = adv.new ReccException(ref, false);
					  throw rex;
				  }
				  MyAbstractDrnValidator.checkLibReccRef((RefPart)e.getMove(), adv);  
			  }
		  }
	  }
	  
	  
	  static void resetRefMark(final EObject ref){
		  Assignement a;
		  if(ref instanceof RefPart)
			  a = ((RefPart) ref).getVariable_partie();
		  else if (ref instanceof RefPartLib)
			  a = ((RefPartLib) ref).getAssignement();
		  else
			  a = (Assignement) ref;

		  if(a.getCaller() != null){
			  a.setCaller(null);
			  for (Expression e : a.getOperandes()) {
				  if (e.getMove() instanceof RefPart){
					  MyAbstractDrnValidator.resetRefMark(e.getMove());					  
				  }
				  else if (e.getMove() instanceof RefPartLib){
					  MyAbstractDrnValidator.resetRefMark(e.getMove());
				  }
			  }			  
		  }
	  }

	  static int calculX(int angle, int l , int x){
		  return (int) (Math.sin(Math.toRadians(angle)) * l + x);
	  }
	  
	  static int calculY(int angle, int l , int y){
		  return (int) (Math.cos(Math.toRadians(angle)) * l + y);
	  }

	  /******************* Check reference on device ************************/
	  /*
	   * Check the velocity of all moves
	   */
	  @Check
	  public void checkSpeed(final Movement ref){
	  	float speed = 0;

	  	if(ref instanceof DepX_Impl){
	  		speed = ((float)((DepX_Impl) ref).getDistanceCST()) / ((float)((DepX_Impl) ref).getTempsCST());

	  		if (MAXSPEED > 0 && speed > MAXSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.error("This move is too fast", ref, _get_1);	  		
		  	} else if (DEFAULTMAXSPEED > 0 && speed > DEFAULTMAXSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.warning("This move is too fast", ref, _get_1);	  		
		  	}
		  	if (MINSPEED > 0 && speed < MINSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.error("This move is too slow", ref, _get_1);

		  	} else if (DEFAULTMINSPEED > 0 && speed < DEFAULTMINSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.warning("This move is too slow", ref, _get_1);	  		
		  	}

	  	}else if(ref instanceof DepY_Impl) {
	  		speed = ((float)((DepY_Impl) ref).getDistanceCST()) / ((float)((DepY_Impl) ref).getTempsCST());
	  		if (MAXSPEED > 0 && speed > MAXSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.error("This move is too fast", ref, _get_1);	  		
		  	} else if (DEFAULTMAXSPEED > 0 && speed > DEFAULTMAXSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.warning("This move is too fast", ref, _get_1);	  		
		  	}
		  	if (MINSPEED > 0 && speed < MINSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.error("This move is too slow", ref, _get_1);	  		
		  	} else if (DEFAULTMINSPEED > 0 && speed < DEFAULTMINSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.warning("This move is too slow", ref, _get_1);	  		
		  	}
	  	}else if(ref instanceof DepZ_Impl) {
	  		speed = ((float)((DepZ_Impl) ref).getDistanceCST()) / ((float)((DepZ_Impl) ref).getTempsCST());

	  		if (MAXSPEED > 0 && speed > MAXSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_ZIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.error("This move is too fast", ref, _get_1);	  		
		  	} else if (DEFAULTMAXSPEED > 0 && speed > DEFAULTMAXSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_ZIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.warning("This move is too fast", ref, _get_1);	  		
		  	}
		  	if (MINSPEED > 0 && speed < MINSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_ZIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.error("This move is too slow", ref, _get_1);	  		
		  	} else if (DEFAULTMINSPEED > 0 && speed < DEFAULTMINSPEED) {
			  	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_ZIMPL.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.warning("This move is too slow", ref, _get_1);	  		
		  	}
	  	}
	  }

	  @Check
	  public void checkIp(final ConnectionType conf){
		  if(conf instanceof Wifi){
			  if(!InetAddresses.isInetAddress(conf.getAdress())){
				  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONFIGURATION.getEStructuralFeatures();
			      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			      this.error("Drone adress ip is not correctly defined", conf, _get_1);
			  }			  
		  }
	  }
}

