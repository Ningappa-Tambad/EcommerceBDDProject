package BddCucumber.Example1.dummy.steps;

import BddCucumber.Example1.dummy.DomainObject.BillingDetails;
import BddCucumber.Example1.dummy.DomainObject.Product;
import BddCucumber.Example1.dummy.Pages.CartPage;
import BddCucumber.Example1.dummy.Pages.CheckOutPage;
import BddCucumber.Example1.dummy.Pages.StorePage;
import BddCucumber.Example1.dummy.constants.EndPoint;
import BddCucumber.Example1.dummy.constants.MyConstants;
import BddCucumber.Example1.dummy.context.TestContext;
import BddCucumber.Example1.dummy.factory.DriverFactory;
import BddCucumber.Example1.dummy.utils.ConfigLoader;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MyStepDefinition
{

    private static WebDriver driver;

   private final StorePage storePage;
   private final CartPage cartPage;
   private final CheckOutPage checkOutPage;


   public MyStepDefinition(TestContext testContext)
   {
       driver=testContext.driver;
       storePage=new StorePage(driver);
       cartPage=new CartPage(driver);
       checkOutPage=new CheckOutPage(driver);
   }

  private BillingDetails billingDetails;









    @Given("I am guest customer")
    public void iAmGuestCustomer() {
        // Write code here that turns the phrase above into concrete actions
       // WebDriverManager.chromedriver().setup();

        StorePage storePage=new StorePage(driver);
        storePage.load(MyConstants.STORE);

    }





}
