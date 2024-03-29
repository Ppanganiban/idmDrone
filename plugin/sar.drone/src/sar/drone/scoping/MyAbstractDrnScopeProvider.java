package sar.drone.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.DelegatingScopeProvider;


import sar.drone.drn.Assignement;
import sar.drone.drn.Definition;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.Expression;
import sar.drone.drn.Library;
import sar.drone.drn.Model;
import sar.drone.drn.RefDevice;
import sar.drone.drn.RefPartLib;
import sar.drone.drn.Root;
import sar.drone.drn.With;

public abstract class MyAbstractDrnScopeProvider extends DelegatingScopeProvider {// implements IGlobalScopeProvider {
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference == DrnPackage.Literals.REF_DEVICE__DEFINITIONS
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
			if(def.getLeft().getType() != null)
				return Scopes.scopeFor(def.getLeft().getType().getElements());
		}
		
		else if (reference == DrnPackage.Literals.REF_PART_LIB__LIB
				&& context instanceof Assignement){
			Assignement a = (Assignement)context;
			Root r = (Root) a.eContainer();
			if(r instanceof Model){
				return Scopes.scopeFor(((Model)r).getLibraries());				
			}
		}
		else if (reference == DrnPackage.Literals.REF_PART_LIB__ASSIGNEMENT
				&& context instanceof RefPartLib){
			return Scopes.scopeFor( ((RefPartLib)context).getLib().getAssignement());
		}
		else if (reference == DrnPackage.Literals.REF_DEVICE__DEV
				&& context instanceof With){
			System.out.println(context);
			With w = (With) context;
			Expression e = (Expression)w.eContainer();
			Assignement a = (Assignement)e.eContainer();
			Root r = (Root) a.eContainer();
			if(r instanceof Model){
				return Scopes.scopeFor(((Model)r).getConfig().getDevices());	
			}
		}
		else if (reference == DrnPackage.Literals.REF_DEVICE__DEV
				&& context instanceof RefDevice){
			RefDevice rd = (RefDevice) context;
			With w = (With) rd.eContainer();
			Expression e = (Expression)w.eContainer();
			Assignement a = (Assignement)e.eContainer();
			Root r = (Root) a.eContainer();
			if (r instanceof Model) {
				if (((Model)r).getConfig() != null)
					return Scopes.scopeFor(((Model)r).getConfig().getDevices());
			}
		}
		else if (reference == DrnPackage.Literals.REF_PART__VARIABLE_PARTIE
				&& context instanceof Assignement){
			Assignement a = (Assignement)context;
			Root r = (Root) a.eContainer();
			if (r instanceof Model) {
				return Scopes.scopeFor(((Model)r).getAssignement());				
			}

			else if (r instanceof Library)
				return Scopes.scopeFor(((Library)r).getAssignement());
		}
		return super.getScope(context, reference);
	}

}
