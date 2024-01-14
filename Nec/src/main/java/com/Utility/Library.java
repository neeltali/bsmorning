package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Library {
	
	
	public static ExtentTest test;
	static Logger logger= LogManager.getLogger(Library.class);
	private static String scrollCommand;
	public void log() {
		
		
	}
	public static void custom_sendKeys(WebElement element, String value,String fieldname) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldname+"Value Successfully Send ");
			logger.info("Value Successfully Send "+fieldname);
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			logger.info(e.getMessage());
			element.sendKeys(value);
			
		}
	}

	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
			test.log(Status.PASS, "Clicked Successfully "+ fieldname);
			logger.info("Clicked Successfully "+ fieldname);
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			logger.info(e.getMessage());
			element.click();
			
		}
	}

	public static void custom_sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void custom_waitForVisibility(WebDriver driver, WebElement element, int timeoutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static WebElement custom_waitForPresence(WebDriver driver, WebElement element, int timeoutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			return wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public static void custom_scrollToText(AndroidDriver<MobileElement> driver, String text, String fieldname) {
		try {
			String scrollableList = "new UiScrollable(new UiSelector().scrollable(true).instance(0))";
			String scrollToText = String.format(".scrollIntoView(new UiSelector().textContains(\"%s\").instance(0))",
					text);
			String scrollCommand = scrollableList + scrollToText;
			// Removed the click command from here
			driver.findElementByAndroidUIAutomator(scrollCommand);
			test.log(Status.PASS, "Srolled Successfully "+ fieldname);
			logger.info("Srolled Successfully "+ fieldname);
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			logger.info(e.getMessage());
			driver.findElementByAndroidUIAutomator(scrollCommand);

		}
	}

	public static String getStringExcelData(int SheetNumber, int RowNumber, int ColumnNumber) {
		String path = "\\TestData\\Test.xlsx";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\Advantal\\eclipse-workspace\\Nec\\TestData\\Test.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String TestData = wb.getSheetAt(SheetNumber).getRow(RowNumber).getCell(ColumnNumber).getStringCellValue();
		return TestData;
	}

	public static String getNumericExcelData(int SheetNumber, int RowNumber, int ColumnNumber) {
		String path = "\\TestData\\Test.xlsx";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		double TestData_InDouble = wb.getSheetAt(SheetNumber).getRow(RowNumber).getCell(ColumnNumber)
		        .getNumericCellValue();
		String TestData = String.valueOf((int) TestData_InDouble); // Convert double to int to remove decimal places
		return TestData;

	}

	public static void custom_scrollToTextClick(AndroidDriver<MobileElement> driver, String text,String fieldname) {
		try {
			String scrollableList = "new UiScrollable(new UiSelector().scrollable(true).instance(0))";
			String scrollToText = String.format(".scrollIntoView(new UiSelector().textContains(\"%s\").instance(0))",
					text);
			String scrollCommand = scrollableList + scrollToText;
			// Removed the click command from here
			driver.findElementByAndroidUIAutomator(scrollCommand).click();
			test.log(Status.PASS, "Srolled Successfully & Clicked "+ fieldname);
			logger.info("Srolled Successfully & Clicked "+ fieldname);
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			logger.info(e.getMessage());
			driver.findElementByAndroidUIAutomator(scrollCommand);		}

	}

}
