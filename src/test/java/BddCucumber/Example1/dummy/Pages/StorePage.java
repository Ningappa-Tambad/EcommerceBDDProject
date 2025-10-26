package BddCucumber.Example1.dummy.Pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.nio.charset.StandardCharsets;

public class StorePage extends BasePage
{

    @FindBy(xpath="//h2[text()='Blue Shoes']/../../child::a[text()='View cart']")
    public WebElement viewCartLink;


public StorePage(WebDriver driver) {
        super(driver);
    }

    public void addToCart(String productName) throws InterruptedException {

       String raw="a[aria-label='Add “"+productName+"” to your cart']";

       byte[] bytes=raw.getBytes(StandardCharsets.UTF_8);
         String encodedString=new String(bytes,StandardCharsets.UTF_8);
         By addToCartButton=By.cssSelector(encodedString);

       wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
       wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();

    }
}
