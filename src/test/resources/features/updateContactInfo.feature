Feature: Update Contact Info

  Background: : Successful Login
    Given Navigate to the Homepage
    When Enter username and password
    When Click login button
    Then Verify Home page opened

  Scenario Outline: Update Contact Info
    Given Verify Overview page text
    When Click Update Contact Info button
    Given Verify Update Profile page opened
    When Update first "<name>" and "<lastName>" lastnames
    And Update address details "<address>" "<city>" "<state>"
    Then Update zipcode "<zipcode>"
    Then Click update profile button
    Then Verify Message displayed

    Examples:
      | name  | lastName | address | city     | state     | zipcode |
      | Kazim | qasimov  | Kadikoy | Istanbul | testState | 1234    |
      |       | qasimov  | Kadikoy | Istanbul | testState | 1234    |
      | Kazim |          | Kadikoy | Istanbul | testState | 1234    |
      | Kazim | qasimov  |         | Istanbul | testState | 1234    |
      | Kazim | qasimov  | Kadikoy |          | testState | 1234    |
      | Kazim | qasimov  | Kadikoy | Istanbul |           | 1234    |
      | Kazim | qasimov  | Kadikoy | Istanbul | testState |         |