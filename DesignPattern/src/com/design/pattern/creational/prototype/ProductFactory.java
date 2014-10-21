package com.design.pattern.creational.prototype;

public class ProductFactory {
	
	public Product createProduct(){
		return new Product() {
		};
	}

}
