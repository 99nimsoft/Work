package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\IBM_ADMIN\\GAURAV\\Workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\freecrm.feature"
		,glue={"com/qa/stepDefinitions"}
		,format={"pretty","html:test-output"}
		,monochrome=false    // it is used to see clean console output , no unnecessary special character
		,dryRun=false
		)

public class TestRunner {

}
