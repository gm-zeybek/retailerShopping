package com.retailer.steps;

import com.retailer.pages.CartPage;
import com.retailer.pages.HomePage;
import com.retailer.pages.WishListPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class TestBase {

    static private WebDriver Driver;

    HomePage homePage = new HomePage();
    WishListPage wishListPage = new WishListPage();
    CartPage cartPage = new CartPage();



    private static String Browser;

    public static WebDriver getDriver(String Browser){
        if (Driver ==null) {
            switch (Browser.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();

                    Driver = new ChromeDriver();
                    Driver.manage().window().maximize();
                    break;
                case "firefox":

                    WebDriverManager.firefoxdriver().setup();
                    Driver = new FirefoxDriver();
                    break;
            }
        }
        return Driver;
    }

    public static WebDriver getDriver(){
        if(Browser==null){
            Driver =getDriver("chrome");

        }
        return Driver;
    }

    public static void closeDriver() {

        try {

        } finally {
            if(Driver!=null)
                Driver.close();
            Driver = null;
        }

    }





}
