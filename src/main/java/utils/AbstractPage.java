package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.Constants;
import pageObjects.LogInPage;

public class AbstractPage extends DriverClass{
	
	protected LogInPage loginPage = new LogInPage();
	protected Constants constants = new Constants();
	

	public void setTheDriver(WebDriver driver, String url){
		setTheDriverNow(driver);
		getTheDriverNow().manage().window().maximize();
		getTheDriverNow().get(url);
		System.out.println("Site Loaded!!!");
	}
	
	public void stopTheDriver(){
		getTheDriverNow().quit();
	}
	


}
