package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{

	public static long Page_Load_Timeout=2;              /* It will me in minutes */
	public static long Implicit_Wait=30;                 /* It will be in seconds */
	public static String TestData_Sheet_Path="C:\\Users\\IBM_ADMIN\\GAURAV\\Workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\testData.xlsx";
	
	public void switchToFrame(){
		driver.switchTo().frame("mainpanel");
	}
	
	public void waitForElement(WebElement argElement){
		scrollInToView(argElement);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
	}
	
	public void scrollInToView(WebElement argElement){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",argElement);
	}
	
	public void clickUsingAction(WebElement argElement){
		Actions action = new Actions(driver);
		action.moveToElement(argElement).click().perform();
	}
	
	public static Object[][] getTestData(String sheetName){
		Object[][] data=null;
		XSSFWorkbook wb;
		XSSFSheet sheet;
		try {
			FileInputStream fis = new FileInputStream(sheetName);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(0);
			int rows = sheet.getLastRowNum()-sheet.getFirstRowNum();
			data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i<rows;i++){
				for(int j=0;j<sheet.getRow(i).getLastCellNum();j++){
					data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				}
			}
			wb.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return data;
	}
//	public static void main(String[] args) {
//		Object data[][]=getTestData(TestData_Sheet_Path);
//		for(int i=0;i<data.length;i++){
//			for(int j=0;j<data[i].length;j++){
//				System.out.print(data[i][j]+"   :   ");
//			}
//			System.out.println();
//		}
//	}
}



















