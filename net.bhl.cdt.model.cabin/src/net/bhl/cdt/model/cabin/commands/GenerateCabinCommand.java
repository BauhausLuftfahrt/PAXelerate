package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.ClassType;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.DoorType;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.StairwayDirection;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.ConsoleViewPart;
import net.bhl.cdt.model.util.ModelHelper;

/**
 * 
 * This script is used to build up the cabin according to predefined settings.
 * 
 * @author marc.engelmann
 * @version 1.3
 * @date 18.11.2014
 *
 */

/********************How to add a new right click command to openCDT***********************/
/**                                                                                      **/
/** (1) Create a new "newCommand.java" in "net.bhl.cdt.model.cabin.commands"             **/
/**     - Best practice: copy an existing command.                                       **/
/**     - Be sure to not modify the constructor, "this.cabin = cabin" should stay intact **/
/**                                                                                      **/
/** (2) Create a new "newCommandHandler.java" in "net.bhl.cdt.model.cabin.handlers"      **/
/**     - Best practice: copy an existing handler file.                        		     **/
/**     - Tip: Do not modify this file, only check for correct naming         			 **/
/**                         															 **/
/** (3) Open "plugin.xml" and go to "org.eclipse.ui.commands"                			 **/
/**     - Create a new command by right-clicking.                                        **/
/**     - Fill in the id, name and default handler. (Caution: case sensitive!)           **/
/**                                                        								 **/
/** (4) Go to "org.eclipse.ui.menus" in "plugin.xml"                                     **/
/**     - Expand the "popup:org.eclipse.(...)" entry.                                    **/
/**     - Add a new command by right-clicking.                                           **/
/**     - Fill in the correct commandID and your desired label name.                     **/
/**     - Add a new parameter by right-clicking.                                         **/
/**     - Set the parameter to "false (visible when)".      							 **/
/**     - Add a parameter within called "iterate".            						     **/
/**     - Add a parameter within called "instanceOf" and choose "cabin". 			     **/
/**                                            											 **/
/******************************************************************************************/

public class GenerateCabinCommand extends CDTCommand {

	private Cabin cabin;
	private CabinViewPart cabinViewPart;
	private ConsoleViewPart consoleViewPart;
	private int seatCount;
	private int rowCount;
	private String seatIdLetter;
	private double globalSeatPositionX;
	private double globalSeatPositionY;
	private ArrayList<Integer> randomNumberCheck;
	private double spaceBetweenSeats;
	private int seats;
	private int seatsInRow;
	private int numbAisles;
	private double seatDimensionX;
	private double seatDimensionY;
	private double seatPitch;
	private String seatIdString;
	private double seatHelper;

	/**
	 * Creates a cabin.
	 * 
	 * @param cabin
	 *            is the input cabin
	 */
	public GenerateCabinCommand(Cabin cabin) {
		this.cabin = cabin;
	}

	/**
	 * This function creates the name of the seat according to its position.
	 * 
	 * @param letter
	 *            is the number which is converted into a letter from A to F
	 */
	private void switchLetter(int letter) {
		switch (letter) {
		case 2:
			seatIdLetter = "B";
			break;
		case 3:
			seatIdLetter = "C";
			break;
		case 4:
			seatIdLetter = "D";
			break;
		case 5:
			seatIdLetter = "E";
			break;
		case 6:
			seatIdLetter = "F";
			break;
		default:
			seatIdLetter = "A";
			break;
		}
	}

	/**
	 * Loads the settings depending on the class type.
	 * 
	 * @param type
	 *            is a specific class type
	 */
	private void switchSettings(ClassType type) {
		switch (type) {
		case PREMIUM_ECO:
			seats = cabin.getSeatsInPremiumEconomyClass();
			seatsInRow = cabin.getSeatsPerRowInPremiumEconomyClass();
			seatDimensionX = cabin.getSeatWidthInPremiumEconomy();
			seatDimensionY = cabin.getSeatLengthInPremiumEconomy();
			seatPitch = cabin.getSeatPitchInPremiumEco();
			break;
		case BUSINESS:
			seats = cabin.getSeatsInBusinessClass();
			seatsInRow = cabin.getSeatsPerRowInBusinessClass();
			seatDimensionX = cabin.getSeatWidthInBusiness();
			seatDimensionY = cabin.getSeatLengthInBusiness();
			seatPitch = cabin.getSeatPitchInBusiness();
			break;
		case FIRST:
			seats = cabin.getSeatsInFirstClass();
			seatsInRow = cabin.getSeatsPerRowInFirstClass();
			seatDimensionX = cabin.getSeatWidthInFirst();
			seatDimensionY = cabin.getSeatLengthInFirst();
			seatPitch = cabin.getSeatPitchInFirst();
			break;
		default:
			seats = cabin.getSeatsInEconomyClass();
			seatsInRow = cabin.getSeatsPerRowInEconomyClass();
			seatDimensionX = cabin.getSeatWidthInEconomy();
			seatDimensionY = cabin.getSeatLengthInEconomy();
			seatPitch = cabin.getSeatPitchInEconomy();
			break;
		}
	}

