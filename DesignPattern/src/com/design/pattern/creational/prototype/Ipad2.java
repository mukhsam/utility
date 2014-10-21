package com.design.pattern.creational.prototype;
 

public class Ipad2 extends Product {
	
	public Ipad2() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Product product;
	
	public Ipad2(final Product product) {
		 this.product = product;
	}

	public String printProductName (){ 
		final String returnString = "This is a new Ipad product.It is awesome";
		System.out.println(returnString);
		return returnString;
	}
	
	public Product clone(){
		return new Ipad2(this);
	}

}
