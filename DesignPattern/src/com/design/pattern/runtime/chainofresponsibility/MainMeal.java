package com.design.pattern.runtime.chainofresponsibility;

import com.design.pattern.runtime.chainofresponsibility.StuffToEat.COURSE;

public class MainMeal implements ChainOfRespon {

	private ChainOfRespon secondGuy;

	public MainMeal(ChainOfRespon secondGuy) {
		super();
		this.secondGuy = secondGuy;
	}

	@Override
	public void doStuff(StuffToEat stuff) {

		if (COURSE.MAIN_MEAL == stuff.getCourse()) {

			System.out.println("We are eatign MAIn meal " + stuff.getCourse());
		} else {
			secondGuy.doStuff(stuff);
		}

	}

	public ChainOfRespon getSecondGuy() {
		return secondGuy;
	}

	public void setSecondGuy(ChainOfRespon secondGuy) {
		this.secondGuy = secondGuy;
	}

}
