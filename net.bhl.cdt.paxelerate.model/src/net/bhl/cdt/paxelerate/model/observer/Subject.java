/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.observer;

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
