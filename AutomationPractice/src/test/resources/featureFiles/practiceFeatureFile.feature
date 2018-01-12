Feature: Title of your feature

  Background: For automation practice setting up background
    Given WebDriver is initialized for "chrome"
    And i am able to launch "http://Automationpractice.com/#"
 	
 	Scenario:  Login to application using valid Username and Password
		Given user enters valid username "testuser51@test.com" and password "password"
		When user clicks on submitt button
		Then user should be able to login