package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		String path="C:\\Users\\Advantal\\eclipse-workspace\\Nec\\Config\\ConfigProperties";
		FileInputStream fis=new FileInputStream(path);
		pro=new Properties();   // created constructor & then can call in base class
		pro.load(fis);
	}
	public String BaseUrl_QA1() {
	return	pro.getProperty("BaseUrl_QA1");
		
	}

}
