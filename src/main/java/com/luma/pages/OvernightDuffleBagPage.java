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


public class OvernightDuffleBagPage extends Utility {

    private static final Logger log = LogManager.getLogger(OvernightDuffleBagPage.class.getName());

    public OvernightDuffleBagPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeQty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overnightDuffleText;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement overnightDuffleAddToShoppingCart;

    public void verifyTheTextOvernightDuffle(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(overnightDuffleText), expectedMessage);
        log.info("Verify the text Overnight Duffle " + expectedMessage.toString());
    }

    public void verifyTheTextYouAddedOvernightDuffleToYourShoppingCart(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(overnightDuffleAddToShoppingCart), expectedMessage);
        log.info("Verify the text You added overnight duffle to your shopping cart " + expectedMessage.toString());
    }

    // Change Qty 3
    public void changeQty1To3() {
        changeQty.clear();
        sendTextToElement(changeQty, "3");
        log.info("Change Quantity 1 to 3" + changeQty.toString());

    }

    // Click on ‘Add to Cart’ Button.
    public void clickOnAddToCartButtonInOvernightDuffleBag() {
        clickOnElement(addToCartButton);
        log.info("Click on Add to Cart Button" + addToCartButton.toString());
    }

    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCartLinkIntoMessage() {
        clickOnElement(shoppingCartLink);
        log.info("Click On Shopping Cart Link" + shoppingCartLink.toString());
    }


}
