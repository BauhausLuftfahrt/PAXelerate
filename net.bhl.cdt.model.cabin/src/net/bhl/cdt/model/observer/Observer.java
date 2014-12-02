package net.bhl.cdt.model.observer;




public abstract class Observer {

	Subject observedSubject;

	public abstract void update(int i);
}
