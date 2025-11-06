Feature: Request Loan Functionality

  Background:
    Given Navigate to the Homepage
    When Enter username and password
    When Click login button
    Then Verify Home page opened

  Scenario Outline: Successful request loan
    When Click request loan option
    When Enter loan amount "<amount>" and down payment "<downPayment>"
    When Click apply now button
    Then Verify success message
    When Click loan account number
    Then Verify account information
    Examples:
      | amount | downPayment |
      | 2000   | 400         |
