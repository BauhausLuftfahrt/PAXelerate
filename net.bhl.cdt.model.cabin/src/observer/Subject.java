package observer;


import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public Subject() {

	}
	
	public void subscribe(Observer o)
	{
		this.observers.add(o);
		o.observedSubject = this;
	}
	
	public void unsubscribe(Observer o)
	{
		this.observers.remove(o);
	}

	
	public void notifyObservers(int i){
		for (Observer o : observers) {
			o.update(i);
		}
	}
}
