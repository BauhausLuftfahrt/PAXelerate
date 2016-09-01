/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.astar.node;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class is a sorted node list.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 *
 */
public class SortedNodeList {

	/** The list. */
	private ArrayList<Node> list = new ArrayList<Node>();

	/**
	 * This method returns the first list entry.
	 * 
	 * @return the first element
	 */
	public Node getFirst() {
		return list.get(0);
	}

	/**
	 * This method clears the list.
	 */
	public void clear() {
		list.clear();
	}

	/**
	 * This method adds a node to the list.
	 * 
	 * @param node
	 *            the specific node
	 */
	public void add(Node node) {
		list.add(node);
		Collections.sort(list);
	}

	/**
	 * This method removes a specific node from the list.
	 * 
	 * @param n
	 *            the node
	 */
	public void remove(Node n) {
		list.remove(n);
	}

	/**
	 * This method returns the size of the list.
	 * 
	 * @return the size
	 */
	public int size() {
		return list.size();
	}

	/**
	 * This method checks if a specific node is already in the list.
	 *
	 * @param n            the node which is checked
	 * @return true, if successful
	 */
	public boolean contains(Node n) {
		return list.contains(n);
	}
}