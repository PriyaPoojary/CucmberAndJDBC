package com.AutomationPractice.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationBase {

	private String browser;

	public AutomationBase(String browser) {

		this.browser = browser;

	}
	
	public WebDriver initWebDriver() {
		WebDriver driver;
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Library/chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
			
		} else if (browser.equalsIgnoreCase("fireFox")) {
			driver = new FirefoxDriver();
			return driver;
		}
		return null;
	}

	public void sendKeys(WebDriver driver,By element, String value) {
		driver.findElement(element).sendKeys(value);
	}

	public void click(WebDriver driver,By element) {
		driver.findElement(element).click();
	}
}
