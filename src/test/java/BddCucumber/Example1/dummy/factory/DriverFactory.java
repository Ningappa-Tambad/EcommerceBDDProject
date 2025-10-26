package BddCucumber.Example1.dummy.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{

    public static WebDriver initilizeWebDriver(String browser)
    {
   WebDriver driver;
        switch(browser)
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    driver.manage().window().maximize();;
                    break;

            default:
                throw new IllegalStateException("INVALID BOWSER: " + browser);
        }
      //  driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }



}
