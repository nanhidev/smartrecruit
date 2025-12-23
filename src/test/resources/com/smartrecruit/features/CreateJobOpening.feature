
@feature_create_job_opening
Feature: CreateJobOpening

  Background: 
    Given the recruiter is on the Dashboard

  @job-opening-navigation
  Scenario Outline: Create Job Opening
    When the recruiter clicks on the "Job Opening" option in the side navigation
    Then the Job Opening screen should be displayed
    And the "Add Job Opening" button should be visible

    Examples:
      | title                |
      | Create Job Opening   |

@open_job_opening_form
Scenario Outline: Create Job Opening
  When the user clicks on the Add Job Opening button
  Then the Create New Job Opening form should be opened
  And the Save and Cancel buttons should be displayed

  Examples:
    | action                |
    | Add Job Opening       |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    Given the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<minimum_experience>"
    And the recruiter enters Maximum Experience "<maximum_experience>"
    And the recruiter enters Qualification "<qualification>"
    And the recruiter enters Short Job Description "<short_job_description>"
    And the recruiter enters Responsibilities "<responsibilities>"
    When the recruiter clicks on the "Save" button
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role         | location   | minimum_experience | maximum_experience | qualification        | short_job_description | responsibilities      |
      | Software Engineer | New York   | 2                  | 5                  | Bachelor's Degree     | a * 100               | a * 100               |

  @create-job-opening
  Scenario Outline: Create Job Opening
    When I select a Job Role as "<job_role>"
    And I select a Location as "<location>"
    And I enter Minimum Experience as "<min_experience>"
    And I enter Maximum Experience as "<max_experience>"
    And I enter Qualification as "<qualification>"
    And I leave optional fields empty
    And I click on the "Save" button
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | min_experience | max_experience | qualification      |
      | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree   |

