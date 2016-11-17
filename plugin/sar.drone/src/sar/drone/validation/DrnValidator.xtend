/*
 * generated by Xtext 2.10.0
 */
package sar.drone.validation

import org.eclipse.xtext.validation.Check
import sar.drone.drn.impl.AndImpl
import sar.drone.drn.DrnPackage
import sar.drone.drn.impl.RefPartImpl

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DrnValidator extends AbstractDrnValidator {
	
	public static val INVALID_NAME = 'invalidast'
//
	@Check
	def checkExpression(AndImpl and) {
		val rotate = and.getRotate().size()
		val depz = and.getDepxz().size()+and.getDepxz().size()+and.getDepz().size() as int
		val depy = and.getDepxy().size()+and.getDepy().size() as int
		val depx = and.getDepx().size()+and.getDepxy().size()+and.getDepxz().size() as int
	
	  if(depx>1){
			error('Can \'t merge many movements on X axis', 
					and,DrnPackage.Literals.AND.EStructuralFeatures.get(0));
	  }
	  if(depy>1){
			error('Can \'t merge many movements on Y axis', 
					and,DrnPackage.Literals.AND.EStructuralFeatures.get(0));
	  }
	  if(depz>1){
			error('Can \'t merge many movements on Z axis', 
					and,DrnPackage.Literals.AND.EStructuralFeatures.get(0));
	  }
	  if(rotate>1){
			error('Can \'t merge many rotations', 
					and,DrnPackage.Literals.AND.EStructuralFeatures.get(0));
	  }
	  if( depx+depy+depz+rotate<2){
			error('Missing operands', 
					and,DrnPackage.Literals.MODEL.EStructuralFeatures.get(0));
	  }	  
	}
	
		@Check
	def checkReference(RefPartImpl ref) {
		if( ref.variable_partie.parametre == null && ref.params != null){
			error('Too many arguments', 
					ref,DrnPackage.Literals.REF_PART.EStructuralFeatures.get(0));			
		}
		else if( ref.variable_partie.parametre != null && ref.params == null) {
			error('Missing arguments', 
					ref,DrnPackage.Literals.REF_PART.EStructuralFeatures.get(0));
			
		}
		else if ( ref.variable_partie.parametre.size() > ref.params.size()){
			error('Missing arguments', 
					ref,DrnPackage.Literals.REF_PART.EStructuralFeatures.get(0));			
		}
		else if ( ref.variable_partie.parametre.size() < ref.params.size()){
			error('Too many arguments', 
					ref,DrnPackage.Literals.REF_PART.EStructuralFeatures.get(0));			
		}
						
	}	
}
