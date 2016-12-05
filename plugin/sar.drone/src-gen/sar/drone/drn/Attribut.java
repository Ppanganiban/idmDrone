/**
 * generated by Xtext 2.10.0
 */
package sar.drone.drn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sar.drone.drn.Attribut#getName <em>Name</em>}</li>
 *   <li>{@link sar.drone.drn.Attribut#getType <em>Type</em>}</li>
 *   <li>{@link sar.drone.drn.Attribut#getElmt <em>Elmt</em>}</li>
 *   <li>{@link sar.drone.drn.Attribut#getMode <em>Mode</em>}</li>
 *   <li>{@link sar.drone.drn.Attribut#getInt <em>Int</em>}</li>
 *   <li>{@link sar.drone.drn.Attribut#getBool <em>Bool</em>}</li>
 * </ul>
 *
 * @see sar.drone.drn.DrnPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends EObject
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
   * @see sar.drone.drn.DrnPackage#getAttribut_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sar.drone.drn.Attribut#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(TypeGeneric)
   * @see sar.drone.drn.DrnPackage#getAttribut_Type()
   * @model
   * @generated
   */
  TypeGeneric getType();

  /**
   * Sets the value of the '{@link sar.drone.drn.Attribut#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeGeneric value);

  /**
   * Returns the value of the '<em><b>Elmt</b></em>' reference list.
   * The list contents are of type {@link sar.drone.drn.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elmt</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elmt</em>' reference list.
   * @see sar.drone.drn.DrnPackage#getAttribut_Elmt()
   * @model
   * @generated
   */
  EList<Element> getElmt();

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
   * @see sar.drone.drn.DrnPackage#getAttribut_Mode()
   * @model
   * @generated
   */
  Mode getMode();

  /**
   * Sets the value of the '{@link sar.drone.drn.Attribut#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see sar.drone.drn.Mode
   * @see #getMode()
   * @generated
   */
  void setMode(Mode value);

  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(String)
   * @see sar.drone.drn.DrnPackage#getAttribut_Int()
   * @model
   * @generated
   */
  String getInt();

  /**
   * Sets the value of the '{@link sar.drone.drn.Attribut#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #getInt()
   * @generated
   */
  void setInt(String value);

  /**
   * Returns the value of the '<em><b>Bool</b></em>' attribute.
   * The literals are from the enumeration {@link sar.drone.drn.EBool}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute.
   * @see sar.drone.drn.EBool
   * @see #setBool(EBool)
   * @see sar.drone.drn.DrnPackage#getAttribut_Bool()
   * @model
   * @generated
   */
  EBool getBool();

  /**
   * Sets the value of the '{@link sar.drone.drn.Attribut#getBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' attribute.
   * @see sar.drone.drn.EBool
   * @see #getBool()
   * @generated
   */
  void setBool(EBool value);

} // Attribut
