
@feature_user_login
Feature: LoginScreenforRecruiters

Background: 
  Given the user is on the Login Screen

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click on the 'Show Password' option to verify visibility
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard loads successfully without errors

  Examples:
    | email_id             | password           |
    | recruiter@example.com | ValidPassword123   |

@check_login_button_state
Scenario Outline: Login Screen for Recruiters - Check Login Button State
  When I enter "<emailID>" in the Email ID field
  And I enter "<password>" in the Password field
  Then the Login button should be "<buttonState>"

  Examples:
    | emailID            | password      | buttonState |
    | krishna@gmail.com  |                | disabled     |
    | krishna@gmail.com  | password123   | enabled      |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user enters "<password>" in the Password field
  When the user clicks on the 'Show Password' option
  Then the password should be visible
  When the user clicks on the 'Hide Password' option
  Then the password should be hidden

  Examples:
    | password       |
    | P@ssw0rd123    |

  @valid_login_recruiter
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email_id>"
    And I enter "<password>"
    And I check the 'Remember Me' option
    And I click the Login button
    Then the user should be redirected to the dashboard
    And the user logs out successfully
    And the user closes the browser and reopens it
    And the user navigates back to the application
    Then the login screen is displayed again
    And the email ID is pre-filled in the Email ID field

    Examples:
      | email_id             | password           |
      | recruiter@example.com | ValidPassword123   |

@valid-email-subdomain
Scenario Outline: Login Screen for Recruiters with Subdomain
  Given the recruiter navigates to the login screen
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard should load successfully without errors

  Examples:
    | email                          | password         |
    | user@subdomain.example.com     | ValidPassword123  |
    | user+test@example.com          | ValidPassword123  |

@valid-email-plus
Scenario Outline: Login Screen for Recruiters with Plus Sign
  Given the recruiter navigates to the login screen
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard should load successfully without errors

  Examples:
    | email                          | password         |
    | user+test@example.com          | ValidPassword123  |

@valid-password-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then I should be redirected to the dashboard
  And the dashboard should load successfully without errors

  Examples:
    | email                 | password          |
    | recruiter@example.com | P@ssw0rd123!      |

@valid-password-login
Scenario Outline: Log out and repeat with another valid password format
  When I enter "<email>" in the Email ID field
  And I enter "<new_password>" in the Password field
  And I click the Login button
  Then I should be redirected to the dashboard
  And the dashboard should load successfully without errors

  Examples:
    | email                 | new_password      |
    | recruiter@example.com | NewP@ssw0rd456!   |

@valid-email-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard should load successfully without errors

  Examples:
    | email                    | password          |
    | recruiter123@gmail.com   | ValidPassword123   |

@valid_login_case
Scenario Outline: Login Screen for Recruiters
  Given I enter a valid email ID "<email_id>" in the Email ID field
  And I enter a valid password "<password>" in the Password field
  When I click the Login button
  Then the user is redirected to the dashboard
  And the dashboard loads successfully without errors

  Examples:
    | email_id             | password          |
    | KrIsHnA@Gmail.com    | PaSsWoRd123       |

@invalid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then an error message 'Incorrect email ID or password.' is displayed
  And the user remains on the login screen

  Examples:
    | email_id | password |
    | abc@     | 12345    |

@disabled_login_button
Scenario Outline: Verify that the Login button is disabled when either the Email ID or Password field is empty
  When I leave the Email ID field empty
  And I enter <password> in the Password field
  Then the Login button is disabled
  When I enter <email> in the Email ID field
  And I leave the Password field empty
  Then the Login button is disabled

  Examples:
    | email                        | password          |
    |                             | validPassword123  |
    | validEmail@example.com      |                    |

@empty_fields_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I leave both the Email ID and Password fields empty
  And I click the Login button
  Then an error message indicating that both fields are required is displayed
  And the user remains on the Login Screen

  Examples:
    | Email ID | Password |
    |          |          |

  @invalid-email-format
  Scenario Outline: Login Screen for Recruiters
    Given the user is on the Login Screen
    When I enter an invalid email format "<email>"
    And I enter a valid password "<password>"
    And I click the Login button
    Then an error message indicating invalid email format is displayed
    And the user remains on the login screen

    Examples:
      | email  | password          |
      | abc@   | ValidPassword123   |

@invalid-password-length
Scenario Outline: Login Screen for Recruiters
  Given the user enters "<email>"
  And the user enters "<password>"
  And the user clicks the Login button
  Then an error message indicating password length requirement is displayed
  And the user remains on the login screen

  Examples:
    | email              | password   |
    | krishna@gmail.com  | aaaaa      |

@invalid-email-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then an error message indicating invalid email format is displayed
  And the user remains on the login screen

  Examples:
    | email_id     | password           |
    | abc@         | ValidPassword123   |

@error-message-long-email
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then an error message indicating email ID exceeds character limit is displayed
  And the user remains on the login screen

  Examples:
    | email_id                                                                 | password          |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | ValidPassword123 |

  @max-character-login
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email_id>"
    And I enter "<password>"
    And I click the Login button
    Then the user should be redirected to the dashboard

    Examples:
      | email_id                                                                                      | password                                                                                      |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@valid-login-special-characters
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard should load successfully without errors

  Examples:
    | email_id              | password           |
    | recruiter@example.com  | P@ssw0rd!#2023     |

@whitespace_login
Scenario Outline: Login Screen for Recruiters
  Given I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  When I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard loads successfully without errors

  Examples:
    | email               | password       |
    | " krishna@gmail.com " | " password123 " |
