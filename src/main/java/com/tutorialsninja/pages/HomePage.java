package com.tutorialsninja.pages;
/*
* /*1. create class "TopMenuTest"
        1.1 create method with name "selectMenu" it has one parameter name "menu" of type
        string
        1.2 This method should click on the menu whatever name is passed as parameter.*/

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement mouseHoverDesktop;

   // By mouseHoverDesktop = By.linkText("Desktops");
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement mouseHoverLaptopsAndNotebooks;
    //By mouseHoverLaptopsAndNotebooks = By.linkText("Laptops & Notebooks");
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement mouseHoverComponents;
    //By mouseHoverComponents = By.linkText("Components");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopText;
    //By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopNotebookText;

    //By laptopNotebookText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;
   // By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    public void mouseHoverAndClickDesktops() {
        CustomListeners.test.log(Status.PASS,"Show All DeskTop " +mouseHoverDesktop);
        Reporter.log(" Show All DeskTop" + mouseHoverDesktop.toString());
        mouseHoverToElementAndClick(mouseHoverDesktop);
    }
    public void mouseHoverAndClickLaptopsAndNotebooks(){
        CustomListeners.test.log(Status.PASS,"Showing All Laptops And Notebooks " +mouseHoverLaptopsAndNotebooks);
        Reporter.log(" Showing AllLapTop And Notebooks" + mouseHoverLaptopsAndNotebooks.toString());
        mouseHoverToElementAndClick(mouseHoverLaptopsAndNotebooks);
    }
    public void mouseHoverAndClickComponents(){
        CustomListeners.test.log(Status.PASS,"Clicking On Showing all the Components " +mouseHoverComponents);
        Reporter.log(" Clicking On Showing all the Components" + mouseHoverComponents.toString());
        mouseHoverToElementAndClick(mouseHoverComponents);
    }
    public void selectMenu(String menu) {
        try {
            List<WebElement> list = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
            for (WebElement listOfElement : list) {
                if (listOfElement.getText().equals(menu)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> list = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
       // CustomListeners.test.log(Status.PASS,"" +);
        //Reporter.log("" + .toString());

    }
    public String getDesktopText(){
        CustomListeners.test.log(Status.PASS," Verifying DeskTop Text" );
        Reporter.log(" Verifying DeskTop Text" + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public String getLaptopsNotebooksText(){
        CustomListeners.test.log(Status.PASS,"Verify Laptop And Notebooks text " );
        Reporter.log("Verify Laptop And Notebooks Text" + laptopNotebookText.toString());
        return getTextFromElement(laptopNotebookText);
    }
    public String getComponents(){
        CustomListeners.test.log(Status.PASS,"Verify Components  Text" );
        Reporter.log("Verify Components Text" + componentsText.toString());
        return getTextFromElement(componentsText);
    }
}
