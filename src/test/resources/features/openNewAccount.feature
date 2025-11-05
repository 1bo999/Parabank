Feature: Open New Account Feature

  Background: Successful Login
    Given Navigate to the Homepage
    When Enter username and password
    When Click login button
    Then Verify Home page opened

  Scenario: Open New Account
    Given User logged in successfully
    When Click Open New Account
    Then Verify Open New Account text displayed
    Then Select type of account
    Then Select account
    When Click Open New Account button
    Then Verify successful message

