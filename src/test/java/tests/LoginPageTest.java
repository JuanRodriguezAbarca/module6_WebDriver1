package tests;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Constants;
import pageObjects.DriverClass;
import pageObjects.LogInPage;

public class LoginPageTest extends DriverClass{
	
	pageObjects.LogInPage loginPage = new pageObjects.LogInPage();
	Constants constants = new Constants();
	
	@BeforeClass(description="WebDriver set up")
	public void initTesting(){
		setTheDriverOstias(new FirefoxDriver());
		getTheDriverOstias().manage().window().maximize();
		getTheDriverOstias().get("https://mail.ru/");
		System.out.println("Site Loaded!!!");
	}
	
	@AfterClass(description="Closing Browser",alwaysRun=true)
	public void tearDown(){
		getTheDriverOstias().close();
	}

	@Test(description="Login the application")
	public void logInTest(){
		String titulo = getTheDriverOstias().getTitle();
		System.out.println(titulo);
		System.out.println("trying to find anything");
		loginPage.nameLoginTextBox().clear();
		loginPage.nameLoginTextBox().sendKeys(constants.USERNAME);
		loginPage.passwordLoginTextBox().clear();
		loginPage.passwordLoginTextBox().sendKeys(constants.PASSWORD);
		loginPage.logInButton().click();
		String userLogged = loginPage.userLogged().getText();
		System.out.println(userLogged);

		Assert.assertTrue(userLogged.contains(constants.USERNAME));
	}

}
