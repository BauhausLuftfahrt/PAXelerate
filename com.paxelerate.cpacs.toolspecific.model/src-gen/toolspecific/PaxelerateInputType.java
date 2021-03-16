/**
 */
package toolspecific;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paxelerate Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.PaxelerateInputType#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getActiveDoorUIDs <em>Active Door UI Ds</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getIterations <em>Iterations</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getSimulationType <em>Simulation Type</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getDisplaySimulation <em>Display Simulation</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getSeatType <em>Seat Type</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getSimulationGridResolution <em>Simulation Grid Resolution</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getPassengerAgressiveMoodShare <em>Passenger Agressive Mood Share</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getDoorSelection <em>Door Selection</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}</li>
 *   <li>{@link toolspecific.PaxelerateInputType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType()
 * @model extendedMetaData="name='paxelerateInputType' kind='elementOnly'"
 * @generated
 */
public interface PaxelerateInputType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Factor</em>' containment reference.
	 * @see #setLoadFactor(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_LoadFactor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLoadFactor();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getLoadFactor <em>Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Factor</em>' containment reference.
	 * @see #getLoadFactor()
	 * @generated
	 */
	void setLoadFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Active Door UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Door UI Ds</em>' containment reference.
	 * @see #setActiveDoorUIDs(StringVectorBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_ActiveDoorUIDs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activeDoorUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getActiveDoorUIDs();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getActiveDoorUIDs <em>Active Door UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Door UI Ds</em>' containment reference.
	 * @see #getActiveDoorUIDs()
	 * @generated
	 */
	void setActiveDoorUIDs(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' containment reference.
	 * @see #setIterations(IntegerBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_Iterations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='iterations' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getIterations();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getIterations <em>Iterations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' containment reference.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Simulation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Type</em>' containment reference.
	 * @see #setSimulationType(SimulationTypeType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_SimulationType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='simulationType' namespace='##targetNamespace'"
	 * @generated
	 */
	SimulationTypeType getSimulationType();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getSimulationType <em>Simulation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Type</em>' containment reference.
	 * @see #getSimulationType()
	 * @generated
	 */
	void setSimulationType(SimulationTypeType value);

	/**
	 * Returns the value of the '<em><b>Display Simulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Simulation</em>' containment reference.
	 * @see #setDisplaySimulation(BooleanBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_DisplaySimulation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='displaySimulation' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getDisplaySimulation();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getDisplaySimulation <em>Display Simulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Simulation</em>' containment reference.
	 * @see #getDisplaySimulation()
	 * @generated
	 */
	void setDisplaySimulation(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Seat Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Type</em>' containment reference.
	 * @see #setSeatType(SeatTypeType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_SeatType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seatType' namespace='##targetNamespace'"
	 * @generated
	 */
	SeatTypeType getSeatType();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getSeatType <em>Seat Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Type</em>' containment reference.
	 * @see #getSeatType()
	 * @generated
	 */
	void setSeatType(SeatTypeType value);

	/**
	 * Returns the value of the '<em><b>Simulation Grid Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Grid Resolution</em>' containment reference.
	 * @see #setSimulationGridResolution(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_SimulationGridResolution()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='simulationGridResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSimulationGridResolution();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getSimulationGridResolution <em>Simulation Grid Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Grid Resolution</em>' containment reference.
	 * @see #getSimulationGridResolution()
	 * @generated
	 */
	void setSimulationGridResolution(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Simulation Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Speed Factor</em>' containment reference.
	 * @see #setSimulationSpeedFactor(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_SimulationSpeedFactor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='simulationSpeedFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSimulationSpeedFactor();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Speed Factor</em>' containment reference.
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 */
	void setSimulationSpeedFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Passenger Sorting Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Sorting Scheme</em>' containment reference.
	 * @see #setPassengerSortingScheme(PassengerSortingSchemeType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_PassengerSortingScheme()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='passengerSortingScheme' namespace='##targetNamespace'"
	 * @generated
	 */
	PassengerSortingSchemeType getPassengerSortingScheme();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Sorting Scheme</em>' containment reference.
	 * @see #getPassengerSortingScheme()
	 * @generated
	 */
	void setPassengerSortingScheme(PassengerSortingSchemeType value);

	/**
	 * Returns the value of the '<em><b>Passenger Agressive Mood Share</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Agressive Mood Share</em>' containment reference.
	 * @see #setPassengerAgressiveMoodShare(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_PassengerAgressiveMoodShare()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='passengerAgressiveMoodShare' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPassengerAgressiveMoodShare();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getPassengerAgressiveMoodShare <em>Passenger Agressive Mood Share</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Agressive Mood Share</em>' containment reference.
	 * @see #getPassengerAgressiveMoodShare()
	 * @generated
	 */
	void setPassengerAgressiveMoodShare(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Seat Interference Process Time Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Mean</em>' containment reference.
	 * @see #setSeatInterferenceProcessTimeMean(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_SeatInterferenceProcessTimeMean()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seatInterferenceProcessTimeMean' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSeatInterferenceProcessTimeMean();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Interference Process Time Mean</em>' containment reference.
	 * @see #getSeatInterferenceProcessTimeMean()
	 * @generated
	 */
	void setSeatInterferenceProcessTimeMean(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Seat Interference Process Time Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Deviation</em>' containment reference.
	 * @see #setSeatInterferenceProcessTimeDeviation(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_SeatInterferenceProcessTimeDeviation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seatInterferenceProcessTimeDeviation' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSeatInterferenceProcessTimeDeviation();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Interference Process Time Deviation</em>' containment reference.
	 * @see #getSeatInterferenceProcessTimeDeviation()
	 * @generated
	 */
	void setSeatInterferenceProcessTimeDeviation(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Door Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Selection</em>' containment reference.
	 * @see #setDoorSelection(DoorSelectionType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_DoorSelection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doorSelection' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorSelectionType getDoorSelection();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getDoorSelection <em>Door Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Selection</em>' containment reference.
	 * @see #getDoorSelection()
	 * @generated
	 */
	void setDoorSelection(DoorSelectionType value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Jackets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Jackets</em>' containment reference.
	 * @see #setPercentageOfPassengersWithJackets(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_PercentageOfPassengersWithJackets()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='percentageOfPassengersWithJackets' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPercentageOfPassengersWithJackets();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Jackets</em>' containment reference.
	 * @see #getPercentageOfPassengersWithJackets()
	 * @generated
	 */
	void setPercentageOfPassengersWithJackets(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Small Bags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Small Bags</em>' containment reference.
	 * @see #setPercentageOfPassengersWithSmallBags(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_PercentageOfPassengersWithSmallBags()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='percentageOfPassengersWithSmallBags' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPercentageOfPassengersWithSmallBags();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Small Bags</em>' containment reference.
	 * @see #getPercentageOfPassengersWithSmallBags()
	 * @generated
	 */
	void setPercentageOfPassengersWithSmallBags(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Medium Bags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Medium Bags</em>' containment reference.
	 * @see #setPercentageOfPassengersWithMediumBags(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_PercentageOfPassengersWithMediumBags()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='percentageOfPassengersWithMediumBags' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPercentageOfPassengersWithMediumBags();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Medium Bags</em>' containment reference.
	 * @see #getPercentageOfPassengersWithMediumBags()
	 * @generated
	 */
	void setPercentageOfPassengersWithMediumBags(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Large Bags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Large Bags</em>' containment reference.
	 * @see #setPercentageOfPassengersWithLargeBags(DoubleBaseType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_PercentageOfPassengersWithLargeBags()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='percentageOfPassengersWithLargeBags' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPercentageOfPassengersWithLargeBags();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Large Bags</em>' containment reference.
	 * @see #getPercentageOfPassengersWithLargeBags()
	 * @generated
	 */
	void setPercentageOfPassengersWithLargeBags(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PaxelerateInputType
