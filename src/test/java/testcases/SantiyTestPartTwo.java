package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pageobject.HomePage;
import pageobject.LoginPage;

public class SantiyTestPartTwo extends TestBase {

	@Test
	public void login_should_fail_with_invalid_credential() {
		SoftAssert softA = new SoftAssert();
		
		// Test Data
		String userEmail = "invalidUser";
		String password  = "invaluedPass";
		String expectedBanner =  "Log in to Trello";
		

		// Test Steps
		HomePage home = new HomePage(driver);
		String actualBanner =  home.clickLoginButton();
		softA.assertEquals(actualBanner, expectedBanner);   // <--- 1st assert 
		
		LoginPage login = new LoginPage(driver);
		login.signIn(userEmail, password);
		boolean actual = login.isLoginFailed();
		softA.assertTrue(actual, "boolean value in variable actual was not TREU");  // <---- 2nd 
		
		// Test Assert 
		softA.assertAll();
	}
}
