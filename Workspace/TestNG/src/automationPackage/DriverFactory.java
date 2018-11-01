package automationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory
{

   private DriverFactory()
   {
      //Do-nothing..Do not allow to initialize this class from outside
   }
   private static DriverFactory instance = new DriverFactory();

   public static DriverFactory getInstance()
   {
      return instance;
   }

   ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
   {
      @Override
      protected WebDriver initialValue()
      {
    	  int count=0;
    	  if(driver==null){
    		  System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\chromedriver.exe");
    		  
    		  return new ChromeDriver();
    	  }
    	  else{
    		  while(driver != null && count < 6){
        		  try {
    				Thread.sleep(10000);
    				count++;
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        		  
        	  } 
    		  return null;
    	  }
		  
      }
   };

   public WebDriver getDriver() // call this method to get the driver object and launch the browser
   {
      return driver.get();
   }

   public void removeDriver() // Quits the driver and closes the browser
   {
      driver.get().quit();
      driver.remove();
   }
}