@valid-job-opening
Scenario Outline: Create Job Opening with Valid Tags
  When the recruiter selects a Job Role "<job_role>"
  And the recruiter selects a Location "<location>"
  And the recruiter enters Minimum Experience "<min_experience>"
  And the recruiter enters Maximum Experience "<max_experience>"
  And the recruiter enters Qualification "<qualification>"
  And the recruiter enters Tags "<tags>"
  And the recruiter clicks on the Save button
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct Tags

  Examples:
    | job_role         | location   | min_experience | max_experience | qualification      | tags                    |
    | Software Engineer | New York   | 2              | 5              | Bachelor's Degree    | urgent, full-time       |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    Given the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<min_experience>"
    And the recruiter enters Maximum Experience "<max_experience>"
    And the recruiter enters Qualification "<qualification>"
    And the recruiter enters Responsibilities "<responsibilities>"
    When the recruiter clicks on the "Save" button
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct Responsibilities

    Examples:
      | job_role          | location  | min_experience | max_experience | qualification      | responsibilities                 |
      | Software Engineer  | New York  | 2              | 5              | Bachelor's Degree   | Manage team, Conduct interviews  |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    Given the user selects a Job Role "<job_role>"
    And the user selects a Location "<location>"
    And the user enters Minimum Experience "<min_experience>"
    And the user enters Maximum Experience "<max_experience>"
    And the user enters Qualification "<qualification>"
    And the user enters Primary Skills "<primary_skills>"
    When the user clicks on the "Save" button
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct Primary Skills

    Examples:
      | job_role         | location   | min_experience | max_experience | qualification      | primary_skills     |
      | Software Engineer | New York   | 2              | 5              | Bachelor's Degree   | Java, SQL          |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    Given the recruiter selects a Job Role
    And the recruiter selects a Location
    And the recruiter enters Minimum Experience
    And the recruiter enters Maximum Experience
    And the recruiter enters Qualification
    And the recruiter enters Department "<department>"
    When the recruiter clicks on the "Save" button
    Then the job opening should be saved successfully
    Then the job opening should be available in the Job Opening list with the correct Department

    Examples:
      | department   |
      | Engineering   |

  @valid-job-opening
  Scenario Outline: Create Job Opening with Valid Location
    When I select a Job Role "<job_role>"
    And I select a valid Location "<location>"
    And I enter Minimum Experience "<min_experience>"
    And I enter Maximum Experience "<max_experience>"
    And I enter Qualification "<qualification>"
    And I click on the "Save" button
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct Location

    Examples:
      | job_role         | location  | min_experience | max_experience | qualification     |
      | Software Engineer | New York  | 2              | 5              | Bachelor's Degree  |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When I select "<job_role>"
    And I select "<location>"
    And I enter "<minimum_experience>"
    And I enter "<maximum_experience>"
    And I enter "<qualification>"
    And I select "<vendor>" from the dropdown
    And I click on the "Save" button
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct Vendors

    Examples:
      | job_role          | location   | minimum_experience | maximum_experience | qualification      | vendor     |
      | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree   | Vendor A   |

  @job_role_required
  Scenario Outline: Create Job Opening with Job Role Not Selected
    Given the user leaves the Job Role field empty
    And fills in the Job Title with "<job_title>"
    And fills in the Employment Type with "<employment_type>"
    And fills in the Email with "<email>"
    And fills in the Phone Number with "<phone_number>"
    When the user clicks on the "Save" button
    Then an error message should be displayed indicating that Job Role is required
    And the job opening should not be saved

    Examples:
      | job_title        | employment_type | email               | phone_number |
      | Software Engineer | Full-time       | krishna@gmail.com   | 9876543210   |

  @invalid-experience
  Scenario Outline: Create Job Opening with Invalid Experience Values
    When I enter "<minimum_experience>" for Minimum Experience
    And I enter "<maximum_experience>" for Maximum Experience
    And I enter "<job_title>" for Job Title
    And I enter "<years_required>" for Years of Experience
    And I select "<job_type>" for Job Type
    And I enter "<salary>" for Salary
    And I enter "<job_description>" for Job Description
    And I enter "<job_location>" for Job Location
    And I enter "<contact_email>" for Contact Email
    And I click the "Save" button
    Then an error message should be displayed indicating that Minimum Experience must be less than Maximum Experience
    And the job opening should not be saved

    Examples:
      | minimum_experience | maximum_experience | job_title        | years_required | job_type | salary   | job_description                       | job_location                       | contact_email          |
      | 10                  | 5                  | Software Engineer | 3 years       | Full-time| 100000   | description a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a | location a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a | contact@example.com |

  @invalid-employment-type
  Scenario Outline: Create Job Opening with Invalid Employment Type
    Given the admin selects "<employment_type>" from the Employment Type dropdown
    And the admin fills in the Job Title with "<job_title>"
    And the admin fills in the Employment Type with "<employment_type>"
    And the admin fills in the Recruiter's Email with "<recruiter_email>"
    And the admin fills in the Contact Number with "<contact_number>"
    And the admin fills in the Job Location with "<job_location>"
    And the admin fills in the Job Posting Date with "<posting_date>"
    When the admin clicks the "Save" button
    Then an error message should be displayed indicating that the selected Employment Type is invalid
    And the job opening should not be saved

    Examples:
      | employment_type | job_title         | recruiter_email     | contact_number | job_location | posting_date |
      | InvalidType     | Software Engineer  | krishna@gmail.com   | 9876543210     | New York     | 2023-10-01   |

  @total_openings_required
  Scenario Outline: Create Job Opening without Total Openings
    When the user leaves the Total Openings field empty
    And the user fills in all other required fields with valid data
    And the user clicks on the Save button
    Then an error message should be displayed indicating that Total Openings is required
    And the job opening should not be saved

    Examples:
      | total_openings |
      |                |

  @invalid-work-mode
  Scenario Outline: Create Job Opening with Invalid Work Mode
    Given the user selects "<work_mode>" from the Work Mode dropdown
    And the user fills in the title "<title>"
    And the user fills in the description "<description>"
    And the user fills in the location "<location>"
    And the user fills in the salary "<salary>"
    And the user fills in the requirements "<requirements>"
    And the user fills in the responsibilities "<responsibilities>"
    And the user fills in the contact email "<contact_email>"
    When the user clicks on the "Save" button
    Then an error message should be displayed indicating that the selected Work Mode is invalid
    And the job opening should not be saved

    Examples:
      | work_mode        | title             | description                                       | location | salary  | requirements                                      | responsibilities                                   | contact_email       |
      | InvalidWorkMode  | Software Engineer  | Develop and maintain software applications.      | New York | 100000  | Bachelor's degree in Computer Science or related field.| Design, develop, and implement software solutions. | hr@company.com      |

