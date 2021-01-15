@CheckItem
Feature: Check Item functionality
  As a standard user of Saucedemo
  I want to check any item in actual shopping cart
  @CheckItem
  Scenario: Check Item Successful
    Given I am on the Shopping Cart Page of Sauce demo for check
    When I click on the name of any item in shopping cart
    Then I should be at the page of the product I clicked on
