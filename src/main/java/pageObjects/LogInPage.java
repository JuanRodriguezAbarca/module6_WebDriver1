package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPage extends DriverClass {
		
	public WebElement nameLoginTextBox(){
		return getTheDriverNow().findElement(By.id("mailbox__login"));
	}
	
	public static WebElement passwordLoginTextBox(){
		return getTheDriverNow().findElement(org.openqa.selenium.By.id("mailbox__password"));
	}
	
	public WebElement logInButton(){
		return getTheDriverNow().findElement(By.id("mailbox__auth__button"));
	}
	
	public WebElement userLogged(){
		return getTheDriverNow().findElement(By.id("PH_user-email"));
	}
	
	public WebElement composeEmailButton(){
		return getTheDriverNow().findElement(By.xpath("//a[@class='b-toolbar__btn js-shortcut']"));
	}
	
	public WebElement emailReceiver(){
		return getTheDriverNow().findElement(By.xpath("//div[@class='compose__header__field js-compose-labels compose__labels']/textarea"));
	}
	
	public WebElement emailSubject(){
		return getTheDriverNow().findElement(By.xpath("//div[@class='compose__header__field__box']/input"));
	}
	
	public WebElement emailBody(){
		return getTheDriverNow().findElement(By.xpath("//body[@class='mceContentBody']/br[1]"));
	}
	
	private WebElement saveOptionButton(){
		return getTheDriverNow().findElement(By.xpath("//div[@class='b-dropdown__ctrl ']"));
	}
	
	public WebElement saveToDraftsButton(){
		saveOptionButton().click();
		return getTheDriverNow().findElement(By.xpath("//a[@data-name='saveDraft']"));
	}
	
	public WebElement goToDraftsButton(){
		return getTheDriverNow().findElement(By.xpath("//div[@class='b-nav b-nav_folders b-nav_icons']/div[3]"));
	}
	
//	public List<WebElement> getListOfDrafts(){
//		return new List<WebElement> (getTheDriverNow().findElements(By.xpath("//div[@data-mnemo='letters']/div[2]/div")));
//	}
}
