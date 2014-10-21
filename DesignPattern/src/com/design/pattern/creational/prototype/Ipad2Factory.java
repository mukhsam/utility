package com.design.pattern.creational.prototype;

public class Ipad2Factory extends ProductFactory {
	
	private Product product;
	
	public Ipad2Factory (final Product product){
		this.product = product;
	}
	
	public Product createProduct(){
		
		return this.product.clone();
		 
	}
	 

}
