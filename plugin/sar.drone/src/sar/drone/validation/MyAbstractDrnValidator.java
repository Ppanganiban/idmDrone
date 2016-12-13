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
import sar.drone.drn.Assignement;
import sar.drone.drn.BACKWARD;
import sar.drone.drn.CARREXY;
import sar.drone.drn.CARREXZ;
import sar.drone.drn.CARREYZ;
import sar.drone.drn.CERCLEXY;
import sar.drone.drn.CERCLEXZ;
import sar.drone.drn.CERCLEYZ;
import sar.drone.drn.Configuration;
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
import sar.drone.drn.impl.AndImpl;
import sar.drone.drn.impl.ContextImpl;

public abstract class MyAbstractDrnValidator extends AbstractDeclarativeValidator {
	static float DEFAULTMAXSPEED = 20; //dm per sec
	static float DEFAULTMINSPEED = 1; //dm per sec
	static float MAXSPEED = -1; //dm per sec
	static float MINSPEED = -1; //dm per sec
	
	static int xCurr = 0;
	static int yCurr = 0;
	static int zCurr = 0;
	static int angleCurr = 0;
	static int MAXW = -1;
	static int MAXL = -1;
	static int MAXZ = -1;
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
	  	int depx		= 0;
	  	int depy		= 0;
	  	int depz		= 0;
	  	int depxy   = 0;
	  	int depxz   = 0;
	  	int depyz   = 0;
	  	boolean ok  = true;

	  	rotate = and.getRotate().size();

	  	depxy	= and.getDepxy().size();
	  	depxz = and.getDepxz().size();
	  	depyz = and.getDepyz().size();
	  	
	  	depx	= and.getDepx().size() + depxy + depxz;
	  	depy	= and.getDepy().size() + depxy + depyz;
	  	depz	= and.getDepz().size() + depxz + depyz;

