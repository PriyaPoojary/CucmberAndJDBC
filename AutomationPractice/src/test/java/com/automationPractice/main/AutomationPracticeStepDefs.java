package com.automationPractice.main;

import cucumber.api.java.en.Given;

public class AutomationPracticeStepDefs {

	ScenarioContext scenarioContext;

	public AutomationPracticeStepDefs(ScenarioContext scenarioContext) {
		this.scenarioContext = scenarioContext;
	}

	@Given("^WebDriver is initialized$")
	public void webdriver_is_initialized() throws Throwable {

	}

	@Given("^am able to Login \"([^\"]*)\"$")
	public void am_able_to_Login(String url) throws Throwable {

	}

	@Given("^acc$")
	public void acc() throws Throwable {

	}

}
