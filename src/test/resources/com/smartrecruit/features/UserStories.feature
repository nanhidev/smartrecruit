
@feature_user_login
Feature: UserStories

  Background: 
    Given the user is logged in as a Recruiter or Hiring Manager

  @panel-interview-scheduling
  Scenario Outline: Upload New Candidate Profile
    Given the user is on the Upload Candidate Profile Page
    When the user selects a job role as <job role>
    And the user uploads the candidate profile as <candidate profile>
    And the user schedules a panel interview
    Then the user should see a confirmation message

    Examples:
      | job role         | candidate profile       |
      | Software Engineer | profile_document.pdf    |
      | Data Analyst      | candidate_resume.docx   |
