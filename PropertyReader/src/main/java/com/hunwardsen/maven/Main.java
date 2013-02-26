package com.hunwardsen.maven;

import java.io.IOException;

public class Main 
{
    public static void main(String[] args)
    {
    	PropertyReader propertyReader = null;
    	
    	try {
    		propertyReader = new PropertyReader("/META-INF/application.properties");
		} catch (IOException e) {
			System.out.println("Property File Not Found! \n" + e.getMessage());
		}  
    	
        System.out.println("Sample Property: " + propertyReader.getProperty("sampleProp"));
        System.out.println("Message 0: " + propertyReader.getProperty("message0"));
        System.out.println();
        System.out.println("Key with spaces: " + propertyReader.getProperty("key with spaces"));
        System.out.println();
        System.out.println("Unicode: " + propertyReader.getProperty("unicode"));    
        System.out.println();
        System.out.println("Keys : " + propertyReader.getProperty("key1") + ","
						        	 + propertyReader.getProperty("key2") + "," 
						        	 + propertyReader.getProperty("key3") + "," 
						        	 + propertyReader.getProperty("key4"));
        System.out.println();
        System.out.println("Application Name: " + propertyReader.getProperty("application.name"));
        System.out.println("Application Version: " + propertyReader.getProperty("application.version"));
        System.out.println("Java Version: " + propertyReader.getProperty("java.version"));
        System.out.println("User Home: " + propertyReader.getProperty("user.home"));
        System.out.println("System Property Direct: " + System.getProperty("sys.prop"));  
        System.out.println("System Property Indirect: " + propertyReader.getProperty("app.sys.prop"));   
        System.out.println();
        System.out.println("Message 1: " + propertyReader.getProperty("message1"));
        System.out.println("Message 2: " + propertyReader.getProperty("message2"));
    }
}

