package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	//ThreadLocal is a Java class that allows you to create thread-safe variables	
	//ThreadLocal ensures each test thread gets its own WebDriver
	//If you remove static, ThreadLocal will NOT work for parallel execution.
	
	
	public static void setDriver() {
		driver.set(new ChromeDriver());
	
	}
	
	public static WebDriver getDriver() {
		return driver.get();
		
	}
	
	public static void removeDriver() {
		driver.remove();  //manages memory leakage
	}

}
