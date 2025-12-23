
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

@navigate_to_job_opening
Scenario Outline: Create Job Opening
  When I click on the "Job Opening" option in the side navigation
  Then the Job Opening screen is displayed without errors
  And the "Add Job Opening" button is visible and clickable

Examples:
  | <job_opening_option> |
  | Job Opening           |

@validate_job_opening_form
Scenario Outline: Create Job Opening
  When the user clicks on the "Add Job Opening" button
  Then the Create New Job Opening form is displayed
  And both "Save" and "Cancel" buttons are visible and enabled

  Examples:
    | action                       |
    | Add Job Opening              |

  @job-opening-creation
  Scenario Outline: Create Job Opening
    When I select a Job Role from the dropdown
    And I select a Location from the dropdown
    And I enter valid Minimum Experience
    And I enter valid Maximum Experience
    And I enter valid Qualification
    And I enter a Short Job Description
    And I enter Responsibilities
    And I enter Primary Skills
    And I enter Secondary Skills
    And I enter Total Openings
    And I select Employment Type
    And I select Duration
    And I select Work Mode
    And I select Status
    And I enter Department
    And I enter Industry Type
    And I enter Tags
    And I select Vendors
    And I click on the Save button
    Then the job opening is saved successfully
    And the job opening appears in the Job Opening list
    And a success message is displayed confirming the creation

    Examples:
      | JobRole            | Location         | MinExperience | MaxExperience | Qualification | ShortJobDescription | Responsibilities | PrimarySkills | SecondarySkills | TotalOpenings | EmploymentType | Duration | WorkMode | Status | Department | IndustryType | Tags       | Vendors    |
      | Software Engineer   | New York         | 3             | 5             | Bachelors      | Develop software    | Coding           | Java          | Python          | 5             | Full-Time      | 6 months | Remote   | Active | IT         | Technology   | Engineer    | Vendor A   |
      | Data Analyst        | San Francisco     | 2             | 4             | Bachelors      | Analyze data        | Reporting        | Excel         | SQL             | 3             | Part-Time      | 3 months | On-site  | Active | Analytics  | Business      | Data        | Vendor B   |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When I select "<job_role>" from the dropdown
    And I select "<location>" from the dropdown
    And I enter valid Minimum Experience "<minimum_experience>"
    And I enter valid Maximum Experience "<maximum_experience>"
    And I enter valid Qualification "<qualification>"
    And I enter a Short Job Description "<short_job_description>"
    And I enter Responsibilities "<responsibilities>"
    And I enter Primary Skills "<primary_skills>"
    And I enter Secondary Skills "<secondary_skills>"
    And I enter Total Openings "<total_openings>"
    And I select Employment Type "<employment_type>"
    And I select Duration "<duration>"
    And I select Work Mode "<work_mode>"
    And I select Status "<status>"
    And I enter Department "<department>"
    And I enter Industry Type "<industry_type>"
    And I enter Tags "<tags>"
    And I select Vendors "<vendors>"
    And I click on the "Save" button
    Then the job opening should be saved successfully
    And the job opening should appear in the Job Opening list with all details correctly displayed

    Examples:
      | job_role          | location   | minimum_experience | maximum_experience | qualification        | short_job_description | responsibilities | primary_skills   | secondary_skills | total_openings | employment_type | duration   | work_mode | status | department  | industry_type | tags         | vendors    |
      | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree     | a * 100             | a * 100         | Java, Python     | a * 100         | 10             | Full-time      | 6 months   | Remote    | Active | Engineering | IT             | a, b, c     | Vendor A   |

