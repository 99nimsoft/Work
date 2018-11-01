package stepDefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {


	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM(){
	    String title = driver.getTitle();
	    Assert.assertEquals(title,"#1 Free CRM software in the cloud for sales and service");
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
	    driver.findElement(By.name("username")).sendKeys("naveenk");
	    driver.findElement(By.name("password")).sendKeys("test@123");	    
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button(){
		WebElement ele = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
	}
	
	@And("^close the browser$")
	public void close_the_browser(){
		driver.close();
	}
	
	@Given("^Run Smoke$")
	public void run_Smoke(){
	    System.out.println("Running part of smoke");
	}

	@Given("^Run Regression$")
	public void run_Regression(){
		System.out.println("Running part of regression");
	}
	@Before
	public void before(){
		System.out.println("*******************This is hook with before tag****************************");
	}
	@Given("^Statement background$")
	public void Statement_background(){
		System.out.println("~~~~~~~~~~~~Background running~~~~~~~~~~~~~~~");
	}
}



































