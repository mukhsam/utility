package com.design.pattern.creational.singleton;

import junit.framework.Assert;

import org.junit.Test;

import com.design.pattern.creational.singleton.SingletonDesignPatternWithRegistry;

public class SingletonDesignPatternWithRegistryTest {

	abstract class ABCAbstract {

	}

	interface ABCInterface {

	}

	@interface ABCAnnotation {

	}

	@Test
	public void testgetInstance() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		final SingletonDesignPatternWithRegistry instance = SingletonDesignPatternWithRegistry
				.getInstance(SingletonDesignPatternWithRegistry.class);
		final SingletonDesignPatternWithRegistry instance1 = SingletonDesignPatternWithRegistry
				.getInstance(SingletonDesignPatternWithRegistry.class);
		final SingletonDesignPatternWithRegistry instance2 = SingletonDesignPatternWithRegistry
				.getInstance(SingletonDesignPatternWithRegistry.class);

		Assert.assertTrue(instance == instance1 && instance1 == instance2
				&& instance == instance1);

	}

	@Test(expected = InstantiationException.class)
	public void testgetInstanceofAbstractClass() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		SingletonDesignPatternWithRegistry.getInstance(ABCAbstract.class);

	}

	@Test(expected = InstantiationException.class)
	public void testgetInstanceofInterface() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		SingletonDesignPatternWithRegistry.getInstance(ABCInterface.class);

	}

	@Test(expected = InstantiationException.class)
	public void testgetInstanceofAnnotation() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		SingletonDesignPatternWithRegistry.getInstance(ABCAnnotation.class);

	}

}
