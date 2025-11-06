Feature: Update Contact Info

  Background: : Successful Login
    Given Navigate to the Homepage
    When Enter username and password
    When Click login button
    Then Verify Home page opened

  Scenario: :Open OverView Page
    Then Verify Overview page text
    Then Update Contact Info button
    Then Verify Update Profile page opened
    Then Update Address
    Then Update City
    Then Update State
    Then Update ZipCode
    Then Update Phone
    Then Click update profile button
    Then Verify profile updated text
