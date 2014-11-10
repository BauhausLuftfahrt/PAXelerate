/**
 */
package net.bhl.cdt.model.cabin.impl;

import java.util.Collection;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.RowImpl#getSeats <em>Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.RowImpl#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.RowImpl#isOffsetInRow <em>Offset In Row</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.RowImpl#isAdditionalLegroom <em>Additional Legroom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RowImpl extends MinimalEObjectImpl.Container implements Row {
	/**
	 * The cached value of the '{@link #getSeats() <em>Seats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeats()
	 * @generated
	 * @ordered
	 */
	protected EList<Seat> seats;

	/**
	 * The default value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected int rowNumber = ROW_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isOffsetInRow() <em>Offset In Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOffsetInRow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OFFSET_IN_ROW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOffsetInRow() <em>Offset In Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOffsetInRow()
	 * @generated
	 * @ordered
	 */
	protected boolean offsetInRow = OFFSET_IN_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #isAdditionalLegroom() <em>Additional Legroom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditionalLegroom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADDITIONAL_LEGROOM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdditionalLegroom() <em>Additional Legroom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditionalLegroom()
	 * @generated
	 * @ordered
	 */
	protected boolean additionalLegroom = ADDITIONAL_LEGROOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Seat> getSeats() {
		if (seats == null) {
			seats = new EObjectContainmentEList<Seat>(Seat.class, this, CabinPackage.ROW__SEATS);
		}
		return seats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowNumber() {
		return rowNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowNumber(int newRowNumber) {
		int oldRowNumber = rowNumber;
		rowNumber = newRowNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.ROW__ROW_NUMBER, oldRowNumber, rowNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOffsetInRow() {
		return offsetInRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetInRow(boolean newOffsetInRow) {
		boolean oldOffsetInRow = offsetInRow;
		offsetInRow = newOffsetInRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.ROW__OFFSET_IN_ROW, oldOffsetInRow, offsetInRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdditionalLegroom() {
		return additionalLegroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalLegroom(boolean newAdditionalLegroom) {
		boolean oldAdditionalLegroom = additionalLegroom;
		additionalLegroom = newAdditionalLegroom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.ROW__ADDITIONAL_LEGROOM, oldAdditionalLegroom, additionalLegroom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CabinPackage.ROW__SEATS:
				return ((InternalEList<?>)getSeats()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.ROW__SEATS:
				return getSeats();
			case CabinPackage.ROW__ROW_NUMBER:
				return getRowNumber();
			case CabinPackage.ROW__OFFSET_IN_ROW:
				return isOffsetInRow();
			case CabinPackage.ROW__ADDITIONAL_LEGROOM:
				return isAdditionalLegroom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.ROW__SEATS:
				getSeats().clear();
				getSeats().addAll((Collection<? extends Seat>)newValue);
				return;
			case CabinPackage.ROW__ROW_NUMBER:
				setRowNumber((Integer)newValue);
				return;
			case CabinPackage.ROW__OFFSET_IN_ROW:
				setOffsetInRow((Boolean)newValue);
				return;
			case CabinPackage.ROW__ADDITIONAL_LEGROOM:
				setAdditionalLegroom((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CabinPackage.ROW__SEATS:
				getSeats().clear();
				return;
			case CabinPackage.ROW__ROW_NUMBER:
				setRowNumber(ROW_NUMBER_EDEFAULT);
				return;
			case CabinPackage.ROW__OFFSET_IN_ROW:
				setOffsetInRow(OFFSET_IN_ROW_EDEFAULT);
				return;
			case CabinPackage.ROW__ADDITIONAL_LEGROOM:
				setAdditionalLegroom(ADDITIONAL_LEGROOM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.ROW__SEATS:
				return seats != null && !seats.isEmpty();
			case CabinPackage.ROW__ROW_NUMBER:
				return rowNumber != ROW_NUMBER_EDEFAULT;
			case CabinPackage.ROW__OFFSET_IN_ROW:
				return offsetInRow != OFFSET_IN_ROW_EDEFAULT;
			case CabinPackage.ROW__ADDITIONAL_LEGROOM:
				return additionalLegroom != ADDITIONAL_LEGROOM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rowNumber: ");
		result.append(rowNumber);
		result.append(", offsetInRow: ");
		result.append(offsetInRow);
		result.append(", additionalLegroom: ");
		result.append(additionalLegroom);
		result.append(')');
		return result.toString();
	}

} //RowImpl
