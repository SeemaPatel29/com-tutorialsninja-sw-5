package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement mouseHoverDesktop;
    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement clickDesktop;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectSortZToA;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectSortAToZ;
    @CacheLookup
    @FindBy( xpath= "//a[contains(text(),'HP LP3065')]")
    WebElement selectProduct ;
    @CacheLookup
    @FindBy( name= "quantity")
    WebElement enterQty;
    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartClick ;
    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'HP LP3065')]")
    WebElement hpText;

    @CacheLookup
    @FindBy(xpath= "//div[@class='alert alert-success alert-dismissible']")
    WebElement successText ;
    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingcartText ;
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'HP LP3065')])[2]")
    WebElement hpProductText ;
    @CacheLookup
    @FindBy(xpath= "//td[normalize-space()='Product 21']")
    WebElement product21Text ;
    @CacheLookup
    @FindBy(xpath= "//td[@class='text-right'][normalize-space()='£74.73'])[4]")
    WebElement totalcostText ;

    @CacheLookup
    @FindBy(xpath= "//small[normalize-space()='Delivery Date:2023-11-30']")
    WebElement deliveryDateText ;



    public void selectSortByAToZ() {
        CustomListeners.test.log(Status.PASS,"DeskTop " );
        Reporter.log(" DeskTop" + selectSortAToZ.toString());
        selectByVisibleTextFromDropDown(selectSortAToZ, "Name (A - Z)");
    }

    public void mouseHoverAndClickDesktops() {
        CustomListeners.test.log(Status.PASS,"Show AllDesktops " );
        Reporter.log("Show AllDesktops " + mouseHoverDesktop.toString());
        mouseHoverToElementAndClick(mouseHoverDesktop);
    }

    public void clickOnShowAllDeskTops() {
        CustomListeners.test.log(Status.PASS," Input-Sort By Z To A " );
        Reporter.log("Input-Sort By Z To A " + clickDesktop.toString());
        clickOnElement(clickDesktop);
    }

    public void selectSortByZToA() {
        CustomListeners.test.log(Status.PASS," Input-Sort By Z To A" );
        Reporter.log("Input-Sort By Z To A" + selectSortZToA.toString());
        selectByVisibleTextFromDropDown(selectSortZToA, "Name (Z - A)");
    }

    public void selectProduct() {
        CustomListeners.test.log(Status.PASS," Select HP LP3065 " );
        Reporter.log(" Select HP LP3065" + selectProduct.toString());
        clickOnElement(selectProduct);
    }

    public void addToCart() {
        CustomListeners.test.log(Status.PASS," Add To Cart And Click" );
        Reporter.log(" Add To Cart And Click" + addToCartClick.toString());
        clickOnElement(addToCartClick);
    }

    public String getHPText(){
        CustomListeners.test.log(Status.PASS," HP LP3065" );
        Reporter.log("HP LP3065 " + hpText.toString());
        return getTextFromElement(hpText);
    }
    public String getSuccessMessageText(){
        CustomListeners.test.log(Status.PASS,"Added Successfully " );
        Reporter.log("Added Successfully  " + successText.toString());
        return getTextFromElement(successText);
    }

    public String getShoppingcartText(){
        CustomListeners.test.log(Status.PASS,"Added To Shopping Cart " );
        Reporter.log("Added To Shopping Cart  " + shoppingcartText.toString());
        return getTextFromElement(shoppingcartText);
    }

    public String getHPProdcutText(){
        CustomListeners.test.log(Status.PASS,"HP Product" );
        Reporter.log("HP Product" + hpProductText.toString());
        return getTextFromElement(hpProductText);
    }
    public String getProdcut21Text(){
        CustomListeners.test.log(Status.PASS,"List Of Product " );
        Reporter.log("List Of Product" + product21Text.toString());
        return getTextFromElement(product21Text);
    }
    public String getTotalCostText(){
        CustomListeners.test.log(Status.PASS,"Total Cost " );
        Reporter.log("Total Cost" + totalcostText.toString());
        return getTextFromElement(totalcostText);
    }
    public String getdeliveryDateText(){
        CustomListeners.test.log(Status.PASS," Enter Delivery Date" );
        Reporter.log("Enter Delivery Date " + deliveryDateText.toString());
        return getTextFromElement(deliveryDateText);
    }

    public void verifyProductArrangeInDescendingOrder() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);

    }

    public void selectDeliveryDate() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

}
