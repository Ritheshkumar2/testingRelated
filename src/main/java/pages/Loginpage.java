package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Config;

public class Loginpage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	//this.driver = driver;
	//driver (right side) = the WebDriver coming from your test class
	//this.driver (left side) = the WebDriver variable inside your LoginPage class
	//This assigns the test driver → to the current page class.
	//here test class means its coming from MainClass
	//TEST CLASS → sends driver → PAGE CLASS
	
	
	//PageFactory.initElements(driver, this);
	//This does two important things:
	//Scans your class for @FindBy elements
	//Initializes them using the driver you passed
	//this refers to the present class instance
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	}
	
	@FindBy(xpath="(//a[contains(text(),'Advanced initialisation')])[2]")
	WebElement btn;
	
	By ele=By.xpath("(//a[contains(text(),'Data sources')])[2]");
	
	public void loginpage() {
		
		String name=Config.get("testRunBy");
		System.out.println(name);
		
		System.out.print("Current URL:"+driver.getCurrentUrl());
		
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(ele));
//		driver.findElement(ele).click();
		
		
	}

}
