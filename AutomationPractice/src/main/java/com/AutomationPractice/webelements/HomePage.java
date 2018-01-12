package com.AutomationPractice.webelements;

import org.openqa.selenium.By;

public class HomePage {

	private By signIn = By.className("login");
	private By userName = By.id("email");
	private By password = By.id("passwd");
	private By submitBtn = By.id("SubmitLogin");

	public By getSignIn() {
		return signIn;
	}

	public By getUserName() {
		return userName;
	}

	public By getPassword() {
		return password;
	}

	public By getSubmitBtn() {
		return submitBtn;
	}


}
