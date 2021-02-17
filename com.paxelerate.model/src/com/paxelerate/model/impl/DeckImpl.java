/**
 */
package com.paxelerate.model.impl;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.ModelPackage;

import com.paxelerate.model.agent.Passenger;

import com.paxelerate.model.monuments.Aisle;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Obstacle;
import com.paxelerate.model.monuments.Row;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Deck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.impl.DeckImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.DeckImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.DeckImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.DeckImpl#getObstacles <em>Obstacles</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.DeckImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.DeckImpl#getAisles <em>Aisles</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.DeckImpl#getShapeFloor <em>Shape Floor</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.DeckImpl#getPassengers <em>Passengers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckImpl extends MinimalEObjectImpl.Container implements Deck {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 2.15;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> rows;

	/**
	 * The cached value of the '{@link #getObstacles() <em>Obstacles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstacles()
	 * @generated
	 * @ordered
	 */
	protected EList<Obstacle> obstacles;

	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected EList<Door> doors;

	/**
	 * The cached value of the '{@link #getAisles() <em>Aisles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAisles()
	 * @generated
	 * @ordered
	 */
	protected EList<Aisle> aisles;

	/**
	 * The cached value of the '{@link #getShapeFloor() <em>Shape Floor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeFloor()
	 * @generated
	 * @ordered
	 */
	protected EList<EPoint> shapeFloor;

	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> passengers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DECK;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DECK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DECK__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<Row>(Row.class, this, ModelPackage.DECK__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obstacle> getObstacles() {
		if (obstacles == null) {
			obstacles = new EObjectContainmentEList<Obstacle>(Obstacle.class, this, ModelPackage.DECK__OBSTACLES);
		}
		return obstacles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Door> getDoors() {
		if (doors == null) {
			doors = new EObjectContainmentEList<Door>(Door.class, this, ModelPackage.DECK__DOORS);
		}
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aisle> getAisles() {
		if (aisles == null) {
			aisles = new EObjectContainmentEList<Aisle>(Aisle.class, this, ModelPackage.DECK__AISLES);
		}
		return aisles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPoint> getShapeFloor() {
		if (shapeFloor == null) {
			shapeFloor = new EObjectContainmentEList<EPoint>(EPoint.class, this, ModelPackage.DECK__SHAPE_FLOOR);
		}
		return shapeFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Passenger> getPassengers() {
		if (passengers == null) {
			passengers = new EObjectContainmentEList<Passenger>(Passenger.class, this, ModelPackage.DECK__PASSENGERS);
		}
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.DECK__ROWS:
			return ((InternalEList<?>) getRows()).basicRemove(otherEnd, msgs);
		case ModelPackage.DECK__OBSTACLES:
			return ((InternalEList<?>) getObstacles()).basicRemove(otherEnd, msgs);
		case ModelPackage.DECK__DOORS:
			return ((InternalEList<?>) getDoors()).basicRemove(otherEnd, msgs);
		case ModelPackage.DECK__AISLES:
			return ((InternalEList<?>) getAisles()).basicRemove(otherEnd, msgs);
		case ModelPackage.DECK__SHAPE_FLOOR:
			return ((InternalEList<?>) getShapeFloor()).basicRemove(otherEnd, msgs);
		case ModelPackage.DECK__PASSENGERS:
			return ((InternalEList<?>) getPassengers()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.DECK__NAME:
			return getName();
		case ModelPackage.DECK__HEIGHT:
			return getHeight();
		case ModelPackage.DECK__ROWS:
			return getRows();
		case ModelPackage.DECK__OBSTACLES:
			return getObstacles();
		case ModelPackage.DECK__DOORS:
			return getDoors();
		case ModelPackage.DECK__AISLES:
			return getAisles();
		case ModelPackage.DECK__SHAPE_FLOOR:
			return getShapeFloor();
		case ModelPackage.DECK__PASSENGERS:
			return getPassengers();
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
		case ModelPackage.DECK__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.DECK__HEIGHT:
			setHeight((Double) newValue);
			return;
		case ModelPackage.DECK__ROWS:
			getRows().clear();
			getRows().addAll((Collection<? extends Row>) newValue);
			return;
		case ModelPackage.DECK__OBSTACLES:
			getObstacles().clear();
			getObstacles().addAll((Collection<? extends Obstacle>) newValue);
			return;
		case ModelPackage.DECK__DOORS:
			getDoors().clear();
			getDoors().addAll((Collection<? extends Door>) newValue);
			return;
		case ModelPackage.DECK__AISLES:
			getAisles().clear();
			getAisles().addAll((Collection<? extends Aisle>) newValue);
			return;
		case ModelPackage.DECK__SHAPE_FLOOR:
			getShapeFloor().clear();
			getShapeFloor().addAll((Collection<? extends EPoint>) newValue);
			return;
		case ModelPackage.DECK__PASSENGERS:
			getPassengers().clear();
			getPassengers().addAll((Collection<? extends Passenger>) newValue);
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
		case ModelPackage.DECK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.DECK__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case ModelPackage.DECK__ROWS:
			getRows().clear();
			return;
		case ModelPackage.DECK__OBSTACLES:
			getObstacles().clear();
			return;
		case ModelPackage.DECK__DOORS:
			getDoors().clear();
			return;
		case ModelPackage.DECK__AISLES:
			getAisles().clear();
			return;
		case ModelPackage.DECK__SHAPE_FLOOR:
			getShapeFloor().clear();
			return;
		case ModelPackage.DECK__PASSENGERS:
			getPassengers().clear();
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
		case ModelPackage.DECK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.DECK__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case ModelPackage.DECK__ROWS:
			return rows != null && !rows.isEmpty();
		case ModelPackage.DECK__OBSTACLES:
			return obstacles != null && !obstacles.isEmpty();
		case ModelPackage.DECK__DOORS:
			return doors != null && !doors.isEmpty();
		case ModelPackage.DECK__AISLES:
			return aisles != null && !aisles.isEmpty();
		case ModelPackage.DECK__SHAPE_FLOOR:
			return shapeFloor != null && !shapeFloor.isEmpty();
		case ModelPackage.DECK__PASSENGERS:
			return passengers != null && !passengers.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //DeckImpl
