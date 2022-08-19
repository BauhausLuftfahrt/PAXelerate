/**
 */
package paxelerate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.StudyType#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link paxelerate.StudyType#getActiveDoorUIDs <em>Active Door UI Ds</em>}</li>
 *   <li>{@link paxelerate.StudyType#getIterations <em>Iterations</em>}</li>
 *   <li>{@link paxelerate.StudyType#getSimulationType <em>Simulation Type</em>}</li>
 *   <li>{@link paxelerate.StudyType#isDisplaySimulation <em>Display Simulation</em>}</li>
 *   <li>{@link paxelerate.StudyType#getSeatType <em>Seat Type</em>}</li>
 *   <li>{@link paxelerate.StudyType#getSimulationGridResolution <em>Simulation Grid Resolution</em>}</li>
 *   <li>{@link paxelerate.StudyType#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link paxelerate.StudyType#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}</li>
 *   <li>{@link paxelerate.StudyType#getDoorSelection <em>Door Selection</em>}</li>
 *   <li>{@link paxelerate.StudyType#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}</li>
 *   <li>{@link paxelerate.StudyType#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}</li>
 *   <li>{@link paxelerate.StudyType#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}</li>
 *   <li>{@link paxelerate.StudyType#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}</li>
 *   <li>{@link paxelerate.StudyType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getStudyType()
 * @model extendedMetaData="name='studyType' kind='elementOnly'"
 * @generated
 */
public interface StudyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Factor</em>' attribute.
	 * @see #isSetLoadFactor()
	 * @see #unsetLoadFactor()
	 * @see #setLoadFactor(double)
	 * @see paxelerate.PaxeleratePackage#getStudyType_LoadFactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='loadFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLoadFactor();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getLoadFactor <em>Load Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Factor</em>' attribute.
	 * @see #isSetLoadFactor()
	 * @see #unsetLoadFactor()
	 * @see #getLoadFactor()
	 * @generated
	 */
	void setLoadFactor(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getLoadFactor <em>Load Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLoadFactor()
	 * @see #getLoadFactor()
	 * @see #setLoadFactor(double)
	 * @generated
	 */
	void unsetLoadFactor();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getLoadFactor <em>Load Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Load Factor</em>' attribute is set.
	 * @see #unsetLoadFactor()
	 * @see #getLoadFactor()
	 * @see #setLoadFactor(double)
	 * @generated
	 */
	boolean isSetLoadFactor();

	/**
	 * Returns the value of the '<em><b>Active Door UI Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Door UI Ds</em>' attribute.
	 * @see #setActiveDoorUIDs(String)
	 * @see paxelerate.PaxeleratePackage#getStudyType_ActiveDoorUIDs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='activeDoorUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	String getActiveDoorUIDs();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getActiveDoorUIDs <em>Active Door UI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Door UI Ds</em>' attribute.
	 * @see #getActiveDoorUIDs()
	 * @generated
	 */
	void setActiveDoorUIDs(String value);

	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #isSetIterations()
	 * @see #unsetIterations()
	 * @see #setIterations(int)
	 * @see paxelerate.PaxeleratePackage#getStudyType_Iterations()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='iterations' namespace='##targetNamespace'"
	 * @generated
	 */
	int getIterations();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #isSetIterations()
	 * @see #unsetIterations()
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(int value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIterations()
	 * @see #getIterations()
	 * @see #setIterations(int)
	 * @generated
	 */
	void unsetIterations();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getIterations <em>Iterations</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Iterations</em>' attribute is set.
	 * @see #unsetIterations()
	 * @see #getIterations()
	 * @see #setIterations(int)
	 * @generated
	 */
	boolean isSetIterations();

	/**
	 * Returns the value of the '<em><b>Simulation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link paxelerate.SimulationTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Type</em>' attribute.
	 * @see paxelerate.SimulationTypeType
	 * @see #isSetSimulationType()
	 * @see #unsetSimulationType()
	 * @see #setSimulationType(SimulationTypeType)
	 * @see paxelerate.PaxeleratePackage#getStudyType_SimulationType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='simulationType' namespace='##targetNamespace'"
	 * @generated
	 */
	SimulationTypeType getSimulationType();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getSimulationType <em>Simulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Type</em>' attribute.
	 * @see paxelerate.SimulationTypeType
	 * @see #isSetSimulationType()
	 * @see #unsetSimulationType()
	 * @see #getSimulationType()
	 * @generated
	 */
	void setSimulationType(SimulationTypeType value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getSimulationType <em>Simulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSimulationType()
	 * @see #getSimulationType()
	 * @see #setSimulationType(SimulationTypeType)
	 * @generated
	 */
	void unsetSimulationType();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getSimulationType <em>Simulation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Simulation Type</em>' attribute is set.
	 * @see #unsetSimulationType()
	 * @see #getSimulationType()
	 * @see #setSimulationType(SimulationTypeType)
	 * @generated
	 */
	boolean isSetSimulationType();

	/**
	 * Returns the value of the '<em><b>Display Simulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Simulation</em>' attribute.
	 * @see #isSetDisplaySimulation()
	 * @see #unsetDisplaySimulation()
	 * @see #setDisplaySimulation(boolean)
	 * @see paxelerate.PaxeleratePackage#getStudyType_DisplaySimulation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='displaySimulation' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDisplaySimulation();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#isDisplaySimulation <em>Display Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Simulation</em>' attribute.
	 * @see #isSetDisplaySimulation()
	 * @see #unsetDisplaySimulation()
	 * @see #isDisplaySimulation()
	 * @generated
	 */
	void setDisplaySimulation(boolean value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#isDisplaySimulation <em>Display Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplaySimulation()
	 * @see #isDisplaySimulation()
	 * @see #setDisplaySimulation(boolean)
	 * @generated
	 */
	void unsetDisplaySimulation();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#isDisplaySimulation <em>Display Simulation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Simulation</em>' attribute is set.
	 * @see #unsetDisplaySimulation()
	 * @see #isDisplaySimulation()
	 * @see #setDisplaySimulation(boolean)
	 * @generated
	 */
	boolean isSetDisplaySimulation();

	/**
	 * Returns the value of the '<em><b>Seat Type</b></em>' attribute.
	 * The literals are from the enumeration {@link paxelerate.SeatTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Type</em>' attribute.
	 * @see paxelerate.SeatTypeType
	 * @see #isSetSeatType()
	 * @see #unsetSeatType()
	 * @see #setSeatType(SeatTypeType)
	 * @see paxelerate.PaxeleratePackage#getStudyType_SeatType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='seatType' namespace='##targetNamespace'"
	 * @generated
	 */
	SeatTypeType getSeatType();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getSeatType <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Type</em>' attribute.
	 * @see paxelerate.SeatTypeType
	 * @see #isSetSeatType()
	 * @see #unsetSeatType()
	 * @see #getSeatType()
	 * @generated
	 */
	void setSeatType(SeatTypeType value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getSeatType <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeatType()
	 * @see #getSeatType()
	 * @see #setSeatType(SeatTypeType)
	 * @generated
	 */
	void unsetSeatType();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getSeatType <em>Seat Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seat Type</em>' attribute is set.
	 * @see #unsetSeatType()
	 * @see #getSeatType()
	 * @see #setSeatType(SeatTypeType)
	 * @generated
	 */
	boolean isSetSeatType();

	/**
	 * Returns the value of the '<em><b>Simulation Grid Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Grid Resolution</em>' attribute.
	 * @see #isSetSimulationGridResolution()
	 * @see #unsetSimulationGridResolution()
	 * @see #setSimulationGridResolution(double)
	 * @see paxelerate.PaxeleratePackage#getStudyType_SimulationGridResolution()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='simulationGridResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSimulationGridResolution();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getSimulationGridResolution <em>Simulation Grid Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Grid Resolution</em>' attribute.
	 * @see #isSetSimulationGridResolution()
	 * @see #unsetSimulationGridResolution()
	 * @see #getSimulationGridResolution()
	 * @generated
	 */
	void setSimulationGridResolution(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getSimulationGridResolution <em>Simulation Grid Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSimulationGridResolution()
	 * @see #getSimulationGridResolution()
	 * @see #setSimulationGridResolution(double)
	 * @generated
	 */
	void unsetSimulationGridResolution();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getSimulationGridResolution <em>Simulation Grid Resolution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Simulation Grid Resolution</em>' attribute is set.
	 * @see #unsetSimulationGridResolution()
	 * @see #getSimulationGridResolution()
	 * @see #setSimulationGridResolution(double)
	 * @generated
	 */
	boolean isSetSimulationGridResolution();

	/**
	 * Returns the value of the '<em><b>Simulation Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Speed Factor</em>' attribute.
	 * @see #isSetSimulationSpeedFactor()
	 * @see #unsetSimulationSpeedFactor()
	 * @see #setSimulationSpeedFactor(double)
	 * @see paxelerate.PaxeleratePackage#getStudyType_SimulationSpeedFactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='simulationSpeedFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSimulationSpeedFactor();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Speed Factor</em>' attribute.
	 * @see #isSetSimulationSpeedFactor()
	 * @see #unsetSimulationSpeedFactor()
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 */
	void setSimulationSpeedFactor(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSimulationSpeedFactor()
	 * @see #getSimulationSpeedFactor()
	 * @see #setSimulationSpeedFactor(double)
	 * @generated
	 */
	void unsetSimulationSpeedFactor();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Simulation Speed Factor</em>' attribute is set.
	 * @see #unsetSimulationSpeedFactor()
	 * @see #getSimulationSpeedFactor()
	 * @see #setSimulationSpeedFactor(double)
	 * @generated
	 */
	boolean isSetSimulationSpeedFactor();

	/**
	 * Returns the value of the '<em><b>Passenger Sorting Scheme</b></em>' attribute.
	 * The literals are from the enumeration {@link paxelerate.PassengerSortingSchemeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Sorting Scheme</em>' attribute.
	 * @see paxelerate.PassengerSortingSchemeType
	 * @see #isSetPassengerSortingScheme()
	 * @see #unsetPassengerSortingScheme()
	 * @see #setPassengerSortingScheme(PassengerSortingSchemeType)
	 * @see paxelerate.PaxeleratePackage#getStudyType_PassengerSortingScheme()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='passengerSortingScheme' namespace='##targetNamespace'"
	 * @generated
	 */
	PassengerSortingSchemeType getPassengerSortingScheme();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Sorting Scheme</em>' attribute.
	 * @see paxelerate.PassengerSortingSchemeType
	 * @see #isSetPassengerSortingScheme()
	 * @see #unsetPassengerSortingScheme()
	 * @see #getPassengerSortingScheme()
	 * @generated
	 */
	void setPassengerSortingScheme(PassengerSortingSchemeType value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPassengerSortingScheme()
	 * @see #getPassengerSortingScheme()
	 * @see #setPassengerSortingScheme(PassengerSortingSchemeType)
	 * @generated
	 */
	void unsetPassengerSortingScheme();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Passenger Sorting Scheme</em>' attribute is set.
	 * @see #unsetPassengerSortingScheme()
	 * @see #getPassengerSortingScheme()
	 * @see #setPassengerSortingScheme(PassengerSortingSchemeType)
	 * @generated
	 */
	boolean isSetPassengerSortingScheme();

	/**
	 * Returns the value of the '<em><b>Door Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link paxelerate.DoorSelectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Selection</em>' attribute.
	 * @see paxelerate.DoorSelectionType
	 * @see #isSetDoorSelection()
	 * @see #unsetDoorSelection()
	 * @see #setDoorSelection(DoorSelectionType)
	 * @see paxelerate.PaxeleratePackage#getStudyType_DoorSelection()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='doorSelection' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorSelectionType getDoorSelection();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getDoorSelection <em>Door Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Selection</em>' attribute.
	 * @see paxelerate.DoorSelectionType
	 * @see #isSetDoorSelection()
	 * @see #unsetDoorSelection()
	 * @see #getDoorSelection()
	 * @generated
	 */
	void setDoorSelection(DoorSelectionType value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getDoorSelection <em>Door Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoorSelection()
	 * @see #getDoorSelection()
	 * @see #setDoorSelection(DoorSelectionType)
	 * @generated
	 */
	void unsetDoorSelection();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getDoorSelection <em>Door Selection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Door Selection</em>' attribute is set.
	 * @see #unsetDoorSelection()
	 * @see #getDoorSelection()
	 * @see #setDoorSelection(DoorSelectionType)
	 * @generated
	 */
	boolean isSetDoorSelection();

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Jackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Jackets</em>' attribute.
	 * @see #isSetPercentageOfPassengersWithJackets()
	 * @see #unsetPercentageOfPassengersWithJackets()
	 * @see #setPercentageOfPassengersWithJackets(double)
	 * @see paxelerate.PaxeleratePackage#getStudyType_PercentageOfPassengersWithJackets()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='percentageOfPassengersWithJackets' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPercentageOfPassengersWithJackets();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Jackets</em>' attribute.
	 * @see #isSetPercentageOfPassengersWithJackets()
	 * @see #unsetPercentageOfPassengersWithJackets()
	 * @see #getPercentageOfPassengersWithJackets()
	 * @generated
	 */
	void setPercentageOfPassengersWithJackets(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentageOfPassengersWithJackets()
	 * @see #getPercentageOfPassengersWithJackets()
	 * @see #setPercentageOfPassengersWithJackets(double)
	 * @generated
	 */
	void unsetPercentageOfPassengersWithJackets();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percentage Of Passengers With Jackets</em>' attribute is set.
	 * @see #unsetPercentageOfPassengersWithJackets()
	 * @see #getPercentageOfPassengersWithJackets()
	 * @see #setPercentageOfPassengersWithJackets(double)
	 * @generated
	 */
	boolean isSetPercentageOfPassengersWithJackets();

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Small Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Small Bags</em>' attribute.
	 * @see #isSetPercentageOfPassengersWithSmallBags()
	 * @see #unsetPercentageOfPassengersWithSmallBags()
	 * @see #setPercentageOfPassengersWithSmallBags(double)
	 * @see paxelerate.PaxeleratePackage#getStudyType_PercentageOfPassengersWithSmallBags()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='percentageOfPassengersWithSmallBags' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPercentageOfPassengersWithSmallBags();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Small Bags</em>' attribute.
	 * @see #isSetPercentageOfPassengersWithSmallBags()
	 * @see #unsetPercentageOfPassengersWithSmallBags()
	 * @see #getPercentageOfPassengersWithSmallBags()
	 * @generated
	 */
	void setPercentageOfPassengersWithSmallBags(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentageOfPassengersWithSmallBags()
	 * @see #getPercentageOfPassengersWithSmallBags()
	 * @see #setPercentageOfPassengersWithSmallBags(double)
	 * @generated
	 */
	void unsetPercentageOfPassengersWithSmallBags();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percentage Of Passengers With Small Bags</em>' attribute is set.
	 * @see #unsetPercentageOfPassengersWithSmallBags()
	 * @see #getPercentageOfPassengersWithSmallBags()
	 * @see #setPercentageOfPassengersWithSmallBags(double)
	 * @generated
	 */
	boolean isSetPercentageOfPassengersWithSmallBags();

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Medium Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Medium Bags</em>' attribute.
	 * @see #isSetPercentageOfPassengersWithMediumBags()
	 * @see #unsetPercentageOfPassengersWithMediumBags()
	 * @see #setPercentageOfPassengersWithMediumBags(double)
	 * @see paxelerate.PaxeleratePackage#getStudyType_PercentageOfPassengersWithMediumBags()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='percentageOfPassengersWithMediumBags' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPercentageOfPassengersWithMediumBags();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Medium Bags</em>' attribute.
	 * @see #isSetPercentageOfPassengersWithMediumBags()
	 * @see #unsetPercentageOfPassengersWithMediumBags()
	 * @see #getPercentageOfPassengersWithMediumBags()
	 * @generated
	 */
	void setPercentageOfPassengersWithMediumBags(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentageOfPassengersWithMediumBags()
	 * @see #getPercentageOfPassengersWithMediumBags()
	 * @see #setPercentageOfPassengersWithMediumBags(double)
	 * @generated
	 */
	void unsetPercentageOfPassengersWithMediumBags();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percentage Of Passengers With Medium Bags</em>' attribute is set.
	 * @see #unsetPercentageOfPassengersWithMediumBags()
	 * @see #getPercentageOfPassengersWithMediumBags()
	 * @see #setPercentageOfPassengersWithMediumBags(double)
	 * @generated
	 */
	boolean isSetPercentageOfPassengersWithMediumBags();

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Large Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Large Bags</em>' attribute.
	 * @see #isSetPercentageOfPassengersWithLargeBags()
	 * @see #unsetPercentageOfPassengersWithLargeBags()
	 * @see #setPercentageOfPassengersWithLargeBags(double)
	 * @see paxelerate.PaxeleratePackage#getStudyType_PercentageOfPassengersWithLargeBags()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='percentageOfPassengersWithLargeBags' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPercentageOfPassengersWithLargeBags();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Large Bags</em>' attribute.
	 * @see #isSetPercentageOfPassengersWithLargeBags()
	 * @see #unsetPercentageOfPassengersWithLargeBags()
	 * @see #getPercentageOfPassengersWithLargeBags()
	 * @generated
	 */
	void setPercentageOfPassengersWithLargeBags(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentageOfPassengersWithLargeBags()
	 * @see #getPercentageOfPassengersWithLargeBags()
	 * @see #setPercentageOfPassengersWithLargeBags(double)
	 * @generated
	 */
	void unsetPercentageOfPassengersWithLargeBags();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyType#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percentage Of Passengers With Large Bags</em>' attribute is set.
	 * @see #unsetPercentageOfPassengersWithLargeBags()
	 * @see #getPercentageOfPassengersWithLargeBags()
	 * @see #setPercentageOfPassengersWithLargeBags(double)
	 * @generated
	 */
	boolean isSetPercentageOfPassengersWithLargeBags();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see paxelerate.PaxeleratePackage#getStudyType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link paxelerate.StudyType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // StudyType
