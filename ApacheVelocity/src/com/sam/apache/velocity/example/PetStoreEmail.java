package com.sam.apache.velocity.example;
import java.io.StringWriter;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class PetStoreEmail
{
    public static void main( String[] args )
        throws Exception
    {
        /*
         *   first, get and initialize an engine
         */

        VelocityEngine ve = new VelocityEngine();
        ve.init();

        /*
         *   organize our data 
         */

        ArrayList list = new ArrayList();
        Map map = new HashMap();

        map.put("name", "horse");
        map.put("price", "$100.00");
        list.add( map );
 
        map = new HashMap();
        map.put("name", "dog");
        map.put("price", "$59.99");
        list.add( map );

        map = new HashMap();
        map.put("name", "bear");
        map.put("price", "$3.99");
        list.add( map );

        /*
         *  add that list to a VelocityContext
         */

        VelocityContext context = new VelocityContext();
        context.put("petList", list);

        /*
         *   get the Template  
         */

        Template t = ve.getTemplate("templates/petstoreemail_html.vm");

        /*
         *  now render the template into a Writer, here 
         *  a StringWriter 
         */

        StringWriter writer = new StringWriter();

        t.merge( context, writer );

        /*
         *  use the output in the body of your emails
         */

        System.out.println( writer.toString() );
        
        //PLAIN
        

        Template t1 = ve.getTemplate("templates/petstoreemail_plain.vm");

        /*
         *  now render the template into a Writer, here 
         *  a StringWriter 
         */

        StringWriter writer1 = new StringWriter();

        t1.merge( context, writer1 );

        /*
         *  use the output in the body of your emails
         */

        System.out.println( writer1.toString() );
    }
}

