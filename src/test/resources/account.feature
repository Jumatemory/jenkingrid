@account
Feature: account creation
  Scenario: account creation for the application
    Given user is on the account creation page
    When user enters email as "Maro.Aziz@gmail.com" name as "Maro Aziz" password as "password@1" and confirm password as "password@1"
    When user clicks on signUp button
    Then the title of the page should be visible