/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.RefPart#getVariable_partie <em>Variable partie</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getRefPart()
 * @model
 * @generated
 */
public interface RefPart extends Movement
{
  /**
   * Returns the value of the '<em><b>Variable partie</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable partie</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable partie</em>' reference.
   * @see #setVariable_partie(Assignement)
   * @see sar.drone.drn.DrnPackage#getRefPart_Variable_partie()
   * @model
   * @generated
   */
  Assignement getVariable_partie();

  /**
   * Sets the value of the '{@link sar.drone.drn.RefPart#getVariable_partie <em>Variable partie</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable partie</em>' reference.
   * @see #getVariable_partie()
   * @generated
   */
  void setVariable_partie(Assignement value);

} // RefPart
