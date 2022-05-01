package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText=By.tagName("h2");
    By usernameField=By.id("username");
    By passwordField=By.name("password");
    By loginButton =By.xpath("//button[@type='submit']");
    By errorMessage=By.xpath("//div[@id='flash']");


    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void enterUserName(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }


}
