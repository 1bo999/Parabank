package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/updateinfoDataTable.feature",
        },
        glue = {"stepDefinitions","hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html"}
)

public class DateTableRunner extends AbstractTestNGCucumberTests {
}
