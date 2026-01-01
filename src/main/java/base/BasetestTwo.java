package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasetestTwo {
	
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public static void setdriverOne() {
		driver.set(new ChromeDriver());
	}
	
	public static WebDriver getDriverOne() {
		return driver.get();
		
	}
	
	public static void removeDriver() {
		driver.remove();
	}

}
