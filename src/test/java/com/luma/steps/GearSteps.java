package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDuffleBagPage;
import com.luma.pages.ShoppingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GearSteps {
    @When("^I mouse hover on Gear menu$")
    public void iMouseHoverOnGearMenu() {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("^I click on Bags$")
    public void iClickOnBags() {
        new HomePage().clickOnBagsLink();
    }

    @And("^I click on product name Overnight Duffle$")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnProductNameOvernightDuffle();
    }

    @And("^verify the Overnight duffle text \"([^\"]*)\"$")
    public void verifyTheOvernightDuffleText(String expectedMessage) {
        new OvernightDuffleBagPage().verifyTheTextOvernightDuffle(expectedMessage);
    }

    @And("^I change Qty (\\d+)$")
    public void iChangeQty(int number) {
        new OvernightDuffleBagPage().changeQty1To3();
    }

    @And("^I click on Add to cart button on overnight duffle$")
    public void iClickOnAddToCartButtonOnOvernightDuffle() {
        new OvernightDuffleBagPage().clickOnAddToCartButtonInOvernightDuffleBag();

    }


    @And("^verify the product added to shopping cart text \"([^\"]*)\"$")
    public void verifyTheProductAddedToShoppingCartText(String expectedMessage) {
        new OvernightDuffleBagPage().verifyTheTextYouAddedOvernightDuffleToYourShoppingCart(expectedMessage);
    }

    @And("^click on Shopping cart link into message$")
    public void clickOnShoppingCartLinkIntoMessage() {
        new OvernightDuffleBagPage().clickOnShoppingCartLinkIntoMessage();

    }

    @And("^verify the Cronus Yoga Pant product name \"([^\"]*)\"$")
    public void verifyTheCronusYogaPantProductName(String expectedMessage) {
        new ShoppingPage().verifyTheProductNameCronusYogaPant(expectedMessage);
    }

    @And("^verify the Qty is \"([^\"]*)\"$")
    public void verifyTheQtyIs(String expectedMessage) {
        new ShoppingPage().verifyTheQtyIs3(expectedMessage);

    }

    @And("^verify the product price \"([^\"]*)\"$")
    public void verifyTheProductPrice(String expectedMessage) {
        new ShoppingPage().verifyTheProductPrice135(expectedMessage);
    }

    @And("^I change Qty to \"([^\"]*)\"$")
    public void iChangeQtyTo(String expectedMessage) {
        new ShoppingPage().changeOvernightDuffleQtyTo5();
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String expectedMessage) {
        new ShoppingPage().clickOnUpdateShoppingCartButton();
    }

    @Then("^verify the product price change \"([^\"]*)\"$")
    public void verifyTheProductPriceChange(String expectedMessage) {
        new ShoppingPage().verifyTheProductPrice225(expectedMessage);
    }
}
