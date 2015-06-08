/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl.impl;

import de.wwu.pi.acse.customerDsl.customerDsl.Address;
import de.wwu.pi.acse.customerDsl.customerDsl.Customer;
import de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage;
import de.wwu.pi.acse.customerDsl.customerDsl.Order;
import de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.OrderImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.OrderImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.OrderImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.OrderImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order
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
   * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomer()
   * @generated
   * @ordered
   */
  protected Customer customer;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected Address address;

  /**
   * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected static final OrderChannel CHANNEL_EDEFAULT = OrderChannel.WEB;

  /**
   * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannel()
   * @generated
   * @ordered
   */
  protected OrderChannel channel = CHANNEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrderImpl()
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
    return CustomerDslPackage.Literals.ORDER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.ORDER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Customer getCustomer()
  {
    if (customer != null && customer.eIsProxy())
    {
      InternalEObject oldCustomer = (InternalEObject)customer;
      customer = (Customer)eResolveProxy(oldCustomer);
      if (customer != oldCustomer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomerDslPackage.ORDER__CUSTOMER, oldCustomer, customer));
      }
    }
    return customer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Customer basicGetCustomer()
  {
    return customer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomer(Customer newCustomer)
  {
    Customer oldCustomer = customer;
    customer = newCustomer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.ORDER__CUSTOMER, oldCustomer, customer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Address getAddress()
  {
    if (address != null && address.eIsProxy())
    {
      InternalEObject oldAddress = (InternalEObject)address;
      address = (Address)eResolveProxy(oldAddress);
      if (address != oldAddress)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomerDslPackage.ORDER__ADDRESS, oldAddress, address));
      }
    }
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Address basicGetAddress()
  {
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddress(Address newAddress)
  {
    Address oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.ORDER__ADDRESS, oldAddress, address));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderChannel getChannel()
  {
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChannel(OrderChannel newChannel)
  {
    OrderChannel oldChannel = channel;
    channel = newChannel == null ? CHANNEL_EDEFAULT : newChannel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CustomerDslPackage.ORDER__CHANNEL, oldChannel, channel));
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
      case CustomerDslPackage.ORDER__NAME:
        return getName();
      case CustomerDslPackage.ORDER__CUSTOMER:
        if (resolve) return getCustomer();
        return basicGetCustomer();
      case CustomerDslPackage.ORDER__ADDRESS:
        if (resolve) return getAddress();
        return basicGetAddress();
      case CustomerDslPackage.ORDER__CHANNEL:
        return getChannel();
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
      case CustomerDslPackage.ORDER__NAME:
        setName((String)newValue);
        return;
      case CustomerDslPackage.ORDER__CUSTOMER:
        setCustomer((Customer)newValue);
        return;
      case CustomerDslPackage.ORDER__ADDRESS:
        setAddress((Address)newValue);
        return;
      case CustomerDslPackage.ORDER__CHANNEL:
        setChannel((OrderChannel)newValue);
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
      case CustomerDslPackage.ORDER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CustomerDslPackage.ORDER__CUSTOMER:
        setCustomer((Customer)null);
        return;
      case CustomerDslPackage.ORDER__ADDRESS:
        setAddress((Address)null);
        return;
      case CustomerDslPackage.ORDER__CHANNEL:
        setChannel(CHANNEL_EDEFAULT);
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
      case CustomerDslPackage.ORDER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CustomerDslPackage.ORDER__CUSTOMER:
        return customer != null;
      case CustomerDslPackage.ORDER__ADDRESS:
        return address != null;
      case CustomerDslPackage.ORDER__CHANNEL:
        return channel != CHANNEL_EDEFAULT;
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
    result.append(", channel: ");
    result.append(channel);
    result.append(')');
    return result.toString();
  }

} //OrderImpl
