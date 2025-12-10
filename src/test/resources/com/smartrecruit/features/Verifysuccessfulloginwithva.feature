
@feature_user_login
Feature: Verifysuccessfulloginwithva

  Background: 
    Given the user is on the Login Screen

  @valid-login
  Scenario Outline: Verify successful login with valid credentials
    Given the user is on the Login Screen
    When I enter "<email>"
    And I enter "<password>"
    And the user clicks the Login button
    And the system processes the login request
    Then the user should be redirected to the dashboard

    Examples:
      | email               | password          |
      | krishna@gmail.com   | validPassword123   |
