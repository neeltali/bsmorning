package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		String path="C:\\Users\\Advantal\\eclipse-workspace\\Nec\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("CEP Mobile Automation Report");
		reporter.config().setReportName("Appium Testing");
		reporter.config().setTheme(Theme.DARK);
		
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "CEP");
		extent.setSystemInfo("O.S.", "Windows");
		extent.setSystemInfo("Tools", "Selenium Webdriver, Appium & Android Studio");
		extent.setSystemInfo("Project Manager", "Mr. Vishal Jain");
		extent.setSystemInfo("Team Lead", "Mr. Yuvraj Ninave");
		extent.setSystemInfo("QA", "Swapnil T");
		return extent;
		
	}

}
