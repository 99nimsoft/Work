package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	// PageFactory -OR
	
	@FindBy(name="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;

	//Initilizing the page objects
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}
	
	//Actions:
	public String getTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String argUserName,String argPassword){
		try {
			username.sendKeys(argUserName);
			password.sendKeys(argPassword);
			
			//
			//new TestUtil().waitForElement(loginBtn);
			//new TestUtil().clickUsingAction(loginBtn);
			Thread.sleep(2000);
			//
			loginBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new HomePage();
	}
}
