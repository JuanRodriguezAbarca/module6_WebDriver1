package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.Constants;
import pageObjects.LogInPage;

public class DriverClass {
	

	
	private static WebDriver driver;
	
	
	public static WebDriver getTheDriverNow(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void setTheDriverNow(WebDriver driver){
		DriverClass.driver = driver;
	}
	
	public WebElement waitForExpectedElement(By by){
		return getTheDriverNow().findElement(by);
	}
}
