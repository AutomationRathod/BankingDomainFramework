package com.inetbanking.testdata.qa;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utility.qa.ReadConfig;


public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	
	
	public String baseURL = readConfig.getApplicationURL();
	public String username = readConfig.getUsename();
	public String password = readConfig.getPassword();
	public WebDriver driver;
	public static Logger logger ;
	
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
		driver = new ChromeDriver();
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
	

}
