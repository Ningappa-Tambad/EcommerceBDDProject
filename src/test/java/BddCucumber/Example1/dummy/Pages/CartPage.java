package BddCucumber.Example1.dummy.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage
{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//td[@class='product-name']")
    public WebElement productNameInCart;

    @FindBy(xpath="//td[@class='product-price']/span")
    public WebElement productQty;

    @FindBy(css=".checkout-button")
    public WebElement proceedToCheckoutBtn;

    public String getProductNameInCart()
    {
        return wait.until(ExpectedConditions.visibilityOf(productQty)).getText();
    }

    public int getProductQtyInCart()
    {
        String qty= wait.until(ExpectedConditions.visibilityOf(productQty)).getText();
        return Integer.parseInt(qty);
    }

    public void verifyProceedToCheckoutButtonIsClciked()
    {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtn)).click();
    }


}
