package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import utils.DriverClass;

public class LogInPage extends DriverClass {
		
	public WebElement nameLoginTextBox(){
		return getTheDriverNow().findElement(By.id("Email"));
	}
	
	public static WebElement passwordLoginTextBox(){
		return getTheDriverNow().findElement(org.openqa.selenium.By.id("Passwd"));
	}
	
	public WebElement logInButton(){
		return getTheDriverNow().findElement(By.id("signIn"));
	}
	
	public WebElement rememberMeButton(){
		return getTheDriverNow().findElement(By.id("PersistentCookie"));
	}
	
	public WebElement userLogged(){
		return getTheDriverNow().findElement(By.xpath("//div[@id='gb']/div/div/div/div[3]/div/a"));
	}
	
	public WebElement composeEmailButton(){
		return getTheDriverNow().findElement(By.xpath("//div[@id=':3r']/div/div"));
	}
	
	public WebElement emailReceiver(){
		return getTheDriverNow().findElement(By.xpath("//div[@class='AD']//table//table[1]//tr[1]/td[2]"));
	}
	
	public WebElement emailSubject(){
		return getTheDriverNow().findElement(By.xpath("//div[@class='AD']/div/div/div[3]/div/div/div[4]//td[2]/form/div[3]/input"));
	}
	
	public WebElement emailBody(){
		return getTheDriverNow().findElement(By.xpath("//div[@class='AD']/div/div/div[3]/div/div/div[4]//td[2]/table//tr[1]/td[1]/div[1]/div[1]"));
	}
	
	public WebElement goToDraftsButton(){
		return getTheDriverNow().findElement(By.xpath("//div[@class='b-nav b-nav_folders b-nav_icons']/div[3]/a"));
	}
	
	public WebElement saveToDraftsButton(){
	return getTheDriverNow().findElement(By.xpath("//div[@id='b-toolbar__right']/div[3]/div/div[2]/div[2]"));
}
	
	public WebElement sendEmailButton(){
		return getTheDriverNow().findElement(By.xpath("//div[@class='b-nav b-nav_folders b-nav_icons']/div[2]/a"));
	}
	

	
	public List<WebElement> getListOfDrafts(){
		return getTheDriverNow().findElements(By.xpath("//div[@class='b-datalist__item__body']/a"));
	}
}
