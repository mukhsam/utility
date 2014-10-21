package com.design.pattern.creational.factory;

import junit.framework.Assert;

import org.junit.Test;

import com.design.pattern.creational.factory.Product.ProductType;

public class GenericFactoryPatternTest {
	
	@Test
	public void testCreateProductInstanceForElectronics(){
		
		final Product productInstance = GenericFactoryPattern.createProductInstance(ProductType.ELECTRONICS);
		
		Assert.assertNotNull(productInstance);
		Assert.assertTrue(productInstance instanceof Electronics); 
		Assert.assertTrue(productInstance instanceof Product);
		 
	}
	
	@Test
	public void testCreateProductInstanceForMusic(){
		
		final Product productInstance = GenericFactoryPattern.createProductInstance(ProductType.MUSICPLAYERS);
		
		Assert.assertNotNull(productInstance);
		Assert.assertFalse(productInstance instanceof Electronics);
		Assert.assertTrue(productInstance instanceof MusicPlayers);
		Assert.assertTrue(productInstance instanceof Product);
		
		 
	} 

}


