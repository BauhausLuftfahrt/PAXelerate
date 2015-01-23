package net.bhl.cdt.model.cabin.util;

import javax.swing.*;


public class GetInput {
	private int value = 0;
	
	public GetInput() {
		run();
	}
	
	private  void run() {
		JFrame frame = new JFrame("user input required.");

		// prompt the user to enter their name
		value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter the speed in milliseconds!","100"));
	}
	
	public int getValue() {
		return value;
	}
}