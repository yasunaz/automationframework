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
	 * 
	 * @param seocnds integer number for seconds
	 */
	public void waitfor(int seocnds) {
		// Hello guys!s
		try {
			Thread.sleep(seocnds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This is our magic methods
	 */
	public void printHI() {
		System.out.println("Teklab rocks");
	}

	/**
	 * This is also our second magic method
	 */
	public void someMethom() {
		// some code
		System.out.println("hey some method");
	}
	
	/**
	 * This is a magic magic method from JC's laptop
	 */
	public void myWayMethod() {
		System.out.println("Hey this method was craeted at JC's local pc");
	}
	
	public void myHeyMethod() {
		System.out.println("Hey from SDET");
	}
}
