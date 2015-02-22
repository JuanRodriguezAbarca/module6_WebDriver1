package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPage extends DriverClass {
		
	public WebElement nameLoginTextBox(){
		return getTheDriverOstias().findElement(By.id("mailbox__login"));
	}
	
	public static WebElement passwordLoginTextBox(){
		return getTheDriverOstias().findElement(org.openqa.selenium.By.id("mailbox__password"));
	}
	
	public WebElement logInButton(){
		return getTheDriverOstias().findElement(By.id("mailbox__auth__button"));
	}
	
	public WebElement userLogged(){
		return getTheDriverOstias().findElement(By.id("PH_user-email"));
	}
}
