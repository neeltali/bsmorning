package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.ForgotPasswordPom;
import com.PageObject.LoginPagePom;
import com.PageObject.SkipLoginPom;
import com.Utility.BaseClass;
import com.Utility.ExcelDataProvider;
import com.Utility.Library;

public class LoginMTest_001 extends BaseClass {
	@Test(priority = 1)
	public void ValidLogin() {
		LoginPagePom login = PageFactory.initElements(driver, LoginPagePom.class);

		Library.custom_waitForVisibility(driver, login.getMobile_No(), 20);

		Library.custom_sendKeys(login.getMobile_No(), ExcelDataProvider.getStringData("Sheet1", 0, 0), "Mobile No");

		Library.custom_waitForVisibility(driver, login.getPassword(), 20);
		Library.custom_sendKeys(login.getPassword(), Library.getStringExcelData(0, 0, 1), "Password");

		Library.custom_click(login.getLogin(), "Login");

	}

	@Test(priority = 2)
	public void SkipLogin() {
		SkipLoginPom SkpLogin = PageFactory.initElements(driver, SkipLoginPom.class);
		Library.custom_scrollToText(driver, "SKIP LOGIN", " SKIP LOGIN");
		Library.custom_waitForVisibility(driver, SkpLogin.getSkip_Login(), 20);
		
		Library.custom_click(SkpLogin.getSkip_Login(), " SKIP BUTTON");

	}

	@Test(priority = 3)
	public void ForgotPassword() {
		ForgotPasswordPom ForgotPrd = PageFactory.initElements(driver, ForgotPasswordPom.class);

		Library.custom_waitForVisibility(driver, ForgotPrd.getForgotPwd(), 20);
		Library.custom_click(ForgotPrd.getForgotPwd(), "Forgot Password");

		Library.custom_waitForVisibility(driver, ForgotPrd.getEmail(), 20);
		Library.custom_sendKeys(ForgotPrd.getEmail(), ExcelDataProvider.getStringData("Sheet1", 0, 2), "Email");

		Library.custom_waitForVisibility(driver, ForgotPrd.getGetOTP(), 20);
		Library.custom_click(ForgotPrd.getGetOTP(), "Get OTP");

		Library.custom_sleep(4000);
		
        Library.custom_waitForVisibility(driver, ForgotPrd.getEnterCode(), 20);
		Library.custom_click(ForgotPrd.getEnterCode(), "Enter code");

		Library.custom_sleep(26000);

		Library.custom_waitForVisibility(driver, ForgotPrd.getEPasswrd(), 20);

		Library.custom_sendKeys(ForgotPrd.getEPasswrd(), ExcelDataProvider.getStringData("Sheet1", 0, 3), "Password");

		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, ForgotPrd.getConfirmPasswrd(), 20);

		Library.custom_sendKeys(ForgotPrd.getConfirmPasswrd(), ExcelDataProvider.getStringData("Sheet1", 0, 4),
				"Confirm Password");
		Library.custom_sleep(2000);
		Library.custom_waitForVisibility(driver, ForgotPrd.getSubmit(), 20);
		Library.custom_click(ForgotPrd.getSubmit(), "Submit Button");
	}


}
