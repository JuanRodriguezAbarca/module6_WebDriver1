package pageObjects;

import org.openqa.selenium.WebDriver;

public class DriverClass {
	
	private WebDriver driver;
	
	public WebDriver getTheDriverOstias(){
		return driver;
	}
	
	public void setTheDriverOstias(WebDriver driver){
		this.driver = driver;
	}

}
