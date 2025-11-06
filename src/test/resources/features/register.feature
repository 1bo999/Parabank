Feature: Registration Feature
  Scenario: Successful registration with valid inputs
    Given Navigate to the Homepage
    When Click register button
    Then Enter a valid first name last name address city state zip code phone number ssn username password passwordConfirm
    And Click the Register button
    Then registration should be successful
