/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dep XY IMPL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.DepXY_IMPL#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.DepXY_IMPL#getTempsCST <em>Temps CST</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getDepXY_IMPL()
 * @model
 * @generated
 */
public interface DepXY_IMPL extends Movement
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
   * @see sar.drone.drn.DrnPackage#getDepXY_IMPL_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sar.drone.drn.DepXY_IMPL#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Temps CST</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temps CST</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temps CST</em>' attribute.
   * @see #setTempsCST(int)
   * @see sar.drone.drn.DrnPackage#getDepXY_IMPL_TempsCST()
   * @model
   * @generated
   */
  int getTempsCST();

  /**
   * Sets the value of the '{@link sar.drone.drn.DepXY_IMPL#getTempsCST <em>Temps CST</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temps CST</em>' attribute.
   * @see #getTempsCST()
   * @generated
   */
  void setTempsCST(int value);

} // DepXY_IMPL
