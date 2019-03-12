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
		//Hello guys!s
		try {
			Thread.sleep(seocnds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//"hello guys"
	public void printHI() {
		System.out.println("Teklab rocks");
	}
	
	public void someMethom() {
		// some code 
	}

}
