package BddCucumber.Example1.dummy.Pages;

import BddCucumber.Example1.dummy.utils.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage
{
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void load(String endpoint)
    {
        driver.get(ConfigLoader.getInstance().getBaseUrl() +endpoint);
    }

    public void WaitForOverlayToDisappear(By overlay)
    {
      List<WebElement> overlays=driver.findElements(overlay);
        if(overlays.size()>0)
        {

            wait.until(ExpectedConditions.invisibilityOfAllElements(overlays));
            System.out.println("Overlay disappeared");
        }
        else
        {
            System.out.println("Overlay not present");
        }
    }

}
