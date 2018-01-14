package com.Utilties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadSystemProperties {
	
	Properties property = new Properties();
	
	public ReadSystemProperties(String filelocation){
		try {
			File f = new File(filelocation);
			FileInputStream fs = new FileInputStream(f);
			property.load(fs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getPropertyValue(String key){
		return property.getProperty(key);
	}
}
