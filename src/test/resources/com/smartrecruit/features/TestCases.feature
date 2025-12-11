
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

@valid-login
Scenario Outline: Verify successful login with valid credentials
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the 'Login' button
  And I verify that the 'Show/Hide Password' option is available
  Then I check the dashboard URL
  And I verify that the dashboard displays the recruiter's name

  Examples:
    | email              | password            |
    | krishna@gmail.com  | ValidPassword123    |

  @feature_verify_show_hide_password
  @verify_password_visibility
  Scenario Outline: Verify Show/Hide Password functionality
    Given I enter a valid password in the Password field
    When I click the 'Show/Hide Password' option
    Then the password should be visible
    When I click the 'Show/Hide Password' option again
    Then the password should be hidden

    Examples:
      | password         |
      | ValidPassword123 |

@invalid-email-error
Scenario Outline: Verify error message for incorrect email ID
  When I enter "<email_id>"
  And I enter "<password>"
  And the user clicks the 'Login' button
  Then an error message 'Incorrect email ID or password.' should be displayed

  Examples:
    | email_id | password            |
    | abc@     | ValidPassword123    |

@incorrect_password
Scenario Outline: Verify error message for incorrect password
  Given the user enters a valid email ID "<email>"
  And the user enters an incorrect password "<password>"
  And the user clicks the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email               | password          |
    | krishna@gmail.com   | wrongpassword123   |

  @feature_user_login
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
  Given the user is on the Login Screen
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And the user clicks the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email                      | password     |
    | "'admin' OR '1'='1'"      | anyPassword  |

  @feature_user_login
  @disabled_login_button
  Scenario Outline: Verify Login button is disabled when fields are empty
    Given the Email ID field is "<email>"
    And I enter the Password as "<password>"
    Then the 'Login' button should be disabled

    Examples:
      | email                     | password         |
      |                          | valid_password   |
      | valid_email@example.com  |                  |

  @disabled_login_button
  Scenario Outline: Verify Login button is disabled when fields are empty after clearing
    Given the Email ID field is "<email>"
    And I enter the Password as "<password>"
    Then the 'Login' button should be disabled
    And I clear the Password field
    And the Email ID field is "<email_after_clear>"
    Then the 'Login' button should be disabled

    Examples:
      | email                     | password         | email_after_clear       |
      |                          | valid_password   | valid_email@example.com  |
      | valid_email@example.com  |                  |                          |

  @maximum_length_login
  Scenario Outline: Verify login with maximum length email and password
    Given the user is on the Login Screen
    When I enter "<email>"
    And I enter "<password>"
    And I click the 'Login' button
    Then the user should be redirected to the dashboard

    Examples:
      | email                                                                                                           | password                                                                                                           |
      | a@a.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@special-characters-login
Scenario Outline: Verify login with special characters in email and password
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email                     | password     |
    | user+test@example.com    | P@ssw0rd!    |

@valid-login
Scenario Outline: Verify successful login with valid credentials
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  And I check the 'Show/Hide Password' option
  Then the user should be redirected to the dashboard URL
  And the dashboard should display the recruiter's name

  Examples:
    | email               | password           |
    | krishna@gmail.com   | ValidPassword123   |

  @feature_password_visibility
  @toggle-password-visibility
  Scenario Outline: Verify Show/Hide Password functionality
    Given the user enters "<password>" in the Password field
    When the user clicks the 'Show/Hide Password' option
    Then the password should be visible
    When the user clicks the 'Show/Hide Password' option again
    Then the password should be hidden

    Examples:
      | password         |
      | ValidPassword123 |

@incorrect-email
Scenario Outline: Verify error message for incorrect email ID
  Given the user is on the Login Screen
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email_id | password            |
    | abc@     | ValidPassword123    |

  @incorrect-password
  Scenario Outline: Verify error message for incorrect password
    Given the user enters a valid email ID "<email>"
    And the user enters an incorrect password "<password>"
    And the user clicks the 'Login' button
    Then an error message "Incorrect email ID or password." is displayed

    Examples:
      | email               | password          |
      | krishna@gmail.com   | wrongpassword123   |

@empty-fields-error
Scenario Outline: Verify error message for empty fields
  When I leave the Email ID field empty
  And I leave the Password field empty
  And I click the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | Email ID | Password |
    |          |          |

