package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.CheckPayTaxPom;
import com.PageObject.CitizenServicesPom;
import com.PageObject.CommunityServicesPom;
import com.PageObject.EducationalInstitutionPom;
import com.PageObject.EmergencyServicesPom;
import com.PageObject.GrievancePom;
import com.PageObject.HealthServicesPom;
import com.PageObject.ItmsPom;
import com.PageObject.LoginPagePom;
import com.PageObject.PayUtilityBillsPom;
import com.PageObject.SportsFacilityPom;
import com.PageObject.StaffDirectoryPom;
import com.PageObject.WardInformationPom;
import com.Utility.BaseClass;
import com.Utility.ExcelDataProvider;
import com.Utility.Library;

public class AllServicesTest_003 extends BaseClass {
	@Test(priority = 1)

	public void Verify_AllServiceModules() {
		LoginTest_001 loginTestInstance = new LoginTest_001();
        loginTestInstance.ValidLogin();


		StaffDirectoryPom StaffDirectory = PageFactory.initElements(driver, StaffDirectoryPom.class);
		Library.custom_waitForVisibility(driver, StaffDirectory.getAllServiceBtn(), 20);
		Library.custom_click(StaffDirectory.getAllServiceBtn(), "All Services");
		
			Library.custom_waitForVisibility(driver, StaffDirectory.getStaffDirectoryBtn(), 20);
		Library.custom_click(StaffDirectory.getStaffDirectoryBtn(), "Staff Directory");
		Library.custom_waitForVisibility(driver, StaffDirectory.getStaffDirectorySearchBtn(), 20);
		Library.custom_sendKeys(StaffDirectory.getStaffDirectorySearchBtn(), "Saurav", "Saurav");
		Library.custom_waitForVisibility(driver, StaffDirectory.getSelectDepartmentDropDwn(), 20);
		Library.custom_click(StaffDirectory.getSelectDepartmentDropDwn(), "Select Department");
		Library.custom_waitForVisibility(driver, StaffDirectory.getPWDBtn(),20);
		Library.custom_click(StaffDirectory.getPWDBtn(), "PWD");
		Library.custom_waitForVisibility(driver, StaffDirectory.getBackBtn(), 20);
		Library.custom_click(StaffDirectory.getBackBtn(), "Back Button");  
		

	
		EducationalInstitutionPom EducationalInst = PageFactory.initElements(driver, EducationalInstitutionPom.class);
		Library.custom_waitForVisibility(driver, EducationalInst.getEducationalInstitute(), 20);
		Library.custom_click(EducationalInst.getEducationalInstitute(), "Educational Institution");
		 Library.custom_scrollToText(driver, "Indore-Dewas By-Pass, Road","Indore-Dewas By-Pass, Road");
		    Library.custom_sleep(2000);
		    Library.custom_scrollToText(driver, "Institution Type","Institution Type");
		    Library.custom_waitForVisibility(driver, EducationalInst.getEducationalInstituteSearchBtn(), 20);
		    Library.custom_sendKeys(EducationalInst.getEducationalInstituteSearchBtn(),"IPS University","IPS University" );
	        Library.custom_waitForVisibility(driver,EducationalInst.getSelectDepartmentDrpDwn() , 20);
	        Library.custom_click(EducationalInst.getSelectDepartmentDrpDwn(), "Select Department");
	        
	        Library.custom_waitForVisibility(driver, EducationalInst.getSemiGovt(), 20);
	        Library.custom_click(EducationalInst.getSemiGovt(), "Semi Govt");
	        Library.custom_scrollToText(driver, "Indore-Dewas By-Pass, Road","Indore-Dewas By-Pass, Road");
		    Library.custom_waitForVisibility(driver, EducationalInst.getBckBtn(), 20);
		    Library.custom_click(EducationalInst.getBckBtn(), "Back Button"); 
	
		    
		CommunityServicesPom CommunityServInst = PageFactory.initElements(driver, CommunityServicesPom.class);

		Library.custom_waitForVisibility(driver, CommunityServInst.getCommunityServicesBtn(), 20);
		Library.custom_click(CommunityServInst.getCommunityServicesBtn(),"Community Services");
		
		Library.custom_scrollToText(driver, "vijay nagar","Vijay Nagar");
		Library.custom_scrollToText(driver, "Royal Rajput", "Royal Rajput");
		
		Library.custom_waitForVisibility(driver, CommunityServInst.getCommunitySearchBtn(), 20);
		Library.custom_sendKeys(CommunityServInst.getCommunitySearchBtn(),"Gold Group Devotee","Gold Group Devotee" );
	    
	    Library.custom_waitForVisibility(driver, CommunityServInst.getSelectCategoryBtn(), 20);
	    Library.custom_click(CommunityServInst.getSelectCategoryBtn(),"Select Category");
	    
	    Library.custom_waitForVisibility(driver, CommunityServInst.getReligionOpn(), 20);
	    Library.custom_click(CommunityServInst.getReligionOpn(),"Religion");
	    
	    Library.custom_waitForVisibility(driver, CommunityServInst.getBackBttn(), 20);
	    Library.custom_click(CommunityServInst.getBackBttn(),"Back Button"); 
		
		
		EmergencyServicesPom EmergencyServicesInst = PageFactory.initElements(driver, EmergencyServicesPom.class);

		Library.custom_waitForVisibility(driver, EmergencyServicesInst.getEmergencyServices(), 20);
		Library.custom_click(EmergencyServicesInst.getEmergencyServices(),"Emergency Services");
		Library.custom_sleep(1000);
		driver.navigate().back(); 
		
		HealthServicesPom HealthServiceInst = PageFactory.initElements(driver, HealthServicesPom.class);
		Library.custom_waitForVisibility(driver, HealthServiceInst.getHealthServicesBtn(), 20);
		Library.custom_click(HealthServiceInst.getHealthServicesBtn(), "Health Services");
		Library.custom_sleep(2000);
		driver.navigate().back(); 
		
		SportsFacilityPom SportFacilityInst = PageFactory.initElements(driver, SportsFacilityPom.class);
		Library.custom_waitForVisibility(driver, SportFacilityInst.getSportServicesBtn(), 20);
		Library.custom_click(SportFacilityInst.getSportServicesBtn(),"Sports Faci");
		Library.custom_sleep(2000);
		driver.navigate().back(); 
		
		CitizenServicesPom CitizenServicesInst = PageFactory.initElements(driver, CitizenServicesPom.class);
		Library.custom_scrollToTextClick(driver, "Citizen Services","Citizen Services");
		Library.custom_waitForVisibility(driver, CitizenServicesInst.getDeathCertificateBtn(), 20);
		Library.custom_click(CitizenServicesInst.getDeathCertificateBtn(),"Death Certificate");
		
		Library.custom_waitForVisibility(driver, CitizenServicesInst.getDeathCertiYesBtn(), 20);
		Library.custom_click(CitizenServicesInst.getDeathCertiYesBtn(),"Redirect to the external site");
		Library.custom_sleep(9000);
		Library.custom_waitForVisibility(driver, CitizenServicesInst.getDeathCertiBckBtn(), 20);
		Library.custom_click(CitizenServicesInst.getDeathCertiBckBtn(), "Back Button");
		
		
		Library.custom_waitForVisibility(driver, CitizenServicesInst.getIncomeCertificateBtn(), 20);
		Library.custom_click(CitizenServicesInst.getIncomeCertificateBtn(), "Income Certificate");
		Library.custom_waitForVisibility(driver, CitizenServicesInst.getIncomeCertiExternalSiteYes(), 20);
		Library.custom_click(CitizenServicesInst.getIncomeCertiExternalSiteYes(), "External Site");
		Library.custom_sleep(6000);
		Library.custom_waitForVisibility(driver, CitizenServicesInst.getIncomeCertiBckBtn(), 20);
		Library.custom_click(CitizenServicesInst.getIncomeCertiBckBtn(), "Back Button");
		
		Library.custom_waitForVisibility(driver,CitizenServicesInst.getBirthCertificateBtn(), 20);
		Library.custom_click(CitizenServicesInst.getBirthCertificateBtn(), "Birth Certificate");
		Library.custom_waitForVisibility(driver, CitizenServicesInst.getBirthCertiYesBtn(), 20);
		Library.custom_click(CitizenServicesInst.getBirthCertiYesBtn(), "External Site");
		Library.custom_sleep(6000);
		Library.custom_waitForVisibility(driver, CitizenServicesInst.getBirthCertiBckBtn(), 20);
		Library.custom_click(CitizenServicesInst.getBirthCertiBckBtn(), "Back Button");
        Library.custom_waitForVisibility(driver, CitizenServicesInst.getCitizenServicesBckBtn(), 20);
        Library.custom_click(CitizenServicesInst.getCitizenServicesBckBtn(), "Citizen Services Back Button");
        
		WardInformationPom WardInforInst = PageFactory.initElements(driver, WardInformationPom.class);

        Library.custom_waitForVisibility(driver, WardInforInst.getWardInformationBtn(), 20);
        Library.custom_click(WardInforInst.getWardInformationBtn(), "Ward Information");
        Library.custom_waitForVisibility(driver, WardInforInst.getMunicipalOfficerBtn(), 20);
        Library.custom_click(WardInforInst.getMunicipalOfficerBtn(), "Muncipal Officer");
        Library.custom_sleep(2000);
        driver.navigate().back();
        
        Library.custom_waitForVisibility(driver, WardInforInst.getPowerWaterSupplierBtn(), 20);
        Library.custom_click(WardInforInst.getPowerWaterSupplierBtn(), "Power/Water Supplier");
        Library.custom_sleep(2000);
        driver.navigate().back();
        
        Library.custom_waitForVisibility(driver, WardInforInst.getGarbageCollectionBtn(), 20);
        Library.custom_click(WardInforInst.getGarbageCollectionBtn(), "Garbage Collection");
        Library.custom_sleep(2000);
        driver.navigate().back();
        
        Library.custom_waitForVisibility(driver, WardInforInst.getOtherBtn(), 20);
        Library.custom_click(WardInforInst.getOtherBtn(), "Others");
        Library.custom_sleep(2000);
        driver.navigate().back();
        
        Library.custom_waitForVisibility(driver, WardInforInst.getWardInformationBckBtn(), 20);
        Library.custom_click(WardInforInst.getWardInformationBckBtn(), "Ward Information Back Button");
       
		
		ItmsPom ITMSInst = PageFactory.initElements(driver, ItmsPom.class);
		//Library.custom_scrollToText(driver, "ITMS", "ITMS");
		Library.custom_scrollToTextClick(driver, "ITMS", "ITMS");
//		Library.custom_waitForVisibility(driver, ITMSInst.getItmsBtn(), 20);
//		Library.custom_click(ITMSInst.getItmsBtn(),"ITMS");
		Library.custom_waitForVisibility(driver, ITMSInst.getViewPayPenaltiesBtn(), 20);
		Library.custom_click(ITMSInst.getViewPayPenaltiesBtn(), "View & Pay Penalties");
		Library.custom_waitForVisibility(driver, ITMSInst.getViewPayPnltExternalYesBtn(), 20);
		Library.custom_click(ITMSInst.getViewPayPnltExternalYesBtn(), "External Site");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, ITMSInst.getViewPayPenaltiesBckBtn(), 20);
		Library.custom_click(ITMSInst.getViewPayPenaltiesBckBtn(), "Back Button");
		
