package com.design.pattern.creational.abstractfactory;

public class Ipad2Factory extends ProductFactory {
	
	public Product createProduct(){
		return new Ipad2();
	}

}
