package utility.extentreport;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ReportFileGenerator {

	private static ExtentReports extent;

	// returns Extent reporting object for the caller
	public static ExtentReports returnExtentFile() {
		if (extent == null) {
			extent = new ExtentReports(
					System.getProperty("user.dir") + "\\src\\test\\resources\\reports\\AutomationReport.html", // REPORT FILE LOCATION
					true,  // Overwrite report every time
					DisplayOrder.OLDEST_FIRST);
			// get the extent report configuration file
			File reportConfigFile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\reports\\ReportsConfig.xml");
			extent.loadConfig(reportConfigFile);
		}
		return extent;
	}
}
