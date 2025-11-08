Feature: Transaction Details

  Scenario: Transaction Details visible
    Given Transaction Details
    Then Verify date of payment
    Then Verify description of payment
    And Verify amount of payment