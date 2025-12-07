package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportGeneration{
	
	private static ExtentReports extent=null;
	
	private static ThreadLocal<ExtentTest> extenttest=new ThreadLocal<>();
	
	public static ExtentReports getInstances() {
		
		if(extent == null) {
			ExtentSparkReporter sparkk=new ExtentSparkReporter(System.getProperty("user.dir")+"/extent/ExtentReports.html");
			extent=new ExtentReports();
			extent.attachReporter(sparkk);
			
			extent.setSystemInfo("OS", "Windows");
			extent.setSystemInfo("User", "TestUser"); 	
			
		}
		return extent;	
	}
	
	public static ExtentTest createTest(String testname) {
		
		ExtentTest test=getInstances().createTest(testname);
		extenttest.set(test);
		return test;
		
	}
	
	public static ExtentTest getTest() {
		return extenttest.get();
	}
}
