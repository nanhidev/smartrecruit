
@feature_user_login
Feature: LoginScreenforRecruiters

Background: 
  Given the user is on the Login Screen

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the 'Show Password' option
  And I click the Login button
  Then the system processes the login request
  And the URL changes to the dashboard URL
  And the dashboard elements are visible and accessible

  Examples:
    | email              | password           |
    | <email>           | <password>         |
    | krishna@gmail.com  | SecurePassword123  |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When the user enters "<email_id>" in the Email ID field
  And the user enters "<password>" in the Password field
  And the user observes the state of the Login button
  Then the Login button should be enabled
  And the user clicks the Login button
  Then the system processes the login request
  And the URL should change to the dashboard URL
  And the dashboard elements should be visible and accessible

  Examples:
    | email_id           | password           |
    | krishna@gmail.com  | ValidPassword123   |

@toggle_password_visibility
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When the user enters a valid password "<password>"
  And the user clicks the 'Show Password' option
  Then the password should be visible
  When the user clicks the 'Hide Password' option
  Then the password should not be visible
  When the user enters a new password "<new_password>"
  And the user clicks the 'Show Password' option again
  Then the new password should be visible

  Examples:
    | password            | new_password       |
    | ValidPassword123!   | ValidPassword456!   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given I enter "<emailID>" in the Email ID field
  And I enter "<password>" in the Password field
  And I check the 'Remember Me' option
  And I click the Login button
  Then I observe the page response after clicking the Login button
  And I log out of the application
  And I navigate back to the login screen
  Then the Email ID field is pre-filled with "<emailID>"

  Examples:
    | emailID                 | password            |
    | recruiter@example.com   | SecurePassword123   |

@validate_recruiter_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<emailID>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I navigate to a different page
  And I return to the dashboard
  Then the dashboard elements are visible and the user is still logged in

  Examples:
    | emailID               | password           |
    | recruiter@example.com | SecurePassword123  |

  @valid-login
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email>"
    And I enter "<password>"
    And I click the Login button
    Then the page response should be received
    And I remain active on the dashboard for 30 minutes
    And I perform various actions on the dashboard
    Then the user should still be logged in

    Examples:
      | email               | password          |
      | <email>            | <password>        |
      | krishna@gmail.com   | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And the user clicks the Login button
  Then the system processes the login request
  And the user clicks on the 'Forgot Password?' link
  When I enter "<reset_email_id>" for password reset
  And the user submits the password reset request
  Then the password reset request is submitted successfully

  Examples:
    | email_id              | password          | reset_email_id         |
    | recruiter@example.com  | ValidPassword123  | recruiter@example.com   |

@valid_login_recruiter
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And the user clicks the Login button
  Then the page response should be observed
  And all dashboard features should be visible
  And the user clicks on a job posting
  Then the job posting details should be displayed correctly

  Examples:
    | email_id              | password            |
    | recruiter@example.com  | SecurePassword123   |

@valid_login_and_logout
Scenario Outline: Login Screen for Recruiters
  Given the recruiter is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then I observe the page response after clicking the Login button
  When I click the Logout button on the dashboard
  Then I observe the page response after clicking the Logout button
  And I verify the user is redirected to the Login Screen

  Examples:
    | email              | password          |
    | <email>           | <password>        |
    | krishna@gmail.com  | validPassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And recruiter-specific features are visible and accessible
  And I click on the candidate search feature
  Then the candidate search functionality works as expected

  Examples:
    | email               | password           |
    | krishna@gmail.com   | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the profile settings option on the dashboard
  Then the profile settings page is displayed correctly
  And the user's information is displayed accurately

  Examples:
    | email                 | password          |
    | krishna@gmail.com     | ValidPassword123   |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the system processes the login request
  When I click on the notifications icon on the dashboard
  Then the notifications panel is displayed
  And the notifications are relevant and up-to-date

  Examples:
    | email_id              | password           |
    | recruiter@example.com | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the system processes the login request
  And I click on the help icon on the dashboard
  Then the help resources page is displayed
  And the help resources are relevant and accessible

  Examples:
    | email               | password          |
    | <email>            | <password>        |
    | krishna@gmail.com   | validPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the settings icon on the dashboard
  Then the settings page is displayed correctly
  And the settings options are relevant and accessible

  Examples:
    | email               | password          |
    | krishna@gmail.com   | ValidPassword123  |

