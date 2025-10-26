package BddCucumber.Example1.dummy.steps;

import BddCucumber.Example1.dummy.DomainObject.BillingDetails;
import BddCucumber.Example1.dummy.Pages.CartPage;
import BddCucumber.Example1.dummy.Pages.CheckOutPage;
import BddCucumber.Example1.dummy.context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckOutStepDefinition {

    private WebDriver driver;
    private TestContext testContext;

    public  CheckOutStepDefinition(TestContext context) {
        driver = context.driver;
    }




    @And("I'm on the checkout page")
    public void iMOnTheCheckoutPage() {

        new CartPage(driver).verifyProceedToCheckoutButtonIsClciked();
    }

    @When("I provide billing details")
    public void iProvideBillingDetails(BillingDetails billingDetails) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new CheckOutPage(driver).setBilingDetails(testContext.billingDetails);


    }

    @And("I place an order")
    public void iPlaceAnOrder(){

        new CheckOutPage(driver).placeOrder();
    }

    @Then("I see order confirmation message")
    public void iSeeOrderConfirmationMessage() {

        String expectedMessage="Thank you. Your order has been received.";
        Assert.assertEquals(expectedMessage,new CheckOutPage(driver).verifyConfirmationMessage());
    }
}
