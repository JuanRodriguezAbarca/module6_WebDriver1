package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Constants;
import pageObjects.LogInPage;
import utils.DriverClass;
import utils.IframeHelper;

public class LoginPageTest extends DriverClass{
	
	LogInPage loginPage = new LogInPage();
	Constants constants = new Constants();
	IframeHelper frameHelper =  new IframeHelper();
	
	@BeforeClass(description="WebDriver set up")
	public void initTesting(){
		setTheDriverNow(new FirefoxDriver());
		getTheDriverNow().manage().window().maximize();
		getTheDriverNow().get("https://gmail.com");
		System.out.println("Site Loaded!!!");
	}
	
	@AfterClass(description="Closing Browser",alwaysRun=true)
	public void tearDown(){
		getTheDriverNow().quit();
	}

	@Test(description="Login the application", priority=0)
	public void logInTest(){
		String titulo = getTheDriverNow().getTitle();
		System.out.println(titulo);
		System.out.println("trying to find anything");
		loginPage.nameLoginTextBox().clear();
		loginPage.nameLoginTextBox().sendKeys(constants.USERNAME);
		loginPage.passwordLoginTextBox().clear();
		loginPage.passwordLoginTextBox().sendKeys(constants.PASSWORD);
		if (loginPage.rememberMeButton().isSelected()) loginPage.rememberMeButton().click();
		loginPage.logInButton().click();
		String userLogged = loginPage.userLogged().getText();
		System.out.println(userLogged);
		//The test:
		AssertJUnit.assertTrue(userLogged.contains(constants.RECIVER));
	}
	
	@Test(description="Save Email To Draft", dependsOnMethods="logInTest", priority=5)
	public void sendEmailToDrafts() throws Throwable{
		loginPage.composeEmailButton().click();
		System.out.println("Compose the mail");
		Thread.sleep(5000);
		
		loginPage.emailReceiver().sendKeys(constants.RECIVER);
		loginPage.emailSubject().sendKeys(constants.TOPIC);

		loginPage.emailBody().sendKeys(constants.SUBJECT);
//		IframeHelper.driverBackToMain();
		Thread.sleep(5000);
		System.out.println("Before click Save");
//		loginPage.saveToDraftsButton().sendKeys("\n");
//		System.out.println("Before go to Drafts");
//		loginPage.goToDraftsButton().click();
//		System.out.println("Before click alert");
		
	}
		

//	
//	@Test(description="Open Drafts and sent the mail", dependsOnMethods="logInTest", priority=2, alwaysRun=false)
//	public void sendEmailFromDrafts()throws Throwable{
//		loginPage.goToDraftsButton().click();
//		Thread.sleep(5000);
//		for (WebElement mail:loginPage.getListOfDrafts()){
//			String mailSubject= mail.getAttribute("title");
//			System.out.println("Title found: "+mailSubject);
//			if (mailSubject.contains(constants.RECIVER)){
//				System.out.println("Proceeding to click on mail "+mailSubject);
//				Thread.sleep(5000);
//				mail.click();
//			}
//		}
//		System.out.println("Changing the frame in case is necessary");
//		IframeHelper.driverBackToMain();
//		System.out.println("Calling the wait");
//		WebDriverWait wait = new WebDriverWait(getTheDriverNow(), 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='b-nav b-nav_folders b-nav_icons']/div[2]/a")));
//		System.out.println("Send email should be clickable now");
//		loginPage.sendEmailButton().click();
//	}

} 
