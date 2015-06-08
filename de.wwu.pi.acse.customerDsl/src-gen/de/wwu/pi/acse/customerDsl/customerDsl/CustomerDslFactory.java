/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage
 * @generated
 */
public interface CustomerDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CustomerDslFactory eINSTANCE = de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Customer Db</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Customer Db</em>'.
   * @generated
   */
  CustomerDb createCustomerDb();

  /**
   * Returns a new object of class '<em>Customer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Customer</em>'.
   * @generated
   */
  Customer createCustomer();

  /**
   * Returns a new object of class '<em>Address</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Address</em>'.
   * @generated
   */
  Address createAddress();

  /**
   * Returns a new object of class '<em>Street Address</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Street Address</em>'.
   * @generated
   */
  StreetAddress createStreetAddress();

  /**
   * Returns a new object of class '<em>PO Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PO Box</em>'.
   * @generated
   */
  POBox createPOBox();

  /**
   * Returns a new object of class '<em>Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order</em>'.
   * @generated
   */
  Order createOrder();

  /**
   * Returns a new object of class '<em>Product</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product</em>'.
   * @generated
   */
  Product createProduct();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CustomerDslPackage getCustomerDslPackage();

} //CustomerDslFactory
