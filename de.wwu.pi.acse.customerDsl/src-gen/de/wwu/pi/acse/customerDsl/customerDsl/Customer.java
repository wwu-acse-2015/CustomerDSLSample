/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer#getName <em>Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer#getFullName <em>Full Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject
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
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getCustomer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Full Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Full Name</em>' attribute.
   * @see #setFullName(String)
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getCustomer_FullName()
   * @model
   * @generated
   */
  String getFullName();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer#getFullName <em>Full Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Full Name</em>' attribute.
   * @see #getFullName()
   * @generated
   */
  void setFullName(String value);

  /**
   * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
   * The list contents are of type {@link de.wwu.pi.acse.customerDsl.customerDsl.Address}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addresses</em>' containment reference list.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getCustomer_Addresses()
   * @model containment="true"
   * @generated
   */
  EList<Address> getAddresses();

} // Customer
