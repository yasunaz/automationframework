package utility.extentreport;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;

public class TestListener extends TestBase implements ITestListener {

	// ============================== TEST
	public void onStart(ITestContext iTestContext) {
		iTestContext.setAttribute("WebDriver",driver);
	}

	public void onFinish(ITestContext iTestContext) {
		TestLogger.logEndOfTest();
		ReportFileGenerator.returnExtentFile().flush();
	}

	// ============================== TESTCASE
	public void onTestStart(ITestResult iTestResult) {
		String testName = iTestResult.getMethod().getMethodName();
		TestLogger.startTestCase(testName);
	}

	public void onTestSuccess(ITestResult iTestResult) {
		TestLogger.logTestCasePassed("Test Case Passed");
	}

	public void onTestFailure(ITestResult iTestResult) {
		// adding screenshots to the report
		String base64Screenshot = "data:image/png;base64,"
				+ ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		TestLogger.logTestCaseFailed("Test has failed, captured screenshot", base64Screenshot);
	}

	public void onTestSkipped(ITestResult iTestResult) {
		TestLogger.logTestCaseSkipped("Test Case Has Been Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
	}
}
