/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl.impl;

import de.wwu.pi.acse.customerDsl.customerDsl.Address;
import de.wwu.pi.acse.customerDsl.customerDsl.Customer;
import de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerImpl#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer
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
   * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullName()
   * @generated
   * @ordered
   */
  protected static final String FULL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullName()
   * @generated
   * @ordered
   */
  protected String fullName = FULL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddresses()
   * @generated
   * @ordered
   */
  protected EList<Address> addresses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomerImpl()
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
    return CustomerDslPackage.Literals.CUSTOMER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.CUSTOMER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFullName()
  {
    return fullName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFullName(String newFullName)
  {
    String oldFullName = fullName;
    fullName = newFullName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.CUSTOMER__FULL_NAME, oldFullName, fullName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Address> getAddresses()
  {
    if (addresses == null)
    {
      addresses = new EObjectContainmentEList<Address>(Address.class, this, CustomerDslPackage.CUSTOMER__ADDRESSES);
    }
    return addresses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CustomerDslPackage.CUSTOMER__ADDRESSES:
        return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CustomerDslPackage.CUSTOMER__NAME:
        return getName();
      case CustomerDslPackage.CUSTOMER__FULL_NAME:
        return getFullName();
      case CustomerDslPackage.CUSTOMER__ADDRESSES:
        return getAddresses();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CustomerDslPackage.CUSTOMER__NAME:
        setName((String)newValue);
        return;
      case CustomerDslPackage.CUSTOMER__FULL_NAME:
        setFullName((String)newValue);
        return;
      case CustomerDslPackage.CUSTOMER__ADDRESSES:
        getAddresses().clear();
        getAddresses().addAll((Collection<? extends Address>)newValue);
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
      case CustomerDslPackage.CUSTOMER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CustomerDslPackage.CUSTOMER__FULL_NAME:
        setFullName(FULL_NAME_EDEFAULT);
        return;
      case CustomerDslPackage.CUSTOMER__ADDRESSES:
        getAddresses().clear();
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
      case CustomerDslPackage.CUSTOMER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CustomerDslPackage.CUSTOMER__FULL_NAME:
        return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
      case CustomerDslPackage.CUSTOMER__ADDRESSES:
        return addresses != null && !addresses.isEmpty();
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
    result.append(", fullName: ");
    result.append(fullName);
    result.append(')');
    return result.toString();
  }

} //CustomerImpl
