package sar.drone.validation;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;

import com.google.common.base.Objects;

import sar.drone.drn.Assignement;
import sar.drone.drn.BACKWARD;
import sar.drone.drn.DOWN;
import sar.drone.drn.Declaration;
import sar.drone.drn.DepXY_IMPL;
import sar.drone.drn.DepXZ_IMPL;
import sar.drone.drn.DepX_Impl;
import sar.drone.drn.DepY_Impl;
import sar.drone.drn.DepZ_Impl;
import sar.drone.drn.DirectionType;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Expression;
import sar.drone.drn.InitialDirection;
import sar.drone.drn.InitialPositionX;
import sar.drone.drn.InitialPositionY;
import sar.drone.drn.LEFT;
import sar.drone.drn.Limit;
import sar.drone.drn.MaxHeigth;
import sar.drone.drn.MaxLength;
import sar.drone.drn.MaxWidth;
import sar.drone.drn.Model;
import sar.drone.drn.Movement;
import sar.drone.drn.RIGHT;
import sar.drone.drn.RefDevice;
import sar.drone.drn.RefPart;
import sar.drone.drn.Rotate;
import sar.drone.drn.Surface;
import sar.drone.drn.UP;
import sar.drone.drn.impl.AndImpl;
import sar.drone.drn.impl.ContextImpl;

