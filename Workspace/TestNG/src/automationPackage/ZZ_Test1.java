package automationPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class ZZ_Test1 {

	@Test
	public void tcTest1() throws SikuliException, InterruptedException {
//		ChromeOptions options=new ChromeOptions();
//		Map<String, Object> prefs=new HashMap<String,Object>();
//		prefs.put("profile.default_content_setting_values.notifications",1);
//		//1-Allow, 2-Block, 0-default
//		options.setExperimentalOption("prefs",prefs);  
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/flash-testing.html");
//
//		//driver.get("https://www.punjabkesari.in/");
//		driver.manage().window().maximize();
//		
		Screen objectScreen = new Screen();
		Pattern pImage = new Pattern("\\src\\AllowFlash.JPG");
		objectScreen.wait(pImage, 10000);
		objectScreen.click();
		pImage = new Pattern("\\src\\Allow.JPG");
		objectScreen.wait(pImage, 10000);
		objectScreen.click();
		pImage = new Pattern("\\src\\Type.JPG");
		objectScreen.wait(pImage, 10000);
		//objectScreen.click();
		objectScreen.type(pImage,"gaurav..");
//		FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "myFlashMovie");		
//	  	// Pass the URL of video		
//		//driver.get("http://demo.guru99.com/test/flash-testing.html");			
//		Thread.sleep(5000);		
//	  	flashApp.callFlashObject("Play");			
//	  	Thread.sleep(5000);		
//		flashApp.callFlashObject("StopPlay");			
//		Thread.sleep(5000);		
//		flashApp.callFlashObject("SetVariable","/:message","Flash testing using selenium Webdriver");
//	    System.out.println(flashApp.callFlashObject("GetVariable","/:message"));
	}
}
