package com.eBay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchVerifyPage extends BasePage{

    @FindBy (xpath = "//*[@id=\"gdpr-banner-accept\"]")
    public WebElement acceptCookies;
    @FindBy (xpath = "//input[@id='gh-ac']")
    public WebElement searchItem;

    @FindBy (xpath = "//*[@id=\"gh-ug-flex\"]/a")
    public WebElement notRegistered;

    @FindBy (xpath = "//h1[@class='srp-controls__count-heading']")
    public WebElement matchingResults;

    @FindBy (xpath = "(//span[@class='expand-btn__cell'])[1]")
    public WebElement dropdownBox;

    @FindBy (xpath = "/html/head/title")
    public WebElement getTitle;

    @FindBy(xpath = "//span[@class='s-item__shipping s-item__logisticsCost']")
    public WebElement postagePrice;

    @FindBy(xpath = "//span[@class='s-item__bids s-item__bidCount']")
    public WebElement noOfBids;

    @FindBy(xpath = "//span[@class='s-item__price']")
    public WebElement price;

    @FindBy (xpath = "//span[.='Lowest price']")
    public WebElement lowestPrice;

    @FindBy (xpath = "//span[contains(text(),'Lowest price')]")
    public WebElement confirmLowestPrice;

    @FindBy (xpath = "//span[.='Highest price']")
    public WebElement highestPrice;

    @FindBy (xpath = "//span[contains(text(),'Highest price')]")
    public WebElement confirmHighestPrice;

    @FindBy(xpath = "//ol[@class='pagination__items']")
    public WebElement moreThenOnePage;

    @FindBy (xpath = "//a[@aria-label='Go to next search page']")
    public WebElement nextPage;


}
