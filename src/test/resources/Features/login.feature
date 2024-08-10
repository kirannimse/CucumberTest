Feature: Feature to login Functionality

  Scenario: Check login is successful with valid credentials
    Given is on login page
    When User enter username and password
    And Click on login button
    Then user navigates to home page
