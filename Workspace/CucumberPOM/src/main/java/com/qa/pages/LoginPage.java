package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.pages.HomePage;
import com.qa.util.TestBase;

public class LoginPage extends TestBase{

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
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",loginBtn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new HomePage();
	}
}
