package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.util.FuncLib;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] backgroundarray = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		int[][] array = { { 1, 1 }, { 1, 1 }, { 1, 1 }, { 1, 1 } };

		for (int i = 0; i < backgroundarray.length; i++) {
			for (int j = 0; j < backgroundarray[0].length; j++) {
				System.out.print(backgroundarray[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		backgroundarray = FuncLib.Rotate45(backgroundarray);
		// array = FuncLib.Rotate45(array);
		for (int i = 0; i < backgroundarray.length; i++) {
			for (int j = 0; j < backgroundarray.length; j++) {
				System.out.print(backgroundarray[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		backgroundarray = FuncLib.Rotate45(backgroundarray);
		// array = FuncLib.Rotate45(array);
		for (int i = 0; i < backgroundarray.length; i++) {
			for (int j = 0; j < backgroundarray.length; j++) {
				System.out.print(backgroundarray[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		backgroundarray = FuncLib.Rotate45(backgroundarray);
		// array = FuncLib.Rotate45(array);
		for (int i = 0; i < backgroundarray.length; i++) {
			for (int j = 0; j < backgroundarray.length; j++) {
				System.out.print(backgroundarray[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		backgroundarray = FuncLib.Rotate45(backgroundarray);
		// array = FuncLib.Rotate45(array);
		for (int i = 0; i < backgroundarray.length; i++) {
			for (int j = 0; j < backgroundarray.length; j++) {
				System.out.print(backgroundarray[i][j]);
			}
			System.out.println();
		}
	}

}
