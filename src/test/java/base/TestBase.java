package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestBase {
	
	protected WebDriver driver;

	@BeforeTest
	public void setUpTestEnv() {
		String dirverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dirverPath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // <--- this is for elements in web page
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); // <--- this is for web page for display
	}

	//This is Dilshat
	//Im doing my final github practice.
	@AfterTest
	public void cleanUpTestEnv() {
		
		//This is Mubarak
		if(driver != null) {
			driver.close();
			driver.quit();
		}
	}
	//"hello guys"
	public void printHI() {
		System.out.println("Teklab rocks");
	}
	
	// Uzima is adding stuff
	// This is AZ !!!!!! 
	// i am making changes  
	public void az() {
		System.out.println("AZ ROCKS!!!!!!");
	}
}
