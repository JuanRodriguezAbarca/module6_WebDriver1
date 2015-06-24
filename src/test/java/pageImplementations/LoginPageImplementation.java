package pageImplementations;

import pageObjects.LogInPage;
import utils.AbstractPage;
import utils.DriverClass;

public class LoginPageImplementation extends AbstractPage{
	
	public void loginMethod(){
		loginPage.nameLoginTextBox().clear();
		loginPage.nameLoginTextBox().sendKeys(constants.USERNAME);
		loginPage.idNextButton().click();
		LogInPage.passwordLoginTextBox().clear();
		LogInPage.passwordLoginTextBox().sendKeys(constants.PASSWORD);
		if (loginPage.rememberMeButton().isSelected()) loginPage.rememberMeButton().click();
		loginPage.logInButton().click();
	}
	
	
	
}
