package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true,
        tags = "@Smoke",
        plugin = {"pretty", "html:target/searchproduct.html"}
)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
}
