@ProceedCheckoutOne
Feature: Proceed checkout one page functionality
  As a standard user of Saucedemo
  I want to move checkout one page
  @ProceedCheckoutOne
  Scenario: Proceed Checkout Successful
    Given I am on the Shopping Cart Page of Sauce demo for proceed
    When I click checkout button
    Then I should be at Checkout One Page