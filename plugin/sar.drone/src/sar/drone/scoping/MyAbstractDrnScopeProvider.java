package sar.drone.scoping;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.DelegatingScopeProvider;


import sar.drone.drn.Assignement;
import sar.drone.drn.Definition;
import sar.drone.drn.DrnPackage;
import sar.drone.drn.RefDevice;
import sar.drone.drn.RefPartLib;
import sar.drone.drn.Root;

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
			return Scopes.scopeFor(def.getLeft().getType().getElements());
		}
		else if (reference == DrnPackage.Literals.DEFINITION__INT
				){//&& context instanceof Definition){
			System.out.println("BLABLABL context: " + context + " reference: "+reference);
		}
		else if (reference == DrnPackage.Literals.REF_PART_LIB__LIBS
				&& context instanceof Assignement){
			Assignement a = (Assignement)context;
			Root r = (Root) a.eContainer();
			ArrayList<EObject> libs = new ArrayList<EObject>();
			libs.addAll(r.getLibraries());
			return Scopes.scopeFor(libs);
		}
		else if (reference == DrnPackage.Literals.REF_PART_LIB__ASSIGNEMENTS
				&& context instanceof RefPartLib){
			return Scopes.scopeFor( ((RefPartLib)context).getLibs().getAssignement());
		}
		else if (reference == DrnPackage.Literals.REF_DEVICE__DEV
				){//&& context instanceof Assignement){
		}
		else if (reference == DrnPackage.Literals.REF_PART__VARIABLE_PARTIE
				&& context instanceof Assignement){
			Assignement a = (Assignement)context;
			Root r = (Root) a.eContainer();
			return Scopes.scopeFor(r.getAssignement());
		}
		
		return super.getScope(context, reference);
	}

}
