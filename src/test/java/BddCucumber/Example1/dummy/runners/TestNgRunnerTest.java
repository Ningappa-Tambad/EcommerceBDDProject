//package BddCucumber.Example1.dummy.runners;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import org.testng.annotations.DataProvider;
//
//
//@CucumberOptions(
//        plugin = {"html:target/cucumber-reports/cucumber.html"},
//
//        features = "src/test/java/BddCucumber/Example1/dummy",
//        glue = {"BddCucumber.Example1.dummy"},
//        tags = "@scenario1"
//
//)
//public class TestNgRunnerTest extends AbstractTestNGCucumberTests {
//
//    @Override
//    @DataProvider(parallel =false)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
//
//
//
//
//}