package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
        features="C:\\Users\\Arum\\IdeaProjects\\AutomationPracticeProject\\src\\test\\resources\\Features\\HomePage.feature",
        glue={"StepDefinitions"}
)

public class TestRunner {

}