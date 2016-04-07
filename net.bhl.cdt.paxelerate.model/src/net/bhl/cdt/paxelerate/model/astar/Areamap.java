package net.bhl.cdt.paxelerate.model.astar;

import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Areamap {

	private List<ArrayList<Node>> structure;
	private Vector size;

	/**
	 * Create a new empty area map.
	 * 
	 * @param size
	 *            the dimensions of the area map
	 */
	public Areamap(Vector size) {

		/* store the dimensions locally */
		this.size = size;

		/* initialize the structure of the area map */
		structure = new ArrayList<ArrayList<Node>>();

		/* loop through all points in x dimension */
		for (int x = 0; x < size.getX(); x++) {

			/* add a new array list per point */
			structure.add(new ArrayList<Node>());

			/* add a node for every point in y dimension */
			for (int y = 0; y < size.getY(); y++) {

				/* create the node */
				Node node = new Node(new Vector2D(x, y));

				/* add the node to the list */
				structure.get(x).add(node);
			}
		}
	}

	/**
	 * Get the node at a specific location using two coordinates.
	 * 
	 * @param x
	 *            the x location
	 * @param y
	 *            the y location
	 * 
	 * @return the desired node
	 */
	public Node get(int x, int y) {

		/* check if the requested location is within bounds */
		if (x < 0 || y < 0 || x >= size.getX() || y >= size.getY()) {

			/* request out of bounds */
			return null;
		}

		/* return the specific node */
		return structure.get(x).get(y);
	}

	/**
	 * Get the node at a specific location using a vector.
	 * 
	 * @param point
	 *            the location Vector of the requested node
	 * 
	 * @return the desired node
	 */
	public Node get(Vector point) {

		/* check if the requested location is within bounds */
		if (point.getX() < 0 || point.getY() < 0 || point.getX() >= size.getX()
				|| point.getY() >= size.getY()) {

			/* no matching node found */
			return null;
		}

		/* return the specific node */
		return structure.get(point.getX()).get(point.getY());
	}

	/**
	 * Get the dimensions of the area map.
	 * 
	 * @return the dimensions vector
	 */
	public Vector getDimensions() {
		return size;
	}

	/**
	 * Get a list of all nodes within the area map.
	 * 
	 * @return the list of nodes
	 */
	public List<Node> getNodes() {

		/* create a new list which will contain all nodes */
		List<Node> list = new ArrayList<>();

		/* Loop through all sublists */
		for (ArrayList<Node> sublist : structure) {

			/* loop through all nodes */
			for (Node node : sublist) {

				/* add the node to the list */
				list.add(node);
			}
		}

		/* return the list */
		return list;
	}
}