	private void createSeat(Row row, int j) {
		// Create new instance of Seat
		Seat newSeat = CabinFactory.eINSTANCE.createSeat();
		row.getSeats().add(newSeat);
		newSeat.setSeatNumber(seatCount);
		switchLetter(j);
		seatIdString = rowCount + seatIdLetter;
		newSeat.setSeatId(seatIdString);
		newSeat.setLength(seatDimensionY);
		newSeat.setWidth(seatDimensionX);
		newSeat.setLetter(seatIdLetter);
		newSeat.setXPosition(globalSeatPositionX);
		newSeat.setYPosition(globalSeatPositionY);
		double aisleSpace = 0;
		seatCount++;
		if (j == (seatsInRow / 2)) {
			aisleSpace = cabin.getAisleWidth() + seatHelper;
		}
		globalSeatPositionX = globalSeatPositionX + seatDimensionX + aisleSpace
				+ seatHelper;
	}

	/**
	 * 
	 */
	private void checkForDoor() {
		double seatPitchMultiplicator = 1.5;
		for (Door door : ModelHelper.getChildrenByClass(cabin, Door.class)) {
			if ((((door.getYPosition() + door.getWidth()) > (globalSeatPositionY - seatPitch)) && (door
					.getYPosition() < globalSeatPositionY))
					|| ((door.getYPosition() > globalSeatPositionY)
							&& (door.getYPosition() < globalSeatPositionY
									+ seatDimensionY) || ((door.getYPosition()
							+ door.getWidth() > globalSeatPositionY) && (door
							.getYPosition() < globalSeatPositionY)))) {
				globalSeatPositionY += seatPitchMultiplicator * seatPitch;
			}
		}
	}

	/**
	 * This function creates a ClassType object and populates it with rows and
	 * seats.
	 * 
	 * @param typeID
	 *            describes which ClassType Option will be created
	 * @param sequence
	 */
	private void createClass(ClassType typeID, int sequence) {
		numbAisles = 1;
		switchSettings(typeID);
		if ((seats > 0) && (seatsInRow > 0)) {
			if (seatsInRow % 2 == 0) {
				PassengerClass newClass = CabinFactory.eINSTANCE
						.createPassengerClass();
				cabin.getClasses().add(newClass);
				newClass.setType(typeID);
				newClass.setSequence(sequence);
				seatHelper = 0;
				for (int i = 1; i <= seats / seatsInRow; i++) {
					globalSeatPositionX = 0;
					if ((seatsInRow * seatDimensionX + cabin.getAisleWidth()) <= cabin
							.getCabinWidth()) {
						switch (numbAisles) {
						case 1:
							seatHelper = globalSeatPositionX = ((cabin
									.getCabinWidth() - cabin.getAisleWidth()) / 2 - (seatsInRow / 2)
									* seatDimensionX)
									/ (1 + seatsInRow / 2);
							break;
						default:
							consoleViewPart
									.printText("Number of aisles not supported!");
							break;
						}
					} else {
						consoleViewPart
								.printText("Check your x dimensions! Cabin too narrow.");
						seatHelper = 0;
						globalSeatPositionX = 0;
					}
					if ((globalSeatPositionX < 0)) {
						seatHelper = 0;
						globalSeatPositionX = 0;
						consoleViewPart
								.printText("Check seat and cabin dimensions! Cabin too narrow.");
					}

					globalSeatPositionY += seatPitch;

					if (cabin.getRowNonexistent() == rowCount) {
						rowCount++;
					}

					// Create new instance of Row
					Row newRow = CabinFactory.eINSTANCE.createRow();
					newClass.getRows().add(newRow);
					newRow.setRowNumber(rowCount);

					checkForDoor();

					for (int j = 1; j <= seatsInRow; j++) {
						createSeat(newRow, j);
					}

					rowCount++;
					globalSeatPositionY = globalSeatPositionY + seatDimensionY;
				}
				if (typeID != ClassType.ECONOMY) {
					createCurtain(true, "after "
							+ newClass.getType().toString() + "Class");
				}
			} else {
				consoleViewPart
						.printText("Please choose an even number for SeatsPerRow");
			}
		}
	}

