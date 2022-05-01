package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage logInPage=new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        logInPage.enterUserName("tomsmith");
        logInPage.enterPassword("SuperSecretPassword!");
        logInPage.clickOnLoginButton();

        String expectedText = "Secure Area";
        String actualText = logInPage.getWelcomeText();

        Assert.assertEquals("Unsuccessful Login", expectedText, actualText);
    }
    @Test
    public void verifyTheUsernameErrorMessage() {
        logInPage.enterUserName("tomsmith1");
        logInPage.enterPassword("SuperSecretPassword!");
        logInPage.clickOnLoginButton();
        String expectedResult = "Your username is invalid!\n"+"×";
        String actualResult =logInPage.getErrorMessage();
        Assert.assertEquals("Invalid Username", expectedResult, actualResult);
    }

    @Test
    public void verifyThePasswordErrorMessage() {
        logInPage.enterUserName("tomsmith");
        logInPage.enterPassword("SuperSecretPassword");
        logInPage.clickOnLoginButton();
        String expectedResult = "Your password is invalid!\n"+"×";
        String actualResult =logInPage.getErrorMessage();
        Assert.assertEquals("Invalid Password", expectedResult, actualResult);
    }

}
