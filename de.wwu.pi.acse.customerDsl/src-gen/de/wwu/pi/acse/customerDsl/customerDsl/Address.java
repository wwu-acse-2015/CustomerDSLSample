/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Address#getName <em>Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Address#getZip <em>Zip</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject
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
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getAddress_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Address#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Zip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zip</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zip</em>' attribute.
   * @see #setZip(String)
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getAddress_Zip()
   * @model
   * @generated
   */
  String getZip();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Address#getZip <em>Zip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zip</em>' attribute.
   * @see #getZip()
   * @generated
   */
  void setZip(String value);

} // Address
