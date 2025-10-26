package BddCucumber.Example1.dummy.steps;

import BddCucumber.Example1.dummy.Pages.StorePage;
import BddCucumber.Example1.dummy.constants.EndPoint;
import BddCucumber.Example1.dummy.context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreStepDefinition {

    private WebDriver driver;

    public StoreStepDefinition(TestContext testContext) {
        this.driver = testContext.driver;
    }


    @Given("I am on the stores page")
    public void i_am_on_the_stores_page() {
        // Write code here that turns the phrase above into concrete actions
        StorePage storePage=new StorePage(driver);
        storePage.load(EndPoint.STORE.url);

    }

    @When("I add {string} to the cart")
    public void iAddToTheCart(String productname) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new StorePage(driver).addToCart(productname);

    }
}
