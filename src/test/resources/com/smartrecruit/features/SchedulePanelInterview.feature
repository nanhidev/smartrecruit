
@feature_schedule_panel_interview
Feature: SchedulePanelInterview

Background: 
  Given the user is on the Schedule Interview section

@create_panel_interview
Scenario Outline: Schedule Panel Interview
  When I click on Create Interview
  And I select "<job_opening>"
  And I select "<location>"
  And I enter the Candidate's email address as "<candidate_email>"
  And I choose the Panel Interview option
  And I select the interview Date as "<interview_date>"
  And I select Start Time as "<start_time>"
  And I select "<attendees>"
  And I select "<interview_round>"
  And I select "<interview_provider>"
  And I click on Next
  And I attach required files
  And I click on Confirm and Send
  Then the system displays a confirmation message for the scheduled interview

  Examples:
    | job_opening        | location      | candidate_email        | interview_date | start_time | attendees          | interview_round      | interview_provider    |
    | job opening value  | location value | candidate@example.com | 2023-10-15    | 10:00 AM  | attendees value    | interview round value | interview provider value |

@create_interview
Scenario Outline: Schedule Panel Interview
  When the user clicks on Create Interview
  And the user selects "<job_opening>" from the dropdown
  And the user selects "<location>" from the available options
  And the user enters the Candidate's email address "<candidate_email>" and selects the candidate
  And the user chooses the "<panel_interview_option>"
  And the user selects the interview Date "<interview_date>" and Start Time "<start_time>"
  And the user selects "<attendees>" and Interview Round "<interview_round>"
  And the user selects the "<interview_provider>"
  And the user fills in optional fields with notes "<interview_notes>" and instructions "<special_instructions>"
  And the user clicks on Next
  And the user attaches required files
  And the user clicks on Confirm and Send
  Then the system should display a confirmation message for the scheduled interview

  Examples:
    | job_opening        | location         | candidate_email      | panel_interview_option | interview_date | start_time | attendees           | interview_round | interview_provider | interview_notes | special_instructions |
    | job opening value  | location value   | candidate@example.com | Panel Interview       | 2023-10-15     | 10:00 AM   | attendee@example.com | Round 1        | Provider Name      | a * 100        | a * 100            |

@edit-interview
Scenario Outline: Schedule Panel Interview
  When the user selects a scheduled panel interview to edit
  And the user clicks on Edit Interview
  And the user modifies the Interview Date and Start Time
  And the user changes the Attendees if necessary
  And the user clicks on Save Changes
  Then the system displays a confirmation message for the updated interview
  And the updated interview details are saved in the system
  And notifications are sent to all updated participants
  And the interview appears in the calendar of all attendees with updated details
  And the candidate receives an email notification with updated interview details
  And the recruiter can view the updated interview in their dashboard

Examples:
  | InterviewDate | StartTime |
  | 2023-10-01    | 10:00 AM  |

@cancel_interview
Scenario Outline: Schedule Panel Interview
  When the recruiter selects a scheduled panel interview to cancel
  And the recruiter clicks on Cancel Interview
  And the recruiter confirms the cancellation in the prompt
  Then the system displays a confirmation message for the cancellation
  And the interview is removed from the scheduled interviews list
  And notifications are sent to all participants about the cancellation
  And the candidate receives an email notification about the cancellation
  And the recruiter can no longer view the canceled interview in their dashboard

Examples:
  | interview_id |
  | 12345        |

  @notification_verification
  Scenario Outline: Schedule Panel Interview
    When the recruiter schedules a panel interview
    And the participants check their email inbox
    Then all participants should receive an email notification about the scheduled interview
    And the email should contain the correct interview details
    And the email should be sent to the correct email addresses
    And the email should be formatted correctly and easy to read

    Examples:
      | participants   |
      | participant1   |
      | participant2   |
      | participant3   |

  @verify_interview_calendar
  Scenario Outline: Schedule Panel Interview
    When I schedule a panel interview as a recruiter
    And I navigate to the calendar section of the application
    Then the scheduled panel interview should appear on the calendar of all participants
    And the interview details should be correctly displayed on the calendar
    And participants can click on the interview to view more details

    Examples:
      |  |

  @missing_job_opening
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user leaves the Job Opening field empty
    And the user selects "<location>"
    And the user enters "<candidate_email>"
    And the user selects "<candidate>"
    And the user chooses the Panel Interview option
    And the user selects the interview Date "<interview_date>" and Start Time "<start_time>"
    And the user selects "<attendee>" and Interview Round "<interview_round>"
    And the user selects the Interview Provider "<interview_provider>"
    And the user clicks on Next
    Then the system displays an error message indicating that the Job Opening must be selected
    And the user remains on the scheduling page
    And no interview is scheduled
    And the Job Opening field is highlighted for correction

    Examples:
      | location    | candidate_email      | candidate   | interview_date | start_time | attendee   | interview_round | interview_provider |
      | New York    | candidate@example.com | John Doe    | 15/10/2023     | 10:00 AM  | Attendee 1 | Round 1        | Provider A        |

  @error-message
  Scenario Outline: Schedule Panel Interview without Selecting a Candidate
    When the user clicks on Create Interview
    And the user selects a Job Opening from the dropdown
    And the user selects a Location from the available options
    And the user leaves the Candidate field empty
    And the user chooses the Panel Interview option
    And the user selects the interview Date and Start Time
    And the user selects Attendees and Interview Round
    And the user selects the Interview Provider
    And the user clicks on Next
    Then the system displays an error message indicating that a Candidate must be selected
    And the user remains on the scheduling page
    And no interview is scheduled
    And the Candidate field is highlighted for correction

    Examples:
      | Job Opening | Location | Interview Date | Start Time | Attendees | Interview Round | Interview Provider |
      | Job A      | Location A| 2023-10-01    | 10:00 AM   | Attendee 1 | Round 1        | Provider A        |

