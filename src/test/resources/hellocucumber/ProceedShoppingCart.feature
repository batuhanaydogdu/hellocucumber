@ProceedShoppingCart
Feature: Proceed shopping cart page functionality
  As a standard user of Saucedemo
  I want to see shopping cart page
  @ProceedShoppingCart
  Scenario: Proceed Cart Successful
    Given I am on the Inventory Item Page of the Sauce demo
    When I click cart button
    Then I should be at Shopping Cart Page