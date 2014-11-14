package net.bhl.cdt.model.cabin.ui;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;



public class CabinView extends ViewPart {
  public static final String ID = "net.bhl.cdt.model.cabin.ui.cabinview";

  private ListViewer viewer;

  public void createPartControl(Composite parent) {
    viewer = new ListViewer(parent);
    viewer.setContentProvider(ArrayContentProvider.getInstance());
    
    
    getSite().setSelectionProvider(viewer);
    hookDoubleClickCommand();

  }

  private void hookDoubleClickCommand() {
    viewer.addDoubleClickListener(new IDoubleClickListener() {
      public void doubleClick(DoubleClickEvent event) {
        IHandlerService handlerService = (IHandlerService) getSite()
            .getService(IHandlerService.class);
        try {
          handlerService.executeCommand("de.vogella.rcp.editor.example.openEditor", null);
        } catch (Exception ex) {
          throw new RuntimeException("de.vogella.rcp.editor.example.openEditor not found");
        }
      }
    });
  }

  public void setFocus() {
    viewer.getControl().setFocus();
  }
} 