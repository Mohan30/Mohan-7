package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/feature/createLead.feature", glue= {"hooks","pages"},tags="@Smoke or @Sanity",monochrome= true)
public class CreateLead_Runner {

}