public abstract class MyAbstractDrnValidator extends AbstractDeclarativeValidator {
	static int xCurr = 0;
	static int yCurr = 0;
	static int zCurr = 0;
	static int angleCurr = 0;
	static int MAXW = -1;
	static int MAXL = -1;
	static int MAXZ = -1;
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(sar.drone.drn.DrnPackage.eINSTANCE);
		return result;
	}
	
	  public final static String INVALID_NAME = "invalidast";
	  
	  @Check
	  public void checkExpression(final AndImpl and) {
	    EList<Rotate> _rotate = and.getRotate();
	    final int rotate = _rotate.size();
	    EList<DepXZ_IMPL> _depxz = and.getDepxz();
	    int _size = _depxz.size();
	    EList<DepXZ_IMPL> _depxz_1 = and.getDepxz();
	    int _size_1 = _depxz_1.size();
	    int _plus = (_size + _size_1);
	    EList<DepZ_Impl> _depz = and.getDepz();
	    int _size_2 = _depz.size();
	    final int depz = (_plus + ((int) _size_2));
	    EList<DepXY_IMPL> _depxy = and.getDepxy();
	    int _size_3 = _depxy.size();
	    EList<DepY_Impl> _depy = and.getDepy();
	    int _size_4 = _depy.size();
	    final int depy = (_size_3 + ((int) _size_4));
	    EList<DepX_Impl> _depx = and.getDepx();
	    int _size_5 = _depx.size();
	    EList<DepXY_IMPL> _depxy_1 = and.getDepxy();
	    int _size_6 = _depxy_1.size();
	    int _plus_1 = (_size_5 + _size_6);
	    EList<DepXZ_IMPL> _depxz_2 = and.getDepxz();
	    int _size_7 = _depxz_2.size();
	    final int depx = (_plus_1 + ((int) _size_7));
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
	    			if (d.getType() ==  ref.getDefinitions().get(i).getLeft().getType())
	    				ok = true;
	    			i++;
	    		}
	    		if(!ok) {
	    	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_DEVICE.getEStructuralFeatures();
	    	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
	    	    	this.error(d.getName()+" was not defined", ref, _get_1);	    			
	    		}
	    	}
	    }
	  }
	  
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
		  int maxHeigth = -1;
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
			  if (l instanceof MaxHeigth) {
				  maxHeigth = ((MaxHeigth) l).getValue();
				  MAXZ = maxHeigth;
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
		  	    	this.error("Drone is out of length", ref, _get_1);
			  }
			  if(maxWidth > 0 && x > maxWidth){
		  	    	EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.CONTEXT.getEStructuralFeatures();
		  	    	EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
		  	    	this.error("Drone is out of width", ref, _get_1);
			  }
		  }
	  }
	  
	  @Check
	  public void checkDronePosition(final Model ref) {
		  if (ref.getMain() != null) {
			  System.out.println("MAIN FOUND");
			  MyAbstractDrnValidator.checkDonePositionRefMain(ref.getMain(), this);
		  }
	  }

	  static void checkDonePositionRefMain(final RefPart ref, MyAbstractDrnValidator adv){
		  System.out.println("MAIN FOUND");
		  Assignement a = ref.getVariable_partie();
		  for (Expression e : a.getOperandes()) {
			  MyAbstractDrnValidator.checkDronePositionExpression(e, adv);
			  for (int i = 1; i < e.getRepeatCST(); i++)
				  MyAbstractDrnValidator.checkDronePositionExpression(e, adv);
		  }
	  }
	  static void checkDonePositionRef(final RefPart ref, MyAbstractDrnValidator adv){
		  System.out.println("REF FOUND");
		  Assignement a = ref.getVariable_partie();
		  for (Expression e : a.getOperandes()) {
			  MyAbstractDrnValidator.checkDronePositionExpression(e, adv);
			  for (int i = 1; i < e.getRepeatCST(); i++)
				  MyAbstractDrnValidator.checkDronePositionExpression(e, adv);
			  
			  if(MAXW > 0)
				  if(xCurr < 0 || xCurr > MAXW) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  
			  if(MAXL > 0)
				  if(yCurr < 0 || yCurr > MAXL) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  if(MAXZ > 0)
				  if(zCurr < 0 || zCurr > MAXZ) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
		  }
	  }
	  static void checkDronePositionExpression(final Expression ref, MyAbstractDrnValidator adv){
		  System.out.println("EXPRESSION FOUND");
		  MyAbstractDrnValidator.checkDronePositionMovement(ref.getMove(),adv);
		  for (Expression eThen : ref.getThen()) {
				  MyAbstractDrnValidator.checkDronePositionExpression(eThen, adv);
		  }
	  }

	  static void checkDronePositionMovement(final Movement ref, MyAbstractDrnValidator adv){
		  System.out.println("MOVEMENT FOUND");
		  if (ref instanceof Rotate){
			  angleCurr = ((angleCurr + Integer.parseInt(((Rotate)ref).getAngleCST())) + 361) % 361;
			  System.out.println(ref.getClass()+":: ("+xCurr+","+yCurr+","+zCurr+")("+angleCurr+")");

		  }
		  else if (ref instanceof DepZ_Impl) {
			  if (ref instanceof DOWN) {
				  zCurr -= ((DOWN)ref).getDistanceCST();			  
			  }
			  else if (ref instanceof UP) {
				  zCurr += ((UP)ref).getDistanceCST();			  
			  }

			  if(MAXW > 0)
				  if(xCurr < 0 || xCurr > MAXW) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_ZIMPL.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  
			  if(MAXL > 0)
				  if(yCurr < 0 || yCurr > MAXL) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_ZIMPL.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  if(MAXZ > 0)
				  if(zCurr < 0 || zCurr > MAXZ) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_ZIMPL.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  System.out.println(ref.getClass()+":: ("+xCurr+","+yCurr+","+zCurr+")("+angleCurr+")");

		  }
		  else if ( ref instanceof DepY_Impl){
			  int angleTMP = angleCurr;
			  int l = ((DepY_Impl) ref).getDistanceCST();
			  
			  if (ref instanceof BACKWARD)
				  angleTMP = (180 + angleTMP) % 361 ;

			  System.out.println("LAAAAAAAA");
			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);

			  if(MAXW > 0)
				  if(xCurr < 0 || xCurr > MAXW) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  
			  if(MAXL > 0)
				  if(yCurr < 0 || yCurr > MAXL) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  if(MAXZ > 0)
				  if(zCurr < 0 || zCurr > MAXZ) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_YIMPL.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  System.out.println(ref.getClass()+":: ("+xCurr+","+yCurr+","+zCurr+")("+angleCurr+")");

		  }
		  else if(ref instanceof DepX_Impl){
			  int angleTMP = angleCurr;
			  int l = ((DepX_Impl) ref).getDistanceCST();
			  
			  if (ref instanceof LEFT)
				  angleTMP = (270 + angleTMP) % 361;
			  else if (ref instanceof RIGHT)
				  angleTMP = (90 + angleTMP) % 361;

			  xCurr = MyAbstractDrnValidator.calculX(angleTMP, l, xCurr);
			  yCurr = MyAbstractDrnValidator.calculY(angleTMP, l, yCurr);

			  if(MAXW > 0)
				  if(xCurr < 0 || xCurr > MAXW) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of width"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  
			  if(MAXL > 0)
				  if(yCurr < 0 || yCurr > MAXL) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of length"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  if(MAXZ > 0)
				  if(zCurr < 0 || zCurr > MAXZ) {
					  EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.DEP_XIMPL.getEStructuralFeatures();
			  	      EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
			  	      adv.error("Drone is out of height"+"("+xCurr+","+yCurr+","+zCurr+")", ref, _get_1);
				  }
			  System.out.println(ref.getClass()+":: ("+xCurr+","+yCurr+","+zCurr+")("+angleCurr+")");

		  }
		  else if(ref instanceof RefPart){
			  MyAbstractDrnValidator.checkDonePositionRef((RefPart)ref, adv);
		  }
	  }
	  
	  static int calculX(int angle, int l , int x){
		  return (int) (Math.sin(Math.toRadians(angle)) * l + x);
	  }
	  
	  static int calculY(int angle, int l , int y){
		  return (int) (Math.cos(Math.toRadians(angle)) * l + y);
	  }
}

