Feature: Test Login Functionlity

  @Smoke
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page Precondition
    When user enters valid <username> and <password> Action
    And clicks on login button some more action
    Then user is navigated to home page

    @Valid
    Examples: 
      | username | password |
      | Admin    | admin123 |

    @invalid
    Examples: 
      | username | password |
      | AdminAbc | admin12  |
