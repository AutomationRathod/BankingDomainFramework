package com.inetbanking.utility.qa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	
	String propPath = "./configuration/config.properties";
	public static Properties prop;
	
	public ReadConfig() {
		
		File src = new File(propPath);
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			System.out.println("Exception is " +e.getMessage());
			e.printStackTrace();
		}		
		
	}
	
	public String getApplicationURL() {
		
		String url = prop.getProperty("baseURL");
		return url;
	}
	
	public String getUsename() {
		
		String userName = prop.getProperty("username");
		return userName;
	}
	
	public String getPassword() {
		
		String pass = prop.getProperty("password");
		return pass;
	}
	
	public String getChromePath() {
		
		String chromePath = prop.getProperty("chromeBrowser");
		return chromePath;
	}
	public String getFirefoxPath() {
		
		String firefoxPath = prop.getProperty("firefoxBrowser");
		return firefoxPath;
	}
	
	
	
	
}
