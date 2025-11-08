Feature: BillPay Feature

  Background: Successful Login
    Given Navigate to the Homepage
    When Enter username and password
    When Click login button
    Then Verify Home page opened

  Scenario Outline:Paying Bills
    Given User clicks on Bill Pay button
    When User enters "<payment>" information
    When User enters the "<amount>"
    And Selects the from account
    When User clicks send payment button
    Then Verify payment complete message
    Given User clicks on Accounts Overview button
    When Verify Overview page opened
    Given User clicks the paid from account
    Then Verify Account Activity page opened
    When User clicks type of "<payment>"
    Then Verify Transaction Details page opened
    Then Verify Transaction Details displayed "<payment>"
    Examples:
      | payment     | amount |
      | electricity | 5      |
      | water       | 4      |
      | natural gas | 7      |