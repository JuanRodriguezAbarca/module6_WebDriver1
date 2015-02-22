package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPage extends DriverClass {
		
	public WebElement nameLoginTextBox(){
		String titulo = getTheDriverOstias().getTitle();
		System.out.println(titulo+" Ostia puta!!!!");
		System.out.println("Looking gor the userName textBox");
		return getTheDriverOstias().findElement(org.openqa.selenium.By.className("Login"));
	}
	
	public WebElement passwordLoginTextBox(){
		return getTheDriverOstias().findElement(org.openqa.selenium.By.id("mailbox__password"));
	}
	
	public WebElement logInButton(){
		return getTheDriverOstias().findElement(By.id("mailbox__auth__button"));
	}
	
	public WebElement userLogged(){
		return getTheDriverOstias().findElement(By.id("PH_user-email"));
	}
}
