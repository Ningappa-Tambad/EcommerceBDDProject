package BddCucumber.Example1.dummy.hooks;

import BddCucumber.Example1.dummy.context.TestContext;
import BddCucumber.Example1.dummy.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class MyHooks
{
    private WebDriver driver;

    private final TestContext testContext;

    public MyHooks(TestContext testContext)
    {
        this.testContext=testContext;
    }

    @Before
    public void before(Scenario scenario)
    {
        System.out.println("BEFORE THREAD ID: " + Thread.currentThread().getId() + " SCENARIO: " + scenario.getName());

        driver= DriverFactory.initilizeWebDriver(System.getProperty("browser","chrome"));
        testContext.driver=driver;

    }

    @After
    public void after(Scenario scenario)
    {
        System.out.println("AFTER THREAD ID: " + Thread.currentThread().getId() + " SCENARIO: " + scenario.getName()+" STATUS: "+scenario.getStatus());
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                // ignore cleanup errors
            } finally {
                driver = null;
            }
        }
    }
}
