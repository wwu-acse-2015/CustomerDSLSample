/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslFactory
 * @model kind="package"
 * @generated
 */
public interface CustomerDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "customerDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.wwu.de/pi/acse/customerDsl/CustomerDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "customerDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CustomerDslPackage eINSTANCE = de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDbImpl <em>Customer Db</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDbImpl
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getCustomerDb()
   * @generated
   */
  int CUSTOMER_DB = 0;

  /**
   * The feature id for the '<em><b>Customers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_DB__CUSTOMERS = 0;

  /**
   * The feature id for the '<em><b>Orders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_DB__ORDERS = 1;

  /**
   * The feature id for the '<em><b>Products</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_DB__PRODUCTS = 2;

  /**
   * The number of structural features of the '<em>Customer Db</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_DB_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerImpl <em>Customer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerImpl
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getCustomer()
   * @generated
   */
  int CUSTOMER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__NAME = 0;

  /**
   * The feature id for the '<em><b>Full Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__FULL_NAME = 1;

  /**
   * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER__ADDRESSES = 2;

  /**
   * The number of structural features of the '<em>Customer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.AddressImpl <em>Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.AddressImpl
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getAddress()
   * @generated
   */
  int ADDRESS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Zip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__ZIP = 1;

  /**
   * The number of structural features of the '<em>Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.StreetAddressImpl <em>Street Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.StreetAddressImpl
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getStreetAddress()
   * @generated
   */
  int STREET_ADDRESS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREET_ADDRESS__NAME = ADDRESS__NAME;

  /**
   * The feature id for the '<em><b>Zip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREET_ADDRESS__ZIP = ADDRESS__ZIP;

  /**
   * The feature id for the '<em><b>Street</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREET_ADDRESS__STREET = ADDRESS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>City</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREET_ADDRESS__CITY = ADDRESS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Street Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREET_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.POBoxImpl <em>PO Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.POBoxImpl
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getPOBox()
   * @generated
   */
  int PO_BOX = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PO_BOX__NAME = ADDRESS__NAME;

  /**
   * The feature id for the '<em><b>Zip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PO_BOX__ZIP = ADDRESS__ZIP;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PO_BOX__NUMBER = ADDRESS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PO Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PO_BOX_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.OrderImpl <em>Order</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.OrderImpl
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getOrder()
   * @generated
   */
  int ORDER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Customer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER__CUSTOMER = 1;

  /**
   * The feature id for the '<em><b>Address</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER__ADDRESS = 2;

  /**
   * The feature id for the '<em><b>Channel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER__CHANNEL = 3;

  /**
   * The number of structural features of the '<em>Order</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.ProductImpl <em>Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.ProductImpl
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getProduct()
   * @generated
   */
  int PRODUCT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__NAME = 0;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__PRICE = 1;

  /**
   * The number of structural features of the '<em>Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel <em>Order Channel</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel
   * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getOrderChannel()
   * @generated
   */
  int ORDER_CHANNEL = 7;


  /**
   * Returns the meta object for class '{@link de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb <em>Customer Db</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Customer Db</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb
   * @generated
   */
  EClass getCustomerDb();

  /**
   * Returns the meta object for the containment reference list '{@link de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb#getCustomers <em>Customers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Customers</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb#getCustomers()
   * @see #getCustomerDb()
   * @generated
   */
  EReference getCustomerDb_Customers();

  /**
   * Returns the meta object for the containment reference list '{@link de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb#getOrders <em>Orders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Orders</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb#getOrders()
   * @see #getCustomerDb()
   * @generated
   */
  EReference getCustomerDb_Orders();

  /**
   * Returns the meta object for the containment reference list '{@link de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb#getProducts <em>Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Products</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDb#getProducts()
   * @see #getCustomerDb()
   * @generated
   */
  EReference getCustomerDb_Products();

  /**
   * Returns the meta object for class '{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Customer</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Customer
   * @generated
   */
  EClass getCustomer();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Customer#getName()
   * @see #getCustomer()
   * @generated
   */
  EAttribute getCustomer_Name();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer#getFullName <em>Full Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Full Name</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Customer#getFullName()
   * @see #getCustomer()
   * @generated
   */
  EAttribute getCustomer_FullName();

  /**
   * Returns the meta object for the containment reference list '{@link de.wwu.pi.acse.customerDsl.customerDsl.Customer#getAddresses <em>Addresses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Addresses</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Customer#getAddresses()
   * @see #getCustomer()
   * @generated
   */
  EReference getCustomer_Addresses();

  /**
   * Returns the meta object for class '{@link de.wwu.pi.acse.customerDsl.customerDsl.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Address
   * @generated
   */
  EClass getAddress();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.Address#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Address#getName()
   * @see #getAddress()
   * @generated
   */
  EAttribute getAddress_Name();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.Address#getZip <em>Zip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zip</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Address#getZip()
   * @see #getAddress()
   * @generated
   */
  EAttribute getAddress_Zip();

  /**
   * Returns the meta object for class '{@link de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress <em>Street Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Street Address</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress
   * @generated
   */
  EClass getStreetAddress();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress#getStreet <em>Street</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Street</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress#getStreet()
   * @see #getStreetAddress()
   * @generated
   */
  EAttribute getStreetAddress_Street();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress#getCity <em>City</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>City</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.StreetAddress#getCity()
   * @see #getStreetAddress()
   * @generated
   */
  EAttribute getStreetAddress_City();

  /**
   * Returns the meta object for class '{@link de.wwu.pi.acse.customerDsl.customerDsl.POBox <em>PO Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PO Box</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.POBox
   * @generated
   */
  EClass getPOBox();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.POBox#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.POBox#getNumber()
   * @see #getPOBox()
   * @generated
   */
  EAttribute getPOBox_Number();

  /**
   * Returns the meta object for class '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Order
   * @generated
   */
  EClass getOrder();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Order#getName()
   * @see #getOrder()
   * @generated
   */
  EAttribute getOrder_Name();

  /**
   * Returns the meta object for the reference '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getCustomer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Customer</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Order#getCustomer()
   * @see #getOrder()
   * @generated
   */
  EReference getOrder_Customer();

  /**
   * Returns the meta object for the reference '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Address</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Order#getAddress()
   * @see #getOrder()
   * @generated
   */
  EReference getOrder_Address();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.Order#getChannel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Channel</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Order#getChannel()
   * @see #getOrder()
   * @generated
   */
  EAttribute getOrder_Channel();

  /**
   * Returns the meta object for class '{@link de.wwu.pi.acse.customerDsl.customerDsl.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Product
   * @generated
   */
  EClass getProduct();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.Product#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Product#getName()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Name();

  /**
   * Returns the meta object for the attribute '{@link de.wwu.pi.acse.customerDsl.customerDsl.Product#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.Product#getPrice()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Price();

  /**
   * Returns the meta object for enum '{@link de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel <em>Order Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Order Channel</em>'.
   * @see de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel
   * @generated
   */
  EEnum getOrderChannel();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CustomerDslFactory getCustomerDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDbImpl <em>Customer Db</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDbImpl
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getCustomerDb()
     * @generated
     */
    EClass CUSTOMER_DB = eINSTANCE.getCustomerDb();

    /**
     * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOMER_DB__CUSTOMERS = eINSTANCE.getCustomerDb_Customers();

    /**
     * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOMER_DB__ORDERS = eINSTANCE.getCustomerDb_Orders();

    /**
     * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOMER_DB__PRODUCTS = eINSTANCE.getCustomerDb_Products();

    /**
     * The meta object literal for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerImpl <em>Customer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerImpl
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getCustomer()
     * @generated
     */
    EClass CUSTOMER = eINSTANCE.getCustomer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

    /**
     * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOMER__FULL_NAME = eINSTANCE.getCustomer_FullName();

    /**
     * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOMER__ADDRESSES = eINSTANCE.getCustomer_Addresses();

    /**
     * The meta object literal for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.AddressImpl <em>Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.AddressImpl
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getAddress()
     * @generated
     */
    EClass ADDRESS = eINSTANCE.getAddress();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS__NAME = eINSTANCE.getAddress_Name();

    /**
     * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS__ZIP = eINSTANCE.getAddress_Zip();

    /**
     * The meta object literal for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.StreetAddressImpl <em>Street Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.StreetAddressImpl
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getStreetAddress()
     * @generated
     */
    EClass STREET_ADDRESS = eINSTANCE.getStreetAddress();

    /**
     * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STREET_ADDRESS__STREET = eINSTANCE.getStreetAddress_Street();

    /**
     * The meta object literal for the '<em><b>City</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STREET_ADDRESS__CITY = eINSTANCE.getStreetAddress_City();

    /**
     * The meta object literal for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.POBoxImpl <em>PO Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.POBoxImpl
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getPOBox()
     * @generated
     */
    EClass PO_BOX = eINSTANCE.getPOBox();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PO_BOX__NUMBER = eINSTANCE.getPOBox_Number();

    /**
     * The meta object literal for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.OrderImpl <em>Order</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.OrderImpl
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getOrder()
     * @generated
     */
    EClass ORDER = eINSTANCE.getOrder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDER__NAME = eINSTANCE.getOrder_Name();

    /**
     * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER__CUSTOMER = eINSTANCE.getOrder_Customer();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER__ADDRESS = eINSTANCE.getOrder_Address();

    /**
     * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDER__CHANNEL = eINSTANCE.getOrder_Channel();

    /**
     * The meta object literal for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.impl.ProductImpl <em>Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.ProductImpl
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getProduct()
     * @generated
     */
    EClass PRODUCT = eINSTANCE.getProduct();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

    /**
     * The meta object literal for the '{@link de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel <em>Order Channel</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.wwu.pi.acse.customerDsl.customerDsl.OrderChannel
     * @see de.wwu.pi.acse.customerDsl.customerDsl.impl.CustomerDslPackageImpl#getOrderChannel()
     * @generated
     */
    EEnum ORDER_CHANNEL = eINSTANCE.getOrderChannel();

  }

} //CustomerDslPackage
