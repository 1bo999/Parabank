Feature: Update Contact Information - Negative Case

  Background: : Successful Login
    Given Navigate to the Homepage
    When Enter username and password
    When Click login button
    Then Verify Home page opened

  Scenario Outline: User tries to update profile with empty optional fields
    Given verify page text
    When user clicks Update Contact info link
    And user clears the following fields address "<address>" city "<city>" state "<state>"
    Then warning messages should appear for the cleared fields
    When user clicks Update Profile button
    Examples:
      | address | city | state |
      |         |      |       |