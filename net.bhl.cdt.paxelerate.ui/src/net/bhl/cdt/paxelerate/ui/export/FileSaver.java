package net.bhl.cdt.paxelerate.ui.export;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import net.bhl.cdt.paxelerate.model.astar.Areamap;
import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

public class FileSaver {

	
	/** The Constant FILE_PATH. */
	private static final String FOLDER_NAME = "paxelerate",
			FILE_PATH = System.getProperty("user.home") + "/Documents/" + FOLDER_NAME + "/";
	/**
	 * This method saves the whole cost map in a text file to the documents
	 * folder.
	 */

	public static void saveCostmapToFile(Costmap costmap, Vector dimensions, int i) {

		PrintWriter printToFile = null;
		try {

			CabinViewPart.makeDirectory();
			printToFile = new PrintWriter(FILE_PATH + "costmap_door_" + i + ".xls");

			for (int x = 0; x < dimensions.getX(); x++) {
				for (int y = 0; y < dimensions.getY(); y++) {
					if (costmap.getCost(new Vector2D(x, y)) == -1) {
						printToFile.print("X\t");
					} else {
						printToFile.print(costmap.getCost(new Vector2D(x, y)) + "\t");
					}
				}
				printToFile.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not save cost map to file.");
		} catch (NullPointerException e) {
			System.out.println("The file path is not available.");
		} finally {
			if (printToFile != null) {
				printToFile.close();
			}
		}
	}

	/**
	 * This method saves the whole obstacle map in a text file to the documents
	 * folder.
	 */

	public static void saveObstacleToFile(Areamap areamap, Vector dimensions) {

		PrintWriter printer = null;
		try {

			CabinViewPart.makeDirectory();
			printer = new PrintWriter(FILE_PATH + "obstaclemap.xls");

			for (int x = 0; x < dimensions.getX(); x++) {
				for (int y = 0; y < dimensions.getY(); y++) {
					if (areamap.get(new Vector2D(x, y)).isObstacle()) {
						printer.print("X\t");
					} else {
						printer.print(areamap.get(new Vector2D(x, y)).getObstacleValue() + "\t");
					}
				}
				printer.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not save obstacle map to file.");
		} catch (NullPointerException e) {
			System.out.println("The file path is not available.");
		} finally {
			if (printer != null) {
				printer.close();
			}
		}
	}
}
