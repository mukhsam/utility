package com.design.pattern.structural.adapter;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdapterTest {
	private Adapter target;
	
	@Before
	public void setUp(){
		this.target = new Adapter();
	}
	
	@After
	public void destry(){
		target = null;
	}
	
	@Test
	public void testProductName(){
		final String result = this.target.getproductName();
		
		Assert.assertNotNull(result);
		Assert.assertEquals("please call me sapleName", result);
	}

}
