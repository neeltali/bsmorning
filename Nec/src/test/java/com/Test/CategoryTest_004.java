package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.DownloadsPom;
import com.PageObject.FeedBackPom;
import com.PageObject.GoPoliciesPom;
import com.PageObject.RecruitmentsPom;
import com.PageObject.TenderPom;
import com.PageObject.UpcomingOngProPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class CategoryTest_004 extends BaseClass {
	@Test(priority = 1)

	public void Verify_Categories() {
		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();
        
        Library.custom_sleep(5000);
        
		TenderPom TenderPg = PageFactory.initElements(driver, TenderPom.class);
//		Library.custom_waitForVisibility(driver, TenderPg.getSearchForTender(), 20);
//		Library.custom_sendKeys(TenderPg.getSearchForTender(), "Tender", "Tender");
	    Library.custom_waitForVisibility(driver, TenderPg.getTenderBtn(), 40);
		Library.custom_click(TenderPg.getTenderBtn(), "Tender");
//        Library.custom_waitForVisibility(driver, TenderPg.getTenderBtn1(), 30);
//        Library.custom_click(TenderPg.getTenderBtn1(), "Tender");
		Library.custom_sleep(2000);
		Library.custom_scrollToText(driver, "LIC", "LIC");
		Library.custom_sleep(1000);
		Library.custom_scrollToText(driver, "Nec Tender", "Nec Tender");
		Library.custom_sleep(1000);
		Library.custom_waitForVisibility(driver, TenderPg.getTenderSearchBtn(), 20);
		Library.custom_sendKeys(TenderPg.getTenderSearchBtn(), "PWD", "PWD");
		Library.custom_waitForVisibility(driver, TenderPg.getTenderSelectCategoryBtn(), 20);
		Library.custom_click(TenderPg.getTenderSelectCategoryBtn(), "Select Category");
		Library.custom_waitForVisibility(driver, TenderPg.getTenderSelectCatEducationalDepart(), 20);
		Library.custom_click(TenderPg.getTenderSelectCatEducationalDepart(), "Educational Department");
		Library.custom_waitForVisibility(driver, TenderPg.getTenderBackBtn(), 20);
		Library.custom_click(TenderPg.getTenderBackBtn(), "Back Button");
		
		RecruitmentsPom RecruitmentsPg = PageFactory.initElements(driver, RecruitmentsPom.class);
        Library.custom_waitForVisibility(driver, RecruitmentsPg.getRecruitementsBtn(), 20);
        Library.custom_click(RecruitmentsPg.getRecruitementsBtn(), "Recruitments");
        Library.custom_scrollToText(driver, "New opening", "New opening");
        Library.custom_scrollToText(driver, "17/07/2023", "17/07/2023");

        Library.custom_waitForVisibility(driver, RecruitmentsPg.getRecruitementsDepatBtn(), 20);
        Library.custom_click(RecruitmentsPg.getRecruitementsDepatBtn(), "Select Department");
        Library.custom_waitForVisibility(driver, RecruitmentsPg.getRecruitementsITDepatBtn(), 20);
        Library.custom_click(RecruitmentsPg.getRecruitementsITDepatBtn(), "IT Departments");
        Library.custom_sleep(2000);
        Library.custom_waitForVisibility(driver,RecruitmentsPg.getRecruitementsLocationBtn() , 20);
        Library.custom_click(RecruitmentsPg.getRecruitementsLocationBtn(), "Select Location");
        Library.custom_sleep(1000);
        Library.custom_waitForVisibility(driver, RecruitmentsPg.getRecruitementShivaliVatikaLocationBtn(), 20);
        Library.custom_click(RecruitmentsPg.getRecruitementShivaliVatikaLocationBtn(), "Shivaji Vatika");
        Library.custom_sleep(1000);
        Library.custom_waitForVisibility(driver, RecruitmentsPg.getRecruitementsBckBtn(), 20);
        Library.custom_click(RecruitmentsPg.getRecruitementsBckBtn(), "Back Button");
        
		DownloadsPom DownloadPg = PageFactory.initElements(driver, DownloadsPom.class);
		Library.custom_waitForVisibility(driver, DownloadPg.getDownloadBtn(), 20);
		Library.custom_click(DownloadPg.getDownloadBtn(), "Downlaods");
		Library.custom_sleep(2000);
		Library.custom_scrollToText(driver, "News", "News");
		Library.custom_sleep(2000);
		Library.custom_scrollToText(driver, "About Indore", "About Indore");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, DownloadPg.getDownloadsearch(), 20);
		Library.custom_sendKeys(DownloadPg.getDownloadsearch(), "Titanic", "Titanic");
		Library.custom_waitForVisibility(driver, DownloadPg.getDownlaodBckBtn(), 20);
		Library.custom_click(DownloadPg.getDownlaodBckBtn(), "Back Button");
		
		GoPoliciesPom GoPoliciesInst = PageFactory.initElements(driver, GoPoliciesPom.class);
		Library.custom_waitForVisibility(driver, GoPoliciesInst.getGoPoliciesBtn(), 20);
		Library.custom_click(GoPoliciesInst.getGoPoliciesBtn(), "Go/Policies");
		Library.custom_sleep(3000);
		Library.custom_scrollToText(driver, "leave policy", "leave policy");
		Library.custom_sleep(2000);
		Library.custom_scrollToText(driver, "LIC policy", "LIC policy");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, GoPoliciesInst.getGoPoliciesSearchBtn(), 20);
		Library.custom_sendKeys(GoPoliciesInst.getGoPoliciesSearchBtn(), "Leave", "Leave");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, GoPoliciesInst.getGoPoliciesBckBtn(), 20);
		Library.custom_click(GoPoliciesInst.getGoPoliciesBckBtn(), "Back Button");

		FeedBackPom FeedBckInst = PageFactory.initElements(driver, FeedBackPom.class);
		Library.custom_waitForVisibility(driver, FeedBckInst.getFeedBackBtn(), 20);
		Library.custom_click(FeedBckInst.getFeedBackBtn(), "FeedBack/Inputs");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, FeedBckInst.getSelectCategory(), 20);
		Library.custom_click(FeedBckInst.getSelectCategory(), "Select Category");
		Library.custom_waitForVisibility(driver, FeedBckInst.getSelectCatElectriSupply(), 20);
		Library.custom_click(FeedBckInst.getSelectCatElectriSupply(), "Electricity Supply");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, FeedBckInst.getFeedBackSearchBtn(), 20);
		Library.custom_sendKeys(FeedBckInst.getFeedBackSearchBtn(), "Electricity", "Electricity");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, FeedBckInst.getFeedBackCloseBtn(), 20);
		Library.custom_click(FeedBckInst.getFeedBackCloseBtn(), "Close");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, FeedBckInst.getFeedBackOpnBtn(), 20);
		Library.custom_click(FeedBckInst.getFeedBackOpnBtn(), "Open");
		Library.custom_sleep(2000);

		Library.custom_waitForVisibility(driver, FeedBckInst.getFeedBackBckBtn(), 20);
		Library.custom_click(FeedBckInst.getFeedBackBckBtn(), "Back Button");
		
		UpcomingOngProPom UpcmgOngProInst = PageFactory.initElements(driver, UpcomingOngProPom.class);
		Library.custom_waitForVisibility(driver, UpcmgOngProInst.getUpcomingOngProBtn(), 20);
		Library.custom_click(UpcmgOngProInst.getUpcomingOngProBtn(), "Upcoming & Ongoing Projects");
		Library.custom_sleep(2000);
		Library.custom_scrollToText(driver, "NeC project", "NeC project");
		Library.custom_sleep(2000);
		Library.custom_scrollToText(driver, "Government Project", "Government Project");
		Library.custom_sleep(1000);
		Library.custom_waitForVisibility(driver, UpcmgOngProInst.getUpcomingOngProSearchBtn(), 20);
		Library.custom_sendKeys(UpcmgOngProInst.getUpcomingOngProSearchBtn(), "Government", "Government");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, UpcmgOngProInst.getUpcomingOngProSelectCatBtn(), 20);
		Library.custom_click(UpcmgOngProInst.getUpcomingOngProSelectCatBtn(), "Select Category");
		Library.custom_waitForVisibility(driver, UpcmgOngProInst.getUpgOngProSelectCatPublicWelBtn(), 20);
		Library.custom_click(UpcmgOngProInst.getUpgOngProSelectCatPublicWelBtn(), "Public Welfare");
		Library.custom_sleep(1000);
		Library.custom_waitForVisibility(driver, UpcmgOngProInst.getUpgOngProBckBtn(), 20);
		Library.custom_click(UpcmgOngProInst.getUpgOngProBckBtn(), "Back Button");
		
		
		

		

		
		
		
		
		
		
		

}
}
