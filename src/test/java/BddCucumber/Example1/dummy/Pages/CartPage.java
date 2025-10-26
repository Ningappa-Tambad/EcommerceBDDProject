package BddCucumber.Example1.dummy.Pages;

import org.openqa.selenium.By;
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

    @FindBy(xpath="//input[@type='number']")
    public WebElement productQty;

    @FindBy(css=".checkout-button")
    public WebElement proceedToCheckoutBtn;

    private final By overlay=By.cssSelector(".blockUI.blockOverlay");


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
        WaitForOverlayToDisappear(overlay);
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtn)).click();
    }


}
