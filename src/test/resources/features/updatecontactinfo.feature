Feature: Update Contact Info

  Background: : Successful Login
    Given Navigate to the Homepage
    When Enter username and password
    When Click login button
    Then Verify Home page opened

  Scenario Outline: :Open OverView Page
    Then Verify Overview page text
    Then Click Update Contact Info button
    Then Verify Update Profile page opened
    Then Update "<name>"
    Then Update "<lastName>"
    Then Update "<address>"
    Then Update "<city>"
    Then Update "<state>"
    Then Update "<zipcode>"
    Then Update "<phone>"
    Then Click update profile button
    Then Verify profile updated text

    Examples:
      | name  | lastName | address   | city     | state     | zipcode | phone |
      | Kazim | qasimov  | Kadikoy   | Istanbul | testState | 1234    | 12345 |
      |       |          | teethtate | 4321     | 54321     |         |       |