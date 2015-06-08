/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PO Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.POBox#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getPOBox()
 * @model
 * @generated
 */
public interface POBox extends Address
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getPOBox_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.customerDsl.customerDsl.POBox#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

} // POBox