@invalid-duration
Scenario Outline: Create Job Opening with Invalid Duration
  Given the user selects an invalid Duration from the dropdown
  And the user fills in the Job Title as "<valid_job_title>"
  And the user fills in the Job Description as "<valid_job_description>"
  And the user fills in the Location as "<valid_location>"
  And the user fills in the Salary as "<valid_salary>"
  And the user fills in the Requirements as "<valid_requirements>"
  And the user fills in the Contact Email as "<valid_contact_email>"
  And the user fills in the Contact Phone as "<valid_contact_phone>"
  When the user clicks the Save button
  Then an error message should be displayed indicating that the selected Duration is invalid
  And the job opening should not be saved

  Examples:
    | invalid_duration_value | valid_job_title   | valid_job_description | valid_location | valid_salary | valid_requirements | valid_contact_email     | valid_contact_phone |
    | InvalidDurationValue   | Software Engineer  | Develop applications   | New York      | 90000        | Bachelor's Degree    | contact@example.com     | 555-1234          |

  @industry_type_not_specified
  Scenario Outline: Create Job Opening with Empty Industry Type
    Given the user fills in all other required fields with valid data
    And leaves the Industry Type field empty
    When the user clicks the Save button
    Then an error message should be displayed indicating that Industry Type is required
    And the job opening should not be saved

  Examples:
    | industry_type |
    |               |

  @invalid-tags
  Scenario Outline: Create Job Opening with Invalid Tags Format
    When I enter "<tags>"
    And I enter "<jobTitle>"
    And I enter "<description>"
    And I enter "<location>"
    And I enter "<company>"
    And I enter "<salary>"
    And I click the "Save" button
    Then an error message should be displayed indicating that Tags must be comma-separated
    And the job opening should not be saved

    Examples:
      | tags          | jobTitle        | description       | location       | company        | salary   |
      | tag1 tag2    | validJobTitle   | validDescription   | validLocation   | validCompany    | validSalary |

  @no-vendors-selected
  Scenario Outline: Create Job Opening with No Vendors Selected
    Given the admin leaves the Vendors field empty
    And the admin fills in all other required fields with valid data
    When the admin clicks on the "Save" button
    Then an error message should be displayed indicating that at least one Vendor must be selected
    And the job opening should not be saved

    Examples:
      | <vendors> |
      |           |

  @valid-job-opening
  Scenario Outline: Create Job Opening with Maximum Allowed Characters
    When the admin selects a Job Role
    And the admin selects a Location
    And the admin enters Maximum allowed characters for Minimum Experience
    And the admin enters Maximum allowed characters for Maximum Experience
    And the admin enters Maximum allowed characters for Qualification
    And the admin enters Maximum allowed characters for Short Job Description
    And the admin clicks on the Save button
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with all details correctly displayed

    Examples:
      | Job Role | Location | Minimum Experience | Maximum Experience | Qualification | Short Job Description |
      | Developer | New York | 10 years           | 15 years          | Bachelor's     | This is a short job description. |

  @valid-job-opening-creation
  Scenario Outline: Create Job Opening with Minimum Allowed Characters
    When the user selects a Job Role
    And the user selects a Location
    And the user enters Minimum allowed characters for Minimum Experience
    And the user enters Minimum allowed characters for Maximum Experience
    And the user enters Minimum allowed characters for Qualification
    And the user enters Minimum allowed characters for Short Job Description
    And the user clicks on the Save button
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with all details correctly displayed

    Examples:
      | Job Role | Location | Minimum Experience | Maximum Experience | Qualification | Short Job Description |
      | Developer | New York | 1 year            | 3 years           | Bachelor's     | Entry-level developer position |
