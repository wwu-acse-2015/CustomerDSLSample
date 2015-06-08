/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl.impl;

import de.wwu.pi.acse.customerDsl.customerDsl.Address;
import de.wwu.pi.acse.customerDsl.customerDsl.Customer;
import de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb;
import de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslFactory;
import de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage;
import de.wwu.pi.acse.customerDsl.customerDsl.Order;
import de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel;
import de.wwu.pi.acse.customerDsl.customerDsl.POBox;
import de.wwu.pi.acse.customerDsl.customerDsl.Product;
import de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerDslPackageImpl extends EPackageImpl implements CustomerDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customerDbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streetAddressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass poBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum orderChannelEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CustomerDslPackageImpl()
  {
    super(eNS_URI, CustomerDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CustomerDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CustomerDslPackage init()
  {
    if (isInited) return (CustomerDslPackage)EPackage.Registry.INSTANCE.getEPackage(CustomerDslPackage.eNS_URI);

    // Obtain or create and register package
    CustomerDslPackageImpl theCustomerDslPackage = (CustomerDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CustomerDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CustomerDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCustomerDslPackage.createPackageContents();

    // Initialize created meta-data
    theCustomerDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCustomerDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CustomerDslPackage.eNS_URI, theCustomerDslPackage);
    return theCustomerDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomerDb()
  {
    return customerDbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomerDb_Customers()
  {
    return (EReference)customerDbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomerDb_Orders()
  {
    return (EReference)customerDbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomerDb_Products()
  {
    return (EReference)customerDbEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomer()
  {
    return customerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomer_Name()
  {
    return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomer_FullName()
  {
    return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomer_Addresses()
  {
    return (EReference)customerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddress()
  {
    return addressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddress_Name()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddress_Zip()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStreetAddress()
  {
    return streetAddressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStreetAddress_Street()
  {
    return (EAttribute)streetAddressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStreetAddress_City()
  {
    return (EAttribute)streetAddressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOBox()
  {
    return poBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPOBox_Number()
  {
    return (EAttribute)poBoxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrder()
  {
    return orderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrder_Name()
  {
    return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrder_Customer()
  {
    return (EReference)orderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrder_Address()
  {
    return (EReference)orderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrder_Channel()
  {
    return (EAttribute)orderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProduct()
  {
    return productEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProduct_Name()
  {
    return (EAttribute)productEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProduct_Price()
  {
    return (EAttribute)productEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOrderChannel()
  {
    return orderChannelEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomerDslFactory getCustomerDslFactory()
  {
    return (CustomerDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    customerDbEClass = createEClass(CUSTOMER_DB);
    createEReference(customerDbEClass, CUSTOMER_DB__CUSTOMERS);
    createEReference(customerDbEClass, CUSTOMER_DB__ORDERS);
    createEReference(customerDbEClass, CUSTOMER_DB__PRODUCTS);

    customerEClass = createEClass(CUSTOMER);
    createEAttribute(customerEClass, CUSTOMER__NAME);
    createEAttribute(customerEClass, CUSTOMER__FULL_NAME);
    createEReference(customerEClass, CUSTOMER__ADDRESSES);

    addressEClass = createEClass(ADDRESS);
    createEAttribute(addressEClass, ADDRESS__NAME);
    createEAttribute(addressEClass, ADDRESS__ZIP);

    streetAddressEClass = createEClass(STREET_ADDRESS);
    createEAttribute(streetAddressEClass, STREET_ADDRESS__STREET);
    createEAttribute(streetAddressEClass, STREET_ADDRESS__CITY);

    poBoxEClass = createEClass(PO_BOX);
    createEAttribute(poBoxEClass, PO_BOX__NUMBER);

    orderEClass = createEClass(ORDER);
    createEAttribute(orderEClass, ORDER__NAME);
    createEReference(orderEClass, ORDER__CUSTOMER);
    createEReference(orderEClass, ORDER__ADDRESS);
    createEAttribute(orderEClass, ORDER__CHANNEL);

    productEClass = createEClass(PRODUCT);
    createEAttribute(productEClass, PRODUCT__NAME);
    createEAttribute(productEClass, PRODUCT__PRICE);

    // Create enums
    orderChannelEEnum = createEEnum(ORDER_CHANNEL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    streetAddressEClass.getESuperTypes().add(this.getAddress());
    poBoxEClass.getESuperTypes().add(this.getAddress());

    // Initialize classes and features; add operations and parameters
    initEClass(customerDbEClass, CustomerDb.class, "CustomerDb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomerDb_Customers(), this.getCustomer(), null, "customers", null, 0, -1, CustomerDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomerDb_Orders(), this.getOrder(), null, "orders", null, 0, -1, CustomerDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomerDb_Products(), this.getProduct(), null, "products", null, 0, -1, CustomerDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomer_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomer_Addresses(), this.getAddress(), null, "addresses", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddress_Name(), ecorePackage.getEString(), "name", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_Zip(), ecorePackage.getEString(), "zip", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streetAddressEClass, StreetAddress.class, "StreetAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStreetAddress_Street(), ecorePackage.getEString(), "street", null, 0, 1, StreetAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStreetAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, StreetAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(poBoxEClass, POBox.class, "POBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPOBox_Number(), ecorePackage.getEInt(), "number", null, 0, 1, POBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrder_Name(), ecorePackage.getEString(), "name", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrder_Customer(), this.getCustomer(), null, "customer", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrder_Address(), this.getAddress(), null, "address", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrder_Channel(), this.getOrderChannel(), "channel", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProduct_Price(), ecorePackage.getEInt(), "price", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(orderChannelEEnum, OrderChannel.class, "OrderChannel");
    addEEnumLiteral(orderChannelEEnum, OrderChannel.WEB);
    addEEnumLiteral(orderChannelEEnum, OrderChannel.MAIL);
    addEEnumLiteral(orderChannelEEnum, OrderChannel.PHONE);

    // Create resource
    createResource(eNS_URI);
  }

} //CustomerDslPackageImpl
