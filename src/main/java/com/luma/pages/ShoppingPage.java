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


public class ShoppingPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingPage.class.getName());

    public ShoppingPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qtyTo5;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateCartButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productNameCronusYogaPantText;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSize32Text;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColourBlackText;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement qtyIs3;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement productPrice135;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement productPrice225;

    // Change Qty to ‘5’
    public void changeOvernightDuffleQtyTo5() {
        qtyTo5.clear();
        sendTextToElement(qtyTo5, "5");
        log.info("Change Overnight Duffle Bag quantity 1 to 5" + qtyTo5.toString());
    }

    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(updateCartButton);
        log.info("Click on Update shopping Button" + updateCartButton.toString());
    }

    public void verifyTheTextShoppingCart(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(shoppingCartText), expectedMessage);
        log.info("Verify the text Shopping Cart : " + expectedMessage.toString());
    }

    public void verifyTheProductNameCronusYogaPant(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(productNameCronusYogaPantText), expectedMessage);
        log.info("Verify the Product name Cronus Yoga pant : " + expectedMessage.toString());
    }

    public void verifyTheProductSize32(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(productSize32Text), expectedMessage);
        log.info("Verify the products size 32 " + expectedMessage.toString());
    }

    public void verifyTheProductColourBlack(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(productColourBlackText), expectedMessage);
        log.info("Verify the product colour Black " + expectedMessage.toString());
    }

    public void verifyTheQtyIs3(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(qtyIs3), expectedMessage);
        log.info("Verify the Qty is 3 " + expectedMessage.toString());
    }

    public void verifyTheProductPrice135(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(productPrice135), expectedMessage);
        log.info("Verify the Product price 135 " + expectedMessage.toString());
    }

    public void verifyTheProductPrice225(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(productPrice225), expectedMessage);
        log.info("Verify the product price 225 " + expectedMessage.toString());
    }
}
