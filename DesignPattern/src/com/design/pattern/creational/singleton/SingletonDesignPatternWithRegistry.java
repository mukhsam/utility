package com.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonDesignPatternWithRegistry {
	
	private SingletonDesignPatternWithRegistry(){}
	
 	
	private static Map <String,Object> mapRegistry = new HashMap <String, Object>();
	
	@SuppressWarnings("unchecked")
	public synchronized static <T> T getInstance (final Class <T> clazz) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		T returnVal;
		
		if (!mapRegistry.containsKey(clazz.getName())){
			
			mapRegistry.put(clazz.getName(),Class.forName(clazz.getName()).newInstance());
			returnVal= (T) mapRegistry.get(clazz.getName());
		}
		
		else {
			
			returnVal= (T) mapRegistry.get(clazz.getName());
		}
		return returnVal;
  	}
	
	 

}
