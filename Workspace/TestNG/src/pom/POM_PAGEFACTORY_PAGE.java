package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_PAGEFACTORY_PAGE extends TestBase{

	// PageFactory -OR

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;

	public POM_PAGEFACTORY_PAGE(){
		  PageFactory.initElements(driver,this);
	}
	
	//Actions:
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void login(String argUserName,String argPassword){
		try {
			driver.get("https://www.freecrm.com/index.html");
			username.sendKeys(argUserName);
			password.sendKeys(argPassword);
			Thread.sleep(2000);
			loginBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
