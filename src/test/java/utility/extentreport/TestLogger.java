package utility.extentreport;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestLogger {
	private static ExtentReports extent = ReportFileGenerator.returnExtentFile(); //generate rport
	private static ExtentTest testlog;
	private static Map extentTestMap = new HashMap(); 

	public static synchronized ExtentTest getTestCase() {
		return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
	}

	// ===============================TEST 
	public static synchronized ExtentTest logStartOfTest(String testName) {
		ExtentTest test = extent.startTest(testName);
		extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
		testlog = test;
		return test;
	}

	public static synchronized void logEndOfTest() {
		extent.endTest((ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId())));
	}

	// ===============================TEST CASE
	public static synchronized void startTestCase(String testCaseName) {
		TestLogger.logStartOfTest(testCaseName);
	}

	public static synchronized void logTestCasePassed(String details) {
		getTestCase().log(LogStatus.PASS, details);
	}

	public static synchronized void logTestCaseFailed(String details, String screenshotFile) {
		String picture = TestLogger.getTestCase().addBase64ScreenShot(screenshotFile);
		TestLogger.getTestCase().log(LogStatus.FAIL, details, picture);
	}

	public static synchronized void logTestCaseSkipped(String details) {
		getTestCase().log(LogStatus.SKIP, details);
	}
	
	public static synchronized void logTestStepInfo(String description) {
		testlog.log(LogStatus.INFO, description);
	}
}
