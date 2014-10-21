package com.design.pattern.creational.observer;

public class ObserverObservable {
	
	public static void main (String args []){
		Person person = new Person ("Sam", "Mukherjee");
		person.setListen(new PersonChangeObserver());
		person.setFirstName("Ma ma mia");
	}

}
