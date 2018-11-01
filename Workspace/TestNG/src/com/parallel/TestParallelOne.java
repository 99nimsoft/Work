package com.parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestParallelOne {

	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\GAURAV\\Z_Drivers\\chromedriver.exe");
	}
	WebDriver driver = new ChromeDriver();

	@Test
	public void testCaseOne() {
		// Printing Id of the thread on using which test method got executed
		System.out.println("Test Case One with Thread Id:- " + Thread.currentThread().getId());
		driver.get("https://www.google.com/");
		driver.close();
//		int i=0;
//		while(i==0){
//			driver.navigate().to("https://www.google.com/");
//			//driver.get("https://www.google.com/");
//			driver.findElement(By.id("lst-ib")).sendKeys("sachin");
//			driver.findElement(By.name("btnK")).click();
//			System.out.println("This is the Test Case 1");
//			
//	        //driver.close();
//		}
	}

	@Test
	public void testCaseTwo() {
		//// Printing Id of the thread on using which test method got executed
		System.out.println("Test Case two with Thread Id:- " + Thread.currentThread().getId());
		driver.get("https://www.myhcl.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.close();
		
//		int i=0;
//		while(i==0){
//			driver.navigate().to("https://www.google.com/");
//			//driver.get("https://www.google.com/");
//			driver.findElement(By.id("lst-ib")).sendKeys("lara");
//			driver.findElement(By.name("btnK")).click();
//			System.out.println("This is the Test Case 2");
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);;
//	        //driver.close();
//		}
	}
}