		Library.custom_waitForVisibility(driver, ITMSInst.getViewPayChallanBtn(), 20);
		Library.custom_click(ITMSInst.getViewPayChallanBtn(), "View & Pay Challan");
		
        Library.custom_waitForVisibility(driver, ITMSInst.getViewPayChallanExternalYesBtn(), 20);
        Library.custom_click(ITMSInst.getViewPayChallanExternalYesBtn(), "External Site");
        Library.custom_sleep(2000);
        Library.custom_waitForVisibility(driver, ITMSInst.getViewPayChallanBckBtn(), 20);
        Library.custom_click(ITMSInst.getViewPayChallanBckBtn(), "Back Button");
        Library.custom_waitForVisibility(driver, ITMSInst.getITMSBckBtn(), 20);
        Library.custom_click(ITMSInst.getITMSBckBtn(), "ITMS Back Button");  
        
		CheckPayTaxPom CheckPayInst = PageFactory.initElements(driver, CheckPayTaxPom.class);
		Library.custom_scrollToTextClick(driver, "Check & Pay Tax", "Check & Pay Tax");
		//Library.custom_waitForVisibility(driver, CheckPayInst.getCheckPayTax(), 20);
		//Library.custom_click(CheckPayInst.getCheckPayTax(), "Check & Pay Tax");
		Library.custom_waitForVisibility(driver, CheckPayInst.getTradeLicence(), 20);
		Library.custom_click(CheckPayInst.getTradeLicence(), "Trade Licence");
		
