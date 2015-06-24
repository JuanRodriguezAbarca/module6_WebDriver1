package tests;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
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

import pageImplementations.LoginPageImplementation;
import pageObjects.Constants;
import pageObjects.LogInPage;
import utils.AbstractPage;
import utils.DriverClass;
import utils.IframeHelper;

public class LoginPageTest extends AbstractPage{
	
	LoginPageImplementation logInImplementation = new LoginPageImplementation();
	
	@BeforeClass(description="WebDriver set up")
	public void initTesting(){
		setTheDriver(new FirefoxDriver(), "https://gmail.com");
	}
	

	@AfterClass(description="Closing Browser",alwaysRun=true)
	public void tearDown(){
		stopTheDriver();
	}

	@Test
	public void logInTest(){
		String titulo = getTheDriverNow().getTitle();
		System.out.println(titulo);
		System.out.println("trying to find anything");
		logInImplementation.loginMethod();
		String userLogged = loginPage.userLogged().getText();
		System.out.println(userLogged);
		//The test:
		assertTrue("Wrong or no user logged in"+ userLogged, userLogged.contains(constants.RECIVER));
	}
	
	@Test
	public void sendEmailToDrafts() throws Throwable{
		loginPage.composeEmailButton().click();
		System.out.println("Compose the mail");
		
//		IframeHelper.goToFrameByID(path);
		loginPage.emailReceiver().sendKeys(constants.RECIVER);
		loginPage.emailSubject().sendKeys(constants.TOPIC);

		loginPage.emailBody().sendKeys(constants.SUBJECT);
		IframeHelper.driverBackToMain();
		Thread.sleep(5000);
		System.out.println("Before click Save");
		loginPage.saveToDraftsButton().sendKeys("\n");
		System.out.println("Before go to Drafts");
		loginPage.goToDraftsButton().click();
		System.out.println("Before click alert");
		
	}
		



} 
