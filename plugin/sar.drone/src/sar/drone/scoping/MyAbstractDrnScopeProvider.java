package sar.drone.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.DelegatingScopeProvider;

import sar.drone.drn.Attribut;
import sar.drone.drn.Definition;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.RefDevice;

public abstract class MyAbstractDrnScopeProvider extends DelegatingScopeProvider {
	@Override
	public IScope getScope(EObject context, EReference reference) {

		if (reference == DrnPackage.Literals.ATTRIBUT__ELMT
			&& context instanceof Attribut) {
			  Attribut a = (Attribut) context;
		      return Scopes.scopeFor(a.getType().getElements());
		}
		
		else if (reference == DrnPackage.Literals.REF_DEVICE__DEFINITIONS
				&& context instanceof RefDevice){
			RefDevice rd = (RefDevice) context;
			return Scopes.scopeFor(rd.getDev().getDeclarations());			
		}
		else if (reference == DrnPackage.Literals.DEFINITION__LEFT
				&& context instanceof RefDevice){
			RefDevice rd = (RefDevice) context;
			return Scopes.scopeFor(rd.getDev().getDeclarations());
		}
		else if (reference == DrnPackage.Literals.DEFINITION__LEFT
				&& context instanceof Definition){
			Definition def = (Definition) context;
			RefDevice rd = (RefDevice) def.eContainer();
			return Scopes.scopeFor(rd.getDev().getDeclarations());
		}
		else if (reference == DrnPackage.Literals.DEFINITION__RIGHT
				&& context instanceof Definition){
			Definition def = (Definition) context;
			return Scopes.scopeFor(def.getLeft().getType().getElements());
		}
		return super.getScope(context, reference);
	}	
}
