package net.bhl.cdt.model.cabin.commands;


import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.ClassType;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;



public class DrawCabin {
	public static Cabin cabin;
	public static int test;
	public static int x_zero;
	public static int y_zero;
	public static int cabin_width;
	public static int cabin_length;
	
		
	  public static void main(String[] args) {
		
		  // set new zero of coordinates
		  x_zero = 350;
		  y_zero = 245;
		  cabin_length = 637;
		  cabin_width = 95;
		  
		/*GenerateCabin generateCabin = new GenerateCabin();
		generateCabin.doRun();
		cabin = generateCabin.cabin;
		
		cabin.setBusinessClassPassengers(99);
		test = cabin.getBusinessClassPassengers(); */
		
		final Display display = new Display();
	
		//final String testStr = "";
		
		//WARUM FINAL????
		final Image image = new Image(display, ".\\images\\lh_a320.PNG");  
	    Shell shellNumber2 = new Shell(display);
	    shellNumber2.setText("Boarding Simulation - Cabin Layout");
	    shellNumber2.setLayout(new FillLayout());
	    shellNumber2.setBounds(image.getBounds());
	    

	    Canvas canvas = new Canvas(shellNumber2, SWT.NONE);

	    canvas.addPaintListener(new PaintListener() {
	      public void paintControl(final PaintEvent e) {
	    	
	    	  display.syncExec(
	    			  new Runnable() {
	    			    public void run(){
	    			      
	        e.gc.drawImage(image, 0, 0);
	        //e.gc.drawText(testStr, 0, 0);
	        e.gc.drawText("Test Message", 0,0);
	        e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
	        e.gc.setAlpha(250);
	        e.gc.fillRectangle(x_zero, y_zero, cabin_width, cabin_length);
	        e.gc.setBackground(e.display.getSystemColor(SWT.NO_BACKGROUND));
	        
	        
	        double aisle_width = 20;
	        double space_between_rows = 5;
	        double space_between_seats = 5;
	        double numb_seats = 6;
	        double numb_rows = 40;
	        double seat_length = cabin_length / ((numb_rows));
	        double seat_width = (cabin_width-aisle_width) / (numb_seats+1);
	        for (int j = 0; j < numb_rows; j ++) {
	        	
	        	for (int i = 0; i<=numb_seats; i++) {
	        		if ( i != 3) {
	        	    e.gc.fillRectangle(x_zero + i * ((int)seat_width + (int)space_between_seats), y_zero + j*((int)seat_length), (int)seat_width, (int)seat_length);
	        		}
	            }
	        }
	        //e.gc.drawT
	     
	    			    }
	    			  });
	        
	      }
	    });
	    
	    shellNumber2.open();
	    while (!shellNumber2.isDisposed()) {
	      if (!display.readAndDispatch()) {
	        display.sleep();
	      }
	    }
	    display.dispose(); 
	    
	   //eventuell hier neues Objekt rzeugen ? 
	  }

	
	}