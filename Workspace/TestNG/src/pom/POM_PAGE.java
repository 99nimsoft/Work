package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_PAGE  extends TestBase{

	private static WebElement element = null;

	public static WebElement username(WebDriver driver) {

		element = driver.findElement(By.name("username"));

		return element;

	}

	public static WebElement password(WebDriver driver) {

		element = driver.findElement(By.name("password"));

		return element;

	}
	
	public static WebElement loginBtn(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@type='submit']"));

		return element;

	}
	
	public void login(String argUserName,String argPassword){
		try {
			driver.get("https://www.freecrm.com/index.html");
			username(driver).sendKeys(argUserName);
			password(driver).sendKeys(argPassword);
			Thread.sleep(2000);
			loginBtn((driver)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
