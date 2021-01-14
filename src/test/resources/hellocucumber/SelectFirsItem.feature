Feature: Selecting functionality
  As a standard user of Saucedemo
  I want to select first item

  Scenario: Select firs item Successfully
    Given I am on the Inventory page of Sauce demo
    When I click first product
    Then I should be taken to Inventory Item Page
