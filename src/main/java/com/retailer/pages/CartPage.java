package com.retailer.pages;

import com.retailer.steps.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//td[@class=\"product-name\"]" )
    public WebElement cartProductName;

    @FindBy(xpath = "//table[@class=\"shop_table shop_table_responsive cart woocommerce-cart-form__contents\"]" )
    public WebElement table;


    public WebElement productName(){
       return table.findElement(By.xpath("//td[@class=\"product-name\"]//a"));
    }
}
