package listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ExtentReportManager;

public class TestListener implements ITestListener {

    private ExtentReports extentReports = ExtentReportManager.getReportInstance();
    private ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
        extentTest.info("Test started: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.pass("Test passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.fail("Test failed: " + result.getMethod().getMethodName());
        extentTest.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.skip("Test skipped: " + result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        extentReports.flush();
    }
}
