package basetestOne;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTestOne;
import pages.LoginPageOne;
import utilsone.RetryMechanism;


public class MainClassOne extends BaseTestOne{

	@BeforeTest
	public void starttest() {
		driver=getWebDriver();
	}
	
	
	@Test(retryAnalyzer=RetryMechanism.class)
	public void testTT() {
		LoginPageOne object=new LoginPageOne(driver);
		object.loginpageone();
		object.loginpagetwo();
		
	}
	
	@AfterTest
	public void closetest() {
		driver.quit();
	}
}
