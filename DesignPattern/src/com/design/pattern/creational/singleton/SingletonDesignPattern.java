package com.design.pattern.creational.singleton;

/**
 * Constructor is private so that no class cannot instanciate it and have two instances of the same object.
 * 
 * @author SamMukherjee
 *
 */

public class SingletonDesignPattern {
	
	private SingletonDesignPattern(){}
	
	
	private static SingletonDesignPattern INSTANCE;
	
	
	
	public synchronized static SingletonDesignPattern getInstance(){
		
		if (null == INSTANCE){
		
			INSTANCE = new SingletonDesignPattern();
		}
		
		return INSTANCE;
	}
	
 

}
