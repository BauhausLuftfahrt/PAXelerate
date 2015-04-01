package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.util.Rotator;
import net.bhl.cdt.model.cabin.util.Vector2D;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		for (int i = 0; i < backgroundarray.length; i++) {
			for (int j = 0; j < backgroundarray[0].length; j++) {
				System.out.print(backgroundarray[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		// backgroundarray = Rotator.Rotate45(backgroundarray);
		// array = FuncLib.Rotate45(array);

		backgroundarray = Rotator.RotatePart(90, backgroundarray, new Vector2D(
				3, 3), new Vector2D(4, 4));

		for (int i = 0; i < backgroundarray.length; i++) {
			for (int j = 0; j < backgroundarray[0].length; j++) {
				System.out.print(backgroundarray[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
