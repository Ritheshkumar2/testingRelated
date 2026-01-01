package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageOne {
	public WebDriver driver;
	
	public LoginPageOne(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	WebElement element;
	
	public void loginpageone() {
		System.out.println("LoginPageURL:"+driver.getCurrentUrl());
	}
	
	public void loginpagetwo() {
		Assert.fail("Forcing failure to test retry");
	}

}
