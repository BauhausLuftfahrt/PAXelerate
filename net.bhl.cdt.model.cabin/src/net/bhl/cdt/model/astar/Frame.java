package net.bhl.cdt.model.astar;
import java.awt.Graphics;

import javax.swing.JFrame;


public class Frame extends JFrame {



	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Node node;
		for (int x = 0; x < RunAStar.getMap().getMapWidth(); x++) {
			if (x == 0) {
				for (int i = 0; i <= RunAStar.getMap().getMapWidth(); i++) {
					System.out.print("-");
				}
			}
			System.out.print("|");

			for (int y = 0; y < RunAStar.getMap().getMapHeight(); y++) {
				node = RunAStar.getMap().getNode(x, y);
				if (node.isObstacle) {
				
					System.out.print("X");
				}

				else if (RunAStar.getMap().getNode(x, y).isOccupiedByAgent) {
					g.drawString("¤", x, y);
					System.out.print("¤");
				} else {
					System.out.print(" ");
				}
				if (y == RunAStar.getMap().getMapHeight())
					System.out.print("_");
			}

			System.out.print("|");
			System.out.println();
		}
		for (int i = 0; i <= RunAStar.getMap().getMapWidth(); i++)
			System.out.print("-");

	}
}
