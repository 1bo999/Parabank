Feature: Login Feature

  Scenario: Successful Login
    Given Navigate to the Homepage
    When Enter username and password
    When Click login button
    Then Verify Home page opened