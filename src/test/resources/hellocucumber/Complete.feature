@Complete
Feature: Complete functionality
  As a standard user of Saucedemo
  I want to complete order
  @Complete
  Scenario: Complete Successful
    Given I am on the Checkout One Page of the Sauce demo
    When I fill fields after that I click continue and finish
    Then I should be on Checkout Complete Page