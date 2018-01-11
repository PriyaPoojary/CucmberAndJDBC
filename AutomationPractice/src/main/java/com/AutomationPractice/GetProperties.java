package com.AutomationPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
	
	
	public  String getValue(String property) {
		FileInputStream file;
		try {
			file = new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/main/resources/TestData/config.properties"));
			Properties prop = new Properties();
			try {
				prop.load(file);
				return prop.getProperty(property);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
