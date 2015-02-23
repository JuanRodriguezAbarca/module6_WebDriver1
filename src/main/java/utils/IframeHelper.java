package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeHelper extends DriverClass{
	
	
	public static void goToFrameByID(String path){
		WebElement resultFrame = getTheDriverNow().findElement(By.cssSelector(path));
		getTheDriverNow().switchTo().defaultContent();
		getTheDriverNow().switchTo().frame(resultFrame);
	}
	
	public static void driverBackToMain(){
		getTheDriverNow().switchTo().defaultContent();
	}

}
