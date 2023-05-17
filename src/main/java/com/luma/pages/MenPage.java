package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class MenPage extends Utility {

    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement cronusYogaPantSize32;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement cronusYogaPantColourBlack;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCartLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement cronusYogaPantAddedToShoppingCartText;


    // Mouse Hover on product name Cronus Yoga Pant
    public void mouseHoverOnProductNameCronusYogaPant() {
        mouseHoverToElement(cronusYogaPant);
        log.info("Mouse Hover On product name Cronus Yoga Pant" + cronusYogaPant);
    }

    //click on size 32.
    public void clickOnCronusYogaPantSize32() {
        clickOnElement(cronusYogaPantSize32);
        log.info("Click on Cronus Yoga Pant size 32" + cronusYogaPantSize32);
    }

    //click on colour Black.
    public void clickOnCronusYogaPantColourBlack() {
        clickOnElement(cronusYogaPantColourBlack);
        log.info("Click on Cronus Yoga Pant colour Black" + cronusYogaPantColourBlack);
    }


    // click on ‘Add To Cart’ Button.
    public void addCronusYogaPantToCart() {
        clickOnElement(addToCartLink);
        log.info("Click on Add to Cart Link" + addToCartLink);

    }

    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCartLinkIntoMessage() {
        clickOnElement(shoppingCartLink);
        log.info("Click on Shopping Cart Link" + shoppingCartLink);

    }

    public String getCronusYogaPantAddedToShoppingCartText() {
        return getTextFromElement(cronusYogaPantAddedToShoppingCartText);
    }

    public void verifyTheTextYouAddedCronusYogaPantToYourShoppingCart(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getCronusYogaPantAddedToShoppingCartText()));
    }
}
