Feature: Title of your feature

  Background: For automation practice setting up background
    Given WebDriver is initialized for "browser"
    And i am able to launch "https://Automationpractice.com"

  Scenario: 
    Given User clicks on Tshirts
    And User adds one tshirt to cart
    When user proceed to checkOut
    And user proceeds from summary page and calculated total cost
     
     
    