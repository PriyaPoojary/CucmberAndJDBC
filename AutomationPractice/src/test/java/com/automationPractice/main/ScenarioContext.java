package com.automationPractice.main;

import com.AutomationPractice.ReadExcel;

public class ScenarioContext {

	public ReadExcel readExcel;
	public LoginPage loginPage;
	public String url;
	
	public ScenarioContext(){
		readExcel = new ReadExcel();
		url = new String();
	}
}
