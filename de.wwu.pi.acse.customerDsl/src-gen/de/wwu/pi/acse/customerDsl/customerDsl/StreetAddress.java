/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Street Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress#getStreet <em>Street</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress#getCity <em>City</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getStreetAddress()
 * @model
 * @generated
 */
public interface StreetAddress extends Address
{
  /**
   * Returns the value of the '<em><b>Street</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Street</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Street</em>' attribute.
   * @see #setStreet(String)
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getStreetAddress_Street()
   * @model
   * @generated
   */
  String getStreet();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress#getStreet <em>Street</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Street</em>' attribute.
   * @see #getStreet()
   * @generated
   */
  void setStreet(String value);

  /**
   * Returns the value of the '<em><b>City</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>City</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>City</em>' attribute.
   * @see #setCity(String)
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getStreetAddress_City()
   * @model
   * @generated
   */
  String getCity();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress#getCity <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>City</em>' attribute.
   * @see #getCity()
   * @generated
   */
  void setCity(String value);

} // StreetAddress
