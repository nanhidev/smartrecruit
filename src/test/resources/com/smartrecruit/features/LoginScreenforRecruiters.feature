
@feature_user_login
Feature: LoginScreenforRecruiters

Background: 
  Given the user is on the Login Screen

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<emailID>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then the dashboard should be displayed

  Examples:
    | emailID           | password          |
    | krishna@gmail.com | validPassword123   |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given I enter a valid email ID "<email_id>"
  And I enter a valid password "<password>"
  Then the Login button should be enabled

  Examples:
    | email_id           | password            |
    | krishna@gmail.com  | ValidPassword123    |

@toggle_password_visibility
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter <password> in the Password field
  And I click the "Show Password" option
  Then the password should be visible
  And I click the "Hide Password" option
  Then the password should be hidden

  Examples:
    | password           |
    | ValidPassword123   |

@invalid_email_format
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email          | password            |
    | user@domain    | validPassword123    |

@valid_login_recruiter
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And the user checks the 'Remember Me' option
  And the user clicks the 'Login' button
  And the system processes the login request
  And the user logs out and returns to the login screen
  Then the email ID should be pre-filled in the Email ID field

  Examples:
    | email               | password           |
    | <email>            | <password>        |
    | krishna@gmail.com   | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And the 'Remember Me' option is unchecked
  When I click the 'Login' button
  Then the user should be logged in successfully
  And the user logs out
  And the user returns to the Login Screen
  Then the email ID field should be empty

  Examples:
    | email                | password           |
    | krishna@gmail.com    | validPassword123    |

  @error_message_empty_email
  Scenario Outline: Login Screen for Recruiters
    Given the user is on the Login Screen
    When I leave the Email ID field empty
    And I enter "<password>"
    And I click the 'Login' button
    Then the system processes the login request
    And an error message 'Incorrect email ID or password.' is displayed

    Examples:
      | password          |
      | ValidPassword123  |

@empty_password_error
Scenario Outline: Login Screen for Recruiters
  Given the user enters "<email_id>"
  And the user leaves the Password field empty
  When the user clicks the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email_id          |
    | krishna@gmail.com  |

@empty_fields_error
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I leave the Email ID field empty
  And I leave the Password field empty
  And I click the 'Login' button
  Then the system should process the login request
  And an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email ID | password |
    |          |          |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then the dashboard is displayed

  Examples:
    | email                          | password            |
    | user.name+tag@domain.com      | validPassword123    |

@valid_login_max_length_email
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  Then the dashboard is displayed

  Examples:
    | email                                                                 | password         |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | validPassword123 |

@valid_login_max_length
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the 'Login' button
  Then the dashboard should be displayed

  Examples:
    | email_id          | password                                                                                                                                                                                                 |
    | krishna@gmail.com | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@sql-injection-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email                   | password            |
    | user' OR '1'='1'      | validPassword123    |

@xss-password-attempt
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter a valid email ID "<email_id>"
  And I enter an XSS attempt "<password>"
  And the user clicks the 'Login' button
  Then the system processes the request
  And an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email_id           | password                     |
    | krishna@gmail.com  | <script>alert('XSS')</script> |

@valid_login_slow_network
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I simulate a slow network connection
  And I click the 'Login' button
  Then the user should be directed to the Dashboard after a delay

  Examples:
    | email               | password            |
    | krishna@gmail.com   | ValidPassword123    |

@session-timeout
Scenario Outline: Login Screen for Recruiters
  When I enter a valid email ID in the Email ID field as "<email>"
  And I enter a valid password in the Password field as "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  And I simulate a session timeout
  And I attempt to access the dashboard
  Then the user should be redirected to the login screen

  Examples:
    | email                  | password  |
    | recruiter@example.com  | Secure123 |

@validate_logged_in_after_refresh
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then the dashboard should be displayed
  When I refresh the browser
  Then the user should remain on the dashboard

  Examples:
    | email_id          | password          |
    | krishna@gmail.com | ValidPassword123  |

@successful_login
Scenario Outline: Login Screen for Recruiters
  Given the user navigates to the login screen in the first tab
  When the user enters "<email>"
  And the user enters "<password>"
  And the user clicks the 'Login' button in the first tab
  And the user waits for the system to process the login request
  Then the dashboard should be displayed in the first tab
  And the second tab should remain on the login screen

  Examples:
    | email                 | password            |
    | krishna@gmail.com     | ValidPassword123    |

