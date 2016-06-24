/** <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import net.bhl.cdt.paxelerate.model.astar.Areamap;
import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.output.ExcelExport;

/**
 * This class exports the costmap and obstacle map.
 *
 * @author marc.engelmann, michael.schmidt
 * @version 1.0
 */

public class MapExportHelper {

	/** The default fileName. */
	private String fileName = "export";

	/** The areamap exporter. */
	private static ExcelExport areamapExporter;

	/**
	 * This method saves the whole cost map in a text file to the documents
	 * folder.
	 *
	 * @param exporter the exporter
	 */

	public MapExportHelper(final ExcelExport exporter) {
		areamapExporter = exporter;
	}

	/**
	 * Save costmap to file.
	 *
	 * @param map the map
	 * @param dimensions the dimensions
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	public final void saveCostmapToFile(final Map<Integer, Costmap> map, final Vector dimensions)
			throws IOException, FileNotFoundException {

		for (Costmap costmap : ((Map<Integer, Costmap>) map).values()) {

			for (int x = 0; x < dimensions.getX(); x++) {
				for (int y = 0; y < dimensions.getY(); y++) {
					if (costmap.getCost(new Vector2D(x, y)) == -1) {
						areamapExporter.addColumnElement("X");
					} else {
						areamapExporter.addColumnElement(costmap.getCost(new Vector2D(x, y)));
					}
				}
				areamapExporter.addNewLine();
			}

		}

	}

	/**
	 * This method saves the whole obstacle map in a text file to the documents
	 * folder.
	 *
	 * @param areamap the areamap
	 * @param dimensions the dimensions
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */

	public final void saveObstacleToFile(final Areamap areamap, final Vector dimensions) throws IOException, FileNotFoundException {

		for (int x = 0; x < dimensions.getX(); x++) {
			for (int y = 0; y < dimensions.getY(); y++) {
				if (areamap.get(new Vector2D(x, y)).isObstacle()) {
					areamapExporter.addColumnElement("X");
				} else {
					areamapExporter.addColumnElement(areamap.get(new Vector2D(x, y)).getObstacleValue());
				}
			}
			areamapExporter.addNewLine();
		}
	}
}
