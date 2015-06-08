/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Db</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb#getCustomers <em>Customers</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb#getOrders <em>Orders</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getCustomerDb()
 * @model
 * @generated
 */
public interface CustomerDb extends EObject
{
  /**
   * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
   * The list contents are of type {@link de.wwu.pi.acse.customerDsl.customerDsl.Customer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Customers</em>' containment reference list.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getCustomerDb_Customers()
   * @model containment="true"
   * @generated
   */
  EList<Customer> getCustomers();

  /**
   * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
   * The list contents are of type {@link de.wwu.pi.acse.customerDsl.customerDsl.Order}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orders</em>' containment reference list.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getCustomerDb_Orders()
   * @model containment="true"
   * @generated
   */
  EList<Order> getOrders();

  /**
   * Returns the value of the '<em><b>Products</b></em>' containment reference list.
   * The list contents are of type {@link de.wwu.pi.acse.customerDsl.customerDsl.Product}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Products</em>' containment reference list.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getCustomerDb_Products()
   * @model containment="true"
   * @generated
   */
  EList<Product> getProducts();

} // CustomerDb
