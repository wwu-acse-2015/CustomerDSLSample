/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getName <em>Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getCustomer <em>Customer</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getAddress <em>Address</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject
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
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getOrder_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Customer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Customer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Customer</em>' reference.
   * @see #setCustomer(Customer)
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getOrder_Customer()
   * @model
   * @generated
   */
  Customer getCustomer();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getCustomer <em>Customer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Customer</em>' reference.
   * @see #getCustomer()
   * @generated
   */
  void setCustomer(Customer value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' reference.
   * @see #setAddress(Address)
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getOrder_Address()
   * @model
   * @generated
   */
  Address getAddress();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getAddress <em>Address</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' reference.
   * @see #getAddress()
   * @generated
   */
  void setAddress(Address value);

  /**
   * Returns the value of the '<em><b>Channel</b></em>' attribute.
   * The literals are from the enumeration {@link de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channel</em>' attribute.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel
   * @see #setChannel(OrderChannel)
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getOrder_Channel()
   * @model
   * @generated
   */
  OrderChannel getChannel();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getChannel <em>Channel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Channel</em>' attribute.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel
   * @see #getChannel()
   * @generated
   */
  void setChannel(OrderChannel value);

} // Order
