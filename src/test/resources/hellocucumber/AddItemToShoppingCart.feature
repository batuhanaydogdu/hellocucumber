@AddItem
Feature: Adding item to cart functionality
  As a standard user of Saucedemo
  I want to add item to the cart
  @AddItem
  Scenario: Add item to the cart Successfully
    Given I am on the Inventory Item page of Sauce demo
    When I click the add to cart button
    Then Item should be added to the basket