	/**
	 * This function creates a door.
	 * 
	 * @param doorType
	 *            is the type of the door
	 * @param symmetrical
	 *            describes if the door will be generated on both sides
	 * @param id
	 *            is the id of the door
	 * @param yPosition
	 *            set it to -1 to ignore value, only important for emergency
	 *            exit.
	 */
	private void createDoor(DoorType doorType, boolean symmetrical, int id,
			double yPosition) {
		Boolean mainDoorAlreadyExists = false;
		if (cabin.getDoors().size() > 0) {
			for (Door testDoor : ModelHelper.getChildrenByClass(cabin,
					Door.class)) {
				if ((doorType == DoorType.MAIN_DOOR)
						&& (testDoor.getDoorType() == DoorType.MAIN_DOOR)) {
					consoleViewPart
							.printText("You created more than one main door!");
					mainDoorAlreadyExists = true;
				}
			}
		}
		Door newDoor = CabinFactory.eINSTANCE.createDoor();
		cabin.getDoors().add(newDoor);
		newDoor.setId(id);
		newDoor.setOnBothSides(symmetrical);

		switch (doorType) {
		case EMERGENCY_EXIT:
			newDoor.setWidth(newDoor.getWidthOfEmergencyExit());
			break;
		default:
			newDoor.setWidth(newDoor.getWidthOfMainDoor());
			break;
		}

		if (!mainDoorAlreadyExists) {
			newDoor.setDoorType(doorType);
		} else {
			newDoor.setDoorType(DoorType.STANDARD_DOOR);
		}

		if (doorType != DoorType.EMERGENCY_EXIT) {
			newDoor.setYPosition(globalSeatPositionY);
			globalSeatPositionY += newDoor.getWidthOfMainDoor();
		} else {
			if (yPosition < 0) {
				consoleViewPart
						.printText("Emergency Exit has a illegal yPosition.");
			}
			newDoor.setYPosition(yPosition);
		}
	}

	/**
	 * This method creates a curtain. Curtains are generated automatically in
	 * the class generation.
	 * 
	 * @param openOrNot
	 *            describes whether the curtain is open or not.
	 * @param name
	 *            is the name of the door.
	 */
	private void createCurtain(boolean openOrNot, String name) {
		Curtain newCurtainLeft = CabinFactory.eINSTANCE.createCurtain();
		Curtain newCurtainRight = CabinFactory.eINSTANCE.createCurtain();
		cabin.getCurtains().add(newCurtainLeft);
		cabin.getCurtains().add(newCurtainRight);
		newCurtainLeft.setCurtainOpen(openOrNot);
		newCurtainRight.setCurtainOpen(openOrNot);
		newCurtainLeft.setXPosition(0);
		newCurtainLeft.setYPosition(globalSeatPositionY + 10);
		newCurtainLeft.setXDimension((cabin.getCabinWidth() - cabin
				.getAisleWidth()) / 2);
		newCurtainLeft.setYDimension(10);
		newCurtainLeft.setName(name + " (left)");

		newCurtainRight.setXPosition(cabin.getCabinWidth()
				- newCurtainLeft.getXDimension());
		newCurtainRight.setYPosition(newCurtainLeft.getYPosition());
		newCurtainRight.setXDimension(newCurtainLeft.getXDimension());
		newCurtainRight.setYDimension(newCurtainLeft.getYDimension());
		newCurtainRight.setName(name + " (right)");

		globalSeatPositionY = globalSeatPositionY
				+ newCurtainLeft.getYDimension() + 30;

	}

	/**
	 * This function creates a Lavatory.
	 * 
	 * @param isSymmetrical
	 *            describes if the lavatory is meant to be placed on the same
	 *            y-coordinate, symmetrical to the galley created before.
	 * @param symmetricalToNext
	 *            describes if the galley generated next will be a symmetrical
	 *            to this one.
	 * @param xDimension
	 * @param yDimension
	 */
	private void createLavatory(Boolean isSymmetricalToLavatoryBefore,
			double xDimension, double yDimension) {
		Lavatory newLavatory = CabinFactory.eINSTANCE.createLavatory();
		cabin.getLavatories().add(newLavatory);
		if (isSymmetricalToLavatoryBefore) {
			globalSeatPositionY -= yDimension;
			newLavatory.setXPosition(cabin.getCabinWidth() - xDimension);
			newLavatory.setYPosition(globalSeatPositionY);
		} else {
			newLavatory.setXPosition(0);
			newLavatory.setYPosition(globalSeatPositionY);
		}
		globalSeatPositionY += yDimension;
		newLavatory.setXDimension(xDimension);
		newLavatory.setYDimension(yDimension);
	}

