/**
 */
package com.paxelerate.model.settings.impl;

import com.paxelerate.model.ModelPackage;

import com.paxelerate.model.agent.AgentPackage;

import com.paxelerate.model.agent.impl.AgentPackageImpl;

import com.paxelerate.model.enums.EnumsPackage;

import com.paxelerate.model.enums.impl.EnumsPackageImpl;

import com.paxelerate.model.impl.ModelPackageImpl;

import com.paxelerate.model.monuments.MonumentsPackage;

import com.paxelerate.model.monuments.impl.MonumentsPackageImpl;

import com.paxelerate.model.settings.LuggageProperties;
import com.paxelerate.model.settings.PassengerProperties;
import com.paxelerate.model.settings.Settings;
import com.paxelerate.model.settings.SettingsFactory;
import com.paxelerate.model.settings.SettingsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SettingsPackageImpl extends EPackageImpl implements SettingsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luggagePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerPropertiesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.paxelerate.model.settings.SettingsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SettingsPackageImpl() {
		super(eNS_URI, SettingsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SettingsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SettingsPackage init() {
		if (isInited)
			return (SettingsPackage) EPackage.Registry.INSTANCE.getEPackage(SettingsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSettingsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SettingsPackageImpl theSettingsPackage = registeredSettingsPackage instanceof SettingsPackageImpl
				? (SettingsPackageImpl) registeredSettingsPackage
				: new SettingsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		ModelPackageImpl theModelPackage = (ModelPackageImpl) (registeredPackage instanceof ModelPackageImpl
				? registeredPackage
				: ModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AgentPackage.eNS_URI);
		AgentPackageImpl theAgentPackage = (AgentPackageImpl) (registeredPackage instanceof AgentPackageImpl
				? registeredPackage
				: AgentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MonumentsPackage.eNS_URI);
		MonumentsPackageImpl theMonumentsPackage = (MonumentsPackageImpl) (registeredPackage instanceof MonumentsPackageImpl
				? registeredPackage
				: MonumentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl) (registeredPackage instanceof EnumsPackageImpl
				? registeredPackage
				: EnumsPackage.eINSTANCE);

		// Create package meta-data objects
		theSettingsPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theAgentPackage.createPackageContents();
		theMonumentsPackage.createPackageContents();
		theEnumsPackage.createPackageContents();

		// Initialize created meta-data
		theSettingsPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theAgentPackage.initializePackageContents();
		theMonumentsPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSettingsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SettingsPackage.eNS_URI, theSettingsPackage);
		return theSettingsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettings() {
		return settingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettings_LuggageProperties() {
		return (EReference) settingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettings_PassengerProperties() {
		return (EReference) settingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_SimulationType() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_UseCenterLuggageStorage() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_SeatType() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_SimulationGridResolution() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_SimulationSpeedFactor() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_ThreadSleepTimeDefault() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_SidewaysFoldabeSeatPopupTimeMean() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_SidewaysFoldabeSeatPopupTimeDeviation() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_LiftingSeatPanPopupTimeMean() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_LiftingSeatPanPopupTimeDeviation() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_BoardingConformanceRate() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettings_NumberOfBoardingBlocks() {
		return (EAttribute) settingsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuggageProperties() {
		return luggagePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_MaxNumberOfLuggageItemsPerPax() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LuggageStowDistanceFromSeatMean() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LuggageStowDistanceFromSeatDeviation() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_JacketStowTimeDeviation() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_JacketStowTimeMean() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_SmallBagStowTimeMean() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_SmallBagStowTimeDeviation() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_MediumBagStowTimeMean() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_MediumBagStowTimeDeviation() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LargeBagStowTimeMean() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LargeBagStowTimeDeviation() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_JacketVolume() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_SmallBagVolume() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_MediumBagVolume() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LargeBagVolume() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_JacketBulkiness() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_SmallBagBulkiness() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_MediumBagBulkiness() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LargeBagBulkiness() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_JacketWalkingSpeedFactor() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_SmallBagWalkingSpeedFactor() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_MediumBagWalkingSpeedFactor() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LargeBagWalkingSpeedFactor() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LuggageStorageScaling() {
		return (EAttribute) luggagePropertiesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerProperties() {
		return passengerPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWidthMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWidthDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWeightMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWeightDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHeightMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHeightDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerDepthMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerDepthDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWidthMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWidthDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWeightMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWeightDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHeightMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHeightDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerDepthMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerDepthDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerAggressiveMoodShare() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_SeatInterferenceProcessTimeMean() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_SeatInterferenceProcessTimeDeviation() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatMean() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatDeviation() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassivePassengerWaitingTimeAfterCollision() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_SeatInterferenceMultiPassengerFactor() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_DoorSelection() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_GroupPercentage() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerProperties_AgeSpeedDependency() {
		return (EReference) passengerPropertiesEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerProperties_AgeDistribution() {
		return (EReference) passengerPropertiesEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeWidthMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeWidthDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeWidthMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeWidthDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeDepthMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeDepthDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeDepthMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeDepthDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeHeightMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeHeightDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeHeightMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerKneeHeightDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipWidthMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipWidthDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipWidthMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipWidthDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipDepthMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipDepthDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipDepthMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipDepthDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipHeightMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipHeightDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipHeightMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHipHeightDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderWidthMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderWidthDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderWidthMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderWidthDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderDepthMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderDepthDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderDepthMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderDepthDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderHeightMeanMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderHeightDeviationMale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderHeightMeanFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerShoulderHeightDeviationFemale() {
		return (EAttribute) passengerPropertiesEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsFactory getSettingsFactory() {
		return (SettingsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		settingsEClass = createEClass(SETTINGS);
		createEReference(settingsEClass, SETTINGS__LUGGAGE_PROPERTIES);
		createEReference(settingsEClass, SETTINGS__PASSENGER_PROPERTIES);
		createEAttribute(settingsEClass, SETTINGS__SIMULATION_TYPE);
		createEAttribute(settingsEClass, SETTINGS__USE_CENTER_LUGGAGE_STORAGE);
		createEAttribute(settingsEClass, SETTINGS__SEAT_TYPE);
		createEAttribute(settingsEClass, SETTINGS__SIMULATION_GRID_RESOLUTION);
		createEAttribute(settingsEClass, SETTINGS__SIMULATION_SPEED_FACTOR);
		createEAttribute(settingsEClass, SETTINGS__THREAD_SLEEP_TIME_DEFAULT);
		createEAttribute(settingsEClass, SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN);
		createEAttribute(settingsEClass, SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION);
		createEAttribute(settingsEClass, SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_MEAN);
		createEAttribute(settingsEClass, SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION);
		createEAttribute(settingsEClass, SETTINGS__BOARDING_CONFORMANCE_RATE);
		createEAttribute(settingsEClass, SETTINGS__NUMBER_OF_BOARDING_BLOCKS);

		luggagePropertiesEClass = createEClass(LUGGAGE_PROPERTIES);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__JACKET_STOW_TIME_DEVIATION);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__JACKET_STOW_TIME_MEAN);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_MEAN);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_DEVIATION);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_MEAN);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_DEVIATION);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_MEAN);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_DEVIATION);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__JACKET_VOLUME);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__SMALL_BAG_VOLUME);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__MEDIUM_BAG_VOLUME);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__LARGE_BAG_VOLUME);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__JACKET_BULKINESS);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__SMALL_BAG_BULKINESS);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__MEDIUM_BAG_BULKINESS);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__LARGE_BAG_BULKINESS);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__JACKET_WALKING_SPEED_FACTOR);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__SMALL_BAG_WALKING_SPEED_FACTOR);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__MEDIUM_BAG_WALKING_SPEED_FACTOR);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__LARGE_BAG_WALKING_SPEED_FACTOR);
		createEAttribute(luggagePropertiesEClass, LUGGAGE_PROPERTIES__LUGGAGE_STORAGE_SCALING);

		passengerPropertiesEClass = createEClass(PASSENGER_PROPERTIES);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION);
		createEAttribute(passengerPropertiesEClass,
				PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN);
		createEAttribute(passengerPropertiesEClass,
				PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION);
		createEAttribute(passengerPropertiesEClass,
				PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__DOOR_SELECTION);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__GROUP_PERCENTAGE);
		createEReference(passengerPropertiesEClass, PASSENGER_PROPERTIES__AGE_SPEED_DEPENDENCY);
		createEReference(passengerPropertiesEClass, PASSENGER_PROPERTIES__AGE_DISTRIBUTION);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE);
		createEAttribute(passengerPropertiesEClass, PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EnumsPackage theEnumsPackage = (EnumsPackage) EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(settingsEClass, Settings.class, "Settings", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSettings_LuggageProperties(), this.getLuggageProperties(), null, "luggageProperties", null, 1,
				1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSettings_PassengerProperties(), this.getPassengerProperties(), null, "passengerProperties",
				null, 1, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_SimulationType(), theEnumsPackage.getSimulationType(), "simulationType", null, 0, 1,
				Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_UseCenterLuggageStorage(), ecorePackage.getEBoolean(), "useCenterLuggageStorage",
				null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_SeatType(), theEnumsPackage.getSeatType(), "seatType", null, 1, 1, Settings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_SimulationGridResolution(), ecorePackage.getEDouble(), "simulationGridResolution",
				"0.1", 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_SimulationSpeedFactor(), ecorePackage.getEInt(), "simulationSpeedFactor", "5", 0, 1,
				Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_ThreadSleepTimeDefault(), ecorePackage.getEInt(), "threadSleepTimeDefault", "10", 0,
				1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_SidewaysFoldabeSeatPopupTimeMean(), ecorePackage.getEDouble(),
				"sidewaysFoldabeSeatPopupTimeMean", "5", 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_SidewaysFoldabeSeatPopupTimeDeviation(), ecorePackage.getEDouble(),
				"sidewaysFoldabeSeatPopupTimeDeviation", "1", 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_LiftingSeatPanPopupTimeMean(), ecorePackage.getEDouble(),
				"liftingSeatPanPopupTimeMean", "2", 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_LiftingSeatPanPopupTimeDeviation(), ecorePackage.getEDouble(),
				"liftingSeatPanPopupTimeDeviation", "0.5", 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_BoardingConformanceRate(), ecorePackage.getEDouble(), "boardingConformanceRate", "1",
				0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettings_NumberOfBoardingBlocks(), ecorePackage.getEInt(), "numberOfBoardingBlocks", "4", 0,
				1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(luggagePropertiesEClass, LuggageProperties.class, "LuggageProperties", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLuggageProperties_MaxNumberOfLuggageItemsPerPax(), ecorePackage.getEInt(),
				"maxNumberOfLuggageItemsPerPax", "1", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_LuggageStowDistanceFromSeatMean(), ecorePackage.getEDouble(),
				"luggageStowDistanceFromSeatMean", "0.8", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_LuggageStowDistanceFromSeatDeviation(), ecorePackage.getEDouble(),
				"luggageStowDistanceFromSeatDeviation", "0.1", 0, 1, LuggageProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_JacketStowTimeDeviation(), ecorePackage.getEDouble(),
				"jacketStowTimeDeviation", "2", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_JacketStowTimeMean(), ecorePackage.getEDouble(), "jacketStowTimeMean", "7",
				0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_SmallBagStowTimeMean(), ecorePackage.getEDouble(), "smallBagStowTimeMean",
				"10", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_SmallBagStowTimeDeviation(), ecorePackage.getEDouble(),
				"smallBagStowTimeDeviation", "5", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_MediumBagStowTimeMean(), ecorePackage.getEDouble(), "mediumBagStowTimeMean",
				"15", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_MediumBagStowTimeDeviation(), ecorePackage.getEDouble(),
				"mediumBagStowTimeDeviation", "7", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_LargeBagStowTimeMean(), ecorePackage.getEDouble(), "largeBagStowTimeMean",
				"20", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_LargeBagStowTimeDeviation(), ecorePackage.getEDouble(),
				"largeBagStowTimeDeviation", "5", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_JacketVolume(), ecorePackage.getEDouble(), "jacketVolume", "0.05", 0, 1,
				LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_SmallBagVolume(), ecorePackage.getEDouble(), "smallBagVolume", "0.01", 0, 1,
				LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_MediumBagVolume(), ecorePackage.getEDouble(), "mediumBagVolume", "0.02", 0,
				1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_LargeBagVolume(), ecorePackage.getEDouble(), "largeBagVolume", "0.04", 0, 1,
				LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_JacketBulkiness(), ecorePackage.getEDouble(), "jacketBulkiness", "1.0", 0,
				1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_SmallBagBulkiness(), ecorePackage.getEDouble(), "smallBagBulkiness", "1.15",
				0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_MediumBagBulkiness(), ecorePackage.getEDouble(), "mediumBagBulkiness",
				"1.3", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_LargeBagBulkiness(), ecorePackage.getEDouble(), "largeBagBulkiness", "1.6",
				0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_JacketWalkingSpeedFactor(), ecorePackage.getEDouble(),
				"jacketWalkingSpeedFactor", "1", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_SmallBagWalkingSpeedFactor(), ecorePackage.getEDouble(),
				"smallBagWalkingSpeedFactor", "0.95", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_MediumBagWalkingSpeedFactor(), ecorePackage.getEDouble(),
				"mediumBagWalkingSpeedFactor", "0.9", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_LargeBagWalkingSpeedFactor(), ecorePackage.getEDouble(),
				"largeBagWalkingSpeedFactor", "0.75", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggageProperties_LuggageStorageScaling(), ecorePackage.getEDouble(), "luggageStorageScaling",
				"1.0", 0, 1, LuggageProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerPropertiesEClass, PassengerProperties.class, "PassengerProperties", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerProperties_PassengerWidthMeanMale(), ecorePackage.getEDouble(),
				"passengerWidthMeanMale", "0.47", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerWidthDeviationMale(), ecorePackage.getEDouble(),
				"passengerWidthDeviationMale", "0.028", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerWeightMeanMale(), ecorePackage.getEDouble(),
				"passengerWeightMeanMale", "0.9", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerWeightDeviationMale(), ecorePackage.getEDouble(),
				"passengerWeightDeviationMale", "0.2", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHeightMeanMale(), ecorePackage.getEDouble(),
				"passengerHeightMeanMale", "1.775", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHeightDeviationMale(), ecorePackage.getEDouble(),
				"passengerHeightDeviationMale", "0.111", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerDepthMeanMale(), ecorePackage.getEDouble(),
				"passengerDepthMeanMale", "0.3", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerDepthDeviationMale(), ecorePackage.getEDouble(),
				"passengerDepthDeviationMale", "0.05", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerWidthMeanFemale(), ecorePackage.getEDouble(),
				"passengerWidthMeanFemale", "0.414", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerWidthDeviationFemale(), ecorePackage.getEDouble(),
				"passengerWidthDeviationFemale", "0.01", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerWeightMeanFemale(), ecorePackage.getEDouble(),
				"passengerWeightMeanFemale", "0.6", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerWeightDeviationFemale(), ecorePackage.getEDouble(),
				"passengerWeightDeviationFemale", "0.15", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHeightMeanFemale(), ecorePackage.getEDouble(),
				"passengerHeightMeanFemale", "1.645", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHeightDeviationFemale(), ecorePackage.getEDouble(),
				"passengerHeightDeviationFemale", "0.115", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerDepthMeanFemale(), ecorePackage.getEDouble(),
				"passengerDepthMeanFemale", "0.27", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerDepthDeviationFemale(), ecorePackage.getEDouble(),
				"passengerDepthDeviationFemale", "0.03", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerAggressiveMoodShare(), ecorePackage.getEInt(),
				"passengerAggressiveMoodShare", "0", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_SeatInterferenceProcessTimeMean(), ecorePackage.getEDouble(),
				"seatInterferenceProcessTimeMean", "8", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_SeatInterferenceProcessTimeDeviation(), ecorePackage.getEDouble(),
				"seatInterferenceProcessTimeDeviation", "3", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatMean(), ecorePackage.getEDouble(),
				"seatInterferenceProcessTimeFoldingSeatMean", "5", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatDeviation(),
				ecorePackage.getEDouble(), "seatInterferenceProcessTimeFoldingSeatDeviation", "1", 0, 1,
				PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassivePassengerWaitingTimeAfterCollision(), ecorePackage.getEDouble(),
				"passivePassengerWaitingTimeAfterCollision", "0.3", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_SeatInterferenceMultiPassengerFactor(), ecorePackage.getEDouble(),
				"seatInterferenceMultiPassengerFactor", "0.7", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_DoorSelection(), theEnumsPackage.getDoorSelection(), "doorSelection",
				null, 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_GroupPercentage(), ecorePackage.getEDouble(), "groupPercentage", "0", 0,
				1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerProperties_AgeSpeedDependency(), theModelPackage.getEPoint(), null,
				"ageSpeedDependency", null, 0, -1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerProperties_AgeDistribution(), theModelPackage.getEPoint(), null, "ageDistribution",
				null, 0, -1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeWidthMeanMale(), ecorePackage.getEDouble(),
				"passengerKneeWidthMeanMale", "0.3418", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeWidthDeviationMale(), ecorePackage.getEDouble(),
				"passengerKneeWidthDeviationMale", "0.0203", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeWidthMeanFemale(), ecorePackage.getEDouble(),
				"passengerKneeWidthMeanFemale", "0.3427", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeWidthDeviationFemale(), ecorePackage.getEDouble(),
				"passengerKneeWidthDeviationFemale", "0.0224", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeDepthMeanMale(), ecorePackage.getEDouble(),
				"passengerKneeDepthMeanMale", "0.2486", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeDepthDeviationMale(), ecorePackage.getEDouble(),
				"passengerKneeDepthDeviationMale", "0.0207", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeDepthMeanFemale(), ecorePackage.getEDouble(),
				"passengerKneeDepthMeanFemale", "0.2271", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeDepthDeviationFemale(), ecorePackage.getEDouble(),
				"passengerKneeDepthDeviationFemale", "0.021", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeHeightMeanMale(), ecorePackage.getEDouble(),
				"passengerKneeHeightMeanMale", "0.5048", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeHeightDeviationMale(), ecorePackage.getEDouble(),
				"passengerKneeHeightDeviationMale", "0.0276", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeHeightMeanFemale(), ecorePackage.getEDouble(),
				"passengerKneeHeightMeanFemale", "0.4587", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerKneeHeightDeviationFemale(), ecorePackage.getEDouble(),
				"passengerKneeHeightDeviationFemale", "0.0261", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipWidthMeanMale(), ecorePackage.getEDouble(),
				"passengerHipWidthMeanMale", "0.3418", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipWidthDeviationMale(), ecorePackage.getEDouble(),
				"passengerHipWidthDeviationMale", "0.0203", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipWidthMeanFemale(), ecorePackage.getEDouble(),
				"passengerHipWidthMeanFemale", "0.3427", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipWidthDeviationFemale(), ecorePackage.getEDouble(),
				"passengerHipWidthDeviationFemale", "0.0224", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipDepthMeanMale(), ecorePackage.getEDouble(),
				"passengerHipDepthMeanMale", "0.2486", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipDepthDeviationMale(), ecorePackage.getEDouble(),
				"passengerHipDepthDeviationMale", "0.0207", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipDepthMeanFemale(), ecorePackage.getEDouble(),
				"passengerHipDepthMeanFemale", "0.2271", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipDepthDeviationFemale(), ecorePackage.getEDouble(),
				"passengerHipDepthDeviationFemale", "0.021", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipHeightMeanMale(), ecorePackage.getEDouble(),
				"passengerHipHeightMeanMale", "0.8874", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipHeightDeviationMale(), ecorePackage.getEDouble(),
				"passengerHipHeightDeviationMale", "0.0471", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipHeightMeanFemale(), ecorePackage.getEDouble(),
				"passengerHipHeightMeanFemale", "0.8383", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerHipHeightDeviationFemale(), ecorePackage.getEDouble(),
				"passengerHipHeightDeviationFemale", "0.0452", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderWidthMeanMale(), ecorePackage.getEDouble(),
				"passengerShoulderWidthMeanMale", "0.49", 0, 1, PassengerProperties.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderWidthDeviationMale(), ecorePackage.getEDouble(),
				"passengerShoulderWidthDeviationMale", "0.026", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderWidthMeanFemale(), ecorePackage.getEDouble(),
				"passengerShoulderWidthMeanFemale", "0.43", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderWidthDeviationFemale(), ecorePackage.getEDouble(),
				"passengerShoulderWidthDeviationFemale", "0.023", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderDepthMeanMale(), ecorePackage.getEDouble(),
				"passengerShoulderDepthMeanMale", "0.2432", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderDepthDeviationMale(), ecorePackage.getEDouble(),
				"passengerShoulderDepthDeviationMale", "0.0215", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderDepthMeanFemale(), ecorePackage.getEDouble(),
				"passengerShoulderDepthMeanFemale", "0.2394", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderDepthDeviationFemale(), ecorePackage.getEDouble(),
				"passengerShoulderDepthDeviationFemale", "0.0211", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderHeightMeanMale(), ecorePackage.getEDouble(),
				"passengerShoulderHeightMeanMale", "1.4425", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderHeightDeviationMale(), ecorePackage.getEDouble(),
				"passengerShoulderHeightDeviationMale", "0.062", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderHeightMeanFemale(), ecorePackage.getEDouble(),
				"passengerShoulderHeightMeanFemale", "1.3336", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerProperties_PassengerShoulderHeightDeviationFemale(), ecorePackage.getEDouble(),
				"passengerShoulderHeightDeviationFemale", "0.0579", 0, 1, PassengerProperties.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SettingsPackageImpl
