/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl.util;

import de.wwu.pi.acse.customerDsl.customerDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage
 * @generated
 */
public class CustomerDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CustomerDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomerDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CustomerDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomerDslSwitch<Adapter> modelSwitch =
    new CustomerDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseCustomerDb(CustomerDb object)
      {
        return createCustomerDbAdapter();
      }
      @Override
      public Adapter caseCustomer(Customer object)
      {
        return createCustomerAdapter();
      }
      @Override
      public Adapter caseAddress(Address object)
      {
        return createAddressAdapter();
      }
      @Override
      public Adapter caseStreetAddress(StreetAddress object)
      {
        return createStreetAddressAdapter();
      }
      @Override
      public Adapter casePOBox(POBox object)
      {
        return createPOBoxAdapter();
      }
      @Override
      public Adapter caseOrder(Order object)
      {
        return createOrderAdapter();
      }
      @Override
      public Adapter caseProduct(Product object)
      {
        return createProductAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb <em>Customer Db</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb
   * @generated
   */
  public Adapter createCustomerDbAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Customer
   * @generated
   */
  public Adapter createCustomerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wwu.pi.acse.customerDsl.customerDsl.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Address
   * @generated
   */
  public Adapter createAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress <em>Street Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress
   * @generated
   */
  public Adapter createStreetAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wwu.pi.acse.customerDsl.customerDsl.POBox <em>PO Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.POBox
   * @generated
   */
  public Adapter createPOBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Order
   * @generated
   */
  public Adapter createOrderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.wwu.pi.acse.customerDsl.customerDsl.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Product
   * @generated
   */
  public Adapter createProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CustomerDslAdapterFactory
