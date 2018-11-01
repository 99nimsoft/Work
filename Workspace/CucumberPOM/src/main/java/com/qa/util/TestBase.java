package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.util.TestUtil;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static String projPath = System.getProperty("user.dir");
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream(projPath+"/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
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
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout,TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
