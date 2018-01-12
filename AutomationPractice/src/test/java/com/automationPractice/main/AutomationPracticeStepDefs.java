package com.automationPractice.main;

import com.AutomationPractice.base.AutomationBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AutomationPracticeStepDefs {
	ScenarioContext scenarioContext;

	public AutomationPracticeStepDefs(ScenarioContext scenarioContext) {
		this.scenarioContext = scenarioContext;
	}

	@Given("^WebDriver is initialized for \"([^\"]*)\"$")
	public void webdriver_is_initialized_for(String browser) throws Throwable {

		scenarioContext.automationBase = new AutomationBase(scenarioContext.getProperties.getValue(browser));
		scenarioContext.automationBase.click(scenarioContext.homePage.getCatagory());
	}

	@Given("^i am able to launch \"([^\"]*)\"$")
	public void i_am_able_to_launch(String arg1) throws Throwable {
	}

	@Given("^User clicks on Tshirts$")
	public void user_clicks_on_Tshirts() throws Throwable {
	}

	@Given("^User adds one tshirt to cart$")
	public void user_adds_one_tshirt_to_cart() throws Throwable {
	}

	@When("^user proceed to checkOut$")
	public void user_proceed_to_checkOut() throws Throwable {
	}

	@When("^user proceeds from summary page and calculated total cost$")
	public void user_proceeds_from_summary_page_and_calculated_total_cost() throws Throwable {
	}

}