package com.design.pattern.creational.prototype;


public class FactoryManufacturer {
 
	public static synchronized ProductFactory getProductFactory(
			final int type) {

		ProductFactory factory = null;

		 
			switch (type) {

			case 0:

				factory = new Ipad2Factory(new Ipad2());
				break;

			

			}
 
		return factory;

	}
	
	public static void main (String[] args){
		System.err.println(getProductFactory(0).createProduct());
	}

}
