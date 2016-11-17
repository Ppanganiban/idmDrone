/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.Context#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject
{
  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference list.
   * The list contents are of type {@link sar.drone.drn.Limit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference list.
   * @see sar.drone.drn.DrnPackage#getContext_Limit()
   * @model containment="true"
   * @generated
   */
  EList<Limit> getLimit();

} // Context
