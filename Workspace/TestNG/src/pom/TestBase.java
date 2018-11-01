package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver ;
	
	public static void initialization(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
}