@empty_date_field
Scenario Outline: Schedule Panel Interview without Interview Date
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters the Candidate's email address and selects the candidate
  And the user chooses the Panel Interview option
  And the user leaves the Interview Date field empty
  And the user selects Start Time
  And the user selects Attendees and Interview Round
  And the user selects the Interview Provider
  And the user clicks on Next
  Then the system displays an error message indicating that an Interview Date must be selected
  And the user remains on the scheduling page
  And no interview is scheduled
  And the Interview Date field is highlighted for correction

  Examples:
    | field         |
    |               |
    |               |
    |               |
    |               |
    |               |
    |               |
    |               |
    |               |
    |               |
    |               |

@error-message
Scenario Outline: Schedule Panel Interview without Start Time
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters the Candidate's email address and selects the candidate
  And the user chooses the Panel Interview option
  And the user selects an Interview Date
  And the user leaves the Start Time field empty
  And the user selects Attendees and Interview Round
  And the user selects the Interview Provider
  And the user clicks on Next
  Then the system displays an error message indicating that a Start Time must be selected
  And the user remains on the scheduling page
  And no interview is scheduled
  And the Start Time field is highlighted for correction

  Examples:
    | <job_opening> | <location> | <candidate_email> | <interview_date> | <attendees> | <interview_round> | <interview_provider> |
    | Job Opening 1 | Location 1 | candidate@example.com | 2023-10-01 | Attendee 1 | Round 1 | Provider 1 |

  @past-interview-date
  Scenario Outline: Schedule Panel Interview with Past Interview Date
    When the user clicks on Create Interview
    And selects a Job Opening from the dropdown
    And selects a Location from the available options
    And enters "<candidate_email>" and selects the candidate
    And chooses the Panel Interview option
    And selects a past Interview Date "<interview_date>"
    And selects Start Time
    And selects Attendees and Interview Round
    And selects the Interview Provider
    And clicks on Next
    Then the system displays an error message indicating that the Interview Date cannot be in the past
    And the user remains on the scheduling page
    And no interview is scheduled
    And the Interview Date field is highlighted for correction

    Examples:
      | candidate_email      | interview_date |
      | candidate@example.com | 01/01/2020     |

  @overlapping_interview
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user selects "<job_opening>" from the dropdown
    And the user selects "<location>" from the available options
    And the user enters "<candidate_email>" and selects the candidate
    And the user chooses the Panel Interview option
    And the user selects "<interview_date>"
    And the user selects Start Time "<start_time>" that overlaps with an existing interview
    And the user selects "<attendees>" and "<interview_round>"
    And the user selects the "<interview_provider>"
    And the user clicks on Next
    Then the system displays an error message indicating that the interview time overlaps with an existing interview
    And the user remains on the scheduling page
    And no interview is scheduled
    And the Start Time field is highlighted for correction

    Examples:
      | job_opening            | location   | candidate_email              | interview_date | start_time | attendees                   | interview_round     | interview_provider     |
      | job_opening_1         | location_1 | candidate_email@example.com  | 2023-10-15     | 10:00 AM   | attendee_1, attendee_2     | interview_round_1   | interview_provider_1   |

@edit_past_interview
Scenario Outline: Schedule Panel Interview
  When the user selects a past scheduled panel interview to edit
  And the user clicks on Edit Interview
  And the user attempts to change any details
  And the user clicks on Save Changes
  Then the system displays an error message indicating that past interviews cannot be edited
  And the user remains on the edit page
  And no changes are saved
  And the user can still view the original interview details