@valid_recruiter_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the page response is observed
  And I click on the feedback option on the dashboard
  Then the feedback form is displayed
  And the feedback options are relevant and accessible

  Examples:
    | email               | password          |
    | <email>            | <password>        |
    | krishna@gmail.com   | ValidPassword123  |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the activity log option on the dashboard
  Then the activity log page is displayed correctly
  And the activity log entries are relevant and accurate

  Examples:
    | email                  | password           |
    | recruiter@example.com  | SecurePassword123   |

@valid_recruiter_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And the user clicks the Login button
  Then the system processes the login request
  And the user clicks on the preferences option on the dashboard
  Then the preferences page is displayed correctly
  And the preferences options are relevant and accessible

  Examples:
    | email_id            | password          |
    | <email_id>         | <password>        |
    | krishna@gmail.com   | SecurePassword123  |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the roles option on the dashboard
  Then the roles page is displayed
  And the roles options are relevant and accessible

  Examples:
    | email_id              | password           |
    | <email_id>           | <password>        |
    | recruiter@example.com  | SecurePassword123  |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<emailID>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the system processes the login request
  And I click on the permissions option on the dashboard
  Then the permissions page is displayed
  And the permissions options are relevant and accessible

  Examples:
    | emailID            | password          |
    | <emailID>         | <password>        |
    | krishna@gmail.com  | ValidPassword123  |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the notifications option on the dashboard
  Then the notifications page is displayed correctly
  And the notifications options are relevant and accessible

  Examples:
    | email_id                | password          |
    | recruiter@example.com   | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And the user clicks the Login button
  Then the system processes the login request
  And the user clicks on the settings option on the dashboard
  Then the settings page is displayed correctly
  And the settings options are relevant and accessible

  Examples:
    | email                 | password         |
    | krishna@gmail.com     | ValidPassword123  |

@valid_login_recruiter
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the profile option on the dashboard
  Then the profile page is displayed correctly
  And the profile information is relevant and accurate

  Examples:
    | email               | password         |
    | krishna@gmail.com   | ValidPassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the feedback option on the dashboard
  Then the feedback form should be displayed
  And the feedback options should be relevant and accessible

  Examples:
    | email                | password          |
    | krishna@gmail.com    | ValidPassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the activity log option on the dashboard
  Then the activity log page is displayed
  And the activity log entries are relevant and accurate

  Examples:
    | email                     | password            |
    | recruiter@example.com     | SecurePassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the preferences option on the dashboard
  Then the preferences page is displayed correctly
  And the preferences options are relevant and accessible

  Examples:
    | email                | password          |
    | krishna@gmail.com    | SecurePassword123  |

@successful_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the roles option on the dashboard
  Then the roles page is displayed correctly
  And the roles options are relevant and accessible

  Examples:
    | email_id               | password           |
    | recruiter@example.com   | SecurePassword123  |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the permissions option on the dashboard
  Then the permissions page is displayed correctly
  And the permissions options are relevant and accessible

  Examples:
    | email_id           | password          |
    | <email_id>        | <password>        |
    | krishna@gmail.com  | ValidPassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the notifications option on the dashboard
  Then the notifications page is displayed

  Examples:
    | email_id               | password          |
    | recruiter@example.com  | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the settings option on the dashboard
  Then the settings page is displayed correctly
  And the settings options are relevant and accessible

  Examples:
    | email               | password          |
    | krishna@gmail.com   | ValidPassword123  |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the profile option on the dashboard
  Then the profile page is displayed correctly
  And the profile information is displayed accurately

  Examples:
    | email              | password            |
    | <email>           | <password>          |
    | krishna@gmail.com  | ValidPassword123    |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the feedback option on the dashboard
  Then the feedback form is displayed
  And the feedback options are relevant and accessible

  Examples:
    | email                | password          |
    | krishna@gmail.com    | ValidPassword123  |

