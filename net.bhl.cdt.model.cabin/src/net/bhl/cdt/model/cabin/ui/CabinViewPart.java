package net.bhl.cdt.model.cabin.ui;


import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;


public class CabinViewPart extends ViewPart {
	private static TableViewer viewer;
	public int x_zero;
	public int y_zero;
	public Cabin drawCabin;
	public int cabin_x;
	public int cabin_y;
	public double factor;
	public String drawString;
	Composite parentTest;
	Image image;
	Canvas canvas;

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			Cabin todo = (Cabin) obj;
			return todo.getName();
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

//	  @Inject
//	  void eventReceived(@UIEventTopic("viewcommunication/*") Cabin cabin) {
//	    newCabin = cabin;
//	  }
	
	/** * This is a callback that will allow us to create the viewer and initialize * it. */

	public void createPartControl(Composite parent) {
		drawCabin = CabinFactory.eINSTANCE.createCabin();
		parentTest = parent;
		//getElement();
		//Door door = CabinFactory.eINSTANCE.createDoor();
		drawString  = "Layout not based\non actual cabin model!";
		// warum geht das nur mit absolutem Pfad?
		image = new Image(parent.getDisplay(),"T:\\Marc Engelmann\\aircraft_images\\lh_a320_cut.PNG"); 
		// falsch!!!!!!!!!!
		
		canvas = new Canvas(parent, SWT.RESIZE);
		doTheDraw();

	}

//	private Object getElement() {
//		newCabin = CabinFactory.eINSTANCE.createCabin();
//		newCabin.setName("MyCabin");
//		return newCabin;
//	}
	
	public void submitCabin(Cabin cabin) {
		drawCabin = cabin;
		doTheDraw();
	}
	
	public void doTheDraw() {
		factor = drawCabin.getCabinWidth() / 96;
		parentTest.redraw();
		parentTest.update();
		canvas.redraw();
		
		x_zero = 138;
		y_zero = 90;
		cabin_x = 96;
		cabin_y = 636;
		final int seatWidth = (cabin_x - 16) / 6 - 1;
		final int seatLength = 10;
		final int seatPitch = 10;
		final int numbRows = cabin_y / (seatLength+seatPitch);
		
		canvas.addPaintListener(new PaintListener() {
		      public void paintControl(final PaintEvent e) { 
		    	  e.gc.drawImage(image, 0, 0);
		    	  //e.gc.drawText(testStr, 0, 0);
		    	  //e.gc.drawText(drawString, 0,0);
		    	  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
		    	  //e.gc.setAlpha(200);
		    	  e.gc.fillRectangle(x_zero, y_zero, cabin_x, cabin_y);
		    	  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_DARK_GRAY));
		    	  if(drawCabin.getClasses().isEmpty()) {
		    		  
		    		  for (int j = 0; j<numbRows; j++) {
		    		  for (int i = 0; i <= 6; i++) {
		    			  if (i!=3) {
		    				  // besser direkt die Koordinaten der Sitze auslesen!
		    				  e.gc.fillRectangle((x_zero+(seatWidth+2)*i),y_zero +(seatPitch+seatLength)*j + 20,seatWidth,seatLength); 
		    				  e.gc.drawText(""+i,(x_zero+(seatWidth+2)*i),y_zero +(seatPitch+seatLength)*j+20);
		    			  }
		    		  }
		    		  }
		    		  
		    	  }
		    		  
		    	  else {
		    		  for(Seat seat:ModelHelper.getChildrenByClass(drawCabin, Seat.class)) {
		    			  PassengerClass pasClass =  ModelHelper.getParent(PassengerClass.class,seat);
		    			  
		    			  switch(pasClass.getType()) {
		    			  default:
		    				  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_DARK_GRAY));
		    				  break;
		    			  case BUSINESS:
		    				  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_BLUE));
		    				  break;
		    			  case FIRST:
		    				  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_RED));
		    				  break;
		    			  case PREMIUM_ECO:
		    				  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_YELLOW));
		    				  break;
		    				  
		    			  }
		    			  //e.gc.drawRectangle((int)(x_zero+seat.getXPosition()/factor),(int)(y_zero +seat.getYPosition()/factor),(int)(seat.getWidth()/factor),(int)(seat.getLength()/factor));
		    			  e.gc.fillRectangle((int)(x_zero+seat.getXPosition()/factor),(int)(y_zero +seat.getYPosition()/factor),(int)(seat.getWidth()/factor),(int)(seat.getLength()/factor)); 
		    			  
		    		  }
	    			  
	    		  }
		      }
		      
	    });    
	}
	
	
//	private void getElement() {
//		newCabin = CabinFactory.eINSTANCE.createCabin();
//		newCabin.setName("MyCabin");
//		//return newCabin;
//		
//	}
	

	/** * Passing the focus request to the viewer's control. */
	public void setFocus() {
		viewer.getControl().setFocus();
		parentTest.redraw();
		parentTest.update();
	}

}