Examples:
  |   |
  |   |

@attempt_cancel_past_interview
Scenario Outline: Schedule Panel Interview
  When the user selects a past scheduled panel interview to cancel
  And the user clicks on Cancel Interview
  And the user attempts to confirm the cancellation
  Then the system displays an error message indicating that past interviews cannot be canceled
  And the user remains on the scheduled interviews page
  And no changes are made to the interview status
  And the user can still view the original interview details

  Examples:
    | interview_id |
    | 12345        |

@panel-interview-scheduling
Scenario Outline: Schedule Panel Interview
  When the recruiter clicks on Create Interview
  And the recruiter selects "<job_opening>" from the dropdown
  And the recruiter selects "<location>" from the available options
  And the recruiter enters "<candidate_email>" and selects the candidate
  And the recruiter chooses the Panel Interview option
  And the recruiter selects "<date>" and "<start_time>"
  And the recruiter selects "<max_attendees>" and "<interview_round>"
  And the recruiter selects "<interview_provider>"
  And the recruiter clicks on Next
  And the recruiter attaches required files
  And the recruiter clicks on Confirm and Send
  Then the system displays a confirmation message for the scheduled interview
  And the interview details are saved in the system
  And notifications are sent to all participants
  And the interview appears in the calendar of all attendees
  And the candidate receives an email notification with interview details
  And the recruiter can view the scheduled interview in their dashboard

  Examples:
    | job_opening        | location         | candidate_email         | date        | start_time | max_attendees | interview_round | interview_provider |
    | Software Engineer   | New York Office  | candidate1@example.com  | 2023-11-15 | 10:00 AM   | 5             | Final Round     | Zoom               |
    | Product Manager     | Remote           | candidate2@example.com  | 2023-11-16 | 02:00 PM   | 4             | First Round     | Microsoft Teams    |

  @create_panel_interview
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user selects "<job_opening>" from the dropdown
    And the user selects "<location>" from the available options
    And the user enters "<candidate_email>" and selects the candidate
    And the user chooses the Panel Interview option
    And the user selects the interview Date "<interview_date>" and Start Time "<start_time>"
    And the user selects "<minimum_attendees>" as minimum required Attendees and "<interview_round>" as Interview Round
    And the user selects "<interview_provider>" as Interview Provider
    And the user clicks on Next
    And the user attaches "<required_files>"
    And the user clicks on Confirm and Send
    Then the system displays a confirmation message for the scheduled interview
    And the interview details are saved in the system
    And notifications are sent to all participants
    And the interview appears in the calendar of all attendees
    And the candidate receives an email notification with interview details
    And the recruiter can view the scheduled interview in their dashboard

    Examples:
      | job_opening         | location         | candidate_email       | interview_date | start_time | minimum_attendees | interview_round | interview_provider | required_files |
      | job opening value   | location value   | candidate@example.com | 2023-10-15     | 10:00 AM   | 2                 | 1               | provider name      | file.pdf       |

@valid_schedule_interview
Scenario Outline: Schedule Panel Interview with Special Character Email
  When the user clicks on Create Interview
  And selects a Job Opening from the dropdown
  And selects a Location from the available options
  And enters a Candidate's email address "<candidate_email>"
  And chooses the Panel Interview option
  And selects the interview Date and Start Time
  And selects Attendees and Interview Round
  And selects the Interview Provider
  And clicks on Next
  And attaches required files
  And clicks on Confirm and Send
  Then the system displays a confirmation message for the scheduled interview
  And the interview details are saved in the system
  And notifications are sent to all participants, including the candidate
  And the candidate receives an email notification with interview details
  And the recruiter can view the scheduled interview in their dashboard

  Examples:
    | candidate_email       |
    | test+123@example.com  |

  @long_candidate_email
  Scenario Outline: Schedule Panel Interview with Long Candidate Email
    When the user clicks on Create Interview
    And the user selects "<job_opening>" from the dropdown
    And the user selects "<location>" from the available options
    And the user enters "<candidate_email>"
    And the user chooses the Panel Interview option
    And the user selects the interview Date and Start Time
    And the user selects Attendees and Interview Round
    And the user selects the Interview Provider
    And the user clicks on Next
    And the user attaches required files
    And the user clicks on Confirm and Send
    Then the system displays a confirmation message for the scheduled interview
    And the interview details are saved in the system
    And notifications are sent to all participants, including the candidate
    And the candidate receives an email notification with interview details
    And the recruiter can view the scheduled interview in their dashboard

    Examples:
      | job_opening         | location     | candidate_email               |
      | Software Engineer    | New York     | a verylongemailaddress@example.com |
