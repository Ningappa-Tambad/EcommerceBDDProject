package BddCucumber.Example1.dummy.hooks;

import BddCucumber.Example1.dummy.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class MyHooks
{
    private WebDriver driver;

    @Before
    public void before()
    {

        driver= DriverFactory.initilizeWebDriver();
    }

    @After
    public void after()
    {
        driver.quit();
    }
}
