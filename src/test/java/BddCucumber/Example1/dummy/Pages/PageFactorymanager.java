package BddCucumber.Example1.dummy.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactorymanager {
    private static CartPage cartPage;
    private static StorePage storePage;
    private static CheckOutPage checkOutPage;


    public static CartPage getCartPage(WebDriver driver) {
        if (cartPage == null) {
           new CartPage(driver);
        }
        return cartPage;
    }

    public static StorePage getStorePage(WebDriver driver) {
        if (storePage == null) {
            new StorePage(driver);
        }
        return storePage;
    }

    public static CheckOutPage getCheckOutPage(WebDriver driver) {
        if (checkOutPage == null) {
            new CheckOutPage(driver);
        }
        return checkOutPage;
    }
}
