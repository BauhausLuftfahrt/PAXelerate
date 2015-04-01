package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.Rotator;
import net.bhl.cdt.model.cabin.util.Vector2D;

public class testClass {

	public static void main(String[] args) {

		int[][] backgroundarray = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };

		FuncLib.printArray(backgroundarray);

		backgroundarray = Rotator.rotate(180, backgroundarray);
		// backgroundarray = Rotator.RotatePart(45, backgroundarray, new
		// Vector2D(
		// 3, 3), new Vector2D(3, 4));

		if (backgroundarray != null) {
			FuncLib.printArray(backgroundarray);
		} else {
			System.out.println("Something went very wrong!");
		}

	}
}
