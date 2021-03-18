/**
 */
package toolspecific.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import toolspecific.BooleanBaseType;
import toolspecific.ComplexBaseType;
import toolspecific.DateBaseType;
import toolspecific.DateTimeBaseType;
import toolspecific.DocumentRoot;
import toolspecific.DoorSelectionType;
import toolspecific.DoubleBaseType;
import toolspecific.DoubleConstraintBaseType;
import toolspecific.IntegerBaseType;
import toolspecific.PassengerSortingSchemeType;
import toolspecific.PaxelerateInputType;
import toolspecific.PaxelerateType;
import toolspecific.RelationalOperatorType;
import toolspecific.SeatTypeType;
import toolspecific.SimulationTypeType;
import toolspecific.StringArrayBaseType;
import toolspecific.StringBaseType;
import toolspecific.StringUIDBaseType;
import toolspecific.StringVectorBaseType;
import toolspecific.StudiesType;
import toolspecific.StudyType;
import toolspecific.SymmetryType;
import toolspecific.TimeBaseType;
import toolspecific.ToolspecificFactory;
import toolspecific.ToolspecificPackage;
import toolspecific.UncertaintyFunctionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolspecificPackageImpl extends EPackageImpl implements ToolspecificPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorSelectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleConstraintBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerSortingSchemeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paxelerateInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paxelerateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seatTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringArrayBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringUIDBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVectorBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum symmetryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uncertaintyFunctionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationalOperatorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType symmetryTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uncertaintyFunctionTypeObjectEDataType = null;

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
	 * @see toolspecific.ToolspecificPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToolspecificPackageImpl() {
		super(eNS_URI, ToolspecificFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToolspecificPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToolspecificPackage init() {
		if (isInited)
			return (ToolspecificPackage) EPackage.Registry.INSTANCE.getEPackage(ToolspecificPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredToolspecificPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ToolspecificPackageImpl theToolspecificPackage = registeredToolspecificPackage instanceof ToolspecificPackageImpl
				? (ToolspecificPackageImpl) registeredToolspecificPackage
				: new ToolspecificPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToolspecificPackage.createPackageContents();

		// Initialize created meta-data
		theToolspecificPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToolspecificPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToolspecificPackage.eNS_URI, theToolspecificPackage);
		return theToolspecificPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBaseType() {
		return booleanBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanBaseType_Value() {
		return (EAttribute) booleanBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanBaseType_ExternalDataDirectory() {
		return (EAttribute) booleanBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanBaseType_ExternalDataNodePath() {
		return (EAttribute) booleanBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanBaseType_ExternalFileName() {
		return (EAttribute) booleanBaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexBaseType() {
		return complexBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexBaseType_ExternalDataDirectory() {
		return (EAttribute) complexBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexBaseType_ExternalDataNodePath() {
		return (EAttribute) complexBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexBaseType_ExternalFileName() {
		return (EAttribute) complexBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateBaseType() {
		return dateBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateBaseType_Value() {
		return (EAttribute) dateBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateBaseType_ExternalDataDirectory() {
		return (EAttribute) dateBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateBaseType_ExternalDataNodePath() {
		return (EAttribute) dateBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateBaseType_ExternalFileName() {
		return (EAttribute) dateBaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeBaseType() {
		return dateTimeBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeBaseType_Value() {
		return (EAttribute) dateTimeBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeBaseType_ExternalDataDirectory() {
		return (EAttribute) dateTimeBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeBaseType_ExternalDataNodePath() {
		return (EAttribute) dateTimeBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeBaseType_ExternalFileName() {
		return (EAttribute) dateTimeBaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PaxelerateType() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoorSelectionType() {
		return doorSelectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleBaseType() {
		return doubleBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_Value() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_A() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_B() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_C() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_Delta() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_ExternalDataDirectory() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_ExternalDataNodePath() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_ExternalFileName() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_Mu() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_UncertaintyFunctionName() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_V() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleBaseType_W() {
		return (EAttribute) doubleBaseTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleConstraintBaseType() {
		return doubleConstraintBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleConstraintBaseType_RelationalOperator() {
		return (EAttribute) doubleConstraintBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerBaseType() {
		return integerBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerBaseType_Value() {
		return (EAttribute) integerBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerBaseType_ExternalDataDirectory() {
		return (EAttribute) integerBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerBaseType_ExternalDataNodePath() {
		return (EAttribute) integerBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerBaseType_ExternalFileName() {
		return (EAttribute) integerBaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerSortingSchemeType() {
		return passengerSortingSchemeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaxelerateInputType() {
		return paxelerateInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaxelerateInputType_Studies() {
		return (EReference) paxelerateInputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaxelerateType() {
		return paxelerateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaxelerateType_Input() {
		return (EReference) paxelerateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeatTypeType() {
		return seatTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationTypeType() {
		return simulationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringArrayBaseType() {
		return stringArrayBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringArrayBaseType_MapType() {
		return (EAttribute) stringArrayBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringBaseType() {
		return stringBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringBaseType_Value() {
		return (EAttribute) stringBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringBaseType_ExternalDataDirectory() {
		return (EAttribute) stringBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringBaseType_ExternalDataNodePath() {
		return (EAttribute) stringBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringBaseType_ExternalFileName() {
		return (EAttribute) stringBaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringUIDBaseType() {
		return stringUIDBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringUIDBaseType_Value() {
		return (EAttribute) stringUIDBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringUIDBaseType_IsLink() {
		return (EAttribute) stringUIDBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringUIDBaseType_Symmetry() {
		return (EAttribute) stringUIDBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringVectorBaseType() {
		return stringVectorBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVectorBaseType_A() {
		return (EAttribute) stringVectorBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVectorBaseType_B() {
		return (EAttribute) stringVectorBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVectorBaseType_C() {
		return (EAttribute) stringVectorBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVectorBaseType_Delta() {
		return (EAttribute) stringVectorBaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVectorBaseType_MapType() {
		return (EAttribute) stringVectorBaseTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVectorBaseType_Mu() {
		return (EAttribute) stringVectorBaseTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVectorBaseType_UncertaintyFunctionName() {
		return (EAttribute) stringVectorBaseTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVectorBaseType_V() {
		return (EAttribute) stringVectorBaseTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVectorBaseType_W() {
		return (EAttribute) stringVectorBaseTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudiesType() {
		return studiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudiesType_Study() {
		return (EReference) studiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyType() {
		return studyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_LoadFactor() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_ActiveDoorUIDs() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_Iterations() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_SimulationType() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_DisplaySimulation() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_SeatType() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_SimulationGridResolution() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_SimulationSpeedFactor() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_PassengerSortingScheme() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_DoorSelection() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_PercentageOfPassengersWithJackets() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_PercentageOfPassengersWithSmallBags() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_PercentageOfPassengersWithMediumBags() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyType_PercentageOfPassengersWithLargeBags() {
		return (EReference) studyTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_UID() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBaseType() {
		return timeBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBaseType_Value() {
		return (EAttribute) timeBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBaseType_ExternalDataDirectory() {
		return (EAttribute) timeBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBaseType_ExternalDataNodePath() {
		return (EAttribute) timeBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBaseType_ExternalFileName() {
		return (EAttribute) timeBaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalOperatorType() {
		return relationalOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSymmetryType() {
		return symmetryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUncertaintyFunctionType() {
		return uncertaintyFunctionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationalOperatorTypeObject() {
		return relationalOperatorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSymmetryTypeObject() {
		return symmetryTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUncertaintyFunctionTypeObject() {
		return uncertaintyFunctionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolspecificFactory getToolspecificFactory() {
		return (ToolspecificFactory) getEFactoryInstance();
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
		booleanBaseTypeEClass = createEClass(BOOLEAN_BASE_TYPE);
		createEAttribute(booleanBaseTypeEClass, BOOLEAN_BASE_TYPE__VALUE);
		createEAttribute(booleanBaseTypeEClass, BOOLEAN_BASE_TYPE__EXTERNAL_DATA_DIRECTORY);
		createEAttribute(booleanBaseTypeEClass, BOOLEAN_BASE_TYPE__EXTERNAL_DATA_NODE_PATH);
		createEAttribute(booleanBaseTypeEClass, BOOLEAN_BASE_TYPE__EXTERNAL_FILE_NAME);

		complexBaseTypeEClass = createEClass(COMPLEX_BASE_TYPE);
		createEAttribute(complexBaseTypeEClass, COMPLEX_BASE_TYPE__EXTERNAL_DATA_DIRECTORY);
		createEAttribute(complexBaseTypeEClass, COMPLEX_BASE_TYPE__EXTERNAL_DATA_NODE_PATH);
		createEAttribute(complexBaseTypeEClass, COMPLEX_BASE_TYPE__EXTERNAL_FILE_NAME);

		dateBaseTypeEClass = createEClass(DATE_BASE_TYPE);
		createEAttribute(dateBaseTypeEClass, DATE_BASE_TYPE__VALUE);
		createEAttribute(dateBaseTypeEClass, DATE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY);
		createEAttribute(dateBaseTypeEClass, DATE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH);
		createEAttribute(dateBaseTypeEClass, DATE_BASE_TYPE__EXTERNAL_FILE_NAME);

		dateTimeBaseTypeEClass = createEClass(DATE_TIME_BASE_TYPE);
		createEAttribute(dateTimeBaseTypeEClass, DATE_TIME_BASE_TYPE__VALUE);
		createEAttribute(dateTimeBaseTypeEClass, DATE_TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY);
		createEAttribute(dateTimeBaseTypeEClass, DATE_TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH);
		createEAttribute(dateTimeBaseTypeEClass, DATE_TIME_BASE_TYPE__EXTERNAL_FILE_NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PAXELERATE_TYPE);

		doorSelectionTypeEClass = createEClass(DOOR_SELECTION_TYPE);

		doubleBaseTypeEClass = createEClass(DOUBLE_BASE_TYPE);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__VALUE);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__A);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__B);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__C);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__DELTA);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__EXTERNAL_FILE_NAME);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__MU);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__V);
		createEAttribute(doubleBaseTypeEClass, DOUBLE_BASE_TYPE__W);

		doubleConstraintBaseTypeEClass = createEClass(DOUBLE_CONSTRAINT_BASE_TYPE);
		createEAttribute(doubleConstraintBaseTypeEClass, DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR);

		integerBaseTypeEClass = createEClass(INTEGER_BASE_TYPE);
		createEAttribute(integerBaseTypeEClass, INTEGER_BASE_TYPE__VALUE);
		createEAttribute(integerBaseTypeEClass, INTEGER_BASE_TYPE__EXTERNAL_DATA_DIRECTORY);
		createEAttribute(integerBaseTypeEClass, INTEGER_BASE_TYPE__EXTERNAL_DATA_NODE_PATH);
		createEAttribute(integerBaseTypeEClass, INTEGER_BASE_TYPE__EXTERNAL_FILE_NAME);

		passengerSortingSchemeTypeEClass = createEClass(PASSENGER_SORTING_SCHEME_TYPE);

		paxelerateInputTypeEClass = createEClass(PAXELERATE_INPUT_TYPE);
		createEReference(paxelerateInputTypeEClass, PAXELERATE_INPUT_TYPE__STUDIES);

		paxelerateTypeEClass = createEClass(PAXELERATE_TYPE);
		createEReference(paxelerateTypeEClass, PAXELERATE_TYPE__INPUT);

		seatTypeTypeEClass = createEClass(SEAT_TYPE_TYPE);

		simulationTypeTypeEClass = createEClass(SIMULATION_TYPE_TYPE);

		stringArrayBaseTypeEClass = createEClass(STRING_ARRAY_BASE_TYPE);
		createEAttribute(stringArrayBaseTypeEClass, STRING_ARRAY_BASE_TYPE__MAP_TYPE);

		stringBaseTypeEClass = createEClass(STRING_BASE_TYPE);
		createEAttribute(stringBaseTypeEClass, STRING_BASE_TYPE__VALUE);
		createEAttribute(stringBaseTypeEClass, STRING_BASE_TYPE__EXTERNAL_DATA_DIRECTORY);
		createEAttribute(stringBaseTypeEClass, STRING_BASE_TYPE__EXTERNAL_DATA_NODE_PATH);
		createEAttribute(stringBaseTypeEClass, STRING_BASE_TYPE__EXTERNAL_FILE_NAME);

		stringUIDBaseTypeEClass = createEClass(STRING_UID_BASE_TYPE);
		createEAttribute(stringUIDBaseTypeEClass, STRING_UID_BASE_TYPE__VALUE);
		createEAttribute(stringUIDBaseTypeEClass, STRING_UID_BASE_TYPE__IS_LINK);
		createEAttribute(stringUIDBaseTypeEClass, STRING_UID_BASE_TYPE__SYMMETRY);

		stringVectorBaseTypeEClass = createEClass(STRING_VECTOR_BASE_TYPE);
		createEAttribute(stringVectorBaseTypeEClass, STRING_VECTOR_BASE_TYPE__A);
		createEAttribute(stringVectorBaseTypeEClass, STRING_VECTOR_BASE_TYPE__B);
		createEAttribute(stringVectorBaseTypeEClass, STRING_VECTOR_BASE_TYPE__C);
		createEAttribute(stringVectorBaseTypeEClass, STRING_VECTOR_BASE_TYPE__DELTA);
		createEAttribute(stringVectorBaseTypeEClass, STRING_VECTOR_BASE_TYPE__MAP_TYPE);
		createEAttribute(stringVectorBaseTypeEClass, STRING_VECTOR_BASE_TYPE__MU);
		createEAttribute(stringVectorBaseTypeEClass, STRING_VECTOR_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME);
		createEAttribute(stringVectorBaseTypeEClass, STRING_VECTOR_BASE_TYPE__V);
		createEAttribute(stringVectorBaseTypeEClass, STRING_VECTOR_BASE_TYPE__W);

		studiesTypeEClass = createEClass(STUDIES_TYPE);
		createEReference(studiesTypeEClass, STUDIES_TYPE__STUDY);

		studyTypeEClass = createEClass(STUDY_TYPE);
		createEReference(studyTypeEClass, STUDY_TYPE__LOAD_FACTOR);
		createEReference(studyTypeEClass, STUDY_TYPE__ACTIVE_DOOR_UI_DS);
		createEReference(studyTypeEClass, STUDY_TYPE__ITERATIONS);
		createEReference(studyTypeEClass, STUDY_TYPE__SIMULATION_TYPE);
		createEReference(studyTypeEClass, STUDY_TYPE__DISPLAY_SIMULATION);
		createEReference(studyTypeEClass, STUDY_TYPE__SEAT_TYPE);
		createEReference(studyTypeEClass, STUDY_TYPE__SIMULATION_GRID_RESOLUTION);
		createEReference(studyTypeEClass, STUDY_TYPE__SIMULATION_SPEED_FACTOR);
		createEReference(studyTypeEClass, STUDY_TYPE__PASSENGER_SORTING_SCHEME);
		createEReference(studyTypeEClass, STUDY_TYPE__DOOR_SELECTION);
		createEReference(studyTypeEClass, STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS);
		createEReference(studyTypeEClass, STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS);
		createEReference(studyTypeEClass, STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS);
		createEReference(studyTypeEClass, STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS);
		createEAttribute(studyTypeEClass, STUDY_TYPE__UID);

		timeBaseTypeEClass = createEClass(TIME_BASE_TYPE);
		createEAttribute(timeBaseTypeEClass, TIME_BASE_TYPE__VALUE);
		createEAttribute(timeBaseTypeEClass, TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY);
		createEAttribute(timeBaseTypeEClass, TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH);
		createEAttribute(timeBaseTypeEClass, TIME_BASE_TYPE__EXTERNAL_FILE_NAME);

		// Create enums
		relationalOperatorTypeEEnum = createEEnum(RELATIONAL_OPERATOR_TYPE);
		symmetryTypeEEnum = createEEnum(SYMMETRY_TYPE);
		uncertaintyFunctionTypeEEnum = createEEnum(UNCERTAINTY_FUNCTION_TYPE);

		// Create data types
		relationalOperatorTypeObjectEDataType = createEDataType(RELATIONAL_OPERATOR_TYPE_OBJECT);
		symmetryTypeObjectEDataType = createEDataType(SYMMETRY_TYPE_OBJECT);
		uncertaintyFunctionTypeObjectEDataType = createEDataType(UNCERTAINTY_FUNCTION_TYPE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		doorSelectionTypeEClass.getESuperTypes().add(this.getStringBaseType());
		doubleConstraintBaseTypeEClass.getESuperTypes().add(this.getDoubleBaseType());
		passengerSortingSchemeTypeEClass.getESuperTypes().add(this.getStringBaseType());
		paxelerateInputTypeEClass.getESuperTypes().add(this.getComplexBaseType());
		paxelerateTypeEClass.getESuperTypes().add(this.getComplexBaseType());
		seatTypeTypeEClass.getESuperTypes().add(this.getStringBaseType());
		simulationTypeTypeEClass.getESuperTypes().add(this.getStringBaseType());
		stringArrayBaseTypeEClass.getESuperTypes().add(this.getStringBaseType());
		stringVectorBaseTypeEClass.getESuperTypes().add(this.getStringBaseType());
		studiesTypeEClass.getESuperTypes().add(this.getComplexBaseType());
		studyTypeEClass.getESuperTypes().add(this.getComplexBaseType());

		// Initialize classes, features, and operations; add parameters
		initEClass(booleanBaseTypeEClass, BooleanBaseType.class, "BooleanBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanBaseType_Value(), theXMLTypePackage.getBoolean(), "value", null, 0, 1,
				BooleanBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanBaseType_ExternalDataDirectory(), theXMLTypePackage.getString(),
				"externalDataDirectory", null, 0, 1, BooleanBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanBaseType_ExternalDataNodePath(), theXMLTypePackage.getString(), "externalDataNodePath",
				null, 0, 1, BooleanBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanBaseType_ExternalFileName(), theXMLTypePackage.getString(), "externalFileName", null,
				0, 1, BooleanBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexBaseTypeEClass, ComplexBaseType.class, "ComplexBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexBaseType_ExternalDataDirectory(), theXMLTypePackage.getString(),
				"externalDataDirectory", null, 0, 1, ComplexBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexBaseType_ExternalDataNodePath(), theXMLTypePackage.getString(), "externalDataNodePath",
				null, 0, 1, ComplexBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexBaseType_ExternalFileName(), theXMLTypePackage.getString(), "externalFileName", null,
				0, 1, ComplexBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateBaseTypeEClass, DateBaseType.class, "DateBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateBaseType_Value(), theXMLTypePackage.getDate(), "value", null, 0, 1, DateBaseType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateBaseType_ExternalDataDirectory(), theXMLTypePackage.getString(), "externalDataDirectory",
				null, 0, 1, DateBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateBaseType_ExternalDataNodePath(), theXMLTypePackage.getString(), "externalDataNodePath",
				null, 0, 1, DateBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateBaseType_ExternalFileName(), theXMLTypePackage.getString(), "externalFileName", null, 0,
				1, DateBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeBaseTypeEClass, DateTimeBaseType.class, "DateTimeBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeBaseType_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1,
				DateTimeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeBaseType_ExternalDataDirectory(), theXMLTypePackage.getString(),
				"externalDataDirectory", null, 0, 1, DateTimeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeBaseType_ExternalDataNodePath(), theXMLTypePackage.getString(),
				"externalDataNodePath", null, 0, 1, DateTimeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeBaseType_ExternalFileName(), theXMLTypePackage.getString(), "externalFileName", null,
				0, 1, DateTimeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null,
				"xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null,
				"xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PaxelerateType(), this.getPaxelerateType(), null, "paxelerateType", null, 0, -2,
				null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(doorSelectionTypeEClass, DoorSelectionType.class, "DoorSelectionType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(doubleBaseTypeEClass, DoubleBaseType.class, "DoubleBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleBaseType_Value(), theXMLTypePackage.getDouble(), "value", null, 0, 1,
				DoubleBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_A(), theXMLTypePackage.getDouble(), "a", null, 0, 1, DoubleBaseType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_B(), theXMLTypePackage.getDouble(), "b", null, 0, 1, DoubleBaseType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_C(), theXMLTypePackage.getDouble(), "c", null, 0, 1, DoubleBaseType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_Delta(), theXMLTypePackage.getDouble(), "delta", null, 0, 1,
				DoubleBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_ExternalDataDirectory(), theXMLTypePackage.getString(),
				"externalDataDirectory", null, 0, 1, DoubleBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_ExternalDataNodePath(), theXMLTypePackage.getString(), "externalDataNodePath",
				null, 0, 1, DoubleBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_ExternalFileName(), theXMLTypePackage.getString(), "externalFileName", null, 0,
				1, DoubleBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_Mu(), theXMLTypePackage.getDouble(), "mu", null, 0, 1, DoubleBaseType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_UncertaintyFunctionName(), this.getUncertaintyFunctionType(),
				"uncertaintyFunctionName", null, 0, 1, DoubleBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_V(), theXMLTypePackage.getDouble(), "v", null, 0, 1, DoubleBaseType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleBaseType_W(), theXMLTypePackage.getDouble(), "w", null, 0, 1, DoubleBaseType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleConstraintBaseTypeEClass, DoubleConstraintBaseType.class, "DoubleConstraintBaseType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleConstraintBaseType_RelationalOperator(), this.getRelationalOperatorType(),
				"relationalOperator", null, 1, 1, DoubleConstraintBaseType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerBaseTypeEClass, IntegerBaseType.class, "IntegerBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerBaseType_Value(), theXMLTypePackage.getInteger(), "value", null, 0, 1,
				IntegerBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerBaseType_ExternalDataDirectory(), theXMLTypePackage.getString(),
				"externalDataDirectory", null, 0, 1, IntegerBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerBaseType_ExternalDataNodePath(), theXMLTypePackage.getString(), "externalDataNodePath",
				null, 0, 1, IntegerBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerBaseType_ExternalFileName(), theXMLTypePackage.getString(), "externalFileName", null,
				0, 1, IntegerBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerSortingSchemeTypeEClass, PassengerSortingSchemeType.class, "PassengerSortingSchemeType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paxelerateInputTypeEClass, PaxelerateInputType.class, "PaxelerateInputType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaxelerateInputType_Studies(), this.getStudiesType(), null, "studies", null, 1, 1,
				PaxelerateInputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paxelerateTypeEClass, PaxelerateType.class, "PaxelerateType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaxelerateType_Input(), this.getPaxelerateInputType(), null, "input", null, 1, 1,
				PaxelerateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seatTypeTypeEClass, SeatTypeType.class, "SeatTypeType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulationTypeTypeEClass, SimulationTypeType.class, "SimulationTypeType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringArrayBaseTypeEClass, StringArrayBaseType.class, "StringArrayBaseType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringArrayBaseType_MapType(), theXMLTypePackage.getString(), "mapType", "array", 1, 1,
				StringArrayBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stringBaseTypeEClass, StringBaseType.class, "StringBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringBaseType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1,
				StringBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringBaseType_ExternalDataDirectory(), theXMLTypePackage.getString(),
				"externalDataDirectory", null, 0, 1, StringBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringBaseType_ExternalDataNodePath(), theXMLTypePackage.getString(), "externalDataNodePath",
				null, 0, 1, StringBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringBaseType_ExternalFileName(), theXMLTypePackage.getString(), "externalFileName", null, 0,
				1, StringBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stringUIDBaseTypeEClass, StringUIDBaseType.class, "StringUIDBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringUIDBaseType_Value(), theXMLTypePackage.getIDREF(), "value", null, 0, 1,
				StringUIDBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringUIDBaseType_IsLink(), theXMLTypePackage.getString(), "isLink", "True", 0, 1,
				StringUIDBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringUIDBaseType_Symmetry(), this.getSymmetryType(), "symmetry", null, 0, 1,
				StringUIDBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stringVectorBaseTypeEClass, StringVectorBaseType.class, "StringVectorBaseType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringVectorBaseType_A(), theXMLTypePackage.getString(), "a", null, 0, 1,
				StringVectorBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVectorBaseType_B(), theXMLTypePackage.getString(), "b", null, 0, 1,
				StringVectorBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVectorBaseType_C(), theXMLTypePackage.getString(), "c", null, 0, 1,
				StringVectorBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVectorBaseType_Delta(), theXMLTypePackage.getString(), "delta", null, 0, 1,
				StringVectorBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVectorBaseType_MapType(), theXMLTypePackage.getString(), "mapType", "vector", 1, 1,
				StringVectorBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVectorBaseType_Mu(), theXMLTypePackage.getString(), "mu", null, 0, 1,
				StringVectorBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVectorBaseType_UncertaintyFunctionName(), this.getUncertaintyFunctionType(),
				"uncertaintyFunctionName", null, 0, 1, StringVectorBaseType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVectorBaseType_V(), theXMLTypePackage.getString(), "v", null, 0, 1,
				StringVectorBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVectorBaseType_W(), theXMLTypePackage.getString(), "w", null, 0, 1,
				StringVectorBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studiesTypeEClass, StudiesType.class, "StudiesType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudiesType_Study(), this.getStudyType(), null, "study", null, 1, -1, StudiesType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyTypeEClass, StudyType.class, "StudyType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudyType_LoadFactor(), this.getDoubleBaseType(), null, "loadFactor", null, 1, 1,
				StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_ActiveDoorUIDs(), this.getStringVectorBaseType(), null, "activeDoorUIDs", null, 1,
				1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_Iterations(), this.getIntegerBaseType(), null, "iterations", null, 1, 1,
				StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_SimulationType(), this.getSimulationTypeType(), null, "simulationType", null, 1, 1,
				StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_DisplaySimulation(), this.getBooleanBaseType(), null, "displaySimulation", null, 1,
				1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_SeatType(), this.getSeatTypeType(), null, "seatType", null, 1, 1, StudyType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_SimulationGridResolution(), this.getDoubleBaseType(), null,
				"simulationGridResolution", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_SimulationSpeedFactor(), this.getDoubleBaseType(), null, "simulationSpeedFactor",
				null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_PassengerSortingScheme(), this.getPassengerSortingSchemeType(), null,
				"passengerSortingScheme", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_DoorSelection(), this.getDoorSelectionType(), null, "doorSelection", null, 1, 1,
				StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_PercentageOfPassengersWithJackets(), this.getDoubleBaseType(), null,
				"percentageOfPassengersWithJackets", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_PercentageOfPassengersWithSmallBags(), this.getDoubleBaseType(), null,
				"percentageOfPassengersWithSmallBags", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_PercentageOfPassengersWithMediumBags(), this.getDoubleBaseType(), null,
				"percentageOfPassengersWithMediumBags", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyType_PercentageOfPassengersWithLargeBags(), this.getDoubleBaseType(), null,
				"percentageOfPassengersWithLargeBags", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_UID(), theXMLTypePackage.getID(), "uID", null, 1, 1, StudyType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeBaseTypeEClass, TimeBaseType.class, "TimeBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeBaseType_Value(), theXMLTypePackage.getTime(), "value", null, 0, 1, TimeBaseType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBaseType_ExternalDataDirectory(), theXMLTypePackage.getString(), "externalDataDirectory",
				null, 0, 1, TimeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBaseType_ExternalDataNodePath(), theXMLTypePackage.getString(), "externalDataNodePath",
				null, 0, 1, TimeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBaseType_ExternalFileName(), theXMLTypePackage.getString(), "externalFileName", null, 0,
				1, TimeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(relationalOperatorTypeEEnum, RelationalOperatorType.class, "RelationalOperatorType");
		addEEnumLiteral(relationalOperatorTypeEEnum, RelationalOperatorType.LT);
		addEEnumLiteral(relationalOperatorTypeEEnum, RelationalOperatorType.LE);
		addEEnumLiteral(relationalOperatorTypeEEnum, RelationalOperatorType.EQ);
		addEEnumLiteral(relationalOperatorTypeEEnum, RelationalOperatorType.NE);
		addEEnumLiteral(relationalOperatorTypeEEnum, RelationalOperatorType.GT);
		addEEnumLiteral(relationalOperatorTypeEEnum, RelationalOperatorType.GE);

		initEEnum(symmetryTypeEEnum, SymmetryType.class, "SymmetryType");
		addEEnumLiteral(symmetryTypeEEnum, SymmetryType.DEF);
		addEEnumLiteral(symmetryTypeEEnum, SymmetryType.SYMM);
		addEEnumLiteral(symmetryTypeEEnum, SymmetryType.FULL);

		initEEnum(uncertaintyFunctionTypeEEnum, UncertaintyFunctionType.class, "UncertaintyFunctionType");
		addEEnumLiteral(uncertaintyFunctionTypeEEnum, UncertaintyFunctionType.GAUSSIAN_NORMAL_DISTRIBUTION);
		addEEnumLiteral(uncertaintyFunctionTypeEEnum, UncertaintyFunctionType.EXPONENTIAL_DISTRIBUTION);

		// Initialize data types
		initEDataType(relationalOperatorTypeObjectEDataType, RelationalOperatorType.class,
				"RelationalOperatorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(symmetryTypeObjectEDataType, SymmetryType.class, "SymmetryTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uncertaintyFunctionTypeObjectEDataType, UncertaintyFunctionType.class,
				"UncertaintyFunctionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation(booleanBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>booleanBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>Base type for boolean nodes (including external data\r\n                            attributes)</ddue:para>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(complexBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>complexBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>Base type for complex nodes (including external data\r\n                            attributes)</ddue:para>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(dateBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>dateBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>Base type for date nodes (including external data attributes).\r\n                            This date type is based on the xsd:date definition.\r\n                            \"To specify a time zone, you can either enter a date in UTC time by adding a \"Z\" behind the date - like this: 2002-09-24Z\r\n                            or you can specify an offset from the UTC time by adding a positive or negative time behind the date - like this:\r\n                            2002-09-24-06:00\r\n                            or\r\n                            2002-09-24+06:00\" (description taken from http://www.w3schools.com/xml/schema_dtypes_date.asp)\r\n                        </ddue:para>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(dateTimeBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>dateTimeBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>Base type for dateTime nodes (including external data\r\n                            attributes)</ddue:para>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(doubleBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>doubleBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:content>\r\n                                    \r\n        <ddue:para>\r\n                                Base type for double nodes (including\r\n                                external data attributes)\r\n                            </ddue:para>\r\n                                    \r\n        <ddue:para>\r\n                                The double base type can include\r\n                                optional uncertainty information. The\r\n                                description of uncertainties is placed\r\n                                in addtional attributes. First, it is\r\n                                described by an attribute that describes\r\n                                the type of uncertainty function called\r\n                                functionName. The functionName attribute\r\n                                includes the tag name of the\r\n                                distribution function which is listened\r\n                                in the table shown below. Each\r\n                                uncertainty function is further\r\n                                describes by a set of parameters that\r\n                                are described in the table below.\r\n                            </ddue:para>\r\n                                    \r\n        <ddue:mediaLink>\r\n                                          \r\n          <ddue:image xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"uncertaintyFunctions\"/>\r\n                                      \r\n        </ddue:mediaLink>\r\n                                \r\n      </ddue:content>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(doubleConstraintBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>doubleConstraintBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:content>\r\n                                    \r\n        <ddue:para>Base type for double nodes including a relational operator attribute indicating valid constraint region</ddue:para>\r\n                                    \r\n        <ddue:para>The doubleConstraintBaseType extends the doubleBaseType and thus inherits all its attributes.</ddue:para>\r\n                                \r\n      </ddue:content>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(integerBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>integerBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>\r\n                            Base type for integer nodes (including\r\n                            external data attributes)\r\n                        </ddue:para>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(stringArrayBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>stringArrayBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>Base type for string array nodes (including maptype\r\n                            array attribute)</ddue:para>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(stringBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>stringBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>Base type for string nodes (including external data\r\n                            attributes)</ddue:para>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(stringUIDBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>stringUIDBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>This is the base type that links to other components. It should always contain a UID.</ddue:para>\r\n                              \r\n      <ddue:para>This node has an additional attribute isLink that will be used if a stringBaseType refers to a uID. TIXI can then\r\n                            perform automatic validation for the existence of the referenced uID. </ddue:para>\r\n                              \r\n      <ddue:para>Furthermore this node contains an additional attribute symmetry. The symmetry attribute may take three values: symm, def, full </ddue:para>\r\n                              \r\n      <ddue:para>def: The element refers to the geometric component that has a symmetry attribute and refers only to the defined side of the geometric component.</ddue:para>\r\n                              \r\n      <ddue:para>symm: The element refers to the geometric component that has a symmetry attribute and refers only to the symmetric side of the geometric component. (Similar to the previous _symm solution)</ddue:para>\r\n                              \r\n      <ddue:para>full: The element refers to the geometric component that has a symmetry attribute and refers to the complete component. (This is the default behaviour)</ddue:para>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(stringVectorBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>stringVectorBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:content>\r\n                                    \r\n        <ddue:para>Base type for string vector nodes (including maptype\r\n                                vector attribute)</ddue:para>\r\n                                    \r\n        <ddue:para>The vector base type can include optional uncertainty\r\n                                information. The description of uncertainties is placed in\r\n                                addtional attributes. First, it is described by an attribute that\r\n                                describes the type of uncertainty function called functionName.\r\n                                The functionName attribute includes the tag name of the\r\n                                distribution function which is listened in the table shown below.\r\n                                Each uncertainty function is further describes by a set of\r\n                                parameters that are described in the table below.</ddue:para>\r\n                                    \r\n        <ddue:para>If the uncertainty values change for the elements of\r\n                                the vector than the attribute may be written as a list of values\r\n                                separated by semicolons</ddue:para>\r\n                                    \r\n        <ddue:mediaLink>\r\n                                          \r\n          <ddue:image xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"uncertaintyFunctions\"/>\r\n                                      \r\n        </ddue:mediaLink>\r\n                                \r\n      </ddue:content>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
		addAnnotation(timeBaseTypeEClass, source, new String[] { "appinfo",
				"\r\n                  \r\n  <sd:schemaDoc xmlns:sd=\"http://schemas.xsddoc.codeplex.com/schemaDoc/2009/3\">\r\n                        \r\n    <ddue:summary xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>timeBaseType</ddue:para>\r\n                          \r\n    </ddue:summary>\r\n                        \r\n    <ddue:remarks xmlns:ddue=\"http://ddue.schemas.microsoft.com/authoring/2003/5\">\r\n                              \r\n      <ddue:para>Base type for time nodes (including external data attributes)\r\n                            This time type is based on the xsd:time definition.\r\n                            \"To specify a time zone, you can either enter a time in UTC time by adding a \"Z\" behind the time - like this: 09:30:10Z\r\n                            or you can specify an offset from the UTC time by adding a positive or negative time behind the time - like this:\r\n                            09:30:10-06:00\r\n                            or\r\n                            09:30:10+06:00\" (description taken from http://www.w3schools.com/xml/schema_dtypes_date.asp)</ddue:para>\r\n                          \r\n    </ddue:remarks>\r\n                    \r\n  </sd:schemaDoc>\r\n              \r\n" });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(booleanBaseTypeEClass, source, new String[] { "name", "booleanBaseType", "kind", "simple" });
		addAnnotation(getBooleanBaseType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getBooleanBaseType_ExternalDataDirectory(), source,
				new String[] { "kind", "attribute", "name", "externalDataDirectory" });
		addAnnotation(getBooleanBaseType_ExternalDataNodePath(), source,
				new String[] { "kind", "attribute", "name", "externalDataNodePath" });
		addAnnotation(getBooleanBaseType_ExternalFileName(), source,
				new String[] { "kind", "attribute", "name", "externalFileName" });
		addAnnotation(complexBaseTypeEClass, source, new String[] { "name", "complexBaseType", "kind", "empty" });
		addAnnotation(getComplexBaseType_ExternalDataDirectory(), source,
				new String[] { "kind", "attribute", "name", "externalDataDirectory" });
		addAnnotation(getComplexBaseType_ExternalDataNodePath(), source,
				new String[] { "kind", "attribute", "name", "externalDataNodePath" });
		addAnnotation(getComplexBaseType_ExternalFileName(), source,
				new String[] { "kind", "attribute", "name", "externalFileName" });
		addAnnotation(dateBaseTypeEClass, source, new String[] { "name", "dateBaseType", "kind", "simple" });
		addAnnotation(getDateBaseType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getDateBaseType_ExternalDataDirectory(), source,
				new String[] { "kind", "attribute", "name", "externalDataDirectory" });
		addAnnotation(getDateBaseType_ExternalDataNodePath(), source,
				new String[] { "kind", "attribute", "name", "externalDataNodePath" });
		addAnnotation(getDateBaseType_ExternalFileName(), source,
				new String[] { "kind", "attribute", "name", "externalFileName" });
		addAnnotation(dateTimeBaseTypeEClass, source, new String[] { "name", "dateTimeBaseType", "kind", "simple" });
		addAnnotation(getDateTimeBaseType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getDateTimeBaseType_ExternalDataDirectory(), source,
				new String[] { "kind", "attribute", "name", "externalDataDirectory" });
		addAnnotation(getDateTimeBaseType_ExternalDataNodePath(), source,
				new String[] { "kind", "attribute", "name", "externalDataNodePath" });
		addAnnotation(getDateTimeBaseType_ExternalFileName(), source,
				new String[] { "kind", "attribute", "name", "externalFileName" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source,
				new String[] { "kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source,
				new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_PaxelerateType(), source,
				new String[] { "kind", "element", "name", "paxelerateType", "namespace", "##targetNamespace" });
		addAnnotation(doorSelectionTypeEClass, source,
				new String[] { "name", "doorSelection_._type", "kind", "simple" });
		addAnnotation(doubleBaseTypeEClass, source, new String[] { "name", "doubleBaseType", "kind", "simple" });
		addAnnotation(getDoubleBaseType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getDoubleBaseType_A(), source, new String[] { "kind", "attribute", "name", "a" });
		addAnnotation(getDoubleBaseType_B(), source, new String[] { "kind", "attribute", "name", "b" });
		addAnnotation(getDoubleBaseType_C(), source, new String[] { "kind", "attribute", "name", "c" });
		addAnnotation(getDoubleBaseType_Delta(), source, new String[] { "kind", "attribute", "name", "delta" });
		addAnnotation(getDoubleBaseType_ExternalDataDirectory(), source,
				new String[] { "kind", "attribute", "name", "externalDataDirectory" });
		addAnnotation(getDoubleBaseType_ExternalDataNodePath(), source,
				new String[] { "kind", "attribute", "name", "externalDataNodePath" });
		addAnnotation(getDoubleBaseType_ExternalFileName(), source,
				new String[] { "kind", "attribute", "name", "externalFileName" });
		addAnnotation(getDoubleBaseType_Mu(), source, new String[] { "kind", "attribute", "name", "mu" });
		addAnnotation(getDoubleBaseType_UncertaintyFunctionName(), source,
				new String[] { "kind", "attribute", "name", "uncertaintyFunctionName" });
		addAnnotation(getDoubleBaseType_V(), source, new String[] { "kind", "attribute", "name", "v" });
		addAnnotation(getDoubleBaseType_W(), source, new String[] { "kind", "attribute", "name", "w" });
		addAnnotation(doubleConstraintBaseTypeEClass, source,
				new String[] { "name", "doubleConstraintBaseType", "kind", "simple" });
		addAnnotation(getDoubleConstraintBaseType_RelationalOperator(), source,
				new String[] { "kind", "attribute", "name", "relationalOperator" });
		addAnnotation(integerBaseTypeEClass, source, new String[] { "name", "integerBaseType", "kind", "simple" });
		addAnnotation(getIntegerBaseType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getIntegerBaseType_ExternalDataDirectory(), source,
				new String[] { "kind", "attribute", "name", "externalDataDirectory" });
		addAnnotation(getIntegerBaseType_ExternalDataNodePath(), source,
				new String[] { "kind", "attribute", "name", "externalDataNodePath" });
		addAnnotation(getIntegerBaseType_ExternalFileName(), source,
				new String[] { "kind", "attribute", "name", "externalFileName" });
		addAnnotation(passengerSortingSchemeTypeEClass, source,
				new String[] { "name", "passengerSortingScheme_._type", "kind", "simple" });
		addAnnotation(paxelerateInputTypeEClass, source,
				new String[] { "name", "paxelerateInputType", "kind", "elementOnly" });
		addAnnotation(getPaxelerateInputType_Studies(), source,
				new String[] { "kind", "element", "name", "studies", "namespace", "##targetNamespace" });
		addAnnotation(paxelerateTypeEClass, source, new String[] { "name", "paxelerateType", "kind", "elementOnly" });
		addAnnotation(getPaxelerateType_Input(), source,
				new String[] { "kind", "element", "name", "input", "namespace", "##targetNamespace" });
		addAnnotation(relationalOperatorTypeEEnum, source, new String[] { "name", "relationalOperator_._type" });
		addAnnotation(relationalOperatorTypeObjectEDataType, source,
				new String[] { "name", "relationalOperator_._type:Object", "baseType", "relationalOperator_._type" });
		addAnnotation(seatTypeTypeEClass, source, new String[] { "name", "seatType_._type", "kind", "simple" });
		addAnnotation(simulationTypeTypeEClass, source,
				new String[] { "name", "simulationType_._type", "kind", "simple" });
		addAnnotation(stringArrayBaseTypeEClass, source,
				new String[] { "name", "stringArrayBaseType", "kind", "simple" });
		addAnnotation(getStringArrayBaseType_MapType(), source,
				new String[] { "kind", "attribute", "name", "mapType" });
		addAnnotation(stringBaseTypeEClass, source, new String[] { "name", "stringBaseType", "kind", "simple" });
		addAnnotation(getStringBaseType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getStringBaseType_ExternalDataDirectory(), source,
				new String[] { "kind", "attribute", "name", "externalDataDirectory" });
		addAnnotation(getStringBaseType_ExternalDataNodePath(), source,
				new String[] { "kind", "attribute", "name", "externalDataNodePath" });
		addAnnotation(getStringBaseType_ExternalFileName(), source,
				new String[] { "kind", "attribute", "name", "externalFileName" });
		addAnnotation(stringUIDBaseTypeEClass, source, new String[] { "name", "stringUIDBaseType", "kind", "simple" });
		addAnnotation(getStringUIDBaseType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getStringUIDBaseType_IsLink(), source, new String[] { "kind", "attribute", "name", "isLink" });
		addAnnotation(getStringUIDBaseType_Symmetry(), source,
				new String[] { "kind", "attribute", "name", "symmetry" });
		addAnnotation(stringVectorBaseTypeEClass, source,
				new String[] { "name", "stringVectorBaseType", "kind", "simple" });
		addAnnotation(getStringVectorBaseType_A(), source, new String[] { "kind", "attribute", "name", "a" });
		addAnnotation(getStringVectorBaseType_B(), source, new String[] { "kind", "attribute", "name", "b" });
		addAnnotation(getStringVectorBaseType_C(), source, new String[] { "kind", "attribute", "name", "c" });
		addAnnotation(getStringVectorBaseType_Delta(), source, new String[] { "kind", "attribute", "name", "delta" });
		addAnnotation(getStringVectorBaseType_MapType(), source,
				new String[] { "kind", "attribute", "name", "mapType" });
		addAnnotation(getStringVectorBaseType_Mu(), source, new String[] { "kind", "attribute", "name", "mu" });
		addAnnotation(getStringVectorBaseType_UncertaintyFunctionName(), source,
				new String[] { "kind", "attribute", "name", "uncertaintyFunctionName" });
		addAnnotation(getStringVectorBaseType_V(), source, new String[] { "kind", "attribute", "name", "v" });
		addAnnotation(getStringVectorBaseType_W(), source, new String[] { "kind", "attribute", "name", "w" });
		addAnnotation(studiesTypeEClass, source, new String[] { "name", "studiesType", "kind", "elementOnly" });
		addAnnotation(getStudiesType_Study(), source,
				new String[] { "kind", "element", "name", "study", "namespace", "##targetNamespace" });
		addAnnotation(studyTypeEClass, source, new String[] { "name", "studyType", "kind", "elementOnly" });
		addAnnotation(getStudyType_LoadFactor(), source,
				new String[] { "kind", "element", "name", "loadFactor", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_ActiveDoorUIDs(), source,
				new String[] { "kind", "element", "name", "activeDoorUIDs", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_Iterations(), source,
				new String[] { "kind", "element", "name", "iterations", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_SimulationType(), source,
				new String[] { "kind", "element", "name", "simulationType", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_DisplaySimulation(), source,
				new String[] { "kind", "element", "name", "displaySimulation", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_SeatType(), source,
				new String[] { "kind", "element", "name", "seatType", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_SimulationGridResolution(), source, new String[] { "kind", "element", "name",
				"simulationGridResolution", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_SimulationSpeedFactor(), source,
				new String[] { "kind", "element", "name", "simulationSpeedFactor", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PassengerSortingScheme(), source,
				new String[] { "kind", "element", "name", "passengerSortingScheme", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_DoorSelection(), source,
				new String[] { "kind", "element", "name", "doorSelection", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PercentageOfPassengersWithJackets(), source, new String[] { "kind", "element",
				"name", "percentageOfPassengersWithJackets", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PercentageOfPassengersWithSmallBags(), source, new String[] { "kind", "element",
				"name", "percentageOfPassengersWithSmallBags", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PercentageOfPassengersWithMediumBags(), source, new String[] { "kind", "element",
				"name", "percentageOfPassengersWithMediumBags", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PercentageOfPassengersWithLargeBags(), source, new String[] { "kind", "element",
				"name", "percentageOfPassengersWithLargeBags", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_UID(), source, new String[] { "kind", "attribute", "name", "uID" });
		addAnnotation(symmetryTypeEEnum, source, new String[] { "name", "symmetry_._type" });
		addAnnotation(symmetryTypeObjectEDataType, source,
				new String[] { "name", "symmetry_._type:Object", "baseType", "symmetry_._type" });
		addAnnotation(timeBaseTypeEClass, source, new String[] { "name", "timeBaseType", "kind", "simple" });
		addAnnotation(getTimeBaseType_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getTimeBaseType_ExternalDataDirectory(), source,
				new String[] { "kind", "attribute", "name", "externalDataDirectory" });
		addAnnotation(getTimeBaseType_ExternalDataNodePath(), source,
				new String[] { "kind", "attribute", "name", "externalDataNodePath" });
		addAnnotation(getTimeBaseType_ExternalFileName(), source,
				new String[] { "kind", "attribute", "name", "externalFileName" });
		addAnnotation(uncertaintyFunctionTypeEEnum, source, new String[] { "name", "uncertaintyFunctionType" });
		addAnnotation(uncertaintyFunctionTypeObjectEDataType, source,
				new String[] { "name", "uncertaintyFunctionType:Object", "baseType", "uncertaintyFunctionType" });
	}

} //ToolspecificPackageImpl
