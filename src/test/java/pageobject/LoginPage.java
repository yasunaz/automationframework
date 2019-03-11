package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;

public class LoginPage extends PageBase {
	private WebDriver driver; 

	//elements (Findby.XXXXX)
	@FindBy(tagName="h1")
	private WebElement banner;
	
	@FindBy(id="user")
	private WebElement emailInput;
	
	@FindBy(id="password")
	private WebElement passWordInput;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	//constructor
	public LoginPage(WebDriver inputDriver) {
		driver = inputDriver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void signIn(String email, String password) {
		emailInput.sendKeys(email);
		waitfor(2);
		passWordInput.sendKeys(password);
		waitfor(2);
		loginButton.click();
	}
	
	public boolean loginFailed() {
		try {
			driver.findElement(By.className("error-message"));
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	
}
