
Feature: login functionality
  @login
  Scenario: user logs into application

    Given user is on the account creation page
    When user clicks on don't have account link
    Then Already have an account? text should be visible
