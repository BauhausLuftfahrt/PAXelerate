package net.bhl.cdt.model.cabin.commands;



import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;



public class DrawCabinCommand extends CDTCommand {
	
	private Cabin cabin;
	final Display layoutDisplay = new Display();

	public DrawCabinCommand(Cabin cabin) {
		this.cabin=cabin;
			
	}
	  
//	  public void doTheDraw() {
//
//		final Image image = new Image(layoutDisplay, ".\\images\\lh_a320.PNG");  
//		
//		Display.getCurrent().syncExec(
//	    		new Runnable() {
//	    			    @Override
//	    			    public void run(){
//	    			    	Shell shell = new Shell(layoutDisplay);
//	    				    shell.setText("Boarding Simulation - Cabin Layout");
//	    				    shell.setLayout(new FillLayout());
//	    				    shell.setBounds(image.getBounds());
//	    				    Canvas canvas = new Canvas(shell, SWT.NONE);
//	    				    canvas.addPaintListener(new PaintListener() {
//	    					      public void paintControl(final PaintEvent e) {
//	    				    
//	    					    	  e.gc.drawImage(image, 0, 0);
//	    					    	  //e.gc.drawText(testStr, 0, 0);
//	    					    	  e.gc.drawText("Test Message", 0,0);
//	    					    	  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_BLACK));
//	    					    	  e.gc.setAlpha(200);
//	    					    	  e.gc.fillRectangle(350, 245, 95, 637);
//	    					    	  //e.gc.drawT     
//	    					      }
//	    				    });    
//	    				    shell.open();
//	    				    while (!shell.isDisposed()) {
//	    				      if (!shell.getDisplay().readAndDispatch()) {
//	    				    	  shell.getDisplay().sleep();
//	    				      }
//	    				    }
//	    				    shell.getDisplay().dispose(); 
//	    			    }
//	    		});
//	  }

	@Override
	protected void doRun() {

		 
		        final Display display = new Display();
		        Shell shell = new Shell(display);
		        shell.setText("SWTThreadAccessExample");
		        shell.setLayout(new FillLayout());
		        final Label label = new Label(shell, SWT.BORDER);
		        label.setText(System.currentTimeMillis() + "");
		        shell.pack();
		        shell.open();
		        new Thread() {
		            public void run() {
		                Runnable r = new Runnable(){
		                    public void run(){
		                        label.setText(System.currentTimeMillis() + "");
		                    }
		                };
		                while (true) {
		                    if (!label.isDisposed()) {
		                        //-> Exception in thread "Thread-0" org.eclipse.swt.SWTException: Invalid thread access
		                        //label.setText(System.currentTimeMillis() + "");
		               
		                        display.asyncExec(r);
		                    } else {
		                        break;
		                    }
		 
		                    try {
		                        sleep(100);
		                    } catch (InterruptedException e) {
		                        e.printStackTrace();
		                    }
		                }
		            }
		        }.start();
		 
		        while (!shell.isDisposed()) {
		            if (!display.readAndDispatch()) {
		                display.sleep();
		            }
		        }
		    }
		
	
	}