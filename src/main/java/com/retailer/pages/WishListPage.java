package com.retailer.pages;

import com.retailer.steps.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class WishListPage extends BasePage{

    @FindBy(xpath = "//h2" )
    public WebElement wishListTableHeader;

    @FindBy(xpath = "//table/tbody" )
    public WebElement wishListTable;

    @FindBy(xpath = "//div[@class=\"woocommerce-message\"]" )
    public WebElement productAddedMessage;

    @FindBy(xpath = "(//a[@class=\"cart-contents\"])[1]" )
    public WebElement cartIcon;


    public List<WebElement> tableRows(){
        WebElement table = TestBase.getDriver().findElement(By.xpath("//table/tbody"));
        return table.findElements(By.tagName("tr"));

    }
    public List<String> productPrice(List<WebElement> tableRows){
      return tableRows.stream()
              .map(webElement -> webElement.findElement(By.xpath("//td[@class='product-price']")))
              .map(webElement -> webElement.getText()).collect(Collectors.toList());

    }
    public List<WebElement> addToChartSecondElement(List<WebElement> tableRows){
      return tableRows.stream()
              .map(webElement -> webElement.findElement(By.xpath("(//td[@class='product-add-to-cart']/a)[2]")))
              .collect(Collectors.toList());

    }



}
