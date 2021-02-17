/**
 */
package com.paxelerate.model.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Travel Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.enums.EnumsPackage#getTravelClass()
 * @model
 * @generated
 */
public enum TravelClass implements Enumerator {
	/**
	 * The '<em><b>ECONOMY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECONOMY_VALUE
	 * @generated
	 * @ordered
	 */
	ECONOMY(0, "ECONOMY", "ECONOMY"),

	/**
	 * The '<em><b>PREMIUM ECONOMY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREMIUM_ECONOMY_VALUE
	 * @generated
	 * @ordered
	 */
	PREMIUM_ECONOMY(1, "PREMIUM_ECONOMY", "PREMIUM_ECONOMY"),

	/**
	 * The '<em><b>BUSINESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS(2, "BUSINESS", "BUSINESS"),

	/**
	 * The '<em><b>FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST(3, "FIRST", "FIRST");

	/**
	 * The '<em><b>ECONOMY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECONOMY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ECONOMY_VALUE = 0;

	/**
	 * The '<em><b>PREMIUM ECONOMY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREMIUM_ECONOMY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREMIUM_ECONOMY_VALUE = 1;

	/**
	 * The '<em><b>BUSINESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_VALUE = 2;

	/**
	 * The '<em><b>FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_VALUE = 3;

	/**
	 * An array of all the '<em><b>Travel Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TravelClass[] VALUES_ARRAY = new TravelClass[] { ECONOMY, PREMIUM_ECONOMY, BUSINESS, FIRST, };

	/**
	 * A public read-only list of all the '<em><b>Travel Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TravelClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Travel Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelClass get(int value) {
		switch (value) {
		case ECONOMY_VALUE:
			return ECONOMY;
		case PREMIUM_ECONOMY_VALUE:
			return PREMIUM_ECONOMY;
		case BUSINESS_VALUE:
			return BUSINESS;
		case FIRST_VALUE:
			return FIRST;
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
	private TravelClass(int value, String name, String literal) {
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

} //TravelClass
