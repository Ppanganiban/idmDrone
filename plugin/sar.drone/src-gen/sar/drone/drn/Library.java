/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.Library#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.Library#getTypes <em>Types</em>}</li>
 *   <li>{@link sar.drone.drn.Library#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends Root
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
   * @see sar.drone.drn.DrnPackage#getLibrary_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sar.drone.drn.Library#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link sar.drone.drn.TypeGeneric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see sar.drone.drn.DrnPackage#getLibrary_Types()
   * @model containment="true"
   * @generated
   */
  EList<TypeGeneric> getTypes();

  /**
   * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
   * The list contents are of type {@link sar.drone.drn.Device}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' containment reference list.
   * @see sar.drone.drn.DrnPackage#getLibrary_Devices()
   * @model containment="true"
   * @generated
   */
  EList<Device> getDevices();

} // Library