package com.hunwardsen.maven;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
		
	InputStream propertyFileInputStream;
	Properties properties;
	
	public PropertyReader(String propertyFile) throws IOException {
		// Retrieve resource
		propertyFileInputStream = getClass().getResourceAsStream(propertyFile);
		
		properties = new Properties();
		properties.load(propertyFileInputStream);	
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
