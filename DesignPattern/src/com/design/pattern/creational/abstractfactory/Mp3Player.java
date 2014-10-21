package com.design.pattern.creational.abstractfactory;
 
public class Mp3Player extends Product {
	
	public String printProductName (){ 
		final String returnString = "This is a new mp3- ipod nano product.It is awesome";
		System.out.println(returnString);
		return returnString;
	}


}
