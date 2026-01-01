package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestOne {
	
	protected WebDriver driver;
	
	public WebDriver getWebDriver() {
		if(driver == null) {
			driver =new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		return driver;
	}
	

}
