package sar.drone.validation;

import java.util.ArrayList;
import java.util.List;

import javax.naming.event.EventDirContext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;

import com.google.common.base.Objects;
import com.google.common.math.IntMath;

import sar.drone.drn.Assignement;
import sar.drone.drn.Declaration;
import sar.drone.drn.DepXY_IMPL;
import sar.drone.drn.DepXZ_IMPL;
import sar.drone.drn.DepX_Impl;
import sar.drone.drn.DepY_Impl;
import sar.drone.drn.DepZ_Impl;
import sar.drone.drn.DirectionType;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.InitialDirection;
import sar.drone.drn.InitialPositionX;
import sar.drone.drn.InitialPositionY;
import sar.drone.drn.Limit;
import sar.drone.drn.MaxHeigth;
import sar.drone.drn.MaxLength;
import sar.drone.drn.MaxWidth;
import sar.drone.drn.Model;
import sar.drone.drn.Parametre;
import sar.drone.drn.RefDevice;
import sar.drone.drn.RefPart;
import sar.drone.drn.Rotate;
import sar.drone.drn.Surface;
import sar.drone.drn.impl.AndImpl;
import sar.drone.drn.impl.ContextImpl;
import sar.drone.drn.impl.RefPartImpl;

public abstract class MyAbstractDrnValidator extends AbstractDeclarativeValidator {
	
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
	  public void checkReference(final RefPartImpl ref) {
	    if ((Objects.equal(ref.getVariable_partie().getParametre(), null) && (!Objects.equal(ref.getParams(), null)))) {
	      EList<EStructuralFeature> _eStructuralFeatures = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
	      EStructuralFeature _get = _eStructuralFeatures.get(0);
	      this.error("Too many arguments", ref, _get);
	    } else {
	      if (((!Objects.equal(ref.getVariable_partie().getParametre(), null)) && Objects.equal(ref.getParams(), null))) {
	        EList<EStructuralFeature> _eStructuralFeatures_1 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
	        EStructuralFeature _get_1 = _eStructuralFeatures_1.get(0);
	        this.error("Missing arguments", ref, _get_1);
	      } else {
	        Assignement _variable_partie = ref.getVariable_partie();
	        EList<Parametre> _parametre = _variable_partie.getParametre();
	        int _size = _parametre.size();
	        EList<String> _params = ref.getParams();
	        int _size_1 = _params.size();
	        boolean _greaterThan = (_size > _size_1);
	        if (_greaterThan) {
	          EList<EStructuralFeature> _eStructuralFeatures_2 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
	          EStructuralFeature _get_2 = _eStructuralFeatures_2.get(0);
	          this.error("Missing arguments", ref, _get_2);
	        } else {
	          Assignement _variable_partie_1 = ref.getVariable_partie();
	          EList<Parametre> _parametre_1 = _variable_partie_1.getParametre();
	          int _size_2 = _parametre_1.size();
	          EList<String> _params_1 = ref.getParams();
	          int _size_3 = _params_1.size();
	          boolean _lessThan = (_size_2 < _size_3);
	          if (_lessThan) {
	            EList<EStructuralFeature> _eStructuralFeatures_3 = DrnPackage.Literals.REF_PART.getEStructuralFeatures();
	            EStructuralFeature _get_3 = _eStructuralFeatures_3.get(0);
	            this.error("Too many arguments", ref, _get_3);
	          }
	        }
	      }
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
	    else if(ref.getDev().getDeclarations().size() > ref.getDefinitions().size())
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
				  if(((InitialPositionX) l).getValue() != null)
					  x = Integer.parseInt(((InitialPositionX) l).getValue());
			  }

			  if (l instanceof InitialPositionY){
				  countY = 1;
				  if(((InitialPositionY) l).getValue() != null)
					  y = Integer.parseInt(((InitialPositionY) l).getValue());
			  }
			  
			  if (l instanceof InitialDirection){
				  countD = 1;
				  d = ((InitialDirection) l).getValue();
			  }

			  
			  if (l instanceof MaxWidth)
				  if(((MaxWidth) l).getValue() != null)
					  maxWidth = Integer.parseInt(((MaxWidth) l).getValue());
			  if (l instanceof MaxLength)
				  if(((MaxLength) l).getValue() != null)
					  maxLength = Integer.parseInt(((MaxLength) l).getValue());
			  
			  if (l instanceof MaxHeigth)
				  if(((MaxHeigth) l).getValue() != null)
					  maxHeigth = Integer.parseInt(((MaxHeigth) l).getValue());
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
			 System.out.println("Width : "+maxWidth);
			 System.out.println("Length : "+maxLength);
			 System.out.println("Length : "+maxHeigth);
			 System.out.println("Initial X : "+x);
			 System.out.println("Initial Y : "+y);
			 System.out.println("Initial D : "+d);
			 
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
			  
			  
			  //Compute if the drone will be out of surface
			  checkPosition((Model)ref.eContainer(), maxWidth, maxLength, maxHeigth, x, y, 0, d);
		  }
	  }
	  
	  public void checkPosition(EObject ref,
			  					int width,
			  					int length,
			  					int heigth,
			  					int x,
			  					int y ,
			  					int h,
			  					DirectionType dir){
		  
		  if (ref instanceof Model){
			  if (((Model)ref).getMain() != null) {
				  checkPosition(((Model)ref).getMain(),
						  width,
						  length,
						  heigth,
						  x,
						  y,
						  h,
						  dir);
			  }			  
		  }
		  
		  else if(ref instanceof RefPart){
			  
		  }

	  }
}

