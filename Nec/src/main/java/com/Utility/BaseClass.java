package com.Utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public static AndroidDriver<MobileElement> driver;
	public static ExcelDataProvider excel;
  static Logger logger= LogManager.getLogger(Library.class);
	@BeforeSuite
	public void BS() throws Exception {
		
		excel = new ExcelDataProvider();
	}

	@BeforeMethod
	public void Appium() throws Exception {

		// File apkkFile = new
		// File("C:\\Users\\Advantal\\eclipse-workspace\\Nec\\target\\CEP_12_july.apk");

		// DesiredCapabilities
		logger.info("Launching apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6 API 34");
		capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		capabilities.setCapability("uiautomator2ServerLaunchTimeout", 60000);
		capabilities.setCapability("appPackage", "com.nec");
		capabilities.setCapability("appActivity", "com.nec.MainActivity");

		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities); // Assign to
																											// the
																											// class-level
																											// variable
		// Thread.sleep(8000);

	}

	@AfterMethod
	
	public void tearDown() {
		logger.info("Clossing apk");
		driver.quit();
	}
}
