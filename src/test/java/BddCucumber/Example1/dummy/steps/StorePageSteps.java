package BddCucumber.Example1.dummy.steps;

import BddCucumber.Example1.dummy.DomainObject.BillingDetails;
import BddCucumber.Example1.dummy.Pages.CartPage;
import BddCucumber.Example1.dummy.Pages.CheckOutPage;
import BddCucumber.Example1.dummy.Pages.StorePage;
import BddCucumber.Example1.dummy.factory.DriverFactory;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class StorePageSteps
{

    private static WebDriver driver;
   private StorePage storePage;
   private CartPage cartPage;
   private CheckOutPage checkOutPage;

  private BillingDetails billingDetails;



    @Given("I am on the stores page")
    public void i_am_on_the_stores_page() {
        // Write code here that turns the phrase above into concrete actions
       driver= DriverFactory.getDriver();
       StorePage storePage=new StorePage(driver);
        storePage.load("https://askomdch.com/store/");


    }

    @When("I add {string} to the cart")
    public void iAddToTheCart(String productName) throws InterruptedException {

        storePage.addToCart(productName);
    }


    @Then("I see {int} {string} in the cart")
    public void iSeeInTheCart(int quantity, String productName) {

        Assert.assertEquals(productName, cartPage.getProductNameInCart());

        Assert.assertEquals(quantity, cartPage.getProductQtyInCart());

    }


    @Given("I am guest customer")
    public void iAmGuestCustomer() {
        // Write code here that turns the phrase above into concrete actions
       // WebDriverManager.chromedriver().setup();

        driver= DriverFactory.getDriver();
        StorePage storePage=new StorePage(driver);
        storePage.load("https://askomdch.com/store/");

    }


    @And("I'm on the checkout page")
    public void iMOnTheCheckoutPage() {

        cartPage.verifyProceedToCheckoutButtonIsClciked();
    }

    @When("I provide billing details")
    public void iProvideBillingDetails(List<Map<String, String>> billingDetails) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("I place an order")
    public void iPlaceAnOrder(){
  checkOutPage.placeOrder();
    }

    @Then("I see order confirmation message")
    public void iSeeOrderConfirmationMessage() {

        String expectedMessage="Thank you. Your order has been received.";
        Assert.assertEquals(expectedMessage,checkOutPage.verifyConfirmationMessage());
    }

    @And("Add my billing details are")
    public void addMyBillingDetailsAre(BillingDetails billingDetails) {
        this.billingDetails=billingDetails;




    }
}
