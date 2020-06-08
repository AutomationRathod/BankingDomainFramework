package com.inetbanking.testdata.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.qa.LoginPage;



public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginPageTest() {
		
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.setUserName(username);
		logger.info("Entered username");
		loginPage.setPassword(password);
		logger.info("Entered password");
		
		loginPage.clickSubmit();
		logger.info("Succssfull Login");
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Test is passed");
		}else {
			Assert.assertTrue(false);
			logger.info("Test is failed");
		}
		
	}
	
	

}
