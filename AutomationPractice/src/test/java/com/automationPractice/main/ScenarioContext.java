package com.automationPractice.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.AutomationPractice.GetProperties;
import com.AutomationPractice.GetValueFromJson;
import com.AutomationPractice.ReadExcel;
import com.AutomationPractice.base.AutomationBase;
import com.AutomationPractice.webelements.HomePage;

public class ScenarioContext {

	public ReadExcel readExcel;
	public Logger logger;
	public GetProperties getProperties;
	public GetValueFromJson getValueFromJson;
	public AutomationBase automationBase;
	public WebDriver driver;
	public HomePage homePage;
	
	public ScenarioContext(){
		getValueFromJson = new GetValueFromJson();
		getProperties = new GetProperties();
		readExcel = new ReadExcel();
		logger = LogManager.getLogger(ScenarioContext.class);
		BasicConfigurator.configure();
		homePage = new HomePage();
		automationBase = new AutomationBase(getProperties.getValue("browser"));
	}
	
	
}
