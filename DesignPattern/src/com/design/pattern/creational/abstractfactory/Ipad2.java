package com.design.pattern.creational.abstractfactory;
 

public class Ipad2 extends Product {
	
	public String printProductName (){ 
		final String returnString = "This is a new Ipad product.It is awesome";
		System.out.println(returnString);
		return returnString;
	}

}
