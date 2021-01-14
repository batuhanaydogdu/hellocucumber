Feature: Logout functionality
  As a standard user of Saucedemo
  I want to logout

  Scenario: Logout Successful
    Given I am on the Inventory Page of the Sauce demo
    When I click logout
    Then I should be logged out