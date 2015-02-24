package tests;

import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
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
		getTheDriverNow().get("https://mail.ru/");
		System.out.println("Site Loaded!!!");
	}
	
	@AfterClass(description="Closing Browser",alwaysRun=true)
	public void tearDown(){
		getTheDriverNow().quit();
	}

	@Test(description="Login the application")
	public void logInTest(){
		String titulo = getTheDriverNow().getTitle();
		System.out.println(titulo);
		System.out.println("trying to find anything");
		loginPage.nameLoginTextBox().clear();
		loginPage.nameLoginTextBox().sendKeys(constants.USERNAME);
		LogInPage.passwordLoginTextBox().clear();
		LogInPage.passwordLoginTextBox().sendKeys(constants.PASSWORD);
		loginPage.logInButton().click();
		String userLogged = loginPage.userLogged().getText();
		System.out.println(userLogged);
		//The test:
		Assert.assertTrue(userLogged.contains(constants.USERNAME));
	}
	
	@Test(description="Save Email To Draft", dependsOnMethods="logInTest")
	public void sendEmail() throws Throwable{
		loginPage.composeEmailButton().click();
		
		loginPage.emailReceiver().sendKeys(constants.RECIVER);
		loginPage.emailSubject().sendKeys("TestWebDriver");

		IframeHelper.goToFrameByID(constants.IFRAMEBODYMAIL);
		loginPage.emailBody().sendKeys(constants.SUBJECT);
		IframeHelper.driverBackToMain();
		Thread.sleep(5000);
		System.out.println("Before click Save");
		loginPage.saveToDraftsButton().sendKeys("\n");
		System.out.println("Before go to Drafts");
		loginPage.goToDraftsButton().click();
		System.out.println("Before click alert");
		JavascriptExecutor js = (JavascriptExecutor) getTheDriverNow();
		
/**
 * Solution Found in internet related with the error: JavaScript Error: "e is null" 
 */
//		while (true) // Handle timeout somewhere
//		{
//		boolean ata = (Boolean) js
//		.executeScript("return jQuery.active == 0");
//		if (ata)
//		break;
//		try {
//		Thread.sleep(1000);
//		} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		}
//		} 
		Thread.sleep(5000);
		getTheDriverNow().switchTo().alert().accept();
		
		
	}

}
