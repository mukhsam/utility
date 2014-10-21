package com.design.pattern.structural.adapter;

/**
 * Convert the interface of a class into another interface clients expect. Adapter lets classes work
 * together that could not otherwise because of incompatible interfaces.
 * @author SamMukherjee
 *
 */
public class Adapter implements Product{
	
	private Adaptee adaptee = new AdapteeImpl();

	@Override
	public String getproductName() { 
		return adaptee.adoptMe()+ " sapleName";
	}

}
