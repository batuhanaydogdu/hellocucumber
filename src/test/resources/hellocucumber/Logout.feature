@Logout
Feature: Logout functionality
  As a standard user of Saucedemo
  I want to logout
  @Logout
  Scenario: Logout Successful
    Given I am on the any page of the Sauce demo
    When I click logout
    Then I should be logged out