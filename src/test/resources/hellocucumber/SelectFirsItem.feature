Feature: Selecting functionality
  As a standard user of Saucedemo
  I want to select first item

  Scenario: Login Successful
    Given I am on the Inventory page of Sauce demo
    When I click first product
    Then I should be taken to Inventory Item Page
