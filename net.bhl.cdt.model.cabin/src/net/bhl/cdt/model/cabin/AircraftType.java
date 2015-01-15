/**
 */
package net.bhl.cdt.model.cabin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aircraft Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.cabin.CabinPackage#getAircraftType()
 * @model
 * @generated
 */
public enum AircraftType implements Enumerator {
	/**
	 * The '<em><b>Regional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL(0, "regional", "regional"),

	/**
	 * The '<em><b>Continental</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINENTAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINENTAL(1, "continental", "continental"),

	/**
	 * The '<em><b>Intercontinental</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCONTINENTAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCONTINENTAL(2, "intercontinental", "intercontinental");

	/**
	 * The '<em><b>Regional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGIONAL
	 * @model name="regional"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_VALUE = 0;

	/**
	 * The '<em><b>Continental</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Continental</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINENTAL
	 * @model name="continental"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINENTAL_VALUE = 1;

	/**
	 * The '<em><b>Intercontinental</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intercontinental</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERCONTINENTAL
	 * @model name="intercontinental"
	 * @generated
	 * @ordered
	 */
	public static final int INTERCONTINENTAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Aircraft Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AircraftType[] VALUES_ARRAY =
		new AircraftType[] {
			REGIONAL,
			CONTINENTAL,
			INTERCONTINENTAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Aircraft Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AircraftType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aircraft Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AircraftType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AircraftType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aircraft Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AircraftType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AircraftType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aircraft Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AircraftType get(int value) {
		switch (value) {
			case REGIONAL_VALUE: return REGIONAL;
			case CONTINENTAL_VALUE: return CONTINENTAL;
			case INTERCONTINENTAL_VALUE: return INTERCONTINENTAL;
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
	private AircraftType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //AircraftType