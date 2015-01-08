package net.bhl.cdt.model.observer;

/**
 * TODO: Description
 */
import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * TODO: Description
	 */
	public Subject() {

	}
	
	/**
	 * TODO: Description
	 */
	public void subscribe(Observer o)
	{
		this.observers.add(o);
		o.observedSubject = this;
	}
	
	/**
	 * TODO: Description
	 */
	public void unsubscribe(Observer o)
	{
		this.observers.remove(o);
	}

	/**
	 * TODO: Description
	 */
	public void notifyObservers(int i){
		for (Observer o : observers) {
			o.update(i);
		}
	}
}
