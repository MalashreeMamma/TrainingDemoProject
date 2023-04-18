Feature: Test for manualtestcase

  Scenario: Checking for login page
    Given user is on login page 
    When user enters valid username and password 
    And clicks on login button some more 
    Then user is navigated to home 
