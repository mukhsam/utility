package com.design.pattern.creational.abstractfactory;

public class ProductFactory {
	
	public Product createProduct(){
		return new Product() {
		};
	}

}