@valid-login-chrome
Scenario Outline: Login Screen for Recruiters in Chrome
  When the user enters a valid email ID "<email>"
  And the user enters a valid password "<password>"
  And the user clicks the 'Login' button
  Then the system processes the login request
  And the dashboard is displayed in Chrome

  Examples:
    | email                | password            |
    | krishna@gmail.com    | ValidPassword123    |

@valid-login-firefox
Scenario Outline: Login Screen for Recruiters in Firefox
  When the user enters a valid email ID "<email>"
  And the user enters a valid password "<password>"
  And the user clicks the 'Login' button
  Then the system processes the login request
  And the dashboard is displayed in Firefox

  Examples:
    | email                | password            |
    | krishna@gmail.com    | ValidPassword123    |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter a valid email ID "<email>"
  And I enter a valid password "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then the dashboard should be displayed on the mobile device

  Examples:
    | email              | password            |
    | krishna@gmail.com  | ValidPassword123    |

  @valid_login_accessibility
  Scenario Outline: Login Screen for Recruiters
    Given the user is on the login screen
    When I use a screen reader to read the labels for Email ID and Password fields
    And I enter a valid email ID "<email_id>" in the Email ID field using the keyboard
    And I enter a valid password "<password>" in the Password field using the keyboard
    And I click the 'Login' button using the keyboard
    And I wait for the system to process the login request
    Then the dashboard should be displayed

    Examples:
      | email_id           | password          |
      | krishna@gmail.com  | ValidPassword123  |

  @keyboard_navigation
  Scenario Outline: Login Screen for Recruiters
    When I use the Tab key to focus on the Email ID field
    And I enter "<email>"
    And I use the Tab key to focus on the Password field
    And I enter "<password>"
    And I use the Tab key to focus on the 'Login' button
    And I press Enter to click the 'Login' button
    Then the system processes the login request without errors

    Examples:
      | email                | password           |
      | krishna@gmail.com    | ValidPassword123   |

@password_reset_link
Scenario Outline: Login Screen for Recruiters
  When the user clicks on the 'Forgot Password?' link
  Then the password reset screen is displayed
  When the user enters a valid email ID "<email>"
  And the user clicks the 'Send Reset Link' button
  Then the system processes the request
  And a success message is displayed

  Examples:
    | email              |
    | krishna@gmail.com  |

@validate_complex_password
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the 'Login' button
  Then the dashboard should be displayed

  Examples:
    | email_id          | password         |
    | krishna@gmail.com | P@ssw0rd123!     |

@expired-password-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<expired_password>"
  And I click the 'Login' button
  Then the user is prompted to change their password

  Examples:
    | email_id           | expired_password     |
    | krishna@gmail.com  | expiredPassword123   |

@account_lock_validation
Scenario Outline: Login Screen for Recruiters - Failed Login Attempts
  Given the user enters "<email ID>" in the Email ID field
  And the user enters "<password>" in the Password field
  When the user clicks the 'Login' button
  Then the system should display an error message for each failed attempt

  Examples:
    | email ID            | password       |
    | krishna@gmail.com   | wrongpassword  |
    | krishna@gmail.com   | wrongpassword  |
    | krishna@gmail.com   | wrongpassword  |
    | krishna@gmail.com   | wrongpassword  |
    | krishna@gmail.com   | wrongpassword  |
    
@account_lock_validation
Scenario: Account Lock Verification
  Given the user enters "krishna@gmail.com" in the Email ID field
  And the user enters "wrongpassword" in the Password field
  When the user clicks the 'Login' button
  And the user enters "krishna@gmail.com" in the Email ID field
  And the user enters "wrongpassword" in the Password field
  When the user clicks the 'Login' button
  And the user enters "krishna@gmail.com" in the Email ID field
  And the user enters "wrongpassword" in the Password field
  When the user clicks the 'Login' button
  And the user enters "krishna@gmail.com" in the Email ID field
  And the user enters "wrongpassword" in the Password field
  When the user clicks the 'Login' button
  And the user enters "krishna@gmail.com" in the Email ID field
  And the user enters "wrongpassword" in the Password field
  When the user clicks the 'Login' button
  Then the account should be locked
  And the system should display an appropriate message

