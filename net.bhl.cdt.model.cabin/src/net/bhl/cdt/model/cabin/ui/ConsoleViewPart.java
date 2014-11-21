package net.bhl.cdt.model.cabin.ui;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import net.bhl.cdt.model.cabin.Cabin;
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
 * This Script creates a ConsoleView. You can send new Strings by running the printText function within another script.
 * 
 * @author marc.engelmann
 * 
 * @version 1.0
 * 
 * @date 18.11.2014
 *
 */

public class ConsoleViewPart extends ViewPart {
	private static TableViewer viewer;
	Composite parentTest;
	Canvas canvas;
	ArrayList<String> consoleList;
	int numberOfItemsVisible = 5;
	Boolean cutPrint = false;
	String previousString ="";
	int repeatCounter = 2;

	
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

	
	/**
	 * This method catches the string pushed over by another script and processes it. 
	 * @param text is the submittet text string
	 */
	public void printText(String text) {
		
		/*get the current time*/
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Date dateobj = new Date();
		String str = df.format(dateobj);
		
		/*remove the first item if the list of texts is to long*/
		if(consoleList.size()>numberOfItemsVisible) {
			consoleList.remove(0);
			cutPrint = true;
		}
		
		/*if  there is the same string several times in a row, add a counter to the string and update the date*/
		if(text==previousString) {
				consoleList.set(consoleList.size()-1,"["+str+"] "+ text+" ("+repeatCounter+"x)");
				repeatCounter ++;
		} else {
			consoleList.add("["+str+"] "+text);
			repeatCounter = 2;
		}
		
		doTheText();
		previousString = text;
		
	}
	
	public void doTheText() {
		
		parentTest.redraw();
		parentTest.update();
		canvas.redraw();
		final int fontsize = 8;
		canvas.addPaintListener(new PaintListener() {
		      public void paintControl(final PaintEvent e) { 
		    	  Font font = new Font(e.display,"Monaco", fontsize, SWT.NORMAL);
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