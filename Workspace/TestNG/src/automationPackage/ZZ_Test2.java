package automationPackage;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ZZ_Test2 {

//	@Test
//    public void tcTest1() throws MalformedURLException{
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:25877/wd/hub"),dc);
//		driver.get("http://www.Freecrm.com/");
//		System.out.println(driver.getTitle());
//	}
//	
//	@Test
//    public void tcTest2() throws MalformedURLException{
//		DesiredCapabilities dc = DesiredCapabilities.firefox();
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:25877/wd/hub"),dc);
//		driver.get("http://www.kiet.edu/");
//		System.out.println(driver.getTitle());
//	}
	
	@Test
    public void tcTest3() throws MalformedURLException, Exception{
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:41522/wd/hub"),dc);
		driver.get("http://www.google.com/");	
		System.out.println(driver.getTitle());
		//Thread.sleep(60000);
		driver.close();
	}
	@Test
    public void tcTest4() throws MalformedURLException{
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:41522/wd/hub"),dc);
		driver.get("http://www.Freecrm.com/");	
		System.out.println(driver.getTitle());
		driver.close();
	}
	@Test
    public void tcTest5() throws MalformedURLException, Exception{
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:41522/wd/hub"),dc);
		driver.get("http://www.google.com/");	
		System.out.println(driver.getTitle());
		//Thread.sleep(60000);
		driver.close();
	}
	@Test
    public void tcTest6() throws MalformedURLException{
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:41522/wd/hub"),dc);
		driver.get("http://www.Freecrm.com/");	
		System.out.println(driver.getTitle());
		driver.close();
	}
}





