	    if ((depx > 1)) {
	      EList<EStructuralFeature> _eStructuralFeatures = DrnPackage.Literals.AND.getEStructuralFeatures();
	      EStructuralFeature _get = _eStructuralFeatures.get(0);
	      this.error("Can \'t merge many movements on X axis", and, _get);
	      ok = false;
	    }
	    if ((depy > 1)) {
	      EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.AND.getEStructuralFeatures();
	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
	      this.error("Can \'t merge many movements on Y axis", and, _get_1);
	      ok = false;
	    }
	    if ((depz > 1)) {
	      EList<EStructuralFeature> _eStructuralFeatures_2 = DrnPackage.Literals.AND.getEStructuralFeatures();
	      EStructuralFeature _get_2 = _eStructuralFeatures_2.get(0);
	      this.error("Can \'t merge many movements on Z axis", and, _get_2);
	      ok = false;
	    }
	    if ((rotate > 1)) {
	      EList<EStructuralFeature> _eStructuralFeatures_3 = DrnPackage.Literals.AND.getEStructuralFeatures();
	      EStructuralFeature _get_3 = _eStructuralFeatures_3.get(0);
	      this.error("Can \'t merge many rotations", and, _get_3);
	      ok = false;
	    }
	    if (((((depx + depy) + depz) + rotate) < 2)) {
	      EList<EStructuralFeature> _eStructuralFeatures_4 = DrnPackage.Literals.MODEL.getEStructuralFeatures();
	      EStructuralFeature _get_4 = _eStructuralFeatures_4.get(0);
	      this.error("Missing operands", and, _get_4);
	      ok = false;
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
	  @Check
	  public void checkContext(final ContextImpl ref) {
		  Boolean toCheck = false;
		  int countX = 0;
		  int x = 0;
		  int countY = 0;
		  int y = 0;
		  int countD = 0;
		  int maxWidth = -1;
		  int maxLength = -1;
		  int MaxHeight = -1;
		  DirectionType d = null;
		  
		  for (Limit l : ref.getLimit()){
			  if (l instanceof Surface)
				  toCheck = true;
			  if (l instanceof InitialPositionX){
				  countX = 1;
				  x = ((InitialPositionX) l).getValue();
				  xCurr = x;
			  }

			  if (l instanceof InitialPositionY){
				  countY = 1;
				  y = ((InitialPositionY) l).getValue();
				  yCurr = y;
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

			  
			  if (l instanceof MaxWidth) {
				 maxWidth = ((MaxWidth) l).getValue();
				 MAXW = maxWidth;
			  }
			  if (l instanceof MaxLength) {
				  maxLength = ((MaxLength) l).getValue();
				  MAXL = maxLength;
			  }
			  if (l instanceof MaxHeight) {
				  MaxHeight = ((MaxHeight) l).getValue();
				  MAXZ = MaxHeight;
			  }
		  }

		  if (countX > 1) {
  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
  	    	this.error("Too many initial positions X", ref, _get_1);
		  }
		  if (countY > 1) {
  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
  	    	this.error("Too many initial positions Y", ref, _get_1);
		  }
		  if (countD > 1) {
  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
  	    	this.error("Too many initial direction", ref, _get_1);
		  }
		  if (toCheck) {	 
			  //Check if there are intial position X, position Y and an initial direction
			  if (countX == 0) {
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	this.error("Initial position X is not iniatialized", ref, _get_1);				  
			  }
			  
			  if (countY == 0) {
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	this.error("Initial position Y is not iniatialized", ref, _get_1);				  
			  }
			  if (countD == 0) {
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	this.error("Initial direction is not iniatialized", ref, _get_1);				  
			  }
			  
			  //Check if initial position are inside the surface
			  if(maxLength > 0 && y > maxLength){
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	this.error("Drone is out of max length", ref, _get_1);
			  }
			  if(maxWidth > 0 && x > maxWidth){
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	this.error("Drone is out of max width", ref, _get_1);
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
			  System.out.println("*******************************");
			  System.out.println("Initial Drone state : "+"("+xCurr+","+yCurr+","+zCurr+")"+"("+angleCurr+")");
			  try {
			  	MyAbstractDrnValidator.checkDronePositionRef(ref.getMain(), this, true);
			  }
			  catch (ReccException e) {
				  EList<EStructuralFeature> _eStructuralFeatures_1;
				  EStructuralFeature _get_1;
				  if (e.target instanceof RefPart && e.contained){
					  _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
					  _get_1 = _eStructuralFeatures_1.get(0);
					  this.error("This call creates an infinite loop", e.target, _get_1);
				  }
				  else if(e.target instanceof RefPartLib) {
					  _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART_LIB.getEStructuralFeatures();
					  _get_1 = _eStructuralFeatures_1.get(0);
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
		  System.out.println("---Assignement : "+a.getName()+"---");
		  if (a.isMark()) {
			  a.setMark(false);

			  for (Expression e : a.getOperandes()) {
				  MyAbstractDrnValidator.checkDronePositionExpression(e, adv, isContained);
				  for (int i = 1; i < e.getRepeatCST(); i++){
					  if(e.getMove() instanceof RefPart)
						  ((RefPart)e.getMove()).getVariable_partie().setMark(true);
					  if(e.getMove() instanceof RefPartLib)
						  ((RefPartLib)e.getMove()).getAssignement().setMark(true);

					  MyAbstractDrnValidator.checkDronePositionExpression(e, adv, isContained);					  
				  }
				  //If we are in a contained ref we print the error on it
				  //else we throws an error which will be catched by the concerned ref part lib
				  if(MAXW > 0)
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
				  
				  if(MAXL > 0)
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
				  if(MAXZ > 0)
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
		  }
		  else{
			  ReccException rex = adv.new ReccException(ref, isContained);
			  throw rex;
		  }
	  }
  
	  static void checkDronePositionRefPartLib(final RefPartLib ref, MyAbstractDrnValidator adv, boolean isContained) throws ReccException{
		  Assignement a = ref.getAssignement();
		  System.out.println("---Assignement : "+a.getName()+"---");
		  if (a.isMark()) {
			  a.setMark(false);
			  
			  for (Expression e : a.getOperandes()) {
				  
				  try {
					  MyAbstractDrnValidator.checkDronePositionExpression(e, adv, false);
					  for (int i = 1; i < e.getRepeatCST(); i++){
						  if(e.getMove() instanceof RefPart)
							  ((RefPart)e.getMove()).getVariable_partie().setMark(true);
						  if(e.getMove() instanceof RefPartLib)
							  ((RefPartLib)e.getMove()).getAssignement().setMark(true);

						  MyAbstractDrnValidator.checkDronePositionExpression(e, adv, false);					  
					  }
				  }
				  //If we catch an error we will print the error on the current ref part lib
				  catch(OutNotContainedException oe) {
					  if(MAXW > 0)
						  if(xCurr < 0 || xCurr > MAXW) {
							  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART_LIB.getEStructuralFeatures();
					  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
					  	      adv.error("Drone is out of max width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
						  }
					  
					  if(MAXL > 0)
						  if(yCurr < 0 || yCurr > MAXL) {
							  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART_LIB.getEStructuralFeatures();
					  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
					  	      adv.error("Drone is out of max length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
						  }
					  if(MAXZ > 0)
						  if(zCurr < 0 || zCurr > MAXZ) {
							  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART_LIB.getEStructuralFeatures();
					  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
					  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
						  }
				  }
			  }
		  }
		  else{
			  ReccException rex = adv.new ReccException(ref, isContained);
			  throw rex;
		  }
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
		  }
		  if(ref instanceof RefPartLib){
			  MyAbstractDrnValidator.checkDronePositionRefPartLib((RefPartLib)ref, adv, isContained);
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

		  if(MAXW > 0)
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
		  
		  if(MAXL > 0)
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
		  if(MAXZ > 0)
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

		  if(MAXW > 0)
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
		  
		  if(MAXL > 0)
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
		  if(MAXZ > 0)
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
		  if(MAXZ > 0)
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

	  static void checkDronePositionDepXY(final DepXY_IMPL ref, MyAbstractDrnValidator adv, boolean isContained) throws OutNotContainedException{
	  	int angleTMP, l;
	  	if( ref instanceof CARREXY){
			  l = ((CARREXY) ref).getCoteCST();
			  //Go to the left
			  angleTMP = (270 + angleCurr) % 361;
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l/2, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l/2, yCurr);

			  if(MAXW > 0)
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

			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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

			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXZ > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXZ > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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

			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXZ > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXZ > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  if(MAXW > 0)
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
			  if(MAXL > 0)
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
			  a.setMark(false);
			  try {
				  for (Expression e : a.getOperandes()) {
					  if (e.getMove() instanceof RefPart){
						  MyAbstractDrnValidator.checkLibReccRef((RefPart)e.getMove(), this);
						  for (int i = 1; i < e.getRepeatCST(); i++){
							  ((RefPart)e.getMove()).getVariable_partie().setMark(true);
							  MyAbstractDrnValidator.checkLibReccRef((RefPart)e.getMove(), this);		  
						  }
					  }
				  }
			  }catch (ReccException e) {
				  EList<EStructuralFeature> _eStructuralFeatures_1;
				  _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
				  EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
				  this.error("This call creates an infinite loop", e.target, _get_1);
			  }
			  finally {
				  MyAbstractDrnValidator.resetRefMark(a);				
			  }
		  }
	  }
	  static void checkLibReccRef(final RefPart ref, MyAbstractDrnValidator adv) throws ReccException{
		  Assignement a = ref.getVariable_partie();
		  if(a.isMark()){
			  a.setMark(false);
			  for (Expression e : a.getOperandes()) {
				  if (e.getMove() instanceof RefPart){
					  MyAbstractDrnValidator.checkLibReccRef((RefPart)e.getMove(), adv);
					  for (int i = 1; i < e.getRepeatCST(); i++){
						  ((RefPart)e.getMove()).getVariable_partie().setMark(true);
						  MyAbstractDrnValidator.checkLibReccRef((RefPart)e.getMove(), adv);		  
					  }
				  }
			  }
		  }
		  else{
			  ReccException rex = adv.new ReccException(ref, false);
			  throw rex;
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

		  if (!a.isMark()){
			  a.setMark(true);
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
	  public void checkIp(final Configuration conf){
		  if(!InetAddresses.isInetAddress(conf.getIp())){
			  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONFIGURATION.getEStructuralFeatures();
		      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		      this.error("Drone adress ip is not correctly defined", conf, _get_1);
		  }
	  }
}