@job-opening-creation
Scenario Outline: Create Job Opening with All Fields Filled
  Given the recruiter selects the Job Role "<job_role>"
  And the recruiter selects the Location "<location>"
  And the recruiter enters valid Minimum Experience "<min_experience>"
  And the recruiter enters valid Maximum Experience "<max_experience>"
  And the recruiter enters valid Qualification "<qualification>"
  And the recruiter enters a Short Job Description "<short_job_description>"
  And the recruiter enters Responsibilities "<responsibilities>"
  And the recruiter enters Primary Skills "<primary_skills>"
  And the recruiter enters Secondary Skills "<secondary_skills>"
  And the recruiter enters Total Openings "<total_openings>"
  And the recruiter selects Employment Type "<employment_type>"
  And the recruiter selects Duration "<duration>"
  And the recruiter selects Work Mode "<work_mode>"
  And the recruiter selects Status "<status>"
  And the recruiter enters Department "<department>"
  And the recruiter enters Industry Type "<industry_type>"
  And the recruiter enters Tags "<tags>"
  And the recruiter selects Vendors "<vendors>"
  When the recruiter clicks on the Save button
  Then the job opening should be saved successfully
  And the job opening should appear in the Job Opening list with all details correctly displayed

  Examples:
    | job_role           | location    | min_experience | max_experience | qualification       | short_job_description   | responsibilities          | primary_skills  | secondary_skills     | total_openings | employment_type | duration    | work_mode | status | department   | industry_type       | tags                  | vendors    |
    | Software Engineer   | New York    | 2              | 5              | Bachelor's Degree    | Short job description a | Responsibilities a       | Java, Python    | JavaScript, SQL     | 3              | Full-time       | 6 months   | Remote    | Open   | Engineering   | Information Technology | tag1, tag2, tag3 | Vendor A   |

  @empty-job-role
  Scenario Outline: Create Job Opening with Empty Job Role
    Given the user leaves the Job Role field empty
    And the user fills in the Job Title with "<job_title>"
    And the user fills in the Job Type with "<job_type>"
    And the user fills in the Contact Email with "<contact_email>"
    And the user fills in the Contact Phone with "<contact_phone>"
    When the user clicks the "Save" button
    Then an error message is displayed indicating that the Job Role is required
    And the job opening is not saved

    Examples:
      | job_title          | job_type  | contact_email          | contact_phone |
      | Software Engineer   | Full-time | john.doe@example.com   | 9876543210    |

  @invalid-experience
  Scenario Outline: Create Job Opening with Invalid Experience
    Given I enter a valid Minimum Experience of "<minimum_experience>"
    And I enter a lower Maximum Experience of "<maximum_experience>"
    And I fill in the job title "<job_title>"
    And I enter the salary "<salary>"
    And I enter the job description "<job_description>"
    And I select the job type "<job_type>"
    And I enter the company name "<company_name>"
    And I enter the company email "<company_email>"
    And I enter the contact number "<contact_number>"
    When I click on the "Save" button
    Then an error message is displayed indicating that Minimum Experience must be less than Maximum Experience
    And the job opening is not saved

    Examples:
      | minimum_experience | maximum_experience | job_title        | salary | job_description | job_type | company_name | company_email          | contact_number |
      | 3                  | 2                  | Software Engineer | 5      | 3 years        | Full-time | Company XYZ  | job@companyxyz.com     | 1234567890     |

  @invalid-job-role
  Scenario Outline: Create Job Opening with Invalid Characters in Job Role
    Given the user is on the Create Job Opening Page
    When I enter "<job_role>" in the Job Role field
    And I enter "<company_name>" in the Company Name field
    And I enter "<location>" in the Location field
    And I enter "<salary>" in the Salary field
    And I enter "<description>" in the Description field
    And the user clicks the Save button
    Then an error message should be displayed indicating that the Job Role contains invalid characters
    And the job opening should not be saved

    Examples:
      | job_role     | company_name    | location      | salary | description                    |
      | !@#$%^&*()   | Valid Company    | 123 Main St   | 50000  | Job description goes here.     |

  @invalid-location
  Scenario Outline: Create Job Opening with Invalid Location
    Given the user selects a Job Role as "<job_role>"
    And the user selects an invalid Location "<location>"
    And the user fills in field1 with "<field1>"
    And the user fills in field2 with "<field2>"
    And the user fills in field3 with "<field3>"
    When the user clicks on the "Save" button
    Then an error message is displayed indicating that the selected location is invalid
    And the job opening is not saved

    Examples:
      | job_role          | location        | field1      | field2      | field3      |
      | Software Engineer  | Invalid Location | Valid Data  | Valid Data  | Valid Data  |

@max-character-limit
Scenario Outline: Create Job Opening with Maximum Character Limits
  Given the user is on the Job Opening Page
  When I enter "<short_job_description>" in the Short Job Description field
  And I enter "<responsibilities>" in the Responsibilities field
  And I enter "<primary_skills>" in the Primary Skills field
  And I click on the "Save" button
  Then the job opening is saved successfully without truncation or errors
  And all entered data is displayed correctly in the Job Opening list

  Examples:
    | short_job_description                                                                                     | responsibilities                                                                                     | primary_skills                                                                                     |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @minimum_allowed_values
  Scenario Outline: Create Job Opening with Minimum Allowed Values
    Given the user is on the Job Opening Creation Page
    When I enter "<total_openings>" in the Total Openings field
    And I enter "<field1>" in the Field 1
    And I enter "<field2>" in the Field 2
    And I enter "<field3>" in the Field 3
    And the user clicks the Save button
    Then the job opening is saved successfully without errors
    And the job opening appears in the Job Opening list with the correct Total Openings value

    Examples:
      | total_openings | field1        | field2        | field3        |
      | 0              | valid_value1  | valid_value2  | valid_value3  |
