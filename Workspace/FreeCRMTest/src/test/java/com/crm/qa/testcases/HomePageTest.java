package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;


public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
/*
 * Ques: Why we are launching browser doing test and closing it again here. like here @before method will launch browser, @test will perform test and in @AfterMethod
 *       will close browser. Again for second @Test @beforeMethod will be called which will again launch browser, @test will perform test and in @AfterMethod close browser.
 *       
 * Answer: This is a good practise to make each and every test independent. Suppose we are doing tests in same browser then there are chnace that due to cookies, caches 
 *         System resources will get consumed and there are chnaces of browser hanging , crashing etc. So we write each test case independent and if u see here
 *         in initialization method we have written steps to handle clear cookies,waits etc.
 */
	
	//creating this constructor to call constructor present in class TestBase.java which loads property file.
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Test(priority=1,dataProvider="getData")
	public void verifyHomePageTitleTest(String $arg1,String $arg2,String $arg3,String $arg4){
		String title=homePage.verifyHomePageTitle();
		Assert.assertEquals(title,"CRMPRO");	
		System.out.println($arg1+"%"+$arg2+"%"+$arg3+"%"+$arg4);
	}
	
	@DataProvider
	public Object[][] getData(){
		return testUtil.getTestData(TestUtil.TestData_Sheet_Path);
	}
	
//	@Test(priority=2)
//	public void verifyUserName(){
//		testUtil = new TestUtil();
//		testUtil.switchToFrame();
//		Assert.assertTrue(homePage.verifyUserName());
//	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
