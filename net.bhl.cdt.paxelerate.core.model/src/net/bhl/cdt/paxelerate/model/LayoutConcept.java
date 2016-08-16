/**
 */
package net.bhl.cdt.paxelerate.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Layout Concept</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLayoutConcept()
 * @model
 * @generated
 */
public enum LayoutConcept implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "Default", "Default"),

	/**
	 * The '<em><b>Sidways Foldable Seat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIDWAYS_FOLDABLE_SEAT_VALUE
	 * @generated
	 * @ordered
	 */
	SIDWAYS_FOLDABLE_SEAT(1, "SidwaysFoldableSeat", "SidwaysFoldableSeat"),

	/**
	 * The '<em><b>Lifting Seat Pan Seats</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFTING_SEAT_PAN_SEATS_VALUE
	 * @generated
	 * @ordered
	 */
	LIFTING_SEAT_PAN_SEATS(2, "LiftingSeatPanSeats", "LiftingSeatPanSeats"),

	/**
	 * The '<em><b>Bring Your Own Seat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRING_YOUR_OWN_SEAT_VALUE
	 * @generated
	 * @ordered
	 */
	BRING_YOUR_OWN_SEAT(3, "BringYourOwnSeat", "BringYourOwnSeat");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="Default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Sidways Foldable Seat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sidways Foldable Seat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIDWAYS_FOLDABLE_SEAT
	 * @model name="SidwaysFoldableSeat"
	 * @generated
	 * @ordered
	 */
	public static final int SIDWAYS_FOLDABLE_SEAT_VALUE = 1;

	/**
	 * The '<em><b>Lifting Seat Pan Seats</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lifting Seat Pan Seats</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIFTING_SEAT_PAN_SEATS
	 * @model name="LiftingSeatPanSeats"
	 * @generated
	 * @ordered
	 */
	public static final int LIFTING_SEAT_PAN_SEATS_VALUE = 2;

	/**
	 * The '<em><b>Bring Your Own Seat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bring Your Own Seat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRING_YOUR_OWN_SEAT
	 * @model name="BringYourOwnSeat"
	 * @generated
	 * @ordered
	 */
	public static final int BRING_YOUR_OWN_SEAT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Layout Concept</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LayoutConcept[] VALUES_ARRAY =
		new LayoutConcept[] {
			DEFAULT,
			SIDWAYS_FOLDABLE_SEAT,
			LIFTING_SEAT_PAN_SEATS,
			BRING_YOUR_OWN_SEAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Layout Concept</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LayoutConcept> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Layout Concept</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LayoutConcept get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LayoutConcept result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout Concept</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LayoutConcept getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LayoutConcept result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Layout Concept</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LayoutConcept get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case SIDWAYS_FOLDABLE_SEAT_VALUE: return SIDWAYS_FOLDABLE_SEAT;
			case LIFTING_SEAT_PAN_SEATS_VALUE: return LIFTING_SEAT_PAN_SEATS;
			case BRING_YOUR_OWN_SEAT_VALUE: return BRING_YOUR_OWN_SEAT;
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
	private LayoutConcept(int value, String name, String literal) {
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
	
} //LayoutConcept
