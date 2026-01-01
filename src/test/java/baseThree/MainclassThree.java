package baseThree;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasetestTwo;
import pages.LoginPageOne;
import pages.Loginpage;


public class MainclassThree extends BasetestTwo{
	
	@BeforeTest
	public void setUp() {
		setdriverOne();
		getDriverOne().get("https://www.google.com/");
	}
	
	@Test
	public void testThree() {
		LoginPageOne object=new LoginPageOne(getDriverOne());
		object.loginpageone();
		object.loginpagetwo();
		
	}
	
	@AfterTest
	public void tearDown() {
		getDriverOne().quit();
		removeDriver();
	}
	
	

}
