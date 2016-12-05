/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.Camera#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.Camera#getId <em>Id</em>}</li>
 *   <li>{@link sar.drone.drn.Camera#getAttributs <em>Attributs</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getCamera()
 * @model
 * @generated
 */
public interface Camera extends Option
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
   * @see sar.drone.drn.DrnPackage#getCamera_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sar.drone.drn.Camera#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see sar.drone.drn.DrnPackage#getCamera_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link sar.drone.drn.Camera#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

  /**
   * Returns the value of the '<em><b>Attributs</b></em>' containment reference list.
   * The list contents are of type {@link sar.drone.drn.Attribut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributs</em>' containment reference list.
   * @see sar.drone.drn.DrnPackage#getCamera_Attributs()
   * @model containment="true"
   * @generated
   */
  EList<Attribut> getAttributs();

} // Camera
