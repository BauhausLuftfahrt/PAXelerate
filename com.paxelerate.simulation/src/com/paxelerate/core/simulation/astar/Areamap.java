/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/

package com.paxelerate.core.simulation.astar;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.paxelerate.core.simulation.astar.Node.Layer;
import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.extensions.DeckExtensions;

import net.bhl.opensource.toolbox.math.vector.IntVector;

/**
 *
 * @author Marc.Engelmann, Michael.Schmidt
 * @since 11.05.2020
 *
 */

public class Areamap {

	private Node[][] structure;
	private IntVector size;

	/**
	 * Create a new empty area map of the cabin.
	 *
	 * @param size the dimensions of the area map
	 */
	public Areamap(Deck deck) {

		// store the dimensions locally
		size = DeckExtensions.getSimulationDimensions(deck);

		structure = new Node[size.getX()][size.getY()];

		for (int x = 0; x < size.getX(); x++) {
			for (int y = 0; y < size.getY(); y++) {
				structure[x][y] = new Node(x, y);
			}
		}

		// define the neighboring nodes of each node
		for (Node node : getNodes()) {

			// define the neighboring nodes
			for (int dx = node.getPosition().getX() - 1; dx <= node.getPosition().getX() + 1; dx++) {
				for (int dy = node.getPosition().getY() - 1; dy <= node.getPosition().getY() + 1; dy++) {

					get(dx, dy).ifPresent(neighbor -> {

						if (neighbor != node) {
							node.getNeighbors().add(neighbor);
						}
					});
				}
			}
		}

		// apply obstacle values to the map
		new ObstacleGenerator(this, deck);

	}

	/**
	 * Get the node at a specific location using a vector.
	 *
	 * @param point
	 *
	 * @return the desired node
	 */
	public Optional<Node> get(EPoint point) {
		return get((int) Math.round(point.getX()), (int) Math.round(point.getY()));
	}

	/**
	 * Get the node at a specific location using two coordinates.
	 *
	 * @param x
	 * @param y the y location
	 *
	 * @return the desired node
	 */
	public Optional<Node> get(int x, int y) {

		if (x >= 0 && y >= 0) {
			if (x < size.getX() && y < size.getY()) {
				return Optional.of(structure[x][y]);
			}
		}

		return Optional.empty();
	}

	/**
	 * Get the node at a specific location using a vector.
	 *
	 * @param point
	 *
	 * @return the desired node
	 */
	public Optional<Node> get(IntVector point) {
		return get(point.getX(), point.getY());
	}

	/**
	 * Get the dimensions of the area map.
	 *
	 * @return the dimensions vector
	 */
	public IntVector getDimensions() {
		return size;
	}

	/**
	 * @param filter
	 * @return
	 */
	public List<Node> getFilteredNodes(Predicate<? super Node> filter) {
		return Arrays.stream(structure).flatMap(Arrays::stream).filter(filter).collect(Collectors.toList());
	}

	/**
	 * Get a list of all nodes within the area map.
	 *
	 * @return the list of nodes
	 */
	public List<Node> getNodes() {
		return Arrays.stream(structure).flatMap(Arrays::stream).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		String output = "";

		Layer layer = Layer.ASTAR;

		for (int x = 0; x < size.getX(); x++) {
			output += ("" + x + "\t");
			for (int y = 0; y < size.getY(); y++) {
				String flag = "";
				switch (structure[x][y].getProperty(layer)) {
				case FREE:
					flag = " ";
					break;
				case OBJECT:
					flag = "O";
					break;
				case FUSELAGE:
					flag = "F";
					break;
				}

				output += flag;
			}
			output += "\n";
		}

		return output;
	}
}
