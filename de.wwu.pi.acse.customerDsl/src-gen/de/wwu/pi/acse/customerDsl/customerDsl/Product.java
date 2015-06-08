/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Product#getName <em>Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.Product#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject
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
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getProduct_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Product#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Price</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #setPrice(int)
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getProduct_Price()
   * @model
   * @generated
   */
  int getPrice();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.Product#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
  void setPrice(int value);

} // Product
