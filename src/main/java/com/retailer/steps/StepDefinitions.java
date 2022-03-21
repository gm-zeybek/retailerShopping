package com.retailer.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class StepDefinitions extends TestBase {

    @Given("user land to the homePage")
    public void user_land_to_the_home_page() {

        getDriver().get("https://testscriptdemo.com/");
        getDriver().findElement(By.linkText("Accept all")).click();

    }

    @Given("I add four different products to my wish list")
    public void i_add_four_different_products_to_my_wish_list() {

        homePage.blackPantsElement.click();
        Assert.assertEquals("Product added!", homePage.confirmBlackPants.getText());

        homePage.modernElement.click();
        Assert.assertEquals("Product added!", homePage.confirmModern.getText());

        homePage.singleShirtElement.click();
        Assert.assertEquals("Product added!", homePage.confirmSingleShirt.getText());

        homePage.topPantsUpperElement.click();
        Assert.assertEquals("Product added!", homePage.confirmTopPantsUpper.getText());

    }

    @When("I view my wishlist table")
    public void i_view_my_wishlist_table() {

        homePage.wishListIcon.click();

    }

    @Then("I find total four selected items in my Wishlist")
    public void i_find_total_four_selected_items_in_my_wishlist() {

        Assert.assertEquals(4, wishListPage.tableRows().size());

    }

    @When("I search for lowest price product")
    public void i_search_for_lowest_price_product() {
        // since I don't see any search/sortby functionality related to wishtable hence, it is default lower to higher price
        // therefore the first item shows the lowest price

        wishListPage.tableRows().stream().map(WebElement -> WebElement.getText());
        Assert.assertTrue(wishListPage.productPrice(wishListPage.tableRows()).get(0).contains("£22.00"));
    }

    @When("I am able to add the lowest price item to my cart")
    public void i_am_able_to_add_the_lowest_price_item_to_my_cart() {
//   the first product seems to have defect because although there is a price range but shows add to chart instead select options
        // therefore I choose to click to cart to second product
        wishListPage.addToChartSecondElement(wishListPage.tableRows()).get(0).click();
        Assert.assertEquals("Product added to cart successfully",wishListPage.productAddedMessage.getText());

    }

    @Then("I am able to verify the item in my cart")
    public void i_am_able_to_verify_the_item_in_my_cart() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.getDriver();
        js.executeScript("window.scrollBy(500,0)");
        wishListPage.cartIcon.click();
        Assert.assertEquals("Single Shirt", cartPage.productName().getText());

    }
}
