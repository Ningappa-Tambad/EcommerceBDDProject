package BddCucumber.Example1.dummy.steps;

import BddCucumber.Example1.dummy.DomainObject.Product;
import BddCucumber.Example1.dummy.Pages.CartPage;
import BddCucumber.Example1.dummy.Pages.PageFactorymanager;
import BddCucumber.Example1.dummy.context.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartStepDefinition
{
    private WebDriver driver;;
    private final CartPage cartPage;

    public CartStepDefinition(TestContext context)
     {
        driver = context.driver;
        cartPage = PageFactorymanager.getCartPage(context.driver);
     }

    @Then("I see {int} {string} in the cart")
    public void iSeeInTheCart(int quantity, Product product) {
        Assert.assertEquals(product.getName(), cartPage.getProductNameInCart());

        Assert.assertEquals(quantity, cartPage.getProductQtyInCart());
    }
}
