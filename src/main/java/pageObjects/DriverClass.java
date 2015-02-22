package pageObjects;

import org.openqa.selenium.WebDriver;

public class DriverClass {
	
	private static WebDriver driver;
	
	public static WebDriver getTheDriverNow(){
		return driver;
	}
	
	public void setTheDriverNow(WebDriver driver){
		DriverClass.driver = driver;
	}

}
