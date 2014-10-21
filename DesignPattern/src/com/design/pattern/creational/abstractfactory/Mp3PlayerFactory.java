package com.design.pattern.creational.abstractfactory;

public class Mp3PlayerFactory extends ProductFactory {
	
	public Product createProduct(){
		return new Mp3Player();
	}

}
