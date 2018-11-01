package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase {

	public static WebDriver driver ;
	public static Properties prop;
	public static String projPath = System.getProperty("user.dir");
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListner;
	
	/*
	 *  Reading config.properties file
	 */
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream(projPath+"/src/main/java/com/crm/qa/config/config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}	
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(browserName.equals("ie")){
			System.setProperty("webdriver.ie.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventListner = new WebEventListener();
		e_driver.register(eventListner);
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout,TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	

}
















