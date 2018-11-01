package automationPackage;

import org.testng.annotations.Test;

import java.io.File;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import org.apache.commons.io.FileUtils;


public class TestNG{
	
	public static WebDriver driver;
	public static DesiredCapabilities capability ;

	static{
		//DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		//capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		System.setProperty("webdriver.ie.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\IEDriverServer.exe");	
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
//		DesiredCapabilities capability = DesiredCapabilities.chrome();
//		capability.setCapability("download.default_directory","C:\\Users\\IBM_ADMIN\\Desktop\\A");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\chromedriver.exe");	
		//System.setProperty("webdriver.ie.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\IEDriverServer.exe");
	}

	@Test
	public void testCase2() throws Exception{
		
		 driver = new InternetExplorerDriver();
		 driver.get("http://www.google.com/");
		 System.out.println(driver.getTitle());
		 //driver.close();
		//driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"t");
		//Assert.assertEquals(true,true);
//		
//		driver.manage().window().maximize();
//		driver.findElement(By.id("lst-ib")).sendKeys("lara");
//		driver.findElement(By.name("btnK")).click();
		
	}
	
/*
	@Test
	public void testCase2() throws Exception {
		
		int i=0;
		while(i==0){
			driver.navigate().to("https://www.google.com/");
			//driver.get("https://www.google.com/");
			driver.findElement(By.id("lst-ib")).sendKeys("lara");
			driver.findElement(By.name("btnK")).click();
			System.out.println("This is the Test Case 2");
			Thread.sleep(10000);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);;
	        //driver.close();
		}
	}   */

//	@BeforeMethod
//
//	public void beforeMethod() {
//
//		System.out.println("This will execute before every Method");
//
//	}
//
//	@AfterMethod
//
//	public void afterMethod() {
//
//		System.out.println("This will execute after every Method");
//
//	}
//
//	@BeforeClass
//
//	public void beforeClass() {
//
//		System.out.println("This will execute before the Class");
//
//	}
//
//	@AfterClass
//
//	public void afterClass() {
//
//		System.out.println("This will execute after the Class");
//
//	}
//
//	@BeforeTest
//
//	public void beforeTest() {
//
//		System.out.println("This will execute before the Test");
//
//	}
//
//	@AfterTest
//
//	public void afterTest() {
//
//		System.out.println("This will execute after the Test");
//
//	}
//
//	@BeforeSuite
//
//	public void beforeSuite() {
//
//		System.out.println("This will execute before the Test Suite");
//
//	}
//
//	@AfterSuite
//
//	public void afterSuite() {
//
//		System.out.println("This will execute after the Test Suite");
//
//	}	
}
