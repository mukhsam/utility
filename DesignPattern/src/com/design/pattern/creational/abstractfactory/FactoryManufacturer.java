package com.design.pattern.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class FactoryManufacturer {

	public static enum ProductFactoryType {

		IPAD2, MP3

	}

	private static Map<ProductFactoryType, ProductFactory> REGISTRY = new HashMap<ProductFactoryType, ProductFactory>();

	public static synchronized ProductFactory getProductFactory(
			final ProductFactoryType type) {

		ProductFactory factory = null;

		if (!REGISTRY.containsKey(type)) {

			switch (type) {

			case IPAD2:

				factory = new Ipad2Factory();
				break;

			case MP3:

				factory = new Mp3PlayerFactory();
				break;

			}

			REGISTRY.put(type, factory);

		} else {
			factory = REGISTRY.get(type);
		}

		return factory;

	}

}
