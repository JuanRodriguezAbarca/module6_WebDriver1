package pageObjects;

import org.openqa.selenium.WebDriver;

public class DriverClass {
	
	private static WebDriver driver;
	
	public static WebDriver getTheDriverOstias(){
		return driver;
	}
	
	public void setTheDriverOstias(WebDriver driver){
		DriverClass.driver = driver;
	}

}
