package net.bhl.cdt.model.cabin.ui;
  
import java.util.HashMap;  
  
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.core.runtime.IProgressMonitor;  
import org.eclipse.core.runtime.IStatus;  
import org.eclipse.core.runtime.Status;  
import org.eclipse.core.runtime.jobs.Job;  
import org.eclipse.ui.PlatformUI;  
public class PublisherJob extends Job {  
  
 private static int mCounter = 0;  
   
 public PublisherJob() {  
  super("Publisher");  
  
  schedule();  
 }  
  
 @Override  
 protected IStatus run(IProgressMonitor monitor) {  
  Object service = PlatformUI.getWorkbench().getService(EventBroker.class);  
  if (service instanceof EventBroker) {  
   ((EventBroker) service).post("com/example/eventbroker/basic", new Object());  
  
   HashMap<String, Object> data = new HashMap<String, Object>();  
   data.put("Event origin", "unknown");  
   data.put("Event number", mCounter++);  
   ((EventBroker) service).post("com/example/eventbroker/advanced", data);  
   schedule(1000);  
   return Status.OK_STATUS;  
  }  
    
  return Status.OK_STATUS;  
 }  
}