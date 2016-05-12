package net.bhl.cdt.paxelerate.ui.export;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

public class FileSaver {

	/**
	 * This method saves the whole cost map in a text file to the documents
	 * folder.
	 */

	public static void saveCostmapToFile(Costmap costmap, Vector dimensions, int i) {

		PrintWriter printToFile = null;
		try {

			CabinViewPart.makeDirectory();
			printToFile = new PrintWriter(CabinViewPart.getFilePath() + "costmap_door_" + i + ".xls");

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
			printToFile.close();
		}
	}

}
