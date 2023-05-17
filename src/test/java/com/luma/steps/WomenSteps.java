package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.JacketPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomenSteps {
    @Given("^I am On Homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I mouse hover on Women menu$")
    public void iMouseHoverOnWomenMenu() {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("^I mouse hover on Tops$")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTops();
    }

    @And("^I click on Jackets$")
    public void iClickOnJackets() {
        new HomePage().clickOnJacketsLink();
    }

    @And("^select Sort by filter Product Name$")
    public void selectSortByFilterProductName() {
        new JacketPage().selectSortByFilterProductName();
    }

    @Then("^verify the products name display in alphabetical order$")
    public void verifyTheProductsNameDisplayInAlphabeticalOrder() {
        Assert.assertEquals(new JacketPage().jacketNameListAfter,new JacketPage().jacketsNameListBefore);
    }

    @And("^I select Sort By filter Price$")
    public void iSelectSortByFilterPrice() {
        new JacketPage().selectSortByFilterPrice();
    }


    @Then("^verify the products price display in Low to High$")
    public void verifyTheProductsPriceDisplayInLowToHigh() {
        Assert.assertEquals(new JacketPage().jacketPriceListAfter,new JacketPage().jacketPriceListBefore);
    }

}