		Library.custom_waitForVisibility(driver, CheckPayInst.getTradeLicenceExternalSiteYes(), 20);
		Library.custom_click(CheckPayInst.getTradeLicenceExternalSiteYes(), "External Site");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, CheckPayInst.getTradeLicenceBckBtn(), 20);
		Library.custom_click(CheckPayInst.getTradeLicenceBckBtn(), "Back Button");
		Library.custom_waitForVisibility(driver, CheckPayInst.getPropertyTaxes(), 20);
		Library.custom_click(CheckPayInst.getPropertyTaxes(), "Property Taxes");
		Library.custom_waitForVisibility(driver, CheckPayInst.getPropertyTaxesExternalsiteYes(), 20);
		Library.custom_click(CheckPayInst.getPropertyTaxesExternalsiteYes(), "External Site");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, CheckPayInst.getPropertyTaxesBckBtn(), 20);
		Library.custom_click(CheckPayInst.getPropertyTaxesBckBtn(),"BackButton");
		Library.custom_waitForVisibility(driver, CheckPayInst.getCheckPayTaxBckBtn(), 20);
		Library.custom_click(CheckPayInst.getCheckPayTaxBckBtn(), "Back Button");

		PayUtilityBillsPom PayUtBInst = PageFactory.initElements(driver, PayUtilityBillsPom.class);
		Library.custom_scrollToText(driver, "Greviance Services", "Greviance Services");

		Library.custom_waitForVisibility(driver, PayUtBInst.getPayUtilityBills(), 20);
        Library.custom_click(PayUtBInst.getPayUtilityBills(), "Pay Utility Bills");
        Library.custom_waitForVisibility(driver, PayUtBInst.getElectricityBill(), 20);
        Library.custom_click(PayUtBInst.getElectricityBill(), "Electricity Bill");
        Library.custom_waitForVisibility(driver, PayUtBInst.getElectrBillExternalSitYesBtn(), 20);
        Library.custom_click(PayUtBInst.getElectrBillExternalSitYesBtn(), "External Site");
        Library.custom_sleep(2000);
        Library.custom_waitForVisibility(driver, PayUtBInst.getElectrBillExternalSitYesBckBtn(), 20);
        Library.custom_click(PayUtBInst.getElectrBillExternalSitYesBckBtn(), "Back Button");
        Library.custom_waitForVisibility(driver, PayUtBInst.getGasbillBtn(), 20);
        Library.custom_click(PayUtBInst.getGasbillBtn(), "Gas Bill");
        Library.custom_waitForVisibility(driver, PayUtBInst.getGasbillExternalYesBtn(), 20);
        Library.custom_click(PayUtBInst.getGasbillExternalYesBtn(), "External Site");
        Library.custom_sleep(2000);
        Library.custom_waitForVisibility(driver, PayUtBInst.getGasbillBckBtn(), 20);
        Library.custom_click(PayUtBInst.getGasbillBckBtn(), "Back Button");
        Library.custom_waitForVisibility(driver, PayUtBInst.getPayUtilityBillsBckBtn(), 20);
        Library.custom_click(PayUtBInst.getPayUtilityBillsBckBtn(), "Back Button");
     
		GrievancePom GrievienceInst = PageFactory.initElements(driver, GrievancePom.class);
		Library.custom_waitForVisibility(driver, GrievienceInst.getGrievanceBtn(), 20);
		Library.custom_click(GrievienceInst.getGrievanceBtn(), "Grievience");
		Library.custom_waitForVisibility(driver, GrievienceInst.getCivicInfrastructer(), 20);
		Library.custom_click(GrievienceInst.getCivicInfrastructer(), "Civic Infrastructure");
		Library.custom_sleep(1000);
		//Library.custom_scrollToText(driver, "Complain No.1", "Complain No.1");
		driver.navigate().back();
		Library.custom_waitForVisibility(driver, GrievienceInst.getEnforcementReporting(), 20);
		Library.custom_click(GrievienceInst.getEnforcementReporting(), "Enforcement Reporting");
		Library.custom_sleep(1000);
		driver.navigate().back();
		Library.custom_waitForVisibility(driver, GrievienceInst.getSanitationIssue(), 20);
		Library.custom_click(GrievienceInst.getSanitationIssue(), "Sanitaion Issue");
		Library.custom_sleep(1000);
		driver.navigate().back();
		Library.custom_waitForVisibility(driver, GrievienceInst.getPublicConvenience(), 20);
		Library.custom_click(GrievienceInst.getPublicConvenience(), "Public Convenience");
		Library.custom_sleep(1000);
		driver.navigate().back();
		Library.custom_waitForVisibility(driver, GrievienceInst.getGrievanceSerBckBtn(), 20);
		Library.custom_click(GrievienceInst.getGrievanceSerBckBtn(), "Grievience Services Back Button & All Servies Done");
		

		    
		
		    


	}

}
