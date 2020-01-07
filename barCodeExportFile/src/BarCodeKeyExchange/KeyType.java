/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange;



import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BarCodeKeyExchange.KeyType#getIssuerName <em>Issuer Name</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getIssuerCode <em>Issuer Code</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getVersionType <em>Version Type</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getId <em>Id</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getBarcodeVersion <em>Barcode Version</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getEndDate <em>End Date</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getBarcodeXsd <em>Barcode Xsd</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getAllowedProductOwnerCodes <em>Allowed Product Owner Codes</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getLastDayOfSale <em>Last Day Of Sale</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getKeyForged <em>Key Forged</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getCommentForEncryptionType <em>Comment For Encryption Type</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeyType#getTestbarcode <em>Testbarcode</em>}</li>
 * </ul>
 * </p>
 *
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidKeyType'"
 *        extendedMetaData="name='KeyType' kind='elementOnly'"
 * @generated
 */
public interface KeyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer Name</em>' attribute.
	 * @see #setIssuerName(String)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_IssuerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='issuerName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssuerName();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getIssuerName <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Name</em>' attribute.
	 * @see #getIssuerName()
	 * @generated
	 */
	void setIssuerName(String value);

	/**
	 * Returns the value of the '<em><b>Issuer Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer Code</em>' attribute.
	 * @see #isSetIssuerCode()
	 * @see #unsetIssuerCode()
	 * @see #setIssuerCode(int)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_IssuerCode()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='issuerCode' namespace='##targetNamespace'"
	 * @generated
	 */
	int getIssuerCode();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getIssuerCode <em>Issuer Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Code</em>' attribute.
	 * @see #isSetIssuerCode()
	 * @see #unsetIssuerCode()
	 * @see #getIssuerCode()
	 * @generated
	 */
	void setIssuerCode(int value);

	/**
	 * Unsets the value of the '{@link BarCodeKeyExchange.KeyType#getIssuerCode <em>Issuer Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssuerCode()
	 * @see #getIssuerCode()
	 * @see #setIssuerCode(int)
	 * @generated
	 */
	void unsetIssuerCode();

	/**
	 * Returns whether the value of the '{@link BarCodeKeyExchange.KeyType#getIssuerCode <em>Issuer Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issuer Code</em>' attribute is set.
	 * @see #unsetIssuerCode()
	 * @see #getIssuerCode()
	 * @see #setIssuerCode(int)
	 * @generated
	 */
	boolean isSetIssuerCode();

	/**
	 * Returns the value of the '<em><b>Version Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Type</em>' attribute.
	 * @see #setVersionType(String)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_VersionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='versionType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionType();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getVersionType <em>Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Type</em>' attribute.
	 * @see #getVersionType()
	 * @generated
	 */
	void setVersionType(String value);

	/**
	 * Returns the value of the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #setSignatureAlgorithm(String)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_SignatureAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='signatureAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSignatureAlgorithm();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getSignatureAlgorithm <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #getSignatureAlgorithm()
	 * @generated
	 */
	void setSignatureAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Unsets the value of the '{@link BarCodeKeyExchange.KeyType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link BarCodeKeyExchange.KeyType#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Key</em>' containment reference.
	 * @see #setPublicKey(PublicKeyType)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_PublicKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='publicKey' namespace='##targetNamespace'"
	 * @generated
	 */
	PublicKeyType getPublicKey();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getPublicKey <em>Public Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' containment reference.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(PublicKeyType value);

	/**
	 * Returns the value of the '<em><b>Barcode Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barcode Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barcode Version</em>' attribute.
	 * @see #isSetBarcodeVersion()
	 * @see #unsetBarcodeVersion()
	 * @see #setBarcodeVersion(int)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_BarcodeVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='barcodeVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	int getBarcodeVersion();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getBarcodeVersion <em>Barcode Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barcode Version</em>' attribute.
	 * @see #isSetBarcodeVersion()
	 * @see #unsetBarcodeVersion()
	 * @see #getBarcodeVersion()
	 * @generated
	 */
	void setBarcodeVersion(int value);

	/**
	 * Unsets the value of the '{@link BarCodeKeyExchange.KeyType#getBarcodeVersion <em>Barcode Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBarcodeVersion()
	 * @see #getBarcodeVersion()
	 * @see #setBarcodeVersion(int)
	 * @generated
	 */
	void unsetBarcodeVersion();

	/**
	 * Returns whether the value of the '{@link BarCodeKeyExchange.KeyType#getBarcodeVersion <em>Barcode Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Barcode Version</em>' attribute is set.
	 * @see #unsetBarcodeVersion()
	 * @see #getBarcodeVersion()
	 * @see #setBarcodeVersion(int)
	 * @generated
	 */
	boolean isSetBarcodeVersion();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_StartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='startDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(XMLGregorianCalendar)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_EndDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='endDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndDate();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Barcode Xsd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barcode Xsd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barcode Xsd</em>' attribute.
	 * @see #setBarcodeXsd(String)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_BarcodeXsd()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='barcodeXsd' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBarcodeXsd();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getBarcodeXsd <em>Barcode Xsd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barcode Xsd</em>' attribute.
	 * @see #getBarcodeXsd()
	 * @generated
	 */
	void setBarcodeXsd(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Product Owner Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Product Owner Codes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Product Owner Codes</em>' containment reference.
	 * @see #setAllowedProductOwnerCodes(AllowedProductOwnerCodesType)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_AllowedProductOwnerCodes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='allowedProductOwnerCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	AllowedProductOwnerCodesType getAllowedProductOwnerCodes();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getAllowedProductOwnerCodes <em>Allowed Product Owner Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Product Owner Codes</em>' containment reference.
	 * @see #getAllowedProductOwnerCodes()
	 * @generated
	 */
	void setAllowedProductOwnerCodes(AllowedProductOwnerCodesType value);

	/**
	 * Returns the value of the '<em><b>Last Day Of Sale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Day Of Sale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Day Of Sale</em>' attribute.
	 * @see #setLastDayOfSale(XMLGregorianCalendar)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_LastDayOfSale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='lastDayOfSale' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastDayOfSale();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getLastDayOfSale <em>Last Day Of Sale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Day Of Sale</em>' attribute.
	 * @see #getLastDayOfSale()
	 * @generated
	 */
	void setLastDayOfSale(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Key Forged</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link BarCodeKeyExchange.KeyForgedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Forged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Forged</em>' attribute.
	 * @see BarCodeKeyExchange.KeyForgedType
	 * @see #isSetKeyForged()
	 * @see #unsetKeyForged()
	 * @see #setKeyForged(KeyForgedType)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_KeyForged()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='element' name='keyForged' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyForgedType getKeyForged();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getKeyForged <em>Key Forged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Forged</em>' attribute.
	 * @see BarCodeKeyExchange.KeyForgedType
	 * @see #isSetKeyForged()
	 * @see #unsetKeyForged()
	 * @see #getKeyForged()
	 * @generated
	 */
	void setKeyForged(KeyForgedType value);

	/**
	 * Unsets the value of the '{@link BarCodeKeyExchange.KeyType#getKeyForged <em>Key Forged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyForged()
	 * @see #getKeyForged()
	 * @see #setKeyForged(KeyForgedType)
	 * @generated
	 */
	void unsetKeyForged();

	/**
	 * Returns whether the value of the '{@link BarCodeKeyExchange.KeyType#getKeyForged <em>Key Forged</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key Forged</em>' attribute is set.
	 * @see #unsetKeyForged()
	 * @see #getKeyForged()
	 * @see #setKeyForged(KeyForgedType)
	 * @generated
	 */
	boolean isSetKeyForged();

	/**
	 * Returns the value of the '<em><b>Comment For Encryption Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment For Encryption Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment For Encryption Type</em>' attribute.
	 * @see #setCommentForEncryptionType(String)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_CommentForEncryptionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='commentForEncryptionType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCommentForEncryptionType();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getCommentForEncryptionType <em>Comment For Encryption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment For Encryption Type</em>' attribute.
	 * @see #getCommentForEncryptionType()
	 * @generated
	 */
	void setCommentForEncryptionType(String value);

	/**
	 * Returns the value of the '<em><b>Testbarcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testbarcode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testbarcode</em>' containment reference.
	 * @see #setTestbarcode(TestbarcodeType)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeyType_Testbarcode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testbarcode' namespace='##targetNamespace'"
	 * @generated
	 */
	TestbarcodeType getTestbarcode();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.KeyType#getTestbarcode <em>Testbarcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testbarcode</em>' containment reference.
	 * @see #getTestbarcode()
	 * @generated
	 */
	void setTestbarcode(TestbarcodeType value);

} // KeyType
