package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountLoginPage extends Utility {


    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddress ;
    @CacheLookup
    @FindBy(name ="password" )
    WebElement enterPassword ;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountText ;



    public void enterEmailAddress(){
        CustomListeners.test.log(Status.PASS,"Enter Email" );
        Reporter.log("Enter Email" + emailAddress.toString());
        sendTextToElement(emailAddress,"jsmith@gmail.com");

    }
    public void enterValidPassword(){
        CustomListeners.test.log(Status.PASS,"Enter Password" );
        Reporter.log("Entetr Password" + enterPassword.toString());
        sendTextToElement(enterPassword,"Xyz123");

    }
    public void clickOnLoginButton(){
        CustomListeners.test.log(Status.PASS,"Click On Login Button" );
        Reporter.log("Click On Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }
    public String getMyAccountText(){
        CustomListeners.test.log(Status.PASS,"Get MyAccount Text" );
        Reporter.log("Get MyAccount Text" + myAccountText.toString());
        return getTextFromElement(myAccountText);
    }
}