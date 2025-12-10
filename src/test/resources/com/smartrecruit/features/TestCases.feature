
Feature: TestCases @feature_user_login

Background: 
  Given the user is on the Login Page

@valid-login
Scenario Outline: Verify successful login with valid credentials
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  Then the 'Show/Hide Password' option should be available
  And the user should be redirected to the dashboard URL
  And the dashboard should display the recruiter's name

  Examples:
    | email                | password          |
    | krishna@gmail.com    | ValidPassword123   |

  @feature_show_hide_password
  @validate_show_hide_password
  Scenario Outline: Verify Show/Hide Password functionality
    When I enter "<password>" in the Password field
    And I click the 'Show/Hide Password' option
    Then the password should be visible
    And I click the 'Show/Hide Password' option again
    Then the password should be hidden

    Examples:
      | password        |
      | ValidPassword123 |

  @verify_incorrect_email
  Scenario Outline: Verify error message for incorrect email ID
    Given the user enters "<emailID>" in the Email ID field
    And the user enters "<password>" in the Password field
    When the user clicks the 'Login' button
    Then an error message 'Incorrect email ID or password.' is displayed

    Examples:
      | emailID | password            |
      | abc@    | ValidPassword123    |

@incorrect-password
Scenario Outline: Verify error message for incorrect password
  Given the user enters a valid email ID "<email>"
  And the user enters an incorrect password "<password>"
  And the user clicks the Login button
  Then the error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email                | password            |
    | krishna@gmail.com    | wrongpassword123    |

@error-message-empty-fields
Scenario Outline: Verify error message for empty fields
  Given the user leaves the Email ID field empty
  And the user leaves the Password field empty
  When the user clicks the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | Email ID | Password |
    |          |          |

  @sql-injection-error
  Scenario Outline: Verify error message for SQL injection in email field
    Given I enter "<email>" in the Email ID field
    And I enter "<password>" in the Password field
    And I click the 'Login' button
    Then the error message 'Incorrect email ID or password.' is displayed

    Examples:
      | email                  | password      |
      | 'admin' OR '1'='1'    | anyPassword   |

  @disabled_login_button
  Scenario Outline: Verify Login button is disabled when fields are empty
    Given the Email ID field is "<email_field>"
    And the Password field is "<password_field>"
    When I verify the state of the 'Login' button
    Then the 'Login' button should be disabled

    Examples:
      | email_field                | password_field       |
      |                          | valid_password       |
      | valid_email@example.com    |                      |

  @disabled_login_button
  Scenario Outline: Verify Login button is disabled when fields are empty again
    Given the Email ID field is "<email_field>"
    And the Password field is "<password_field>"
    When I verify the state of the 'Login' button
    Then the 'Login' button should be disabled

    Examples:
      | email_field                | password_field       |
      |                          | valid_password       |
      | valid_email@example.com    |                      |
```gherkin
@max-length-login
Scenario Outline: Verify login with maximum length email and password
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  Then the user should be redirected to the dashboard

  Examples:
    | email

  @special_characters_login
  Scenario Outline: Verify login with special characters in email and password
    When I enter "<email>"
    And I enter "<password>"
    And I click the Login button
    Then the user should be redirected to the dashboard

    Examples:
      | email                     | password     |
      | user+test@example.com    | P@ssw0rd!    |
