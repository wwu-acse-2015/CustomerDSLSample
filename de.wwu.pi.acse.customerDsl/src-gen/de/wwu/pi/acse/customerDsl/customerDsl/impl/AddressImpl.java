/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl.impl;

import de.wwu.pi.acse.customerDsl.customerDsl.Address;
import de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.AddressImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.AddressImpl#getZip <em>Zip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressImpl extends MinimalEObjectImpl.Container implements Address
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getZip() <em>Zip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZip()
   * @generated
   * @ordered
   */
  protected static final String ZIP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZip()
   * @generated
   * @ordered
   */
  protected String zip = ZIP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddressImpl()
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
    return CustomerDslPackage.Literals.ADDRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.ADDRESS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getZip()
  {
    return zip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZip(String newZip)
  {
    String oldZip = zip;
    zip = newZip;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.ADDRESS__ZIP, oldZip, zip));
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
      case CustomerDslPackage.ADDRESS__NAME:
        return getName();
      case CustomerDslPackage.ADDRESS__ZIP:
        return getZip();
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
      case CustomerDslPackage.ADDRESS__NAME:
        setName((String)newValue);
        return;
      case CustomerDslPackage.ADDRESS__ZIP:
        setZip((String)newValue);
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
      case CustomerDslPackage.ADDRESS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CustomerDslPackage.ADDRESS__ZIP:
        setZip(ZIP_EDEFAULT);
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
      case CustomerDslPackage.ADDRESS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CustomerDslPackage.ADDRESS__ZIP:
        return ZIP_EDEFAULT == null ? zip != null : !ZIP_EDEFAULT.equals(zip);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", zip: ");
    result.append(zip);
    result.append(')');
    return result.toString();
  }

} //AddressImpl
