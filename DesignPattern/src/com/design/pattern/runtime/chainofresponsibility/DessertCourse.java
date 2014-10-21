package com.design.pattern.runtime.chainofresponsibility;

public class DessertCourse implements ChainOfRespon {

	@Override
	public void doStuff(StuffToEat stuff) {
		 
		System.out.println("We are eatign desert " +stuff.getCourse());
	}

}
