package com.automationPractice.main;

import com.AutomationPractice.base.AutomationBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPracticeStepDefs {
	ScenarioContext scenarioContext;
	
	public AutomationPracticeStepDefs(ScenarioContext scenarioContext) {
		this.scenarioContext = scenarioContext;
	}

	@Given("^WebDriver is initialized for \"([^\"]*)\"$")
	public void webdriver_is_initialized_for(String browser) throws Throwable {
		
		scenarioContext.driver = new AutomationBase("chrome").initWebDriver();
		scenarioContext.logger.debug("WebDriver is initialized......");
	}

	@Given("^i am able to launch \"([^\"]*)\"$")
	public void i_am_able_to_launch(String url) throws Throwable {
		
		scenarioContext.driver.get(url);
		scenarioContext.logger.debug("URL is launched...");
	}

	@Given("^user enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_valid_username_and_password(String userName, String password) throws Throwable {
		
		scenarioContext.automationBase.click(scenarioContext.driver,scenarioContext.homePage.getSignIn());
		scenarioContext.automationBase.sendKeys(scenarioContext.driver,scenarioContext.homePage.getUserName(), userName);
		scenarioContext.automationBase.sendKeys(scenarioContext.driver,scenarioContext.homePage.getPassword(), password);
		scenarioContext.logger.debug("credentials are entered");
	}

	@When("^user clicks on submitt button$")
	public void user_clicks_on_submitt_button() throws Throwable {
		scenarioContext.automationBase.click(scenarioContext.driver,scenarioContext.homePage.getSubmitBtn());
		scenarioContext.logger.debug("clicked on Submitt Button");
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		scenarioContext.logger.debug("User is logged in");
	}

}