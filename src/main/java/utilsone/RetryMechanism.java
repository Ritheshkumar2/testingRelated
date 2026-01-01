package utilsone;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryMechanism implements IRetryAnalyzer{

	private static final int maxRetry=2;
	int count=0;
	
	@Override
	public boolean retry(ITestResult result) {
		while(count < maxRetry) {
			count++;
			return true;
		}
		return false;
	}
}
