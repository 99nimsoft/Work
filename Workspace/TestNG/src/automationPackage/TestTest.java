package automationPackage;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTest {

	public WebDriver driver= null;

  @Test
  public void testCase2() throws Exception{  
//	  System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\chromedriver.exe");
//	  WebDriver driver = new ChromeDriver();
	  driver=DriverFactory.getInstance().getDriver();
//	  System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
//	  driver.get("https://www.google.com");
//	  driver.findElement(By.id("lst-ib")).sendKeys("lara");
//	  driver.findElement(By.name("btnK")).click();
	  
	  //driver.close();
	  
	  	driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/autoit.html");			
	    driver.findElement(By.xpath("//*[.='Create an Article']")).click();			

//	    driver.findElement(By.id("input_3")).sendKeys("Gaurav");                                 					
//	    driver.findElement(By.id("id_4")).sendKeys("test.test@gmail.com");					
//	    driver.findElement(By.id("input_4")).click();			
	    // below line execute the AutoIT script .
//	    Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\upload.exe");		
//	    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
//	    driver.findElement(By.id("input_2")).click();
	    
  }
  
  @Test(enabled=false)
  public void testCase1(){
//	  System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\chromedriver.exe");
//	  WebDriver driver = new ChromeDriver();
	  driver=DriverFactory.getInstance().getDriver();
	  System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
	  driver.get("https://www.google.com");
	  driver.findElement(By.id("lst-ib")).sendKeys("sachin");
	  driver.findElement(By.name("btnK")).click();
	  //driver.close();
  }
}
