package net.bhl.cdt.model.cabin.ui;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;

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
	
	private TableViewer viewer;
	public int x_zero;
	public int y_zero;

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
		final Image image = new Image(parent.getDisplay(),"C:\\Users\\Marc.Engelmann\\Desktop\\lh_a320_cut.PNG"); // warum geht das nur mit absolutem Pfad?
		x_zero = 140;
		y_zero = 90;
		Canvas canvas = new Canvas(parent, SWT.RESIZE);
		canvas.addPaintListener(new PaintListener() {
		      public void paintControl(final PaintEvent e) { 
		    	  e.gc.drawImage(image, 0, 0);
		    	  //e.gc.drawText(testStr, 0, 0);
		    	  //e.gc.drawText("Test Message", 0,0);
		    	  e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
		    	  //e.gc.setAlpha(200);
		    	  e.gc.fillRectangle(x_zero, y_zero, 93, 636);
		    	  //e.gc.drawT     
		      }
	    });    

	}

	private Object getElement() {
		Cabin newCabin = CabinFactory.eINSTANCE.createCabin();
		newCabin.setName("MyCabin");
		return newCabin;
	}

	/** * Passing the focus request to the viewer's control. */

	public void setFocus() {
		viewer.getControl().setFocus();
	}

}