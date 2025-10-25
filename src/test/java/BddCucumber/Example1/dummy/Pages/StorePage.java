package BddCucumber.Example1.dummy.Pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage
{

    @FindBy(xpath="//h2[text()='Blue Shoes']/../../child::a[text()='View cart']")
    public WebElement viewCartLink;


public StorePage(WebDriver driver) {
        super(driver);
    }

    public void addToCart(String productName) throws InterruptedException {

      By addToCartButton=By.cssSelector("a[aria-label='Add “"+productName+"” to your cart']");
       wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
       wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();

    }
}
