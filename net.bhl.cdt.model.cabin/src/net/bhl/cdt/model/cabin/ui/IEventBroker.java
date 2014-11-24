package net.bhl.cdt.model.cabin.ui;

import java.beans.EventHandler;

public interface IEventBroker {
    public String DATA = "org.eclipse.e4.data"; //$NON-NLS-1$
 
    public boolean send(String topic, Object data);
    public boolean post(String topic, Object data);
 
    public boolean subscribe(String topic, EventHandler eventHandler);
 
    public boolean subscribe(String topic, String filter, EventHandler eventHandler,
            boolean headless);
 
    public boolean unsubscribe(EventHandler eventHandler);
}