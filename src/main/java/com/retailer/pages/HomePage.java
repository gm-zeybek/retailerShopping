package com.retailer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@href='?add_to_wishlist=17']" )
    public WebElement blackPantsElement;

    @FindBy(xpath = "//a[@href='?add_to_wishlist=14']" )
    public WebElement modernElement;

    @FindBy(xpath = "//a[@href='?add_to_wishlist=20']" )
    public WebElement singleShirtElement;

    @FindBy(xpath = "//a[@href='?add_to_wishlist=23']" )
    public WebElement topPantsUpperElement;

    @FindBy(xpath = "//div[@data-product-id='17']//span" )
    public WebElement confirmBlackPants;

    @FindBy(xpath = "//div[@data-product-id='14']//span" )
    public WebElement confirmModern;

    @FindBy(xpath = "//div[@data-product-id='20']//span" )
    public WebElement confirmSingleShirt;

    @FindBy(xpath = "//div[@data-product-id='23']//span" )
    public WebElement confirmTopPantsUpper;

    @FindBy(xpath = "//a[@data-tooltip='Wishlist']" )
    public WebElement wishListIcon;




}
