package com.design.pattern.creational.prototype;

public class Product {
	
	public String printProductName (){
		final String returnString = "This is a generic product";
		System.out.println(returnString);
		return returnString;
	}
	

	public Product clone(){
		return new Product( );
	}

}
