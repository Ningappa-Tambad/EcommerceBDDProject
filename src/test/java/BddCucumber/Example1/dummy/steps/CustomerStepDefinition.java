package BddCucumber.Example1.dummy.steps;

import BddCucumber.Example1.dummy.DomainObject.BillingDetails;
import BddCucumber.Example1.dummy.context.TestContext;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class CustomerStepDefinition {


    private WebDriver driver;
    private TestContext testContext;

    public CustomerStepDefinition(TestContext testContext) {
        driver = testContext.driver;
    }

    @And("Add my billing details are")
    public void addMyBillingDetailsAre(BillingDetails billingDetails) {
        testContext.billingDetails=billingDetails;
    }

}
