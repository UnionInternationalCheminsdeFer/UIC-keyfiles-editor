/**
 */
package BarCodeKeyExchange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testbarcode Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BarCodeKeyExchange.TestbarcodeType#getImagetype <em>Imagetype</em>}</li>
 *   <li>{@link BarCodeKeyExchange.TestbarcodeType#getImagedata <em>Imagedata</em>}</li>
 * </ul>
 * </p>
 *
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getTestbarcodeType()
 * @model extendedMetaData="name='testbarcode_._type' kind='elementOnly'"
 * @generated
 */
public interface TestbarcodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Imagetype</b></em>' attribute.
	 * The literals are from the enumeration {@link BarCodeKeyExchange.ImagetypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imagetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagetype</em>' attribute.
	 * @see BarCodeKeyExchange.ImagetypeType
	 * @see #isSetImagetype()
	 * @see #unsetImagetype()
	 * @see #setImagetype(ImagetypeType)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getTestbarcodeType_Imagetype()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='imagetype' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagetypeType getImagetype();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.TestbarcodeType#getImagetype <em>Imagetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagetype</em>' attribute.
	 * @see BarCodeKeyExchange.ImagetypeType
	 * @see #isSetImagetype()
	 * @see #unsetImagetype()
	 * @see #getImagetype()
	 * @generated
	 */
	void setImagetype(ImagetypeType value);

	/**
	 * Unsets the value of the '{@link BarCodeKeyExchange.TestbarcodeType#getImagetype <em>Imagetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImagetype()
	 * @see #getImagetype()
	 * @see #setImagetype(ImagetypeType)
	 * @generated
	 */
	void unsetImagetype();

	/**
	 * Returns whether the value of the '{@link BarCodeKeyExchange.TestbarcodeType#getImagetype <em>Imagetype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Imagetype</em>' attribute is set.
	 * @see #unsetImagetype()
	 * @see #getImagetype()
	 * @see #setImagetype(ImagetypeType)
	 * @generated
	 */
	boolean isSetImagetype();

	/**
	 * Returns the value of the '<em><b>Imagedata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imagedata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagedata</em>' attribute.
	 * @see #setImagedata(byte[])
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getTestbarcodeType_Imagedata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" required="true"
	 *        extendedMetaData="kind='element' name='imagedata' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getImagedata();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.TestbarcodeType#getImagedata <em>Imagedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imagedata</em>' attribute.
	 * @see #getImagedata()
	 * @generated
	 */
	void setImagedata(byte[] value);

} // TestbarcodeType