	/**
	 * This method creates a stairway.
	 * 
	 * @param direction
	 * @param xPosition
	 * @param yPostion
	 * @param xDimension
	 * @param yDimension
	 */
	private void createStairway(StairwayDirection direction, double xPosition,
			double yPostion, double xDimension, double yDimension) {
		Stairway newStairway = CabinFactory.eINSTANCE.createStairway();
		cabin.getStairways().add(newStairway);
		newStairway.setXPosition(xPosition);
		newStairway.setYPosition(yPostion);
		newStairway.setDirection(direction);
		newStairway.setXDimension(xDimension);
		newStairway.setYDimension(yDimension);
	}

	/**
	 * 
	 * @param xPosition
	 * @param yPostion
	 * @param xDimension
	 * @param yDimension
	 */
	private void createGalley(Boolean isSymmetricalToGalleyBefore,
			double xDimension, double yDimension) {
		Galley newGalley = CabinFactory.eINSTANCE.createGalley();
		cabin.getGalleys().add(newGalley);
		if (isSymmetricalToGalleyBefore) {
			globalSeatPositionY -= yDimension;
			newGalley.setXPosition(cabin.getCabinWidth() - xDimension);
			newGalley.setYPosition(globalSeatPositionY);
		} else {
			newGalley.setXPosition(0);
			newGalley.setYPosition(globalSeatPositionY);
		}
		globalSeatPositionY += yDimension;
		newGalley.setXDimension(xDimension);
		newGalley.setYDimension(yDimension);
	}

	@Override
	/**
	 * CAUTION! Objects must be generated in the order they appear in the cabin (from front to rear).
	 * Emergency Exits must be generated at first!
	 */
	protected void doRun() {

		/********** Get CabinView and ConsoleView ************/
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
		consoleViewPart = (ConsoleViewPart) page
				.findView("net.bhl.cdt.model.cabin.consoleview");
		/***************************************************/

		consoleViewPart.printText("initialize cabin generation ...");

		/***** Clearing all Objects *****/
		cabin.getClasses().clear();
		cabin.getDoors().clear();
		cabin.getLavatories().clear();
		cabin.getGalleys().clear();
		cabin.getCurtains().clear();
		cabin.getStairways().clear();
		cabin.getStowages().clear();
		cabin.getPassengers().clear();
		/******************************/

		spaceBetweenSeats = 10;
		globalSeatPositionX = 0;
		globalSeatPositionY = 0;
		seatCount = 1;
		rowCount = 1;

		/**** Always generate emergency exits at first! ******/
		createDoor(DoorType.EMERGENCY_EXIT, true, 3, 935);
		createDoor(DoorType.EMERGENCY_EXIT, true, 4, 1228);
		/***************************************************/

		createLavatory(false,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);
		createLavatory(true,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);

		/****** Never create more than one main door! ********/
		createDoor(DoorType.MAIN_DOOR, true, 1, -1);
		/***************************************************/

		createGalley(false,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);
		createGalley(true,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);

		/****************** Create Classes *******************/
		createClass(ClassType.FIRST, 1);
		createClass(ClassType.BUSINESS, 2);
		createClass(ClassType.PREMIUM_ECO, 3);
		createClass(ClassType.ECONOMY, 4);
		/***************************************************/

		createGalley(false,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);
		createGalley(true,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);

		createDoor(DoorType.STANDARD_DOOR, true, 2, -1);

		createLavatory(false,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);
		createLavatory(true,
				((cabin.getCabinWidth() - cabin.getAisleWidth()) / 2), 100);

		// cabin.setGraphicSettings(CabinFactory.eINSTANCE.createCabinViewSettings());

		if (globalSeatPositionY > cabin.getCabinLength()) {
			consoleViewPart.printText("Out of bounds! Cabin too short.");
		}

		consoleViewPart.printText("cabin generation completed");
		cabinViewPart.submitCabin(cabin);
	}

}
