Feature: For tetsing purpose
@Smoke
  Scenario Outline: For the login page
    Given User is on login page
    When <Username> and <Password>
    And Click on login button
    Then Login page should be opened
@Valid
    Examples:
    
    |Username | Password|
    |Admin| admin123|
    
    @Invalid
    Examples:
    |Username | Password|
    |Admin123 |Abc123|