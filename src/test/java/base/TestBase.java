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

	@AfterTest
	public void cleanUpTestEnv() {
		if(driver != null) {
			driver.close();
			driver.quit();
		}
	}
	
	//"hello guys"
	
}
