package net.bhl.cdt.model.cabin.ui;


import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Seat;
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
 */

public class ConsoleViewPart extends ViewPart {
	private static TableViewer viewer;
	Composite parentTest;
	Canvas canvas;
	ArrayList<String> consoleList;
	Boolean cutPrint = false;

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

	
	/** * This is a callback that will allow us to create the viewer and initialize * it. */

	public void createPartControl(Composite parent) {	
		parentTest = parent;
		canvas = new Canvas(parent, SWT.RESIZE);
		consoleList = new ArrayList<String>();
		doTheText();
	}

	
	public void printText(String text) {	
		if(consoleList.size()>5) {
			consoleList.remove(0);
			cutPrint = true;
		}
		consoleList.add(text);
		doTheText();
		
	}
	
	public void doTheText() {
		
		parentTest.redraw();
		parentTest.update();
		canvas.redraw();
		
		canvas.addPaintListener(new PaintListener() {
		      public void paintControl(final PaintEvent e) { 
		    	  int fontsize = 8;
		    	  Font font = new Font(e.display,"courier", fontsize, SWT.NORMAL);
		    	  e.gc.setFont(font);
		    	  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_BLACK));
		    	  e.gc.fillRectangle(0, 0, 500, 500);
		    	  e.gc.setForeground(e.display.getSystemColor(SWT.COLOR_WHITE));
		    	  if(!consoleList.isEmpty()) {  
		    		  int i = 0;
		    		  	if(!cutPrint) {
		    			  for(String printString:consoleList) {
		    				  e.gc.drawText(printString, 10, 10 + (10 + fontsize)*i);
		    				  i++;
		    			  }
		    	  		}
		    		  	else {
		    			  for(String printString:consoleList) {
		    				  e.gc.drawText("...", 10, 10);
		    				  e.gc.drawText(printString, 10, 20 +fontsize + (10 + fontsize)*i);
		    				  i++;	  
		    			  }
		    		  	}
		    	 
		      	} 
		      }
	    });    
	}
	
	/** * Passing the focus request to the viewer's control. */
	public void setFocus() {
		viewer.getControl().setFocus();
		parentTest.redraw();
	}

}