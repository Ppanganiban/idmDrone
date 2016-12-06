/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.Assignement#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.Assignement#getOperandes <em>Operandes</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getAssignement()
 * @model
 * @generated
 */
public interface Assignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sar.drone.drn.DrnPackage#getAssignement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sar.drone.drn.Assignement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Operandes</b></em>' containment reference list.
   * The list contents are of type {@link sar.drone.drn.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operandes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operandes</em>' containment reference list.
   * @see sar.drone.drn.DrnPackage#getAssignement_Operandes()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getOperandes();

	boolean isMark();

	void setMark(boolean b);

} // Assignement
