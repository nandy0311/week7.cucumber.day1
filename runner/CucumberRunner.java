package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/cucumberDay1Features", glue="stepsDay1",monochrome=true, publish=true)
//monochrome to remove junk char, publish to generate cucumber report

public class CucumberRunner extends AbstractTestNGCucumberTests{

}
