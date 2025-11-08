Feature: Transfer Funds Feature

  Background: Successful Login
    Given Navigate to the Homepage
    When Enter username and password
    When Click login button
    Then Verify Home page opened
    Given User logged in successfully
    When Click Open New Account
    Then Verify Open New Account text displayed
    Then Select type of account
    Then Select account
    When Click Open New Account button
    Then Verify successful message

  Scenario: Successful Transfer Funds
    Given Click Transfer Funds
    When Verify the Transfer Funds Page
    When Click Amount Box
    Then Text the amount of the money
    Then Select same account for sender and receiver
    Then Click Transfer Button
    Then Verify the Transfer Complete Page
    Then Verify the info
    Then Click Account Overview Section
    Then Verify the Account Overview Page
