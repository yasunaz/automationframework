package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;

public class HomePage extends PageBase {
	private WebDriver driver;
	
	// ========= ELEMENTS in the Home Page ========================
	@FindBy(xpath="//a[text()='Log In']")
	private WebElement loginButton ;  // null
	
	@FindBy(xpath="//a[text()='Sign Up']")
	private WebElement signUpButton;  // null
	
	//Constructor
	public HomePage(WebDriver inputDriver) {
		driver = inputDriver;
		driver.get("https://trello.com");
		PageFactory.initElements(driver, this);
	}
	
	//=========== Actions we can perfomr in the Home Page =============
	public String clickLoginButton() {
		loginButton.click();
		waitfor(2);
		String bannerText = driver.findElement(By.tagName("h1")).getText();
		return bannerText;
	}
	
	public String clickSignUpButton() {
		signUpButton.click();
		waitfor(2);
		String bannerText = driver.findElement(By.tagName("h1")).getText();
		return bannerText;
	}
	
	
}



