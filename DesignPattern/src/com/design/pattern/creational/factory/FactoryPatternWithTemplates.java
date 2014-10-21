package com.design.pattern.creational.factory;

import com.design.pattern.creational.factory.Product.ProductType;

public class FactoryPatternWithTemplates <T extends Product> {
	
	
	
	@SuppressWarnings("unchecked")
	public T createProductInstance (final ProductType productType){
		
		T instance = null;
		 
		if (null != productType){
			
			switchStatement :switch (productType){
				
				case ELECTRONICS:
					
					instance = (T) new Electronics();
					
					break switchStatement;
					
				case MUSICPLAYERS:
					
					instance = (T) new MusicPlayers();
					
					break switchStatement; 
				
			
			}
			
		}  
		return instance;
	}

}