@successful-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<emailID>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the activity log option on the dashboard
  Then the activity log page is displayed correctly
  And the activity log entries are relevant and accurate

  Examples:
    | emailID                | password          |
    | recruiter@example.com  | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the preferences option on the dashboard
  Then the preferences page is displayed correctly
  And the preferences options are relevant and accessible

  Examples:
    | email               | password           |
    | krishna@gmail.com   | SecurePassword123   |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the roles option on the dashboard
  Then the roles page is displayed correctly
  And the roles options are relevant and accessible

  Examples:
    | email                   | password           |
    | recruiter@example.com   | SecurePassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the permissions option on the dashboard
  Then the permissions page is displayed
  And the permissions options are relevant and accessible

  Examples:
    | email               | password          |
    | krishna@gmail.com   | ValidPassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the notifications option on the dashboard
  Then the notifications page is displayed correctly
  And the notifications options are relevant and accessible

  Examples:
    | email                   | password          |
    | recruiter@example.com   | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the settings option on the dashboard
  Then the settings page is displayed correctly
  And I check that the settings options are relevant and accessible

  Examples:
    | email               | password         |
    | krishna@gmail.com   | ValidPassword123  |

@valid_recruiter_login
Scenario Outline: Login Screen for Recruiters
  Given the recruiter is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the profile option on the dashboard
  Then the profile page is displayed correctly
  And the profile information is displayed accurately

  Examples:
    | email               | password         |
    | <email>            | <password>       |
    | krishna@gmail.com   | ValidPassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the feedback option on the dashboard
  Then the feedback form is displayed
  And the feedback options are relevant and accessible

  Examples:
    | email                 | password           |
    | krishna@gmail.com     | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the system processes the login request
  And I click on the activity log option on the dashboard
  Then the activity log page is displayed correctly
  And the activity log entries are relevant and accurate

  Examples:
    | email_id              | password           |
    | recruiter@example.com  | SecurePassword123  |

@valid_recruiter_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<emailID>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the preferences option on the dashboard
  Then the preferences page is displayed correctly
  And the preferences options are relevant and accessible

  Examples:
    | emailID             | password          |
    | krishna@gmail.com   | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And the user clicks the Login button
  Then the system processes the login request
  And the user clicks on the roles option on the dashboard
  Then the roles page is displayed correctly
  And the roles options are relevant and accessible

  Examples:
    | email_id              | password           |
    | recruiter@example.com  | SecurePassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the recruiter is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the permissions option on the dashboard
  Then the permissions page is displayed correctly
  And the permissions options are relevant and accessible

  Examples:
    | email                | password           |
    | krishna@gmail.com    | ValidPassword123   |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the notifications option on the dashboard
  Then the notifications page is displayed correctly
  And the notifications options are relevant and accessible

  Examples:
    | email                  | password          |
    | recruiter@example.com  | SecurePassword123  |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the settings option on the dashboard
  Then the settings page is displayed correctly
  And the settings options are relevant and accessible

  Examples:
    | email              | password          |
    | <email>           | <password>        |
    | krishna@gmail.com  | ValidPassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the profile option on the dashboard
  Then the profile page is displayed correctly
  And the profile information is displayed accurately

  Examples:
    | email                | password         |
    | krishna@gmail.com    | ValidPassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the feedback option on the dashboard
  Then the feedback form is displayed
  And the feedback options are relevant and accessible

  Examples:
    | email               | password            |
    | <email>            | <password>         |
    | krishna@gmail.com   | ValidPassword123    |

@valid_login_recruiter
Scenario Outline: Login Screen for Recruiters
  When I enter "<emailID>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the activity log option on the dashboard
  Then the activity log page is displayed correctly
  And the activity log entries are relevant and accurate

  Examples:
    | emailID               | password             |
    | recruiter@example.com  | SecurePassword123    |

@valid_login_recruiter
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the preferences option on the dashboard
  Then the preferences page is displayed correctly
  And the preferences options are relevant and accessible

  Examples:
    | email                | password           |
    | <email>             | <password>         |
    | krishna@gmail.com    | SecurePassword123   |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<emailID>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the roles option on the dashboard
  Then the roles page is displayed correctly
  And the roles options are relevant and accessible

  Examples:
    | emailID                | password         |
    | recruiter@example.com   | SecurePassword123 |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the permissions option on the dashboard
  Then the permissions page is displayed correctly
  And the permissions options are relevant and accessible

  Examples:
    | email               | password           |
    | <email>            | <password>         |
    | krishna@gmail.com   | ValidPassword123   |

