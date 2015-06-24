package pageObjects;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




import utils.AbstractPage;
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
	
	public WebElement idNextButton(){
		return waitForExpectedElement(By.id("next"));
	}
	
	public WebElement rememberMeButton(){
		return getTheDriverNow().findElement(By.id("PersistentCookie"));
	}
	
	public WebElement userLogged(){
		return waitForExpectedElement(By.xpath("//a[@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']"));
	}
	
	public WebElement composeEmailButton(){
		return waitForExpectedElement(By.xpath("//div[@gh='cm']"));
	}
	
	public WebElement emailReceiver(){
		return getTheDriverNow().findElement(By.xpath("//div[@id=':ig']//textarea"));
	}
	
	public WebElement emailSubject(){
		return getTheDriverNow().findElement(By.xpath("//div[@id=':kb']//input"));
	}
	
	public WebElement emailBody(){
		return getTheDriverNow().findElement(By.xpath("//div[@id=':lc']"));
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
