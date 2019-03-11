package base;

import org.openqa.selenium.WebDriver;

public abstract class PageBase {
	
	protected WebDriver driver;
	
	// Constructors 
	public PageBase(WebDriver inputDriver) {
		driver = inputDriver;
	}
	

	/**
	 * This method paused the test for specified seconds
	 * @param seocnds  integer number for seconds
	 */
	public void waitfor(int seocnds) {
		try {
			Thread.sleep(seocnds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
