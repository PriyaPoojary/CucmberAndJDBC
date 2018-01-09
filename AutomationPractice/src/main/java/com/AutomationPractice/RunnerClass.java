package com.AutomationPractice;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featureFiles"
		,glue={"src/test/java"}
		)
 // Kunal is learning
public class RunnerClass {

}
