/**
 */
package net.bhl.cdt.paxelerate.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getExitType()
 * @model
 * @generated
 */
public enum ExitType implements Enumerator {
	/**
	 * The '<em><b>Before Row</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_ROW_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_ROW(0, "beforeRow", "beforeRow"), /**
	 * The '<em><b>In Row</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_ROW_VALUE
	 * @generated
	 * @ordered
	 */
	IN_ROW(1, "inRow", "inRow"), /**
	 * The '<em><b>Between Classes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETWEEN_CLASSES_VALUE
	 * @generated
	 * @ordered
	 */
	BETWEEN_CLASSES(2, "betweenClasses", "betweenClasses");

	/**
	 * The '<em><b>Before Row</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before Row</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_ROW
	 * @model name="beforeRow"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_ROW_VALUE = 0;

	/**
	 * The '<em><b>In Row</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Row</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_ROW
	 * @model name="inRow"
	 * @generated
	 * @ordered
	 */
	public static final int IN_ROW_VALUE = 1;

	/**
	 * The '<em><b>Between Classes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Between Classes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BETWEEN_CLASSES
	 * @model name="betweenClasses"
	 * @generated
	 * @ordered
	 */
	public static final int BETWEEN_CLASSES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Exit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExitType[] VALUES_ARRAY =
		new ExitType[] {
			BEFORE_ROW,
			IN_ROW,
			BETWEEN_CLASSES,
		};

	/**
	 * A public read-only list of all the '<em><b>Exit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExitType get(int value) {
		switch (value) {
			case BEFORE_ROW_VALUE: return BEFORE_ROW;
			case IN_ROW_VALUE: return IN_ROW;
			case BETWEEN_CLASSES_VALUE: return BETWEEN_CLASSES;
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
	private ExitType(int value, String name, String literal) {
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
	
} //ExitType
