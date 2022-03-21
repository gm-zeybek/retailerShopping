package com.retailer.pages;

import com.retailer.steps.TestBase;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(TestBase.getDriver(), this);
    }
}
