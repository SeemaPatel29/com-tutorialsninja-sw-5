package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends CheckoutPage{
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartClick;
   @CacheLookup
   @FindBy(xpath = "//span[contains(text(),'Currency')]")
   WebElement currencyTabClick;
  @CacheLookup
  @FindBy(xpath = "//button[contains(text(),'£Pound Sterling')]")
  WebElement poundSterlingClick;


    public void shoppingCartClick() {
        CustomListeners.test.log(Status.PASS,"Add To Shopping Cart"  );
        Reporter.log("Add To Shopping Cart" + shoppingCartClick.toString());
        clickOnElement(shoppingCartClick);
    }

    //currency tab click
    public void clickOnCurrencyTab() {
        CustomListeners.test.log(Status.PASS,"Click On Currency"  );
        Reporter.log("Click On Currency" + currencyTabClick.toString());
        clickOnElement(currencyTabClick);
    }

    public void clickOnPoundSterling() {
        CustomListeners.test.log(Status.PASS,"Select Currency Pound Sterling" );
        Reporter.log("Select Currency Pound Sterling" + poundSterlingClick.toString());
        clickOnElement(poundSterlingClick);
    }

}
