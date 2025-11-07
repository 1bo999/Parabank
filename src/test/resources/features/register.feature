Feature: Registration Feature
  Background: Home page opened
    Given Navigate to the Homepage

  Scenario: Successful registration with valid inputs
    When Click register button
    Then Enter a valid credentials
    Then Enter username
    And Enter password
    When Click the Register button
    Then Verify successful registration
