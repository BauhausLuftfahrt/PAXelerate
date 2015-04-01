package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.util.FuncLib;
import net.bhl.cdt.model.cabin.util.Rotator;
import net.bhl.cdt.model.cabin.util.Vector2D;

public class testClass {

	public static void main(String[] args) {

		int[][] backgroundarray = { { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0 },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7 },
				{ 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0 } };

		FuncLib.printArray(backgroundarray);

		backgroundarray = Rotator.rotate45(backgroundarray);
		// backgroundarray = Rotator.RotatePart(45, backgroundarray, new
		// Vector2D(
		// 3, 3), new Vector2D(3, 4));

		if (backgroundarray != null) {
			FuncLib.printArray(backgroundarray);
		} else {
			System.out.println("Something went wrong!");
		}

	}
}
