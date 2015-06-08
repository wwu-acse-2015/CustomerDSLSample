/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl.impl;

import de.wwu.pi.acse.customerDsl.customerDsl.Customer;
import de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb;
import de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage;
import de.wwu.pi.acse.customerDsl.customerDsl.Order;
import de.wwu.pi.acse.customerDsl.customerDsl.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Db</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDbImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDbImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDbImpl#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerDbImpl extends MinimalEObjectImpl.Container implements CustomerDb
{
  /**
   * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomers()
   * @generated
   * @ordered
   */
  protected EList<Customer> customers;

  /**
   * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrders()
   * @generated
   * @ordered
   */
  protected EList<Order> orders;

  /**
   * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProducts()
   * @generated
   * @ordered
   */
  protected EList<Product> products;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomerDbImpl()
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
    return CustomerDslPackage.Literals.CUSTOMER_DB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Customer> getCustomers()
  {
    if (customers == null)
    {
      customers = new EObjectContainmentEList<Customer>(Customer.class, this, CustomerDslPackage.CUSTOMER_DB__CUSTOMERS);
    }
    return customers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Order> getOrders()
  {
    if (orders == null)
    {
      orders = new EObjectContainmentEList<Order>(Order.class, this, CustomerDslPackage.CUSTOMER_DB__ORDERS);
    }
    return orders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Product> getProducts()
  {
    if (products == null)
    {
      products = new EObjectContainmentEList<Product>(Product.class, this, CustomerDslPackage.CUSTOMER_DB__PRODUCTS);
    }
    return products;
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
      case CustomerDslPackage.CUSTOMER_DB__CUSTOMERS:
        return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
      case CustomerDslPackage.CUSTOMER_DB__ORDERS:
        return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
      case CustomerDslPackage.CUSTOMER_DB__PRODUCTS:
        return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
      case CustomerDslPackage.CUSTOMER_DB__CUSTOMERS:
        return getCustomers();
      case CustomerDslPackage.CUSTOMER_DB__ORDERS:
        return getOrders();
      case CustomerDslPackage.CUSTOMER_DB__PRODUCTS:
        return getProducts();
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
      case CustomerDslPackage.CUSTOMER_DB__CUSTOMERS:
        getCustomers().clear();
        getCustomers().addAll((Collection<? extends Customer>)newValue);
        return;
      case CustomerDslPackage.CUSTOMER_DB__ORDERS:
        getOrders().clear();
        getOrders().addAll((Collection<? extends Order>)newValue);
        return;
      case CustomerDslPackage.CUSTOMER_DB__PRODUCTS:
        getProducts().clear();
        getProducts().addAll((Collection<? extends Product>)newValue);
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
      case CustomerDslPackage.CUSTOMER_DB__CUSTOMERS:
        getCustomers().clear();
        return;
      case CustomerDslPackage.CUSTOMER_DB__ORDERS:
        getOrders().clear();
        return;
      case CustomerDslPackage.CUSTOMER_DB__PRODUCTS:
        getProducts().clear();
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
      case CustomerDslPackage.CUSTOMER_DB__CUSTOMERS:
        return customers != null && !customers.isEmpty();
      case CustomerDslPackage.CUSTOMER_DB__ORDERS:
        return orders != null && !orders.isEmpty();
      case CustomerDslPackage.CUSTOMER_DB__PRODUCTS:
        return products != null && !products.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CustomerDbImpl
