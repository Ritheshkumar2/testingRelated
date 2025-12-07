package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class ExtentReportFinalExtendsClass implements ITestListener {
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("execution started");
	}
	
	public void onTestStart(ITestResult result)
	{
		ExtentReportGeneration.createTest(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentReportGeneration.getTest().log(Status.PASS, "Test Passed");
	}
	
	  @Override
	    public void onTestFailure(ITestResult result) {
		  ExtentReportGeneration.getTest().log(Status.FAIL, "Test Failed");
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	    	ExtentReportGeneration.getTest().log(Status.SKIP, "Test Skipped");
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	    	ExtentReportGeneration.getInstances().flush();
	    }

}
