package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeHelper extends DriverClass{
	
	
	public static void goToFrameByID(String id){
		WebElement resultFrame = getTheDriverNow().findElement(By.id(id));
		getTheDriverNow().switchTo().defaultContent();
		getTheDriverNow().switchTo().frame(resultFrame);
	}
	
	public void driverBackToMain(){
		getTheDriverNow().switchTo().defaultContent();
	}

}
