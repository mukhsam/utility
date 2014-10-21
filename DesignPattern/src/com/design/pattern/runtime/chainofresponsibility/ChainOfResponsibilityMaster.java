package com.design.pattern.runtime.chainofresponsibility;

import com.design.pattern.runtime.chainofresponsibility.StuffToEat.COURSE;

public class ChainOfResponsibilityMaster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StuffToEat stuff = new StuffToEat();
		stuff.setCourse(COURSE.MAIN_MEAL);
		
		ChainOfRespon chain  = new MainMeal(new DessertCourse());
		chain.doStuff(stuff);

	}

}
