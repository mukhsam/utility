package com.design.pattern.creational.abstractfactory;

import junit.framework.Assert;

import org.junit.Test;

import com.design.pattern.creational.abstractfactory.FactoryManufacturer.ProductFactoryType;

public class FactoryManufacturerTest {
	
	@Test
	public void testGetProductFactoryWithIpad2Factory(){
		
		final ProductFactory productFactory = 
			FactoryManufacturer.getProductFactory(ProductFactoryType.IPAD2);
		final ProductFactory productFactory1 = 
			FactoryManufacturer.getProductFactory(ProductFactoryType.IPAD2);
		final ProductFactory productFactory2 = 
			FactoryManufacturer.getProductFactory(ProductFactoryType.IPAD2);
	
		
		Assert.assertNotNull(productFactory);
		Assert.assertTrue(productFactory instanceof Ipad2Factory);
		Assert.assertEquals("This is a new Ipad product.It is awesome"
				,productFactory.createProduct().printProductName());
		 
		Assert.assertTrue((productFactory == productFactory1) && (productFactory1 == productFactory2));
	 	}
	
	@Test
	public void testGetProductFactoryWithMP3Factory(){
		
		final ProductFactory productFactory = 
			FactoryManufacturer.getProductFactory(ProductFactoryType.MP3);
		final ProductFactory productFactory1 = 
			FactoryManufacturer.getProductFactory(ProductFactoryType.MP3); 
		final ProductFactory productFactory2 = 
			FactoryManufacturer.getProductFactory(ProductFactoryType.MP3);
	
		
		Assert.assertNotNull(productFactory);
		Assert.assertTrue(productFactory instanceof Mp3PlayerFactory);
		Assert.assertEquals("This is a new mp3- ipod nano product.It is awesome"
				,productFactory.createProduct().printProductName());
		

		Assert.assertTrue((productFactory == productFactory1) && (productFactory1 == productFactory2));
	 
	}

}
