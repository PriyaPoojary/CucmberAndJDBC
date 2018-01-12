package com.AutomationPractice.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
		else {
			driver = new InternetExplorerDriver();
			return driver;
		}
	}
	
	public void sendKeys(By element,String value){
		initWebDriver().findElement(element).sendKeys(value);
	}
	
	public void click(By element){
		initWebDriver().findElement(element).click();
	}	
}
