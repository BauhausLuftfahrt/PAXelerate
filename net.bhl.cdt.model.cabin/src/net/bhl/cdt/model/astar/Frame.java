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
		for (int x = 0; x < RunAStar.map.getMapWidth(); x++) {
			if (x == 0) {
				for (int i = 0; i <= RunAStar.map.getMapWidth(); i++) {
					System.out.print("-");
				}
			}
			System.out.print("|");

			for (int y = 0; y < RunAStar.map.getMapHeight(); y++) {
				node = RunAStar.map.getNode(x, y);
				if (node.isObstacle) {
				
					System.out.print("X");
				}

				else if (RunAStar.map.getNode(x, y).isOccupiedByAgent) {
					g.drawString("¤", x, y);
					System.out.print("¤");
				} else {
					System.out.print(" ");
				}
				if (y == RunAStar.map.getMapHeight())
					System.out.print("_");
			}

			System.out.print("|");
			System.out.println();
		}
		for (int i = 0; i <= RunAStar.map.getMapWidth(); i++)
			System.out.print("-");

	}
}
