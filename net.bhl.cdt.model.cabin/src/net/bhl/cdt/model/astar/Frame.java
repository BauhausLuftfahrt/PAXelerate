package net.bhl.cdt.model.astar;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;


public class Frame extends JFrame {



	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Node node;
		for (int x = 0; x < TestAStar.map.getMapWidth(); x++) {
			if (x == 0) {
				for (int i = 0; i <= TestAStar.map.getMapWidth(); i++) {
					System.out.print("-");
				}
			}
			System.out.print("|");

			for (int y = 0; y < TestAStar.map.getMapHeight(); y++) {
				node = TestAStar.map.getNode(x, y);
				if (node.isObstacle) {
				
					System.out.print("X");
				}

				else if (TestAStar.map.getNode(x, y).isOccupiedByAgent) {
					g.drawString("¤", x, y);
					System.out.print("¤");
				} else {
					System.out.print(" ");
				}
				if (y == TestAStar.map.getMapHeight())
					System.out.print("_");
			}

			System.out.print("|");
			System.out.println();
		}
		for (int i = 0; i <= TestAStar.map.getMapWidth(); i++)
			System.out.print("-");

	}
}
