/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl.impl;

import de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage;
import de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Street Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.StreetAddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.StreetAddressImpl#getCity <em>City</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreetAddressImpl extends AddressImpl implements StreetAddress
{
  /**
   * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreet()
   * @generated
   * @ordered
   */
  protected static final String STREET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreet()
   * @generated
   * @ordered
   */
  protected String street = STREET_EDEFAULT;

  /**
   * The default value of the '{@link #getCity() <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCity()
   * @generated
   * @ordered
   */
  protected static final String CITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCity()
   * @generated
   * @ordered
   */
  protected String city = CITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StreetAddressImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CustomerDslPackage.Literals.STREET_ADDRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStreet()
  {
    return street;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStreet(String newStreet)
  {
    String oldStreet = street;
    street = newStreet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.STREET_ADDRESS__STREET, oldStreet, street));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCity()
  {
    return city;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCity(String newCity)
  {
    String oldCity = city;
    city = newCity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.STREET_ADDRESS__CITY, oldCity, city));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CustomerDslPackage.STREET_ADDRESS__STREET:
        return getStreet();
      case CustomerDslPackage.STREET_ADDRESS__CITY:
        return getCity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CustomerDslPackage.STREET_ADDRESS__STREET:
        setStreet((String)newValue);
        return;
      case CustomerDslPackage.STREET_ADDRESS__CITY:
        setCity((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CustomerDslPackage.STREET_ADDRESS__STREET:
        setStreet(STREET_EDEFAULT);
        return;
      case CustomerDslPackage.STREET_ADDRESS__CITY:
        setCity(CITY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CustomerDslPackage.STREET_ADDRESS__STREET:
        return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
      case CustomerDslPackage.STREET_ADDRESS__CITY:
        return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (street: ");
    result.append(street);
    result.append(", city: ");
    result.append(city);
    result.append(')');
    return result.toString();
  }

} //StreetAddressImpl
