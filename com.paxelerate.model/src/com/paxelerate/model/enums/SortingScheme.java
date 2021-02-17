/**
 */
package com.paxelerate.model.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sorting Scheme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.enums.EnumsPackage#getSortingScheme()
 * @model
 * @generated
 */
public enum SortingScheme implements Enumerator {
	/**
	 * The '<em><b>RANDOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM(0, "RANDOM", "RANDOM"),

	/**
	 * The '<em><b>RTF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTF_VALUE
	 * @generated
	 * @ordered
	 */
	RTF(1, "RTF", "RTF"),

	/**
	 * The '<em><b>FTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTR_VALUE
	 * @generated
	 * @ordered
	 */
	FTR(2, "FTR", "FTR"),

	/**
	 * The '<em><b>WTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTA_VALUE
	 * @generated
	 * @ordered
	 */
	WTA(3, "WTA", "WTA"),

	/**
	 * The '<em><b>WTA RTF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTA_RTF_VALUE
	 * @generated
	 * @ordered
	 */
	WTA_RTF(4, "WTA_RTF", "WTA_RTF"),

	/**
	 * The '<em><b>WTA FTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTA_FTR_VALUE
	 * @generated
	 * @ordered
	 */
	WTA_FTR(5, "WTA_FTR", "WTA_FTR"),

	/**
	 * The '<em><b>BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCK(6, "BLOCK", "BLOCK"),

	/**
	 * The '<em><b>BOARDING CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOARDING_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	BOARDING_CLASS(13, "BOARDING_CLASS", "BOARDING_CLASS"),

	/**
	 * The '<em><b>STEFFEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEFFEN_VALUE
	 * @generated
	 * @ordered
	 */
	STEFFEN(7, "STEFFEN", "STEFFEN"),

	/**
	 * The '<em><b>MILNE KELLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILNE_KELLY_VALUE
	 * @generated
	 * @ordered
	 */
	MILNE_KELLY(8, "MILNE_KELLY", "MILNE_KELLY"),

	/**
	 * The '<em><b>BIG BAGS AFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_BAGS_AFT_VALUE
	 * @generated
	 * @ordered
	 */
	BIG_BAGS_AFT(9, "BIG_BAGS_AFT", "BIG_BAGS_AFT"),

	/**
	 * The '<em><b>BIG BAGS FRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_BAGS_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	BIG_BAGS_FRONT(10, "BIG_BAGS_FRONT", "BIG_BAGS_FRONT"),

	/**
	 * The '<em><b>MAX BAGS AFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_BAGS_AFT_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_BAGS_AFT(11, "MAX_BAGS_AFT", "MAX_BAGS_AFT"),

	/**
	 * The '<em><b>MAX BAGS FRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_BAGS_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_BAGS_FRONT(12, "MAX_BAGS_FRONT", "MAX_BAGS_FRONT");

	/**
	 * The '<em><b>RANDOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_VALUE = 0;

	/**
	 * The '<em><b>RTF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTF_VALUE = 1;

	/**
	 * The '<em><b>FTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FTR_VALUE = 2;

	/**
	 * The '<em><b>WTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WTA_VALUE = 3;

	/**
	 * The '<em><b>WTA RTF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTA_RTF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WTA_RTF_VALUE = 4;

	/**
	 * The '<em><b>WTA FTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTA_FTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WTA_FTR_VALUE = 5;

	/**
	 * The '<em><b>BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCK_VALUE = 6;

	/**
	 * The '<em><b>BOARDING CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOARDING_CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOARDING_CLASS_VALUE = 13;

	/**
	 * The '<em><b>STEFFEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEFFEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEFFEN_VALUE = 7;

	/**
	 * The '<em><b>MILNE KELLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILNE_KELLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MILNE_KELLY_VALUE = 8;

	/**
	 * The '<em><b>BIG BAGS AFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_BAGS_AFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIG_BAGS_AFT_VALUE = 9;

	/**
	 * The '<em><b>BIG BAGS FRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_BAGS_FRONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIG_BAGS_FRONT_VALUE = 10;

	/**
	 * The '<em><b>MAX BAGS AFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_BAGS_AFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_BAGS_AFT_VALUE = 11;

	/**
	 * The '<em><b>MAX BAGS FRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_BAGS_FRONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_BAGS_FRONT_VALUE = 12;

	/**
	 * An array of all the '<em><b>Sorting Scheme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SortingScheme[] VALUES_ARRAY = new SortingScheme[] { RANDOM, RTF, FTR, WTA, WTA_RTF, WTA_FTR,
			BLOCK, BOARDING_CLASS, STEFFEN, MILNE_KELLY, BIG_BAGS_AFT, BIG_BAGS_FRONT, MAX_BAGS_AFT, MAX_BAGS_FRONT, };

	/**
	 * A public read-only list of all the '<em><b>Sorting Scheme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SortingScheme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sorting Scheme</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SortingScheme get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SortingScheme result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sorting Scheme</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SortingScheme getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SortingScheme result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sorting Scheme</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SortingScheme get(int value) {
		switch (value) {
		case RANDOM_VALUE:
			return RANDOM;
		case RTF_VALUE:
			return RTF;
		case FTR_VALUE:
			return FTR;
		case WTA_VALUE:
			return WTA;
		case WTA_RTF_VALUE:
			return WTA_RTF;
		case WTA_FTR_VALUE:
			return WTA_FTR;
		case BLOCK_VALUE:
			return BLOCK;
		case BOARDING_CLASS_VALUE:
			return BOARDING_CLASS;
		case STEFFEN_VALUE:
			return STEFFEN;
		case MILNE_KELLY_VALUE:
			return MILNE_KELLY;
		case BIG_BAGS_AFT_VALUE:
			return BIG_BAGS_AFT;
		case BIG_BAGS_FRONT_VALUE:
			return BIG_BAGS_FRONT;
		case MAX_BAGS_AFT_VALUE:
			return MAX_BAGS_AFT;
		case MAX_BAGS_FRONT_VALUE:
			return MAX_BAGS_FRONT;
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
	private SortingScheme(int value, String name, String literal) {
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

} //SortingScheme
