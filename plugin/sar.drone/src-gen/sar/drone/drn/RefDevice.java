/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.RefDevice#getDev <em>Dev</em>}</li>
 *   <li>{@link sar.drone.drn.RefDevice#getMode <em>Mode</em>}</li>
 *   <li>{@link sar.drone.drn.RefDevice#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getRefDevice()
 * @model
 * @generated
 */
public interface RefDevice extends EObject
{
  /**
   * Returns the value of the '<em><b>Dev</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dev</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dev</em>' reference.
   * @see #setDev(Device)
   * @see sar.drone.drn.DrnPackage#getRefDevice_Dev()
   * @model
   * @generated
   */
  Device getDev();

  /**
   * Sets the value of the '{@link sar.drone.drn.RefDevice#getDev <em>Dev</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dev</em>' reference.
   * @see #getDev()
   * @generated
   */
  void setDev(Device value);

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
   * @see sar.drone.drn.DrnPackage#getRefDevice_Mode()
   * @model
   * @generated
   */
  Mode getMode();

  /**
   * Sets the value of the '{@link sar.drone.drn.RefDevice#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see sar.drone.drn.Mode
   * @see #getMode()
   * @generated
   */
  void setMode(Mode value);

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link sar.drone.drn.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see sar.drone.drn.DrnPackage#getRefDevice_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefinitions();

} // RefDevice
