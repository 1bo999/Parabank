package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/billPay.feature",
        },
        glue = {"stepDefinitions","hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class billPayTestRunner extends AbstractTestNGCucumberTests {
}
