package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.AllServicesPom;
import com.PageObject.HomePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class HomePageTest_005 extends BaseClass {
	@Test(priority = 1)

	public void Verify_HomePage() {
		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();
        
        Library.custom_sleep(5000);
		HomePom HomePgInst = PageFactory.initElements(driver, HomePom.class);

//		Library.custom_scrollToText(driver, "HomePgInst", "HomePgInst");
//		Library.custom_scrollToText(driver, "Categories", "Categories");
		Library.custom_waitForVisibility(driver, HomePgInst.getAllServiseBtn(), 20);
		Library.custom_click(HomePgInst.getAllServiseBtn(), "All Services");
		Library.custom_sleep(5000);
		Library.custom_waitForVisibility(driver, HomePgInst.getAllServicesBckBtn(), 20);
		Library.custom_click(HomePgInst.getAllServicesBckBtn(), "All Services Back Button");
		Library.custom_sleep(2000);
		
		Library.custom_waitForVisibility(driver, HomePgInst.getAllEventBtn(), 20);
		Library.custom_click(HomePgInst.getAllEventBtn(), "All Events");
		Library.custom_sleep(4000);
		Library.custom_waitForVisibility(driver, HomePgInst.getAllEventBckBtn(), 20);
		Library.custom_click(HomePgInst.getAllEventBckBtn(), "All Event Back Button");
		Library.custom_sleep(4000); 
		Library.custom_waitForVisibility(driver, HomePgInst.getProfileBtn(), 20);
		Library.custom_click(HomePgInst.getProfileBtn(),"Profile Button");
		Library.custom_sleep(4000);
		Library.custom_waitForVisibility(driver, HomePgInst.getProfileBckBtn(), 20);
		Library.custom_click(HomePgInst.getProfileBckBtn(), "Profile Back Button");
		
        Library.custom_waitForVisibility(driver, HomePgInst.getNotificationBtn() , 20);
        Library.custom_click(HomePgInst.getNotificationBtn(), "Notifivation");
        Library.custom_sleep(2000);
		driver.navigate().back();
		Library.custom_waitForVisibility(driver, HomePgInst.getEnglishHindiBtn(), 20);
		Library.custom_click(HomePgInst.getEnglishHindiBtn(), "Langauge Button");
        Library.custom_sleep(2000);
        Library.custom_waitForVisibility(driver, HomePgInst.getHindiLangBtn(), 20);
        Library.custom_click(HomePgInst.getHindiLangBtn(), "Hindi Langauge");
        Library.custom_sleep(2000);
        Library.custom_waitForVisibility(driver, HomePgInst.getEmergencyServicesBtn(), 20);
        Library.custom_click(HomePgInst.getEmergencyServicesBtn(), "Emergency Services");
        Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, HomePgInst.getEmergencyServicesBckBtn(), 0);
		Library.custom_click(HomePgInst.getEmergencyServicesBckBtn(), "Back Button");
		
		

        
        
        
        
        
        
        



		

	
	

}
}