@valid_password_hint
Scenario Outline: Login Screen for Recruiters
  When the user clicks on the 'Forgot Password?' link
  And the user enters "<email>" in the reset field
  And the user clicks the 'Send Reset Link' button
  Then the system processes the request
  And a password hint is displayed

  Examples:
    | email              |
    | krishna@gmail.com  |

  @password_reset
  Scenario Outline: Login Screen for Recruiters
    When the user clicks on the 'Forgot Password?' link
    And the user enters a valid email ID "<email>"
    And the user clicks the 'Send Reset Link' button
    And the user waits for the system to process the request
    And the user changes the password using the link sent to the email
    And the user logs in with the new password
    Then the user should see a notification confirming the password change

    Examples:
      | email              |
      | krishna@gmail.com  |

@password_recovery
Scenario Outline: Login Screen for Recruiters
  When the user clicks on the 'Forgot Password?' link
  And the user selects the option to recover using security questions
  And the user answers the security questions correctly
  And the user sets a new password
  And the user logs in with the new password
  Then the dashboard is displayed successfully

  Examples:
    | <username> | <new_password> |
    | user1      | Password123    |

@password_reset_confirmation
Scenario Outline: Login Screen for Recruiters
  When the user clicks on the 'Forgot Password?' link
  And the user enters "<email>"
  And the user clicks the 'Send Reset Link' button
  Then the user waits for the system to process the request
  And the user checks the email for a confirmation message
  Then the user verifies that the confirmation message is received

  Examples:
    | email              |
    | krishna@gmail.com  |

@valid_password_reset
Scenario Outline: Login Screen for Recruiters
  When the user clicks on the 'Forgot Password?' link
  And the user enters "<email>" in the reset field
  And the user clicks the 'Send Reset Link' button
  And the user waits for the system to process the request
  And the user attempts to use the reset link after the expiration period
  Then the user should see an error message indicating the link has expired

  Examples:
    | email              |
    | krishna@gmail.com  |

@reset_link_validation
Scenario Outline: Login Screen for Recruiters
  When the user clicks on the 'Forgot Password?' link
  And the user enters a valid email ID "<email>"
  And the user clicks the 'Send Reset Link' button
  And the user waits for the system to process the request
  And the user uses the reset link to change the password
  And the user attempts to use the same reset link again
  Then an error message is displayed

  Examples:
    | email               |
    | krishna@gmail.com   |

@invalid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email                | password           |
    | krishna@gmail.com    | wrongPassword123   |

@invalid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email      | password           |
    | invalidemail | validPassword123   |

@sql_injection_test
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email_id           | password             |
    | krishna@gmail.com  | "' OR '1'='1"       |

@xss-attempt
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email_id                    | password            |
    | <script>alert('XSS')</script> | validPassword123    |

@empty_fields_error_message
Scenario Outline: Login Screen for Recruiters
  Given the user leaves the Email ID field empty
  And the user leaves the Password field empty
  When the user clicks the 'Login' button
  Then the system processes the login request
  And an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email ID | password |
    |          |          |

@empty_email_field
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  And the Email ID field is empty
  When I enter "<password>"
  And I click the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | password          |
    | ValidPassword123  |

@empty_password_error
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I leave the Password field empty
  And I click the 'Login' button
  Then the system processes the login request
  And an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email_id         |
    | krishna@gmail.com |

@invalid-email-format
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email         | password            |
    | user@domain   | ValidPassword123    |

@failed_login_attempts
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  And I repeat the login attempt for a total of 5 times
  Then the account should be locked after the 5th attempt

  Examples:
    | email                | password       |
    | krishna@gmail.com    | wrongpassword  |

  @expired-password-prompt
  Scenario Outline: Login Screen for Recruiters
    Given the user is on the Login Screen for Recruiters
    When I enter "<email_id>" in the Email ID field
    And I enter "<expired_password>" in the Password field
    And I click the 'Login' button
    And I wait for the system to process the login request
    Then the user should be prompted to change their password

    Examples:
      | email_id          | expired_password      |
      | krishna@gmail.com | expiredPassword123    |

@invalid_password
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then an error message 'Incorrect email ID or password.' is displayed

  Examples:
    | email_id          | password |
    | krishna@gmail.com | password |

