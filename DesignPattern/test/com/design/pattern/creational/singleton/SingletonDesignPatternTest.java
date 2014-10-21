package com.design.pattern.creational.singleton;

import junit.framework.Assert;

import org.junit.Test;

import com.design.pattern.creational.singleton.SingletonDesignPattern;

public class SingletonDesignPatternTest {

	@Test
	public void testgetInstance() {
		final SingletonDesignPattern instance = SingletonDesignPattern
				.getInstance();
		final SingletonDesignPattern instance1 = SingletonDesignPattern
				.getInstance();
		final SingletonDesignPattern instance2 = SingletonDesignPattern
				.getInstance();

		Assert.assertTrue(instance == instance1 && instance1 == instance2
				&& instance == instance1);

	}

}
