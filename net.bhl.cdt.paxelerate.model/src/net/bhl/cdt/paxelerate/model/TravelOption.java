/**
 */
package net.bhl.cdt.paxelerate.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Travel Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelOption()
 * @model
 * @generated
 */
public enum TravelOption implements Enumerator {
	/**
	 * The '<em><b>First Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_CLASS(0, "FirstClass", "FirstClass"),

	/**
	 * The '<em><b>Business Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_CLASS(1, "BusinessClass", "BusinessClass"),

	/**
	 * The '<em><b>Premium Economy Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREMIUM_ECONOMY_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	PREMIUM_ECONOMY_CLASS(2, "PremiumEconomyClass", "PremiumEconomyClass"),

	/**
	 * The '<em><b>Economy Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECONOMY_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	ECONOMY_CLASS(3, "EconomyClass", "EconomyClass");

	/**
	 * The '<em><b>First Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>First Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRST_CLASS
	 * @model name="FirstClass"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_CLASS_VALUE = 0;

	/**
	 * The '<em><b>Business Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Business Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_CLASS
	 * @model name="BusinessClass"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_CLASS_VALUE = 1;

	/**
	 * The '<em><b>Premium Economy Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Premium Economy Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREMIUM_ECONOMY_CLASS
	 * @model name="PremiumEconomyClass"
	 * @generated
	 * @ordered
	 */
	public static final int PREMIUM_ECONOMY_CLASS_VALUE = 2;

	/**
	 * The '<em><b>Economy Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Economy Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECONOMY_CLASS
	 * @model name="EconomyClass"
	 * @generated
	 * @ordered
	 */
	public static final int ECONOMY_CLASS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Travel Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TravelOption[] VALUES_ARRAY =
		new TravelOption[] {
			FIRST_CLASS,
			BUSINESS_CLASS,
			PREMIUM_ECONOMY_CLASS,
			ECONOMY_CLASS,
		};

	/**
	 * A public read-only list of all the '<em><b>Travel Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TravelOption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Travel Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelOption get(int value) {
		switch (value) {
			case FIRST_CLASS_VALUE: return FIRST_CLASS;
			case BUSINESS_CLASS_VALUE: return BUSINESS_CLASS;
			case PREMIUM_ECONOMY_CLASS_VALUE: return PREMIUM_ECONOMY_CLASS;
			case ECONOMY_CLASS_VALUE: return ECONOMY_CLASS;
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
	private TravelOption(int value, String name, String literal) {
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
	
} //TravelOption
