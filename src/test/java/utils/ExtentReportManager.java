package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extentReports;

    public static ExtentReports getReportInstance() {
        if (extentReports == null) {
            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter("test-output/ExtentReport.html");

            sparkReporter.config().setDocumentTitle("SauceDemo Automation Report");
            sparkReporter.config().setReportName("SauceDemo TestNG Report");

            extentReports = new ExtentReports();
            extentReports.attachReporter(sparkReporter);

            extentReports.setSystemInfo("Project", "SauceDemo Selenium Framework");
            extentReports.setSystemInfo("Tester", "Amr");
            extentReports.setSystemInfo("Framework", "Selenium + TestNG + POM");
        }

        return extentReports;
    }
}