@valid_login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the notifications option on the dashboard
  Then the notifications page is displayed correctly
  And the notifications options are relevant and accessible

  Examples:
    | email_id               | password          |
    | recruiter@example.com  | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the settings option on the dashboard
  Then the settings page is displayed correctly
  And the settings options are relevant and accessible

  Examples:
    | email              | password         |
    | krishna@gmail.com  | ValidPassword123  |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the profile option on the dashboard
  Then the profile page is displayed correctly
  And I verify the profile information is displayed accurately

  Examples:
    | email               | password          |
    | krishna@gmail.com   | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the feedback option on the dashboard
  Then the feedback form is displayed

  Examples:
    | email               | password           |
    | krishna@gmail.com   | ValidPassword123   |

@valid_login_recruiter
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the activity log option on the dashboard
  Then the activity log page is displayed correctly
  And the activity log entries are relevant and accurate

  Examples:
    | email                   | password           |
    | recruiter@example.com   | SecurePassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the preferences option on the dashboard
  Then the preferences page is displayed correctly
  And the preferences options are relevant and accessible

  Examples:
    | email                 | password           |
    | krishna@gmail.com     | SecurePassword123   |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the roles option on the dashboard
  Then the roles page is displayed
  And the roles options are relevant and accessible

  Examples:
    | email                    | password          |
    | recruiter@example.com    | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And the user clicks the Login button
  Then the system processes the login request
  And the user clicks on the permissions option on the dashboard
  Then the permissions page is displayed correctly
  And the permissions options are relevant and accessible

  Examples:
    | email              | password          |
    | <email>           | <password>        |
    | krishna@gmail.com  | ValidPassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the notifications option on the dashboard
  Then the notifications page is displayed
  And the notifications options are relevant and accessible

  Examples:
    | email_id             | password           |
    | recruiter@example.com | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the settings option on the dashboard
  Then the settings page is displayed correctly
  And the settings options are relevant and accessible

  Examples:
    | email              | password           |
    | krishna@gmail.com  | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the profile option on the dashboard
  Then the profile page is displayed correctly
  And the profile information is displayed accurately

  Examples:
    | email                | password          |
    | krishna@gmail.com    | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the feedback option on the dashboard
  Then the feedback form is displayed correctly
  And the feedback options are relevant and accessible

  Examples:
    | email                | password           |
    | krishna@gmail.com    | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the system processes the login request
  And I click on the activity log option on the dashboard
  Then the activity log page is displayed correctly
  And the activity log entries are relevant and accurate

  Examples:
    | email_id              | password           |
    | recruiter@example.com  | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the preferences option on the dashboard
  Then the preferences page is displayed correctly
  And the preferences options are relevant and accessible

  Examples:
    | email                | password           |
    | krishna@gmail.com    | SecurePassword123   |

@successful-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  And I observe the page response after clicking the Login button
  And I click on the roles option on the dashboard
  Then the roles page should be displayed
  And the roles options should be relevant and accessible

  Examples:
    | email                   | password            |
    | recruiter@example.com   | SecurePassword123   |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the permissions option on the dashboard
  Then the permissions page is displayed correctly
  And the permissions options are relevant and accessible

  Examples:
    | email               | password          |
    | <email>            | <password>        |
    | krishna@gmail.com   | ValidPassword123  |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the notifications option on the dashboard
  Then the notifications page is displayed correctly
  And the notifications options are relevant and accessible

  Examples:
    | email                    | password          |
    | recruiter@example.com    | SecurePassword123  |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter a valid email ID "<emailID>"
  And I enter a valid password "<password>"
  And I click the Login button
  Then the system processes the login request
  And I click on the settings option on the dashboard
  Then the settings page is displayed correctly
  And the settings options are relevant and accessible

  Examples:
    | emailID            | password          |
    | krishna@gmail.com  | ValidPassword123  |
