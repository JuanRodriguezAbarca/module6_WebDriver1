package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class DriverClass {
	
	private static WebDriver driver;
	
	
	public static WebDriver getTheDriverNow(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void setTheDriverNow(WebDriver driver){
		DriverClass.driver = driver;
	}

}
