package com.design.pattern.creational.factory;
 

/**
 * Also known as Virtual Constructor
 * 
 * @author SamMukherjee
 *
 */
public class GenericFactoryPattern {  
	 
	public static Product createProductInstance (final Product.ProductType productType){
		
		Product instance = 	null;
		
		if (null != productType){
			
			switchStatement :switch (productType){
				
				case ELECTRONICS:
					
					instance = new Electronics();
					
					break switchStatement;
					
				case MUSICPLAYERS:
					
					instance = new MusicPlayers();
					
					break switchStatement; 
				
			
			}
			
		}  
		
		return instance;
	}

}
