/**
 */
package BarCodeKeyExchange;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Imagetype Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getImagetypeType()
 * @model extendedMetaData="name='imagetype_._type'"
 * @generated
 */
public enum ImagetypeType implements Enumerator {
	/**
	 * The '<em><b>Jpg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPG_VALUE
	 * @generated
	 * @ordered
	 */
	JPG(0, "jpg", "jpg"),

	/**
	 * The '<em><b>Png</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNG_VALUE
	 * @generated
	 * @ordered
	 */
	PNG(1, "png", "png"),

	/**
	 * The '<em><b>Bmp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMP_VALUE
	 * @generated
	 * @ordered
	 */
	BMP(2, "bmp", "bmp");

	/**
	 * The '<em><b>Jpg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jpg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPG
	 * @model name="jpg"
	 * @generated
	 * @ordered
	 */
	public static final int JPG_VALUE = 0;

	/**
	 * The '<em><b>Png</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Png</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PNG
	 * @model name="png"
	 * @generated
	 * @ordered
	 */
	public static final int PNG_VALUE = 1;

	/**
	 * The '<em><b>Bmp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bmp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BMP
	 * @model name="bmp"
	 * @generated
	 * @ordered
	 */
	public static final int BMP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Imagetype Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImagetypeType[] VALUES_ARRAY =
		new ImagetypeType[] {
			JPG,
			PNG,
			BMP,
		};

	/**
	 * A public read-only list of all the '<em><b>Imagetype Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImagetypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Imagetype Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagetypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagetypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imagetype Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagetypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagetypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imagetype Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagetypeType get(int value) {
		switch (value) {
			case JPG_VALUE: return JPG;
			case PNG_VALUE: return PNG;
			case BMP_VALUE: return BMP;
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
	private ImagetypeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ImagetypeType
