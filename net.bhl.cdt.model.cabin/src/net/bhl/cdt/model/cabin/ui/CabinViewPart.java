package net.bhl.cdt.model.cabin.ui;


import java.util.List;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

/**
 * 
 * @author marc.engelmann
 * 
 * @version 1.0
 * 
 * @date 18.11.2014
 *
 */

public class CabinViewPart extends ViewPart {
	private static TableViewer viewer;
	public int x_zero;
	public int y_zero;
	public Cabin drawCabin;
	public int cabin_x;
	public int cabin_y;
	public double factor;
	public String drawString;
	Boolean showSeatLabels = false;
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
		factor = drawCabin.getCabinWidth() / 96; // 96 is width of cabin image in pixels
		parentTest.redraw();
		parentTest.update();
		canvas.redraw();
		
		x_zero = 138;
		y_zero = 90;
		cabin_x = 96;
		if(drawCabin.getClasses().isEmpty()) {
			cabin_y = 636;
		} else {
			cabin_y = (int)(drawCabin.getCabinLength()/factor);
		}
		final int fontsize = 6;

		canvas.addPaintListener(new PaintListener() {
		      public void paintControl(final PaintEvent e) { 
		    	  e.gc.drawImage(image, 0, 0);
		    	  e.gc.setAlpha(255);
		    	  //e.gc.drawText(testStr, 0, 0);
		    	  //e.gc.drawText(drawString, 0,0);
		    	  Font fontOne = new Font(e.display,"arial", 8, SWT.NORMAL);
		    	  Font fontTwo = new Font(e.display,"arial", fontsize, SWT.NORMAL);
		    	  e.gc.setFont(fontOne);
		    	  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_WHITE));
		    	  e.gc.drawRectangle(20, 20, 70, 50);
		    	  List<Seat> seatList =  ModelHelper.getChildrenByClass(drawCabin, Seat.class);
		    	  List<Row> rowList =  ModelHelper.getChildrenByClass(drawCabin, Row.class);
		    	  e.gc.drawText("Seats: "+seatList.size()+"\nRows: "+rowList.size()+"\n",30,30);
		    	  e.gc.setFont(fontTwo);
		    	  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
		    	  e.gc.fillRectangle(x_zero, y_zero, cabin_x, cabin_y);
		    	  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_DARK_GRAY));
		    	  
		    	  
		    	  if(!drawCabin.getClasses().isEmpty()) {	  
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
		    			  e.gc.fillRectangle((int)(x_zero+seat.getXPosition()/factor),(int)(y_zero +seat.getYPosition()/factor),(int)(seat.getWidth()/factor),(int)(seat.getLength()/factor)); 
		    			  
		    			  if(showSeatLabels) {
		    				  e.gc.drawText(""+seat.getLetter(), (int)(x_zero-fontsize+(seat.getXPosition()+seat.getWidth()/2)/factor),(int)(y_zero-fontsize +(seat.getYPosition()+seat.getLength()/2)/factor));
		    				  if(seat.getXPosition()==0) {
		    					  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
		    					  Row row = CabinFactory.eINSTANCE.createRow();
		    					  row = ModelHelper.getParent(Row.class, seat);
		    					  e.gc.drawText(""+row.getRowNumber(),(int)(x_zero - 5 + drawCabin.getCabinWidth()/2/factor),(int)(y_zero +(seat.getYPosition())/factor));
		    				  }
		    			  }
		    		  }
		    		  
		    		  for(Door door:ModelHelper.getChildrenByClass(drawCabin, Door.class)) {
		    			  
		    			  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_BLACK));
		    			  if(door.isOnBothSides()) {
		    				  e.gc.fillRectangle((int)(x_zero+(drawCabin.getCabinWidth()-50)/factor),(int)(y_zero+door.getYPosition()/factor),(int)(50/factor),(int)(door.getWidth()/factor));  
		    			  }
		    			  e.gc.fillRectangle((int)(x_zero),(int)(y_zero+door.getYPosition()/factor),(int)(50/factor),(int)(door.getWidth()/factor));
		    			  
		    			  
		    		  }
		    		  
		    		  for(Lavatory lavatory:ModelHelper.getChildrenByClass(drawCabin, Lavatory.class)) {
		    			  	
		    			  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GREEN));
			    			e.gc.fillRectangle((int)(x_zero+lavatory.getXPosition()/factor),(int)(y_zero+lavatory.getYPosition()/factor),(int)(lavatory.getXDimension()/factor),(int)(lavatory.getYDimension()/factor));
			    			 e.gc.drawText("WC", (int)(x_zero-fontsize+(lavatory.getXPosition()+lavatory.getXDimension()/2)/factor),(int)(y_zero-fontsize +(lavatory.getYPosition()+lavatory.getYDimension()/2)/factor));
			    			  
			    		  }
		    		  
		    		  for(Galley galley:ModelHelper.getChildrenByClass(drawCabin, Galley.class)) {
		    			  	
		    			  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_CYAN));
			    			e.gc.fillRectangle((int)(x_zero+galley.getXPosition()/factor),(int)(y_zero+galley.getYPosition()/factor),(int)(galley.getXDimension()/factor),(int)(galley.getYDimension()/factor));
			    			 e.gc.drawText("GALLEY", (int)(x_zero-fontsize-8+(galley.getXPosition()+galley.getXDimension()/2)/factor),(int)(y_zero-fontsize +(galley.getYPosition()+galley.getYDimension()/2)/factor));  
		    		  }
		    		  for (Curtain curtain:ModelHelper.getChildrenByClass(drawCabin, Curtain.class)) {
		    			  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_BLACK));
		    			  if(curtain.isCurtainOpen()) {
		    				  e.gc.fillRectangle((int)(x_zero+curtain.getXPosition()/factor),(int)(y_zero+curtain.getYPosition()/factor),(int)(curtain.getXDimension()/factor),(int)(curtain.getYDimension()/factor));
		    				  e.gc.fillRectangle((int)(x_zero+(drawCabin.getCabinWidth()-curtain.getXPosition()-curtain.getXDimension())/factor),(int)(y_zero+curtain.getYPosition()/factor),(int)(curtain.getXDimension()/factor),(int)(curtain.getYDimension()/factor));
		    			  } else {
		    			  e.gc.fillRectangle((int)(x_zero+curtain.getXPosition()/factor),(int)(y_zero+curtain.getYPosition()/factor),(int)(drawCabin.getCabinWidth()/factor),(int)(curtain.getYDimension()/factor));
		    		  
		    			  }
		    			  }
		    		  if(!drawCabin.getPassengers().isEmpty()) {
		    			  for(Passenger passenger:ModelHelper.getChildrenByClass(drawCabin, Passenger.class)) {
		    				  Seat passengerSeat = passenger.getSeatRef();
		    				  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_BLACK));
		    				  if(passengerSeat.getLength()<passengerSeat.getWidth()) {
		    					  e.gc.fillOval((int)(x_zero+(passengerSeat.getXPosition()+passengerSeat.getWidth()/2-passengerSeat.getLength()/4)/factor),(int)(y_zero +(passengerSeat.getYPosition()+passengerSeat.getLength()/4)/factor),(int)(0.5*passengerSeat.getLength()/factor),(int)(0.5*passengerSeat.getLength()/factor)); 
		    				  }else {
		    					  e.gc.fillOval((int)(x_zero+(passengerSeat.getXPosition()+passengerSeat.getWidth()/4)/factor),(int)(y_zero +(passengerSeat.getYPosition()+passengerSeat.getLength()/2-passengerSeat.getWidth()/4)/factor),(int)(0.5*passengerSeat.getWidth()/factor),(int)(0.5*passengerSeat.getWidth()/factor)); 
		    				  }
		    			  }  
		    		  }
	    			  
	    		  } else {
	    			  Font fontThree = new Font(e.display,"arial", 10, SWT.NORMAL);
			    	  e.gc.setFont(fontThree);
	    			  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_RED));
	    			  e.gc.fillRectangle(30, 370, 310, 38);
	    			  e.gc.drawText("Please refresh cabin view or generate a new cabin!",40, 380);
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