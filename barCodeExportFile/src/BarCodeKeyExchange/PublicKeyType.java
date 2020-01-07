/**
 */
package BarCodeKeyExchange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Key Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BarCodeKeyExchange.PublicKeyType#getValue <em>Value</em>}</li>
 *   <li>{@link BarCodeKeyExchange.PublicKeyType#getKeytype <em>Keytype</em>}</li>
 * </ul>
 * </p>
 *
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getPublicKeyType()
 * @model extendedMetaData="name='publicKeyType' kind='simple'"
 * @generated
 */
public interface PublicKeyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte[])
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getPublicKeyType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.PublicKeyType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte[] value);

	/**
	 * Returns the value of the '<em><b>Keytype</b></em>' attribute.
	 * The default value is <code>"CERTIFICATE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keytype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keytype</em>' attribute.
	 * @see #isSetKeytype()
	 * @see #unsetKeytype()
	 * @see #setKeytype(String)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getPublicKeyType_Keytype()
	 * @model default="CERTIFICATE" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keytype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeytype();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.PublicKeyType#getKeytype <em>Keytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keytype</em>' attribute.
	 * @see #isSetKeytype()
	 * @see #unsetKeytype()
	 * @see #getKeytype()
	 * @generated
	 */
	void setKeytype(String value);

	/**
	 * Unsets the value of the '{@link BarCodeKeyExchange.PublicKeyType#getKeytype <em>Keytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeytype()
	 * @see #getKeytype()
	 * @see #setKeytype(String)
	 * @generated
	 */
	void unsetKeytype();

	/**
	 * Returns whether the value of the '{@link BarCodeKeyExchange.PublicKeyType#getKeytype <em>Keytype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keytype</em>' attribute is set.
	 * @see #unsetKeytype()
	 * @see #getKeytype()
	 * @see #setKeytype(String)
	 * @generated
	 */
	boolean isSetKeytype();

} // PublicKeyType