@sql-injection-error
Scenario Outline: Verify error message for SQL injection in email field
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  Then the user should see an error message 'Incorrect email ID or password.'

  Examples:
    | email                     | password     |
    | 'admin' OR '1'='1'      | anyPassword  |

@valid_login_button_disabled
Scenario Outline: Verify Login button is disabled when fields are empty
  Given the Email ID field is "<email>"
  And I enter "<password>" in the Password field
  Then the 'Login' button should be disabled
  Given the Password field is cleared
  And I enter "<email>" in the Email ID field
  Then the 'Login' button should still be disabled

  Examples:
    | email                     | password       |
    |                          | valid_password |
    | valid_email@example.com   |                |
```gherkin
@verify_login_max_length
Scenario Outline: Verify login with maximum length email and password
  Given the user is on the Login Screen
  When I enter an email ID at the maximum allowed length "<email>"
  And I enter a password at the maximum allowed length "<password>"
  And I click the 'Login' button
  Then the user should be redirected to the dashboard

  Examples:
    | email

@valid-special-character-login
Scenario Outline: Verify login with special characters in email and password
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And the user clicks the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email                     | password    |
    | user+test@example.com     | P@ssw0rd!   |

@valid-login
Scenario Outline: Verify successful login with valid credentials
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  Then the 'Show/Hide Password' option is available
  And I should be redirected to the dashboard URL
  And the dashboard displays the recruiter's name

  Examples:
    | email                  | password          |
    | krishna@gmail.com      | ValidPassword123   |

  @feature_verify_show_hide_password
  @verify_show_hide_password
  Scenario Outline: Verify Show/Hide Password functionality
    Given the user is on the Login Screen
    When I enter "<password>" in the Password field
    And I click the 'Show/Hide Password' option
    Then the password should be visible
    And I click the 'Show/Hide Password' option again
    Then the password should be hidden

    Examples:
      | password          |
      | ValidPassword123  |

@incorrect-email
Scenario Outline: Verify error message for incorrect email ID
  Given the user enters an incorrect email ID "<emailID>"
  And the user enters a valid password "<password>"
  When the user clicks the 'Login' button
  Then the user should see the error message 'Incorrect email ID or password.'

  Examples:
    | emailID | password            |
    | abc@    | ValidPassword123    |

@incorrect-password-error
Scenario Outline: Verify error message for incorrect password
  Given the user enters a valid email ID "<email>"
  And the user enters an incorrect password "<password>"
  And the user clicks the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email               | password           |
    | krishna@gmail.com   | wrongpassword123   |

@empty_fields_error_message
Scenario Outline: Verify error message for empty fields
  When the user leaves the Email ID field empty
  And the user leaves the Password field empty
  And the user clicks the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | Email ID | Password |
    |          |          |

  @verify_sql_injection_error
  Scenario Outline: Verify error message for SQL injection in email field
    Given the user enters the SQL injection string "<email>"
    And the user enters the password "<password>"
    And the user clicks the Login button
    Then the user should see the error message 'Incorrect email ID or password.'

    Examples:
      | email                     | password      |
      | "'admin' OR '1'='1'"     | anyPassword   |

@disabled_login_button
Scenario Outline: Verify Login button is disabled when fields are empty
  When the user leaves the Email ID field empty
  And the user enters "<password>" in the Password field
  Then the 'Login' button should be disabled
  When the user clears the Password field
  And the user enters "<email>" in the Email ID field
  Then the 'Login' button should still be disabled

  Examples:
    | password          | email                     |
    | valid_password    | valid_email@example.com   |
```gherkin
@maximum_length_login
Scenario Outline: Verify login with maximum length email and password
  Given I enter an email ID at the maximum allowed length in the Email ID field
  And I enter a password at the maximum allowed length in the Password field
  When the user clicks the 'Login' button
  Then the user should be redirected to the dashboard

  Examples:
    | email

@special_character_login
Scenario Outline: Verify login with special characters in email and password
  Given the user enters an email ID with special characters "<email>"
  And the user enters a password with special characters "<password>"
  When the user clicks the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email                    | password      |
    | user+test@example.com   | P@ssw0rd!     |
