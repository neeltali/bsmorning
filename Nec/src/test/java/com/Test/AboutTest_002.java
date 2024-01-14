package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.AboutCityPom;
import com.PageObject.ContactUsPom;
import com.PageObject.FactAtGlancePom;
import com.PageObject.FestivalPagePom;
import com.PageObject.HolidayPom;
import com.PageObject.LoginPagePom;
import com.PageObject.LogoutPom;
import com.PageObject.RateThisAppPom;
import com.Utility.BaseClass;
import com.Utility.ExcelDataProvider;
import com.Utility.Library;

public class AboutTest_002 extends BaseClass {

	@Test(priority = 1)

	public void AboutCity() {
		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();

		AboutCityPom AboutCT = PageFactory.initElements(driver, AboutCityPom.class);

		Library.custom_waitForVisibility(driver, AboutCT.getMenuBtn(), 20);
		Library.custom_click(AboutCT.getMenuBtn(), "About");

		Library.custom_waitForVisibility(driver, AboutCT.getAboutCity(), 20);
		Library.custom_click(AboutCT.getAboutCity(), "About City");
		Library.custom_scrollToText(driver, "July - August", "July-August");
		Library.custom_scrollToText(driver, "About", "About");
	}

	@Test(priority = 2)
	public void Festivals() {
		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();
        Library.custom_sleep(4000);
		AboutCityPom AboutCT = PageFactory.initElements(driver, AboutCityPom.class);

		Library.custom_waitForVisibility(driver, AboutCT.getMenuBtn(), 20);
		Library.custom_click(AboutCT.getMenuBtn(), "About");
		
		FestivalPagePom FestivalPg = PageFactory.initElements(driver, FestivalPagePom.class);

		Library.custom_waitForVisibility(driver, FestivalPg.getFestivalBtn(), 3);
		Library.custom_click(FestivalPg.getFestivalBtn(), "Festivals");

		Library.custom_scrollToText(driver, "Raksha Bandhan", "Rakshan Bandhan");
		Library.custom_scrollToText(driver, "Eid", "Eid");
		// Library.custom_sendKeys(FestivalPg.getSearchBtn1(), "Eid");
		Library.custom_click(FestivalPg.getEidF(), "Eid");
		
	}

	@Test(priority = 3)
	public void FactAtGlance() {
		
		FactAtGlancePom FactAtGlanePg = PageFactory.initElements(driver, FactAtGlancePom.class);
		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();
		Library.custom_waitForVisibility(driver, FactAtGlanePg.getMenuBtn2(), 20);
		Library.custom_click(FactAtGlanePg.getMenuBtn2(), "About");

		Library.custom_waitForVisibility(driver, FactAtGlanePg.getFactAtGlanceBtn(), 0);
		Library.custom_click(FactAtGlanePg.getFactAtGlanceBtn(), "Fact At Glance");
		Library.custom_scrollToText(driver, "Hindi", "Hindi");
		Library.custom_scrollToText(driver, "postal Code", "Postal Code");

	}

	@Test(priority = 4)
	public void Holidays() {
		
		HolidayPom HolidayPg = PageFactory.initElements(driver, HolidayPom.class);


		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();
		FactAtGlancePom FactAtGlanePg = PageFactory.initElements(driver, FactAtGlancePom.class);

		Library.custom_waitForVisibility(driver, FactAtGlanePg.getMenuBtn2(), 20);
		Library.custom_click(FactAtGlanePg.getMenuBtn2(), "About");
		Library.custom_waitForVisibility(driver, HolidayPg.getHolidayBtn(), 20);
		Library.custom_click(HolidayPg.getHolidayBtn(),"Holidays");

	}
	@Test(priority = 5)
	public void verify_ContactUs_validCredential() {
		
		ContactUsPom ContactUsPg = PageFactory.initElements(driver, ContactUsPom.class);

		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();
		FactAtGlancePom FactAtGlanePg = PageFactory.initElements(driver, FactAtGlancePom.class);
        Library.custom_waitForVisibility(driver, FactAtGlanePg.getMenuBtn2(), 20);
		Library.custom_click(FactAtGlanePg.getMenuBtn2(), "About");
		Library.custom_waitForVisibility(driver, ContactUsPg.getContactUsBtn(), 20);
		Library.custom_click(ContactUsPg.getContactUsBtn(),"Contact Us");
		Library.custom_waitForVisibility(driver, ContactUsPg.getSubject(), 10);
		Library.custom_sendKeys(ContactUsPg.getSubject(), ExcelDataProvider.getStringData("Sheet1", 0, 5),"Subject");
		
		Library.custom_waitForVisibility(driver, ContactUsPg.getYourMsg(), 10);
		Library.custom_sendKeys(ContactUsPg.getYourMsg(), ExcelDataProvider.getStringData("Sheet1", 0, 6),"Your Message");
		
		Library.custom_click(ContactUsPg.getSubmitBtn(),"Submit");
		}
	@Test(priority = 6)
	public void RateThisApp() {
		
		RateThisAppPom RateApp = PageFactory.initElements(driver, RateThisAppPom.class);
		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();
		FestivalPagePom FestivalPg = PageFactory.initElements(driver, FestivalPagePom.class);
		Library.custom_waitForVisibility(driver, FestivalPg.getMenuBtn1(), 20);
        Library.custom_click(FestivalPg.getMenuBtn1(), "About");
		Library.custom_waitForVisibility(driver, RateApp.getRateThisAppBtn(), 20);
		Library.custom_click(RateApp.getRateThisAppBtn(), "Rate This App");
		
		
	}
	@Test(priority = 7)
	public void VerifyLogOut() {
		
		LogoutPom LogOutP = PageFactory.initElements(driver, LogoutPom.class);
		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();
		FestivalPagePom FestivalPg = PageFactory.initElements(driver, FestivalPagePom.class);
		Library.custom_waitForVisibility(driver, FestivalPg.getMenuBtn1(), 20);

		Library.custom_click(FestivalPg.getMenuBtn1(), "About");
		Library.custom_waitForVisibility(driver, LogOutP.getLogoutBtn(), 20);
		Library.custom_click(LogOutP.getLogoutBtn(),"Log Out");
		Library.custom_waitForVisibility(driver, LogOutP.getExitBtn(), 20);
		Library.custom_click(LogOutP.getExitBtn(), "EXIT");
		
		
		
	}
	
      
}
