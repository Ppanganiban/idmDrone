/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.Camera#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getCamera()
 * @model
 * @generated
 */
public interface Camera extends Option
{
  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * The literals are from the enumeration {@link sar.drone.drn.Mode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see sar.drone.drn.Mode
   * @see #setMode(Mode)
   * @see sar.drone.drn.DrnPackage#getCamera_Mode()
   * @model
   * @generated
   */
  Mode getMode();

  /**
   * Sets the value of the '{@link sar.drone.drn.Camera#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see sar.drone.drn.Mode
   * @see #getMode()
   * @generated
   */
  void setMode(Mode value);

} // Camera
