package basetest;

import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.Loginpage;

//@Listeners(utils.ExtentReportFinalExtendsClass.class)
public class MainClass3 extends BaseTest {
	
	@BeforeClass
	public void setUp() {
		setDriver(); 
		getDriver().get("https://datatables.net/examples/basic_init/alt_pagination.html");
		getDriver().manage().window().maximize();
		System.out.println("we are in main class");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test(priority=1)
	public void loginTest() {
		Loginpage object=new Loginpage(getDriver());
		object.loginpage();
		
	}
	
	@Test(priority=2)
	public void homeTest() {
		HomePage object=new HomePage();
		object.homepage();
		
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}

}
