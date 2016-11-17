/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.Model#getContext <em>Context</em>}</li>
 *   <li>{@link sar.drone.drn.Model#getAssignement <em>Assignement</em>}</li>
 *   <li>{@link sar.drone.drn.Model#getMain <em>Main</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' containment reference.
   * @see #setContext(Context)
   * @see sar.drone.drn.DrnPackage#getModel_Context()
   * @model containment="true"
   * @generated
   */
  Context getContext();

  /**
   * Sets the value of the '{@link sar.drone.drn.Model#getContext <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' containment reference.
   * @see #getContext()
   * @generated
   */
  void setContext(Context value);

  /**
   * Returns the value of the '<em><b>Assignement</b></em>' containment reference list.
   * The list contents are of type {@link sar.drone.drn.Assignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignement</em>' containment reference list.
   * @see sar.drone.drn.DrnPackage#getModel_Assignement()
   * @model containment="true"
   * @generated
   */
  EList<Assignement> getAssignement();

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(RefPart)
   * @see sar.drone.drn.DrnPackage#getModel_Main()
   * @model containment="true"
   * @generated
   */
  RefPart getMain();

  /**
   * Sets the value of the '{@link sar.drone.drn.Model#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(RefPart value);

} // Model
