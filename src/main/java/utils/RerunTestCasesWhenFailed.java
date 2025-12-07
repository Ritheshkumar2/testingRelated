package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunTestCasesWhenFailed implements IRetryAnalyzer{

	private static final int max=2;
	private int count=0;
	@Override
	public boolean retry(ITestResult result) {
		if(count <= max) {
			count++;
			return true;
		}
		return false;
	}
	
	

}
