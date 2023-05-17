package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JacketPage extends Utility {

    private static final Logger log = LogManager.getLogger(JacketPage.class.getName());

    public JacketPage() {
        PageFactory.initElements(driver, this);
    }

    public ArrayList jacketsNameListBefore;
    public ArrayList jacketNameListAfter;
    public ArrayList jacketPriceListBefore;
    public ArrayList jacketPriceListAfter;
    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    List<WebElement> jacketPriceElementList;
    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    List<WebElement> jacketsElementsList;

    public void selectSortByFilterProductName() {
        // Storing jackets names in list
        List<String> jacketsNameListBefore = new ArrayList<>();

        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Product Name");
        // After Sorting value
        jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketNameListAfter = new ArrayList<>();

        for (WebElement value : jacketsElementsList) {
            jacketNameListAfter.add(value.getText());
        }
        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        log.info("Select sort by filter Product name : " + jacketsElementsList.toString());
    }


    public void selectSortByFilterPrice() {
        // Storing jackets price in list
        List<Double> jacketPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));

        }
        // Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Price");
        // After Sorting Products by Price
        jacketPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketPriceListAfter = new ArrayList<>();

        for (WebElement value : jacketPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketPriceListBefore);
        log.info(" Select sort by Filter Price : " + jacketPriceElementList.toString());
    }

}
