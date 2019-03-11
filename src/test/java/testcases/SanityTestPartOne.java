package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.TestBase;
import pageobject.HomePage;

// Test Class ----> {@Test, @Test...etc } 

public class SanityTestPartOne extends TestBase {
	
	
	@Test
	public void login_page_dispalyed() {
		// Test Data 
		String expected = "Log in to Trello";
		
		// Test Steps
		HomePage home = new HomePage(driver);
		String actual = home.clickLoginButton();
		
		// Test Assertion
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void signup_page_displayed() {
		//Test Data
		String expected = "Create a Trello Account";
		
		//Test Steps
		HomePage home = new HomePage(driver);
		String actual = home.clickSignUpButton();
		
		//Test Assertion
		Assert.assertEquals(actual, expected);
		
	}
	
	
}
