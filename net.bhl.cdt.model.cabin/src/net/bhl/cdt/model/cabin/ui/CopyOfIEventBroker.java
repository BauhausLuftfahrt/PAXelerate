package net.bhl.cdt.model.cabin.ui;

import org.eclipse.e4.core.services.events

public interface CopyOfIEventBroker {
    public String DATA = "net.bhl.cdt.model.cabin"; //$NON-NLS-1$
 
    public boolean send(String topic, Object data);
    public boolean post(String topic, Object data);
 
    public boolean subscribe(String topic, EventHandler eventHandler);
 
    public boolean subscribe(String topic, String filter, EventHandler eventHandler,
            boolean headless);
 
    public boolean unsubscribe(EventHandler eventHandler);
}
