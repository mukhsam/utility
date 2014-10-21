package com.design.pattern.runtime.chainofresponsibility;

public class StuffToEat {
	
	private COURSE course;
	
	public static enum COURSE{
		MAIN_MEAL,DESSERT
	}

	public COURSE getCourse() {
		return course;
	}

	public void setCourse(COURSE course) {
		this.course = course;
	}

}
