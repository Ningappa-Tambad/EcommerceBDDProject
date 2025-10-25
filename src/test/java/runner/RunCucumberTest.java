// java
package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/java/BddCucumber/Example1/dummy",
        glue = "BddCucumber.Example1.dummy"
)
public class RunCucumberTest {
}
