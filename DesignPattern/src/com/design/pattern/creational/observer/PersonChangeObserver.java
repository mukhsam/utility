package com.design.pattern.creational.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PersonChangeObserver implements PropertyChangeListener{

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		
		System.out.println("PropertyChanged : "+event.getPropertyName()+" from "+event.getOldValue()+" to > "+event.getNewValue());
		
	}

}
