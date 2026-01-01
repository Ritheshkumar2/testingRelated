package utilstwo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportListener implements ITestListener{
	
	
	
	private ExtentReports extent;
	
	private static ThreadLocal<ExtentTest> extenttest=new ThreadLocal<>();
	
	public void onStart(ITestContext context) {
		//Get ExtentReports
		extent=ExtentReportsRelatedClass.getinstance();
	}
	
	public void onTestStart(ITestResult result) {
		//Create ExtentTest
		ExtentTest test=extent.createTest(result.getMethod().getMethodName());
		extenttest.set(test);
	}
	
	public void onTestSuccess(ITestResult result) {
		extenttest.get().pass("Test Scenario Passed");
		//extenttest.get().log(Status.PASS,"Test Scenario Passed");
	}
	
	public void onTestFailure(ITestResult result) {
		extenttest.get().fail("Test Scenario Failed");
		
		WebDriver driver=(WebDriver) result.getTestContext().getAttribute("driver");
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		
		String path = "extent/FailedScreenshots/"
                + result.getMethod().getMethodName() + ".png";
	
		try {
			FileUtils.copyFile(src, new File(path));
			extenttest.get().addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		extenttest.get().skip("Test Scenario skipped");
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
