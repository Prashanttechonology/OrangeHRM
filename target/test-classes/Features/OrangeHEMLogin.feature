Feature: feature to test OrangeHRM login functionality

  Scenario: Validate OrangeHRM is working
    Given Browser is open
    And user is on OrangeHRM page
    When user enters a login credentials in login page
    And hits login
    Then user is navigates to home page