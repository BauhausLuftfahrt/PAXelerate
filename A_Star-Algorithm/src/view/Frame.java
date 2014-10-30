package view;

import model.CabinView;
import javax.swing.JFrame;
public class Frame {


public static void initFrame() {
javax.swing.SwingUtilities.invokeLater(new Runnable() {
    public void run() {
       // Set up main window (using Swing's Jframe)

       model.TestAStar.frame = new JFrame("Boarding Simulation");
       model.TestAStar.frame .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       model.TestAStar.frame .setContentPane(new CabinView());
       model.TestAStar.frame .pack();
       model.TestAStar.frame .setVisible(true);
    }
 });
}
}