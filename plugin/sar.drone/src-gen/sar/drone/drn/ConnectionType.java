/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.ConnectionType#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.ConnectionType#getAdress <em>Adress</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getConnectionType()
 * @model
 * @generated
 */
public interface ConnectionType extends EObject
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
   * @see sar.drone.drn.DrnPackage#getConnectionType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sar.drone.drn.ConnectionType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Adress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adress</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adress</em>' attribute.
   * @see #setAdress(String)
   * @see sar.drone.drn.DrnPackage#getConnectionType_Adress()
   * @model
   * @generated
   */
  String getAdress();

  /**
   * Sets the value of the '{@link sar.drone.drn.ConnectionType#getAdress <em>Adress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adress</em>' attribute.
   * @see #getAdress()
   * @generated
   */
  void setAdress(String value);

} // ConnectionType