@invalid_reset_link
Scenario Outline: Login Screen for Recruiters
  When the user clicks on the 'Forgot Password?' link
  And the user enters "<email>"
  And the user clicks the 'Send Reset Link' button
  And the user waits for the system to process the request
  And the user attempts to use an invalid reset link
  Then an error message indicating the link is invalid is displayed

  Examples:
    | email              |
    | krishna@gmail.com  |

  @expired_reset_link
  Scenario Outline: Login Screen for Recruiters
    When the user clicks on the 'Forgot Password?' link
    And the user enters "<email>" in the reset field
    And the user clicks the 'Send Reset Link' button
    And the user waits for the system to process the request
    And the user attempts to use the reset link after the expiration period
    Then an error message indicating the link has expired is displayed

    Examples:
      | email             |
      | krishna@gmail.com |

  @password-reset-error
  Scenario Outline: Login Screen for Recruiters
    Given the user clicks on the 'Forgot Password?' link
    When the user enters "<email>"
    And the user clicks the 'Send Reset Link' button
    And the user waits for the system to process the request
    And the user uses the reset link to change the password
    And the user attempts to use the same reset link again
    Then an error message is displayed

    Examples:
      | email              |
      | krishna@gmail.com  |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then the dashboard should be displayed

  Examples:
    | email                                                                 | password          |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | validPassword123 |

@valid-login-max-password
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then the dashboard should be displayed

  Examples:
    | email              | password                                                                                                                                     |
    | krishna@gmail.com  | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Login' button
  Then the dashboard is displayed successfully

  Examples:
    | email                       | password            |
    | user.name+tag@domain.com   | validPassword123    |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I simulate a slow network connection
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then the dashboard should be displayed after a delay

  Examples:
    | email_id           | password          |
    | krishna@gmail.com  | ValidPassword123  |

@session-timeout
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter a valid email ID "<email>"
  And I enter a valid password "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  And I simulate a session timeout
  And I attempt to access the dashboard
  Then the user should be redirected to the login screen

  Examples:
    | email            | password  |
    | recruiter1@test | Pass123   |
    | recruiter2@test | Pass456   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user navigates to the login screen in the first tab
  When the user enters a valid email ID in the Email ID field "<email_id>"
  And the user enters a valid password in the Password field "<password>"
  And the user clicks the 'Login' button in the first tab
  Then the system processes the login request
  And the dashboard is displayed in the first tab
  Then the second tab remains on the login screen

  Examples:
    | email_id           | password           |
    | krishna@gmail.com  | ValidPassword123   |

@valid-login-chrome
Scenario Outline: Login Screen for Recruiters
  When I open the application in "<browser>"
  And I navigate to the login screen
  And I enter a valid email ID "<email>"
  And I enter a valid password "<password>"
  And I click the 'Login' button
  And I wait for the system to process the login request
  Then the dashboard should be displayed in "<browser>"

  Examples:
    | browser | email               | password             |
    | Chrome  | <email>            | <password>           |
    | Firefox | <email>            | <password>           |

    Examples:
    | email               | password             |
    | krishna@gmail.com   | ValidPassword123     |
    | krishna@gmail.com   | ValidPassword123     |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user enters "<email_id>" in the Email ID field
  And the user enters "<password>" in the Password field
  When the user clicks the 'Login' button
  And the user waits for the system to process the login request
  Then the dashboard should be displayed on the mobile device

  Examples:
    | email_id          | password            |
    | krishna@gmail.com | ValidPassword123    |

@validate_screen_reader_accessibility
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When the screen reader reads the labels for Email ID and Password fields
  And I enter "<email_id>" in the Email ID field using the keyboard
  And I enter "<password>" in the Password field using the keyboard
  And I click the 'Login' button using the keyboard
  Then the dashboard is displayed

  Examples:
    | email_id           | password            |
    | krishna@gmail.com  | ValidPassword123    |

@keyboard_navigation
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I use the Tab key to focus on the Email ID field
  And I enter "<email_id>"
  And I use the Tab key to focus on the Password field
  And I enter "<password>"
  And I use the Tab key to focus on the 'Login' button
  And I press Enter to click the 'Login' button
  Then the system processes the request without errors

  Examples:
    | email_id          | password            |
    | <email_id>       | <password>          |
    | krishna@gmail.com | ValidPassword123    |

@password-reset
Scenario Outline: Login Screen for Recruiters
  When the user clicks on the 'Forgot Password?' link
  Then the password reset screen is displayed
  When the user enters a valid email ID "<email>"
  And the user clicks the 'Send Reset Link' button
  Then the system processes the request
  And a success message is displayed confirming the reset link has been sent

  Examples:
    | email              |
    | krishna@gmail.com  |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the login screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the 'Login' button
  Then the dashboard should be displayed

  Examples:
    | email_id           | password           |
    | krishna@gmail.com  | P@ssw0rd123!      |
