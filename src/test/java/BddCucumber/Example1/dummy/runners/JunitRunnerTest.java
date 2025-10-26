package BddCucumber.Example1.dummy.runners;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        features = "src/test/java/BddCucumber/Example1/dummy",
        glue = {"BddCucumber.Example1.dummy"},
        tags = "@smoke"



)
public class JunitRunnerTest
{

//   @BeforeClass
//    public static void setup() {
//        System.out.println("BEFORE CLASS");
//    }
//
//   @AfterClass
//    public static void teardown() {
//        System.out.println("AFTER CLASS");
//    }

}
