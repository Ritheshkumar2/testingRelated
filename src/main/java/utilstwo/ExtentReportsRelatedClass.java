package utilstwo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsRelatedClass { 

	private static ThreadLocal<ExtentReports> extent=new ThreadLocal<>();
	
	//We are not creating ExtentReports twice.
	//We are declaring one ThreadLocal container and one actual ExtentReports object per thread.
	
	//ThreadLocal --> A locker system where each thread has its own locker
	//Inside each locker → one ExtentReports object
	
	public static ExtentReports getinstance() {
		
		if(extent.get() == null) {
			ExtentSparkReporter es=new ExtentSparkReporter("");
			ExtentReports reports=new ExtentReports();
			reports.attachReporter(es);
			
			extent.set(reports);
			
		}
		return extent.get();
		
	}
	
	
	
}
