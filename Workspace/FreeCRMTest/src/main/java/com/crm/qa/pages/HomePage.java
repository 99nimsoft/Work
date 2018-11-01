package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'Naveen')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	//Initializing PageObjects
	AjaxElementLocatorFactory fact = new AjaxElementLocatorFactory(driver, 100);
	public HomePage(){
		PageFactory.initElements(fact,this);
	}

	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		
		return new ContactsPage();
	}
	
	public boolean verifyUserName(){
		return userNameLabel.isDisplayed();
	}
//	public DealsPage clickOnDealsLink(){
//		dealsLink.click();	
//		return new DealsPage();
//	}
}
