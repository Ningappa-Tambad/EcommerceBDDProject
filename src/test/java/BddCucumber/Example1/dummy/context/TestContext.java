package BddCucumber.Example1.dummy.context;

import BddCucumber.Example1.dummy.DomainObject.BillingDetails;
import BddCucumber.Example1.dummy.Pages.CartPage;
import org.openqa.selenium.WebDriver;

public class TestContext {

   public WebDriver driver;
   public BillingDetails billingDetails;
   public CartPage cartPage;;
}
