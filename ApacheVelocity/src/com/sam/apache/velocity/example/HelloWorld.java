package com.sam.apache.velocity.example;
import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

/**
 *  Simple program to demonstrate the basic 
 *  technique of rendering a Velocity template
 */
public class HelloWorld
{
	
	public class Pet{
		private String price;
		
		public Pet(String price, String name) {
			super();
			this.price = price;
			this.name = name;
		}

		private String name;

		public String getPrice() {
			return price;
		}
 
		public String getName() {
			return name;
		}
 
	}
    public static void main( String[] args )
        throws Exception
    {
        /*
         *  first, get and initialize a Velocity engine
         */

        VelocityEngine ve = new VelocityEngine();
        ve.init();
        
        Template t1 = ve.getTemplate( "templates/classgenerator.vm" );
        
        VelocityContext context = new VelocityContext();

        context.put("className", "ImplementedClass");
        
        context.put("abstractClassName", "AbstractClass");
        
        

        /*
         *  next, get the Template  
         */

        //Template t = ve.getTemplate( "templates/helloworld.vm" );
        
        //classgenerator.vm

        /*
         *  create a context and add data  
         */

//        VelocityContext context = new VelocityContext();
//
//        context.put("firstnam", "SammyBoy");
//        
//        context.put("lastname", "Mukherjee");
//        
////        List<String> petList = new ArrayList<String>();
////        petList.add("Dog");
////        petList.add("Cat");
////        petList.add("Horse");
//        HelloWorld hw= new HelloWorld();
//        List<Pet> petList = new ArrayList<Pet>();
//        petList.add(hw.new Pet("Dog","10"));
//        petList.add(hw.new Pet("Cat","20"));
//        petList.add(hw.new Pet("Horse","30"));
//        
//
//        context.put("petList", petList);

        /* 
         *  now render the template into a StringWriter 
         */

        StringWriter writer = new StringWriter();

        t1.merge( context, writer );

        /* 
         *  show the world 
         */

        System.out.println( writer.toString() );     
    }
}
