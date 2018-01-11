package com.automationPractice.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.AutomationPractice.GetProperties;
import com.AutomationPractice.ReadExcel;

public class ScenarioContext {

	public ReadExcel readExcel;
	public LoginPage loginPage;
	public Logger logger ;
	public GetProperties getProperties;
	
	public ScenarioContext(){
		getProperties = new GetProperties();
		readExcel = new ReadExcel();
		logger = LogManager.getLogger(ScenarioContext.class);
		BasicConfigurator.configure();
	
	}
}
