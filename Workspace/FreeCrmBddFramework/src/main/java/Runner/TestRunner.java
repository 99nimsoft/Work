package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\main\\java\\Features\\login.feature","src\\main\\java\\Features\\login2.feature"} //Path of feature files to execute
		,glue={"stepDefnitions"}  //name of package inside which classes which contains methods corresponding to features
		,format={"pretty","html:test-output"} //for reporting we specify report output folder here as well like here folder name is test-output
		,monochrome=true //displays consoleoutput in readable way, unnecessary special characters are removed
		,dryRun=false //if set to true it will only check if all steps in feature file have corresponding step definitions
		,strict=false //will fail execution if there are any undefined steps in feature file for which definition is not present
		,tags={"@SmokeTest,@temp"} //instructs what tags in feature file needs to be executed, ~ symbol ignores that test
		)


public class TestRunner {

}
