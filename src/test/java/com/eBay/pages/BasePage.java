package com.eBay.pages;

import com.eBay.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
}