//package runner;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import org.junit.Before;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//
//@CucumberOptions(
//        features = "src/test/java/BddCucumber/Example1/dummy", // Path to your feature files
//        glue = "BddCucumber.Example1.dummy", // Package where your step definitions are located
//        plugin = {"pretty", "html:target/cucumber"},
//        monochrome = true
//)
//public class TestNgRunnerTest extends AbstractTestNGCucumberTests {
//
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
//
//    @BeforeClass
//    public void setup() {
//        System.out.println("BEFORE CLASS");
//    }
//
//    @AfterClass
//    public void teardown() {
//        System.out.println("AFTER CLASS");
//    }
//
//
//}