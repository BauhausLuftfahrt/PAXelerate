/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/

package com.paxelerate.core.sim.astar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.paxelerate.model.EPoint;
import com.paxelerate.model.extensions.EPointExtensions;

import net.bhl.opensource.toolbox.math.vector.IntVector;

/**
 * Path is a list of nodes which represent the calculated shortest path.
 *
 * @author Marc.Engelmann
 * @since 11.05.2020
 *
 */
public class Path extends ArrayList<Node> {

	private static final long serialVersionUID = 5345946885205686488L;
	private final int cost;

	/**
	 * @param costmap
	 */
	public Path(Costmap costmap) {
		super();

		// Calculate the path cost
		cost = stream().mapToInt(n -> costmap.getCost(n.getPosition())).sum();
	}

	/**
	 *
	 * @return
	 */
	public EList<EPoint> asEList() {

		EList<EPoint> list = new BasicEList<>();

		for (Node node : this) {
			list.add(EPointExtensions.transformIntVector(node.getPosition()));
		}

		return list;
	}

	/**
	 * Invert the order of way points.
	 */
	public void invert() {
		Collections.reverse(this);
	}

	/**
	 *
	 * @return
	 */
	public Node lastElement() {
		return get(size() - 1);
	}

	/**
	 *
	 * @param path
	 */
	public void prependPath(Path path) {
		if (path == null) {
			/* nothing to prepend .. */
			return;
		}
		path.invert();
		for (Node node : path) {
			add(0, node);
		}
	}

	/**
	 * @return
	 */
	public int getCost() {
		return cost;
	}

	/**
	 *
	 * @param position
	 */
	public void removeAllNodesAfter(IntVector position) {
		invert();
		for (Iterator<Node> it = iterator(); it.hasNext();) {
			Node node = it.next();
			if (node.getPosition().equals(position)) {
				invert();
				return;
			}
			it.remove();
		}
	}

	/**
	 *
	 * @param position
	 */
	public void removeAllNodesBefore(IntVector position) {
		for (Iterator<Node> it = iterator(); it.hasNext();) {
			Node node = it.next();
			if (node.getPosition().equals(position)) {
				return;
			}
			it.remove();
		}
	}
}
