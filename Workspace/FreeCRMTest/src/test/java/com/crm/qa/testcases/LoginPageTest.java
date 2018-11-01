package com.crm.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	Logger log = Logger.getLogger(LoginPageTest.class);
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		log.info("IIIIINNNNNNNNNNNFFFFFFFFFFFOOOOOOOOOOOO");
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.getTitle();
		log.warn("WWWAAAAAAAAAAARRRRRRRRRRRRNNNNNNNNN"+title);
		log.error("EEEEEERRRRRRRRRRROOOORRRRRRRRRR"+title);
		log.fatal("FFFAAAAAATTTTTTTTTAAAAAAALLLLLLLL"+title);
		Assert.assertEquals(title,"#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test(priority=2)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//Assert.assertEquals(arg0, arg1);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
