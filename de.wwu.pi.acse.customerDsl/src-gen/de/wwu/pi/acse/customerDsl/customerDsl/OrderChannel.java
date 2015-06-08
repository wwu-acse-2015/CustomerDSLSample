/**
 */
package de.wwu.pi.acse.customerDsl.customerDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Channel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.wwu.pi.acse.customerDsl.customerDsl.CustomerDslPackage#getOrderChannel()
 * @model
 * @generated
 */
public enum OrderChannel implements Enumerator
{
  /**
   * The '<em><b>WEB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEB_VALUE
   * @generated
   * @ordered
   */
  WEB(0, "WEB", "web"),

  /**
   * The '<em><b>MAIL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAIL_VALUE
   * @generated
   * @ordered
   */
  MAIL(1, "MAIL", "mail"),

  /**
   * The '<em><b>PHONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PHONE_VALUE
   * @generated
   * @ordered
   */
  PHONE(2, "PHONE", "phone");

  /**
   * The '<em><b>WEB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WEB</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WEB
   * @model literal="web"
   * @generated
   * @ordered
   */
  public static final int WEB_VALUE = 0;

  /**
   * The '<em><b>MAIL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAIL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAIL
   * @model literal="mail"
   * @generated
   * @ordered
   */
  public static final int MAIL_VALUE = 1;

  /**
   * The '<em><b>PHONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PHONE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PHONE
   * @model literal="phone"
   * @generated
   * @ordered
   */
  public static final int PHONE_VALUE = 2;

  /**
   * An array of all the '<em><b>Order Channel</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OrderChannel[] VALUES_ARRAY =
    new OrderChannel[]
    {
      WEB,
      MAIL,
      PHONE,
    };

  /**
   * A public read-only list of all the '<em><b>Order Channel</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OrderChannel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Order Channel</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrderChannel get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OrderChannel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Order Channel</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrderChannel getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OrderChannel result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Order Channel</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrderChannel get(int value)
  {
    switch (value)
    {
      case WEB_VALUE: return WEB;
      case MAIL_VALUE: return MAIL;
      case PHONE_VALUE: return PHONE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OrderChannel(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OrderChannel
