package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountRegisterPage extends Utility {

    @CacheLookup
    @FindBy(name= "firstname")
    WebElement firstName ;
    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastName ;
    @CacheLookup
    @FindBy(name = "email")
    WebElement email ;
    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone ;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath ="(//input[@type='radio'])[2]")

    WebElement subscribeRadioButton;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicyCheckBox ;
    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountHasBeenCreatedText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickContinueButton;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink ;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText ;
    public void enterFirstName(){
        CustomListeners.test.log(Status.PASS,"Enter FirstName" );
        Reporter.log("Enter FirstName" + firstName.toString());
        sendTextToElement(firstName,"Jennie");
    }
    public void enterLastName(){
        CustomListeners.test.log(Status.PASS,"Enter LastName" );
        Reporter.log("Enter LastName" + lastName.toString());
        sendTextToElement(lastName,"Smiths");
    }
    public void enterEmail(){
        CustomListeners.test.log(Status.PASS,"Enter Email Address" );
        Reporter.log("Enter Email Address" + email.toString());

        sendTextToElement(email,"jsmith@gmail.com");

    }
    public void enterTelephone(){
        CustomListeners.test.log(Status.PASS,"Enter Telephone" );
        Reporter.log("Enter Telephone" + telephone.toString());
        sendTextToElement(telephone,"07899442222");

    }
    public void enterPassword(){
        CustomListeners.test.log(Status.PASS,"Enter Password" );
        Reporter.log("Enter Password" + password.toString());
        sendTextToElement(password, "Xyz123");
    }
    public void enterConfirmPassword(){
        CustomListeners.test.log(Status.PASS,"Enter ConfirmPassword" );
        Reporter.log("Enter ConfirmPassword" + confirmPassword.toString());
        sendTextToElement(confirmPassword, "Xyz123");

    }
    public void selectSubscribeYesRadioButton(){
        CustomListeners.test.log(Status.PASS,"Select Subscribe Yes Radio Button" );
        Reporter.log("Select Subscribe Yes Radio Button" + subscribeRadioButton.toString());
        clickOnElement(subscribeRadioButton);

    }
    public void clickPrivacyPolicyCheckbox(){
        CustomListeners.test.log(Status.PASS,"Click On  Private Policy CheckBox" );
        Reporter.log("Click On Private Policy CheckBox" + privacyPolicyCheckBox.toString());

        clickOnElement(privacyPolicyCheckBox);

    }
    public void clickOnContinueButton(){

        CustomListeners.test.log(Status.PASS," Click On Continue Button" );
        Reporter.log("Click On Continue Button" + continueButton.toString());
        clickOnElement(continueButton);
    }
    public String getAccountHasBeenCreatedText(){
        CustomListeners.test.log(Status.PASS," Get Account Has Been Created Text" );
        Reporter.log(" Get Account Has Been Created Text" + accountHasBeenCreatedText.toString());
        return getTextFromElement(accountHasBeenCreatedText);

    }
    public void clickOnContinueButtonAgain(){
        CustomListeners.test.log(Status.PASS,"Click On ContinueButton Button Again" );
        Reporter.log("Click On ContinueButton Button Again" + password.toString());
        clickOnElement(clickContinueButton);

    }
    public void clickOnMyAccountLink(){
        CustomListeners.test.log(Status.PASS,"Click On My Account Link" );
        Reporter.log("Click On My Account Link" + myAccountLink.toString());
        clickOnElement(myAccountLink);

    }
    public String getAccountLogoutText()
    {
        CustomListeners.test.log(Status.PASS,"Get Account Log Out Text" );
        Reporter.log("Get Account Log Out Text" + password.toString());
        return getTextFromElement(accountLogoutText);
    }


}

