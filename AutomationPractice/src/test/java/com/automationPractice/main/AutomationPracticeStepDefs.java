package com.automationPractice.main;

import cucumber.api.java.en.Given;

public class AutomationPracticeStepDefs {

	ScenarioContext scenarioContext;

	public AutomationPracticeStepDefs(ScenarioContext scenarioContext) {

		this.scenarioContext = scenarioContext;
	}

	@Given("^WebDriver is initialized for \"([^\"]*)\"$")
	public void webdriver_is_initialized(String browser) throws Throwable {
		System.out.println(scenarioContext.getProperties.getValue(browser));
	}

	@Given("^am able to Login \"([^\"]*)\"$")
	public void am_able_to_Login(String url) throws Throwable {

	}
}