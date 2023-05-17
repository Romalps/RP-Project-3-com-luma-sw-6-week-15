package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenSteps {
    @When("^I mouse hover on Men menu$")
    public void iMouseHoverOnMenMenu() {
        new HomePage().mouseHoverMenMenu();
    }

    @And("^I moose hover on Bottoms$")
    public void iMooseHoverOnBottoms() {
        new HomePage().mouseHoverOnBottoms();
    }

    @And("^I click on Pants$")
    public void iClickOnPants() {
        new HomePage().clickOnPantsLink();
    }

    @And("^I mouse hover on Product name Cronus Yoga pant$")
    public void iMouseHoverOnProductNameCronusYogaPant() {
        new MenPage().mouseHoverOnProductNameCronusYogaPant();
    }

    @And("^I click on size (\\d+)$")
    public void iClickOnSize(int number) {
        new MenPage().clickOnCronusYogaPantSize32();
    }

    @And("^I click on colour Black$")
    public void iClickOnColourBlack() {
        new MenPage().clickOnCronusYogaPantColourBlack();
    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() {
        new MenPage().addCronusYogaPantToCart();
    }

    @And("^verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expectedMessage) {
        new MenPage().verifyTheTextYouAddedCronusYogaPantToYourShoppingCart(expectedMessage);
    }

    @And("^I click on Shopping Cart Link into message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnShoppingCartLinkIntoMessage();

    }

    @And("^verify the text on \"([^\"]*)\"$")
    public void verifyTheTextOn(String expectedMessage) {
        new ShoppingPage().verifyTheTextShoppingCart(expectedMessage);
    }

    @And("^Verify the product name \"([^\"]*)\"$")
    public void verifyTheProductName(String expectedMessage) {
        new ShoppingPage().verifyTheProductNameCronusYogaPant(expectedMessage);
    }

    @And("^verify the product size \"([^\"]*)\"$")
    public void verifyTheProductSize(String expectedMessage) {
        new ShoppingPage().verifyTheProductSize32(expectedMessage);

    }

    @Then("^verify the product colour \"([^\"]*)\"$")
    public void verifyTheProductColour(String expectedMessage) {
        new ShoppingPage().verifyTheProductColourBlack(expectedMessage);
    }


}
