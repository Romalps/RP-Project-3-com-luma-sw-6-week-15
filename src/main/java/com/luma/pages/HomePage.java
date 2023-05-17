package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Tops')])[1]")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacketsLink;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsLink;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bagLink;

    // Mouse Hover on Women Menu
    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
        log.info("Mouse hover on Women menu " + womenMenu.toString());
    }

    // Mouse Hover on Tops
    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
        log.info("Mouse hover on Tops " + tops.toString());
    }

    // Click on Jackets
    public void clickOnJacketsLink() {
        clickOnElement(jacketsLink);
        log.info("Click on Jackets link " + jacketsLink.toString());
    }

    // Mouse Hover on Men Menu
    public void mouseHoverMenMenu() {
        mouseHoverToElement(menMenu);
        log.info("Mouse hover on Men menu " + menMenu.toString());
    }

    // Mouse Hover on Bottoms
    public void mouseHoverOnBottoms() {
        mouseHoverToElement(bottoms);
        log.info("Mouse hover on Bottoms " + bottoms.toString());
    }

    // Click on Pants
    public void clickOnPantsLink() {
        clickOnElement(pantsLink);
        log.info("Click on Pants link  " + pantsLink.toString());
    }

    // Mouse Hover on Gear Menu
    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
        log.info("Mouse Hover On Gear Menu tab" + gearMenu.toString());
    }

    // Click on Bags
    public void clickOnBagsLink() {
        mouseHoverToElementAndClick(bagLink);
        log.info("Click on Bag link" + bagLink.toString());
    }
}
