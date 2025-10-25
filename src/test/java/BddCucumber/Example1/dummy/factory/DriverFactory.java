package BddCucumber.Example1.dummy.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory
{
    private static WebDriver driver;

    public static WebDriver initilizeWebDriver()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
