package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	// =============== Test Case ================
	public void onTestStart(ITestResult result) {
		String testCaseName = result.getName();
		System.out.println("Test Case has started: " + testCaseName);
	}

	public void onTestSuccess(ITestResult result) {
		String testCaseName = result.getName();
		System.out.println("Test Case Has Passed!\n");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Has Failed!\n");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Has Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Soft Assert Had a failure");
	}
	
	// ============== Test =======================
	public void onStart(ITestContext context) {
		System.out.println("Our Test Has Started:  " + context.getName() );
	}

	public void onFinish(ITestContext context) {
		String testname = context.getName();
		System.out.println("Our Test has finisehd: " + testname);
	}
}
