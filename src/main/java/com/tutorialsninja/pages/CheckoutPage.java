package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
   WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country ;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement state;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonguest;
    @CacheLookup
    @FindBy(xpath = "agree")
    WebElement termsandCondition;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonpayment ;
    @CacheLookup
    @FindBy(xpath = "//div[text()='Warning: Payment method required!']")
    WebElement warningMessageText;
    @CacheLookup
    @FindBy(xpath = "textarea")
    WebElement textArea;

    public void enterFirstname(){
        Reporter.log("Enter FristName" + firstName.toString());
        sendTextToElement(firstName,"Jennie");
        CustomListeners.test.log(Status.PASS,"Enter FristName" );

    }
    public void enterLastName(){
        Reporter.log("Enter LastName" + lastName.toString());
        sendTextToElement(lastName,"Smiths");
        CustomListeners.test.log(Status.PASS,"Enter LastName");

    }
    public void enterEmail(){
        Reporter.log("Enter Email" + email.toString());
        sendTextToElement(email,"jsmith@gmail.com");
        CustomListeners.test.log(Status.PASS,"Enter Email");

    }
    public void enterTelephone(){
        Reporter.log("Enter TelePhone" + telephone.toString());
        sendTextToElement(telephone,"07568349672");
        CustomListeners.test.log(Status.PASS,"Enter TelePhone" );

    }
    public void enterAddress() {
        Reporter.log("Enter Your Address" + address.toString());
        sendTextToElement(address, "Hollin Street");
        CustomListeners.test.log(Status.PASS,"Enter Address" );

    }
    public void enterCity(){
        Reporter.log("Enter City name" + city.toString());
        sendTextToElement(city,"London");
        CustomListeners.test.log(Status.PASS,"Enter City Name" );

    }
    public void enterPostcode(){
        Reporter.log("Enter PostCode " + postcode.toString());
        sendTextToElement(postcode,"A12 3BC");
        CustomListeners.test.log(Status.PASS,"Enter PostCode ");

    }
    public void enterCountry(){
        Reporter.log("Enter Country Name " + country.toString());
        sendTextToElement(country,"United Kingdom");
        CustomListeners.test.log(Status.PASS,"Enter Country Name " );

    }
    public void enterState(){
        Reporter.log("Enter State " + state.toString());
        sendTextToElement(state,"Surrey");
        CustomListeners.test.log(Status.PASS,"Enter State " );

    }
    public void clickContinueButtonguest(){
        Reporter.log("Continue With Guest Button" + continueButtonguest.toString());
        clickOnElement(continueButtonguest);
        CustomListeners.test.log(Status.PASS,"Continue With Guest Button" );

    }
    public void enterCommentInTextAea(){
        Reporter.log("Enter Comment " + textArea.toString());
        sendTextToElement(textArea,"Thank You");
        CustomListeners.test.log(Status.PASS,"Enter Comment " );

    }

    public void checkTermsAndConditionCheckBox(){
        Reporter.log("Terms And Conditions " + termsandCondition.toString());
        clickOnElement(termsandCondition);
        CustomListeners.test.log(Status.PASS,"Terms And Conditions " );

    }

    public void clickContinueButtonPayment(){
        Reporter.log("Continue With Payment" + continueButtonpayment.toString());
        clickOnElement(continueButtonpayment);
        CustomListeners.test.log(Status.PASS,"Continue With Payment " );

    }

    public String GetWarningMessageText(){

        Reporter.log("Warning Message" + warningMessageText.toString());
        CustomListeners.test.log(Status.PASS,"Warning Message" );
        return getTextFromElement(warningMessageText);
    }
}

