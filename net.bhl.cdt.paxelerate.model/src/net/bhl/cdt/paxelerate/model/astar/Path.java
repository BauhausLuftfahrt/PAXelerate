/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;

import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * Path is a list of nodes which represent the calculated shortest path.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 *
 */

public class Path {

	/** The waypoints. */
	private ArrayList<Node> waypoints = new ArrayList<Node>();

	/**
	 * This method returns the waypoints.
	 * 
	 * @return the waypoints
	 */
	public ArrayList<Node> getWaypoints() {
		return waypoints;
	}

	/**
	 * This method sets the waypoints.
	 * 
	 * @param waypoints
	 *            the waypoints
	 */
	public void setWaypoints(ArrayList<Node> waypoints) {
		this.waypoints = waypoints;
	}

	/**
	 * The Path constructor.
	 */
	public Path() {
	}

	/**
	 * Returns the length of the path (number of nodes).
	 * 
	 * @return the number of nodes.
	 */
	public int getLength() {
		return waypoints.size();
	}

	/**
	 * This method returns a specific node of the path.
	 * 
	 * @param index
	 *            the index of a specific node
	 * @return the node at a specific index
	 */
	public Node get(int index) {
		return waypoints.get(index);
	}

	/**
	 * Get the x-coordinate for the waypoint at the given index.
	 *
	 * @param index
	 *            The index of the waypoint to get the x-coordinate of.
	 * @return The x coordinate at the waypoint.
	 */
	public Vector getPosition(int index) {
		return get(index).getPosition();
	}

	/**
	 * Append a waypoint to the end of the path.
	 * 
	 * @param n
	 *            the node
	 */

	public void appendWayPoint(Node n) {
		waypoints.add(n);
	}

	/**
	 * Add a waypoint to the beginning of the path.
	 * 
	 * @param n
	 *            the node
	 */
	public synchronized void prependWayPoint(Node n) {
		waypoints.add(0, n);
	}

	/**
	 * Check if this path contains the WayPoint.
	 *
	 * @param x
	 *            The x coordinate of the waypoint.
	 * @param y
	 *            The y coordinate of the waypoint.
	 * @return True if the path contains the waypoint.
	 */
	public boolean contains(int x, int y) {
		for (Node node : waypoints) {
			if (node.getPosition().getX() == x
					&& node.getPosition().getY() == y) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Invert.
	 */
	public void invert() {

		ArrayList<Node> waypointStorage = new ArrayList<Node>();
		for (Node node : waypoints) {
			waypointStorage.add(node);
		}

		waypoints.clear();

		for (Node node : waypointStorage) {
			waypoints.add(0, node);
		}

		waypointStorage.clear();

	}

	/**
	 * Cut to point.
	 *
	 * @param path
	 *            the path
	 * @param point
	 *            the point
	 * @return the path
	 */
	public Path cutToPoint(Path path, Vector point) {
		/* get the last node */
		Path newPath = new Path();
		int i = 0;
		while (true) {
			try {
				Node node = waypoints.get(i);
				newPath.prependWayPoint(node);
				if (node.getPosition().equals(point)) {
					break;
				}
				i++;
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				break;
			}
		}
		return newPath;
	}

	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 * @throws ArithmeticException the arithmetic exception
	 */
	public int getCost() throws ArithmeticException {

		int cost = 0;
		for (Node node : waypoints) {
			cost += node.getCostFromStart();
		}
		if (cost < 0) {
			throw new ArithmeticException(
					"Path cost is smaller than zero! -> " + cost);
		} else {
			return cost;
		}
	}
}
